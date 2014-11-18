package com.metarnet.sfpw.base.model;

import com.metarnet.sfpw.base.model.Direction;


public enum Direction {

	CD_BI(1,"双向"),
	CD_UNI(0,"单向"),
	UNKNOWN(2,"未知");
	
	private int value;
	private String desc;
	
	private Direction(int value,String desc){
		this.value = value;
		this.desc = desc;
	}
	
	public int value(){
		return this.value;
	}
	
	public String desc(){
		return desc;
	}
	
	public static Direction from_value(int value){
		Direction[] ds = values();
		for (Direction d : ds) {
			if(d.value == value){
				return d;
			}
		}
		return null;
	}
	
	
	
}
