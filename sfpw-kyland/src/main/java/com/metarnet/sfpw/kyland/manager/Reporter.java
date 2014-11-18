package com.metarnet.sfpw.kyland.manager;

import org.omg.CosEventComm.Disconnected;
import org.omg.CosNotification.EventType;
import org.omg.CosNotification.StructuredEvent;
import org.omg.CosNotifyComm.InvalidEventType;
import org.omg.CosNotifyComm.StructuredPushConsumerOperations;

import com.metarnet.adapter.model.ADPAlarm;
import com.metarnet.adapter.model.ALMSeverity;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.base.database.IDatabase;
import com.metarnet.sfpw.base.util.Config;
import com.metarnet.sfpw.kyland.util.Converter;

public class Reporter implements StructuredPushConsumerOperations{

	private final String alarmEvent        = "NT_ALARM";
	private final String heartBeatEvent    = "NT_HEARTBEAT";
	private final String objectCreatEvent  = "NT_OBJECT_CREATION";
	private final String objectDeleteEvent = "NT_OBJECT_DELETION";
	
	private Config config ;
	
	private IDatabase database;
	
	public void setConfig(Config config) {
		this.config = config;
	}

	public void setDatabase(IDatabase database) {
		this.database = database;
	}



	public void offer_change(EventType[] arg0, EventType[] arg1)
			throws InvalidEventType {
		// TODO Auto-generated method stub
		
	}

	public void disconnect_structured_push_consumer() {
		// TODO Auto-generated method stub
		
	}

	/**
	 *网管推事件时触发此方法，用来处理网管推过来的事件
	 */
	public void push_structured_event(StructuredEvent event) throws Disconnected {
		String type = event.header.fixed_header.event_type.type_name;
		System.out.println("shi jian fa sheng");
		if(alarmEvent.equals(type)){
			System.out.println("告警上报。。。");
			ADPAlarm alarm = Converter.convertSingleAlarm(event);
			for (int i = 0; i < event.filterable_data.length; i++) {
				
				WxLogger.event.info(event.filterable_data[i].name+":"+event.filterable_data[i].value);
			}
			if(alarm.getSeverity().name().equals(ALMSeverity.CLEARED.name())){
				System.out.println("清除告警");
				System.out.println(config.getDomain()+":"+alarm.getAlarmId());
				database.clearAlarm(config.getDomain(), alarm);
			}else{
				database.raiseAlarm(config.getDomain(), alarm);
			}
		}else if(heartBeatEvent.equals(type)){
			System.out.println("心跳事件");
			//处理心跳事件
		}else if(objectCreatEvent.equals(type)){
			//处理对象创建事件
			System.out.println("object create");
		}else if(objectDeleteEvent.equals(type)){
			System.out.println("object delete");
		}else{
			//处理未知事件
		}
		
	}
}
