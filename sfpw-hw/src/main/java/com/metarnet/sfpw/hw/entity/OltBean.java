package com.metarnet.sfpw.hw.entity;

/**
 * 
 * 接口中查询来的OLT实体类
 * 
 * @author Administrator
 * @version 
 * @see com.metarnet.sfpw.hw.entity
 * @since
 */
public class OltBean
{
    /**
     *      DEVNAME ：    OLT 设备名称。如：10.78.217.109
     *      DEVIP ： OLT 设备IP。如：10.78.217.109
     *      DT ：        OLT 设备型号。如：MA5680T
     *      DEVER：      OLT 软件版本。如：MA5600V800R008C01
     */
    private String devName;     //OLT 设备名称
    private String devIp;       //OLT 设备IP
    private String dt;          //OLT 设备型号
    private String dever;       //OLT 软件版本
    public String getDevName()
    {
        return devName;
    }
    public void setDevName(String devName)
    {
        this.devName = devName;
    }
    public String getDevIp()
    {
        return devIp;
    }
    public void setDevIp(String devIp)
    {
        this.devIp = devIp;
    }
    public String getDt()
    {
        return dt;
    }
    public void setDt(String dt)
    {
        this.dt = dt;
    }
    public String getDever()
    {
        return dever;
    }
    public void setDever(String dever)
    {
        this.dever = dever;
    }
}
