package com.metarnet.sfpw.kyland.reconnect;

import com.metarnet.sfpw.base.reconnection.ReConnection;
import com.metarnet.sfpw.kyland.driver.KylandCorbaDriver;

public class KylandReconnect extends ReConnection{

	private KylandCorbaDriver driver;
	
	
	
	public void setDriver(KylandCorbaDriver driver) {
		this.driver = driver;
	}



	@Override
	protected boolean reconnect() {
		boolean result = false;
		try{
			result = driver.reConnect();
		}catch(Exception e){
			System.out.println("重连异常："+e.getMessage());
			result = false;
		}
		return result;
	}

}
