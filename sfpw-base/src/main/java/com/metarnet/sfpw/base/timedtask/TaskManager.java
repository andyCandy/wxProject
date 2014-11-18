package com.metarnet.sfpw.base.timedtask;

import java.util.List;

import org.quartz.SchedulerException;

import com.metarnet.service.ServiceException;
import com.metarnet.sfpw.base.database.ITaskDatabase;
import com.metarnet.sfpw.base.mgr.IAlarmMgr;
import com.metarnet.sfpw.base.mgr.ICfgMgr;
import com.metarnet.sfpw.base.mgr.IPerfMgr;
import com.metarnet.sfpw.base.reconnection.ReConnection;
import com.metarnet.sfpw.base.util.IConfig;
import com.metarnet.sfpw.base.util.WxLogger;

public class TaskManager {

	
	private ITaskDatabase database;
	
	private ICfgMgr cfgMgr;
	
	private IAlarmMgr alarmMgr;
	
	private IPerfMgr perfMgr;
	
	private Thread dbThread;
	
	private IConfig config;
	
	private String domain;
	
	private Schedule sche ;
	
	private ReConnection reconnect;
	
	private List<TaskInDB> currentTasks;
	
	
	
	public void setDatabase(ITaskDatabase database) {
		this.database = database;
	}

	public void setCfgMgr(ICfgMgr cfgMgr) {
		this.cfgMgr = cfgMgr;
	}

	public void setAlarmMgr(IAlarmMgr alarmMgr) {
		this.alarmMgr = alarmMgr;
	}

	public void setReconnect(ReConnection reconnect) {
		this.reconnect = reconnect;
	}

	public void setPerfMgr(IPerfMgr perfMgr) {
		this.perfMgr = perfMgr;
	}
	
	
	
	public void setConfig(IConfig config) {
		this.config = config;
	}

	public void doInit() throws ServiceException {
		
		this.domain = config.getDomain();
		sche = new Schedule(cfgMgr, alarmMgr, perfMgr,reconnect);
		sche.domain = domain;
		try {
			sche.init();
		} catch (SchedulerException e1) {
			throw new ServiceException("任务启动失败。。。");
		}
		
		dbThread = new Thread(){
			
			public void run(){
				
				while(true){
					
					try {
						Thread.sleep(1000*30);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
					List<TaskInDB> newTask = database.getTasks(domain);
					compare(newTask);
					
				}
			}
			
			
		};
		
	}

	public void doStart() throws ServiceException {
		this.doInit();
		currentTasks = this.database.getTasks(domain);
		sche.startAllTask(currentTasks);
		dbThread.start();
		WxLogger.init.info("任务管理启动成功");
	}


	/**
	 * 比较数据库里的和当前任务
	 * 有新任务就更新，并根据新任务重新安排任务
	 * @param newTasks
	 */
	public void compare(List<TaskInDB> newTasks){
		for(TaskInDB currentTask : currentTasks){
			for (TaskInDB newTask : newTasks) {
				if(currentTask.isUpdate(newTask)){
					currentTask.updateTask(newTask);
					sche.reStartSpecificTask(newTask);
				}
			}
		}
	}
}
