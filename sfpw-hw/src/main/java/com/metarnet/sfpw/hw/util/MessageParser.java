package com.metarnet.sfpw.hw.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;

import com.metarnet.epon.adapter.AdapterException;
import com.metarnet.sfpw.hw.entity.AlarmBean;
import com.metarnet.sfpw.hw.entity.BoardBean;
import com.metarnet.sfpw.hw.entity.OltBean;
import com.metarnet.sfpw.hw.entity.OltPortBean;
import com.metarnet.sfpw.hw.entity.OnuBean;
import com.metarnet.sfpw.hw.entity.ShelfBean;
import com.metarnet.sfpw.hw.entity.pm.BoardInfo;
import com.metarnet.sfpw.hw.entity.pm.DeviceInfo;
import com.metarnet.sfpw.hw.entity.pm.OmDdm;
import com.metarnet.sfpw.hw.entity.pm.OnuState;
import com.metarnet.sfpw.hw.entity.pm.PonPerf;


public class MessageParser
{
    /**
     * 根据告警信息获取告警参数并封装成AlarmBean
     * 
     * @param alarmMessage
     *            告警信息
     * @return AlarmBean 告警信息Bean
     * @throws AdapterException 
     */
    public static List<AlarmBean> parseAlarm(String alarmMessage)
    {
        List<AlarmBean> alarmBeanList = new ArrayList<AlarmBean>();

        // 因为返回报文可能存在分段传送过来的，每次都有报文头，所以根据">"符号先分割开来
        String splitSign = ">";
        String[] messages = alarmMessage.split(splitSign);
        for (int i = 0; i < messages.length; i++)
        {
            try {
				alarmBeanList.addAll(parseSingleAlarm(messages[i]));
			} catch (AdapterException e) {
				continue;
			}
        }
        return alarmBeanList;
    }
    
    /**
     * 根据单条告警信息获取告警参数并封装成AlarmBean
     * 
     * @param alarmMessage
     *            告警信息
     * @return AlarmBean 告警信息Bean
     * @throws AdapterException 
     */
    private static List<AlarmBean> parseSingleAlarm (String alarmMessage) throws AdapterException
    {
        
        List<AlarmBean> alarmBeanList = new ArrayList<AlarmBean>();
        /*String fieldsStr = "SERIALID\tALARMNAME\tDIP\tDNAME\tDTYPE\tPOSITION\tSEVERITY\tFaultFlag\t" +
                "HAPPENTIME\tRECOVERTIME\tALARMTYPE\tAditionalInfo\tEVENT_CODE\tPROBABLE_CAUSE_DESC\t" +
                "PROBABEL_CAUSE_CODE\tPROPOSED_ADVISE\r\n";*/
        String fieldsStr = "SERIALID\tALARMNAME\tDIP\tDNAME\tDTYPE\tPOSITION\tSEVERITY\tFaultFlag\t" +
        "HAPPENTIME\tRECOVERTIME\tALARMTYPE\tAditionalInfo\tEVENT_CODE\tPROBABLE_CAUSE_DESC\t" +
        "PROBABEL_CAUSE_CODE\tPROPOSED_ADVISE\r\n";

        int fieldsNum = 16;
        String endFlag = "----------------------------------------------------------";
        Logger.getLogger("sys").info("原始告警："+alarmMessage);
        try
        {
            if (alarmMessage != null && !alarmMessage.equals(""))
            {
            	//没有告警
            	if(alarmMessage.indexOf(fieldsStr)==-1){
            		
            		return alarmBeanList;
            	}
                //int a = alarmMessage.indexOf(fieldsStr);
                String alarmValueStr = alarmMessage.substring(alarmMessage.indexOf(fieldsStr) + fieldsStr.length());
                Logger.getLogger("sys").info("去掉头部说明："+alarmValueStr);
                // 先去掉头尾，取出值列表
                if (alarmValueStr.indexOf(endFlag) != -1)
                {
                    alarmValueStr =  alarmValueStr.substring(0, alarmValueStr.indexOf(endFlag));
                    Logger.getLogger("sys").info("去掉尾部说明："+alarmValueStr);
                }
                String[] alarmValueArray = alarmValueStr.split("\r\n");
                // 总共告警记录条数
                //int count = alarmValueArray.length % fieldsNum == 0 ? alarmValueArray.length / fieldsNum: alarmValueArray.length / fieldsNum + 1;
                for (int i = 0; i < alarmValueArray.length; i++)
                {
                	Logger.getLogger("sys").info("每条告警字符串："+alarmValueArray[i]);
                    String sigleAlarm = "";
                    String[] fieldArray = null;
                    if (alarmValueArray[i] != null && !alarmValueArray[i].trim().equals(""))
                    {
                        sigleAlarm = alarmValueArray[i];
                        fieldArray = sigleAlarm.split("\t");
                        if(fieldArray.length<16){
                        	System.out.println("无法用'\t'分割出16个字符串:"+sigleAlarm);
                        	Logger.getLogger("sys").info("无法用'\t'分割出16个字符串:"+sigleAlarm);
                        	continue;
                        }
                        AlarmBean alarmBean = new AlarmBean();
                        alarmBean.setSerialId(fieldArray[0]);
                        alarmBean.setAlarmName(fieldArray[1]);
                        alarmBean.setDip(fieldArray[2]);
                        alarmBean.setdName(fieldArray[3]);
                        alarmBean.setdTpye(fieldArray[4]);
                        alarmBean.setPosition(fieldArray[5]);
                        alarmBean.setSeverity(fieldArray[6]);
                        alarmBean.setFaultFlag(fieldArray[7]);
                        alarmBean.setHappenTime(fieldArray[8]);
                        alarmBean.setRecoverTime(fieldArray[9]);
                        alarmBean.setAlarmType(fieldArray[10]);
                        alarmBean.setAditionalInfo(fieldArray[11]);
                        alarmBean.setEventCode(fieldArray[12]);
                        alarmBean.setProbableCauseDesc(fieldArray[13]);
                        alarmBean.setProbabelCauseCode(fieldArray[14]);
                        alarmBean.setProposedAdvise(fieldArray[15]);
                        alarmBeanList.add(alarmBean);
                    }
                }
            }
        }
        catch (Exception e)
        {
        	e.printStackTrace();
            throw new AdapterException("解析告警返回消息时错误！" + e.getMessage());
        }
        return alarmBeanList;
    }
    

    /**
     * 解析采集OLT列表返回消息
     * 
     * @param alarmMessage
     *            告警信息
     * @return AlarmBean 告警信息Bean
     * @throws AdapterException 
     */
    public static List<OltBean> parseOlt(String alarmMessage)
    {
        List<OltBean> alarmBeanList = new ArrayList<OltBean>();

        // 因为返回报文可能存在分段传送过来的，每次都有报文头，所以根据">"符号先分割开来
        String splitSign = ">";
        String[] messages = alarmMessage.split(splitSign);
        for (int i = 0; i < messages.length; i++)
        {
            alarmBeanList.addAll(parseSingleOlt(messages[i]));
        }
        return alarmBeanList;
    }
    
    /**
     * 解析采集OLT列表返回消息
     * @throws AdapterException 
     */
    private static List<OltBean> parseSingleOlt(String messageListStr)
    {
        List<OltBean> oltBeanList = new ArrayList<OltBean>();
        
        String fieldsStr = "DEVNAME\tDEVIP\tDT\tDEVER\r\n";
        int fieldsNum = 4;
        String endFlag = "------------------------------";
        

        	System.out.println(messageListStr);
            if (messageListStr != null && !messageListStr.equals(""))
            {
                // 先去掉头尾，取出值列表
                String valueStr = messageListStr.substring(messageListStr.indexOf(fieldsStr) + fieldsStr.length(), messageListStr.lastIndexOf(endFlag));
                String[] valueArray1 = valueStr.split("\r\n");
                int count1 = valueArray1.length;
                for (int i = 0; i < count1; i++)
                {
                    String[] valueArrayTemp = valueArray1[i].split("\t");
                    if(valueArrayTemp.length < 4){
                    	System.out.println("无法用'\t'分割出四个字符串:"+valueArray1[i]);
                    	continue;
                    }
                    OltBean oltBean = new OltBean();
                    oltBean.setDevName(valueArrayTemp[0]);
                    oltBean.setDevIp(valueArrayTemp[1]);
                    oltBean.setDt(valueArrayTemp[2]);
                    oltBean.setDever(valueArrayTemp[3]);
                    oltBeanList.add(oltBean);
                }
            }
            return oltBeanList;
        }
        
    
    
    /**
     * 解析采集Shelf列表返回消息
     * 
     * @param alarmMessage
     *            告警信息
     * @return AlarmBean 告警信息Bean
     * @throws AdapterException 
     */
    public static List<ShelfBean> parseShelf(String alarmMessage) throws AdapterException
    {
        List<ShelfBean> shelfBeanList = new ArrayList<ShelfBean>();

        // 因为返回报文可能存在分段传送过来的，每次都有报文头，所以根据">"符号先分割开来
        String splitSign = ">";
        String[] messages = alarmMessage.split(splitSign);
        for (int i = 0; i < messages.length; i++)
        {
            shelfBeanList.addAll(parseSingleShelf(messages[i]));
        }
        return shelfBeanList;
    }
    
    /**
     * 解析采集Shelf列表返回消息
     * @throws AdapterException 
     */
    private static List<ShelfBean> parseSingleShelf(String messageListStr) throws AdapterException
    {
        List<ShelfBean> shelfBeanList = new ArrayList<ShelfBean>();
        
        String fieldsStr = "ONUIP\tOLTID\tPONID\tONUID\tSHELFID\tSHELFTYPE\r\n";
        int fieldsNum = 6;
        String endFlag = "---------------------------------------------------";

        try
        {
            if (messageListStr != null && !messageListStr.equals(""))
            {
                // 先去掉头尾，取出值列表
                String valueStr = messageListStr.substring(messageListStr.indexOf(fieldsStr) + fieldsStr.length(), messageListStr.lastIndexOf(endFlag));
                String[] valueArray1 = valueStr.split("\r\n");
                int count1 = valueArray1.length;
                for (int i = 0; i < count1; i++)
                {
                    String[] valueArrayTemp = valueArray1[i].split("\t");
                    ShelfBean shelfBean = new ShelfBean();
                    shelfBean.setOnuIp(valueArrayTemp[0]);
                    shelfBean.setOltIp(valueArrayTemp[1]);
                    shelfBean.setPonId(valueArrayTemp[2]);
                    shelfBean.setOnuId(valueArrayTemp[3]);
                    shelfBean.setShelfId(valueArrayTemp[4]);
                    shelfBean.setShelfType(valueArrayTemp[5]);
                    shelfBeanList.add(shelfBean);
                }
            }
        }
        catch (Exception e)
        {
            throw new AdapterException("解析Shelf列表返回消息时错误！" + e.getMessage());
        }
        return shelfBeanList;
    }
    
    /**
     * 解析采集ONU列表返回消息
     * 
     * @param alarmMessage
     *            告警信息
     * @return AlarmBean 告警信息Bean
     * @throws AdapterException 
     */
    public static List<OnuBean> parseOnu(String alarmMessage) throws AdapterException
    {
        List<OnuBean> onuBeanList = new ArrayList<OnuBean>();

        // 因为返回报文可能存在分段传送过来的，每次都有报文头，所以根据">"符号先分割开来
        String splitSign = ">";
        String[] messages = alarmMessage.split(splitSign);
        for (int i = 0; i < messages.length; i++)
        {
            onuBeanList.addAll(parseSingleOnu(messages[i]));
        }
        return onuBeanList;
    }
    
    public static List<OltPortBean> parseOltPort(String oltPortMessage){
    	List<OltPortBean> oltPortBeanList = new ArrayList<OltPortBean>();
    	String splitSign = ">";
    	String[] messages = oltPortMessage.split(splitSign);
    	for (int i = 0; i < messages.length; i++) {
			oltPortBeanList.addAll(parseSingleOltPort(messages[i]));
		}
    	return oltPortBeanList;
    }
    private static List<OltPortBean> parseSingleOltPort(String message) {
    	List<OltPortBean> oltPortBeanList = new ArrayList<OltPortBean>();
    	String fieldsStr="DID\tFN\tSN\tPN\tPT\tPSTAT\tNAME\tALIAS\tPSPEED\tPDIRECT\tLOOPSTAT\tTESTSTAT\tFEC\tRN\tAState\r\n";
    	String endFlag = "----------------------------------------------------------------------------------------------------";
    	if(message != null && !message.equals("")){
    		System.out.println("ONU info:\n"+message);
    		String valueStr = message.substring(message.indexOf(fieldsStr) + fieldsStr.length(), message.lastIndexOf(endFlag));
            String[] oltPortStrArray = valueStr.split("\r\n");
            for (String oltPortStr : oltPortStrArray) {
            	if(oltPortStr == null || oltPortStr.equals(""))
            		continue;
            	OltPortBean oltPort = new OltPortBean(oltPortStr);
            	oltPortBeanList.add(oltPort);
			}
    	}
		return oltPortBeanList;
	}

	/**
     * 解析采集ONU列表返回消息
     * @throws AdapterException 
     */
    private static List<OnuBean> parseSingleOnu(String messageListStr) throws AdapterException
    {
        List<OnuBean> oltBeanList = new ArrayList<OnuBean>();
        
        String fieldsStr = "OLTID\tPONID\tONUNO\tNAME\tDESC\tONUTYPE\tIP\tAUTHTYPE\tMAC\tLOID\tPWD\tSWVER\r\n";
        int fieldsNum = 12;
        String endFlag = "----------------------------------------------------------------------------------";
        

        try
        {
            if (messageListStr != null && !messageListStr.equals(""))
            {
                // 先去掉头尾，取出值列表
            	System.out.println("ONU info:\n"+messageListStr);
                String valueStr = messageListStr.substring(messageListStr.indexOf(fieldsStr) + fieldsStr.length(), messageListStr.lastIndexOf(endFlag));
                String[] valueArray1 = valueStr.split("\r\n");
                int count1 = valueArray1.length;
                for (int i = 0; i < count1; i++)
                {
                	System.out.println(valueArray1[i]);
                    String[] valueArrayTemp = valueArray1[i].split("\t");
                    OnuBean onuBean = new OnuBean();
                    onuBean.setOltId(valueArrayTemp[0]);
                    onuBean.setPonId(valueArrayTemp[1]);
                    onuBean.setOnuId(valueArrayTemp[2]);
                    onuBean.setName(valueArrayTemp[3]);
                    onuBean.setDec(valueArrayTemp[4]);
                    onuBean.setOnuType(valueArrayTemp[5]);
                    onuBean.setIp(valueArrayTemp[6]);
                    onuBean.setAuthType(valueArrayTemp[7]);
                    onuBean.setMac(valueArrayTemp[8]);
                    onuBean.setLoId(valueArrayTemp[9]);
                    onuBean.setPwd(valueArrayTemp[10]);
                    onuBean.setSwver(valueArrayTemp[11]);
                    oltBeanList.add(onuBean);
                }
            }
            return oltBeanList;
        }
        catch (Exception e)
        {
        	e.printStackTrace();
            throw new AdapterException("解析ONU列表返回消息时错误！" + e.getMessage());
        }
    }
    
    /**
     * 解析采集Board列表返回消息
     * 
     * @param alarmMessage
     *            告警信息
     * @return AlarmBean 告警信息Bean
     * @throws AdapterException 
     */
    public static List<BoardBean> parseBoard(String alarmMessage)
    {
        List<BoardBean> boardBeanList = new ArrayList<BoardBean>();

        // 因为返回报文可能存在分段传送过来的，每次都有报文头，所以根据">"符号先分割开来
        String splitSign = ">";
        String[] messages = alarmMessage.split(splitSign);
        for (int i = 0; i < messages.length; i++)
        {
            boardBeanList.addAll(parseSingleBoard(messages[i]));
        }
        return boardBeanList;
    }
    
    /**
     * 解析采集Board列表返回消息
     * @throws AdapterException 
     */
    private static List<BoardBean> parseSingleBoard(String messageListStr)
    {
        List<BoardBean> boardBeanList = new ArrayList<BoardBean>();
        
        String fieldsStr = "ONUIP\tOLTID\tPONID\tONUID\tBOARDID\tBOARDTYPE\tBSERVICE\tPNUM\tSWVER\tHWVER\r\n";
        int fieldsNum = 10;
        String endFlag = "---------------------------------------------------------------------------------";

            if (messageListStr != null && !messageListStr.equals(""))
            {
                // 先去掉头尾，取出值列表
                String valueStr = messageListStr.substring(messageListStr.indexOf(fieldsStr) + fieldsStr.length(), messageListStr.lastIndexOf(endFlag));
                String[] valueArray1 = valueStr.split("\r\n");
                int count1 = valueArray1.length;
                for (int i = 0; i < count1; i++)
                {
                    String[] valueArrayTemp = valueArray1[i].split("\t");
                    BoardBean boardBean = new BoardBean();
                    boardBean.setOnuIp(valueArrayTemp[0]);
                    boardBean.setOltId(valueArrayTemp[1]);
                    boardBean.setPonId(valueArrayTemp[2]);
                    boardBean.setOnuId(valueArrayTemp[3]);
                    boardBean.setBoardId(valueArrayTemp[4]);
                    boardBean.setBoardType(valueArrayTemp[5]);
                    boardBean.setbService(valueArrayTemp[6]);
                    boardBean.setpNum(valueArrayTemp[7]);
                    boardBean.setSwver(valueArrayTemp[8]);
                    boardBean.setHwver(valueArrayTemp[9]);
                    boardBeanList.add(boardBean);
                }
            }
            return boardBeanList;
        }
    
    
    /**
     * 解析采集Board列表返回消息
     * 
     * @param alarmMessage
     *            告警信息
     * @return AlarmBean 告警信息Bean
     * @throws AdapterException 
     */
    public static List<BoardBean> parseOnuBoard(String alarmMessage) throws AdapterException
    {
        List<BoardBean> boardBeanList = new ArrayList<BoardBean>();

        // 因为返回报文可能存在分段传送过来的，每次都有报文头，所以根据">"符号先分割开来
        String splitSign = ">";
        String[] messages = alarmMessage.split(splitSign);
        for (int i = 0; i < messages.length; i++)
        {
            boardBeanList.addAll(parseSingleOnuBoard(messages[i]));
        }
        return boardBeanList;
    }
    
    /**
     * 解析采集Board列表返回消息
     * @throws AdapterException 
     */
    private static List<BoardBean> parseSingleOnuBoard(String messageListStr) throws AdapterException
    {
        List<BoardBean> boardBeanList = new ArrayList<BoardBean>();
        
        String fieldsStr = "ONUIP\tOLTID\tPONID\tONUID\tBOARDID\tBOARDTYPE\tBSERVICE\tPNUM\tSWVER\tHWVER\r\n";
        int fieldsNum = 10;
        String endFlag = "---------------------------------------------------------------------------------";

        try
        {
            if (messageListStr != null && !messageListStr.equals(""))
            {
                // 先去掉头尾，取出值列表
                String valueStr = messageListStr.substring(messageListStr.indexOf(fieldsStr) + fieldsStr.length(), messageListStr.lastIndexOf(endFlag));
                String[] valueArray1 = valueStr.split("\r\n");
                int count1 = valueArray1.length;
                for (int i = 0; i < count1; i++)
                {
                    String[] valueArrayTemp = valueArray1[i].split("\t");
                    BoardBean boardBean = new BoardBean();
                    boardBean.setOnuIp(valueArrayTemp[0]);
                    boardBean.setOltId(valueArrayTemp[1]);
                    boardBean.setPonId(valueArrayTemp[2]);
                    boardBean.setOnuId(valueArrayTemp[3]);
                    boardBean.setBoardId(valueArrayTemp[4]);
                    boardBean.setBoardType(valueArrayTemp[5]);
                    boardBean.setbService(valueArrayTemp[6]);
                    boardBean.setpNum(valueArrayTemp[7]);
                    boardBean.setSwver(valueArrayTemp[8]);
                    boardBean.setHwver(valueArrayTemp[9]);
                    boardBeanList.add(boardBean);
                }
            }
            return boardBeanList;
        }
        catch (Exception e)
        {
            throw new AdapterException("解析Board列表返回消息时错误！" + e.getMessage());
        }
    }
    
    
    
    /**
     * 解析采集网元设备信息返回消息
     * @throws AdapterException 
     */
    public static List<DeviceInfo> parseDeviceInfo(String messageListStr) throws AdapterException
    {
        List<DeviceInfo> deviceInfoList = new ArrayList<DeviceInfo>();

        // 因为返回报文可能存在分段传送过来的，每次都有报文头，所以根据">"符号先分割开来
        String splitSign = ">";
        String[] messages = messageListStr.split(splitSign);
        for (int i = 0; i < messages.length; i++)
        {
            deviceInfoList.addAll(parseSingleDeviceInfo(messages[i]));
        }
        return deviceInfoList;
    }
    /**
     * 解析采集网元设备信息返回消息
     * @throws AdapterException 
     */
    private static List<DeviceInfo> parseSingleDeviceInfo(String messageListStr) throws AdapterException
    {
        List<DeviceInfo> deviceInfoList = new ArrayList<DeviceInfo>();
        String fieldsStr = "DEVNAME\tDEVIP\tDT\tDEVER\tMEM\tCPU\tTEMPERATURE\r\n";
        int fieldsNum = 7;
        String endFlag = "-----------------------------------------------------";

        try
        {
            if (messageListStr != null && !messageListStr.equals(""))
            {
                int a = messageListStr.indexOf(fieldsStr);
                if (a != -1)
                {
                    String valueStr = messageListStr.substring(messageListStr.indexOf(fieldsStr) + fieldsStr.length());
                    // 先去掉头尾，取出值列表
                    if (valueStr.indexOf(endFlag) != -1)
                    {
                        valueStr =  valueStr.substring(0, valueStr.indexOf(endFlag));
                    }
                    if (!valueStr.equals(""))
                    {
                        String[] valueArray = valueStr.split("\r\n");
                        for (int i = 0; i < valueArray.length; i++)
                        {
                            String sigleValue = "";
                            String[] fieldArray = null;
                            if (valueArray[i] != null && !valueArray[i].trim().equals(""))
                            {
                                sigleValue = valueArray[i];
                                fieldArray = sigleValue.split("\t");
                                DeviceInfo deviceInfo = new DeviceInfo();
                                deviceInfo.setDevName(fieldArray[0]);
                                deviceInfo.setDevIp(fieldArray[1]);
                                deviceInfo.setDt(fieldArray[2]);
                                deviceInfo.setDever(fieldArray[3]);
                                deviceInfo.setMem(Integer.valueOf(fieldArray[4]));
                                deviceInfo.setCpu(Integer.valueOf(fieldArray[5]));
                                deviceInfo.setTemperature(Integer.valueOf(fieldArray[6]));
                                deviceInfoList.add(deviceInfo);
                            }
                        }
                    }
                }
            }
            return deviceInfoList;
        }
        catch (Exception e)
        {
            throw new AdapterException("解析网元设备信息时错误！" + e.getMessage());
        }
    }
    /**
     * 解析采集单板信息返回消息
     * @throws AdapterException 
     */
    public static List<BoardInfo> parseBoardInfo(String messageListStr) throws AdapterException
    {
        List<BoardInfo> boardInfoList = new ArrayList<BoardInfo>();

        // 因为返回报文可能存在分段传送过来的，每次都有报文头，所以根据">"符号先分割开来
        String splitSign = ">";
        String[] messages = messageListStr.split(splitSign);
        for (int i = 0; i < messages.length; i++)
        {
            boardInfoList.addAll(parseSingleBoardInfo(messages[i]));
        }
        return boardInfoList;
    }
    /**
     * 解析采集单板信息返回消息
     * @throws AdapterException 
     */
    private static List<BoardInfo> parseSingleBoardInfo(String messageListStr) throws AdapterException
    {
        List<BoardInfo> boardInfoList = new ArrayList<BoardInfo>();
        //BOARDID BSTAT   BOARDTYPE   BSERVICE    PNUM    SWVER   HWVER   MEM CPU
        String fieldsStr = "BOARDID\tBSTAT\tBOARDTYPE\tBSERVICE\tPNUM\tSWVER\tHWVER\tMEM\tCPU\r\n";
        int fieldsNum = 9;
        String endFlag = "-----------------------------------------------------";

        try
        {
            if (messageListStr != null && !messageListStr.equals(""))
            {
                int a = messageListStr.indexOf(fieldsStr);
                if (a != -1)
                {
                    String valueStr = messageListStr.substring(messageListStr.indexOf(fieldsStr) + fieldsStr.length());
                    // 先去掉头尾，取出值列表
                    if (valueStr.indexOf(endFlag) != -1)
                    {
                        valueStr =  valueStr.substring(0, valueStr.indexOf(endFlag));
                    }
                    if (!valueStr.equals(""))
                    {
                        String[] valueArray = valueStr.split("\r\n");
                        for (int i = 0; i < valueArray.length; i++)
                        {
                            String sigleValue = "";
                            String[] fieldArray = null;
                            if (valueArray[i] != null && !valueArray[i].trim().equals(""))
                            {
                                sigleValue = valueArray[i];
                                fieldArray = sigleValue.split("\t");
                                BoardInfo boardInfo = new BoardInfo();
                                boardInfo.setBoardId(fieldArray[0]);
                                boardInfo.setbStat(fieldArray[1]);
                                boardInfo.setBoardType(fieldArray[2]);
                                boardInfo.setbService(fieldArray[3]);
                                boardInfo.setpNum(Integer.valueOf(fieldArray[4]));
                                boardInfo.setSwVer(fieldArray[5]);
                                boardInfo.setHwVer(fieldArray[6]);
                                boardInfo.setMem(fieldArray[7].equals("--") ? 0 : Integer.valueOf(fieldArray[7]));
                                boardInfo.setCpu(fieldArray[8].equals("--") ? 0 : Integer.valueOf(fieldArray[7]));
                                boardInfoList.add(boardInfo);
                            }
                        }
                    }
                }
            }
            return boardInfoList;
        }
        catch (Exception e)
        {
            throw new AdapterException("解析OLT PON板信息时错误！" + e.getMessage());
        }
    }
    /**
     * 解析采集ONU状态信息
     * @throws AdapterException 
     */
    public static List<OnuState> parseOnuState(String messageListStr) throws AdapterException
    {
        List<OnuState> onuStateList = new ArrayList<OnuState>();

        // 因为返回报文可能存在分段传送过来的，每次都有报文头，所以根据">"符号先分割开来
        String splitSign = ">";
        String[] messages = messageListStr.split(splitSign);
        for (int i = 0; i < messages.length; i++)
        {
            onuStateList.addAll(parseSingleOnuState(messages[i]));
        }
        return onuStateList;
    }
    /**
     * 解析采集ONU状态信息
     * @throws AdapterException 
     */
    private static List<OnuState> parseSingleOnuState(String messageListStr) throws AdapterException
    {
        List<OnuState> onuStateList = new ArrayList<OnuState>();
        //ONUID   AdminState  OperState   AUTH    AUTHINFO    ONUIP
        String fieldsStr = "ONUID\tAdminState\tOperState\tAUTH\tAUTHINFO\tONUIP\tLASTOFFTIME\r\n";
                            
        int fieldsNum = 6;
        String endFlag = "-----------------------------------------------------";

        try
        {
            if (messageListStr != null && !messageListStr.equals(""))
            {
                int a = messageListStr.indexOf(fieldsStr);
                if (a != -1)
                {
                    String valueStr = messageListStr.substring(messageListStr.indexOf(fieldsStr) + fieldsStr.length());
                    // 先去掉头尾，取出值列表
                    if (valueStr.indexOf(endFlag) != -1)
                    {
                        valueStr =  valueStr.substring(0, valueStr.indexOf(endFlag));
                    }
                    if (!valueStr.equals(""))
                    {
                        String[] valueArray = valueStr.split("\r\n");
                        for (int i = 0; i < valueArray.length; i++)
                        {
                            String sigleValue = "";
                            String[] fieldArray = null;
                            if (valueArray[i] != null && !valueArray[i].trim().equals(""))
                            {
                                sigleValue = valueArray[i];
                                fieldArray = sigleValue.split("\t");
                                OnuState onuState = new OnuState();
                                onuState.setOnuId(fieldArray[0]);
                                onuState.setAdminState(fieldArray[1]);
                                onuState.setOperState(fieldArray[2]);
                                onuState.setAuth(fieldArray[3]);
                                onuState.setAuthInfo(fieldArray[4]);
                                onuState.setOnuIp(fieldArray[5]);
                                onuState.setLastOffTime(fieldArray[6]);
                                onuStateList.add(onuState);
                            }
                        }
                    }
                }
            }
            return onuStateList;
        }
        catch (Exception e)
        {
            throw new AdapterException("解析ONU状态信息时错误！" + e.getMessage());
        }
    }
    
    /**
     * 解析采集PON链路质量信息
     * @throws AdapterException 
     */
    public static List<PonPerf> parsePonPerf(String messageListStr) throws AdapterException
    {
        List<PonPerf> ponPortPerformanceList = new ArrayList<PonPerf>();

        // 因为返回报文可能存在分段传送过来的，每次都有报文头，所以根据">"符号先分割开来
        String splitSign = ">";
        String[] messages = messageListStr.split(splitSign);
        for (int i = 0; i < messages.length; i++)
        {
            ponPortPerformanceList.addAll(parseSinglePonPerf(messages[i]));
        }
        return ponPortPerformanceList;
    }
    /**
     * 解析采集PON链路质量信息
     * @throws AdapterException 
     */
    private static List<PonPerf> parseSinglePonPerf(String messageListStr) throws AdapterException
    {
        List<PonPerf> ponPortPerformanceList = new ArrayList<PonPerf>();
        //OutPkts InPkts  OutOctets   InOctets    CRC UnderSizePkts   OverSizePkts    InErrors    OutErrors   InDiscards  OutDiscards InUnicastPkts   InMulticastPkts InBroadcastPkts OutUnicastPkts  OutMulticastPkts    OutBroadcastPkts
        String fieldsStr = "OutPkts\tInPkts\tOutOctets\tInOctets\tCRC\tUnderSizePkts\tOverSizePkts\tInErrors" +
                "\tOutErrors\tInDiscards\tOutDiscards\tInUnicastPkts\tInMulticastPkts\tInBroadcastPkts\tOutUnicastPkts" +
                "\tOutMulticastPkts\tOutBroadcastPkts\r\n";
        int fieldsNum = 17;
        String endFlag = "-----------------------------------------------------";

        try
        {
            if (messageListStr != null && !messageListStr.equals(""))
            {
                int a = messageListStr.indexOf(fieldsStr);
                if (a != -1)
                {
                    String valueStr = messageListStr.substring(messageListStr.indexOf(fieldsStr) + fieldsStr.length());
                    // 先去掉头尾，取出值列表
                    if (valueStr.indexOf(endFlag) != -1)
                    {
                        valueStr =  valueStr.substring(0, valueStr.indexOf(endFlag));
                    }
                    if (!valueStr.equals(""))
                    {
                        String[] valueArray = valueStr.split("\r\n");
                        for (int i = 0; i < valueArray.length; i++)
                        {
                            String sigleValue = "";
                            String[] fieldArray = null;
                            if (valueArray[i] != null && !valueArray[i].trim().equals(""))
                            {
                                sigleValue = valueArray[i];
                                fieldArray = sigleValue.split("\t");
                                PonPerf ponPortPerformance = new PonPerf();
                                ponPortPerformance.setOutPkts(fieldArray[0].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[0]).toPlainString()));
                                ponPortPerformance.setInPkts(fieldArray[1].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[1]).toPlainString()));
                                ponPortPerformance.setOutOctets(fieldArray[2].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[2]).toPlainString()));
                                ponPortPerformance.setInOctets(fieldArray[3].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[3]).toPlainString()));
                                ponPortPerformance.setCRC(fieldArray[4].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[4]).toPlainString()));
                                ponPortPerformance.setUnderSizePkts(fieldArray[5].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[5]).toPlainString()));
                                ponPortPerformance.setOverSizePkts(fieldArray[6].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[6]).toPlainString()));
                                ponPortPerformance.setInErrors(fieldArray[7].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[7]).toPlainString()));
                                ponPortPerformance.setOutErrors(fieldArray[8].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[8]).toPlainString()));
                                ponPortPerformance.setInDiscards(fieldArray[9].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[9]).toPlainString()));
                                ponPortPerformance.setOutDiscards(fieldArray[10].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[10]).toPlainString()));
                                ponPortPerformance.setInUnicastPkts(fieldArray[11].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[11]).toPlainString()));
                                ponPortPerformance.setInMulticastPkts(fieldArray[12].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[12]).toPlainString()));
                                ponPortPerformance.setInBroadcastPkts(fieldArray[13].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[13]).toPlainString()));
                                ponPortPerformance.setOutUnicastPkts(fieldArray[14].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[14]).toPlainString()));
                                ponPortPerformance.setOutMulticastPkts(fieldArray[15].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[15]).toPlainString()));
                                ponPortPerformance.setOutBroadcastPkts(fieldArray[16].equals("--") ? 0 : Long.valueOf(new BigDecimal(fieldArray[16]).toPlainString()));
                                ponPortPerformanceList.add(ponPortPerformance);
                            }
                        }
                    }
                }
            }
            return ponPortPerformanceList;
        }
        catch (Exception e)
        {
            throw new AdapterException("解析PON链路质量信息时错误！" + e.getMessage());
        }
    }
    
   /* public static void main(String[] args)
    {
        //6.84774e+007
        BigDecimal bd = new BigDecimal("0");
        System.out.println(bd.toPlainString());
    }*/
    /**
     * 解析采集光模块信息返回消息
     * @throws AdapterException 
     */
    public static List<OmDdm> parseOmDdm(String messageListStr) throws AdapterException
    {
        List<OmDdm> opticalPowerInfoList = new ArrayList<OmDdm>();

        // 因为返回报文可能存在分段传送过来的，每次都有报文头，所以根据">"符号先分割开来
        String splitSign = ">";
        String[] messages = messageListStr.split(splitSign);
        for (int i = 0; i < messages.length; i++)
        {
            opticalPowerInfoList.addAll(parseSingleOmDdm(messages[i]));
        }
        return opticalPowerInfoList;
    }
    /**
     * 解析采集光模块信息返回消息
     * @throws AdapterException 
     */
    private static List<OmDdm> parseSingleOmDdm(String messageListStr) throws AdapterException
    {
        List<OmDdm> opticalPowerInfoList = new ArrayList<OmDdm>();
        //ONUID   RxPower RxPowerR    TxPower TxPowerR    CurrTxBias  CurrTxBiasR Temperature TemperatureR    Voltage VoltageR    PTxPower    PRxPower
        String fieldsStr = "ONUID\tRxPower\tRxPowerR\tTxPower\tTxPowerR\tCurrTxBias\tCurrTxBiasR\tTemperature" +
                "\tTemperatureR\tVoltage\tVoltageR\tPTxPower\tPRxPower\r\n";
        int fieldsNum = 13;
        String endFlag = "-----------------------------------------------------";

        try
        {
            if (messageListStr != null && !messageListStr.equals(""))
            {
                int a = messageListStr.indexOf(fieldsStr);
                if (a != -1)
                {
                    String valueStr = messageListStr.substring(messageListStr.indexOf(fieldsStr) + fieldsStr.length());
                    // 先去掉头尾，取出值列表
                    if (valueStr.indexOf(endFlag) != -1)
                    {
                        valueStr =  valueStr.substring(0, valueStr.indexOf(endFlag));
                    }
                    if (!valueStr.equals(""))
                    {
                        String[] valueArray = valueStr.split("\r\n");
                        for (int i = 0; i < valueArray.length; i++)
                        {
                            String sigleValue = "";
                            String[] fieldArray = null;
                            if (valueArray[i] != null && !valueArray[i].trim().equals(""))
                            {
                                sigleValue = valueArray[i];
                                fieldArray = sigleValue.split("\t");
                                OmDdm opticalPowerInfo = new OmDdm();
                                opticalPowerInfo.setOnuId(fieldArray[0]);
                                opticalPowerInfo.setRxPower(fieldArray[1].equals("--") ? 0 : Float.valueOf(fieldArray[1]));
                                opticalPowerInfo.setRxPowerR(fieldArray[2]);
                                opticalPowerInfo.setTxPower(fieldArray[3].equals("--") ? 0 : Float.valueOf(fieldArray[3]));
                                opticalPowerInfo.setTxPowerR(fieldArray[4]);
                                opticalPowerInfo.setCurrTxBias(fieldArray[5].equals("--") ? 0 : Float.valueOf(fieldArray[5]));
                                opticalPowerInfo.setCurrTxBiasR(fieldArray[6]);
                                opticalPowerInfo.setTemperature(fieldArray[7].equals("--") ? 0 : Float.valueOf(fieldArray[7]));
                                opticalPowerInfo.setTemperatureR(fieldArray[8]);
                                opticalPowerInfo.setVoltage(fieldArray[9].equals("--") ? 0 : Float.valueOf(fieldArray[9]));
                                opticalPowerInfo.setVoltageR(fieldArray[10]);
                                opticalPowerInfo.setPtxPower(fieldArray[11].equals("--") ? 0 : Float.valueOf(fieldArray[11]));
                                opticalPowerInfo.setPrxPower(fieldArray[12].equals("--") ? 0 : Float.valueOf(fieldArray[12]));
                                opticalPowerInfoList.add(opticalPowerInfo);
                            }
                        }
                    }
                }
            }
            return opticalPowerInfoList;
        }
        catch (Exception e)
        {
            throw new AdapterException("解析光模块信息时错误！" + e.getMessage());
        }
    }
}
