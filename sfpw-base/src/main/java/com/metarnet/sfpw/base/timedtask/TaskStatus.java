package com.metarnet.sfpw.base.timedtask;

/**
 * 
 * @author bcmeng
 *
 */
public enum TaskStatus {

	ACTIVATED(1,"激活状态"),
	UNACTIVATED(0,"未激活状态");
	
	private TaskStatus(int value,String description){
		
		this.value = value;
		this.description = description;
	}
	
	private String description;
	
	private int value;
	
	public int value(){
		return this.value;
	}
	
	public static TaskStatus fromValue(int value){
		TaskStatus[] type = values();
		for (int i = 0; i < type.length; i++) {
			if(type[i].value == value){
				return type[i];
			}
		}
		return null;
	}
	public String toString(){
		return description;
	}
}
