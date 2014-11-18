package com.metarnet.sfpw.kyland.driver;

import java.util.ArrayList;
import java.util.List;

import performance.PMDataIterator_IHolder;
import performance.PMDataList_THolder;
import performance.PMData_T;
import performance.PMTPSelect_T;
import performance.PerformanceManagementMgr_I;
import managedElement.ManagedElementIterator_IHolder;
import managedElement.ManagedElementList_THolder;
import managedElement.ManagedElement_T;
import managedElementManager.ManagedElementMgr_I;
import KYLAND_pmMgr.KYLAND_pmMgr_I;

import com.metarnet.service.ServiceException;
import com.metarnet.sfpw.kyland.manager.Reporter;
import com.metarnet.sfpw.base.util.Config;
import com.metarnet.util.XPathConfManager;

import emsMgr.EMSMgr_I;
import emsMgr.EMS_THolder;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;


public class TestDriver {
	
	private KylandCorbaDriver driver;
	
	public void beforeClass(){
		try {
//			XPathConfManager.createManager("conf/config_kyland_corba.xml");
			Config config = new Config();
			config.readCfg();
			driver = new KylandCorbaDriver();
			driver.setConfig(config);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean testCon() throws ServiceException{
		
		driver.setReporter(new Reporter());
		driver.init();
		
			
		return true;
		
	}
	
	public void testData(){
		EMSMgr_I t = driver.getEmsMgr();
		EMS_THolder holder = new EMS_THolder();
		try {
			t.getEMS(holder);
			NameAndStringValue_T[] nv = holder.value.name;
			for (int i = 0; i < nv.length; i++) {
				System.out.println(nv[i].name+":"+nv[i].value);
			}
		} catch (ProcessingFailureException e) {
			System.out.println("取数据失败");
			e.printStackTrace();
		}
	}
	
	public void testPm() throws ProcessingFailureException{
		//获取网元管理器
		ManagedElementMgr_I managedElementMgr = driver.getManageElementMgr();
		PerformanceManagementMgr_I portPerfMgr = driver.getPerformanceMgr();
		//用于存放所有获取的网元的Name
		List<NameAndStringValue_T[]> resultNames = new ArrayList<NameAndStringValue_T[]>();
		ManagedElementList_THolder list = new ManagedElementList_THolder();
		ManagedElementIterator_IHolder it = new ManagedElementIterator_IHolder();
		managedElementMgr.getAllManagedElements(50, list, it);
		if (list.value != null) {
			for (ManagedElement_T dev : list.value) {
				resultNames.add(dev.name);
				
			}
		}
		if (it.value != null) {
			while (it.value.next_n(50, list)) {
				for (int m = 0; m < list.value.length; m++) {
					resultNames.add(list.value[m].name);
				}
			}
		}
		//获取性能管理器
		KYLAND_pmMgr_I pm = driver.getKyland_pmMgr();
		//用网元名构造getAllCurrentPMData的参数
		PMTPSelect_T[] pmSelects ;
		if(resultNames==null||resultNames.size()==0){
			pmSelects = new PMTPSelect_T[0];
		}else{
			pmSelects = new PMTPSelect_T[resultNames.size()];
			for (int i = 0;i<pmSelects.length;i++) {
				PMTPSelect_T temp = new PMTPSelect_T();
				temp.name = resultNames.get(i);
				temp.layerRateList = new short[]{11};
				temp.pMLocationList = new String[]{};
				temp.granularityList = new String[]{"15min"};
				pmSelects[i] = temp;
				
			}
		}
		PMDataList_THolder pmList = new PMDataList_THolder();
		PMDataIterator_IHolder pmit = new PMDataIterator_IHolder();
		pm.getAllCurrentPMData(pmSelects, 50, pmList, pmit);
	
		
		List<PMData_T> resultList = new ArrayList<PMData_T>();
		if(pmList!=null){
			for (PMData_T pmData_T : pmList.value) {
				resultList.add(pmData_T);
			}
		}
		if(pmit.value!=null){
			while(pmit.value.next_n(50, pmList)){
				for (PMData_T pmData_T : pmList.value) {
					resultList.add(pmData_T);
				}
			}
		}
		
		for (int i = 0; i < resultList.size(); i++) {
			System.out.println(resultList.get(i).pmMeasurementList);
		}
	}
	
	public static void main(String[] args) throws ServiceException {
		TestDriver test = new TestDriver();
		test.beforeClass();
		
		if(test.testCon()){
			try {
				test.testPm();
			} catch (ProcessingFailureException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
