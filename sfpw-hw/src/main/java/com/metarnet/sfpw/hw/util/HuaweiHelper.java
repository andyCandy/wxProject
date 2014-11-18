package com.metarnet.sfpw.hw.util;


import java.io.IOException;
import java.io.InputStream;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.metarnet.common.AlarmSeverity;
import com.metarnet.common.AlarmType;


public class HuaweiHelper 
{
	/** 数据编码方式 */
	public final static String CHARSET = "ISO8859-1";

	/** 错误 */
	public static final String ERROR = "(ERROR)";
	
	/** 保存数据最大条数 */
	public static final int MAXNUMBER = 200;
	
    /** 替换NA字符*/
    public static String strReplaceNA = "0";

	/**
     * 在根据网元名称查其配置时，可以根据其emsSn是否为IP，就可判断网元是否为IP标识的OLT或具有IP的ONU，否则就为不是IP表示的不具有IP的ONU
     * 在网元构造emsName时：
     *     OLT：me.setEmsName(sysConfig.getEmsName() + ";ManagedElement=" + oltBean.getDevIp() + ";");  //系统EMS名称:OLT就取其IP
     *     ONU：me.setEmsName(sysConfig.getEmsName() + ";ManagedElement=" + onuBean.getIp() + ";");  //系统EMS名称:OLT就取其IP
     *          或 me.setEmsName(sysConfig.getEmsName() + ";ManagedElement=" + onuBean.getOltId() 
                                + "/" + onuBean.getPonId() + "/" + onuBean.getOnuId() + ";");  //系统EMS名称ManagedElement=oltid/ponid/onuid;
     */
    public static boolean checkMeNameMarkedByIp(String meName)
    {
        String emsSn = getEmsSnFromEmsName(meName);// 如果是OLT，则其emsSn为IP
        // 完全匹配IP的正则表达式
        Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|[1-9])$");
        Matcher matcher = pattern.matcher(emsSn);
        if (matcher.find())
        {
            return true;
        }
        return false;
    }
    
    /**
     * 从数据中返回信息是否成功
     * @param message 返回信息
     * @return 信息是否成功
     * */
    public static boolean checkMessage(String message)
    {
        boolean result=false;
        if(message.indexOf("EN=0")!=-1)
        {
            result=true;
        }
        return result;
    }
    
    public static void checkErrorStr(String title, String messageListStr)  
    {
        if (messageListStr.indexOf("EN=") != -1)
        {
            String en = messageListStr.substring(messageListStr.indexOf("EN="), messageListStr.indexOf("EN=") + 4);
            if (!en.equals("EN=0"))
            {
                String errorPart = messageListStr.substring(messageListStr.indexOf("EN="));
                if (errorPart.indexOf("ENDESC=") != -1)
                {
                    String errorStr = errorPart.substring(errorPart.indexOf("ENDESC=") + 7, errorPart.indexOf("\r\n"));
             
                    System.out.println(errorStr);
                }
            }
        }
    }
    
    
    /**
     * 从告警发生的Position中找出RackNo、ShelfNo、SlotNo、PortNo等
     */
    public static String getNOFromAlarmPosition(String position, String fieldName)
    {
        position = position + ",";// 在末尾加上逗号便于取值
        String returnNO = "";
        if (position.indexOf(fieldName) != -1)
        {
            String subStr = position.substring(position.indexOf(fieldName));
            returnNO = subStr.substring(fieldName.length(), subStr.indexOf(",")).replace("NA", strReplaceNA);
        }
        return returnNO;
    }
	
	/**
	 * 解码字符串
	 * 
	 * @param source 源字符串
	 * @return 解码后字符串
	 */
	public static String decode(String source) {
		// 检查空
		if (source == null) {
			return null;
		}

		// 解码字符串
		try {
			return new String(source.getBytes(CHARSET),"gbk");
		}
		catch (UnsupportedEncodingException e) {
			return null;
		}
	}
	
	/**
	 * 将InputStream转换为String
	 */
	public static String inputStream2String(InputStream is) throws IOException{
//        BufferedReader in = new BufferedReader(new InputStreamReader(is, "GBK"));
        StringBuffer sb = new StringBuffer();
//        String line = "";
        

        byte buffer[] = new byte[1024];
        int a = 0;
        while((a = is.read(buffer))!= -1)
        {
            //System.out.println(a);
            String s = new String(buffer, 0, a, "GBK");
            //System.out.println(s);
            sb.append(s);
            if (s.contains(";"))
            {
                break;
            }
        }
        //System.out.println("++++++++++++++++++++++++++++++++++++");
        return sb.toString();
	}
	
	/**
	 * 由emsName中获取emsSn
	 * 系统唯一标识:取emsName中最后一个"="后的值,后续取法都遵从这种规则
	 * @param emsName：系统ems名称
	 * @return emsSn:系统唯一标识
	 */
	public static String getEmsSnFromEmsName(String emsName)
	{
        String emsSn = "";
        try
        {
            int beginIndex = emsName.lastIndexOf("=") + 1;
            if (beginIndex == -1)
            {
                beginIndex = 0;
            }
            int endIndex = emsName.lastIndexOf(";");
            if (endIndex == -1)
            {
                return emsName.substring(beginIndex);
            }
            return emsName.substring(beginIndex, endIndex);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return emsSn;
    }
	
	/**
     * 从网元名称emsName中获取IP，其实就是获取网元的emsSn：网元一般用设备ip作为唯一标识
     * 如：网元emsName：EMS=NanJing_H3C_DataNetwork;ManagedElement=192.168.1.39;
     */
    public static String getIpStrFromMeName(String mename)
    {
        String myresult = mename;
        try
        {
            int beginIndex = myresult.indexOf("ManagedElement=") + 15;
            int endIndex = myresult.lastIndexOf(";");
            myresult = myresult.substring(beginIndex, endIndex);
            myresult = myresult.trim();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return myresult;
    }
    
    /**
     * 从输入参数中取出设备IP，即设备的系统唯一标识
     * 用于从性能
     */
    public static String getIpFromInput(String input){
        String re ="";
        re = input;
        try{
            int beginIndex = re.indexOf("ManagedElement=");
            int endIndex = re.indexOf(";PTP");
            re = re.substring(beginIndex+15, endIndex);
        }catch(Exception e){
            e.printStackTrace();
        }
        return re;  
    }
    /**
     * 截取字符串：按字节数截取
     */
    public static String bSubstring(String s, int length) throws Exception
    {

        byte[] bytes = s.getBytes("Unicode");
        int n = 0; // 表示当前的字节数
        int i = 2; // 要截取的字节数，从第3个字节开始
        for (; i < bytes.length && n < length; i++)
        {
            // 奇数位置，如3、5、7等，为UCS2编码中两个字节的第二个字节
            if (i % 2 == 1)
            {
                n++; // 在UCS2第二个字节时n加1
            }
            else
            {
                // 当UCS2编码的第一个字节不等于0时，该UCS2字符为汉字，一个汉字算两个字节
                if (bytes[i] != 0)
                {
                    n++;
                }
            }
        }
        // 如果i为奇数时，处理成偶数
        if (i % 2 == 1)

        {
            // 该UCS2字符是汉字时，去掉这个截一半的汉字
            if (bytes[i - 1] != 0)
                i = i - 1;
            // 该UCS2字符是字母或数字，则保留该字符
            else
                i = i + 1;
        }

        return new String(bytes, 0, i, "Unicode");
    }
    /**
     * 从子系统名称中取得sysName
     * @param subsysName 子系统名称：如EMS=NanJing_H3C_DataNetwork;MultiLayerSubnetwork=H3C_SubNetWork;
     * @return sysName 系统名称：EMS=NanJing_H3C_DataNetwork;
     */
    public static String getSysNameFromSubSysName(String subsysName)
    {
        String myresult = subsysName;
        try
        {
            int beginIndex = 0;
            int endIndex = myresult.indexOf(";") + 1;
            myresult = myresult.substring(beginIndex, endIndex);
            myresult = myresult.trim();
            return myresult;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return myresult;
    }
    
	/**
	 * 测试SNC接口用函数(被调用)
	 */
	public static int getRate(short _rate) {
		int out = 0;
		if (_rate == 5 || _rate == 11 || _rate == 79) { // 2M
			out = 5;
		} else if (_rate == 7 || _rate == 13 || _rate == 14 || _rate == 83) { // 34M
			out = 1116;
		} else if (_rate == 8 || _rate == 15 || _rate == 20 || _rate == 25
				|| _rate == 51 || _rate == 73 || _rate == 85) { // 115M
			out = 4;
		} else if (_rate == 9 || _rate == 16 || _rate == 21 || _rate == 26
				|| _rate == 54 || _rate == 74 || _rate == 86) { // 622M
			out = 3;
		} else if (_rate == 12 || _rate == 17 || _rate == 27 || _rate == 75) { // 2.5G
			out = 2;
		} else if (_rate == 18 || _rate == 23 || _rate == 28 || _rate == 77) { // 10G
			out = 1;
		}
		return out;
	}
	
	/**
	 * 获取OlT标识
	 * 
	 * @param source 原字符串
	 * @return OlT标识
	 */
	public static String getOLTId(String source) {
	    String[] olts =source.split("\\.");
		if (olts.length==4) {
			return olts[3];
		}
		return source;
	}
	
	
	/**
	 * 获取机架标识
	 * 
	 * @param source 原字符串
	 * @return 机架标识
	 */
	public static String getRackId(String source) {
		Pattern pattern = Pattern.compile("^.*/rack=(\\d+).*$");
		Matcher matcher = pattern.matcher(source);
		if (!matcher.find()) {
			return "1";
		}
		return matcher.group(1);
	}
	/**
	 * 获取机框标识
	 * 
	 * @param source 原字符串
	 * @return 机框标识
	 */
	public static String getShelfId(String source) {
		Pattern pattern = Pattern.compile("^.*/shelf=(\\d+).*$");
		Matcher matcher = pattern.matcher(source);
		if (!matcher.find()) {
			return null;
		}
		return matcher.group(1);
	}

	/**
	 * 获取子机框标识
	 * 
	 * @param source 原字符串
	 * @return 子机框标识
	 */
	public static String getSubShelfId(String source) {
		Pattern pattern = Pattern.compile("^.*/sub_shelf=(\\d+).*$");
		Matcher matcher = pattern.matcher(source);
		if (!matcher.find()) {
			return null;
		}
		return matcher.group(1);
	}
	/**
	 * 获取机槽标识
	 * 
	 * @param source 原字符串
	 * @return 机槽标识
	 */
	public static String getSlotId(String source) {
		Pattern pattern = Pattern.compile("^.*/slot=(\\d+).*$");
		Matcher matcher = pattern.matcher(source);
		if (!matcher.find()) {
			return null;
		}
		return matcher.group(1);
	}

	/**
	 * 获取子机槽标识
	 * 
	 * @param source 原字符串
	 * @return 机槽标识
	 */
	public static String getSubSlotId(String source) {
		Pattern pattern = Pattern.compile("^.*/sub_slot=(\\d+).*$");
		Matcher matcher = pattern.matcher(source);
		if (!matcher.find()) {
			return null;
		}
		return matcher.group(1);
	}
	
	/**
	 * 获取端口标识
	 * 
	 * @param source 原字符串
	 * @return 端口标识
	 */
	public static String getPortId(String source) {
		// 定义变量
		Pattern pattern;
		Matcher matcher;
		String domain, port, portId;

		// 获取主域
		pattern = Pattern.compile("^.*/domain=(\\w+)/.*$");
		matcher = pattern.matcher(source);
		if (matcher.find()) {
			domain = matcher.group(1);
		}
		else {
			domain = null;
		}

		// 获取端口
		pattern = Pattern.compile("^.*/port=(\\d+).*$");
		matcher = pattern.matcher(source);
		if (!matcher.find()) {
			return null;
		}
		port = matcher.group(1);

		// 组装标识
		if (domain == null || domain.equals("") || domain.equals("sdh")) {
			portId = port;
		}
		else {
			portId = domain + "-" + port;
		}

		// 返回数据
		return portId;
	}

	
	/**
	 * 转化告警时间"yyyy-MM-dd HH:mm:ss"--->long
	 * @param time_input
	 * @return
	 */
	public static long timeConvert(String time_input) 
	{
		//初始化日期
		long longTime = 0;
		//日期格式转化
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHH24mmss");
		try
        {
            longTime = format.parse(time_input).getTime();
        }
        catch (ParseException e1)
        {
            e1.printStackTrace();
        }
		return longTime;
	}
	
	/**
	 * 南京局需要提前4个小时：timeLong为10位的long
	 */
    public static long convertTime(long timeLong){
        Date currentTime = new Date(timeLong*1000-4*60*60*1000L);
        return currentTime.getTime();
    }
    
    /**
     * 直接对带毫秒级13位的long的date进行format，并且针对南京局多一天的情况进行减除：timeLong为13位的long
     */
    public static long convertTime2(long timeLong){
        Date currentTime = new Date(timeLong - 24*60*60*1000L);
        return currentTime.getTime();
    }
    

    /**
     * 将类似于<runTime>13天17小时42分钟19秒660毫秒</runTime>形式的转换成秒，类似于将lastChange转换成lastChangeTime的形式
     * 原：<lastChange>0天0小时3分钟9秒370毫秒</lastChange>
     * 返回：<lastChangeTime>18937</lastChangeTime>
     */
    public static long convertRunTime(String deviceRunTime)
    {
        long runTime = 0;
        if (null != deviceRunTime)
        {
            try
            {
                int dayLoc = deviceRunTime.indexOf("天");
                int hourLoc = deviceRunTime.indexOf("小时");
                int minuteLoc = deviceRunTime.indexOf("分钟");
                int secondLoc = deviceRunTime.indexOf("秒");
                int millisecondLoc = deviceRunTime.indexOf("毫秒");
                
                int day = Integer.valueOf(deviceRunTime.substring(0, dayLoc));
                int hour = Integer.valueOf(deviceRunTime.substring(dayLoc + 1, hourLoc));
                int minute = Integer.valueOf(deviceRunTime.substring(hourLoc + 2, minuteLoc));
                int second = Integer.valueOf(deviceRunTime.substring(minuteLoc + 2, secondLoc));
                int millisecond = Integer.valueOf(deviceRunTime.substring(secondLoc + 1, millisecondLoc));
                
                runTime = (second + minute * 60 + hour * 60 *60 + day * 24 * 60 * 60L) * 100L + millisecond / 10;
            }
            catch (Exception e)
            {
                runTime = 0;
                e.printStackTrace();
            }
        }
        
        return runTime;
    }

    /**
     * 映射告警级别
     * 
     * @param severity 告警紧急程度
     * @return 告警级别
     */
    public static AlarmSeverity mapAlarmSeverity(String severity) 
    {
        severity = severity.toUpperCase();
        //主要告警
        if (severity.contentEquals("CRITICAL")) {
        	return AlarmSeverity.CRITICAL;
        }
        //主要告警
        if (severity.contentEquals("MAJOR")) {
        	return AlarmSeverity.MAJOR;
        }
        //次要告警
        if (severity.contentEquals("MINOR")) {
        	return AlarmSeverity.MINOR;
        }
        //提示告警
        if (severity.contentEquals("WARNING")) {
        	return AlarmSeverity.WARNING;
        }
        //清除告警
        if (severity.contentEquals("CLEARED")) {
        	return AlarmSeverity.CLEARED;
        }
        //默认
    	return  AlarmSeverity.INDETERMINATE;
    }
	/**
	 * 映射告警类型
	 * @param eventType 告警时间类型
	 * @return 
	 */
	public static AlarmType mapAlarmType(String eventType){
		//communicationsAlarm 通讯告警类型
		if("communicationsAlarm".equalsIgnoreCase(eventType)){
			return AlarmType.COMMUNICATION;
		}
		//qualityOfServiceAlarm QOS告警类型
		if("qualityOfServiceAlarm".equalsIgnoreCase(eventType)){
			return AlarmType.QOS;
		}
		//processingErrorAlarm 处理出错告警类型
		if("processingErrorAlarm".equalsIgnoreCase(eventType)){
			return AlarmType.PROCESSINGERROR;
		}
		//equipmentAlarm 设备告警类型
		if("equipmentAlarm".equalsIgnoreCase(eventType)){
			return AlarmType.EQUIPMENT;
		}
		//environmentalAlarm 环境告警类型
		if("environmentalAlarm".equalsIgnoreCase(eventType)){
			return AlarmType.ENVIRONMENT;
		}
		return AlarmType.UNKNOWN;
	}

	  public static String mapTime(String time)
	  {
		  time=time.replaceAll(" ", "").replaceAll("-", "").replaceAll(":", "");
	      return time;
	  }
    /**
     * 按指定格式获取当前时间
     * @param format 如：yyyy-MM-dd HH-mm-ss
     */
    public static String getNowDateTime(String format)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = new Date();
        return sdf.format(date);
    }
    /*public static void main(String[] args)
    {
        String rackname = "EMS=PLC/NARI;ManagedElement=201009282-131647-s2;RackModel=/rack=1;";
        String shelfname = "EMS=PLC/NARI;ManagedElement=201009282-131647-s2;ShelfModel=/rack=1/shelf=1;";
        String slotname = "EMS=PLC/NARI;ManagedElement=201009282-131647-s2;SlotModel=/rack=1/shelf=1/slot=1;";
        String cardname = "EMS=PLC/NARI;ManagedElement=201009282-131647-s2;CardModel=/rack=1/shelf=1/slot=1/card=1;";
        String ptpname = "EMS=PLC/NARI;ManagedElement=201009282-131647-s2;PTP=/rack=1/shelf=1/slot=1/port=1";
        System.out.println(rackname.substring(rackname.indexOf("/rack="), rackname.length() - 1));
        System.out.println(shelfname.contains(rackname.substring(rackname.indexOf("=/rack="), rackname.length() - 1)));
    }*/
    
 
}
