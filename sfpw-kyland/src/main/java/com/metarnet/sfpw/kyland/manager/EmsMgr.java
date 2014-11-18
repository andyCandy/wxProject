package com.metarnet.sfpw.kyland.manager;

import java.util.ArrayList;
import java.util.List;

import notifications.EventIterator_IHolder;
import notifications.EventList_THolder;
import notifications.PerceivedSeverity_T;

import org.omg.CosNotification.StructuredEvent;




import com.metarnet.sfpw.kyland.driver.KylandCorbaDriver;
import com.metarnet.sfpw.base.util.Config;

import topologicalLink.TopologicalLinkIterator_IHolder;
import topologicalLink.TopologicalLinkList_THolder;
import topologicalLink.TopologicalLink_T;
import multiLayerSubnetwork.MultiLayerSubnetworkMgr_I;
import multiLayerSubnetwork.MultiLayerSubnetwork_T;
import multiLayerSubnetwork.SubnetworkIterator_IHolder;
import multiLayerSubnetwork.SubnetworkList_THolder;
import emsMgr.EMSMgr_I;
import emsMgr.EMS_T;
import emsMgr.EMS_THolder;
import globaldefs.NameAndStringValue_T;
import globaldefs.NamingAttributesIterator_IHolder;
import globaldefs.NamingAttributesList_THolder;
import globaldefs.ProcessingFailureException;
 
 
/**
 * 
 * @author bcmeng
 * 2013年12月12日
 * EmsMgr.java
 * com.metarnet.adapter.manager
 * TODO
 */
public class EmsMgr {

	private Config config;
	private KylandCorbaDriver driver;
	public EmsMgr(KylandCorbaDriver driver,Config config){
		this.config = config;
		this.driver = driver;
	}
	
	
	public EMS_T getEMS() throws ProcessingFailureException{
		EMS_THolder emsInfo = new EMS_THolder();
		
		driver.getEmsMgr().getEMS(emsInfo);
		
		return emsInfo.value;
	}
	
	/**
	 * @TODO 获取顶层拓扑
	 * @return 顶层拓扑连接
	 * @throws ProcessingFailureException
	 */
	private List<TopologicalLink_T> getToptopoList() throws ProcessingFailureException{
		List<TopologicalLink_T> tl = new ArrayList<TopologicalLink_T>();
		TopologicalLinkList_THolder linkListH = new TopologicalLinkList_THolder();
		TopologicalLinkIterator_IHolder remainListH = new TopologicalLinkIterator_IHolder();
		driver.getEmsMgr().getAllTopLevelTopologicalLinks(config.getHowmany(), linkListH, remainListH);
		
		for(TopologicalLink_T topo : linkListH.value){
			tl.add(topo);
		}
		
		if (remainListH.value != null) {
			while (remainListH.value.next_n(config.getIthowmany(), linkListH)) {
				for (int m = 0; m < linkListH.value.length; m++) {
					tl.add(linkListH.value[m]);
				}
			}
		}
		return tl;
	}
	

	private List<NameAndStringValue_T[]> getTopSubnetName() throws ProcessingFailureException{
		List<NameAndStringValue_T[]> snNameList = new ArrayList<NameAndStringValue_T[]>();
		SubnetworkList_THolder list = new SubnetworkList_THolder();
		SubnetworkIterator_IHolder it = new SubnetworkIterator_IHolder();
		driver.getEmsMgr().getAllTopLevelSubnetworks(config.getHowmany(),list,it);
		if (list.value != null) {
			for (MultiLayerSubnetwork_T snName : list.value) {
				snNameList.add(snName.name);
			}
		}
		if (it.value != null) {
			while (it.value.next_n(config.getIthowmany(), list)) {
				for (int m = 0; m < list.value.length; m++) {
					snNameList.add(list.value[m].name);
				}
			}
		}
		return snNameList;
	}


	/**
	 * @TODO 根据子网名，获取子网下拓扑
	 * @param subsys_name 字网名
	 * @return 子网下拓扑
	 * @throws ProcessingFailureException
	 */
	private ArrayList<TopologicalLink_T> getSubTl(NameAndStringValue_T[] subsys_name) throws ProcessingFailureException{
		ArrayList<TopologicalLink_T> linkList = new ArrayList<TopologicalLink_T>();
		TopologicalLinkList_THolder linkListH = new TopologicalLinkList_THolder();
		TopologicalLinkIterator_IHolder remainListH = new TopologicalLinkIterator_IHolder();
		driver.getMultiLayerSubnetworkMgr().getAllTopologicalLinks(subsys_name, config.getHowmany(), linkListH,
				remainListH);
		if(linkListH.value!=null) {
			for (int k = 0; k < linkListH.value.length; k++) {
				linkList.add(linkListH.value[k]);
			}
		}
		if (remainListH.value != null) {
			while(remainListH.value.next_n(config.getIthowmany(), linkListH))
				for (int m = 0; m < linkListH.value.length; m++) {
					linkList.add(linkListH.value[m]);
				}
		}
		return linkList;
	}
	
	/**
	 * @TODO 获取所有拓扑
	 * @return 拓扑列表
	 * @throws ProcessingFailureException
	 */
	public List<TopologicalLink_T> getAllTopoLink() throws ProcessingFailureException{
		
		List<TopologicalLink_T> allTopo = new ArrayList<TopologicalLink_T>();
		List<TopologicalLink_T> topLevel = this.getToptopoList();
		if(topLevel.size()>0){
			System.out.println("toplevel topo size = "+topLevel.size());
			allTopo.addAll(topLevel);
		}
		List<NameAndStringValue_T[]> subnetName = this.getTopSubnetName();
		for (NameAndStringValue_T[] nameAndStringValue_Ts : subnetName) {
			List<TopologicalLink_T> subnetLink = this.getSubTl(nameAndStringValue_Ts);
			allTopo.addAll(subnetLink);
		}
		return allTopo;
	}
	
	/**
	 * @TODO 获取所有的当前告警
	 * @return 告警列表
	 * @throws ProcessingFailureException
	 */
	public List<StructuredEvent> getCurrentAlarm() throws ProcessingFailureException{
		List<StructuredEvent> eventList = new ArrayList<StructuredEvent>();
		String[] excludeProbCauseList = new String[0];
		PerceivedSeverity_T[] excludeSeverityList = new PerceivedSeverity_T[0];

		EventList_THolder list = new EventList_THolder();
		EventIterator_IHolder it = new EventIterator_IHolder();
		driver.getEmsMgr().getAllEMSAndMEActiveAlarms(excludeProbCauseList,
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
	
}
