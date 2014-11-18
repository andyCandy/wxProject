package com.metarnet.sfpw.kyland.manager;

import java.util.ArrayList;
import java.util.List;




import com.metarnet.sfpw.kyland.driver.KylandCorbaDriver;
import com.metarnet.sfpw.base.util.Config;

import terminationPoint.TerminationPointIterator_IHolder;
import terminationPoint.TerminationPointList_THolder;
import terminationPoint.TerminationPoint_T;
import equipment.EquipmentInventoryMgr_I;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

/**
 * 
 * @author bcmeng
 * 2013年12月13日
 * EquipmentMgr.java
 * com.metarnet.adapter.manager
 * TODO
 */
public class EquipmentMgr {

	private Config config;
	private KylandCorbaDriver driver;
	public EquipmentMgr(KylandCorbaDriver driver,Config config){
		this.config = config;
		this.driver = driver;
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
		this.driver.getEquipment().getAllSupportedPTPs(meName, config.getHowmany(), ptpH, remainListH);
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
	
}
