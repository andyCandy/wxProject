package com.metarnet.sfpw.hw.mgr;

import java.util.List;

import com.metarnet.adapter.model.ADPAlarm;
import com.metarnet.epon.adapter.AdapterException;
import com.metarnet.epon.adapter.Alarm;
import com.metarnet.epon.adapter.Interface;
import com.metarnet.epon.adapter.ONU;
import com.metarnet.epon.adapter.ObjectType;
import com.metarnet.epon.input.InputAlarm;
import com.metarnet.epon.input.InputDatabase;
import com.metarnet.epon.input.InputResult;
import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.IAlarmMgr;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.hw.da.HuaweiAdapter;

public class HuaweiNotifyMgrImpl implements IAlarmMgr{

	private InputDatabase database;
	private String domain = "hw_wx_epon";
	private HuaweiAdapter adapter;
	
	
	
	public void setDatabase(InputDatabase database) {
		this.database = database;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public void setAdapter(HuaweiAdapter adapter) {
		this.adapter = adapter;
	}

	
	public List<ADPAlarm> getAllHisAlarm() {
		return null;
	}

	
	public List<ADPAlarm> getMeHisAlarm(String meId) {
		return null;
	}

	/**
	 * 暂时不用
	 */
	public boolean syncMeAlarm(String domain, String meId) {
	 
	    List<String> iAlarmIdList = this.database.getAllActiveAlarmIds(meId);
	    List<Alarm>  lAlarmList = this.adapter.getAllActiveAlarms(meId);
	       
	 
	    compareAlarm(iAlarmIdList, lAlarmList);
	 
	     
		return false;
	}

	
	public boolean syncAllAlarm(String domain) throws TaskException, ConnectionException {
		
	 
	       List<String> iAlarmIdList = this.database.getAllActiveAlarmIds();
	       if(iAlarmIdList == null){
	    	   WxLogger.flow.info("从数据库获取告警失败");
	    	   return false;
	       }
	       WxLogger.flow.info("从数据库中取出告警"+iAlarmIdList.size()+"条");
	       List<Alarm> lAlarmList = null;
		try {
			lAlarmList = this.adapter.getAllActiveAlarms();
		} catch (AdapterException e) {
			WxLogger.flow.info("从厂家接口获取告警失败");
			throw new TaskException("获取数据异常","",e);
		}
	       WxLogger.flow.info("从厂家获取告警"+lAlarmList.size()+"条");
	       compareAlarm(iAlarmIdList, lAlarmList);
	 
	       return false;
	}

	
	
	private void compareAlarm(List<String> input, List<Alarm> local)
	   {
	     System.out.println("录入库告警个数量:" + input.size());
	     System.out.println("设备侧告警个数量:" + local.size());
	 
	     boolean[] flags = new boolean[input.size()];
	     for (int i = 0; i < flags.length; i++) {
	       flags[i] = false;
	     }
	 
	     String[] iArray = new String[input.size()];
	     Alarm[] lArray = new Alarm[local.size()];
	     iArray = (String[])input.toArray(iArray);
	     lArray = (Alarm[])local.toArray(lArray);
	 
	     for (int l = 0; l < lArray.length; l++)
	     {
	       int i = 0;
	       for (; i < iArray.length; i++)
	       {
	         if (!iArray[i].equals(lArray[l].alarmId()))
	           continue;
	         flags[i] = true;
	 
	         break;
	       }
	 
	       if (i != iArray.length)
	         continue;
	       raiseAlarm(lArray[l]);
	     }
	 
	     for (int i = 0; i < iArray.length; i++) {
	       if (flags[i] != false)
	         continue;
	       InputResult result = this.database.clearAlarm(iArray[i]);
	 
	       if (!result.result())
	         WxLogger.flow.info("清除数据库告警失败:" + result.reason()+".告警AlarmId:"+iArray[i]);
	     }
	   }
	
	public boolean raiseAlarm(Alarm alarm)
	   {
	     if (alarm == null) {
	    	 WxLogger.flow.info("告警信息为空.");
	       return false;
	     }
	 
	     if (alarm.objectType() == null) {
	    	 WxLogger.flow.info("告警对象类型为空无法入库.告警AlarmId:"+alarm.alarmId());
	       return false;
	     }
	     if ((alarm.objectType() != ObjectType.DOMAIN) && 
	       (alarm.objectType() != ObjectType.OLT) && 
	       (alarm.objectType() != ObjectType.INTERFACE) && 
	       (alarm.objectType() != ObjectType.SPLITTER) && 
	       (alarm.objectType() != ObjectType.ONU) && 
	       (alarm.objectType() != ObjectType.UNI)) {
	    	 WxLogger.flow.info("不支持的告警对象类型:" + alarm.objectType()+".无法入库.告警AlarmId:"+alarm.alarmId());
	       return false;
	     }
	 
	     if (alarm.objectName() == null)
	     {
	    	 WxLogger.flow.info("告警对象为空。无法入库.告警AlarmId:"+alarm.alarmId());
	       return false;
	     }
	     if (alarm.objectName().length != alarm.objectType().length()) {
	    	 WxLogger.flow.info("告警对象名称长度不匹配.无法入库.告警AlarmId:"+alarm.alarmId());
	       return false;
	     }
	 
	     if (alarm.type() == null) {
	    	 WxLogger.flow.info("告警类型为空.无法入库.告警AlarmId:"+alarm.alarmId());
	       return false;
	     }
	 
	     if (alarm.severity() == null) {
	    	 WxLogger.flow.info("告警级别为空.无法入库.告警AlarmId:"+alarm.alarmId());
	       return false;
	     }
	 
	     if ((alarm.time() == null) || (alarm.time().length() != 14)) {
	    	 WxLogger.flow.info("告警时间错误:" + alarm.time()+".无法入库.告警AlarmId:"+alarm.alarmId());
	       return false;
	     }
	 
	     InputAlarm input = new InputAlarm();
	 
	     input.alarmId(alarm.alarmId());
	 
	     input.objectType(alarm.objectType().value());
	 
	     StringBuffer sb = new StringBuffer();
	     String[] objectName = alarm.objectName();
	     sb.append(this.domain);
	     if (objectName != null) {
	       for (int i = 0; i < objectName.length; i++) {
	         sb.append("=");
	         sb.append(objectName[i]);
	       }
	     }
	     input.objectName(sb.toString());
	 
	     if (alarm.objectType() == ObjectType.OLT){
	       Interface inter = new Interface();
	       inter.oltId(alarm.objectName()[0]);
	       inter.interfaceId("NA-"+alarm.objectName()[1]+"-"+alarm.objectName()[2]+"-"+alarm.objectName()[3]);
	       input.setEquip(inter);
	     }else{
	    	 ONU onu = new ONU();
	    	 onu.oltId(alarm.objectName()[0]);
	    	 onu.name(alarm.objectName()[1]);
	    	 input.setEquip(onu);
	     }
	 
	     input.type(alarm.type().value());
	 
	     input.severity(alarm.severity().value());
	 
	     input.cause(alarm.cause());
	 
	     input.content(alarm.content());
	 
	     input.description(alarm.description());
	 
	     input.time(alarm.time());
	 
	     input.remark(alarm.remark());
	 
	     InputResult result = this.database.raiseAlarm(input);
	 
	     if (!result.result()) {
	    	 WxLogger.flow.info("告警入库失败:" + result.reason()+".告警AlarmId:"+alarm.alarmId());
	       return false;
	     }
	 
	     return true;
	   }
	 
	  
}
