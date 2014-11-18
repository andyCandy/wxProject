package com.metarnet.sfpw.hwswitch.util;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.NodeList;

import com.metarnet.service.ServiceException;
import com.metarnet.sfpw.base.util.IConfig;
import com.metarnet.util.XConfException;
import com.metarnet.util.XPathConfManager;

public class HwConfig implements IConfig{

	
	private String domain;
	
	/**数据中继的ip和端口号，格式：ip:port*/
	private String targetAddr;
	
	/**存放从中继发来的文件路径*/
	private String path;
	private String housekeeping;
	private String minconn;
	private String maxconn;
	private String driver;
	private String dbuser;
	private String dbpassword;
	
	private String wsServer;
	private String wsPort;
	private String wsUser;
	private String wsPassword;
	
	/**
	 * 服务名，用于拼接服务地址，格式：http://ip:port/serviceName
	 */
	private String alarmService;
	private String perfServcie;
	private String topoService;
	private String meService;
	private String portService;
	private String mdService;
	
	private String url;
	
	private List<String> requiredMeTypeList = new ArrayList<String>();
	/**
	 * @throws XConfException 
	 * @throws ServiceException 
	 * @TODO 读取配置，赋值
	 */
	public void readCfg() throws XConfException {
		
			XPathConfManager.createManager("conf/config_hw_ws.xml");
			XPathConfManager xpath = XPathConfManager.instance();
			targetAddr = xpath.evaluate("//wall/@target", "");
			path = xpath.evaluate("//filepath/@path", "");
		
		    this.domain = xpath.evaluate("//common/@domain", "");
		    
		    this.housekeeping = xpath.evaluate("//common/database/@housekeeping");
		    this.minconn = xpath.evaluate("//common/database/@minconn", "1");
		    this.maxconn = xpath.evaluate("//common/database/@maxconn", "3");
		    this.driver = xpath.evaluate("//common/database/@driver");
		    this.dbuser = xpath.evaluate("//common/database/user", "");
		    this.dbpassword = xpath.evaluate("//common/database/password", "");
		    
		    
		    this.wsServer = xpath.evaluate("//ws/@server");
		    this.wsPort = xpath.evaluate("//ws/@port");
		    this.wsUser = xpath.evaluate("//ws/user/@name");
		    this.wsPassword = xpath.evaluate("//ws/user/@password");
		    this.alarmService = xpath.evaluate("//ws/serviceName/alarm");
		    this.perfServcie = xpath.evaluate("//ws/serviceName/perf");
		    this.topoService = xpath.evaluate("//ws/serviceName/topo");
		    this.meService = xpath.evaluate("//ws/serviceName/me");
		    this.portService = xpath.evaluate("//ws/serviceName/port");
		    this.mdService = xpath.evaluate("//ws/serviceName/md");
		    
		    this.url = "http://"+this.wsServer+":"+this.wsPort+"/";
		    NodeList nl = xpath.elements("//requiredMeTypeList/meType");
		    for(int i = 0; i < nl.getLength(); i ++){
		    	requiredMeTypeList.add(nl.item(i).getFirstChild().getNodeValue());
		    }
		      
	}


	


	@Override
	public String toString() {
		return "HwConfig [domain=" + domain + ", targetAddr=" + targetAddr
				+ ", path=" + path + ", housekeeping=" + housekeeping
				+ ", minconn=" + minconn + ", maxconn=" + maxconn + ", driver="
				+ driver + ", dbuser=" + dbuser + ", dbpassword=" + dbpassword
				+ ", wsServer=" + wsServer + ", wsPort=" + wsPort + ", wsUser="
				+ wsUser + ", wsPassword=" + wsPassword + ", alarmService="
				+ alarmService + ", perfServcie=" + perfServcie
				+ ", topoService=" + topoService + ", meService=" + meService
				+ ", portService=" + portService + ", mdService=" + mdService
				+ ", url=" + url + ", requiredMeTypeList=" + requiredMeTypeList
				+ "]";
	}





	public String getDomain(){
		return domain;
	}
	
	
	public String getTargetAddr() {
		return targetAddr;
	}
	public String getPath() {
		return path;
	}
	
	


	public String getHousekeeping() {
		return housekeeping;
	}


	public String getMinconn() {
		return minconn;
	}


	public String getMaxconn() {
		return maxconn;
	}


	public String getDriver() {
		return driver;
	}


	public String getDbuser() {
		return dbuser;
	}


	public String getDbpassword() {
		return dbpassword;
	}

	

	public String getWsUser() {
		return wsUser;
	}






	public String getWsPassword() {
		return wsPassword;
	}






	public String getAlarmService() {
		return alarmService;
	}






	public String getPerfServcie() {
		return perfServcie;
	}






	public String getTopoService() {
		return topoService;
	}






	public String getMeService() {
		return meService;
	}






	public String getPortService() {
		return portService;
	}






	public String getMdService() {
		return mdService;
	}






	public String getUrl() {
		return url;
	}

	




	public String getWsServer() {
		return wsServer;
	}






	public String getWsPort() {
		return wsPort;
	}



	public List<String> getRequiredMeTypeList() {
		return requiredMeTypeList;
	}





	public static void main(String[] args) throws ServiceException, XConfException {
		
		HwConfig config = new HwConfig();
		config.readCfg();
		System.out.println(config);
		System.out.println(config.getRequiredMeTypeList().contains("s7700"));
	}
	
}
