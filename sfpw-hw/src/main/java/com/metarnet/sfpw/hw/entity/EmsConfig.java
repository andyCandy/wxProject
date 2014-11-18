package com.metarnet.sfpw.hw.entity;

/**
 * 系统设置
 * @author Administrator
 *
 */
public class EmsConfig {
	private String emsName;
	private String nativeEMSName;
	private String userLabel;
	public String getEmsName()
    {
        return emsName;
    }
    public void setEmsName(String emsName)
    {
        this.emsName = emsName;
    }
    public String getNativeEMSName() {
		return nativeEMSName;
	}
	public void setNativeEMSName(String nativeEMSName) {
		this.nativeEMSName = nativeEMSName;
	}
	public String getUserLabel() {
		return userLabel;
	}
	public void setUserLabel(String userLabel) {
		this.userLabel = userLabel;
	}
}
