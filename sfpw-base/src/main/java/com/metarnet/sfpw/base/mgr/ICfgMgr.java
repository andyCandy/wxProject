package com.metarnet.sfpw.base.mgr;

import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;



public interface ICfgMgr {

	/**
	 * 同步指定网元及所属端口
	 * @param domain
	 * @param meId
	 * @return boolean
	 */
	public boolean syncCfg(String domain, String meId) throws TaskException ;
	
	/**
	 * 同步所有网元及所属端口
	 * @param domain
	 * @return
	 * @throws ConnectionException 
	 */
	public boolean syncAllCfg(String domain) throws TaskException, ConnectionException;
	
	/**
	 * 同步所有拓扑
	 * @param domain
	 * @return
	 */
	public boolean syncTopo(String domain) throws TaskException,ConnectionException;

	/**
	 * 更新端口去向
	 * @param domain
	 */
	public void updatePortToEquip(String domain);
	
	
}
