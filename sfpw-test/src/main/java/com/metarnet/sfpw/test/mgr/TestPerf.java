package com.metarnet.sfpw.test.mgr;

import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.IPerfMgr;
import com.metarnet.sfpw.test.da.TestDA;

public class TestPerf implements IPerfMgr{

	public TestDA testDA ;
	
	
	public void setTestDA(TestDA testDA) {
		this.testDA = testDA;
	}

	public void syncPerf(String meId) throws TaskException {
		
		
		
	}

	public void syncAllPerf() throws TaskException {
		System.out.println("Test");
	}

}
