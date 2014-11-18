package com.metarnet.sfpw.hw.reconnect;

import com.metarnet.sfpw.base.reconnection.ReConnection;
import com.metarnet.sfpw.hw.SpringUtil;
import com.metarnet.sfpw.hw.da.EponOper;
import com.metarnet.sfpw.hw.driver.EponSocket;

public class HwReconnection extends ReConnection{

	private EponOper oper ;
	
	
	
	public void setOper(EponOper oper) {
		this.oper = oper;
	}



	@Override
	protected boolean reconnect() {
		
		return oper.reConnect();
		
	}

}
