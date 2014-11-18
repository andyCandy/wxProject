package com.metarnet.sfpw.test.reconnect;

import com.metarnet.sfpw.base.reconnection.ReConnection;
import com.metarnet.sfpw.test.SpringUtil;
import com.metarnet.sfpw.test.da.TestDA;
import com.metarnet.sfpw.test.mgr.TestAlarm;

public class TestReconnect extends ReConnection{

	@Override
	protected boolean reconnect() {
		SpringUtil su = SpringUtil.getInstance();
		TestDA testDA = su.getObject("testDA",TestDA.class);
		if(!testDA.reconnect()){
			return false;
		}
		
		TestAlarm testAlarm = su.getObject("testAlarm",TestAlarm.class);
		
		testAlarm.setTestDA(testDA);
		
		return true;
	}

}
