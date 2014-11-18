package com.metarnet.sfpw.base.model;

import com.metarnet.sfpw.base.util.CodeGenerator;



public class IfPerformance {

	private String performanceCode;
	private String meId;
	private String slot;
	private String portId;
	private String portName;
	/**层速率*/
	private short layerRate;
	/**监视周期*/
	private String granularity;
	/**系统从网元上获取性能的时间*/
	private String retrievalTime;
	/**厂家提供性能指标*/
	/**端口序号*/
	private float ifIndex;
	/**端口描述*/
	private float ifDescr;
	/**端口操作状态*/
	private float ifOperstatus;
	/**端口接收字节数*/
	private float ifInOctets;
	/**接口接收单播数据包数*/
	private float ifInUcastPkts;
	/**接口接收非单播数据包数*/
	private float IfInNUcastPKts;
	/**端口发出字节数*/
	private float ifOutOctets;
	/**接口发出单播数据包数*/
	private float ifOutUcastPkts;
	/**接口发出非单播数据包数*/
	private float ifOutNUcastPkts;
	
	public IfPerformance(){
		this.performanceCode = CodeGenerator.genDefaultCode();
	}
	public String getPerformanceCode() {
		return performanceCode;
	}
	public void setPerformanceCode(String performanceCode) {
		this.performanceCode = performanceCode;
	}
	public String getMeId() {
		return meId;
	}
	public void setMeId(String meId) {
		this.meId = meId;
	}
	public String getPortId() {
		return portId;
	}
	public void setPortId(String portId) {
		this.portId = portId;
	}
	public short getLayerRate() {
		return layerRate;
	}
	public void setLayerRate(short layerRate) {
		this.layerRate = layerRate;
	}
	public String getGranularity() {
		return granularity;
	}
	public void setGranularity(String granularity) {
		this.granularity = granularity;
	}
	public String getRetrievalTime() {
		return retrievalTime;
	}
	public void setRetrievalTime(String retrievalTime) {
		this.retrievalTime = retrievalTime;
	}
	
	public String getPortName() {
		return portName;
	}
	public void setPortName(String portName) {
		this.portName = portName;
	}
	public float getIfIndex() {
		return ifIndex;
	}
	public void setIfIndex(float ifIndex) {
		this.ifIndex = ifIndex;
	}
	public float getIfDescr() {
		return ifDescr;
	}
	public void setIfDescr(float ifDescr) {
		this.ifDescr = ifDescr;
	}
	public float getIfOperstatus() {
		return ifOperstatus;
	}
	public void setIfOperstatus(float ifOperstatus) {
		this.ifOperstatus = ifOperstatus;
	}
	public float getIfInOctets() {
		return ifInOctets;
	}
	public void setIfInOctets(float ifInOctets) {
		this.ifInOctets = ifInOctets;
	}
	public float getIfInUcastPkts() {
		return ifInUcastPkts;
	}
	public void setIfInUcastPkts(float ifInUcastPkts) {
		this.ifInUcastPkts = ifInUcastPkts;
	}
	public float getIfInNUcastPKts() {
		return IfInNUcastPKts;
	}
	public void setIfInNUcastPKts(float ifInNUcastPKts) {
		IfInNUcastPKts = ifInNUcastPKts;
	}
	public float getIfOutOctets() {
		return ifOutOctets;
	}
	public void setIfOutOctets(float ifOutOctets) {
		this.ifOutOctets = ifOutOctets;
	}
	public float getIfOutUcastPkts() {
		return ifOutUcastPkts;
	}
	public void setIfOutUcastPkts(float ifOutUcastPkts) {
		this.ifOutUcastPkts = ifOutUcastPkts;
	}
	public float getIfOutNUcastPkts() {
		return ifOutNUcastPkts;
	}
	public void setIfOutNUcastPkts(float ifOutNUcastPkts) {
		this.ifOutNUcastPkts = ifOutNUcastPkts;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	@Override
	public String toString() {
		return "IfPerformance [performanceCode=" + performanceCode + ", meId="
				+ meId + ", slot=" + slot + ", portId=" + portId
				+ ", portName=" + portName + ", layerRate=" + layerRate
				+ ", granularity=" + granularity + ", retrievalTime="
				+ retrievalTime + ", ifIndex=" + ifIndex + ", ifDescr="
				+ ifDescr + ", ifOperstatus=" + ifOperstatus + ", ifInOctets="
				+ ifInOctets + ", ifInUcastPkts=" + ifInUcastPkts
				+ ", IfInNUcastPKts=" + IfInNUcastPKts + ", ifOutOctets="
				+ ifOutOctets + ", ifOutUcastPkts=" + ifOutUcastPkts
				+ ", ifOutNUcastPkts=" + ifOutNUcastPkts + "]";
	}


	
	
}
