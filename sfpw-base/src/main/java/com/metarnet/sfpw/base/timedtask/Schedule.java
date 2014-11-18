package com.metarnet.sfpw.base.timedtask;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;

import com.metarnet.sfpw.base.mgr.IAlarmMgr;
import com.metarnet.sfpw.base.mgr.ICfgMgr;
import com.metarnet.sfpw.base.mgr.IPerfMgr;
import com.metarnet.sfpw.base.reconnection.ReConnection;

public class Schedule {

	private SchedulerFactory schedFact;
	private Scheduler sched ;
	
	private ICfgMgr cfgMgr;
	
	private IAlarmMgr alarmMgr;
	
	private IPerfMgr perfMgr;
	
	public String domain;
	
	private ReConnection reconnect;
	
	public Schedule(){};//for test
	
	public Schedule(ICfgMgr cfgMgr,IAlarmMgr alarmMgr,IPerfMgr perfMgr, ReConnection reconnect){
		this.cfgMgr = cfgMgr;
		this.alarmMgr = alarmMgr;
		this.perfMgr = perfMgr;
		this.reconnect = reconnect;
	}
	
	public void init() throws SchedulerException{
		schedFact =  new StdSchedulerFactory();
		sched = schedFact.getScheduler();
		sched.start();
	}
	
	public void startAllTask(List<TaskInDB> tasks){
		
		for (TaskInDB taskInDB : tasks) {
			CronTriggerImpl triger = new CronTriggerImpl();
			TriggerKey key = new TriggerKey(taskInDB.getTaskId());
			triger.setKey(key);
			try {
				triger.setCronExpression(taskInDB.getTaskPeriod());
				triger.setDescription(taskInDB.getTimeDesc());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Class<? extends Job> taskClass = null;
			JobDetail jobDetail = null;
			if(taskInDB.getType() == TaskType.SYNALARM){
				taskClass = AlarmTask.class;
				jobDetail= JobBuilder.newJob(taskClass).build();
				jobDetail.getJobDataMap().put("TaskObject", alarmMgr);
				jobDetail.getJobDataMap().put("domain", domain);
			}else if(taskInDB.getType() == TaskType.SYNPERF){
				taskClass = PerfTask.class;
				jobDetail= JobBuilder.newJob(taskClass).build();
				jobDetail.getJobDataMap().put("TaskObject", perfMgr);
				jobDetail.getJobDataMap().put("domain", domain);
			}else{
				taskClass = ConfTask.class;
				jobDetail= JobBuilder.newJob(taskClass).build();
				jobDetail.getJobDataMap().put("TaskObject", cfgMgr);
				jobDetail.getJobDataMap().put("domain", domain);
				jobDetail.getJobDataMap().put("type", "physical");
			}
			jobDetail.getJobDataMap().put("reconnect", this.reconnect);
			try {
				sched.scheduleJob(jobDetail, triger);
			} catch (SchedulerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void reStartSpecificTask(TaskInDB task){
		try {
			TriggerKey key = new TriggerKey(task.getTaskId());
			CronTriggerImpl trigger = (CronTriggerImpl) sched.getTrigger(key);
			trigger.setCronExpression(task.getTaskPeriod());
			sched.rescheduleJob(key, trigger);
		} catch (SchedulerException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		Schedule sche = new Schedule();
		sche.domain = "test";
		
		List<TaskInDB> tasks = new ArrayList<TaskInDB>();
		TaskInDB taskInDB1 = new TaskInDB("00000000000000000004","东土资源配置同步",
				"0 50 9 * * ?",TaskStatus.ACTIVATED,"kyland_wx_eth",TaskType.SYNHISTORYPERF,"每日3点30分零秒");
		TaskInDB taskInDB2 = new TaskInDB("00000000000000000005","东土告警同步",
				"0 51 9 * * ?",TaskStatus.ACTIVATED,"kyland_wx_eth",TaskType.SYNALARM,"每日4点30分零秒");
		TaskInDB taskInDB3 = new TaskInDB("00000000000000000006","东土性能同步",
				"0 0/2 * * * ?",TaskStatus.ACTIVATED,"kyland_wx_eth",TaskType.SYNPERF,"每2小时");
		tasks.add(taskInDB1);tasks.add(taskInDB2);tasks.add(taskInDB3);
		try {
			sche.init();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		sche.startAllTask(tasks);
		
		try {
			Thread.sleep(1000*60*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TaskInDB taskInDB4 = new TaskInDB("00000000000000000005","东土告警同步",
				"0 55 9 * * ?",TaskStatus.ACTIVATED,"kyland_wx_eth",TaskType.SYNALARM,"每日4点30分零秒");
		
		sche.reStartSpecificTask(taskInDB4);
		
	}
	
}
