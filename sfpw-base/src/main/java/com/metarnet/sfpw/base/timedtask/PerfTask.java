package com.metarnet.sfpw.base.timedtask;


import java.util.Date;
import java.util.TimerTask;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.IPerfMgr;
import com.metarnet.sfpw.base.reconnection.ReConnection;
import com.metarnet.sfpw.base.util.WxLogger;

public class PerfTask implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println(new Date()+":同步性能资源开始");
		ReConnection reconnect = (ReConnection)context.getJobDetail().getJobDataMap().get("reconnect");
		IPerfMgr perfMgr = (IPerfMgr)context.getJobDetail().getJobDataMap().get("TaskObject");
		try {
			perfMgr.syncAllPerf();
		} catch (TaskException e) {
			WxLogger.flow.error(String.format("执行查询任务失败，原因:%s,%s",e.getReason(),e.getMessage()),e);
		} catch (ConnectionException e) {
			WxLogger.flow.error(String.format("执行查询任务失败，原因:%s,%s","可能是连接断开了",e.getMessage()),e);
			reconnect.notifyDisconnect();
		}
		System.out.println(new Date()+":同步性能资源完成");
		
	}

}
