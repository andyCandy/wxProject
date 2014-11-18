package com.metarnet.sfpw.base.mgr;

import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;

public interface IAlarmMgr {

	/**
	 * 同步指定网元当前告警
	 * @param domain
	 * @param meId
	 * @return 告警列表List<ADPAlarm>
	 */
	public boolean syncMeAlarm(String domain, String meId) throws TaskException;
	
	/**
	 * 同步所有当前告警
	 * @param domain
	 * @return
	 */
	public boolean syncAllAlarm(String domain) throws TaskException,ConnectionException;
	
}
 