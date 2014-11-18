package com.metarnet.sfpw.hw.mgr;

import java.util.List;











import com.metarnet.epon.adapter.AdapterException;
import com.metarnet.epon.adapter.IfPerformance;
import com.metarnet.epon.adapter.OltPerformance;
import com.metarnet.epon.input.InputDatabase;
import com.metarnet.epon.input.InputIfPerformance;
import com.metarnet.epon.input.InputOltPerformance;
import com.metarnet.epon.input.InputResult;
import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.IPerfMgr;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.hw.da.HuaweiAdapter;
import com.metarnet.sfpw.hw.database.EponDatabase;


public class HuaweiPerfMgrImpl implements IPerfMgr{

	private EponDatabase database;
	private HuaweiAdapter adapter;
	
	
	public void setDatabase(EponDatabase database) {
		this.database = database;
	}

	public void setAdapter(HuaweiAdapter adapter) {
		this.adapter = adapter;
	}

	
	public void syncPerf(String meId) {
		// TODO Auto-generated method stub
		
	}

	public void syncAllPerf() throws TaskException, ConnectionException {
		
		List<OltPerformance> oltPerfList = null;
		try {
			oltPerfList = adapter.getOltPerformances();
		} catch (AdapterException e) {
			throw new TaskException("获取数据异常",e.getMessage(),e);
		}
		WxLogger.flow.info("从厂家获取OLT性能"+oltPerfList.size()+"条");
		List<IfPerformance> ifPerfList;
		try {
			ifPerfList = adapter.getIfperformance();
		} catch (AdapterException e) {
			WxLogger.flow.info("同步性能失败:"+e.getMessage());
			throw new TaskException("同步性能失败",e.getMessage(),e);
		}
		this.database.move_to_history();//将当前性能放入历史性能表中
		WxLogger.flow.info("从厂家获取端口性能"+ifPerfList.size()+"条");
		for (OltPerformance performance : oltPerfList) {
			 if (performance == null) {
		      WxLogger.flow.info("性能信息为空.");
		      continue ;
		    }

		    if (performance.getEquipmentId() == null) {
		      WxLogger.flow.info("设备编号为空.性能编号："+performance.getPerformanceId());
		      continue ;
		    }

		    if (performance.getCpuUsage() == null) {
		      WxLogger.flow.info("cpu使用率为空.性能编号："+performance.getPerformanceId());
		      continue ;
		    }
		    if (performance.getMemUsage() == null) {
		      WxLogger.flow.info("内存使用率为空.性能编号："+performance.getPerformanceId());
		      continue ;
		    }

		    InputOltPerformance input = new InputOltPerformance();

		    input.setEquipmentId(performance.getEquipmentId());
		    input.setEntPhysicalName(performance.getEntPhysicalName());
		    input.setEntPhysicalDescr(performance.getEntPhysicalDescr());
		    input.setCpuUsage(performance.getCpuUsage());
		    input.setCpuUsageThreshold(performance.getCpuUsageThreshold());
		    input.setMemUsage(performance.getMemUsage());
		    input.setMemUsageThreshold(performance.getMemUsageThreshold());
		    input.setMemSize(performance.getMemSize());
		    input.setGatherTime(performance.getGatherTime());

		    InputResult result = this.database.raiseOltPerformance(input);

		    if (!result.result()) {
		      WxLogger.flow.info("产生设备性能失败:" + result.reason()+".性能编号："+performance.getPerformanceId());
		    }

		}
		
		
		for (IfPerformance performance : ifPerfList) {
			
			if (performance == null) {
			      WxLogger.flow.info("性能信息为空.");
			      continue ;
			    }

			    if (performance.getEquipmentId() == null) {
			    	WxLogger.flow.info("设备编号为空.性能编号："+performance.getPerformanceId());
			      continue ;
			    }
			    if (performance.getInterfaceId() == null) {
			    	WxLogger.flow.info("接口编号为空.性能编号："+performance.getPerformanceId());
			      continue ;
			    }

			    InputIfPerformance input = new InputIfPerformance();

			    input.setEquipmentId(performance.getEquipmentId());
			    input.setInterfaceId(performance.getInterfaceId());
			    input.setIfWorkMode(performance.getIfWorkMode());
			    input.setIfStatus(performance.getIfStatus());
			    input.setIfInOctets(performance.getIfInOctets());
			    input.setIfInUcastPkts(performance.getIfInUcastPkts());
			    input.setIfInNUcastPkts(performance.getIfInNUcastPkts());
			    input.setIfInErrors(performance.getIfInErrors());
			    input.setIfInDiscards(performance.getIfInDiscards());
			    input.setIfInUnknownProtos(performance.getIfInUnknownProtos());
			    input.setIfOutOctets(performance.getIfOutOctets());
			    input.setIfOutUcastPkts(performance.getIfOutUcastPkts());
			    input.setIfOutNUcastPkts(performance.getIfOutNUcastPkts());
			    input.setIfOutDiscards(performance.getIfOutDiscards());
			    input.setIfOutErrors(performance.getIfOutErrors());
			    input.setIfNoErrorTime(performance.getIfNoErrorTime());
			    input.setIfErrorRate(performance.getIfErrorRate());
			    input.setIfSpeed(performance.getIfSpeed());
			    input.setGatherTime(performance.getGatherTime());

			    InputResult result = this.database.raiseIfPerformance(input);

			    if (!result.result()) {
//			      System.out.println(performance.getInterfaceId());
			      WxLogger.flow.info("产生接口性能失败:" + result.reason()+".接口Id："+performance.getInterfaceId()
			    		  +",设备ID："+performance.getEquipmentId());
			      continue ;
			    }

			  }
			
			
		
	}

	 
		
	

}
