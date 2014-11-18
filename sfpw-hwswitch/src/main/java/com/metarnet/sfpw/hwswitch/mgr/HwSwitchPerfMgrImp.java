package com.metarnet.sfpw.hwswitch.mgr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nra.xsd.pmdata.v1.PerformanceMonitoringDataType;
import org.tmforum.mtop.rpm.wsdl.pmr.v1_0.GetAllCurrentPerformanceMonitoringDataException;
import org.tmforum.mtop.rpm.wsdl.pmr.v1_0.GetHistoryPerformanceMonitoringDataException;

import com.metarnet.sfpw.base.database.IDatabase;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.IPerfMgr;
import com.metarnet.sfpw.base.model.IfPerformance;
import com.metarnet.sfpw.base.util.Config;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.hwswitch.da.HwSwitchDA;
import com.metarnet.sfpw.hwswitch.util.Converter;
import com.metarnet.sfpw.hwswitch.util.HwConfig;

public class HwSwitchPerfMgrImp implements IPerfMgr{

	private IDatabase db;
	
	private HwSwitchDA da;
	
	HwConfig config ;
	
	
	
	public void setDb(IDatabase db) {
		this.db = db;
	}

	public void setDa(HwSwitchDA da) {
		this.da = da;
	}

	public void setConfig(HwConfig config) {
		this.config = config;
	}

	public void syncPerf(String meId) throws TaskException {
		
	}

	public void syncAllPerf() throws TaskException {
		List<Map<String, PerformanceMonitoringDataType>> perflist = null;
		try {
			perflist = da.getAllPerf();
		} catch (GetHistoryPerformanceMonitoringDataException e) {
			throw new TaskException("调用获取所有性能方法异常",e.getMessage(),e);
		}
		List<IfPerformance> ifperfList = new ArrayList<IfPerformance>();
		for (Map<String,PerformanceMonitoringDataType> pdt : perflist) {
			ifperfList.add(Converter.convertPerf(pdt));
		}
//		WxLogger.res_config.info(ifperfList.toString());
		db.saveIfPM(config.getDomain(), ifperfList);
	}

}
