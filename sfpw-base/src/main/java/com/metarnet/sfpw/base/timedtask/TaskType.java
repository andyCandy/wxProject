package com.metarnet.sfpw.base.timedtask;

public enum TaskType {

	
	SYNPHYSICALRESOURCE(3,"资源配置同步"),
	SYNPERF(2,"性能同步"),
	SYNALARM(1,"告警同步"),
	SYNLOGICALRESOURCE(4,"逻辑资源"),
	SYNHISTORYPERF(5,"历史性能");
	
	private TaskType (int value,String description){
		this.value = value;
		this.description = description;
	}
	
	private int value;
	private String description;
	
	public int value(){
		return this.value;
	}
	public String toString(){
		return this.description;
	}
	
	public static TaskType fromValue(int value){
		TaskType[] taskTypes = values();
		for (TaskType taskType : taskTypes) {
			if(taskType.value == value){
				return taskType;
			}
		}
		return null;
	}
}
