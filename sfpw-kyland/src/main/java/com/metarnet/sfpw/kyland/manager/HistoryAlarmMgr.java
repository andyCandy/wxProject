package com.metarnet.sfpw.kyland.manager;

import java.util.ArrayList;
import java.util.List;

import org.omg.CosNotification.StructuredEvent;

import com.metarnet.sfpw.kyland.driver.KylandCorbaDriver;
import com.metarnet.sfpw.base.util.Config;

import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;
import notifications.EventIterator_IHolder;
import notifications.EventList_THolder;
import notifications.PerceivedSeverity_T;


import KYLAND_alarmMgr.KYLAND_alarmMgr_I;

public class HistoryAlarmMgr {

	private Config config;
	private KylandCorbaDriver driver;
	public HistoryAlarmMgr(KylandCorbaDriver driver,Config config){
		this.config = config;
		this.driver = driver;
	}
	
	/**
	 * 
	 * @TODO 获取指定时间范围内的告警
	 * @return List<StructuredEvent>
	 * @param startTime 时间范围的起始点
	 * @param endTime   时间范围的终点
	 * @throws ProcessingFailureException
	 *
	 */
	public List<StructuredEvent> getAllHisAlarm(String startTime,String endTime) throws ProcessingFailureException{
		/**过滤指定原因的告警，此处为空，不过滤*/
		String[] excludeProbCauseList = new String[0];
		/**过滤指定类型的告警，此处为空，不过滤*/
		int[] excludeTypeList = new int[0];
		/**过滤指定等级的告警，此处为空，不过滤*/
		PerceivedSeverity_T[] excludeSeverityList = new PerceivedSeverity_T[0];
		EventList_THolder eventList_THolder = new EventList_THolder();
		EventIterator_IHolder it = new EventIterator_IHolder();
		List<StructuredEvent> eventList = new ArrayList<StructuredEvent>();
		this.driver.getKyland_alarmMgr().getAllHisAlarms(excludeProbCauseList, excludeSeverityList, excludeTypeList, config.getHowmany(), startTime, endTime, eventList_THolder, it);
		if(eventList_THolder.value != null){
			for(StructuredEvent event : eventList_THolder.value){
				eventList.add(event);
			}
		}
		
		if(it.value != null){
			while(it.value.next_n(config.getIthowmany(), eventList_THolder)){
				for(StructuredEvent event : eventList_THolder.value){
					eventList.add(event);
				}
			}
		}
		return eventList;
	}
	
	/**
	 * 
	 * @TODO 获取指定网元下的告警
	 * @return List<StructuredEvent>
	 * @param meName 指定的网元名
	 * @param startTime 时间范围的起始点
	 * @param endTime   时间范围的终点
	 * @throws ProcessingFailureException
	 *
	 */
	public List<StructuredEvent> getMeHisAlarm(NameAndStringValue_T[] meName,String startTime,String endTime) throws ProcessingFailureException{
		String[] excludeProbCauseList = new String[0];
		int[] excludeTypeList = new int[0];
		PerceivedSeverity_T[] excludeSeverityList = new PerceivedSeverity_T[0];
		EventList_THolder eventList_THolder = new EventList_THolder();
		EventIterator_IHolder it = new EventIterator_IHolder();
		List<StructuredEvent> eventList = new ArrayList<StructuredEvent>();
		this.driver.getKyland_alarmMgr().getMEHisAlarms(excludeProbCauseList, excludeSeverityList, excludeTypeList,meName, config.getHowmany(), startTime, endTime, eventList_THolder, it);
		if(eventList_THolder.value != null){
			for(StructuredEvent event : eventList_THolder.value){
				eventList.add(event);
			}
		}
		
		if(it.value != null){
			while(it.value.next_n(config.getIthowmany(), eventList_THolder)){
				for(StructuredEvent event : eventList_THolder.value){
					eventList.add(event);
				}
			}
		}
		return eventList;
	}
	
}
