package com.metarnet.sfpw.base.mgr;

import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;


public interface IPerfMgr {

	
	/**
	 * 
	 * @TODO 同步某一台设备以及其下端口性能
	 * @return void
	 * @param meId   设备id
	 *
	 */
	public void syncPerf(String meId) throws TaskException;
	
	
	/**
	 * 
	 * @TODO 同步所有设备以及其下端口性能
	 * @return void
	 * @throws ConnectionException 
	 *
	 */
	public void syncAllPerf() throws TaskException, ConnectionException;
	
	
	
}
