package com.metarnet.sfpw.hwswitch.mgr;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.tmforum.mtop.nra.xsd.alm.v1.AlarmType;

import com.metarnet.adapter.model.ADPAlarm;
import com.metarnet.adapter.model.ALMSeverity;
import com.metarnet.sfpw.base.database.Database;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.IAlarmMgr;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.hwswitch.da.HwSwitchDA;
import com.metarnet.sfpw.hwswitch.util.Converter;
import com.metarnet.util.TimeHelper;

public class HwSwitchAlarmMgrImp implements IAlarmMgr{

	private HwSwitchDA da;
	
	private Database db;
	
	
	
	
	
	public void setDa(HwSwitchDA da) {
		this.da = da;
	}

	public void setDb(Database db) {
		this.db = db;
	}

	public boolean syncMeAlarm(String domain, String meId) throws TaskException {
		
		
		return false;
	}

	public boolean syncAllAlarm(String domain) throws TaskException {
		List<ADPAlarm> alarmFromDB;
		try {
			alarmFromDB = this.db.getAllActiveAlarm(domain);
		} catch (SQLException e) {
			System.out.println("同步告警失败，因为从库里查询当前告警失败,"+e.getMessage());
			WxLogger.flow.error("同步告警失败，因为从库里查询当前告警失败,"+e.getMessage(),e);
			throw new TaskException("同步告警失败，因为从库里查询当前告警失败",e.getMessage(),e);
		}
		WxLogger.res_config.info("从数据库中取出告警"+alarmFromDB.size());
		List<ADPAlarm> alarmFromVendor = new ArrayList<ADPAlarm>();
		try{
			List<AlarmType> alarmTypeList = da.getAllActiveAlarm();
			for (AlarmType alarmType : alarmTypeList) {
				ADPAlarm adpalarm = Converter.convertSingleAlarm(alarmType);
				if(adpalarm != null)
					alarmFromVendor.add(adpalarm);
			}
		}catch(Exception ex){
			System.out.println("同步告警失败，因为从厂家接口询当前告警失败,"+ex.getMessage());
			WxLogger.flow.error("同步告警失败，因为从厂家接口询当前告警失败,"+ex.getMessage(),ex);
			throw new TaskException(ex.getMessage(),"获取所有当前告警信息异常",ex);
		}
		WxLogger.res_config.info("从厂家网管取出经过模型转换后的告警"+alarmFromVendor.size());
		compare(domain,alarmFromDB,alarmFromVendor);
		return true;
	}

	private void compare(String domain , List<ADPAlarm> alarmFromDB,
			List<ADPAlarm> alarmFromVendor) {
		/**从厂家获得的告警若为空以及size为零则不做操作*/
		if(alarmFromVendor == null || alarmFromVendor.size() == 0)
			return ;
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
//					WxLogger.res_config.info("需要入库的告警:"+valarm.getAlarmId());
					this.db.raiseAlarm(domain,valarm);
					
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
				this.db.clearAlarm(domain,dalarm);
				Thread.sleep(5L);
			}
			
		}catch(Exception ex){
			WxLogger.res_config.error("告警比对发生异常,"+ex.getMessage(),ex);
		}
	}
	
}
