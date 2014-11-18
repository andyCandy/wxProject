package com.metarnet.sfpw.hw.entity.pm;

/**
 * 查询ONU状态返回报文体
 * 
 * @author Administrator
 * @version 
 * @see com.module.adapter.zte.entity.pm
 * @since
 */
public class OnuState
{
    /*list of ONU state
    -----------------------------------------------------
    ONUID   AdminState  OperState   AUTH    AUTHINFO    ONUIP
    1   UP  LOS MAC 08-18-1A-14-F0-BA   172.21.251.236*/
    private String onuId;
    private String adminState;
    private String operState;
    private String auth;
    private String authInfo;
    private String onuIp;
    private String lastOffTime;
    public String getOnuId()
    {
        return onuId;
    }
    public void setOnuId(String onuId)
    {
        this.onuId = onuId;
    }
    public String getAdminState()
    {
        return adminState;
    }
    public void setAdminState(String adminState)
    {
        this.adminState = adminState;
    }
    public String getOperState()
    {
        return operState;
    }
    public void setOperState(String operState)
    {
        this.operState = operState;
    }
    public String getAuth()
    {
        return auth;
    }
    public void setAuth(String auth)
    {
        this.auth = auth;
    }
    public String getAuthInfo()
    {
        return authInfo;
    }
    public void setAuthInfo(String authInfo)
    {
        this.authInfo = authInfo;
    }
    public String getOnuIp()
    {
        return onuIp;
    }
    public void setOnuIp(String onuIp)
    {
        this.onuIp = onuIp;
    }
    public String getLastOffTime()
    {
        return lastOffTime;
    }
    public void setLastOffTime(String lastOffTime)
    {
        this.lastOffTime = lastOffTime;
    }
}
