package com.metarnet.sfpw.base.model;


import com.metarnet.adapter.model.Supervisee;
import com.metarnet.sfpw.base.util.CodeGenerator;

public class Port extends Supervisee{

	public Port() {
		super("Port");
		
		this.portcode =  CodeGenerator.genSpecificLenCode(36);
	}

	private String meId;
	private String slotId = "0";
	private String portId;
	private String nativeEmsName;
	private String portcode;
	private String type;
	private String connectionState;
	private String userLabel;
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
	public String getNativeEmsName() {
		return nativeEmsName;
	}
	public void setNativeEmsName(String nativeEmsName) {
		this.nativeEmsName = nativeEmsName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getConnectionState() {
		return connectionState;
	}
	public void setConnectionState(String connectionState) {
		this.connectionState = connectionState;
	}
	public String getUserLabel() {
		return userLabel;
	}
	public void setUserLabel(String userLabel) {
		this.userLabel = userLabel;
	}
	public String getSlotId() {
		return slotId;
	}
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	public String getPortcode() {
		return portcode;
	}
	
	@Override
	public String toString() {
		return "Port [meId=" + meId + ", slotId=" + slotId + ", portId="
				+ portId + ", nativeEmsName="
				+ nativeEmsName + ", portcode=" + portcode + ", type=" + type
				+ ", connectionState=" + connectionState + ", userLabel="
				+ userLabel + "]";
	}
	
	
	
}
