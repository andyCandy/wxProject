package com.metarnet.sfpw.hw.entity;

/**
 * 
 * 接口中查询来的ONU实体类
 * 
 * @author Administrator
 * @version 
 * @see com.metarnet.sfpw.hw.entity
 * @since
 */
public class OnuBean
{
    /**
     * OLTID ： OLT 的IP 地址、名称。（如：10.78.217.109）
     * PONID ： PON 口定位信息。格式为“机架-框-槽-端口号”，没有则使用NA 代替，如0 框0 槽0 端口为NA-0-0-0。（如：NA-0-6-0）
     * ONUID ： ONU 授权号。（如：0）
     * NAME ：      ONU 名称。（如：10.78.217.109/框0/槽6/端口0/OnuID0）
     * DEC ：       ONU 描述信息。（如：--）
     * ONUTYPE ：   ONU 类型信息，这里为模板集名称。（如：--）
     * IP ：        ONU 的管理IP 地址。（如：--）
     * AUTHTYPE：   OLT 对ONU 设备进行认证时使用的方式。（如：MAC）
     * MAC ：       ONU 的MAC 地址信息。说明：当 “AUTH”取值“MAC”时，该参数才返回有效值。（如：10-70-35-85-12-66）
     * LOID ：      逻辑ONU ID。说明：当 “AUTH”取值“LOID”或“LOIDONCEON”时，该参数才返回有效值。（如：--）
     * PWD ：       密码。说明：当 “AUTH”取值“LOID”或“LOIDONCEON”时，该参数才可能返回有效值。（如：--）
     * SWVER：      ONU 软件版本。（如：--））、
     */
    private String oltId;       //OLT 的IP 地址、名称
    private String ponId;       //PON 口定位信息
    private String onuId;       //ONU 授权号
    private String name;        //ONU 名称
    private String dec;         //ONU 描述信息
    private String onuType;     //ONU 类型信息
    private String ip;          //ONU 的管理IP 地址
    private String authType;    //OLT 对ONU 设备进行认证时使用的方式
    private String mac;         //ONU 的MAC 地址信息
    private String loId;        //逻辑ONU ID
    private String pwd;         //密码
    private String swver;       //ONU 软件版本
    public String getOltId()
    {
        return oltId;
    }
    public void setOltId(String oltId)
    {
        this.oltId = oltId;
    }
    public String getPonId()
    {
        return ponId;
    }
    public void setPonId(String ponId)
    {
        this.ponId = ponId;
    }
    public String getOnuId()
    {
        return onuId;
    }
    public void setOnuId(String onuId)
    {
        this.onuId = onuId;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDec()
    {
        return dec;
    }
    public void setDec(String dec)
    {
        this.dec = dec;
    }
    public String getOnuType()
    {
        return onuType;
    }
    public void setOnuType(String onuType)
    {
        this.onuType = onuType;
    }
    public String getIp()
    {
        return ip;
    }
    public void setIp(String ip)
    {
        this.ip = ip;
    }
    public String getAuthType()
    {
        return authType;
    }
    public void setAuthType(String authType)
    {
        this.authType = authType;
    }
    public String getMac()
    {
        return mac;
    }
    public void setMac(String mac)
    {
        this.mac = mac;
    }
    public String getLoId()
    {
        return loId;
    }
    public void setLoId(String loId)
    {
        this.loId = loId;
    }
    public String getPwd()
    {
        return pwd;
    }
    public void setPwd(String pwd)
    {
        this.pwd = pwd;
    }
    public String getSwver()
    {
        return swver;
    }
    public void setSwver(String swver)
    {
        this.swver = swver;
    }
}
