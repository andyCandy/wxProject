package com.metarnet.sfpw.hw.util;

import java.io.File;









import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.metarnet.epon.adapter.AdapterException;
import com.metarnet.sfpw.base.util.WxLogger;


/**
 * 
 * EPON采集命令配置文件commandConfig.xml管理类
 * 
 * @author Administrator
 * @version 
 * @see com.metarnet.epon.huawei.config
 * @since
 */
public class TL1CommandConfig 
{
    private static String PATH = ProjectPath.getProjectPath();
    
    /**
     * 告警采集命令区域
     */
    private String CollectAllAlarmComm = "";//查所有未恢复的告警命令
    
    /**
     * 配置采集命令区域
     */
    private String CollectAllOltComm = "";//查全网所有OLT命令
    private String CollectAllOnuOfOltComm = "";//查某OLT下所有ONU命令
    private String CollectAllShelfComm = "";//查询全网设备机框信息命令
    private String CollectAllShelfOfOltComm = "";//查询某OLT设备机框信息命令
    private String CollectAllShelfOfOnuWithIpComm = "";//查询某个具有管理IP的ONU设备机框信息命令
    private String CollectAllShelfOfOnuWithoutIpComm = "";//查询某个不具有管理IP的ONU设备机框信息命令
    private String CollectAllBoardComm = "";//查询全网设备单板信息命令
    private String CollectAllBoardOfOltComm = "";//查询OLT设备单板信息命令
    private String CollectAllBoardOfOnuWithIpComm = "";//查询某个具有管理IP的ONU设备单板信息命令
    private String CollectAllBoardOfOnuWithoutIpComm = "";//查询某个不具有管理IP的ONU设备单板信息命令
    private String CollectPortOfOltComm = ""; //根据oltname查询olt下端口
    
    /**
     * 性能采集命令区域
     */
    private String CollectOltDeviceInfoComm = "";//查某OLT的网元信息
    private String CollectOnuWithIPDeviceInfoComm = "";//查某带管理IP的ONU的网元信息
    private String CollectOnuWithoutIPDeviceInfoComm = "";//查某不带管理IP的ONU的网元信息
    private String CollectOltBoardInfoComm = "";//查某OLT的单板信息
    private String CollectOnuWithIPBoardInfoComm = "";//查某带管理IP的ONU的单板信息
    private String CollectOnuWithoutIPBoardInfoComm = "";//查某不带管理IP的ONU的单板信息
    private String CollectOnuOnuStateComm = "";//查OLT某PON口下的ONU的状态信息
    
    private String CollectOltPonPerfComm = "";//查某OLT的PON口的链路统计信息
    private String CollectOnuWithIPPonPerfComm = "";//查某带管理IP的ONU的PON口的链路统计信息
    private String CollectOnuWithoutIPPonPerfComm = "";//查某不带管理IP的ONU的PON口的链路统计信息
    
    private String CollectOltOmddmComm = "";//查某OLT的PON口的光模块DDM信息
    private String CollectOnuWithIPOmddmComm = "";//查某带管理IP的ONU的PON口的光模块DDM信息
    private String CollectOnuWithoutIPOmddmComm = "";//查某不带管理IP的ONU的PON口的光模块DDM信息
    
    /**
     * 读配置文件
     * @throws AdapterException 
     * @throws AdapterException 
     */
    public void readConfigFile() throws AdapterException 
    {
        SAXReader reader = new SAXReader();
        Document document = null;
        try
        {
            reader.setEncoding("utf-8");// DOM4J读取utf-8格式的xml(包含中文)文件时异常处理
            File file = new File("conf/commandConfig.xml");
            
            if (file.exists())
            {
                document = reader.read(file);
            }
            else
            {
                throw new AdapterException("未找到commandConfig.xml文件.");
            }
        }
        catch (DocumentException e)
        {
            throw new AdapterException("JDOM异常.", e);
        }
        if(document==null)
        {
            throw new AdapterException("配置文件未找到或格式错误,请检查");
        }
        else
        {
            Element root = document.getRootElement();
            // 告警命令
            if (root.element("AlarmConfig") != null && root.element("AlarmConfig").element("CollectAllAlarmComm") != null)
            {
                CollectAllAlarmComm = root.element("AlarmConfig").element("CollectAllAlarmComm").getTextTrim();
            }
            else
            {
                throw new AdapterException("读取CollectAllAlarmComm命令节点时为空");
            }
            
            // 配置命令
            if (root.element("ResConfig") != null)
            {
                Element resConfigElement = root.element("ResConfig");
                CollectAllOltComm = getResConfigNodeValue(resConfigElement, "CollectAllOltComm");
                CollectAllOnuOfOltComm = getResConfigNodeValue(resConfigElement, "CollectAllOnuOfOltComm");
                CollectAllShelfComm = getResConfigNodeValue(resConfigElement, "CollectAllShelfComm");
                CollectAllShelfOfOltComm = getResConfigNodeValue(resConfigElement, "CollectAllShelfOfOltComm");
                CollectAllShelfOfOnuWithIpComm = getResConfigNodeValue(resConfigElement, "CollectAllShelfOfOnuWithIpComm");
                CollectAllShelfOfOnuWithoutIpComm = getResConfigNodeValue(resConfigElement, "CollectAllShelfOfOnuWithoutIpComm");
                CollectAllBoardComm = getResConfigNodeValue(resConfigElement, "CollectAllBoardComm");
                CollectAllBoardOfOltComm = getResConfigNodeValue(resConfigElement, "CollectAllBoardOfOltComm");
                CollectAllBoardOfOnuWithIpComm = getResConfigNodeValue(resConfigElement, "CollectAllBoardOfOnuWithIpComm");
                CollectAllBoardOfOnuWithoutIpComm = getResConfigNodeValue(resConfigElement, "CollectAllBoardOfOnuWithoutIpComm");
                CollectPortOfOltComm = getResConfigNodeValue(resConfigElement,"CollectPortOfOltComm");
            }
            else
            {
                throw new AdapterException("读取ResConfig命令节点时为空");
            }
            // 性能命令
            if (root.element("PmConfig") != null)
            {
                Element pmConfigElement = root.element("PmConfig");
                CollectOltDeviceInfoComm = getResConfigNodeValue(pmConfigElement, "CollectOltDeviceInfoComm");
                CollectOnuWithIPDeviceInfoComm = getResConfigNodeValue(pmConfigElement, "CollectOnuWithIPDeviceInfoComm");
                CollectOnuWithoutIPDeviceInfoComm = getResConfigNodeValue(pmConfigElement, "CollectOnuWithoutIPDeviceInfoComm");
                CollectOltBoardInfoComm = getResConfigNodeValue(pmConfigElement, "CollectOltBoardInfoComm");
                CollectOnuWithIPBoardInfoComm = getResConfigNodeValue(pmConfigElement, "CollectOnuWithIPBoardInfoComm");
                CollectOnuWithoutIPBoardInfoComm = getResConfigNodeValue(pmConfigElement, "CollectOnuWithoutIPBoardInfoComm");
                CollectOnuOnuStateComm = getResConfigNodeValue(pmConfigElement, "CollectOnuOnuStateComm");
                

                CollectOltPonPerfComm = getResConfigNodeValue(pmConfigElement, "CollectOltPonPerfComm");
                CollectOnuWithIPPonPerfComm = getResConfigNodeValue(pmConfigElement, "CollectOnuWithIPPonPerfComm");
                CollectOnuWithoutIPPonPerfComm = getResConfigNodeValue(pmConfigElement, "CollectOnuWithoutIPPonPerfComm");

                CollectOltOmddmComm = getResConfigNodeValue(pmConfigElement, "CollectOltOmddmComm");
                CollectOnuWithIPOmddmComm = getResConfigNodeValue(pmConfigElement, "CollectOnuWithIPOmddmComm");
                CollectOnuWithoutIPOmddmComm = getResConfigNodeValue(pmConfigElement, "CollectOnuWithoutIPOmddmComm");
            }
            else
            {
                throw new AdapterException("读取PmConfig命令节点时为空");
            }
        }
    }
    
    /**
     * 根据node名称读取命令值
     */
    private String getResConfigNodeValue(Element resConfigElement, String nodeName) throws AdapterException
    {
        if (resConfigElement.element(nodeName) != null)
        {
            return resConfigElement.element(nodeName).getTextTrim();
        }
        else
        {
            throw new AdapterException("读取" + nodeName + "命令节点时为空");
        }
    }
    
    /**
     * 构造私有构告函数
     * @throws AdapterException 
     */
    public TL1CommandConfig() {
        try {
			readConfigFile();
			WxLogger.init.info("读取tl1命令完成。。");
		} catch (AdapterException e) {
		
			WxLogger.init.error("读取tl1命令异常",e);
		}
    }
    
    /**
     * 获取一个tL1CommandConfig 实例
     * 
     * @return tL1CommandConfig
     * @throws AdapterException 
     */
    public static TL1CommandConfig getInstance() throws AdapterException {
    	
        return new TL1CommandConfig();
    }

    public static void main(String[] args) throws AdapterException {
    	System.out.println(TL1CommandConfig.getInstance());
	}
    
    public String getCollectAllAlarmComm()
    {
        return CollectAllAlarmComm;
    }

    public void setCollectAllAlarmComm(String collectAllAlarmComm)
    {
        CollectAllAlarmComm = collectAllAlarmComm;
    }

    public String getCollectAllOltComm()
    {
        return CollectAllOltComm;
    }

    public void setCollectAllOltComm(String collectAllOltComm)
    {
        CollectAllOltComm = collectAllOltComm;
    }

    public String getCollectAllOnuOfOltComm()
    {
        return CollectAllOnuOfOltComm;
    }

    public void setCollectAllOnuOfOltComm(String collectAllOnuOfOltComm)
    {
        CollectAllOnuOfOltComm = collectAllOnuOfOltComm;
    }

    public String getCollectAllShelfComm()
    {
        return CollectAllShelfComm;
    }

    public void setCollectAllShelfComm(String collectAllShelfComm)
    {
        CollectAllShelfComm = collectAllShelfComm;
    }

    public String getCollectAllShelfOfOltComm()
    {
        return CollectAllShelfOfOltComm;
    }

    public void setCollectAllShelfOfOltComm(String collectAllShelfOfOltComm)
    {
        CollectAllShelfOfOltComm = collectAllShelfOfOltComm;
    }

    public String getCollectAllShelfOfOnuWithIpComm()
    {
        return CollectAllShelfOfOnuWithIpComm;
    }

    public void setCollectAllShelfOfOnuWithIpComm(String collectAllShelfOfOnuWithIpComm)
    {
        CollectAllShelfOfOnuWithIpComm = collectAllShelfOfOnuWithIpComm;
    }

    public String getCollectAllShelfOfOnuWithoutIpComm()
    {
        return CollectAllShelfOfOnuWithoutIpComm;
    }

    public void setCollectAllShelfOfOnuWithoutIpComm(String collectAllShelfOfOnuWithoutIpComm)
    {
        CollectAllShelfOfOnuWithoutIpComm = collectAllShelfOfOnuWithoutIpComm;
    }

    public String getCollectAllBoardComm()
    {
        return CollectAllBoardComm;
    }

    public void setCollectAllBoardComm(String collectAllBoardComm)
    {
        CollectAllBoardComm = collectAllBoardComm;
    }

    public String getCollectAllBoardOfOltComm()
    {
        return CollectAllBoardOfOltComm;
    }

    public void setCollectAllBoardOfOltComm(String collectAllBoardOfOltComm)
    {
        CollectAllBoardOfOltComm = collectAllBoardOfOltComm;
    }

    public String getCollectAllBoardOfOnuWithIpComm()
    {
        return CollectAllBoardOfOnuWithIpComm;
    }

    public void setCollectAllBoardOfOnuWithIpComm(String collectAllBoardOfOnuWithIpComm)
    {
        CollectAllBoardOfOnuWithIpComm = collectAllBoardOfOnuWithIpComm;
    }

    public String getCollectAllBoardOfOnuWithoutIpComm()
    {
        return CollectAllBoardOfOnuWithoutIpComm;
    }

    public void setCollectAllBoardOfOnuWithoutIpComm(String collectAllBoardOfOnuWithoutIpComm)
    {
        CollectAllBoardOfOnuWithoutIpComm = collectAllBoardOfOnuWithoutIpComm;
    }

    public String getCollectOltDeviceInfoComm()
    {
        return CollectOltDeviceInfoComm;
    }

    public void setCollectOltDeviceInfoComm(String collectOltDeviceInfoComm)
    {
        CollectOltDeviceInfoComm = collectOltDeviceInfoComm;
    }

    public String getCollectOnuWithIPDeviceInfoComm()
    {
        return CollectOnuWithIPDeviceInfoComm;
    }

    public void setCollectOnuWithIPDeviceInfoComm(String collectOnuWithIPDeviceInfoComm)
    {
        CollectOnuWithIPDeviceInfoComm = collectOnuWithIPDeviceInfoComm;
    }

    public String getCollectOnuWithoutIPDeviceInfoComm()
    {
        return CollectOnuWithoutIPDeviceInfoComm;
    }

    public void setCollectOnuWithoutIPDeviceInfoComm(String collectOnuWithoutIPDeviceInfoComm)
    {
        CollectOnuWithoutIPDeviceInfoComm = collectOnuWithoutIPDeviceInfoComm;
    }

    public String getCollectOltBoardInfoComm()
    {
        return CollectOltBoardInfoComm;
    }

    public void setCollectOltBoardInfoComm(String collectOltBoardInfoComm)
    {
        CollectOltBoardInfoComm = collectOltBoardInfoComm;
    }

    public String getCollectOnuWithIPBoardInfoComm()
    {
        return CollectOnuWithIPBoardInfoComm;
    }

    public void setCollectOnuWithIPBoardInfoComm(String collectOnuWithIPBoardInfoComm)
    {
        CollectOnuWithIPBoardInfoComm = collectOnuWithIPBoardInfoComm;
    }

    public String getCollectOnuWithoutIPBoardInfoComm()
    {
        return CollectOnuWithoutIPBoardInfoComm;
    }

    public void setCollectOnuWithoutIPBoardInfoComm(String collectOnuWithoutIPBoardInfoComm)
    {
        CollectOnuWithoutIPBoardInfoComm = collectOnuWithoutIPBoardInfoComm;
    }

    public String getCollectOnuOnuStateComm()
    {
        return CollectOnuOnuStateComm;
    }

    public void setCollectOnuOnuStateComm(String collectOnuOnuStateComm)
    {
        CollectOnuOnuStateComm = collectOnuOnuStateComm;
    }

    public String getCollectOltPonPerfComm()
    {
        return CollectOltPonPerfComm;
    }

    public void setCollectOltPonPerfComm(String collectOltPonPerfComm)
    {
        CollectOltPonPerfComm = collectOltPonPerfComm;
    }

    public String getCollectOnuWithIPPonPerfComm()
    {
        return CollectOnuWithIPPonPerfComm;
    }

    public void setCollectOnuWithIPPonPerfComm(String collectOnuWithIPPonPerfComm)
    {
        CollectOnuWithIPPonPerfComm = collectOnuWithIPPonPerfComm;
    }

    public String getCollectOnuWithoutIPPonPerfComm()
    {
        return CollectOnuWithoutIPPonPerfComm;
    }

    public void setCollectOnuWithoutIPPonPerfComm(String collectOnuWithoutIPPonPerfComm)
    {
        CollectOnuWithoutIPPonPerfComm = collectOnuWithoutIPPonPerfComm;
    }

    public String getCollectOltOmddmComm()
    {
        return CollectOltOmddmComm;
    }

    public void setCollectOltOmddmComm(String collectOltOmddmComm)
    {
        CollectOltOmddmComm = collectOltOmddmComm;
    }

    public String getCollectOnuWithIPOmddmComm()
    {
        return CollectOnuWithIPOmddmComm;
    }

    public void setCollectOnuWithIPOmddmComm(String collectOnuWithIPOmddmComm)
    {
        CollectOnuWithIPOmddmComm = collectOnuWithIPOmddmComm;
    }

    public String getCollectOnuWithoutIPOmddmComm()
    {
        return CollectOnuWithoutIPOmddmComm;
    }

    public void setCollectOnuWithoutIPOmddmComm(String collectOnuWithoutIPOmddmComm)
    {
        CollectOnuWithoutIPOmddmComm = collectOnuWithoutIPOmddmComm;
    }

    
	public String getCollectPortOfOltComm() {
		return CollectPortOfOltComm;
	}

	public void setCollectPortOfOltComm(String collectPortOfOltComm) {
		CollectPortOfOltComm = collectPortOfOltComm;
	}

	@Override
	public String toString() {
		return "TL1CommandConfig [CollectAllAlarmComm=" + CollectAllAlarmComm
				+ ", CollectAllOltComm=" + CollectAllOltComm
				+ ", CollectAllOnuOfOltComm=" + CollectAllOnuOfOltComm
				+ ", CollectAllShelfComm=" + CollectAllShelfComm
				+ ", CollectAllShelfOfOltComm=" + CollectAllShelfOfOltComm
				+ ", CollectAllShelfOfOnuWithIpComm="
				+ CollectAllShelfOfOnuWithIpComm
				+ ", CollectAllShelfOfOnuWithoutIpComm="
				+ CollectAllShelfOfOnuWithoutIpComm + ", CollectAllBoardComm="
				+ CollectAllBoardComm + ", CollectAllBoardOfOltComm="
				+ CollectAllBoardOfOltComm
				+ ", CollectAllBoardOfOnuWithIpComm="
				+ CollectAllBoardOfOnuWithIpComm
				+ ", CollectAllBoardOfOnuWithoutIpComm="
				+ CollectAllBoardOfOnuWithoutIpComm + ", CollectPortOfOltComm="
				+ CollectPortOfOltComm + ", CollectOltDeviceInfoComm="
				+ CollectOltDeviceInfoComm
				+ ", CollectOnuWithIPDeviceInfoComm="
				+ CollectOnuWithIPDeviceInfoComm
				+ ", CollectOnuWithoutIPDeviceInfoComm="
				+ CollectOnuWithoutIPDeviceInfoComm
				+ ", CollectOltBoardInfoComm=" + CollectOltBoardInfoComm
				+ ", CollectOnuWithIPBoardInfoComm="
				+ CollectOnuWithIPBoardInfoComm
				+ ", CollectOnuWithoutIPBoardInfoComm="
				+ CollectOnuWithoutIPBoardInfoComm
				+ ", CollectOnuOnuStateComm=" + CollectOnuOnuStateComm
				+ ", CollectOltPonPerfComm=" + CollectOltPonPerfComm
				+ ", CollectOnuWithIPPonPerfComm="
				+ CollectOnuWithIPPonPerfComm
				+ ", CollectOnuWithoutIPPonPerfComm="
				+ CollectOnuWithoutIPPonPerfComm + ", CollectOltOmddmComm="
				+ CollectOltOmddmComm + ", CollectOnuWithIPOmddmComm="
				+ CollectOnuWithIPOmddmComm + ", CollectOnuWithoutIPOmddmComm="
				+ CollectOnuWithoutIPOmddmComm + "]";
	}
    
}
