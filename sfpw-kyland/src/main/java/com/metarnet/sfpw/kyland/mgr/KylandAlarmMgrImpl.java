package com.metarnet.sfpw.kyland.mgr;

import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.omg.CosNotification.StructuredEvent;

import com.metarnet.adapter.model.ADPAlarm;
import com.metarnet.adapter.model.ALMSeverity;
import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.IAlarmMgr;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.base.database.IDatabase;
import com.metarnet.sfpw.kyland.driver.Constant;
import com.metarnet.sfpw.kyland.driver.KylandCorbaDriver;
import com.metarnet.sfpw.kyland.manager.EmsMgr;
import com.metarnet.sfpw.kyland.manager.ManangeElementMgr;
import com.metarnet.sfpw.base.util.Config;
import com.metarnet.sfpw.kyland.util.Converter;
import com.metarnet.util.TimeHelper;

public class KylandAlarmMgrImpl implements IAlarmMgr{

	
	private IDatabase database;
	private EmsMgr emsMgr;
	private NameAndStringValue_T emsName;
	private ManangeElementMgr meMgr;
	private KylandCorbaDriver driver;
	
	private Config config;
	
	public void setDatabase(IDatabase database) {
		this.database = database;
	}

	public void setDriver(KylandCorbaDriver driver) {
		this.driver = driver;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public void init() {
		WxLogger.init.info("告警管理初始化");
		emsName = new NameAndStringValue_T();
		emsName.name = Constant.EMSKEY;
		emsName.value = Constant.EMSNAME;
		emsMgr = new EmsMgr(driver,config);
		meMgr = new ManangeElementMgr(driver, config);
	}


	


	
////////////////////////////操作接口的方法/////////////////////////////////////////////
	/**
	 * 同步某一设备上的告警
	 * 将从网管上获取的告警与本地保存的告警比较，
	 * 将多余的删去，少的添加上，与网管保持一致
	 */
	public boolean syncMeAlarm(String domain ,String meId) throws TaskException{
		List<ADPAlarm> alarmFromDB = database.getMeActiveAlarm(domain, meId);
		List<ADPAlarm> alarmFromVendor = null;
		try {
			alarmFromVendor = this.getMeActiveAlarm(meId);
		} catch (ProcessingFailureException e) {
			throw new TaskException(e.getMessage(),e.errorReason,"从厂家获取设备："+meId+"下的告警失败",e);
		}catch(Exception ex){
			System.out.println("连接不上网管可能会进入此处========================");
		}
		compare(domain,alarmFromDB,alarmFromVendor);
		return false;
	}
	/**
	 * 
	 * @TODO 从网管获取某台设备的告警
	 * @return List<ADPAlarm>
	 * @param meId
	 * @return
	 * @throws ProcessingFailureException 
	 *
	 */
	private List<ADPAlarm> getMeActiveAlarm(String meId) throws ProcessingFailureException {
		NameAndStringValue_T[][] menames = 
			{new NameAndStringValue_T[]{emsName,new NameAndStringValue_T("ManagedElement",meId)}};
		List<StructuredEvent> alarmEvents = this.meMgr.getMECurrentAlarm(menames);
		WxLogger.res_config.info("从厂家网管获取告警"+alarmEvents.size()+"条");
		WxLogger.res_config.info("处理获取的告警");
		List<ADPAlarm> alarms = Converter.convertAlarm(alarmEvents);
		return alarms;
	}

	/**
	 * 同步所有告警
	 * 基本与syncMeAlarm方法相同
	 * @throws ConnectionException 
	 */
	public boolean syncAllAlarm(String domain) throws TaskException, ConnectionException{
		List<ADPAlarm> alarmFromDB;
		try {
			alarmFromDB = this.database.getAllActiveAlarm(domain);
		} catch (SQLException e1) {
			throw new TaskException(e1.getMessage(),"同步所有告警失败，因为从数据库中取当前告警发生异常",e1);
		}
		WxLogger.res_config.info("从数据库中取出告警"+alarmFromDB.size());
		List<ADPAlarm> alarmFromVendor = null;
		try {
			alarmFromVendor = this.getAllActiveAlarm();
		} catch (ProcessingFailureException e) {
			System.out.println("reason:"+e.errorReason);
			throw new TaskException(e.getMessage(),e.errorReason,"获取所有当前告警信息异常",e);
		}catch(Exception ex){
			System.out.println("非处理异常："+ex.getMessage());
			throw new ConnectionException(ex.getMessage(),"获取告警时发生异常，意思连接断开，进行重连",ex);
		}
		WxLogger.res_config.info("从厂家网管取出经过模型转换后的告警"+alarmFromVendor.size());
		compare(domain,alarmFromDB,alarmFromVendor);
		return true;
	}
	/**
	 * 
	 * @TODO 获取所有设备的告警
	 * @return List<ADPAlarm>
	 * @return
	 * @throws ProcessingFailureException 
	 *
	 */
	private List<ADPAlarm> getAllActiveAlarm() throws ProcessingFailureException {
		System.out.println("从厂家获取当前告警。。。。");
		List<StructuredEvent> alarmEvents = this.emsMgr.getCurrentAlarm();
		WxLogger.res_config.info("从厂家网管获取告警"+alarmEvents.size()+"条");
		WxLogger.res_config.info("处理获取的告警");
		List<ADPAlarm> alarms = Converter.convertAlarm(alarmEvents);
		return alarms;
	}
	/**
	 * 获取所有历史告警，暂不需要
	 */
	public List<ADPAlarm> getAllHisAlarm() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 获取某网元下所有历史告警，暂不需要
	 */
	public List<ADPAlarm> getMeHisAlarm(String meId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 
	 * @TODO 比较从数据库获得的告警和从厂家获得的告警，多则删，少则加，
	 * 		  使数据库中的告警与厂家的一致
	 * @return void
	 * @param alarmFromDB     从数据库中获得的告警
	 * @param alarmFromVendor 从厂家获得的告警
	 *
	 */
	private void compare(String domain , List<ADPAlarm> alarmFromDB,
			List<ADPAlarm> alarmFromVendor) {
		
		try{
			Iterator<ADPAlarm> vit = alarmFromVendor.iterator();
			boolean found = false;
			while(vit.hasNext()){
				found = false;
				ADPAlarm valarm = vit.next();
				vit.remove();
				Iterator<ADPAlarm> dit = alarmFromDB.iterator();
				while(dit.hasNext()){
					ADPAlarm dalarm = dit.next();
					if(valarm.equals(dalarm)){
						dit.remove();
						found = true;
						break;
					}
				}
				
				if(!found){
					/**厂家比数据库多出的告警，插入数据库*/
					WxLogger.res_config.info("需要入库的告警:"+valarm.getAlarmId());
					this.database.raiseAlarm(domain,valarm);
					
					Thread.sleep(5L);
				}
			}
			
			Iterator<ADPAlarm> dit = alarmFromDB.iterator();
			/**数据库比厂家多出的告警，删除*/
			while(dit.hasNext()){
				ADPAlarm dalarm = dit.next();
				dit.remove();
				dalarm.setTime(TimeHelper.getCurrentTime());
				dalarm.setSeverity(ALMSeverity.CLEARED);
				WxLogger.res_config.info("需要删除的告警:"+dalarm.getAlarmId());
				this.database.clearAlarm(domain,dalarm);
				Thread.sleep(5L);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
