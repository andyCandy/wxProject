package com.metarnet.sfpw.hw.entity.pm;

/**
 * PON链路质量
 * 
 * LST-PONPERF::ONUIP=172.21.251.238:1288771210725-17::;
 * LST-PONPERF::OLTID=172.21.251.253,PONID=1-1-1-1,ONUIDTYPE=ONU_NUMBER,ONUID=1:1288771210725-17::;
 * LST-PONPERF::OLTID=172.21.251.253,PONID=1-1-1-1:1288771210725-17::;
 * @author Administrator
 * @version 
 * @see com.module.adapter.zte.entity.pm
 * @since
 */
public class PonPerf
{
    /*list of pon port performance
    -----------------------------------------------------
    OutPkts InPkts  OutOctets   InOctets    CRC UnderSizePkts   OverSizePkts    InErrors    OutErrors   InDiscards  OutDiscards InUnicastPkts   InMulticastPkts InBroadcastPkts OutUnicastPkts  OutMulticastPkts    OutBroadcastPkts
    4.0 1.10620011E8    0.0 0.0 --  --  --  141886.0    822732.0    822732.0    1.0 0.0 0.0 0.0 0.0 0.0 0.0*/

    private long OutPkts;//发送报文数
    private long InPkts;//接收报文数
    private long OutOctets;//发送字节数
    private long InOctets;//接收字节数
    private long CRC;//接收到的CRC错误报文数
    private long UnderSizePkts;//接收到的超短报文数
    private long OverSizePkts;//接收到的超长报文数
    private long InErrors;//接收到的错误报文数
    private long OutErrors;//未发送的错误报文数
    private long InDiscards;//丢弃的接收报文数
    private long OutDiscards;//丢弃的发送报文数
    private long InUnicastPkts;//接收到的单播包数
    private long InMulticastPkts;//接收到的组播包数
    private long InBroadcastPkts;//接收到的广播包数
    private long OutUnicastPkts;//发送的单播包数
    private long OutMulticastPkts;//发送的组播包数
    private long OutBroadcastPkts;//发送到的广播包数
    public long getOutPkts()
    {
        return OutPkts;
    }
    public void setOutPkts(long outPkts)
    {
        OutPkts = outPkts;
    }
    public long getInPkts()
    {
        return InPkts;
    }
    public void setInPkts(long inPkts)
    {
        InPkts = inPkts;
    }
    public long getOutOctets()
    {
        return OutOctets;
    }
    public void setOutOctets(long outOctets)
    {
        OutOctets = outOctets;
    }
    public long getInOctets()
    {
        return InOctets;
    }
    public void setInOctets(long inOctets)
    {
        InOctets = inOctets;
    }
    public long getCRC()
    {
        return CRC;
    }
    public void setCRC(long cRC)
    {
        CRC = cRC;
    }
    public long getUnderSizePkts()
    {
        return UnderSizePkts;
    }
    public void setUnderSizePkts(long underSizePkts)
    {
        UnderSizePkts = underSizePkts;
    }
    public long getOverSizePkts()
    {
        return OverSizePkts;
    }
    public void setOverSizePkts(long overSizePkts)
    {
        OverSizePkts = overSizePkts;
    }
    public long getInErrors()
    {
        return InErrors;
    }
    public void setInErrors(long inErrors)
    {
        InErrors = inErrors;
    }
    public long getOutErrors()
    {
        return OutErrors;
    }
    public void setOutErrors(long outErrors)
    {
        OutErrors = outErrors;
    }
    public long getInDiscards()
    {
        return InDiscards;
    }
    public void setInDiscards(long inDiscards)
    {
        InDiscards = inDiscards;
    }
    public long getOutDiscards()
    {
        return OutDiscards;
    }
    public void setOutDiscards(long outDiscards)
    {
        OutDiscards = outDiscards;
    }
    public long getInUnicastPkts()
    {
        return InUnicastPkts;
    }
    public void setInUnicastPkts(long inUnicastPkts)
    {
        InUnicastPkts = inUnicastPkts;
    }
    public long getInMulticastPkts()
    {
        return InMulticastPkts;
    }
    public void setInMulticastPkts(long inMulticastPkts)
    {
        InMulticastPkts = inMulticastPkts;
    }
    public long getInBroadcastPkts()
    {
        return InBroadcastPkts;
    }
    public void setInBroadcastPkts(long inBroadcastPkts)
    {
        InBroadcastPkts = inBroadcastPkts;
    }
    public long getOutUnicastPkts()
    {
        return OutUnicastPkts;
    }
    public void setOutUnicastPkts(long outUnicastPkts)
    {
        OutUnicastPkts = outUnicastPkts;
    }
    public long getOutMulticastPkts()
    {
        return OutMulticastPkts;
    }
    public void setOutMulticastPkts(long outMulticastPkts)
    {
        OutMulticastPkts = outMulticastPkts;
    }
    public long getOutBroadcastPkts()
    {
        return OutBroadcastPkts;
    }
    public void setOutBroadcastPkts(long outBroadcastPkts)
    {
        OutBroadcastPkts = outBroadcastPkts;
    }
}
