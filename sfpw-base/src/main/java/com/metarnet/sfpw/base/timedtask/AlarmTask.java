package com.metarnet.sfpw.base.timedtask;


import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.IAlarmMgr;
import com.metarnet.sfpw.base.reconnection.ReConnection;
import com.metarnet.sfpw.base.util.WxLogger;

public class AlarmTask implements Job{

	
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		ReConnection reconnect = null;
		System.out.println(new Date()+"：同步告警开始");
		try{
			reconnect = (ReConnection)context.getJobDetail().getJobDataMap().get("reconnect");
			IAlarmMgr notifyMgr = (IAlarmMgr)context.getJobDetail().getJobDataMap().get("TaskObject");
			String domain = (String)context.getJobDetail().getJobDataMap().get("domain");
			notifyMgr.syncAllAlarm(domain);
			System.out.println(new Date()+"：同步告警完成");
		}catch(TaskException e){
			WxLogger.flow.error(e.getMessage()+":"+e.getReason(),e);
			System.out.println(String.format("执行告警任务失败，原因:%s",e.getMessage()));
			System.out.println("重连状态："+reconnect.getConnectState());
		}catch(ConnectionException e){
			WxLogger.flow.error(e.getMessage(),e);
			System.out.println(String.format("执行告警任务失败，原因:%s",e.getMessage()));
			System.out.println("重连状态："+reconnect.getConnectState());
			reconnect.notifyDisconnect();
		}
		
	}

}
