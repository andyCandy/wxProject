package com.metarnet.sfpw.hw.entity.pm;

/**
 * 单板信息:LST-BRDINFO::OLTID=${oltId}:1288771404769-37::;
 * 
 * @author Administrator
 * @version 
 * @see com.module.adapter.zte.entity.pm
 * @since
 */
public class BoardInfo
{
    /*List of Board Info
    -----------------------------------------------------
    BOARDID BSTAT   BOARDTYPE   BSERVICE    PNUM    SWVER   HWVER   MEM CPU
    1-1-1   Normal  EPFC    EPON    4   V1.1.3P2T6  V3.25   75  7
    1-1-2   Normal  EPFC    EPON    4   V1.1.3P2T6  V3.25   75  6
    1-1-7   Normal  GCSAS   SCU 0   V1.1.3P2T6  V0.6    78  10
    1-1-8   Normal  GCSAS   SCU 0   V1.1.3P2T6  V0.6    76  8
    1-1-13  Normal  EIGM    ETH 4   V1.1.3P2T6  V0.5    41  2
    1-1-14  Normal  EIGM    ETH 4   V1.1.3P2T6  V0.5    41  2
    -----------------------------------------------------*/
    private String boardId;
    private String bStat;
    private String boardType;
    private String bService;
    private int pNum;
    private String swVer;
    private String hwVer;
    private int mem;
    private int cpu;
    public String getBoardId()
    {
        return boardId;
    } 		
    public void setBoardId(String boardId)
    {
        this.boardId = boardId;
    }
    public String getbStat()
    {
        return bStat;
    }
    public void setbStat(String bStat)
    {
        this.bStat = bStat;
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
    public int getpNum()
    {
        return pNum;
    }
    public void setpNum(int pNum)
    {
        this.pNum = pNum;
    }
    public String getSwVer()
    {
        return swVer;
    }
    public void setSwVer(String swVer)
    {
        this.swVer = swVer;
    }
    public String getHwVer()
    {
        return hwVer;
    }
    public void setHwVer(String hwVer)
    {
        this.hwVer = hwVer;
    }
    public int getMem()
    {
        return mem;
    }
    public void setMem(int mem)
    {
        this.mem = mem;
    }
    public int getCpu()
    {
        return cpu;
    }
    public void setCpu(int cpu)
    {
        this.cpu = cpu;
    }
    
}
