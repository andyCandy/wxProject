package com.metarnet.sfpw.hw.util;

import com.metarnet.service.ServiceException;



import com.metarnet.sfpw.base.util.IConfig;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.epon.adapter.AdapterException;
import com.metarnet.util.XConfException;
import com.metarnet.util.XPathConfManager;


/**
 * 
 * 系统配置文件Config.xml操作类
 * 
 * @author Administrator
 * @version
 * @see com.metarnet.epon.huawei.util
 * @since
 */
public class ConfigManager implements IConfig{
	/** 本地文件位置 */
	private static final String PATH = ProjectPath.getProjectPath();

	public String serverHost = ""; // 采集连接的IP地址
	public int serverPort = 8080; // 采集连接地址对应的端口
	public String serviceDesc = ""; // 服务描述
	public String username = ""; // 用户名
	public String password = ""; // 密码
	public int reTimeOut = 60; // 重连间隔时间
	public String loginComm = ""; // 登录命令
	public String logoutComm = ""; // 退出命令
	public String shakeHandComm = ""; // 握手命令
	public int alarmTime = 180; //告警采集周期
	public String domain;
	
	public ConfigManager() {

		try {
			readCfg();
			WxLogger.init.info("配置读取完成。。。");
		} catch (ServiceException e) {
			WxLogger.init.error("ConfigManager读取配置异常",e);
		}
	}
	
	private static ConfigManager cfgManager = new ConfigManager();
	
	public static ConfigManager newInstance(){
		return cfgManager;
	}

	/**
	 * 读配置文件
	 * 
	 * @throws AdapterException
	 */
	public void readCfg() throws ServiceException{
		try {
			
			XPathConfManager.createManager("conf/config_hw_epon.xml");
			XPathConfManager xpath = XPathConfManager.instance();
			this.domain = xpath.evaluate("//common/@domain", "hw_wx_epon");
			this.loginComm = xpath.evaluate("//param/@loginComm", "");
			this.logoutComm = xpath.evaluate("//param/@logoutComm", "");
			this.password = xpath.evaluate("//param/@password", "Changeme_112233");
			this.reTimeOut = Integer.parseInt(xpath.evaluate("//param/@reTimeOut", "60"));
			this.serverHost = xpath.evaluate("//param/@serverHost","");
			this.serverPort = Integer.parseInt(xpath.evaluate("//param/@serverPort", ""));
			this.serviceDesc = xpath.evaluate("//param/@serviceDesc", "");
			this.shakeHandComm = xpath.evaluate("//param/@shakeHandComm", "");
			this.username = xpath.evaluate("//param/@username", "");
		} catch (XConfException e) {
			throw new ServiceException(e.getMessage());
		}
		
		
	}


	public String getDomain() {
		// TODO Auto-generated method stub
		return domain;
	}

}
