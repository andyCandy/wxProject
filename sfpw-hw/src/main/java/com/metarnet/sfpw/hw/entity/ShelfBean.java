package com.metarnet.sfpw.hw.entity;

/**
 * 
 * 接口中查询来的机框Shelf实体类
 * 
 * @author Administrator
 * @version 
 * @see com.metarnet.sfpw.hw.entity
 * @since
 */
public class ShelfBean
{
    /**
     * ONUIP ：ONU 的IP 地址、名称。
     * OLTIP  ：OLT 的IP 地址、名称。
     * PONID  ：PON 口定位信息。格式为“机架-框-槽-端口号”，没有则使用NA 代替，如0框0 槽0 端口为NA-0-0-0。
     * ONUID  ：ONU 标识。
     * ShelfID  ：机框标识，通过“机架-框号”的方式定位机框，没有则使用NA 代替，如NA-0。
     * ShelfType ：机框类型。
     */
    private String onuIp;       // ONU 的IP 地址、名称
    private String oltIp;       // OLT 的IP 地址、名称
    private String ponId;       // PON 口定位信息
    private String onuId;       // ONU 标识
    private String shelfId;     // 机框标识
    private String shelfType;   // 机框类型
    public String getOnuIp()
    {
        return onuIp;
    }
    public void setOnuIp(String onuIp)
    {
        this.onuIp = onuIp;
    }
    public String getOltIp()
    {
        return oltIp;
    }
    public void setOltIp(String oltIp)
    {
        this.oltIp = oltIp;
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
    public String getShelfId()
    {
        return shelfId;
    }
    public void setShelfId(String shelfId)
    {
        this.shelfId = shelfId;
    }
    public String getShelfType()
    {
        return shelfType;
    }
    public void setShelfType(String shelfType)
    {
        this.shelfType = shelfType;
    }
}
