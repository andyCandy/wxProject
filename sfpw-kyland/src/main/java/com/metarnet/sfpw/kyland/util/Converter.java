package com.metarnet.sfpw.kyland.util;

import globaldefs.NameAndStringValue_T;
import globaldefs.NamingAttributes_THelper;
import globaldefs.Time_THelper;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import notifications.PerceivedSeverity_T;
import notifications.PerceivedSeverity_THelper;

import org.omg.CORBA.Any;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.CosNotification.Property;
import org.omg.CosNotification.StructuredEvent;

import managedElement.ManagedElement_T;
import performance.PMData_T;
import performance.PMMeasurement_T;
import terminationPoint.TerminationPoint_T;
import topologicalLink.TopologicalLink_T;

import com.metarnet.adapter.model.ADPAlarm;
import com.metarnet.adapter.model.ALMSeverity;
import com.metarnet.sfpw.base.model.Direction;
import com.metarnet.sfpw.base.model.EquipPerf;
import com.metarnet.sfpw.base.model.IfPerformance;
import com.metarnet.sfpw.base.model.ManagedElement;
import com.metarnet.sfpw.base.model.Port;
import com.metarnet.sfpw.base.model.TopologicalLink;
import com.metarnet.sfpw.base.util.WxLogger;


/**
 * 
 * @author bcmeng
 * 2013年12月16日
 * Converter.java
 * com.metarnet.adapter.util
 * TODO 用于将从厂家获取的数据对象转化为数据库对象模型
 */
public class Converter {

	/**
	 * 
	 * @TODO 将厂家的性能模型转成数据库对应的性能模型
	 * @return List<IfPerformance> 
	 * @param pmDataList
	 * @param portId 
	 * @param meId 
	 * @return
	 *
	 */
	public static List<IfPerformance> convert(List<PMData_T> pmDataList) {
		List<IfPerformance> ifPerfList = new ArrayList<IfPerformance>();
		for (PMData_T pmData_T : pmDataList) {
			ifPerfList.add(singleConvert(pmData_T));
		}
		return ifPerfList;
	}
	/**
	 * 
	 * @TODO 将厂家的性能模型转成数据库对应的性能模型
	 * @return IfPerformance
	 * @param pm
	 * @param portId 
	 * @param meId 
	 * @return
	 *
	 */
	public static IfPerformance singleConvert(PMData_T pm){
		IfPerformance ifPerf = new IfPerformance();
		ifPerf.setMeId(pm.tpName[1].value);
		System.out.println(pm.tpName[2].value);
		ifPerf.setSlot(getSlotId(pm.tpName[2].value));
		ifPerf.setPortId(getPortId(pm.tpName[2].value));
		ifPerf.setPortName(getPortName(pm.tpName[2].value));
		ifPerf.setLayerRate(pm.layerRate);
		ifPerf.setRetrievalTime(pm.retrievalTime);
		ifPerf.setGranularity(pm.granularity);
		setter(ifPerf,pm.pmMeasurementList);
		System.out.println(ifPerf);
		return ifPerf;
	}
	
	/**
	 * 
	 * @TODO 给端口性能指标赋值
	 * @return void
	 * @param ifPerf
	 * @param pmMeasurementList
	 *
	 */
	public static void setter(IfPerformance ifPerf, PMMeasurement_T[] pmMeasurementList){
	
		Class<? extends IfPerformance> ifperfClass = ifPerf.getClass();
		Field[] fields = ifperfClass.getDeclaredFields();
		for (PMMeasurement_T pm : pmMeasurementList) {
			for (Field field : fields) {
				if(pm.pmParameterName.equals(field.getName())){
					field.setAccessible(true);
					try {
						field.set(ifPerf, pm.value);
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	/**
	 * 
	 * @TODO 转化单个网元
	 * @return ManagedElement
	 * @param me_T
	 * @return
	 *
	 */
	public static ManagedElement convertSingleME(ManagedElement_T me_T){
		
		ManagedElement me = new ManagedElement();
		me.setMeId(me_T.name[1].value);
		me.setVersion(me_T.version);
		me.setCommunicationState(me_T.communicationState.value()+"");
		me.setIpAddress(me_T.additionalInfo[0]==null?"":me_T.additionalInfo[0].value);
		me.setLocation(me_T.location);
		try {
			me.setNativeEmsName(new String(me_T.nativeEMSName.getBytes("ISO-8859-1"),"gbk"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		me.setOwner(me_T.owner);
		me.setProductName(me_T.productName);
		me.setType(getType(me_T.additionalInfo[3]==null?"":me_T.additionalInfo[3].value));
		
		me.setUserLabel(me_T.userLabel);
		return me;
	}
	
	/**
	 * SICOM3307S --> 2555905
	 * SICOM6524  --> 24579/24577/2
	 * @param typeNum
	 * @return
	 */
	private static String getType(String typeNum){
		
		if(typeNum.equals("2555905")){
			return "SICOM3307S";
		}else if(typeNum.equals("24576")||
				typeNum.equals("24577")||
				typeNum.equals("24578")||
				typeNum.equals("24579")){
			return "SICOM6524";
		}else{
			return "未知设备类型:"+typeNum;
		}
		
	}
	
	/**
	 * 
	 * @TODO 转化端口列表
	 * @return List<Port>
	 * @param terminationPoint_TList
	 * @return
	 *
	 */
	public static List<Port> convertPortList(List<TerminationPoint_T> terminationPoint_TList) {
		List<Port> portList = new ArrayList<Port>();
		for (TerminationPoint_T terminationPoint_T : terminationPoint_TList) {
			portList.add(convertSinglePort(terminationPoint_T));
		}
		return portList;
	}
	
	/**
	 * 
	 * @TODO 转化单个端口
	 * @return Port
	 * @param terminationPoint_T
	 * @return
	 *
	 */
	private static Port convertSinglePort(TerminationPoint_T terminationPoint_T) {
		Port port = new Port();
		port.setMeId(terminationPoint_T.name[1].value);
		System.out.println(terminationPoint_T.name[2].value);
		port.setPortId(getPortId(terminationPoint_T.name[2].value));
		port.setSlotId(getSlotId(terminationPoint_T.name[2].value));
//		System.out.println(terminationPoint_T.name[2].name+":"+terminationPoint_T.name[2].value);
		port.setNativeEmsName(terminationPoint_T.nativeEMSName);
		port.setType(terminationPoint_T.additionalInfo[0]==null?"":terminationPoint_T.additionalInfo[0].value);
		port.setUserLabel(terminationPoint_T.userLabel);
		port.setConnectionState(getConnectionState(terminationPoint_T.connectionState.value()));
		return port;
	}
	
	/**
	 * 端口连接状态转换
	 * NA,source,sink,bi,not,分别是0,1,2,3,4
	 * 其中0和4是down，其他是up
	 * @param stateNum
	 * @return
	 */
	private static String getConnectionState(int stateNum){
		if(stateNum == 1 || stateNum == 2 || stateNum == 3)
			return "up";
		return "down";
	}
	public static void main(String[] args) throws Exception{
		String s = "桑达６＃";
		System.out.println(Converter.getMeId(s));
		
	}
	/**
	 * 
	 * @TODO 从字符串中取端口号
	 * @return String
	 * @param portStr
	 * @return
	 *"/rack=1/shelf=1/slot=1/port=1"
	 */
	private static String getPortId(String portStr){
		Pattern pattern = Pattern.compile("(?<=port=)\\d*");
		Matcher matcher = pattern.matcher(portStr);
		if(matcher.find()){
			return matcher.group();
		}
		return null;
	}
	
	/**
	 * 
	 * @TODO 从字符串中取端口名称
	 * @return String
	 * @param portStr
	 * @return
	 *"/rack=1/shelf=1/slot=1/port=1/name=pp"
	 */
	private static String getPortName(String portStr){
		Pattern pattern = Pattern.compile("(?<=name=).*");
		Matcher matcher = pattern.matcher(portStr);
		if(matcher.find()){
			return matcher.group();
		}
		return null;
	}
	
	private static String getSlotId(String slotStr){
		Pattern pattern = Pattern.compile("(?<=slot=)\\d*");
		Matcher matcher = pattern.matcher(slotStr);
		if(matcher.find()){
			return matcher.group();
		}
		return null;
	}
	

//	public static void main(String[] args) {
//		String portStr = "/rack=1/shelf=1/slot=12/port=34";
//		System.out.println(Converter.getSlotId(portStr));
//	}
	
	public static List<TopologicalLink> convertTopoList(List<TopologicalLink_T> topo_tList) {
		List<TopologicalLink> linkList = new ArrayList<TopologicalLink>();
		for (TopologicalLink_T topologicalLink_T : topo_tList) {
			TopologicalLink link = new TopologicalLink();
			link.setaMeId(topologicalLink_T.aEndTP[1].value);
			link.setaPortId(getPortId(topologicalLink_T.aEndTP[2].value));
			link.setaSlotId(getSlotId(topologicalLink_T.aEndTP[2].value));
			link.setDirection(Direction.from_value(topologicalLink_T.direction.value()));
			link.setLabel(topologicalLink_T.userLabel);
			link.setLinkid(topologicalLink_T.name[1].value);
			link.setNativeEmsName(topologicalLink_T.nativeEMSName);
			link.setRate(topologicalLink_T.rate+"");
//			link.setType(topologicalLink_T.additionalInfo);
			link.setzMeId(topologicalLink_T.zEndTP[1].value);
			link.setzPortId(getPortId(topologicalLink_T.zEndTP[2].value));
			link.setzSlotId(getSlotId(topologicalLink_T.zEndTP[2].value));
			linkList.add(link);
		}
		
		return linkList;
	}
	
	/**
	 * 
	 * @TODO 将告警事件类型，转成ADPAlarm（入库类型）
	 * @return ADPAlarm
	 * @param event
	 *
	 */
	public static List<ADPAlarm> convertAlarm(List<StructuredEvent> alarmEvents) {
		List<ADPAlarm> alarms = new ArrayList<ADPAlarm>();
		for (StructuredEvent structuredEvent : alarmEvents) {
			ADPAlarm alarm = convertSingleAlarm(structuredEvent);
			WxLogger.res_config.info(alarm.getAlarmId());
			alarms.add(alarm);
		}
		return alarms;
	}
	
	/**
	 * 
	 * @TODO 将告警事件类型，转成ADPAlarm（入库类型）
	 * @return ADPAlarm
	 * @param event
	 * @return
	 *告警发生的位置信息还不清楚，这里需要根据厂家信息继续修改
	 */
	public static ADPAlarm convertSingleAlarm(StructuredEvent event) {
		Property[] props = event.filterable_data;
		ADPAlarm alarm = new ADPAlarm();
		NameAndStringValue_T[] objName = 
				NamingAttributes_THelper.extract(getValueFromProps("objectName", props));
		
		/**对象类型，可以看出是设备告警，还是端口告警*/
		Any objectTypeQualifier = getValueFromProps("objectTypeQualifier",props);
		String objectTypeQualifierStr = null;
		try {
			objectTypeQualifierStr = new String(notifications.ObjectTypeQualifier_THelper.extract(objectTypeQualifier).getBytes("ISO-8859-1"),"gbk");
			System.out.println("objectType:"+objectTypeQualifierStr);
		} catch (UnsupportedEncodingException e1) {
			WxLogger.res_config.error("没获得告警所属信息，抛弃该告警："+e1.getMessage(),e1);
			return null;
		}
		String[] objects = objectTypeQualifierStr.split(",");
		
		if(objects.length == 2){
			
			ManagedElement me = new ManagedElement();
			try {
				me.setMeId(getMeId(objects[1]));
			} catch (Exception e) {
				
				WxLogger.res_config.error("没获得告警所属设备信息，抛弃该告警，"+objectTypeQualifierStr,e);
				return null;
			}
			alarm.setObject(me);
		}
		else if(objects.length == 3){
			Port port = new Port();
			try {
				port.setMeId(getMeId(objects[1]));
				port.setPortId(getPort(objects[2]));
				port.setSlotId(getSlot(objects[2]));
			} catch (Exception e) {
				WxLogger.res_config.error("没获得告警所属端口信息，抛弃该告警，"+objectTypeQualifierStr,e);
				return null;
			}
			alarm.setObject(port);
		}else{
			WxLogger.res_config.error("没获得告警所属设备信息，抛弃该告警");
			return null;
			
		}
		long probableCauseQualifier = 0;
		Any propCause = getValueFromProps("ProbableCauseQualifier",props);
		if(propCause!=null){
			probableCauseQualifier = propCause.extract_long();
		}else{
			probableCauseQualifier = 0;
		}
		try {
			alarm.setCause(new String(getValueFromProps("nativeProbableCause", props).extract_wstring().getBytes("ISO-8859-1"),"gbk"));
			alarm.setDescription(new String(getValueFromProps("nativeProbableCause", props).extract_wstring().getBytes("ISO-8859-1"),"gbk"));
		} catch (BAD_OPERATION e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isClearable = getValueFromProps("isClearable",props).extract_boolean();
		alarm.setTime(Time_THelper.extract(getValueFromProps("neTime",props)));
		if(isClearable){
			alarm.setSeverity(ALMSeverity.CLEARED);
			alarm.setTime(Time_THelper.extract(getValueFromProps("emsTime",props)));
		}else{
			PerceivedSeverity_T perceivedSeverity_T = PerceivedSeverity_THelper.extract(getValueFromProps("perceivedSeverity",props));
			alarm.setSeverity(convertSeverity(perceivedSeverity_T));
		}
		/**通过资源名，告警原因标识符和时间来唯一确定一个告警*/
		alarm.setAlarmId(genUniqueAlarmId(objectTypeQualifierStr,probableCauseQualifier,alarm.getTime()));
		return alarm;
	}
	
	/**
	 * 
	 * @param portStr
	 * @return 端口号
	 * @throws Exception
	 * 从告警的对象类型中解析出端口号
	 * 格式：10.1.21.22,设备_48,端口1/9
	 *       10.1.21.22,春江花园１＃,端口1/9
	 * 先用逗号分成三部分，用端口1/9作为参数解析出端口号9；
	 * getSlot,getMeId这两个方法都是从这个字符串中读取
	 */
	public static String getPort(String portStr) throws Exception{
		
		Pattern pattern = Pattern.compile("(?<=/)\\d*");
		Matcher matcher = pattern.matcher(portStr);
		if(matcher.find()){
			return matcher.group();
		}
		throw new Exception("没找到端口号");
	}
	
	public static String getSlot(String slotStr) throws Exception{
		Pattern pattern = Pattern.compile("\\d*(?=/)");
		Matcher matcher = pattern.matcher(slotStr);
		if(matcher.find()){
			return matcher.group();
		}
		throw new Exception("没找到槽位号");
	}
	
	public static String getMeId(String meStr) throws Exception{
		return meStr;
	}
	
	
	/**
	 * 
	 * @TODO 通过名字，从属性数组中取值
	 * @return Any
	 * @param name
	 * @param props
	 * @return
	 *
	 */
	private static Any getValueFromProps(String name,Property[] props){
		for (Property property : props) {
			if(property.name.equals(name)){
				return property.value;
			}
		}
		return null;
	}
	/**
	 * 
	 * @TODO 根据告警等级字符串，构造枚举类型的等级
	 * @return ALMSeverity
	 * @param severityStr
	 * @return
	 *
	 */
	private static ALMSeverity convertSeverity(PerceivedSeverity_T severity){
		if(PerceivedSeverity_T._PS_WARNING == severity.value())
			return ALMSeverity.WARNING;
		if(PerceivedSeverity_T._PS_CLEARED == severity.value())
			return ALMSeverity.CLEARED;
		if(PerceivedSeverity_T._PS_CRITICAL == severity.value())
			return ALMSeverity.CRITICAL;
		if(PerceivedSeverity_T._PS_MAJOR == severity.value())
			return ALMSeverity.MAJOR;
		if(PerceivedSeverity_T._PS_MINOR == severity.value())
			return ALMSeverity.MINOR;
		if(PerceivedSeverity_T._PS_WARNING == severity.value())
			return ALMSeverity.WARNING;
		return null;
	}
	
	/**
	 * 
	 * @TODO 生成唯一告警标识
	 * @return String 
	 * @param objName 资源名
	 * @param probableCauseQualifier 告警原因标识
	 * @param neTime 告警发生时间
	 *
	 */
	private static String genUniqueAlarmId(String objName,long probableCauseQualifier,String neTime){
		StringBuffer alarmId = new StringBuffer();
		alarmId.append(objName).append(",");
		alarmId.append(probableCauseQualifier).append(",");
		alarmId.append(neTime);
		return alarmId.toString();
	}
	public static List<EquipPerf> convertEquipPerf(List<PMData_T> pmDataList) {
		List<EquipPerf> equipPerfList = new ArrayList<EquipPerf>();
		for (PMData_T pmData_T : pmDataList) {
			EquipPerf equipPerf = new EquipPerf();
			equipPerf.setDevMemoryTotalNum(getPmValue("devMemoryTotalNum",pmData_T.pmMeasurementList)+"");
			equipPerf.setCpuCurrentUtilRate(getPmValue("cpuCurrentUtilRate",pmData_T.pmMeasurementList)+"");
			equipPerf.setCpuLongTimeUtilRate(getPmValue("cpuLongTimeUtilRate",pmData_T.pmMeasurementList)+"");
			equipPerf.setDevMemoryAllocNum(getPmValue("devMemoryAllocNum",pmData_T.pmMeasurementList)+"");
			equipPerf.setDevMemoryFreeNum(getPmValue("devMemoryFreeNum",pmData_T.pmMeasurementList)+"");
			ManagedElement me = new ManagedElement();
			me.setMeId(pmData_T.tpName[1].value);
			equipPerf.setEquip(me);
			equipPerfList.add(equipPerf);
		}
		return equipPerfList;
	}
	
	public static float getPmValue(String pmName,PMMeasurement_T[] pmList){
		for (PMMeasurement_T pmMeasurement_T : pmList) {
			if(pmMeasurement_T.pmParameterName.equals(pmName)){
				return pmMeasurement_T.value;
			}
		}
		return 0;
		
	}
}
