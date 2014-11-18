package com.metarnet.sfpw.base.timedtask;

import java.util.Date;













import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.ICfgMgr;
import com.metarnet.sfpw.base.reconnection.ReConnection;
import com.metarnet.sfpw.base.util.WxLogger;
public class ConfTask implements Job{



	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println(new Date()+":同步拓扑开始");
		ReConnection reconnect = (ReConnection)context.getJobDetail().getJobDataMap().get("reconnect");
		ICfgMgr cfg = (ICfgMgr)context.getJobDetail().getJobDataMap().get("TaskObject");
		String domain = (String)context.getJobDetail().getJobDataMap().get("domain");
		//本来是根据type来分别同步物理和拓扑，现在全部同步，type不需要了
		String type = (String)context.getJobDetail().getJobDataMap().get("type");
			
		try {
			cfg.syncAllCfg(domain);
		} catch (TaskException e) {
			WxLogger.flow.error(String.format("执行配置跟新任务失败，原因:%s,%s",e.getReason(),e.getMessage()),e);
		} catch (ConnectionException e) {
			WxLogger.flow.error(String.format("执行配置跟新任务失败，原因:%s,%s","可能是连接异常",e.getMessage()),e);
			reconnect.notifyDisconnect();
		}
		System.out.println(new Date()+":同步物理资源完成:"+domain);
		try {
			cfg.syncTopo(domain);
		} catch (TaskException e) {
			WxLogger.flow.error(String.format("执行拓扑跟新任务失败，原因:%s,%s",e.getReason(),e.getMessage()),e);
		} catch (ConnectionException e) {
			WxLogger.flow.error(String.format("执行拓扑跟新任务失败，原因:%s,%s","可能是连接异常",e.getMessage()),e);
			reconnect.notifyDisconnect();
		}
		System.out.println(new Date()+":同步拓扑完成");
		
	}
	
}
