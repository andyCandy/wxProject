package com.metarnet.sfpw.hwswitch.util;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndStringValueType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.fmw.xsd.nam.v1.RelativeDistinguishNameType;
import org.tmforum.mtop.nra.xsd.alm.v1.AlarmType;
import org.tmforum.mtop.nra.xsd.com.v1.PerceivedSeverityType;
import org.tmforum.mtop.nra.xsd.pmdata.v1.PerformanceMonitoringDataType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersType;
import org.tmforum.mtop.nrf.xsd.com.v1.ConnectionDirectionType;
import org.tmforum.mtop.nrf.xsd.ftp.v1.FloatingTerminationPointType;
import org.tmforum.mtop.nrf.xsd.me.v1.ManagedElementType;
import org.tmforum.mtop.nrf.xsd.ptp.v1.PhysicalTerminationPointType;
import org.tmforum.mtop.nrf.xsd.tl.v1.TopologicalLinkType;
import org.tmforum.mtop.nrf.xsd.tp.v1.TerminationPointType;

import com.metarnet.adapter.model.ADPAlarm;
import com.metarnet.adapter.model.ALMSeverity;
import com.metarnet.sfpw.base.model.Direction;
import com.metarnet.sfpw.base.model.IfPerformance;
import com.metarnet.sfpw.base.model.ManagedElement;
import com.metarnet.sfpw.base.model.Port;
import com.metarnet.sfpw.base.model.TopologicalLink;
import com.metarnet.sfpw.base.util.WxLogger;

public class Converter {

	/**
	 * 告警发生位置，时间的解析还有待根据数据做进一步的调整
	 * @param alarmType
	 * @return
	 */
	public static ADPAlarm convertSingleAlarm(AlarmType alarmType){
		
		ADPAlarm adpAlarm = new ADPAlarm();
		adpAlarm.setAlarmId(alarmType.getNotificationId());
		adpAlarm.setCause(alarmType.getProbableCause().getProbableCause().value());
		adpAlarm.setDescription(alarmType.getAdditionalText());
		adpAlarm.setTime(alarmType.getSourceTime().toString().substring(0, 19).replace("T", " "));
		adpAlarm.setSeverity(getSeverity(alarmType.getPerceivedSeverity()));
		List<RelativeDistinguishNameType> objectName =  alarmType.getObjectName().getRdn();
		
		if(objectName.size()==2){
			ManagedElement me = new ManagedElement();
			me.setMeId(objectName.get(1).getValue());
			adpAlarm.setObject(me);
		}else if(objectName.size()==3){
			Port port = new Port();
			port.setMeId(objectName.get(1).getValue());
			String[] position = getPosition(objectName.get(2).getValue());
			if(position.length<5 || position[5]==null){
				WxLogger.flow.info("端口位置信息不符合要求："+objectName.get(2).getValue());
				return null;
			}
			port.setSlotId(position[1]);
			port.setPortId(position[5]);
			adpAlarm.setObject(port);
			
		}else{
			WxLogger.flow.error("没获得告警所属信息，抛弃该告警");
			return null;
		}
		
		return adpAlarm;
	}
	
	
	private static ALMSeverity getSeverity (PerceivedSeverityType pst){
		
		if(pst.compareTo(PerceivedSeverityType.CLEARED)==0){
			return ALMSeverity.CLEARED;
		}else if(pst.compareTo(PerceivedSeverityType.CRITICAL)==0){
			return ALMSeverity.CRITICAL;
		}else if(pst.compareTo(PerceivedSeverityType.MAJOR)==0){
			return ALMSeverity.MAJOR;
		}else if(pst.compareTo(PerceivedSeverityType.INDETERMINATE)==0){
			return ALMSeverity.MINOR;
		}else if(pst.compareTo(PerceivedSeverityType.MINOR)==0){
			return ALMSeverity.MAJOR;
		}else if(pst.compareTo(PerceivedSeverityType.WARNING)==0){
			return ALMSeverity.WARNING;
		}
		
		WxLogger.flow.info("无法识别的告警级别，暂定为MINOR，"+pst.value());
		
		return ALMSeverity.MINOR;
	}
	
	
	public static void main(String[] args) {
		
		String[] result = Converter.getPosition("/shelf=1/slot=2/sub_slot=3/type=eth/port=19/cli_name=GigabitEthernet0/0/19");
		System.out.println(result.length);
		for (String string : result) {
			System.out.println("asd:"+string);
		}
		
		
		
		
	}
	
	/**
	 * 获取端口位置描述字符串中需要的字符
	 * @param input  /shelf=sh[/slot=sl[/sub_slot=ssl]][/domain=<dm>][/type=<tt>][/port=<p>]
	 * /shelf=0/slot=1/port=0
	 * @return 
	 */
	private static String[] getPosition(String input){
		String regex = "/shelf=(.*?)/(slot=(.*?)/?(sub_slot=(.*?))?)?/?(domain=(.*?))?/?(type=(.*?))?/?port=(\\d+)/?cli_name=(.*)?";
		String[] result = new String[7];
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(input);
		if(m.find()){
			result[0] = m.group(1);
			result[1] = m.group(3);
			result[2] = m.group(5);
			result[3] = m.group(7);
			result[4] = m.group(9);
			result[5] = m.group(10);
			result[6] = m.group(11);
		}else{
			WxLogger.res_config.info("不识别的端口格式："+input);
			return new String[0];
		}
		
		return result;
	}
	
	/**
	 * @param topoType
	 * @return
	 */
	public static TopologicalLink convertTopos(TopologicalLinkType topoType){
		
		TopologicalLink topolink = new TopologicalLink();
		List<RelativeDistinguishNameType> toponame = topoType.getName().getRdn();
		topolink.setLinkid(toponame.get(1).getValue());
		/**a end*/
		NamingAttributeType aEndname = topoType.getAEndTpRefList().getName().get(0);
		topolink.setaMeId(aEndname.getRdn().get(1).getValue());
		String[] aposition = getPosition(aEndname.getRdn().get(2).getValue());
		if(aposition.length > 4){
			topolink.setaPortId(aposition[5]);
			topolink.setaSlotId(aposition[1]);
		}
		/**z end*/
		NamingAttributeType zEndname = topoType.getZEndTpRefList().getName().get(0);
		topolink.setzMeId(zEndname.getRdn().get(1).getValue());
		String[] zposition = getPosition(zEndname.getRdn().get(2).getValue());
		if(zposition.length > 4){
			topolink.setzPortId(zposition[5]);
			topolink.setzSlotId(zposition[1]);
		}
		topolink.setLabel(topoType.getUserLabel());
		topolink.setDirection(getDirection(topoType.getDirection()));
		
		return topolink;
	}
	
	public static Direction getDirection(ConnectionDirectionType direction){
		
		if(direction.compareTo(ConnectionDirectionType.CD_BI)==0){
			return Direction.CD_BI;
		}else if(direction.compareTo(ConnectionDirectionType.CD_UNI)==0){
			return Direction.CD_UNI;
		}else{
			return Direction.UNKNOWN;
		}
		
	}
	
	public static ManagedElement convertMe(ManagedElementType meType){
		
		ManagedElement me = new ManagedElement();
		me.setNativeEmsName(meType.getAliasNameList().getAlias().get(0).getAliasValue());
		
		me.setIpAddress(meType.getIpaddress());
		me.setLocation(meType.getLocation());
		me.setCommunicationState(meType.getCommunicationState().value());
//		me.setOwner(meType.getOwner().getValue());
		me.setProductName(meType.getProductName());
		me.setType(meType.getProductName());
		me.setUserLabel(meType.getUserLabel());
		me.setVersion(meType.getSoftwareVersion());
		me.setMeId(meType.getName().getRdn().get(1).getValue());
		return me;
		
	}
	
	public static Port convertPort(TerminationPointType tpt){
		if(tpt.getFtp()!=null){
			return convertFtp(tpt.getFtp());
		}else if(tpt.getPtp()!=null){
			return convertPtp(tpt.getPtp());
		}
		return null;
	}
	
	private static Port convertFtp(FloatingTerminationPointType ftp){
		Port port = new Port();
		List<RelativeDistinguishNameType> names = ftp.getName().getRdn();
		port.setMeId(names.get(1).getValue());
		String[] position = getPosition(names.get(2).getValue());
		if(position.length < 5)
			return null;
		if(position[5]==null){
			return null;
		}
		port.setPortId(position[5]);
		port.setSlotId(position[1]);
		port.setNativeEmsName(ftp.getAliasNameList().getAlias().get(0).getAliasValue());
//		port.setConnectionState(ftp.getConnectionState().getValue().value());
		port.setUserLabel(ftp.getUserLabel());
		return port;
	}
	
	/**
	 * 转换ptp类型为本框架定义的Port类型
	 * @param ptp
	 * @return
	 */
	public static Port convertPtp(PhysicalTerminationPointType ptp){
		Port port = new Port();
		List<RelativeDistinguishNameType> names = ptp.getName().getRdn();
		port.setMeId(names.get(1).getValue());
		String[] position = getPosition(names.get(2).getValue());
		if(position.length < 5)
			return null;
		port.setSlotId(position[1]);
		port.setPortId(position[5]);
		port.setNativeEmsName(ptp.getAliasNameList().getAlias().get(0).getAliasValue());
		if(position[5]==null){
			return null;
		}
//		port.setConnectionState(ptp.getResourceState().);
		String portStatus = "";
		
		/**
		 * PortMode:100M-Full-Duplex
WorkMode:L2
Tag:Access
MACLearning:Enabled
MaximumFrameSize:1500
PhysAddress:70:54:f5:a1:bb:00
TPID:33024
PVID:12
PortDefaultUserPriority:0
CTagTranslation_Table_Count:0
AddSTag_Table_Count:0
VLANsForUntaggingOnEgress:N/A
DHCPSnooping:Disable
DHCPOption82:Disable
=======================
AdminStatus:Up
OperateStatus:Up
=======================
=======================
		 */
		List<LayeredParametersType> list = ptp.getTransmissionParametersList().getTransmissionParameters();
		for (LayeredParametersType layeredParametersType : list) {
			List<NameAndStringValueType> namelist = layeredParametersType.getParameterList().getNvs();
			for (NameAndStringValueType nameAndStringValueType : namelist) {
				WxLogger.res_config.info(nameAndStringValueType.getName()+":"+nameAndStringValueType.getValue());
				if(nameAndStringValueType.getName().equals("OperateStatus")){
					portStatus = nameAndStringValueType.getValue();
					
				}
				if(nameAndStringValueType.getName().equals("PortMode")){
					port.setType(nameAndStringValueType.getValue());
				}
//				System.out.println(nameAndStringValueType.getName()+":"+nameAndStringValueType.getValue());
				
			}
//			System.out.println("=======================");
		}
		port.setConnectionState(portStatus);
		
		port.setUserLabel(ptp.getUserLabel());
		return port;
	}
	
	static String[] measures = {"流入速率","流出速率","流入带宽利用率","流出带宽利用率","流入单播包速率","流出单播包速率","流入非单播包速率","流出非单播包速率","流入多播包速率","流出多播包速率","流入广播包速率","流出广播包速率","流入未知协议包速率","流入丢弃包速率","流出丢弃包速率","流入丢弃包比率","流出丢弃包比率","流入错误包速率","流出错误包速率","流入错误包比率","流出错误包比率","流入包速率","流出包速率","流入单播包","流出单播包","流入多播包","流出多播包","流入广播包","流出广播包","最大速率","最大带宽利用率"};
	
	public static IfPerformance convertPerf(Map<String,PerformanceMonitoringDataType> pdt){
		if(pdt==null||pdt.size()==0){
			return null;
		}
		IfPerformance ifPerf = new IfPerformance();
		NamingAttributeType tpName = pdt.get(measures[0]).getTpName();
		ifPerf.setMeId(tpName.getRdn().get(1).getValue());
		ifPerf.setSlot(getPosition(tpName.getRdn().get(2).getValue())[1]);
		ifPerf.setPortId(getPosition(tpName.getRdn().get(2).getValue())[5]);
		ifPerf.setPortName(getPosition(tpName.getRdn().get(2).getValue())[6]);
		ifPerf.setIfInNUcastPKts(pdt.get(measures[27]).getPmMeasurementList().getPmMeasurement().get(0).getValue());
//		ifPerf.setIfInOctets(ifInOctets);
		ifPerf.setIfInUcastPkts(pdt.get(measures[23]).getPmMeasurementList().getPmMeasurement().get(0).getValue());
		ifPerf.setIfOutNUcastPkts(pdt.get(measures[28]).getPmMeasurementList().getPmMeasurement().get(0).getValue());
//		ifPerf.setIfOutOctets(ifOutOctets);
		ifPerf.setIfOutUcastPkts(pdt.get(measures[24]).getPmMeasurementList().getPmMeasurement().get(0).getValue());
		return ifPerf;
	}
	
	
}
