package com.metarnet.sfpw.hw.da;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.PropertyConfigurator;



























import com.metarnet.common.RunStatus;
import com.metarnet.common.Vendor;
import com.metarnet.epon.adapter.Adapter;
import com.metarnet.epon.adapter.AdapterException;
import com.metarnet.epon.adapter.Alarm;
import com.metarnet.epon.adapter.IfPerformance;
import com.metarnet.epon.adapter.Interface;
import com.metarnet.epon.adapter.OLT;
import com.metarnet.epon.adapter.ONU;
import com.metarnet.epon.adapter.ObjectType;
import com.metarnet.epon.adapter.OltPerformance;
import com.metarnet.epon.adapter.Reporter;
import com.metarnet.epon.adapter.Speed;
import com.metarnet.epon.adapter.Splitter;
import com.metarnet.epon.adapter.UNI;
import com.metarnet.epon.adapter.WorkMode;
import com.metarnet.message.AddEquipmentRequest;
import com.metarnet.message.DelEquipmentRequest;
import com.metarnet.service.Service;
import com.metarnet.service.ServiceException;
import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.hw.entity.AlarmBean;
import com.metarnet.sfpw.hw.entity.BoardBean;
import com.metarnet.sfpw.hw.entity.HuaweiAlarmNameMapping;
import com.metarnet.sfpw.hw.entity.OltBean;
import com.metarnet.sfpw.hw.entity.OltPortBean;
import com.metarnet.sfpw.hw.entity.OnuBean;
import com.metarnet.sfpw.hw.entity.pm.DeviceInfo;
import com.metarnet.sfpw.hw.entity.pm.OnuState;
import com.metarnet.sfpw.hw.entity.pm.PonPerf;
import com.metarnet.sfpw.hw.util.ConfigManager;
import com.metarnet.sfpw.hw.util.HuaweiHelper;
import com.metarnet.sfpw.hw.util.MessageParser;
import com.metarnet.sfpw.hw.util.ProjectPath;
import com.metarnet.sfpw.hw.util.TL1CommandConfig;

/**
 * 华为EPON配置采集适配类
 * 
 * @author Administrator
 * @version
 * @see com.metarnet.epon.huawei
 * @since
 */
public final class HuaweiAdapter{
	/** 本地主机 */
	/** 本地文件位置 */
	private static final String PATH = ProjectPath.getProjectPath();
	/** 配置信息日志路径 */
	private static final String LOGPATH = ProjectPath.getLogPath();

	/** 配置相关 */
	/** 系统配置信息 */
	public ConfigManager configManager;
	/** 采集命令配置信息 */
	public static TL1CommandConfig tL1CommandConfig;

	/** 与网管的连接 */
	public boolean isConnected = false;// SOCKET连接判断标志


	private EponOper eponOper;
	
	public void setEponOper(EponOper eponOper) {
		this.eponOper = eponOper;
	}


	public void setConfigManager(ConfigManager configManager) {
		this.configManager = configManager;
	}

	/** 日志对象 */
	private final static String LINE_SEPARATOR = System
			.getProperty("line.separator");


	static {
		PropertyConfigurator.configure(HuaweiAdapter.class
				.getResource("/log4j.properties"));
	}

	/**
	 * 采集所有OLT设备
	 * 由 com.metarnet.sfpw.hw.trans.HuaweiCfgMgrImpl.syncAllCfg()所用
	 * @throws AdapterException 
	 * @throws ConnectionException 
	 */
	public List<OLT> getAllOLTs() throws AdapterException, ConnectionException {
		List<OLT> devList = new ArrayList<OLT>();

		// 查出所有的OLT，返回List<Object>
		List<OltBean> oltBeanList = MessageParser.parseOlt(eponOper.collect(tL1CommandConfig.getCollectAllOltComm()));
		
		// 遍历所有OLT
		for (OltBean oltBean : oltBeanList) {
			// 转换类型
			String oltId = oltBean.getDevIp();
			OLT oltModel = new OLT();
			oltModel.name(oltBean.getDevName());
			oltModel.oltId(oltId);
			oltModel.type(oltBean.getDt());
			oltModel.version(oltBean.getDever());
			oltModel.address(oltBean.getDevIp());
			oltModel.vendor(Vendor.HUAWEI);
			
			devList.add(oltModel);
		}
		WxLogger.flow.info("采集到OLT" + devList.size() + "个！");
		// 返回数据
		return devList;
	}

	
	/**
	 * 采集某olt下ONU
	 * 由 com.metarnet.sfpw.hw.trans.HuaweiCfgMgrImpl.syncAllCfg()所用
	 * @throws AdapterException 
	 * @throws ConnectionException 
	 */
	public List<ONU> getAllONUs(String oltId) throws AdapterException, ConnectionException {
		List<ONU> devList = new ArrayList<ONU>();


		// 查询OLT其下所有的ONU
		String messageListStr = eponOper.collect(tL1CommandConfig.getCollectAllOnuOfOltComm().replace("${oltId}",oltId));
		List<OnuBean> onuBeanObjList = MessageParser.parseOnu(messageListStr);
		for (Object onuObj : onuBeanObjList) {
			OnuBean onuBean = (OnuBean) onuObj;
			//bcmeng改与2014年4月1日，先不过滤掉
//			if (!onuBean.getOnuType().equals("")
//					&& !onuBean.getOnuType().equals("--"))// 为了过滤掉一个异类的ONU，其没有OnuType
//			{
				ONU onu = new ONU();
				onu.oltId(oltId);
				onu.onuId(onuBean.getIp().equals("--")?(onuBean.getPonId() + "-" + onuBean.getOnuId()):onuBean.getIp());
				onu.splitterId();
				onu.interfaceId(onuBean.getPonId());
				onu.name(onuBean.getName());  
				onu.type(onuBean.getOnuType());//
				onu.mac(onuBean.getMac());
				onu.ip(onuBean.getIp());
				onu.distance();
				onu.vendor(Vendor.HUAWEI);

				devList.add(onu);

//			}
		}

		WxLogger.flow.info("采集到ONU" + devList.size() + "个！");
		// 返回数据
		return devList;

	}


	/**
	 * 采集某olt下端口
	 * 由 com.metarnet.sfpw.hw.trans.HuaweiCfgMgrImpl.syncAllCfg()所用
	 * @throws AdapterException 
	 * @throws ConnectionException 
	 */
	public List<Interface> getAllInterfaces(OLT olt) throws AdapterException, ConnectionException {

		List<Interface> devList = new ArrayList<Interface>();
		List<OltPortBean> oltPortList;
	
		String messageListStr = eponOper.collect(tL1CommandConfig.getCollectPortOfOltComm().replace("${oltName}", olt.name()));
		oltPortList = MessageParser.parseOltPort(messageListStr);
	
		
		for (OltPortBean oltPort : oltPortList) {
			Interface inter = new Interface();
			inter.address(olt.address());
			inter.interfaceId(oltPort.getInterfaceid());
			inter.name(oltPort.getName());
			inter.oltId(olt.oltId());
			inter.speed(oltPort.getPspeed());
			inter.type(oltPort.getPt());
			devList.add(inter);
		}


		WxLogger.flow.info("采集到Interface" + devList.size() + "个！");
		// 返回数据
		return devList;

	}

	

	
	
	/**
	 * 获取网管当前所有告警
	 * 由 com.metarnet.sfpw.hw.trans.HuaweiNotifyMgrImp.syncAllAlarm(String domain)所用
	 * @return alarmList 告警模型list
	 * @throws AdapterException 
	 * @throws ConnectionException 
	 * @throws ProtocolException
	 */
	public List<Alarm> getAllActiveAlarms() throws AdapterException, ConnectionException

	{

		String title = "获取网管当前所有告警";
		List<AlarmBean> alarmBeanList = null;
		List<Alarm> alarmList = new ArrayList<Alarm>();
		String messageListStr = "";
		String commStr = tL1CommandConfig.getCollectAllAlarmComm();
		
		messageListStr = this.eponOper.collect(commStr);
		

		WxLogger.flow.info(title + commStr + LINE_SEPARATOR + messageListStr);
		
		
		if (messageListStr
				.contains("the alarm does not exist ErrorCode: 2686058502 (告警不存在)")) {
			throw new AdapterException("厂家网管反馈信息：the alarm does not exist ErrorCode: 2686058502 (告警不存在)");
		}
		// 解析报文

		alarmBeanList = MessageParser.parseAlarm(messageListStr);

		// 构造AlarmModel
		for (AlarmBean obj : alarmBeanList) {
			
			alarmList.add(decodeAlarm(obj));
		
		}

		// 清除数据
		alarmBeanList.clear();
		// 打印提示
		WxLogger.flow.info("查询到当前告警" + alarmList.size() + "条！");
		// 返回数据
		return alarmList;
	}

	public List<Alarm> getAllActiveAlarms(String oltid) {
		// 暂不支持
		return null;
	}

	/**
	 * 由TL1告警对象构造告警模型对象
	 * 
	 * @param alarmBean
	 *            TL1告警对象
	 * @return alarmModel 告警模型对象
	 * @throws AdapterException
	 */
	public Alarm decodeAlarm(AlarmBean alarmBean) {
		Alarm alarm = new Alarm();

		// 设备告警时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH24mmss");
		if (alarmBean.getHappenTime() != null
				&& !alarmBean.getHappenTime().contentEquals("")) {
//            System.out.println(alarmBean.getHappenTime());
       
			alarm.time(HuaweiHelper.mapTime(alarmBean.getHappenTime()));
		} else {
			alarm.time(sdf.format(new Date()));
		}

		// 告警原因
		// 1，设备掉电；2，设备重启；3，设备和网管之间的网路不通；4，设备;
		alarm.cause(HuaweiAlarmNameMapping.getAlarmNameByEventCode(alarmBean
				.getEventCode()));

		// 告警等级
		alarm.severity(HuaweiHelper.mapAlarmSeverity(alarmBean.getSeverity()));
		// 告警内容
		alarm.content(alarmBean.getAlarmName());
		// 告警类型
		alarm.type(HuaweiHelper.mapAlarmType(alarmBean.getAlarmType()));


		if("ONU".equals(alarmBean.getdTpye())){
			alarm.objectType(ObjectType.ONU);
		}else{
			alarm.objectType(ObjectType.OLT);
		}
		
		if (alarmBean.getPosition() != null) {
			
			if("ONU".equals(alarmBean.getdTpye())){
				alarm.objectName(new String[] {alarmBean.getDip(), getONUName(alarmBean.getPosition()) });
			}else{
				alarm.objectName(getPortPosition(alarmBean.getPosition(),alarmBean.getDip()));
			}
		}

		alarm.description(alarmBean.getProbableCauseDesc());

		alarm.remark(alarmBean.getAditionalInfo());
		// 发生在同一台设备的同一个位置的同一故障编号确认为 同一条告警
		alarm.alarmId(alarmBean.getDip() + "#" + alarmBean.getPosition() + "#"
				+ alarmBean.getEventCode());

		return alarm;
	}

	


	
	private String[] getPortPosition(String position, String dip) {
		Pattern pattern = Pattern.compile("RACK:NA,SHELF:(\\d+),SLOT:(\\d+),PORT:(\\d+)");
		Matcher matcher = pattern.matcher(position);
		if(matcher.find()){
			return new String[]{dip,matcher.group(1),matcher.group(2),matcher.group(3)};
		}
		WxLogger.flow.info("获取告警的position中的onuName失败:"+position);
		return null;
	}


	private String getONUName(String position) {
		Pattern pattern = Pattern.compile("(?<=ONUNAME:).*");
		Matcher matcher = pattern.matcher(position);
		if(matcher.find()){
			return matcher.group();
		}
		WxLogger.flow.info("获取告警的position中的onuName失败:"+position);
		return null;
	}
	
	public static void main(String[] args) {
		HuaweiAdapter a = new HuaweiAdapter();
		System.out.println(a.getONUName("RACK:NA,SHELF:0,SLOT:0,PORT:1,ONUNUM:2,ONUNAME:恩福ONU"));
		String[] aa = a.getPortPosition("RACK:NA,SHELF:0,SLOT:7,PORT:1","10.1");
		for (String string : aa) {
			
			System.out.println(string);
		}
	}


	/**
	 * @throws ConnectionException 
	 * @throws AdapterException 
	 * 获取olt性能 由com.metarnet.sfpw.hw.trans.HuaweiPerfMgrImpl.syncAllPerf()方法所用
	 * @return
	 * @throws  
	 */
	public List<OltPerformance> getOltPerformances() throws AdapterException, ConnectionException {
		List<OltPerformance> oltPerfList = new ArrayList<OltPerformance>();

		List<OLT> oltList = getAllOLTs();
		try {
			// 打印提示
			WxLogger.flow.info("开始采集Olt性能数据");

			List<DeviceInfo> deviceInfoList = null;
			for (OLT dev : oltList) {

				String messageListStr = this.eponOper.collect(tL1CommandConfig
						.getCollectOltDeviceInfoComm().replace("${oltId}",
								dev.address()));
				deviceInfoList = MessageParser.parseDeviceInfo(messageListStr);
				
				DeviceInfo device = deviceInfoList.get(0);
				OltPerformance perf = new OltPerformance();
				perf.setEquipmentId(dev.oltId());
				perf.setEntPhysicalName(dev.name());
				perf.setEntPhysicalDescr(dev.name());
				perf.setCpuUsage(device.getCpu() + "");
				perf.setCpuUsageThreshold("100");
				perf.setMemUsage(device.getMem() + "");
				perf.setMemUsageThreshold("100");
				perf.setMemSize("NA");
				perf.setGatherTime(new SimpleDateFormat("yyyy/mm/dd HH:mm:ss").format(new Date()));

				oltPerfList.add(perf);

			}
			


		} catch (Exception e) {
		
			
		}
		return oltPerfList;

	}

	/**
	 * 获取端口性能 由com.metarnet.sfpw.hw.trans.HuaweiPerfMgrImpl.syncAllPerf()方法所用
	 * @return
	 * @throws AdapterException 
	 * @throws ConnectionException 
	 */
	public List<IfPerformance> getIfperformance() throws AdapterException, ConnectionException {

		List<IfPerformance> perfList = new ArrayList<IfPerformance>();
		List<OltBean> oltBeanList = new ArrayList<OltBean>();
		List<BoardBean> boardBeanObjList = null;

			
			String oltListStr = this.eponOper.collect(tL1CommandConfig.getCollectAllOltComm());
			
			oltBeanList = MessageParser.parseOlt(oltListStr);
			// 遍历所有OLT
			for (OltBean oltBean : oltBeanList) {
				// 转换类型
				String boardListStr;
				try {
					boardListStr = this.eponOper.collect(tL1CommandConfig.getCollectAllBoardOfOltComm().replace(
							"${oltId}", oltBean.getDevIp()));
				} catch (AdapterException e1) {
					WxLogger.flow.info("getIfperformance方法中：获取olt下所有Board失败");
					continue;
				}
				boardBeanObjList = MessageParser.parseBoard(boardListStr);


				for (Object board : boardBeanObjList) {
					BoardBean bb = (BoardBean) board;

					if (bb.getbService().equals("EPON"))// 如果是OLT的PON板
					{
						for (int i = 0; i < Integer.valueOf(bb.getpNum()); i++) {
							// 找出该PON板下所有口连接的ONU状态

							List<OnuState> onuStateList;
							try {
								onuStateList = MessageParser.parseOnuState(eponOper.collect(tL1CommandConfig
										.getCollectOnuOnuStateComm()
										.replace("${oltId}", bb.getOltId())
										.replace("${ponId}",
												bb.getBoardId() + "-" + i)));
							} catch (AdapterException e1) {
							
								WxLogger.flow.info("获取olt下的pon板的onu状态失败");
								continue;
							}
							List<PonPerf> ponPerfList = null;

							String ponPerfCommstr = "";
							if (onuStateList.size() > 0
									&& onuStateList.get(0).getAdminState()
											.equals("UP")
									&& onuStateList.get(0).getOperState()
											.equals("UP")) {
											
								ponPerfCommstr = tL1CommandConfig
										.getCollectOltPonPerfComm()
										.replace("${oltId}", bb.getOltId())
										.replace("${ponId}",
												bb.getBoardId() + "-" + i);
								
							}
							
							else
								
							{
								continue;
			
							}

							try {
//								ponPerfList = CollectPonPerf(ponPerfCommstr);
								ponPerfList = MessageParser.parsePonPerf(eponOper.collect(ponPerfCommstr));
							} catch (AdapterException e) {
								WxLogger.flow.error("采集PON 链路统计信息时出错" + e.getMessage());
//								e.printStackTrace();

							}
							if (ponPerfList != null && ponPerfList.size() > 0) {
								PonPerf pp = ponPerfList.get(0);

								IfPerformance perf = new IfPerformance();

								perf.setEquipmentId(oltBean.getDevIp());
								perf.setInterfaceId(bb.getBoardId() + "-" + i);
								
								perf.setIfStatus("UP");
								perf.setIfInOctets(pp.getInOctets() + "");
								perf.setIfInUcastPkts(pp.getInUnicastPkts()
										+ "");
								perf.setIfInNUcastPkts("");
								perf.setIfInDiscards(pp.getInDiscards() + "");
								perf.setIfInErrors(pp.getInErrors() + "");
								perf.setIfInUnknownProtos("");
								perf.setIfOutOctets(pp.getOutOctets() + "");
								perf.setIfOutUcastPkts(pp.getOutUnicastPkts()
										+ "");
								perf.setIfOutNUcastPkts("");
								perf.setIfOutErrors(pp.getOutErrors() + "");
								perf.setIfOutDiscards(pp.getOutDiscards() + "");

								perfList.add(perf);
							}

						}
					}

				}
			}

			//logout();
 

		// 打印提示
		WxLogger.flow.info("查询到性能数据" + perfList.size() + "条！");

		return perfList;
	}

	

	
	public void init() throws ServiceException {
//		configManager = new ConfigManager();
		tL1CommandConfig = new TL1CommandConfig();
//		this.eponOper = new EponOper(configManager);
		WxLogger.init.info("采集接口初始化完成。。。");
	}


//=============以下为report接口相关方法，暂时用不着=======================================================
	public void setReporter(Reporter arg0) {
		
	}

	public boolean clearAlarm(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getSystemTime() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean raiseAlarm(Alarm arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean raiseIfPerformance(IfPerformance arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean raiseOltPerformance(OltPerformance arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public RunStatus status() {
		// TODO Auto-generated method stub
		return null;
	}

	public void status(RunStatus arg0) {
		// TODO Auto-generated method stub
		
	}

//	================================================
	
	/**
	 * 没有用到
	 * @throws ConnectionException 
	 */
	public OLT getOLT(String oltId) throws AdapterException, ConnectionException {

		List<OLT> devList = new ArrayList<OLT>();

		// 查出所有的OLT，返回List<Object>
		List<OltBean> oltBeanList;
		try {
			oltBeanList = MessageParser.parseOlt(eponOper.collect(tL1CommandConfig
					.getCollectOltDeviceInfoComm().replace("${oltId}", oltId)));
		} catch (AdapterException e) {
			WxLogger.flow.info("采集到OLT" + devList.size() + "个！");
			return new OLT();
		}
		

		// 转换类型
		OltBean oltBean = (OltBean) oltBeanList.get(0);
		OLT oltModel = new OLT();
		if(oltBean!=null){
		
		oltModel.name(oltBean.getDevName());
		oltModel.oltId(oltId);
		oltModel.type(oltBean.getDt());// me.dt oltBean.getDt()
		oltModel.version(oltBean.getDever());
		oltModel.address(oltBean.getDevIp());
		oltModel.vendor(Vendor.HUAWEI);
			
		}

		return oltModel;

	}

	
	/**
	 * 没有用到
	 * @throws ConnectionException 
	 */
	public List<UNI> getAllUNIs(String oltId) throws ConnectionException {

		List<UNI> devList = new ArrayList<UNI>();
		List<BoardBean> boardBeanObjList = new ArrayList<BoardBean>();


		// 查询OLT其下所有的ONU
		List<OnuBean> onuBeanObjList ;
		try {
			String messageListStr = eponOper.collect(tL1CommandConfig.getCollectAllOnuOfOltComm().replace("${oltId}", oltId));
			onuBeanObjList = MessageParser.parseOnu(messageListStr);
		} catch (AdapterException e1) {
			// TODO Auto-generated catch block
			return devList;
		}
		
		// 遍历所有ONU
		List<BoardBean> objList = new ArrayList<BoardBean>();
		for (Object onuObj : onuBeanObjList) {
			OnuBean onuBean = (OnuBean) onuObj;
			if (!onuBean.getOnuType().equals("")
					&& !onuBean.getOnuType().equals("--"))// 为了过滤掉一个异类的ONU，其没有OnuType
			{
				// 具有IP的ONU
				if (onuBean.getIp() != null && !onuBean.getIp().equals("")) {

					// 根据IP查询其下的所有板卡
					try {
						String boardListStr = this.eponOper.collect(tL1CommandConfig.getCollectAllBoardOfOnuWithIpComm().replace("${onuIp}", onuBean.getIp()));
						objList  = MessageParser.parseBoard(boardListStr);
					} catch (AdapterException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else// 不具有IP的ONU
				{

					String ponId = onuBean.getPonId();
					String onuIdType = onuBean.getOnuType();
					String onuId = onuBean.getOnuId();

					
					String boardListStr;
					try {
						boardListStr = this.eponOper.collect(tL1CommandConfig
								.getCollectAllBoardOfOnuWithoutIpComm()
								.replace("${oltId}", oltId)
								.replace("${ponId}", ponId)
								.replace("${onuIdType}", onuIdType)
								.replace("${onuId}", onuId));
						objList  = MessageParser.parseBoard(boardListStr);
					} catch (AdapterException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					

				}

				if (objList != null && objList.size() > 0) {

					boardBeanObjList.addAll(objList);
				}

			}

		}

		if (boardBeanObjList != null) {
			for (BoardBean boardBean : boardBeanObjList) {

				int ptpnum = 0;
				try {
					ptpnum = Integer.parseInt(boardBean.getpNum());

				} catch (Exception e) {
				}

				if (ptpnum > 0) {
					for (int i = 1; i <= ptpnum; i++) {

						UNI uni = new UNI();
						uni.oltId(boardBean.getOltId());
						uni.onuId(boardBean.getPonId() + "-"
								+ boardBean.getOnuId());
						uni.uniId(i + "");
						uni.type("transparent");
						uni.speed(Speed.SPEED100M);
						uni.name(boardBean.getBoardId() + "-" + i);
						uni.address();

						devList.add(uni);
					}
				}
			}
		}

		return devList;

	}

	
	public boolean addEquipment(AddEquipmentRequest addequipmentrequest) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean delEquipment(DelEquipmentRequest delequipmentrequest) {
		// TODO Auto-generated method stub
		return true;
	}
	public List<Splitter> getAllSplitters(String oltId) {

		return null;
		
	}
	public Map<String, Object> getResPm(Map<String, String> inParamMap,
			List<String> outParamList)

	{

		return null;
	}
}
