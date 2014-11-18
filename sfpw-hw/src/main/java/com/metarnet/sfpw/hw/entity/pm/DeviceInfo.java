package com.metarnet.sfpw.hw.entity.pm;

/**
 * 查网元设备信息命令：LST-DEVINFO::OLTID=172.21.251.253:CTAG::;
 * 
 * @author Administrator
 * @version
 * @see com.module.adapter.optel.entity.pm
 * @since
 */
public class DeviceInfo {
	/*
	 * List of Device Info -----------------------------------------------------
	 * DEVNAME DEVIP DT DEVER MEM CPU TEMPERATURE 古东C220 172.21.251.253 C220v1.1
	 * V1.1.3P2T6 78 9 32 -----------------------------------------------------
	 */
	private String devName;
	private String devIp;
	private String dt;
	private String dever;
	private int mem;
	private int cpu;
	private int temperature;
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDevIp() {
		return devIp;
	}
	public void setDevIp(String devIp) {
		this.devIp = devIp;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getDever() {
		return dever;
	}
	public void setDever(String dever) {
		this.dever = dever;
	}
	public int getMem() {
		return mem;
	}
	public void setMem(int mem) {
		this.mem = mem;
	}
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}


}
