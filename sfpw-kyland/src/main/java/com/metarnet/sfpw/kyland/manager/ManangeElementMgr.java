package com.metarnet.sfpw.kyland.manager;

import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

import java.util.ArrayList;
import java.util.List;

import notifications.EventIterator_IHolder;
import notifications.EventList_THolder;
import notifications.PerceivedSeverity_T;

import org.omg.CosNotification.StructuredEvent;




import com.metarnet.sfpw.kyland.driver.KylandCorbaDriver;
import com.metarnet.sfpw.base.util.Config;

import managedElement.ManagedElementIterator_IHolder;
import managedElement.ManagedElementList_THolder;
import managedElement.ManagedElement_T;
import managedElement.ManagedElement_THolder;
import managedElementManager.ManagedElementMgr_I;

/**
 * 
 * @author bcmeng
 * 2013年12月13日
 * ManangeElementMgr.java
 * com.metarnet.adapter.manager
 * TODO
 */
public class ManangeElementMgr {

	private KylandCorbaDriver driver;
	private Config config;
	public ManangeElementMgr(KylandCorbaDriver driver,Config config){
		this.config = config;
		this.driver = driver;
	}
	
	/**
	 * 
	 * @TODO 获取所有的网元
	 * @return List<ManagedElement_T>
	 * @throws ProcessingFailureException
	 *
	 */
	public List<ManagedElement_T> getManagedElementList() throws ProcessingFailureException{
		List<ManagedElement_T> devList = new ArrayList<ManagedElement_T>();
		ManagedElementList_THolder list = new ManagedElementList_THolder();
		ManagedElementIterator_IHolder it = new ManagedElementIterator_IHolder();
		driver.getManageElementMgr().getAllManagedElements(config.getHowmany(), list, it);
		if (list.value != null) {
			for (ManagedElement_T dev : list.value) {
				devList.add(dev);
				
			}
		}
		if (it.value != null) {
			while (it.value.next_n(config.getIthowmany(), list)) {
				for (int m = 0; m < list.value.length; m++) {
					devList.add(list.value[m]);
				}
			}
		}
		return devList;
	}
	
	/**
	 * 
	 * @TODO 获取指定的网元
	 * @return ManagedElement_T
	 * @param meName 指定的网元名
	 * @throws ProcessingFailureException
	 *
	 */
	public ManagedElement_T getManagedElement(NameAndStringValue_T[] meName ) throws ProcessingFailureException{
		
		ManagedElement_THolder managedElement_THolder = new ManagedElement_THolder();
		
		this.driver.getManageElementMgr().getManagedElement(meName, managedElement_THolder);
		
		return managedElement_THolder.value;
	}
	
	public List<StructuredEvent> getMECurrentAlarm(NameAndStringValue_T[][] meName) throws ProcessingFailureException{
		List<StructuredEvent> eventList = new ArrayList<StructuredEvent>();
		String[] excludeProbCauseList = new String[0];
		PerceivedSeverity_T[] excludeSeverityList = new PerceivedSeverity_T[0];

		EventList_THolder list = new EventList_THolder();
		EventIterator_IHolder it = new EventIterator_IHolder();
		this.driver.getManageElementMgr().getActiveAlarms(meName,excludeProbCauseList,
				excludeSeverityList, config.getHowmany(), list, it);
		if (list.value != null) {
			for (StructuredEvent event : list.value) {
				eventList.add(event);
			}
		}

		if (it.value != null) {
			while(it.value.next_n(config.getIthowmany(), list)){
				for (StructuredEvent event : list.value) {
					eventList.add(event);
				}
			}
		}
		return eventList;
	}
	
	/**
	 * 
	 * @TODO 获取所有设备名称
	 * @return List<NameAndStringValue_T[]>
	 * @return
	 * @throws ProcessingFailureException
	 *
	 */
	public List<NameAndStringValue_T[]> getAllManagedElementNames() throws ProcessingFailureException{
		List<NameAndStringValue_T[]> resultNames = new ArrayList<NameAndStringValue_T[]>();
		ManagedElementList_THolder list = new ManagedElementList_THolder();
		ManagedElementIterator_IHolder it = new ManagedElementIterator_IHolder();
		driver.getManageElementMgr().getAllManagedElements(config.getHowmany(), list, it);
		if (list.value != null) {
			for (ManagedElement_T dev : list.value) {
				resultNames.add(dev.name);
				
			}
		}
		if (it.value != null) {
			while (it.value.next_n(config.getIthowmany(), list)) {
				for (int m = 0; m < list.value.length; m++) {
					resultNames.add(list.value[m].name);
				}
			}
		}
		
		return resultNames;
	}
}
