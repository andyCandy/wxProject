package com.metarnet.sfpw.hw.entity ;

import java.util.List;

public class ManagedElement
{
    public String meType;// OLT、ONU
    // OLT
    public String devName;  //OLT 设备名称
    public String devIp;    //OLT 设备IP
    public String dt;   //OLT 设备型号
    public String deVer;    //OLT 软件版本
    
// 或
    //ONU
    public String oltId;    // OLTID
    public String ponId;    // PON 口定位信息。格式为“机架-框-槽-端口号”
    public String onuId;    // ONU 授权号。（如：0）
    public String name;     // ONU 名称。（如：10.78.217.109/框0/槽6/端口0/OnuID0）
    public String desc;      // ONU 描述信息
    public String onuType;  // ONU 类型信息，这里为模板集名称。
    public String ip;       // ONU 的管理IP 地址。
    public String authType; // OLT 对ONU 设备进行认证时使用的方式。（如：MAC）
    public String mac;      // ONU 的MAC 地址信息。
    public String loId;     // 逻辑ONU ID
    public String pwd;      // 密码
    public String swVer;// 软件版本
    
    // 机架
    public String rackId = "0";
    
    // 机框
    public List<ShelfBean> shelfBeanList;
    
    // 槽位
    public String slotId = "";
    
    // 板卡
    public List<BoardBean> boardBeanList;
    
    
//  public EquipmentHolder[] slots ;
//  
//  public EquipmentHolder rack ;
//  
//  public EquipmentHolder shelf ;
    
}