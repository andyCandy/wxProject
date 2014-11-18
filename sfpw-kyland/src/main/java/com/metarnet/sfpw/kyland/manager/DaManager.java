package com.metarnet.sfpw.kyland.manager;

import emsMgr.EMSMgr_I;
import emsMgr.EMS_T;
import emsMgr.EMS_THolder;
import equipment.EquipmentInventoryMgr_I;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

import java.util.ArrayList;
import java.util.List;

import managedElement.ManagedElementIterator_IHolder;
import managedElement.ManagedElementList_THolder;
import managedElement.ManagedElement_T;
import managedElement.ManagedElement_THolder;
import managedElementManager.ManagedElementMgr_I;
import multiLayerSubnetwork.MultiLayerSubnetworkMgr_I;
import multiLayerSubnetwork.MultiLayerSubnetwork_T;
import multiLayerSubnetwork.SubnetworkIterator_IHolder;
import multiLayerSubnetwork.SubnetworkList_THolder;
import notifications.EventIterator_IHolder;
import notifications.EventList_THolder;
import notifications.PerceivedSeverity_T;

import org.omg.CosNotification.StructuredEvent;

import com.metarnet.sfpw.kyland.driver.KylandCorbaDriver;
import com.metarnet.sfpw.base.util.Config;

import performance.PMDataIterator_IHolder;
import performance.PMDataList_THolder;
import performance.PMData_T;
import performance.PMTPSelect_T;
import performance.PerformanceManagementMgr_I;
import terminationPoint.TerminationPointIterator_IHolder;
import terminationPoint.TerminationPointList_THolder;
import terminationPoint.TerminationPoint_T;
import topologicalLink.TopologicalLinkIterator_IHolder;
import topologicalLink.TopologicalLinkList_THolder;
import topologicalLink.TopologicalLink_T;
import KYLAND_pmMgr.KYLAND_pmMgr_I;


public class DaManager {
	private EMSMgr_I emsMgr;
	private MultiLayerSubnetworkMgr_I snMgr;
	private EquipmentInventoryMgr_I equipmentMgr; 
	private ManagedElementMgr_I managedElementMgr;
	private PerformanceManagementMgr_I portPerfMgr;
	private KYLAND_pmMgr_I mePerfMgr;
	private Config config;
	public DaManager(KylandCorbaDriver driver,Config config){
		this.config = config;
		setter(driver);
	}
	
	public void setter(KylandCorbaDriver driver){
		this.emsMgr = driver.getEmsMgr();
		this.snMgr = driver.getMultiLayerSubnetworkMgr();
		this.equipmentMgr = driver.getEquipment();
		this.managedElementMgr = driver.getManageElementMgr();
		this.portPerfMgr = driver.getPerformanceMgr();
		this.mePerfMgr = driver.getKyland_pmMgr();
	}
	
	public EMS_T getEMS() throws ProcessingFailureException{
		EMS_THolder emsInfo = new EMS_THolder();
		
		emsMgr.getEMS(emsInfo);
		
		return emsInfo.value;
	}
	
	/**
	 * @TODO 获取顶层拓扑
	 * @return 顶层拓扑连接
	 * @throws ProcessingFailureException
	 */
	private List<TopologicalLink_T> getToptopoList(){
		List<TopologicalLink_T> tl = new ArrayList<TopologicalLink_T>();
		TopologicalLinkList_THolder linkListH = new TopologicalLinkList_THolder();
		TopologicalLinkIterator_IHolder remainListH = new TopologicalLinkIterator_IHolder();
		
		try {
			emsMgr.getAllTopLevelTopologicalLinks(config.getHowmany(), linkListH, remainListH);
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
		} catch (ProcessingFailureException e) {
			
			e.printStackTrace();
		}
		
		
	
		return tl;
	}
	

	private List<NameAndStringValue_T[]> getTopSubnetName() throws ProcessingFailureException{
		List<NameAndStringValue_T[]> snNameList = new ArrayList<NameAndStringValue_T[]>();
		SubnetworkList_THolder list = new SubnetworkList_THolder();
		SubnetworkIterator_IHolder it = new SubnetworkIterator_IHolder();
		emsMgr.getAllTopLevelSubnetworks(config.getHowmany(),list,it);
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
		snMgr.getAllTopologicalLinks(subsys_name, config.getHowmany(), linkListH,
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
		
		List<TopologicalLink_T> allTopo = this.getToptopoList();
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
		emsMgr.getAllEMSAndMEActiveAlarms(excludeProbCauseList,
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
	 * @TODO 获取指定网元下所有端口
	 * @return List<TerminationPoint_T> 端口列表
	 * @param meName 网元名
	 * @throws ProcessingFailureException
	 *
	 */
	public List<TerminationPoint_T> getAllPTPs(NameAndStringValue_T[] meName) throws ProcessingFailureException{
		TerminationPointList_THolder ptpH = new TerminationPointList_THolder();
		TerminationPointIterator_IHolder remainListH = new TerminationPointIterator_IHolder();
		this.equipmentMgr.getAllSupportedPTPs(meName, config.getHowmany(), ptpH, remainListH);
		List<TerminationPoint_T> ptpList = new ArrayList<TerminationPoint_T>();
		if(ptpH.value != null){
			for(TerminationPoint_T ptp : ptpH.value){
				ptpList.add(ptp);
			}
		}
		if(remainListH.value != null){
			while(remainListH.value.next_n(config.getIthowmany(), ptpH)){
				for(TerminationPoint_T ptp : ptpH.value){
					ptpList.add(ptp);
				}
			}
		}
		return ptpList;
	}
	
	public List<NameAndStringValue_T[]> getAllPTPNames(NameAndStringValue_T[] meName) throws ProcessingFailureException{
		List<NameAndStringValue_T[]> result = new ArrayList<NameAndStringValue_T[]>();
		List<TerminationPoint_T> ptps = this.getAllPTPs(meName);
		for (TerminationPoint_T terminationPoint_T : ptps) {
			result.add(terminationPoint_T.name);
		}
		return result;
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
		managedElementMgr.getAllManagedElements(config.getHowmany(), list, it);
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
		
		this.managedElementMgr.getManagedElement(meName, managedElement_THolder);
		
		return managedElement_THolder.value;
	}
	
	public List<StructuredEvent> getMECurrentAlarm(NameAndStringValue_T[][] meName) throws ProcessingFailureException{
		List<StructuredEvent> eventList = new ArrayList<StructuredEvent>();
		String[] excludeProbCauseList = new String[0];
		PerceivedSeverity_T[] excludeSeverityList = new PerceivedSeverity_T[0];

		EventList_THolder list = new EventList_THolder();
		EventIterator_IHolder it = new EventIterator_IHolder();
		this.managedElementMgr.getActiveAlarms(meName,excludeProbCauseList,
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
		managedElementMgr.getAllManagedElements(config.getHowmany(), list, it);
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
	/**
	 * 
	 * @TODO 获取指定网元列表的网元性能
	 * @return List<PMData_T>
	 * @param selectedMes
	 * @return
	 * @throws ProcessingFailureException
	 *
	 */
	public List<PMData_T> getMePerf(List<NameAndStringValue_T[]> selectedMes ) throws ProcessingFailureException{
		/**设备列表*/
		PMTPSelect_T[] pmSelects ;
		if(selectedMes==null||selectedMes.size()==0){
			pmSelects = new PMTPSelect_T[0];
		}else{
			pmSelects = new PMTPSelect_T[selectedMes.size()];
			for (int i = 0;i<pmSelects.length;i++) {
				PMTPSelect_T temp = new PMTPSelect_T();
				temp.name = selectedMes.get(i);
				temp.layerRateList = new short[]{11};
				temp.pMLocationList = new String[]{};
				temp.granularityList = new String[]{"15min"};
				pmSelects[i] = temp;
				
			}
		}
		PMDataList_THolder pmList = new PMDataList_THolder();
		PMDataIterator_IHolder pmit = new PMDataIterator_IHolder();
		mePerfMgr.getAllCurrentPMData(pmSelects, config.getHowmany(), pmList, pmit);
		
		List<PMData_T> resultList = new ArrayList<PMData_T>();
		if(pmList!=null){
			for (PMData_T pmData_T : pmList.value) {
				resultList.add(pmData_T);
			}
		}
		if(pmit.value!=null){
			while(pmit.value.next_n(config.getIthowmany(), pmList)){
				for (PMData_T pmData_T : pmList.value) {
					resultList.add(pmData_T);
				}
			}
		}
		return resultList;
	}
	
	/**
	 * 
	 * @TODO 获取指定端口列表的端口性能
	 * @return List<PMData_T>
	 * @param selectedMes
	 * @return
	 * @throws ProcessingFailureException
	 *
	 */
	public List<PMData_T> getPortPerf(List<NameAndStringValue_T[]> selectedPorts ) throws ProcessingFailureException{
		PMTPSelect_T[] pmSelects ;
		if(selectedPorts==null){
			pmSelects = new PMTPSelect_T[0];
		}
		else{
			pmSelects = new PMTPSelect_T[selectedPorts.size()];
			for (int i = 0;i<pmSelects.length;i++) {
				pmSelects[i].name = selectedPorts.get(i);
			}
		}
		String[] pmParams = new String[]{"ifIndex","ifDescr","ifOperstatus","ifInOctets","ifInUcastPkts",
				"IfInNUcastPKts","ifOutOctets","ifOutUcastPkts","ifOutNUcastPkts"};
		PMDataList_THolder pmList = new PMDataList_THolder();
		PMDataIterator_IHolder pmit = new PMDataIterator_IHolder();
		this.portPerfMgr.getAllCurrentPMData(pmSelects, pmParams, config.getHowmany(), pmList, pmit);
		
		List<PMData_T> resultList = new ArrayList<PMData_T>();
		if(pmList!=null&&pmList.value!=null){
			for (PMData_T pmData_T : pmList.value) {
				resultList.add(pmData_T);
			}
		}
		if(pmit.value!=null){
			while(pmit.value.next_n(config.getIthowmany(), pmList)){
				for (PMData_T pmData_T : pmList.value) {
					resultList.add(pmData_T);
				}
			}
		}
	
		return resultList;
	}
}
