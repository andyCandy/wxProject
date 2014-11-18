package com.metarnet.sfpw.hwswitch.da;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.apache.log4j.PropertyConfigurator;
import org.tmforum.mtop.fmw.xsd.gen.v1.AliasNameListType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AliasNameListType.Alias;
import org.tmforum.mtop.fmw.xsd.hdr.v1.CommunicationPatternType;
import org.tmforum.mtop.fmw.xsd.hdr.v1.CommunicationStyleType;
import org.tmforum.mtop.fmw.xsd.hdr.v1.Header;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.fmw.xsd.nam.v1.RelativeDistinguishNameType;
import org.tmforum.mtop.mri.wsdl.mer.v1_0.GetAllManagedElementsException;
import org.tmforum.mtop.mri.wsdl.tlr.v1_0.GetAllTopLevelTopologicalLinksException;
import org.tmforum.mtop.mri.wsdl.tlr.v1_0.GetAllTopologicalLinksException;
import org.tmforum.mtop.mri.wsdl.tpr.v1_0.GetAllFloatingTerminationPointsException;
import org.tmforum.mtop.mri.wsdl.tpr.v1_0.GetAllPhysicalTerminationPointsWithoutFtpsException;
import org.tmforum.mtop.mri.xsd.mer.v1.GetAllManagedElementsRequest;
import org.tmforum.mtop.mri.xsd.mer.v1.MultipleMeObjectsResponseType;
import org.tmforum.mtop.mri.xsd.tlr.v1.GetAllTopologicalLinksRequest;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAllTerminationPointsType;
import org.tmforum.mtop.mri.xsd.tpr.v1.MultipleTerminationPointObjectsResponseType;
import org.tmforum.mtop.nra.xsd.alm.v1.AlarmListType;
import org.tmforum.mtop.nra.xsd.alm.v1.AlarmType;
import org.tmforum.mtop.nra.xsd.pmdata.v1.PerformanceMonitoringDataType;
import org.tmforum.mtop.nra.xsd.pmmsrt.v1.PerformanceMonitoringMeasurementType;
import org.tmforum.mtop.nra.xsd.pmtgt.v1.PerformanceMonitoringObjectSelectListType;
import org.tmforum.mtop.nra.xsd.pmtgt.v1.PerformanceMonitoringObjectSelectType;
import org.tmforum.mtop.nrf.xsd.ftp.v1.FloatingTerminationPointType;
import org.tmforum.mtop.nrf.xsd.me.v1.ManagedElementType;
import org.tmforum.mtop.nrf.xsd.ptp.v1.PhysicalTerminationPointType;
import org.tmforum.mtop.nrf.xsd.tl.v1.TopologicalLinkType;
import org.tmforum.mtop.nrf.xsd.tp.v1.TerminationPointType;
import org.tmforum.mtop.rpm.wsdl.pmr.v1_0.GetAllCurrentPerformanceMonitoringDataException;
import org.tmforum.mtop.rpm.wsdl.pmr.v1_0.GetHistoryPerformanceMonitoringDataException;
import org.tmforum.mtop.rpm.xsd.pmr.v1.GetHistoryPerformanceMonitoringDataRequest;
import org.tmforum.mtop.rpm.xsd.pmr.v1.MultiplePerformanceMonitoringDataObjectsResponseType;
import org.tmforum.mtop.rtm.wsdl.ar.v1_0.GetActiveAlarmsException;
import org.tmforum.mtop.rtm.xsd.ar.v1.GetActiveAlarmsRequest;

import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.hwswitch.driver.HwSwitchwsDriver;
import com.metarnet.sfpw.hwswitch.util.HwConfig;
import com.metarnet.sfpw.hwswitch.util.MyXmlDateTime;

public class HwSwitchDA {

	private HwSwitchwsDriver driver ;
	
	private HwConfig config;
	
	
	static {
		PropertyConfigurator.configure(HwSwitchDA.class
				.getResource("/log4j.properties"));
	}
	
	public void setDriver(HwSwitchwsDriver driver) {
		this.driver = driver;
	}

	public void setConfig(HwConfig config) {
		this.config = config;
	}


	public void init(){
		
	}
	
	
	/**
	 * 获取所有当前告警
	 * @return 告警数据列表
	 * @throws GetActiveAlarmsException 
	 */
	public List<AlarmType> getAllActiveAlarm() throws GetActiveAlarmsException{
		WxLogger.flow.info("获取所有当前告警。。。");
		Header header = constructSITHeader("getActiveAlarms");
		
		GetActiveAlarmsRequest request = new GetActiveAlarmsRequest();
		
		AlarmListType alarmListType = driver.getAlmRetrieval().getActiveAlarms(new Holder<Header>(header),request);
		List<AlarmType> alarmlist = alarmListType.getAlarm();
		WxLogger.flow.info("获取所有当前告警成功，告警数目："+alarmlist.size());
		
		WxLogger.res_config.info("告警数据：");
		for (AlarmType alarmType : alarmlist) {
			WxLogger.res_config.info("NotificationId:"+alarmType.getNotificationId());
			WxLogger.res_config.info("ObjectType:"+alarmType.getObjectType());
			WxLogger.res_config.info("level:"+alarmType.getPerceivedSeverity());
			WxLogger.res_config.info("是否确认:"+alarmType.getAcknowledgeIndication());
			WxLogger.res_config.info("additionText:"+alarmType.getAdditionalText());
			WxLogger.res_config.info("probableCause:"+alarmType.getProbableCause());
			WxLogger.res_config.info("设备告警时间："+alarmType.getSourceTime().toXMLFormat());
			WxLogger.res_config.info("网管告警时间:"+alarmType.getOsTime().toXMLFormat());
			WxLogger.res_config.info("告警发生位置:");
			logName(alarmType.getObjectName());
		}
		return alarmlist;
	
	}
	
	
	
	
	/**
	 * 获取所有性能数据
	 * @return 性能数据列表
	 * @throws GetHistoryPerformanceMonitoringDataException 
	 * @throws GetAllCurrentPerformanceMonitoringDataException
	 */
	public List<Map<String, PerformanceMonitoringDataType>> getAllPerf() throws GetHistoryPerformanceMonitoringDataException{
		/**用来存放结果 */
		List<Map<String,PerformanceMonitoringDataType>> allTpPerf = new ArrayList<Map<String,PerformanceMonitoringDataType>>();
		WxLogger.flow.info("获取所有性能数据");
		/**构造header*/
		Header header = constructSITHeader("getAllPerformance");
		
		/** 前一个小时的起止时间*/
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.HOUR_OF_DAY, -1);
		Date now= cal.getTime();		
		XMLGregorianCalendar time_start = new MyXmlDateTime((now.getYear()+1900),(now.getMonth()+1),now.getDate(),now.getHours(),now.getMinutes(),now.getSeconds());
		cal=Calendar.getInstance();
		cal.add(Calendar.HOUR_OF_DAY, -0);
		now= cal.getTime();
		XMLGregorianCalendar time_end = new MyXmlDateTime((now.getYear()+1900),(now.getMonth()+1),now.getDate(),now.getHours(),now.getMinutes(),now.getSeconds());		 
		
		GetHistoryPerformanceMonitoringDataRequest request = new GetHistoryPerformanceMonitoringDataRequest();
		request.setStartTime(time_start);
		request.setEndTime(time_end);
		
		List<TerminationPointType> allTps = new ArrayList<TerminationPointType>();
		
		try {
			/**
			 * 获取所有网元
			 */
			List<ManagedElementType> allmes = this.getAllMes();
			/**
			 * 获取所有端口
			 */
			for (ManagedElementType managedElementType : allmes) {
				allTps.addAll(this.getAllTp(managedElementType));
			}
			/**
			 * 为每个端口请求性能数据
			 * 将请求得到的数据放到allTpPerf中
			 */
			for (TerminationPointType tp : allTps) {
				PerformanceMonitoringObjectSelectListType pmoslt = new PerformanceMonitoringObjectSelectListType();
				PerformanceMonitoringObjectSelectType pmost = new PerformanceMonitoringObjectSelectType();
				pmost.setName(tp.getPtp().getName());
				pmoslt.getPmObjectSelect().add(pmost);
				request.setPmObjectSelectList(pmoslt);
				MultiplePerformanceMonitoringDataObjectsResponseType response = driver.getPerfMgrRetrieval().getHistoryPerformanceMonitoringData(new Holder<Header>(header), request);
				List<PerformanceMonitoringDataType> perflist = response.getPmDataList().getPmData();
				WxLogger.flow.info("获取性能数据成功，性能数据数量:"+perflist.size());
				Map<String,PerformanceMonitoringDataType> singlePortPerf = filtePerf(perflist);
				WxLogger.flow.info("过滤掉老的性能，保留最近性能数据，数量:"+singlePortPerf.size());
				allTpPerf.add(singlePortPerf);
			}
		
		} catch (Exception e) {
			WxLogger.flow.error("构造性能参数失败",e);
		}
		
		return allTpPerf;
	}
	
	public Hashtable<String, PerformanceMonitoringDataType> filtePerf(List<PerformanceMonitoringDataType> perflist){
		
		
		Hashtable<String,PerformanceMonitoringDataType> htPerformance=new Hashtable<String,PerformanceMonitoringDataType>();   
		   for (PerformanceMonitoringDataType e : perflist) {
		     String name="";
		     for(PerformanceMonitoringMeasurementType e1 :e.getPmMeasurementList().getPmMeasurement()){
		      name=e1.getPmParameterName();
		     }
		     
		     /**
		      * 如果map中没有该指标，就加入，如果有，就将最新的put进去（覆盖旧的）
		      */
		     if(!htPerformance.containsKey(name)){
		    	 htPerformance.put(name, e);
		     }else{
			      PerformanceMonitoringDataType e2=htPerformance.get(name); 
			      XMLGregorianCalendar x=e2.getRetrievalTime();
			      java.util.Date d1=new java.util.Date(x.getYear(),x.getMonth(),x.getDay(),x.getHour(),x.getMinute(),x.getSecond());
			      x=e.getRetrievalTime();
			      java.util.Date d2=new java.util.Date(x.getYear(),x.getMonth(),x.getDay(),x.getHour(),x.getMinute(),x.getSecond());
			      if(d2.after(d1))
			      {
			       htPerformance.put(name, e);
			      } 
		     }
		   }
		   
		return htPerformance;
	
	}
	
	/**
	 * 获取所有顶层拓扑信息
	 * @return 所有顶层拓扑信息
	 * @throws GetAllTopLevelTopologicalLinksException
	 * @throws GetAllManagementDomainsException
	 */
//	private List<TopologicalLinkType> getAllTopLevelTopos() throws GetAllTopLevelTopologicalLinksException{
//		
//		WxLogger.flow.info("获取所有顶层拓扑。。。");
//		List<TopologicalLinkType> allTopLevelTopos = new ArrayList<TopologicalLinkType>();
//		
//		Header header = constructSITHeader("getAllTopLeveltopo");
//		
//		GetAllTopLevelTopologicalLinksRequest request = new GetAllTopLevelTopologicalLinksRequest();
//		
//		List<ManagementDomainType> mdlist = this.getAllMd();
//		
//		for (ManagementDomainType managementDomainType : mdlist) {
//			request.setMdRef(managementDomainType.getName());
//			MultipleTlObjectsResponseType response = driver.getTlRetrieval().getAllTopLevelTopologicalLinks(new Holder<Header>(header), request);
//			allTopLevelTopos.addAll(response.getTlList().getTl());
//		}
//		WxLogger.flow.info("获取顶层拓扑成功，拓扑数量："+allTopLevelTopos.size());
//		
//		for (TopologicalLinkType topologicalLinkType : allTopLevelTopos) {
//			
//			WxLogger.res_config.info("拓扑名称：");
//			logName(topologicalLinkType.getName());
//			List<NamingAttributeType> namingList = topologicalLinkType.getAEndTpRefList().getName();
//			WxLogger.res_config.info("拓扑A端名称：");
//			for (NamingAttributeType namingAttributeType : namingList) {
//				logName(namingAttributeType);
//			}
//		}
//		
//		return allTopLevelTopos;
//		
//	}
	
	/**
	 * 获取所有拓扑信息（包括顶层拓扑信息）
	 * @return
	 * @throws GetAllTopologicalLinksException
	 * @throws GetAllTopLevelTopologicalLinksException
	 * @throws GetAllManagementDomainsException
	 */
	public List<TopologicalLinkType> getAllTopos() throws GetAllTopologicalLinksException, GetAllTopLevelTopologicalLinksException{
		WxLogger.flow.info("获取所有拓扑信息。。。");
		List<TopologicalLinkType> allTopos = new ArrayList<TopologicalLinkType>();
		
		Header header = constructSITHeader("getAllTopologicalLinksRequest");
		
		GetAllTopologicalLinksRequest request = new GetAllTopologicalLinksRequest();
		
		NamingAttributeType name = new NamingAttributeType();
		
		RelativeDistinguishNameType rdh = new RelativeDistinguishNameType();
		
		rdh.setType("MD");
		
		rdh.setValue("Huawei/U2000");
		
		name.getRdn().add(rdh);
		
		request.setMlsnRef(name);
		
		allTopos.addAll(driver.getTlRetrieval().getAllTopologicalLinks(new Holder<Header>(header), request).getTlList().getTl());
		
		WxLogger.flow.info("获取所有拓扑信息成功,拓扑条数："+allTopos.size());
		WxLogger.res_config.info("拓扑信息");
		for (TopologicalLinkType topologicalLinkType : allTopos) {
			WxLogger.res_config.info("len:"+topologicalLinkType.getLength());
			logName(topologicalLinkType.getName());
			WxLogger.res_config.info("aEndSize:"+topologicalLinkType.getAEndTpRefList().getName().size());
			logName(topologicalLinkType.getAEndTpRefList().getName().get(0));
			WxLogger.res_config.info("zEndSize:"+topologicalLinkType.getZEndTpRefList().getName().size());
			logName(topologicalLinkType.getZEndTpRefList().getName().get(0));
			
		}
		
		return allTopos;
		
	}
	
	/**
	 * 获取所有网元信息
	 * @return
	 * @throws GetAllManagementDomainsException
	 * @throws GetAllManagedElementsException
	 */
	public List<ManagedElementType> getAllMes() throws  GetAllManagedElementsException{
		
		List<ManagedElementType> allMes = new ArrayList<ManagedElementType>();
		List<ManagedElementType> neededMes = new ArrayList<ManagedElementType>();
		
		Header header = constructSITHeader("getAllManagedElement");
		
		GetAllManagedElementsRequest request = new GetAllManagedElementsRequest();
		
		NamingAttributeType name = new NamingAttributeType();
		List<RelativeDistinguishNameType> list = name.getRdn();
		RelativeDistinguishNameType rtype = new RelativeDistinguishNameType();
		rtype.setType("MD");
		rtype.setValue("Huawei/U2000");
		list.add(rtype);
		
		request.setMdOrMlsnRef(name);
		MultipleMeObjectsResponseType response = driver.getMeRetrieval().getAllManagedElements(new Holder<Header>(header), request);
		allMes.addAll(response.getMeList().getMe());
		
		WxLogger.flow.info("共采集网元数量："+allMes.size());
		for (ManagedElementType managedElementType : allMes) {
			if(config.getRequiredMeTypeList().contains(managedElementType.getProductName())){
				neededMes.add(managedElementType);
				WxLogger.res_config.info("物理位置："+managedElementType.getLocation());
				WxLogger.res_config.info("产品名称："+managedElementType.getProductName());
				WxLogger.res_config.info(""+managedElementType.getUserLabel());
				logName(managedElementType.getName());
			}
		}
		return neededMes;
		 
	}
	
	/**
	 * 获取指定网元下所有端口信息
	 * @param me 指定网元
	 * @return
	 * @throws GetAllPhysicalTerminationPointsWithoutFtpsException
	 * @throws GetAllFloatingTerminationPointsException
	 */
	public List<TerminationPointType> getAllTp(ManagedElementType me) throws GetAllPhysicalTerminationPointsWithoutFtpsException, GetAllFloatingTerminationPointsException{
		
		Header header = constructSRRHeader("getAllTerminationPoint");
		
		GetAllTerminationPointsType tpType = new GetAllTerminationPointsType();
		
		tpType.setMeRef(me.getName());
		
		MultipleTerminationPointObjectsResponseType ptpResponse = driver.getTpRetrievalRPC().getAllPhysicalTerminationPointsWithoutFtps(new Holder<Header>(header), tpType);
		
//		MultipleTerminationPointObjectsResponseType ftpResponse = driver.getTpRetrievalRPC().getAllFloatingTerminationPoints(new Holder<Header>(header), tpType);
		
		List<TerminationPointType> ptplist = ptpResponse.getTpList().getTp();
		
//		List<TerminationPointType> ftplist = ftpResponse.getTpList().getTp();
		
		
//		if(ftplist != null && ftplist.size() > 0){
//			allTplist.addAll(ftplist);
//		}
		WxLogger.flow.info("采到物理端口："+ptplist.size());
		
		for (TerminationPointType terminationPointType : ptplist) {
			
				PhysicalTerminationPointType ptp = terminationPointType.getPtp();
				logName(ptp.getName());
				logAlisName(ptp.getAliasNameList());
		}	
		
		return ptplist;
		
	}
	
	private Header constructSRRHeader(String activeName){
		
		Header header = new Header();
		header.setActivityName(activeName);
		header.setCommunicationPattern(CommunicationPatternType.SIMPLE_RESPONSE);
		header.setCommunicationStyle(CommunicationStyleType.RPC);
		header.setSecurity(config.getWsUser()+":"+config.getWsPassword());
		return header;
	}
	
	private Header constructSITHeader(String activeName){
		
		Header header = new Header();
//		header.setActivityName(activeName);
		header.setCommunicationPattern(CommunicationPatternType.MULTIPLE_BATCH_RESPONSE);
		header.setCommunicationStyle(CommunicationStyleType.RPC);
		header.setSecurity(config.getWsUser() + ":" + config.getWsPassword());
		header.setRequestedBatchSize(1000L);
		header.setBatchSequenceNumber(1L);
		return header;
	}
	
	private void logName(NamingAttributeType name){
		WxLogger.res_config.info("========逻辑名称===========");
		List<RelativeDistinguishNameType> names = name.getRdn();
		for (RelativeDistinguishNameType relativeDistinguishNameType : names) {
			WxLogger.res_config.info(relativeDistinguishNameType.getType()+":"+relativeDistinguishNameType.getValue());
		}
		WxLogger.res_config.info("========逻辑名称===========");
	}
	
	private void logAlisName(AliasNameListType namelist){
		WxLogger.res_config.info("==========别名=============");
		List<Alias> aliases = namelist.getAlias();
		for (Alias alias : aliases) {
			WxLogger.res_config.info(alias.getAliasName()+":"+alias.getAliasValue());
		}
		WxLogger.res_config.info("==========别名=============");
	}
	
}
