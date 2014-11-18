package com.metarnet.sfpw.base.database;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.Severity;

import com.metarnet.adapter.model.ADPAlarm;
import com.metarnet.adapter.model.ALMSeverity;
import com.metarnet.service.ServiceException;
import com.metarnet.sfpw.base.model.ManagedElement;
import com.metarnet.sfpw.base.model.Port;
import com.metarnet.sfpw.base.util.Config;
import com.metarnet.util.XConfException;

public class TestDatabase {
	String domain = "kyland_wx_eth";
	Database db ;
	public TestDatabase(){
		Config config = new Config();
		try {
			config.readCfg();
		} catch (XConfException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(config.toString());
		db = new Database();
		db.setConfig(config);
		try {
			db.init();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TestSyncMe() throws InterruptedException{
		List<ManagedElement> meList = new ArrayList<ManagedElement>();
		
		meList.add(this.constructMe("1", "1", "on", "10.1.1.1", "wuxi", "me1"));
		meList.add(this.constructMe("2", "1", "on", "10.1.1.2", "wuxi", "me2"));
		meList.add(this.constructMe("3", "1", "on", "10.1.1.3", "wuxi", "me3"));
		meList.add(this.constructMe("4", "1", "on", "10.1.1.4", "wuxi", "me4"));
		
		db.flag(domain, null, false);
		db.saveME(domain, meList);
		db.flag(domain, null, true);
		
		System.out.println("库里应该有四条新增记录，在plsq中将新增设备改成已确认状态");
		Thread.sleep(30*1000);
		
		meList.add(this.constructMe("5", "1", "on", "10.1.1.5", "wuxi", "me5"));
		
		db.flag(domain, null, false);
		db.saveME(domain, meList);
		db.flag(domain, null, true);
		
		System.out.println("这时库里应该有四条已确认和一条新增，一次");
		Thread.sleep(20*1000);
		
		
		db.flag(domain, null, false);
		db.saveME(domain, meList);
		db.flag(domain, null, true);
		
		System.out.println("这时库里应该有四条已确认和一条新增，二次");
		Thread.sleep(20*1000);
		
		meList.remove(3);
		
		db.flag(domain, null, false);
		db.saveME(domain, meList);
		db.flag(domain, null, true);
		
		System.out.println("这时库里应该有3条已确认和一条新增以及一条删除，一次");
		Thread.sleep(20*1000);
		
		db.flag(domain, null, false);
		db.saveME(domain, meList);
		db.flag(domain, null, true);
		
		System.out.println("这时库里应该有3条已确认和一条新增以及一条删除，二次");
		Thread.sleep(20*1000);
		
		meList.add(this.constructMe("4", "1", "on", "10.1.1.4", "wuxi", "me4"));
		db.flag(domain, null, false);
		db.saveME(domain, meList);
		db.flag(domain, null, true);
		
		System.out.println("这时库里应该有3条已确认和2条新增以及一条删除");
		
		meList.remove(3);
		db.flag(domain, null, false);
		db.saveME(domain, meList);
		db.flag(domain, null, true);
		System.out.println("这时库里应该有3条已确认和1条新增以及2条删除");
		
	}
	
	public void testSyncInterface(){
		
		List<Port> portList = new ArrayList<Port>();
		
		portList.add(this.constructPort("1", "1", "port1", "ge", "on"));
		portList.add(this.constructPort("1", "2", "port1", "ge", "on"));
		portList.add(this.constructPort("1", "3", "port1", "ge", "on"));
		portList.add(this.constructPort("1", "4", "port1", "ge", "on"));
		portList.add(this.constructPort("1", "5", "port1", "ge", "on"));
		
		
		db.flag(domain, "1", false);
		db.savePorts(domain, portList);
		db.flag(domain,"1", true);
		
		System.out.println("同步完成，库中应该有五条端口记录");
		
//		portList.add(this.constructPort("1", "6", "port1", "ge", "on"));
		
//		db.flag(domain, "1", false);
//		db.savePorts(domain, portList);
//		db.flag(domain,"1", true);
//		
//		System.out.println("同步完成，库中应该有五条确认端口记录和一条新增端口");
//		
//		portList.remove(2);
////		
//		db.flag(domain, "1", false);
//		db.savePorts(domain, portList);
//		db.flag(domain,"1", true);
////		
//		System.out.println("同步完成，库中应该有4条确认端口记录和一条新增端口和一条删除端口,");
	}
	
	
	public void testRaiseAlarm(){
		
		db.raiseAlarm(domain, constructPortAlarm(null,null,null));
//		db.raiseAlarm(domain, constructMeAlarm("me8"));
		
		
	}
	
	private static ADPAlarm constructPortAlarm(String meId,String slotId,String portId){
		ADPAlarm adpAlarm = new ADPAlarm();
		adpAlarm.setAlarmId("testAlarmid3");
		adpAlarm.setCause("testCause");
		adpAlarm.setDescription("testDesc");
		Port port = new Port();
		port.setMeId(meId);
		port.setSlotId(slotId);
		port.setPortId(portId);
		adpAlarm.setObject(port);
		adpAlarm.setSeverity(ALMSeverity.CRITICAL);
		adpAlarm.setTime(new Date().toLocaleString());
		return adpAlarm;
	}
	
	private static ADPAlarm constructMeAlarm(String meId){
		ADPAlarm adpAlarm = new ADPAlarm();
		adpAlarm.setAlarmId("testAlarmid5");
		adpAlarm.setCause("testCause");
		adpAlarm.setDescription("testDesc");
		ManagedElement me = new ManagedElement();
		me.setMeId(meId);
		adpAlarm.setObject(me);
		adpAlarm.setSeverity(ALMSeverity.CRITICAL);
		adpAlarm.setTime(new Date().toLocaleString());
		return adpAlarm;
	}
	
	private Port constructPort(String meId,String portid,String name,String type,String label){
		Port port = new Port();
		port.setMeId(meId);
		port.setPortId(portid);
//		System.out.println(terminationPoint_T.name[2].name+":"+terminationPoint_T.name[2].value);
		port.setNativeEmsName(name);
		port.setType(type);
		port.setUserLabel(label);
		return port;
	}
	
	private ManagedElement constructMe(String meId,String version ,String communicationState,String ip,String location,String nsName){
		ManagedElement me = new ManagedElement();
		me.setMeId(meId);
		me.setVersion(version);
		me.setCommunicationState(communicationState);
		me.setIpAddress(ip);
		me.setLocation(location);
		me.setNativeEmsName(nsName);
		return me;
	}
	
	
	public static void main(String[] args) {
		TestDatabase td = new TestDatabase();
		td.updatePortToEquip();
	}

	private void updatePortToEquip() {
		this.db.updatePortToEquip("kyland_wx_eth");
		
	}
	
	
	
}
