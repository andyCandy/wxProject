package com.metarnet.sfpw.kyland.mgr;

import java.util.ArrayList;
import java.util.List;

import terminationPoint.TerminationPoint_T;
import topologicalLink.TopologicalLink_T;
import managedElement.ManagedElement_T;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.ICfgMgr;
import com.metarnet.sfpw.base.model.ManagedElement;
import com.metarnet.sfpw.base.model.Port;
import com.metarnet.sfpw.base.model.TopologicalLink;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.base.database.IDatabase;
import com.metarnet.sfpw.kyland.driver.Constant;
import com.metarnet.sfpw.kyland.driver.KylandCorbaDriver;
import com.metarnet.sfpw.kyland.manager.EmsMgr;
import com.metarnet.sfpw.kyland.manager.EquipmentMgr;
import com.metarnet.sfpw.kyland.manager.ManangeElementMgr;
import com.metarnet.sfpw.base.util.Config;
import com.metarnet.sfpw.kyland.util.Converter;

public class KylandConfiguration implements ICfgMgr {

	private ManangeElementMgr meMgr;
	private EquipmentMgr equipMgr;
	private NameAndStringValue_T emsName;
	private IDatabase database;
	private EmsMgr emsMgr;
	private KylandCorbaDriver driver;
	private Config config;
	
	public void setDatabase(IDatabase database) {
		this.database = database;
	}

	public void setDriver(KylandCorbaDriver driver) {
		this.driver = driver;
	}

	public void setConfig(Config config){
		this.config = config;
	}
	
	/**
	 * 同步网元以及网元下端口
	 * @throws TaskException 
	 */
	public boolean syncCfg(String domain, String meId) throws TaskException {
		NameAndStringValue_T meName = new NameAndStringValue_T(Constant.MEKEY,meId);
		ManagedElement_T me_T = null;
		List<Port> portList = null;
		try {
			me_T = meMgr.getManagedElement(new NameAndStringValue_T[]{emsName,meName});
			portList = this.getPortList(new NameAndStringValue_T[]{emsName,meName});
		} catch (ProcessingFailureException e) {
			throw new TaskException(e.getMessage(),e.errorReason,"配置跟新异常，meId:"+meId,e);
		}
		ManagedElement me = Converter.convertSingleME(me_T);
		database.flag(domain, meId,false);
		database.saveME(domain, me);
		
		database.savePorts(domain, portList);
		database.flag(domain, meId, true);
		return true;
	}

	/**
	 * 
	 * @TODO 获取网元下端口列表
	 * @return List<Port>
	 * @param meName
	 * @throws ProcessingFailureException
	 *
	 */
	private List<Port> getPortList(NameAndStringValue_T[] meName) 
			throws ProcessingFailureException{
		List<TerminationPoint_T> TerminationPoint_TList = 
				this.equipMgr.getAllPTPs(meName);
		List<Port> portList = Converter.convertPortList(TerminationPoint_TList);
		return portList;
	}
	/**
	 * 同步所有网元，以及网元下端口
	 * @throws ConnectionException 
	 */
	public boolean syncAllCfg(String domain) throws TaskException, ConnectionException{
		List<Port> portList = null;
		List<ManagedElement> meList = new ArrayList<ManagedElement>();
		List<ManagedElement_T> me_Tlist = null;
		try {
			me_Tlist = meMgr.getManagedElementList();
		} catch (ProcessingFailureException e) {
			throw new TaskException(e.getMessage(),e.errorReason,"配置跟新异常，domain:"+domain,e);
		}catch(Exception ex){
			throw new ConnectionException(ex.getMessage(), "连接失败",ex);
		}
		WxLogger.res_config.info("从厂家网管获取设备"+me_Tlist.size()+"条");
		for (ManagedElement_T managedElement_T : me_Tlist) {
			meList.add(Converter.convertSingleME(managedElement_T));
		}
		database.flag(domain, null, false);
		WxLogger.res_config.info("从厂家网管获取设备并转化后"+meList.size()+"个");
		WxLogger.res_config.info(meList);
		database.saveME(domain, meList);
		for (ManagedElement_T managedElement_T : me_Tlist) {
			try {
				portList = this.getPortList(managedElement_T.name);
			} catch (ProcessingFailureException e) {
				WxLogger.res_config.error("获取端口异常:"+managedElement_T.name[1].value,e);
				continue;
			}catch(Exception ex){
				continue;
			}
			database.flag(domain, managedElement_T.name[1].value, false);
			database.savePorts(domain, portList);
			database.flag(domain, managedElement_T.name[1].value, true);
			WxLogger.res_config.info("网元"+managedElement_T.name[1].value+"下的端口入库完成，端口列表："+portList);
		}
		database.flag(domain, null, true);
		return true;
	}

	/**
	 * 同步拓扑
	 * @throws ConnectionException 
	 */
	public boolean syncTopo(String domain) throws TaskException, ConnectionException{
		List<TopologicalLink_T> topo_tList = null;
		try {
			topo_tList = this.emsMgr.getAllTopoLink();
		} catch (ProcessingFailureException e) {
			throw new TaskException(e.getMessage(),e.errorReason,"从网管获取拓扑失败",e);
		}catch(Exception ex){
			throw new ConnectionException(ex.getMessage(), "连接失败",ex);
		}
		WxLogger.res_config.info("从网管获取拓扑数据"+topo_tList.size()+"条");
		List<TopologicalLink> topoList = Converter.convertTopoList(topo_tList);
		WxLogger.res_config.info("转换为需要的模型之后还有"+topoList.size()+"条");
		database.saveTLs(domain, topoList);
		return false;
	}


	public void init() {
	
		meMgr = new ManangeElementMgr(driver, config);
		equipMgr = new EquipmentMgr(driver, config);
		emsMgr = new EmsMgr(driver, config);
		emsName = new NameAndStringValue_T();
		emsName.name = Constant.EMSKEY;
		emsName.value = Constant.EMSNAME;
	}

	public void updatePortToEquip(String domain) {
		WxLogger.flow.info("开始更新端口去向");
		database.updatePortToEquip(domain);
		WxLogger.flow.info("更新端口去向完成");
	}


	
}
