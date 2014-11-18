package com.metarnet.sfpw.test.mgr;

import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.IAlarmMgr;
import com.metarnet.sfpw.test.da.TestDA;

public class TestAlarm implements IAlarmMgr{

	private TestDA testDA;
	
	/**
	 * Spring 注入
	 * @param testDA
	 */
	public void setTestDA(TestDA testDA) {
		this.testDA = testDA;
	}

	public boolean syncMeAlarm(String domain, String meId) throws TaskException {
		
		return false;
	}

	public boolean syncAllAlarm(String domain) throws TaskException {
		System.out.println("TestAlarm.testDA.getAlarm:"+testDA.getAlarm());
		return true;
	}

}
