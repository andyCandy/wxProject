package com.metarnet.sfpw.hw.entity;

/**
 * 
 * 告警bean
 * 
 * @author Administrator
 * @version 
 * @see com.metarnet.sfpw.hw.entity
 * @since
 */
public class AlarmBean
{
    private String serialId;
    private String alarmName;
    private String dip;
    private String dName;
    private String dTpye;
    private String position;
    private String severity;
    private String faultFlag;
    private String happenTime;
    private String recoverTime;
    private String alarmType;
    private String aditionalInfo;
    private String eventCode;
    private String probableCauseDesc;
    private String probabelCauseCode;
    private String proposedAdvise;
    public String getSerialId()
    {
        return serialId;
    }
    public void setSerialId(String serialId)
    {
        this.serialId = serialId;
    }
    public String getAlarmName()
    {
        return alarmName;
    }
    public void setAlarmName(String alarmName)
    {
        this.alarmName = alarmName;
    }
    public String getDip()
    {
        return dip;
    }
    public void setDip(String dip)
    {
        this.dip = dip;
    }
    public String getdName()
    {
        return dName;
    }
    public void setdName(String dName)
    {
        this.dName = dName;
    }
    public String getdTpye()
    {
        return dTpye;
    }
    public void setdTpye(String dTpye)
    {
        this.dTpye = dTpye;
    }
    public String getPosition()
    {
        return position;
    }
    public void setPosition(String position)
    {
        this.position = position;
    }
    public String getSeverity()
    {
        return severity;
    }
    public void setSeverity(String severity)
    {
        this.severity = severity;
    }
    public String getFaultFlag()
    {
        return faultFlag;
    }
    public void setFaultFlag(String faultFlag)
    {
        this.faultFlag = faultFlag;
    }
    public String getHappenTime()
    {
        return happenTime;
    }
    public void setHappenTime(String happenTime)
    {
        this.happenTime = happenTime;
    }
    public String getRecoverTime()
    {
        return recoverTime;
    }
    public void setRecoverTime(String recoverTime)
    {
        this.recoverTime = recoverTime;
    }
    public String getAlarmType()
    {
        return alarmType;
    }
    public void setAlarmType(String alarmType)
    {
        this.alarmType = alarmType;
    }
    public String getAditionalInfo()
    {
        return aditionalInfo;
    }
    public void setAditionalInfo(String aditionalInfo)
    {
        this.aditionalInfo = aditionalInfo;
    }
    public String getEventCode()
    {
        return eventCode;
    }
    public void setEventCode(String eventCode)
    {
        this.eventCode = eventCode;
    }
    public String getProbableCauseDesc()
    {
        return probableCauseDesc;
    }
    public void setProbableCauseDesc(String probableCauseDesc)
    {
        this.probableCauseDesc = probableCauseDesc;
    }
    public String getProbabelCauseCode()
    {
        return probabelCauseCode;
    }
    public void setProbabelCauseCode(String probabelCauseCode)
    {
        this.probabelCauseCode = probabelCauseCode;
    }
    public String getProposedAdvise()
    {
        return proposedAdvise;
    }
    public void setProposedAdvise(String proposedAdvise)
    {
        this.proposedAdvise = proposedAdvise;
    }
}
