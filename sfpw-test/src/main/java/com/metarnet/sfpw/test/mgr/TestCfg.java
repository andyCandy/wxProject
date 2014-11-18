package com.metarnet.sfpw.test.mgr;

import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.ICfgMgr;
import com.metarnet.sfpw.test.da.TestDA;

public class TestCfg implements ICfgMgr{
	
	private TestDA testDA ;
	
	/**
	 * Spring 注入
	 * @param testDA
	 */
	public void setTestDA(TestDA testDA) {
		this.testDA = testDA;
	}

	public boolean syncCfg(String domain, String meId) throws TaskException {
		return false;
	}

	public boolean syncAllCfg(String domain) throws TaskException {
		System.out.println("TestCfg.testDA.getCfg:"+testDA.getCfg());
		return false;
	}

	public boolean syncTopo(String domain) throws TaskException {
		return false;
	}

}
