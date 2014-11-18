package com.metarnet.sfpw.base.model;

import com.metarnet.adapter.model.Supervisee;
import com.metarnet.sfpw.base.util.CodeGenerator;
import com.metarnet.sfpw.base.model.Direction;


public class TopologicalLink extends Supervisee{

	private String linkcode;
	private String linkid;
	private String aMeId;
	private String aSlotId = "0";
	private String aPortId;
	private String zMeId;
	private String zSlotId = "0";
	private String zPortId;
	private String label;
	private String rate;
	private Direction direction;
	private String nativeEmsName;
	private String type;
	public TopologicalLink() {
		super("TopologicalLink");
		this.linkcode =  CodeGenerator.genDefaultCode();
	}
	public String getLinkid() {
		return linkid;
	}
	public void setLinkid(String linkid) {
		this.linkid = linkid;
	}
	public String getaMeId() {
		return aMeId;
	}
	public void setaMeId(String aMeId) {
		this.aMeId = aMeId;
	}
	public String getaPortId() {
		return aPortId;
	}
	public void setaPortId(String aPortId) {
		this.aPortId = aPortId;
	}
	public String getzMeId() {
		return zMeId;
	}
	public void setzMeId(String zMeId) {
		this.zMeId = zMeId;
	}
	public String getzPortId() {
		return zPortId;
	}
	public void setzPortId(String zPortId) {
		this.zPortId = zPortId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
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
	public String getLinkcode() {
		return linkcode;
	}
	public void setLinkcode(String linkcode) {
		this.linkcode = linkcode;
	}
	
	
	public String getaSlotId() {
		return aSlotId;
	}
	public void setaSlotId(String aSlotId) {
		this.aSlotId = aSlotId;
	}
	public String getzSlotId() {
		return zSlotId;
	}
	public void setzSlotId(String zSlotId) {
		this.zSlotId = zSlotId;
	}
	@Override
	public String toString() {
		return "TopologicalLink [linkcode=" + linkcode + ", linkid=" + linkid
				+ ", aMeId=" + aMeId + ", aSlotId=" + aSlotId + ", aPortId="
				+ aPortId + ", zMeId=" + zMeId + ", zSlotId=" + zSlotId
				+ ", zPortId=" + zPortId + ", label=" + label + ", rate="
				+ rate + ", direction=" + direction + ", nativeEmsName="
				+ nativeEmsName + ", type=" + type + "]";
	}
	
	
	
}
