package com.metarnet.sfpw.base.timedtask;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskInDB {

	
	private String taskId;
	private String taskName;
	private String taskPeriod;
	private TaskStatus isActivated;
	private String performer;
	private TaskType type;
	private String timeDesc;
	
	public TaskInDB(){}
	
	public TaskInDB(String taskId, String taskName, String taskPeriod,
			TaskStatus isActivated, String performer, TaskType type,
			String timeDesc) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskPeriod = taskPeriod;
		this.isActivated = isActivated;
		this.performer = performer;
		this.type = type;
		this.timeDesc = timeDesc;
	}

	public String getTaskId() {
		return taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public String getTaskPeriod() {
		return taskPeriod;
	}

	public TaskStatus getIsActivated() {
		return isActivated;
	}

	public String getPerformer() {
		return performer;
	}

	public TaskType getType() {
		return type;
	}

	public String getTimeDesc() {
		return timeDesc;
	}

	public void setValue(ResultSet rs) throws SQLException{
		
		this.taskId = rs.getString("task_id");
		this.taskName = rs.getString("task_name");
		this.taskPeriod = rs.getString("task_period");
		this.isActivated = TaskStatus.fromValue(rs.getInt("isactivated"));
		this.performer = rs.getString("performer");
		this.type = TaskType.fromValue(rs.getInt("task_type"));
		this.timeDesc = rs.getString("time_display");
		
	}

	@Override
	public String toString() {
		return "TaskInDB [taskId=" + taskId + ", taskName=" + taskName
				+ ", taskPeriod=" + taskPeriod + ", isActivated=" + isActivated
				+ ", performer=" + performer + ", type=" + type + ", timeDesc="
				+ timeDesc + "]";
	}
	
	/**
	 * 比较是否是相同任务，根据任务id判断
	 * @param anotherTask
	 * @return
	 */
	public boolean isSameTask(TaskInDB anotherTask){
		if(this.taskId.equals(anotherTask.taskId))
			return true;
		return false;
	}
	
	/**
	 * 比较任务是否更新，根据taskPeriod（任务安排）比较
	 * @param anotherTask
	 * @return
	 */
	public boolean isEqual(TaskInDB anotherTask){
		if(this.taskPeriod.equals(anotherTask.taskPeriod))
			return true;
		return false;
		
	}
	
	/**
	 * 比较两个任务
	 * 是同个任务并且任务已更新返回false
	 * 不是同个任务，或是同个任务，但任务没更新返回true
	 * @param anotherTask
	 * @return
	 */
	public boolean isUpdate(TaskInDB anotherTask){
		if(isSameTask(anotherTask)){
			if(isEqual(anotherTask)){
				return false;
			}
			return true;
		}
		return false;
	}
	
	/**
	 * 更新任务
	 * 通过更新任务的时间安排和时间安排描述来更新任务
	 * @param newTask
	 */
	public void updateTask(TaskInDB newTask){
		this.taskPeriod = newTask.taskPeriod;
		this.timeDesc = newTask.timeDesc;
	}
	
}
