package com.metarnet.sfpw.kyland.manager;


import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

import java.util.ArrayList;
import java.util.List;

import performance.PMDataIterator_IHolder;
import performance.PMDataList_THolder;
import performance.PMData_T;
import performance.PMTPSelect_T;
import performance.PerformanceManagementMgr_I;
import KYLAND_pmMgr.KYLAND_pmMgr_I;

import com.metarnet.sfpw.kyland.driver.KylandCorbaDriver;
import com.metarnet.sfpw.base.util.Config;

public class PerformanceMgr {

	
	private Config config;
	
	private KylandCorbaDriver driver;
	
	public PerformanceMgr(KylandCorbaDriver driver,Config config){
		this.config = config;
		this.driver = driver;
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
		driver.getKyland_pmMgr().getAllCurrentPMData(pmSelects, config.getHowmany(), pmList, pmit);
		
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
				PMTPSelect_T temp = new PMTPSelect_T();
				temp.name = selectedPorts.get(i);
				temp.layerRateList = new short[]{11};
				temp.pMLocationList = new String[]{};
				temp.granularityList = new String[]{"15min"};
				pmSelects[i] = temp;
			}
		}
		String[] pmParams = new String[]{"ifIndex","ifDescr","ifOperStatus","ifInOctets","ifInUcastPkts","ifInNUcastPkts","ifOutOctets","ifOutUcastPkts","ifOutNUcastPkts"};
//		String[] pmParams = { 	"ifIndex", "ifInOctets",
//								"ifInUcastPkts", "ifOutOctets"};
		PMDataList_THolder pmList = new PMDataList_THolder();
		PMDataIterator_IHolder pmit = new PMDataIterator_IHolder();
		this.driver.getPerformanceMgr().getAllCurrentPMData(pmSelects, pmParams, config.getHowmany(), pmList, pmit);
		
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
