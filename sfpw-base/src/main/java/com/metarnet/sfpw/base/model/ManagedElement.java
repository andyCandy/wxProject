package com.metarnet.sfpw.base.model;

import java.util.UUID;

import com.metarnet.adapter.model.Supervisee;
import com.metarnet.sfpw.base.util.CodeGenerator;

public class ManagedElement extends Supervisee{

	private String meId;
	
	private String equipcode;
	
	private String userLabel;
	
	private String nativeEmsName;
	
	private String owner;
	
	private String location;
	
	private String version;
	
	private String productName;
	
	private String communicationState;
	
	private String ipAddress;
	
	private String type;
	
	public ManagedElement() {
		super("ManagedElement");
		
		this.equipcode = CodeGenerator.genDefaultCode();
		
		
	}

	public String getMeId() {
		return meId;
	}

	public void setMeId(String meId) {
		this.meId = meId;
	}
	

	public String getEquipcode() {
		return equipcode;
	}

	

	public String getUserLabel() {
		return userLabel;
	}

	public void setUserLabel(String userLabel) {
		this.userLabel = userLabel;
	}

	public String getNativeEmsName() {
		return nativeEmsName;
	}

	public void setNativeEmsName(String nativeEmsName) {
		this.nativeEmsName = nativeEmsName;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCommunicationState() {
		return communicationState;
	}

	public void setCommunicationState(String communicationState) {
		this.communicationState = communicationState;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ManagedElement [meId=" + meId + ", equipcode=" + equipcode
				+ ", userLabel=" + userLabel + ", nativeEmsName="
				+ nativeEmsName + ", owner=" + owner + ", location=" + location
				+ ", version=" + version + ", productName=" + productName
				+ ", communicationState=" + communicationState + ", ipAddress="
				+ ipAddress + ", type=" + type + "]";
	}



	
	
}
