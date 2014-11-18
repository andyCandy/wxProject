package com.metarnet.sfpw.hw.entity;

/**
 * 
 * 接口中查询来的板卡board实体类
 * 
 * @author Administrator
 * @version 
 * @see com.metarnet.sfpw.hw.entity
 * @since
 */
public class BoardBean
{
    /**
     * ONUIP ：ONU 的IP 地址、名称。
     * OLTID  ：OLT 的IP 地址、名称。
     * PONID  ：PON 口定位信息。格式为“机架-框-槽-端口号”，没有则使用NA 代替，如0框0 槽0 端口为NA-0-0-0。
     * ONUID  ：ONU 标识。
     * BOARDID  ：单板定位信息。格式为“机架-框-槽”，没有则使用NA 代替，如0 框单板标识为NA-0-NA。
     * BOARDTYPE ：单板类型。
     * BSERVICE ：单板业务类型。
     * PNUM ：端口数目。
     * SWVER ：单板软件版本。
     * HWVER ：单板硬件版本。
     */
    private String onuIp;       // ONU 的IP 地址、名称
    private String oltId;       // OLT 的IP 地址、名称
    private String ponId;       // PON 口定位信息
    private String onuId;       // ONU 标识
    private String boardId;     // 单板定位信息
    private String boardType;   // 单板类型
    private String bService;   // 单板业务类型
    private String pNum;   // 端口数目
    private String swver;   // 单板软件版本
    private String hwver;   // 单板硬件版本
    public String getOnuIp()
    {
        return onuIp;
    }
    public void setOnuIp(String onuIp)
    {
        this.onuIp = onuIp;
    }
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
    public String getBoardId()
    {
        return boardId;
    }
    public void setBoardId(String boardId)
    {
        this.boardId = boardId;
    }
    public String getBoardType()
    {
        return boardType;
    }
    public void setBoardType(String boardType)
    {
        this.boardType = boardType;
    }
    public String getbService()
    {
        return bService;
    }
    public void setbService(String bService)
    {
        this.bService = bService;
    }
    public String getpNum()
    {
        return pNum;
    }
    public void setpNum(String pNum)
    {
        this.pNum = pNum;
    }
    public String getSwver()
    {
        return swver;
    }
    public void setSwver(String swver)
    {
        this.swver = swver;
    }
    public String getHwver()
    {
        return hwver;
    }
    public void setHwver(String hwver)
    {
        this.hwver = hwver;
    }
}
