package com.metarnet.sfpw.hw.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 〈一句话功能简述〉
 *  告警ID，采用6 位数字标识。
    l 第1 位：标识告警分类，取值从1 ～ 9。
        1: 设备告警
        2: 环境告警
        3: 通信失败告警
        4: 业务质量告警
        5: 处理出错告警
    l 第2 位：标识告警设备，1 为OLT 部分，2 为ONU 部分，3 为EMS 部分。
    l 第3 位：留待扩展，目前全部填写0。
    l 第4、5、6 位：取值从000-999，标识具体告警。
 * @author Administrator
 * @version 
 * @see com.metarnet.sfpw.hw.entity
 * @since
 */
public class HuaweiAlarmNameMapping
{
    public static Map<String, String> huaweiAlarmMap = new HashMap<String, String>();
    static {
        // OLT告警
        huaweiAlarmMap.put("110001", "OLT 设备启动");
        huaweiAlarmMap.put("110002", "OLT 板卡离线");
        huaweiAlarmMap.put("110003", "OLT 板卡状态异常");
        huaweiAlarmMap.put("110004", "非法ONU 注册");
        huaweiAlarmMap.put("110005", "OLT 远端配置ONU 失败");
        huaweiAlarmMap.put("110006", "CPU 利用率超阈值");
        huaweiAlarmMap.put("110007", "ONU 长发光");
        huaweiAlarmMap.put("110008", "ONU 电源掉电");
        huaweiAlarmMap.put("110009", "OLT 主备板倒换");
        huaweiAlarmMap.put("110010", "OLT 主备端口倒换");
        huaweiAlarmMap.put("310001", "OLT PON 光模块失效");
        huaweiAlarmMap.put("310002", "OLT 上联口光模块失效");
        huaweiAlarmMap.put("310003", "OLT 上联口收无光");
        huaweiAlarmMap.put("310004", "OLT PON 口收无光");
        huaweiAlarmMap.put("310005", "ONU 离线");
        huaweiAlarmMap.put("310006", "OLT 网管脱网");
        huaweiAlarmMap.put("310007", "OLT 上联口光模块接收光功率异常");
        huaweiAlarmMap.put("310008", "OLT 上联口光模块发送光功率异常");
        huaweiAlarmMap.put("310009", "OLT PON 口接收光功率异常");
        huaweiAlarmMap.put("310010", "OLT PON 口发送光功率异常");
        huaweiAlarmMap.put("310012", "LACP 链路故障");
        huaweiAlarmMap.put("210001", "OLT 电源板异常");
        huaweiAlarmMap.put("210002", "OLT 电源板离线告警");
        huaweiAlarmMap.put("210003", "本框输入电源故障");
        huaweiAlarmMap.put("210004", "主控板温度过高");
        huaweiAlarmMap.put("210005", "OLT 单板温度过高");
        huaweiAlarmMap.put("210006", "OLT 单板温度过低");
        huaweiAlarmMap.put("210007", "交流电源断电");
        huaweiAlarmMap.put("210008", "蓄电池组回路断");
        huaweiAlarmMap.put("210009", "负载熔丝断");
        huaweiAlarmMap.put("210010", "整流模块异常");
        huaweiAlarmMap.put("210011", "OLT 风扇异常告警");
        huaweiAlarmMap.put("210013", "OLT 光模块温度告警");
        huaweiAlarmMap.put("210014", "内存过载");
        huaweiAlarmMap.put("210015", "干节点告警");
        huaweiAlarmMap.put("410001", "OLT 以太网统计流量超越门限值");
        huaweiAlarmMap.put("410002", "OLT 以太网统计的冲突数超越门限值");
        huaweiAlarmMap.put("410003", "ONU 光通路信号质量差");
        huaweiAlarmMap.put("410004", "OLT 以太网端口CRC 错误超门限值");
        // ONU告警
        huaweiAlarmMap.put("120000", "ONU 板卡离线");
        huaweiAlarmMap.put("120001", "ONU 单板状态异常");
        huaweiAlarmMap.put("120002", "以太网用户口成环告警");
        huaweiAlarmMap.put("120003", "DoS 攻击告警");
        huaweiAlarmMap.put("120004", "CPU 利用率超阈值");
        huaweiAlarmMap.put("320001", "ONU H.248 断链");
        huaweiAlarmMap.put("320002", "ONU MGCP 断链");
        huaweiAlarmMap.put("320003", "ONU SIP 断链");
        huaweiAlarmMap.put("320004", "环境监控单元通信异常");
        huaweiAlarmMap.put("320005", "ONU PON 口接收光功率异常");
        huaweiAlarmMap.put("320006", "ONU PON 口发送光功率异常");
        huaweiAlarmMap.put("320007", "ONU 网管脱网");
        huaweiAlarmMap.put("220001", "ONU 交流电中断");
        huaweiAlarmMap.put("220002", "ONU 电池电压低");
        huaweiAlarmMap.put("220003", "ONU 温度异常告警");
        huaweiAlarmMap.put("220004", "ONU 风扇异常告警");
        huaweiAlarmMap.put("220005", "ONU 光模块温度告警");
        huaweiAlarmMap.put("220006", "干节点告警");
        // EMS告警
        huaweiAlarmMap.put("130001", "EMS 网管服务进程异常告警");
        huaweiAlarmMap.put("130002", "EMS 网管服务器CPU 超门限告警");
        huaweiAlarmMap.put("130003", "EMS 网管服务器内存超门限告警");
        huaweiAlarmMap.put("130004", "EMS 网管服务器硬盘超门限告警");
        huaweiAlarmMap.put("130005", "EMS 网管服务器数据库空间使用率超门限告警");
        huaweiAlarmMap.put("130006", "EMS 网管许可协议告警");
    }
    public static String getAlarmNameByEventCode(String eventCode)
    {
        String alarmName = huaweiAlarmMap.get(eventCode);
        if (alarmName == null)
        {
            alarmName = "未知原因";
        }
        return alarmName;
    }
}
