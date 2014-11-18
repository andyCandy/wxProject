package com.metarnet.sfpw.base.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.metarnet.adapter.model.ADPAlarm;
import com.metarnet.service.ServiceException;
import com.metarnet.sfpw.base.database.ITaskDatabase;
import com.metarnet.sfpw.base.model.Direction;
import com.metarnet.sfpw.base.model.EquipPerf;
import com.metarnet.sfpw.base.model.IfPerformance;
import com.metarnet.sfpw.base.model.ManagedElement;
import com.metarnet.sfpw.base.model.Port;
import com.metarnet.sfpw.base.model.TopologicalLink;
import com.metarnet.sfpw.base.timedtask.TaskInDB;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.base.util.Config;
import com.metarnet.util.SQLHelper;
import com.metarnet.util.XConfException;

public class Database implements IDatabase,ITaskDatabase{
	
	private Config config ;
	
	private String alias;
	
	private String move_to_history = "insert into com_ifperformance_history select com_ifperformanceseq.nextval,EQUIPMENTCODE,"
			+ "INTERFACECODE,IFSTATUS,IFWORKMODE,IFSPEED,IFERRORRATE,IFNOERRORTIME,IFINOCTETS,IFINUCASTPKTS,IFINNUCASTPKTS,"
			+ "IFINERRORS,IFINDISCARDS,IFINUNKNOWNPROTOS,IFOUTOCTETS,IFOUTUCASTPKTS,IFOUTNUCASTPKTS,IFOUTDISCARDS,IFOUTERRORS,gathertime "
			+ "from com_ifperformance ifp "
			+ "where performancecode not in (select performancecode from com_ifperformance_history) "
			+ "and ifp.interfacecode in "
			+ "(select i.interfacecode from eth_interface i where i.equipmentcode in "
			+ "(select e.equipmentcode from com_equipment e where e.domain = ?))";
	
	 public void setConfig(Config config) {
		this.config = config;
	}


	public void init()throws ServiceException{
		Properties info = new Properties();
		Connection conn = null;
		info.setProperty("user", config.getDbuser());
		info.setProperty("password", config.getDbpassword());
		System.out.println(config.getUser()+":"+config.getPassword());
		info.setProperty("proxool.house-keeping-test-sql", config.getHousekeeping());
		info.setProperty("proxool.maximum-connection-count", config.getMaxconn());
		info.setProperty("proxool.minimum-connection-count", config.getMinconn());
		this.alias = String.format("%1$s.%2$s", new Object[] { getClass().getName(), config.getDomain() });
		String url = "proxool." + alias + ":" + config.getDriver() + ":" + config.getUri();
		try{
			Class.forName("org.logicalcobwebs.proxool.ProxoolDriver");
		} catch (ClassNotFoundException ex) {
			throw new ServiceException("获取连接池驱动失败:" + ex.getMessage());
		}
		try{
			conn = DriverManager.getConnection(url, info);
		} catch (SQLException ex) {
			throw new ServiceException("创建连接池(" + alias + ")失败:" + ex.getMessage());
		} finally {
			SQLHelper.close(conn);
		}
			  
	}


			  
	public final Connection getConnection() throws SQLException{
		return DriverManager.getConnection("proxool." + this.alias);
	}

	
			  public static void main(String[] args) {
				Config config = new Config();
				try {
					config.readCfg();
				} catch (XConfException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(config.toString());
				Database d = new Database();
				d.setConfig(config);
				try {
					d.init();
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				d.move_to_history();
				//2014-08-20 11:58:47 kyland_wx_eth:TopologicalLink 
				//[linkcode=4fc2a4eefad02b19f15c, linkid=0, aMeId=57, aSlotId=null, aPortId=2, 
				//zMeId=80, zSlotId=null, zPortId=8, label=, rate=1000, direction=CD_BI, nativeEmsName=, type=null]

				
			}
			  
	/**
	 * 从数据库中取出某一厂家的全部当前告警
	 * @throws SQLException 
	 */
	public List<ADPAlarm> getAllActiveAlarm(String domain) throws SQLException {
		List<ADPAlarm> alarms = new ArrayList<ADPAlarm>();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = this.getConnection();
			String sql = "select a.alarmid from com_alarm a where a.domain = ?";
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, domain);
			rs = pst.executeQuery();
			while(rs.next()){
				ADPAlarm alarm = new ADPAlarm();
				alarm.setAlarmId(rs.getString("alarmid"));
				alarms.add(alarm);
			}
		}finally{
			try {
				close(conn,pst,rs,null,null);
			} catch (SQLException e) {
				WxLogger.db.error(e.getMessage(), e);
			}
		}
		return alarms;
	}
	
	public List<TaskInDB> getTasks(String domain) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<TaskInDB> tasks = new ArrayList<TaskInDB>();
		String sql = "select * from timed_task t where t.performer = ?";
		try {
			conn = this.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setString(1, domain);
			rs = pst.executeQuery();
			while(rs.next()){
				TaskInDB task = new TaskInDB();
				task.setValue(rs);
				tasks.add(task);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				close(conn,pst,rs,null,null);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		return tasks;
	}
	/**
	 * 从数据库获取某厂家某设备下的告警
	 */
	public List<ADPAlarm> getMeActiveAlarm(String domain, String meid) {
		String objectName = domain+"="+meid;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "select a.alarmid from com_alarm a where a.objectname like '"+objectName+"%'";
		List<ADPAlarm> alarms = new ArrayList<ADPAlarm>();
		try {
			conn = this.getConnection();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()){
				ADPAlarm alarm = new ADPAlarm();
				alarm.setAlarmId(rs.getString(1));
				alarms.add(alarm);
			}
		} catch (SQLException e) {
			WxLogger.db.error(e.getMessage(), e);
		}finally{
			try {
				close(conn,pst,rs,null,null);
			} catch (SQLException e) {
				WxLogger.db.error(e.getMessage(), e);
			}
		}
		return alarms;
	}

	/**
	 * 调用存储过程插入一条新告警
	 */
	public void raiseAlarm(String domain, ADPAlarm dalarm) {
		if(dalarm == null){
			return ;
		}
		WxLogger.db.info("告警入库："+dalarm.getAlarmId());
		Connection conn = null;
		CallableStatement cst = null;
		StringBuffer sql = new StringBuffer();
		sql.append("BEGIN ");
		sql.append("COM_RAISEALARM");
		sql.append("( :1, :2, :3, :4, :5, :6, :7, :8, :9, :10,:11,:12, ");
		sql.append("TO_DATE( :13, 'YYYYMMDDHH24MISS' ), ");
		sql.append(":14, :15, :16 ); END;");
		try {
			conn = this.getConnection();
			cst = conn.prepareCall(sql.toString());
			cst.setString(1, domain);
			cst.setString(2, dalarm.getAlarmId());
			cst.setString(3, dalarm.getObject().KIND);
			if("ManagedElement".equals(dalarm.getObject().KIND)){
				ManagedElement me = (ManagedElement)dalarm.getObject();
				cst.setString(4,me.getNativeEmsName()==null?"me":me.getNativeEmsName() );
				cst.setString(5, me.getMeId());
				cst.setString(6, null);
				cst.setString(7, null);
			}else{
				Port port = (Port)dalarm.getObject();
				cst.setString(4,port.getNativeEmsName()==null?"port":port.getNativeEmsName() );
				cst.setString(5, port.getMeId());
				cst.setString(6, port.getSlotId());
				cst.setString(7, port.getPortId());
			}
			cst.setString(8, "communication");
			cst.setString(9, dalarm.getSeverity().getSeverity());
			cst.setString(10, dalarm.getCause());
			cst.setString(11, dalarm.getDescription());
			cst.setString(12, dalarm.getDescription());
//			System.out.println(dalarm.getTime());
			//2013-06-06 03:16:02 --> 20130606031602
			String temp = dalarm.getTime().replace("-", "").replace(" ", "").replace(":", "");
			cst.setString(13, temp);
			cst.setString(14, "");
			// 注册参数
						// 注册参数: 执行结果 COM_RAISEALARM.OUT_RESULT
			cst.registerOutParameter(15, Types.INTEGER);
						// 注册参数: 错误原因 COM_RAISEALARM.OUT_REASON
			cst.registerOutParameter(16, Types.VARCHAR);
			cst.execute();
			int result = cst.getInt(15);
			String reason = cst.getString(16);
			if(result == 0){
				System.out.println("告警入库失败:"+reason);
				WxLogger.db.info("告警入库失败:"+reason);
			}
//			System.out.println(result+":"+reason);
		} catch (SQLException e) {
			WxLogger.db.error(e.getMessage(), e);
			System.out.println("告警"+dalarm.getAlarmId()+"入库失败："+e.getMessage());
//			e.printStackTrace();
		}finally{
			try {
				close(conn,null,null,cst,null);
			} catch (SQLException e) {
				WxLogger.db.error(e.getMessage(), e);
			}
		}
		
		
	}

	/**
	 * 调用存储过程，删除一条告警
	 */
	public void clearAlarm(String domain, ADPAlarm dalarm) {
		System.out.println("清除告警："+dalarm.getAlarmId());
		Connection conn = null;
		CallableStatement cst = null;
//		String sql = "call COM_CLEARALARM (?,?,?,?,?)";
		StringBuffer sql = new StringBuffer();
		sql.append("BEGIN ");
		sql.append("COM_CLEARALARM");
		sql.append("( :1, :2, SYSDATE, :3, 'SYNC', :4, :5 ); END;");
		try {
			conn = this.getConnection();
			cst = conn.prepareCall(sql.toString());
			cst.setString(1, domain);
			cst.setString(2, dalarm.getAlarmId());
			cst.setString(3, "");
			// 注册参数
						// 注册参数: 执行结果 COM_CLEARALARM.OUT_RESULT
			cst.registerOutParameter(4, Types.INTEGER);
						// 注册参数: 错误原因 COM_CLEARALARM.OUT_REASON
			cst.registerOutParameter(5, Types.VARCHAR);
			cst.execute();
			int result = cst.getInt(4);
			String reason = cst.getString(5);
			System.out.println("result:"+result+",reason:"+reason);
		} catch (SQLException e) {
			WxLogger.db.error(e.getMessage(), e);
		}finally{
			try {
				close(conn,null,null,cst,null);
			} catch (SQLException e) {
				WxLogger.db.error(e.getMessage(), e);
			}
		}
		
	}

	/**
	 * 同步一条设备信息
	 */
	public void saveME(String domain, ManagedElement me) {
		Connection conn = null;
		CallableStatement cst = null;
		try {
			conn = this.getConnection();
			String sql = "call adp_sync_equip(?,?,?,?,?,?,?)";
			cst = conn.prepareCall(sql);
			
			cst.setString(1, me.getEquipcode());
			cst.setString(2, me.getMeId());
			cst.setString(3, me.getType());
			cst.setString(4, me.getVersion());
			cst.setString(5, me.getNativeEmsName());
			cst.setString(6, me.getIpAddress());
			cst.setString(7, domain);
			
			cst.execute();
		} catch (SQLException e) {
			WxLogger.db.error(e.getMessage(), e);
		}finally{
			try {
				this.close(conn, null, null,cst,null);
			} catch (SQLException e) {
				WxLogger.db.error(e.getMessage(), e);
			}
		}
	}

	/**
	 * 同步端口信息
	 */
	public void savePorts(String domain, List<Port> ports) {
		if(ports == null || ports.size() == 0)
			return;
		for (Port port : ports) {
			this.savePort(domain, port);
		}
	}

	/**
	 * 
	 * @TODO 同步一条端口信息
	 * @return void
	 * @param domain
	 * @param port
	 *
	 */
	private void savePort(String domain, Port port) {
		Connection conn = null;
		CallableStatement cst = null;
		if(port==null)
			return;
		try {
			conn = this.getConnection();
			String sql = "call adp_sync_ethInterface(?,?,?,?,?,?,?,?,?)";
			cst = conn.prepareCall(sql);
			
			cst.setString(1, port.getMeId());
			cst.setString(2, port.getPortId());
			cst.setString(3, port.getSlotId());
			cst.setString(4, port.getNativeEmsName());
			cst.setString(5, port.getType());
			cst.setString(6, domain);
			cst.setString(7, port.getPortcode());
			StringBuffer location = new StringBuffer(); 
			location.append(1).append("-");
			location.append(1).append("-");
			location.append(port.getSlotId()).append("-");
			location.append(port.getPortId());
			cst.setString(8, location.toString());
			cst.setString(9, port.getConnectionState());
			
			cst.execute();
		} catch (SQLException e) {
			WxLogger.db.error(domain+":"+port);
			WxLogger.db.error(e.getMessage(), e);
		}finally{
			try {
				this.close(conn,null,null,cst,null);
			} catch (SQLException e) {
				WxLogger.db.error(e.getMessage(), e);
			}
		}
	}

	/**
	 * 同步拓扑信息
	 */
	public void saveTLs(String domain, List<TopologicalLink> topolist) {
		WxLogger.flow.info("同步拓扑入库操作开始，需要入库的拓扑有"+topolist.size()+"条，先清除库中的拓扑");
		int count = removeAllTLs(domain);
		if(count == -1){
			WxLogger.flow.error("同步拓扑失败，原因：入库前，库内拓扑清除时发生异常");
			return;
		}
		WxLogger.flow.info("清理库中拓扑"+count+"条，开始将采到的拓扑入库");
		for (TopologicalLink topologicalLink : topolist) {
			this.saveTL(domain, topologicalLink);
		}
	}

	private int removeAllTLs(String domain) {
		Connection conn = null;
		PreparedStatement pst = null;
		int count = -1;
		try {
			conn = this.getConnection();
			pst = conn.prepareStatement("delete from eth_link l where l.domain = ?");
			pst.setString(1, domain);
			count = pst.executeUpdate();
			
		} catch (SQLException e) {
			WxLogger.db.error("removeAllTls sql执行失败",e);
		}finally{
			try {
				this.close(conn, pst, null, null,null);
			} catch (SQLException e) {
				WxLogger.db.error("removeAllTls 关闭连接失败",e);
			}
		}
		return count;
	}


	/**
	 * 
	 * @TODO 同步一条拓扑信息
	 * @return void
	 * @param domain
	 * @param topo
	 *
	 */
	private void saveTL(String domain,TopologicalLink topo){
		WxLogger.res_config.info("saveTL:"+topo.toString());
		Connection conn = null;
		CallableStatement cst = null;
		String sql = "call ADP_SYNC_ETH_LINK (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			conn = this.getConnection();
			cst = conn.prepareCall(sql);
			cst.setString(1, topo.getLinkcode());
			cst.setString(2, topo.getLinkid());
			cst.setString(3, topo.getaMeId());
			cst.setString(4, topo.getaSlotId());
			cst.setString(5, topo.getaPortId());
			cst.setString(6, topo.getzMeId());
			cst.setString(7, topo.getzSlotId());
			cst.setString(8, topo.getzPortId());
			cst.setString(9, topo.getRate());
			cst.setString(10, topo.getDirection().desc());
			cst.setString(11, topo.getNativeEmsName());
			cst.setString(12, domain);
			cst.execute();
		} catch (SQLException e) {
			WxLogger.db.error(domain+":"+topo);
			WxLogger.db.error(e.getMessage(), e);
			e.printStackTrace();
		}finally{
			try {
				close(conn,null,null,cst,null);
			} catch (SQLException e) {
				WxLogger.db.error(e.getMessage(), e);
			}
		}
	}
	

	/**
	 * 同步网元
	 */
	public void saveME(String domain, List<ManagedElement> meList) {
		if(meList.size() == 0)
			return;
		for (ManagedElement managedElement : meList) {
			this.saveME(domain, managedElement);
		}
		
	}


	/**
	 * 同步时标记记录同步状态
	 */
	public void flag(String domain, String meid,boolean isFinished) {
		Connection conn = null;
		CallableStatement cst = null;
		try {
			conn = this.getConnection();
			String sql = "call ADP_SYNC_FLAG_ETH(?,?,?)";
			cst = conn.prepareCall(sql);
			cst.setString(1, domain);
			
			cst.setString(2, meid);
		
			cst.setString(3, isFinished?"1":"0");
			cst.execute();
		} catch (SQLException e) {
			WxLogger.db.error(e.getMessage(), e);
		}finally{
			try {
				this.close(conn, null, null, cst,null);
			} catch (SQLException e) {
				WxLogger.db.error(e.getMessage(), e);
			}
		}
		
	}

	/**
	 * 同步端口性能
	 */
	public void saveIfPM(String domain,List<IfPerformance> ifPerfList) {
		this.move_to_history();
		for (IfPerformance ifPerformance : ifPerfList) {
			this.saveSingleIfPm(domain, ifPerformance);
		}
	}
	
	public void saveSingleIfPm(String domain,IfPerformance pm){
		Connection conn = null;
		CallableStatement cst = null;
		String sql = "call eth_ifperformance (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			conn = this.getConnection();
			cst = conn.prepareCall(sql);
			cst.setString(1, domain);
			cst.setString(2, pm.getMeId());
			cst.setString(3, pm.getPortId());
			cst.setString(4, "");
			cst.setString(5, "");
			cst.setString(6, pm.getLayerRate()+"");
			cst.setString(7, "");
			cst.setString(8, "");
			cst.setString(9, pm.getIfInOctets()+"");
			cst.setString(10, pm.getIfInUcastPkts()+"");
			cst.setString(11, pm.getIfInNUcastPKts()+"");
			cst.setString(12, "");
			cst.setString(13, "");
			cst.setString(14, "");
			cst.setString(15, pm.getIfOutOctets()+"");
			cst.setString(16, pm.getIfOutUcastPkts()+"");
			cst.setString(17, pm.getIfOutNUcastPkts()+"");
			cst.setString(18, "");
			cst.setString(19, "");
			cst.setString(20, pm.getRetrievalTime());
			cst.setString(21, pm.getPortName());
//			System.out.println("time:"+pm.getRetrievalTime());
			cst.registerOutParameter(22,4 );
			cst.registerOutParameter(23, 12);
			cst.execute();
			int result = cst.getInt(22);
			String reason = cst.getString(23);
			if(result != 1){
				WxLogger.db.info("执行失败："+reason);
			}
		} catch (SQLException e) {
			WxLogger.db.error(e.getMessage(), e);
			e.printStackTrace();
		}finally{
			try {
				close(conn,null,null,cst,null);
			} catch (SQLException e) {
				WxLogger.db.error(e.getMessage(), e);
			}
		}
	}
	
	/**
	 * 同步网元性能
	 */
	public void saveMePM(String domain,List<EquipPerf> equipPerfList) {
		for (EquipPerf equipPerf : equipPerfList) {
			this.saveSingleMePm(equipPerf, domain);
		}
		
	}
	
	
	
	public void saveSingleMePm(EquipPerf equipPerf,String domain){
		Connection conn = null;
		CallableStatement cst = null;
		String sql = "call ADP_SYNC_ETH_MEPM (?,?,?,?,?,?,?,?)";
		try {
			conn = this.getConnection();
			cst = conn.prepareCall(sql);
			cst.setString(1, equipPerf.getEquipCode());
			cst.setString(2, ((ManagedElement)equipPerf.getEquip()).getMeId());
			cst.setString(3, domain);
			cst.setString(4, equipPerf.getDevMemoryTotalNum());
			cst.setString(5, equipPerf.getCpuCurrentUtilRate());
			cst.setString(6, equipPerf.getCpuLongTimeUtilRate());
			cst.setString(7, equipPerf.getDevMemoryAllocNum());
			cst.setString(8, equipPerf.getDevMemoryFreeNum());
			cst.execute();
		} catch (SQLException e) {
			WxLogger.db.error(e.getMessage(), e);
			System.out.println("性能入库失败："+e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getSQLState());
			e.printStackTrace();
		}finally{
			try {
				close(conn,null,null,cst,null);
			} catch (SQLException e) {
				WxLogger.db.error(e.getMessage(), e);
			}
		}
	}
	
	public boolean move_to_history(){
		
		Connection conn = null;
		PreparedStatement pst = null;
		Statement st = null;
		int count = - 1;
		try {
			conn = this.getConnection();
			pst = conn.prepareStatement(move_to_history);
			pst.setString(1, config.getDomain());
			count = pst.executeUpdate();
			System.out.println(count);
			st = conn.createStatement();
			count = st.executeUpdate("delete from com_ifperformance ifp where ifp.interfacecode in "
					+ "(select i2.interfacecode from eth_interface i2 where i2.equipmentcode in "
					+ "(select e2.equipmentcode from com_equipment e2 where e2.domain = '"+config.getDomain()+"'))");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				this.close(conn, pst, null, null,st);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(count+"条性能数据从当前库挪到历史库");
		return count != -1;
		
	}
	
	private void close(Connection conn,PreparedStatement pst,ResultSet rs, CallableStatement cst,Statement st) throws SQLException{
		if(rs != null){
			rs.close();
		}
		if(st != null){
			st.close();
		}
		if(pst != null){
			pst.close();
		}
		if(cst != null){
			cst.close();
		}
		if(conn != null){
			conn.close();
		}
	}


	public void updatePortToEquip(String domain) {
		Connection conn = null;
		Statement st = null;
		int count = -2;
		String sql = "update eth_interface i "
				+ "set i.anotherendequipname = getlinkequip(i.interfacecode,i.equipmentcode,'"+domain+"') "
				+ "where i.sync_status <> 'ZT03' "
				+ "and i.equipmentcode in (select equipmentcode from com_equipment where domain = '"+domain+"')";
		
		try {
			conn = this.getConnection();
			st = conn.createStatement();
			count = st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("更新端口去向失败，"+e.getMessage());
			WxLogger.db.error("更新端口去向失败，"+e.getMessage(), e);
		}finally{
			try {
				this.close(conn, null, null, null, st);
			} catch (SQLException e) {
				System.out.println("关闭连接异常，"+e.getMessage());
				WxLogger.db.error("关闭连接异常，"+e.getMessage(), e);
			}
		}
		
		
	}
	
	
	
}
