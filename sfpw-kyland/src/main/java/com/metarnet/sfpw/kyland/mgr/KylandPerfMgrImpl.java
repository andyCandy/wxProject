package com.metarnet.sfpw.kyland.mgr;

import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

import java.util.ArrayList;
import java.util.List;

import performance.PMData_T;

import com.metarnet.service.ServiceException;
import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.IPerfMgr;
import com.metarnet.sfpw.base.model.EquipPerf;
import com.metarnet.sfpw.base.model.IfPerformance;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.base.database.IDatabase;
import com.metarnet.sfpw.kyland.driver.Constant;
import com.metarnet.sfpw.kyland.driver.KylandCorbaDriver;
import com.metarnet.sfpw.kyland.manager.EquipmentMgr;
import com.metarnet.sfpw.kyland.manager.ManangeElementMgr;
import com.metarnet.sfpw.kyland.manager.PerformanceMgr;
import com.metarnet.sfpw.base.util.Config;
import com.metarnet.sfpw.kyland.util.Converter;
import com.metarnet.sfpw.kyland.util.NameUtil;

public class KylandPerfMgrImpl implements IPerfMgr{

	
	private IDatabase database;
	private PerformanceMgr perfMgr;
	private ManangeElementMgr meMgr;
	private EquipmentMgr equipMgr;
	private NameAndStringValue_T emsName;
	private Config config;
	private KylandCorbaDriver driver;
	
	public void setDriver(KylandCorbaDriver driver) {
		this.driver = driver;
	}
	
	public void setDatabase(IDatabase database) {
		this.database = database;
	}
	
	public void setConfig(Config config){
		this.config = config;
	}

	/**
	 * 
	 * @TODO 同步某一台设备性能
	 * @return void
	 * @param meId   设备id
	 * @throws ProcessingFailureException 
	 *
	 */
	public void syncPerf(String meId) throws TaskException{
		/**构造请求参数*/
		List<NameAndStringValue_T[]> names = 
				NameUtil.makeUpMeName(emsName, meId);
		
		List<PMData_T> pmDataList;
		try {
			pmDataList = this.perfMgr.getMePerf(names);
		} catch (ProcessingFailureException e) {
			throw new TaskException(e.getMessage(),e.errorReason,"从厂家获取设备性能异常，meId:"+meId,e);
		}
		/**转化模型*/
		List<EquipPerf> equipPerfList = Converter.convertEquipPerf(pmDataList);
		/**发到三区入库*/
		database.saveMePM(config.getDomain(),equipPerfList);
		/**同步该网元下所有端口性能*/
		try {
			this.syncAllPortPerf(meId);
		} catch (ProcessingFailureException e) {
			throw new TaskException(e.getMessage(),e.errorReason,"从厂家获取设备"+meId+"下端口性能异常",e);
		}
	}
	
	/**
	 * 
	 * @TODO 同步所有设备性能能
	 * @return void
	 * @throws ConnectionException 
	 * @throws ProcessingFailureException 
	 *
	 */
	public void syncAllPerf() throws TaskException, ConnectionException{
		List<NameAndStringValue_T[]> meNameList = null;
		List<PMData_T> pmlist = null;
		try {
			meNameList = this.meMgr.getAllManagedElementNames();
			System.out.println("共有设备"+meNameList.size()+"条");
			pmlist = this.perfMgr.getMePerf(meNameList);
		} catch (ProcessingFailureException e) {
			WxLogger.res_config.error("同步设备性能失败,原因："+e.errorReason,e);
		}catch(Exception ex){
			throw new ConnectionException("同步性能失败，连接异常",ex.getMessage(),ex);
		}
		System.out.println("采集到设备性能"+pmlist.size()+"条");
		WxLogger.res_config.info("从厂家网管获取设备性能"+pmlist.size()+"条");
		/**转化模型*/
		List<EquipPerf> equipPerfList = Converter.convertEquipPerf(pmlist);
		/**入库*/
		System.out.println("设备性能入库:"+equipPerfList.size());
		this.database.saveMePM(config.getDomain(),equipPerfList);
		
		
		List<NameAndStringValue_T[]> portsNames = new ArrayList<NameAndStringValue_T[]>();
		for (NameAndStringValue_T[] meName : meNameList) {
			try {
				portsNames.addAll(this.equipMgr.getAllPTPNames(meName));
			} catch (ProcessingFailureException e) {
				WxLogger.res_config.error("从网管获取设备"+meName[1].value+"下端口名失败");
				continue;
			}catch(Exception ex){
				throw new ConnectionException("同步性能失败，连接异常",ex.getMessage(),ex);
			}
		}
		System.out.println("共有端口"+portsNames.size()+"个");
		List<PMData_T> portsPerfs = null;
		try {
			portsPerfs = this.perfMgr.getPortPerf(portsNames);
		} catch (ProcessingFailureException e) {
			throw new TaskException(e.getMessage(),e.errorReason,"获取端口性能信息失败",e);
		}catch(Exception ex){
			throw new ConnectionException("同步性能失败，连接异常",ex.getMessage(),ex);
		}
		System.out.println("采到端口性能"+portsPerfs.size()+"条");
		WxLogger.res_config.info("从厂家网管获取的端口性能"+portsPerfs.size()+"条");
		/**转化模型*/
		List<IfPerformance> ifPerfList = Converter.convert(portsPerfs);
		/**发送到三区入库*/
		System.out.println("端口性能："+ifPerfList.get(0));
		database.saveIfPM(config.getDomain(),ifPerfList);
	}
	
	/**
	 * 
	 * @TODO 同步某一设备下所有端口性能
	 * @return void
	 * @param meId  设备id
	 * @throws ProcessingFailureException 
	 *
	 */
	private void syncAllPortPerf(String meId) throws ProcessingFailureException{
		NameAndStringValue_T me = new NameAndStringValue_T();
		me.name = Constant.MEKEY;
		me.value = meId;
		List<NameAndStringValue_T[]> portNames = 
				this.equipMgr.getAllPTPNames(new NameAndStringValue_T[]{emsName,me});
		List<PMData_T> pmlist = this.perfMgr.getPortPerf(portNames);
		/**转化模型*/
		List<IfPerformance> ifPerfList = Converter.convert(pmlist);
		/**发送到三区入库*/
		database.saveIfPM(config.getDomain(),ifPerfList);
	}
	

	public void init()  {
		// TODO Auto-generated method stub
		
		emsName = new NameAndStringValue_T();
		emsName.name = Constant.EMSKEY;
		emsName.value = Constant.EMSNAME;
		meMgr = new ManangeElementMgr(driver,config);
		perfMgr = new PerformanceMgr(driver,config);
		equipMgr = new EquipmentMgr(driver,config);
	}


	

}
