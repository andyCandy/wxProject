package com.metarnet.sfpw.hwswitch.mgr;

import java.util.ArrayList;
import java.util.List;

import org.tmforum.mtop.mri.wsdl.mer.v1_0.GetAllManagedElementsException;
import org.tmforum.mtop.mri.wsdl.tlr.v1_0.GetAllTopLevelTopologicalLinksException;
import org.tmforum.mtop.mri.wsdl.tlr.v1_0.GetAllTopologicalLinksException;
import org.tmforum.mtop.mri.wsdl.tpr.v1_0.GetAllFloatingTerminationPointsException;
import org.tmforum.mtop.mri.wsdl.tpr.v1_0.GetAllPhysicalTerminationPointsWithoutFtpsException;
import org.tmforum.mtop.nrf.xsd.me.v1.ManagedElementType;
import org.tmforum.mtop.nrf.xsd.tl.v1.TopologicalLinkType;
import org.tmforum.mtop.nrf.xsd.tp.v1.TerminationPointType;

import com.metarnet.sfpw.base.database.IDatabase;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.ICfgMgr;
import com.metarnet.sfpw.base.model.ManagedElement;
import com.metarnet.sfpw.base.model.Port;
import com.metarnet.sfpw.base.model.TopologicalLink;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.hwswitch.da.HwSwitchDA;
import com.metarnet.sfpw.hwswitch.util.Converter;

public class HwSwitchCfgMgrImp implements ICfgMgr{

	private IDatabase db;
	private HwSwitchDA da;
	
	
	
	public void setDb(IDatabase db) {
		this.db = db;
	}

	public void setDa(HwSwitchDA da) {
		this.da = da;
	}

	public boolean syncCfg(String domain, String meId) throws TaskException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean syncAllCfg(String domain) throws TaskException {
		
		List<ManagedElement> meList = new ArrayList<ManagedElement>();
		List<ManagedElementType> meTypeList = null;
		
		try {
			meTypeList = da.getAllMes();
			WxLogger.flow.info("从厂家获得网元个数："+meTypeList.size());
		} catch (GetAllManagedElementsException e) {
			WxLogger.flow.error("获得网元失败",e);
			throw new TaskException(e.getMessage(),"获取网元失败",e);
		}catch(Exception ex){
			WxLogger.flow.error("获取告警失败，疑似连接断开，需重连");
			throw new TaskException("同步配置失败，疑似连接断开，准备重连",ex.getMessage(),ex);
		}
		for (ManagedElementType managedElementType : meTypeList) {
			meList.add(Converter.convertMe(managedElementType));
		}
		WxLogger.flow.info("转换网元之后，网元个数："+meList.size());
		db.flag(domain, null, false);
		db.saveME(domain, meList);
		for (ManagedElementType managedElementType : meTypeList) {
			List<Port> portList = new ArrayList<Port>();
			try {
				List<TerminationPointType> tptlist = da.getAllTp(managedElementType);
				WxLogger.res_config.info("网元"+managedElementType.getName().getRdn().get(1).getValue()+"下获得端口"+tptlist.size()+"个");
				for (TerminationPointType terminationPointType : tptlist) {
					portList.add(Converter.convertPort(terminationPointType));
				}
				
			} catch (GetAllPhysicalTerminationPointsWithoutFtpsException e) {
				
				WxLogger.flow.error("获取网元"+managedElementType.getIpaddress()+"下物理端口失败");
				continue;
			} catch (GetAllFloatingTerminationPointsException e) {
				WxLogger.flow.error("获取网元"+managedElementType.getIpaddress()+"下逻辑端口失败");
				continue;
			}
			WxLogger.flow.info("端口转换完成后，有端口："+portList.size()+"个");
			db.flag(domain, managedElementType.getName().getRdn().get(1).getValue(), false);
			db.savePorts(domain, portList);
			db.flag(domain, managedElementType.getName().getRdn().get(1).getValue(), true);
		}
		db.flag(domain, null, true);
		return true;
	}

	public boolean syncTopo(String domain) throws TaskException {
		List<TopologicalLinkType> topotypeList = null;
		try {
			topotypeList = da.getAllTopos();
		} catch (GetAllTopologicalLinksException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new TaskException("获取所有拓扑失败","",e);
		} catch (GetAllTopLevelTopologicalLinksException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new TaskException("获取顶层拓扑失败","",e);
		}
		
		List<TopologicalLink> topolist = new ArrayList<TopologicalLink>();
		for (TopologicalLinkType topologicalLinktype : topotypeList) {
			topolist.add(Converter.convertTopos(topologicalLinktype));
		}
		
		db.saveTLs(domain, topolist);
		
		return true;
	}
	
	public void updatePortToEquip(String domain) {
		WxLogger.flow.info("开始更新端口去向");
		db.updatePortToEquip(domain);
		WxLogger.flow.info("更新端口去向完成");
	}

}
