package com.metarnet.sfpw.base.model;

import com.metarnet.adapter.model.Supervisee;
import com.metarnet.sfpw.base.util.CodeGenerator;

public class EquipPerf{

	private String equipCode;
	
	private Supervisee equip;
	
	private String cpuCurrentUtilRate;
	
	private String cpuLongTimeUtilRate;
	
	private String devMemoryTotalNum;
	
	private String devMemoryFreeNum;
	
	private String devMemoryAllocNum;

	public EquipPerf(){
		this.equipCode = CodeGenerator.genDefaultCode();
		
	}
	
	public Supervisee getEquip() {
		return equip;
	}

	public void setEquip(Supervisee equip) {
		this.equip = equip;
	}

	public String getCpuCurrentUtilRate() {
		return cpuCurrentUtilRate;
	}

	public void setCpuCurrentUtilRate(String cpuCurrentUtilRate) {
		this.cpuCurrentUtilRate = cpuCurrentUtilRate;
	}

	public String getCpuLongTimeUtilRate() {
		return cpuLongTimeUtilRate;
	}

	public void setCpuLongTimeUtilRate(String cpuLongTimeUtilRate) {
		this.cpuLongTimeUtilRate = cpuLongTimeUtilRate;
	}

	public String getDevMemoryTotalNum() {
		return devMemoryTotalNum;
	}

	public void setDevMemoryTotalNum(String devMemoryTotalNum) {
		this.devMemoryTotalNum = devMemoryTotalNum;
	}

	public String getDevMemoryFreeNum() {
		return devMemoryFreeNum;
	}

	public void setDevMemoryFreeNum(String devMemoryFreeNum) {
		this.devMemoryFreeNum = devMemoryFreeNum;
	}

	public String getDevMemoryAllocNum() {
		return devMemoryAllocNum;
	}

	public void setDevMemoryAllocNum(String devMemoryAllocNum) {
		this.devMemoryAllocNum = devMemoryAllocNum;
	}

	public String getEquipCode() {
		return equipCode;
	}

	public void setEquipCode(String equipCode) {
		this.equipCode = equipCode;
	}
	
	
	
	
	
}
