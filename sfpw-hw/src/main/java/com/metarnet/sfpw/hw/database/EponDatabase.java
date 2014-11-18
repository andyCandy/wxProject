package com.metarnet.sfpw.hw.database;


import com.metarnet.common.RunStatus;
import com.metarnet.epon.adapter.Interface;
import com.metarnet.epon.adapter.ONU;
import com.metarnet.epon.input.BasicInputDatabase;
import com.metarnet.epon.input.InputAlarm;
import com.metarnet.epon.input.InputCorrect;
import com.metarnet.epon.input.InputDatabase;
import com.metarnet.epon.input.InputException;
import com.metarnet.epon.input.InputIfPerformance;
import com.metarnet.epon.input.InputInterface;
import com.metarnet.epon.input.InputOLT;
import com.metarnet.epon.input.InputONU;
import com.metarnet.epon.input.InputOltPerformance;
import com.metarnet.epon.input.InputResult;
import com.metarnet.epon.input.InputSplitter;
import com.metarnet.epon.input.InputUNI;
import com.metarnet.sfpw.base.database.ITaskDatabase;
import com.metarnet.sfpw.base.timedtask.TaskInDB;
import com.metarnet.sfpw.base.util.CodeGenerator;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.hw.entity.SyncStatus;
import com.metarnet.sfpw.hw.util.HuaweiHelper;
import com.metarnet.util.SQLHelper;
import com.metarnet.util.XConfException;
import com.metarnet.util.XPathConfManager;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util. List;
import java.util.Properties;
import java.util.logging.Logger;


public class EponDatabase implements ITaskDatabase,InputDatabase
{
  private String domain;
  private String uri;
  private String username;
  private String password;
  private String minconns;
  private String maxconns;
  private static final String TESTSQL = "SELECT SYSDATE FROM DUAL";
  private static final String T_DOMAIN = "COM_DOMAIN";
  private static final String T_OLT = "COM_EQUIPMENT";
  private static final String T_INTERFACE = "EPON_INTERFACE";
  private static final String T_SPLITTER = "EPON_SPLITTER";
  private static final String T_ONU = "EPON_ONU";
  private static final String T_UNI = "EPON_UNI";
  private static final String T_SYNCTASK = "COM_SYNCTASK";
  private static final String T_SYNCOLT = "COM_SYNCEQUIPMENT";
  private static final String T_CORRECT = "COM_CORRECT";
  private static final String S_CORRECT = "COM_CORRECTSEQ";
  private static final String V_ACTIVEALARM = "COM_ACTIVEALARM";
  private static final String P_RAISEALARM = "COM_RAISEALARM";
  private static final String P_CLEARALARM = "COM_CLEARALARM";
  private static final String P_RAISEOLTPERFORMANCE = "EPON_OLT_PERFORMANCE";
  private static final String P_RAISEIFPERFORMANCE = "EPON_IFPERFORMANCE";
  
  String move_to_history = "insert into com_ifperformance_history select com_ifperformanceseq.nextval,EQUIPMENTCODE,INTERFACECODE,IFSTATUS,"
  		+ "IFWORKMODE,IFSPEED,IFERRORRATE,IFNOERRORTIME,IFINOCTETS,IFINUCASTPKTS,IFINNUCASTPKTS,IFINERRORS,IFINDISCARDS,IFINUNKNOWNPROTOS,IFOUTOCTETS,"
  		+ "IFOUTUCASTPKTS,IFOUTNUCASTPKTS,IFOUTDISCARDS,IFOUTERRORS,gathertime from com_ifperformance ifp "
  		+ "where performancecode not in (select performancecode from com_ifperformance_history)"
  		+ "and ifp.interfacecode in  (select i.interfaceid from epon_interface i where i.oltcode in "
  		+ "(select e.equipmentcode from com_equipment e where domain = 'hw_wx_epon' and e.type = 'OLT'))";

  public EponDatabase()
  {

  }

  
  
  protected void initDB()
    throws InputException
  {
	  try {
		XPathConfManager.createManager("conf/config_hw_epon.xml");
	} catch (XConfException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	  XPathConfManager xpath = XPathConfManager.instance();
	  
    try{
    this.domain = xpath.evaluate("//common/@domain");
    
    
   this.uri = xpath.evaluate("//common/database/uri");
   this.username = xpath.evaluate("//common/database/user");
   
   this.password = xpath.evaluate("//common/database/password");

    this.maxconns = xpath.evaluate("//common/database/@maxconn");
    this.minconns = xpath.evaluate("//common/database/@minconn");
    }catch(XConfException e){
    	e.printStackTrace();
    	throw new InputException("配置读取异常");
    }
  }

  protected void startDB()
    throws InputException
  {
    Connection conn = null;
    Properties props = new Properties();
    StringBuffer url = new StringBuffer();

    props.setProperty("proxool.minimum-connection-count", this.minconns);
    props.setProperty("proxool.maximum-connection-count", this.maxconns);
    props.setProperty("proxool.house-keeping-test-sql", "SELECT SYSDATE FROM DUAL");
    props.setProperty("user", this.username);
    props.setProperty("password", this.password);
    url.append("proxool.input_").append(this.domain);
    url.append(":oracle.jdbc.driver.OracleDriver:");
    url.append(uri);
    try
    {
      Class.forName("org.logicalcobwebs.proxool.ProxoolDriver");

      conn = DriverManager.getConnection(url.toString(), props);
    }
    catch (ClassNotFoundException e) {
      throw new InputException("类文件找不到异常.", e);
    }
    catch (SQLException e) {
      throw new InputException("SQL异常.", e);
    }
    finally
    {
      SQLHelper.close(conn);
    }
  }
  
  
  public void init() throws InputException{
		this.initDB();
		this.startDB();
		WxLogger.init.error("数据库初始化完成。。。");
  }


  public InputOLT getOLT(String oltId)
    throws InputException
  {
    Connection conn = null;
    ResultSet result = null;
    PreparedStatement stmt = null;
    InputOLT olt = null;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("SELECT NAME, TYPE, VERSION, ");
      sql.append("ADDRESS, VENDOR FROM ");
      sql.append("COM_EQUIPMENT");
      sql.append(" WHERE DOMAIN=:1 AND EQUIPMENTID=:2");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, this.domain);

      stmt.setString(2, oltId);

      result = stmt.executeQuery();

      if (result.next())
      {
        olt = new InputOLT(oltId);

        olt.name(result.getString(1));

        olt.type(result.getString(2));

        olt.version(result.getString(3));

        olt.address(result.getString(4));

        olt.vendor(result.getString(5));
      }
    }
    catch (SQLException e) {
      throw new InputException("获取指定OLT信息异常.", e);
    }
    finally
    {
      SQLHelper.close(result);

      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return olt;
  }

  public List<InputOLT> getAllOLTs()
    throws InputException
  {
    Connection conn = null;
    ResultSet result = null;
    PreparedStatement stmt = null;
    List oltList = new ArrayList();
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("SELECT EQUIPMENTID, NAME, TYPE, ");
      sql.append("VERSION, ADDRESS, VENDOR FROM ");
      sql.append("COM_EQUIPMENT");
      sql.append(" WHERE DOMAIN=:1 and  TYPE='OLT' ");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, this.domain);

      result = stmt.executeQuery();

      while (result.next())
      {
        InputOLT olt = new InputOLT();

        olt.oltId(result.getString(1));

        olt.name(result.getString(2));

        olt.type(result.getString(3));

        olt.version(result.getString(4));

        olt.address(result.getString(5));

        olt.vendor(result.getString(6));

        oltList.add(olt);
      }
    }
    catch (SQLException e) {
      throw new InputException("获取所有OLT信息异常.", e);
    }
    finally
    {
      SQLHelper.close(result);

      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return oltList;
  }

  public List<InputInterface> getAllInterfaces(String oltId)
    throws InputException
  {
    Connection conn = null;
    ResultSet result = null;
    PreparedStatement stmt = null;
    List interfaceList = new ArrayList();
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("SELECT I.INTERFACEID, I.NAME, I.TYPE, I.SPEED, ");
      sql.append(" I.ADDRESS FROM ");
      sql.append("COM_EQUIPMENT").append(" E, ");
      sql.append("EPON_INTERFACE").append(" I ");
      sql.append("WHERE E.DOMAIN=:1 AND E.EQUIPMENTID=:2 ");
      sql.append("AND E.EQUIPMENTCODE=I.OLTCODE");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, this.domain);

      stmt.setString(2, oltId);

      result = stmt.executeQuery();

      while (result.next())
      {
        InputInterface _interface = new InputInterface(oltId);

        _interface.interfaceId(result.getString(1));

        _interface.name(result.getString(2));

        _interface.type(result.getString(3));

        _interface.speed(result.getString(4));

        _interface.address(result.getString(5));

        interfaceList.add(_interface);
      }
    }
    catch (SQLException e) {
      throw new InputException("获取指定OLT所有接口信息异常.", e);
    }
    finally
    {
      SQLHelper.close(result);

      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return interfaceList;
  }

  public List<InputSplitter> getAllSplitters(String oltId)
    throws InputException
  {
    Connection conn = null;
    ResultSet result = null;
    PreparedStatement stmt = null;
    List splitterList = new ArrayList();
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("SELECT S.SPLITTERID, S.INTERFACEID, S.NAME, S.TYPE FROM ");
      sql.append("COM_EQUIPMENT").append(" E, ");
      sql.append("EPON_SPLITTER").append(" S ");
      sql.append("WHERE E.DOMAIN=:1 AND E.EQUIPMENTID=:2 ");
      sql.append("AND E.EQUIPMENTCODE=S.OLTCODE");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, this.domain);

      stmt.setString(2, oltId);

      result = stmt.executeQuery();

      while (result.next())
      {
        InputSplitter splitter = new InputSplitter(oltId);

        splitter.splitterId(result.getString(1));

        splitter.interfaceId(result.getString(2));

        splitter.name(result.getString(3));

        splitter.type(result.getString(4));

        splitterList.add(splitter);
      }
    }
    catch (SQLException e) {
      throw new InputException("获取指定OLT所有分光器信息异常.", e);
    }
    finally
    {
      SQLHelper.close(result);

      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return splitterList;
  }

  public List<InputONU> getAllONUs(String oltId)
    throws InputException
  {
    Connection conn = null;
    ResultSet result = null;
    PreparedStatement stmt = null;
    List onuList = new ArrayList();
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("SELECT EQUIPMENTID, E.INTERFACEID, E.NAME, ");
      sql.append("E.TYPE, E.MAC, E.ADDRESS, E.VENDOR FROM ");
      sql.append("COM_EQUIPMENT").append(" E ");
      sql.append("WHERE E.TYPE=:1 ");
      sql.append("AND E.OLTCODE=:2");
      
      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, "ONU");

      stmt.setString(2, oltId);

      result = stmt.executeQuery();

      while (result.next())
      {
        InputONU onu = new InputONU(oltId);

        onu.onuId(result.getString(1));

        onu.interfaceId(result.getString(2));

        onu.name(result.getString(3));

        onu.type(result.getString(4));

        onu.mac(result.getString(5));

        onu.ip(result.getString(6));

        onu.vendor(result.getString(7));

        onuList.add(onu);
      }
    }
    catch (SQLException e) {
      throw new InputException("获取指定OLT所有ONU信息异常.", e);
    }
    finally
    {
      SQLHelper.close(result);

      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return onuList;
  }

  public List<InputUNI> getAllUNIs(String oltId)
    throws InputException
  {
    Connection conn = null;
    ResultSet result = null;
    PreparedStatement stmt = null;
    List uniList = new ArrayList();
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("SELECT U.ONUID, U.UNIID, U.NAME, U.TYPE, U.SPEED, U.ADDRESS FROM ");
      sql.append("COM_EQUIPMENT").append(" E, ");
      sql.append("EPON_UNI").append(" U ");
      sql.append("WHERE E.DOMAIN=:1 AND E.EQUIPMENTID=:2 ");
      sql.append("AND E.EQUIPMENTCODE=U.OLTCODE");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, this.domain);

      stmt.setString(2, oltId);

      result = stmt.executeQuery();

      while (result.next())
      {
        InputUNI uni = new InputUNI(oltId);

        uni.onuId(result.getString(1));

        uni.uniId(result.getString(2));

        uni.name(result.getString(3));

        uni.type(result.getString(4));

        uni.speed(result.getString(5));

        uni.address(result.getString(6));

        uniList.add(uni);
      }
    }
    catch (SQLException e) {
      throw new InputException("获取指定OLT所有UNI信息异常.", e);
    }
    finally
    {
      SQLHelper.close(result);

      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return uniList;
  }

  public boolean startSyncTask(String taskId)
  {
    boolean result = false;
    Connection conn = null;
    PreparedStatement stmt = null;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("UPDATE ");
      sql.append("COM_SYNCTASK");
      sql.append(" SET BEGINTIME=SYSDATE, BEGINUSER=:1 ");
      sql.append("WHERE TASKID=:2 AND DOMAIN=:3");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, this.domain);

      stmt.setString(2, taskId);

      stmt.setString(3, this.domain);

      if (stmt.executeUpdate() == 1)
      {
        result = true;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("开始同步任务异常:" + e.getMessage());
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return result;
  }

  public boolean finishSyncTask(String taskId, boolean result, String description)
  {
    boolean _result = false;
    Connection conn = null;
    PreparedStatement stmt = null;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("UPDATE ");
      sql.append("COM_SYNCTASK");
      sql.append(" SET FINISHRESULT=:1, FINISHDESC=:2, FINISHTIME=SYSDATE, FINISHUSER=:3 ");
      sql.append("WHERE TASKID=:4 AND DOMAIN=:5");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setBoolean(1, result);

      stmt.setString(2, description);

      stmt.setString(3, this.domain);

      stmt.setString(4, taskId);

      stmt.setString(5, this.domain);

      if (stmt.executeUpdate() == 1)
      {
        _result = true;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("完成同步任务异常:" + e.getMessage());
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return _result;
  }

  public boolean clearSyncOLT(String taskId)
  {
    boolean result = false;
    Connection conn = null;
    PreparedStatement stmt = null;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("DELETE FROM ");
      sql.append("COM_SYNCEQUIPMENT");
      sql.append(" WHERE TASKID=:1");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, taskId);

      if (stmt.executeUpdate() != -1)
      {
        result = true;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("清除同步采集器异常:" + e.getMessage());
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return result;
  }

  public boolean finishSyncOLT(String taskId, String oltId, boolean result, String description)
  {
    boolean _result = false;
    Connection conn = null;
    PreparedStatement stmt = null;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("INSERT INTO ");
      sql.append("COM_SYNCEQUIPMENT");
      sql.append("( TASKID, EQUIPMENTID, FINISHRESULT, ");
      sql.append("FINISHDESC, FINISHTIME, FINISHUSER, REMARK ) ");
      sql.append("VALUES( :1, :2, :3, :4, SYSDATE, :5, :6 )");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, taskId);

      stmt.setString(2, oltId);

      stmt.setBoolean(3, result);

      stmt.setString(4, description);

      stmt.setString(5, this.domain);

      stmt.setString(6, "");

      if (stmt.executeUpdate() == 1)
      {
        _result = true;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("完成同步采集器异常:" + e.getMessage());
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return _result;
  }

  public boolean addCorrect(InputCorrect correct)
  {
    boolean result = false;
    Connection conn = null;
    PreparedStatement stmt = null;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("INSERT INTO ");
      sql.append("COM_CORRECT");
      sql.append("( SN, DOMAIN, EQUIPMENTID, OBJECTTYPE, OBJECTNAME, ");
      sql.append("TYPE, ATTRNAMES, ATTROVALUES, ATTRNVALUES, ");
      sql.append("CREATETIME, CREATEUSER, REMARK ) VALUES( ");
      sql.append("COM_CORRECTSEQ").append(".NEXTVAL, :1, :2, :3, :4, ");
      sql.append(":5, :6, :7, :8, SYSDATE, :9, :10 )");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, this.domain);

      stmt.setString(2, correct.oltId());

      stmt.setString(3, correct.objectType());

      stmt.setString(4, correct.objectName());

      stmt.setString(5, correct.type().value());

      stmt.setString(6, correct.attrnames());

      stmt.setString(7, correct.attrovalues());

      stmt.setString(8, correct.attrnvalues());

      stmt.setString(9, this.domain);

      stmt.setString(10, "");

      if (stmt.executeUpdate() == 1)
      {
        result = true;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("添加纠错信息异常:" + e.getMessage());
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return result;
  }

  public boolean clearAllCorrects()
  {
    boolean result = false;
    Connection conn = null;
    PreparedStatement stmt = null;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("DELETE FROM ");
      sql.append("COM_CORRECT");
      sql.append(" WHERE DOMAIN=:1");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, this.domain);

      if (stmt.executeUpdate() != -1)
      {
        result = true;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("清除所有纠错信息异常:" + e.getMessage());
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return result;
  }

  public boolean clearAllCorrects(String oltId)
  {
    boolean result = false;
    Connection conn = null;
    PreparedStatement stmt = null;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("DELETE FROM ");
      sql.append("COM_CORRECT");
      sql.append(" WHERE DOMAIN=:1 AND EQUIPMENTID=:2");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, this.domain);

      stmt.setString(2, oltId);

      if (stmt.executeUpdate() != -1)
      {
        result = true;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("清除指定采集器所有纠错信息异常:" + e.getMessage());
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return result;
  }

  public List<String> getAllActiveAlarmIds()
  {
    Connection conn = null;
    ResultSet result = null;
    PreparedStatement stmt = null;
    List<String> alarmIdList = null;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("SELECT ALARMID FROM ");
      sql.append("com_alarm");
      sql.append(" WHERE DOMAIN=:1");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, this.domain);

      result = stmt.executeQuery();
      alarmIdList = new ArrayList<String>();
      while (result.next())
      {
        String alarmId = result.getString(1);

        alarmIdList.add(alarmId);
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("获取所有当前告警标识异常:" + e.getMessage());
    }
    finally
    {
      SQLHelper.close(result);

      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return alarmIdList;
  }

  public List<String> getAllActiveAlarmIds(String oltId)
  {
    Connection conn = null;
    ResultSet result = null;
    PreparedStatement stmt = null;
    List alarmIdList = new ArrayList();
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("SELECT ALARMID FROM ");
      sql.append("COM_ACTIVEALARM");
      sql.append(" WHERE DOMAIN=:1 AND EQUIPMENTID=:2");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, this.domain);

      stmt.setString(2, oltId);

      result = stmt.executeQuery();

      while (result.next())
      {
        String alarmId = result.getString(1);

        alarmIdList.add(alarmId);
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("获取指定OLT所有当前告警标识异常:" + e.getMessage());
    }
    finally
    {
      SQLHelper.close(result);

      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return alarmIdList;
  }

  public InputResult raiseAlarm(InputAlarm alarm)
  {
    Connection conn = null;
    CallableStatement stmt = null;
    InputResult result = new InputResult();
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("BEGIN ");
      sql.append("RAISE_EPON_ALARM");
      sql.append("( :1, :2, :3, :4, :5, :6, :7, :8, :9, :10,:11, ");
      sql.append("TO_DATE( :12, 'YYYYMMDDHH24MISS' ), ");
      sql.append(":13, :14, :15 ); END;");

      stmt = conn.prepareCall(sql.toString());

      stmt.setString(1, this.domain);

      stmt.setString(2, alarm.alarmId());

      stmt.setString(3, alarm.objectType());

      stmt.setString(4, alarm.objectName());

      if(alarm.getEquip() instanceof Interface){
    	  Interface inter = (Interface) alarm.getEquip();
    	  stmt.setString(5, inter.oltId());
    	  stmt.setString(6, inter.interfaceId());
      }else{
    	  ONU onu = new ONU();
    	  stmt.setString(5, onu.oltId());
    	  stmt.setString(6, "");
      }
      
      stmt.setString(7, alarm.type());

      stmt.setString(8, alarm.severity());

      stmt.setString(9, alarm.cause());

      stmt.setString(10, alarm.content());

      stmt.setString(11, alarm.description());

      stmt.setString(12, alarm.time());

      stmt.setString(13, alarm.remark());

      stmt.registerOutParameter(14, 4);

      stmt.registerOutParameter(15, 12);

      stmt.execute();

      result.result(stmt.getBoolean(14));

      result.reason(stmt.getString(15));
      System.out.println(result.toString());
    }
    catch (SQLException e) {
      e.printStackTrace();
      result.result(false);
      result.reason(e.getMessage());
      Logger.global.severe("产生告警异常:" + e.getMessage());
      e.printStackTrace();
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return result;
  }

  public InputResult clearAlarm(String alarmId)
  {
    Connection conn = null;
    CallableStatement stmt = null;
    InputResult result = new InputResult();
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("BEGIN ");
      sql.append("COM_CLEARALARM");
      sql.append("( :1, :2, SYSDATE, :3, 'SYNC', :4, :5 ); END;");

      stmt = conn.prepareCall(sql.toString());

      stmt.setString(1, this.domain);

      stmt.setString(2, alarmId);

      stmt.setString(3, this.domain);

      stmt.registerOutParameter(4, 4);

      stmt.registerOutParameter(5, 12);

      stmt.execute();

      result.result(stmt.getBoolean(4));

      result.reason(stmt.getString(5));
    }
    catch (SQLException e) {
      e.printStackTrace();
      result.result(false);
      result.reason(e.getMessage());
      Logger.global.severe("清除告警异常:" + e.getMessage());
      e.printStackTrace();
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return result;
  }

  public InputResult clearAlarm(String alarmId, String time)
  {
    Connection conn = null;
    CallableStatement stmt = null;
    InputResult result = new InputResult();
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("BEGIN ");
      sql.append("COM_CLEARALARM");
      sql.append("( :1, :2, TO_DATE( :3, 'YYYYMMDDHH24MISS' ), ");
      sql.append(":4, 'AUTO', :5, :6 ); END;");

      stmt = conn.prepareCall(sql.toString());

      stmt.setString(1, this.domain);

      stmt.setString(2, alarmId);

      stmt.setString(3, time);

      stmt.setString(4, this.domain);

      stmt.registerOutParameter(5, 4);

      stmt.registerOutParameter(6, 12);

      stmt.execute();

      result.result(stmt.getBoolean(5));

      result.reason(stmt.getString(6));
    }
    catch (SQLException e) {
      e.printStackTrace();
      result.result(false);
      result.reason(e.getMessage());
      Logger.global.severe("清除告警异常:" + e.getMessage());
      e.printStackTrace();
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return result;
  }

  public boolean updateRunStatus(RunStatus status)
  {
    boolean result = false;
    Connection conn = null;
    PreparedStatement stmt = null;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("UPDATE ");
      sql.append("COM_DOMAIN");
      sql.append(" SET STATUS=:1, UPDATETIME=SYSDATE, UPDATEUSER=:2 ");
      sql.append("WHERE DOMAIN=:3");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, status.value());

      stmt.setString(2, this.domain);

      stmt.setString(3, this.domain);

      if (stmt.executeUpdate() == 1)
      {
        result = true;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("更新运行状态异常:" + e.getMessage());
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return result;
  }

  public String getSystemTime()
  {
    Connection conn = null;
    ResultSet result = null;
    PreparedStatement stmt = null;
    String time = null;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("SELECT TO_CHAR( SYSDATE, 'YYYYMMDDHH24MISS') FROM DUAL");

      stmt = conn.prepareStatement(sql.toString());

      result = stmt.executeQuery();

      if (result.next())
        time = result.getString(1);
    }
    catch (SQLException e)
    {
      e.printStackTrace();
      Logger.global.severe("获取系统时间异常:" + e.getMessage());
    }
    finally
    {
      SQLHelper.close(result);

      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return time;
  }

  public InputResult raiseIfPerformance(InputIfPerformance performance)
  {
	  
    Connection conn = null;
    CallableStatement stmt = null;
    InputResult result = new InputResult();
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("BEGIN ");
      sql.append("EPON_IFPERFORMANCE");
      sql.append("( :1, :2, :3, :4, :5, :6, :7, :8, :9, :10,:11,:12,:13,:14,");
      sql.append(" :15,:16,:17,:18,:19, sysdate ,:20,:21 ); END;");

      stmt = conn.prepareCall(sql.toString());

      stmt.setString(1, this.domain);
      stmt.setString(2, performance.getEquipmentId());
      stmt.setString(3, performance.getInterfaceId());
      stmt.setString(4, performance.getIfStatus());
      stmt.setString(5, performance.getIfWorkMode());
      stmt.setString(6, performance.getIfSpeed());
      stmt.setString(7, performance.getIfErrorRate());
      stmt.setString(8, performance.getIfNoErrorTime());
      stmt.setString(9, performance.getIfInOctets());
      stmt.setString(10, performance.getIfInUcastPkts());
      stmt.setString(11, performance.getIfInNUcastPkts());
      stmt.setString(12, performance.getIfInErrors());
      stmt.setString(13, performance.getIfInDiscards());
      stmt.setString(14, performance.getIfInUnknownProtos());
      stmt.setString(15, performance.getIfOutOctets());
      stmt.setString(16, performance.getIfInUcastPkts());
      stmt.setString(17, performance.getIfOutNUcastPkts());
      stmt.setString(18, performance.getIfOutDiscards());
      stmt.setString(19, performance.getIfOutErrors());
      stmt.registerOutParameter(20, 4);
      stmt.registerOutParameter(21, 12);
      stmt.execute();
      result.result(stmt.getBoolean(20));
      result.reason(stmt.getString(21));
    }
    catch (SQLException e) {
      e.printStackTrace();
      result.result(false);
      result.reason(e.getMessage());
      Logger.global.severe("产生性能异常:" + e.getMessage());
      e.printStackTrace();
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return result;
  }

  public InputResult raiseOltPerformance(InputOltPerformance performance)
  {
    Connection conn = null;
    CallableStatement stmt = null;
    InputResult result = new InputResult();
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("BEGIN ");
      sql.append("EPON_OLT_PERFORMANCE");
      sql.append("( :1, :2, :3, :4, :5, :6, :7, :8, :9,");
      sql.append(" sysdate,:10,:11 ); END;");

      stmt = conn.prepareCall(sql.toString());

      stmt.setString(1, this.domain);

      stmt.setString(2, performance.getEquipmentId());

      stmt.setString(3, performance.getEntPhysicalName());

      stmt.setString(4, performance.getEntPhysicalDescr());

      stmt.setString(5, performance.getCpuUsage());

      stmt.setString(6, performance.getCpuUsageThreshold());

      stmt.setString(7, performance.getMemUsage());

      stmt.setString(8, performance.getMemUsageThreshold());

      stmt.setString(9, performance.getMemSize());

      stmt.registerOutParameter(10, 4);

      stmt.registerOutParameter(11, 12);

      stmt.execute();

      result.result(stmt.getBoolean(10));

      result.reason(stmt.getString(11));
    }
    catch (SQLException e) {
      e.printStackTrace();
      result.result(false);
      result.reason(e.getMessage());
      Logger.global.severe("产生性能异常:" + e.getMessage());
      e.printStackTrace();
    }
    finally
    {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }

    return result;
  }

  public boolean addInterface(InputInterface input)
  {
    Connection conn = null;
    PreparedStatement stmt = null;
    boolean flag = false;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("INSERT INTO ");
      sql.append("EPON_INTERFACE");
      sql.append(" ( OLTCODE,INTERFACEID,NAME,TYPE,ADDRESS,SPEED,SYNC_STATUS,UPDATETIME,interfacecode )");
      sql.append(" values( :1, :2, :3, :4, :5, :6 ,:7 ,sysdate,:8) ");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, input.oltId());

      stmt.setString(2, input.interfaceId());

      stmt.setString(3, input.name());

      stmt.setString(4, input.type());

      stmt.setString(5, input.address());

      stmt.setString(6, input.speed());
      
      stmt.setString(7, SyncStatus.ADD);
      
      stmt.setString(8, CodeGenerator.genDefaultCode());
      

      if (stmt.executeUpdate() == 1)
      {
        flag = true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("新增接口异常:" + e.getMessage());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }
    return flag;
  }

  public boolean removeInterface(String equipmentId, String interfaceId)
  {
    Connection conn = null;
    ResultSet result = null;
    PreparedStatement stmt = null;
    boolean flag = false;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append(" update  EPON_INTERFACE ");
      sql.append("SET SYNC_STATUS=:1,UPDATETIME=sysdate");
      sql.append(" WHERE  OLTCODE =:2 AND INTERFACEID=:3 ");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, SyncStatus.DELETE);
      
      stmt.setString(2, equipmentId);

      stmt.setString(3, interfaceId);

      if (stmt.executeUpdate() == 1)
      {
        flag = true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("删除接口异常:" + e.getMessage());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      SQLHelper.close(result);

      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }
    return flag;
  }

  public String getInterfaceById(String equipmentId, String interfaceId) throws Exception
  {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    String id = "";
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);
      StringBuffer sql = new StringBuffer();
      sql.append(" SELECT INTERFACECODE  FROM EPON_INTERFACE T ,COM_EQUIPMENT E ");
      sql.append(" WHERE  E.EQUIPMENTID =:1 AND T.INTERFACEID=:2 AND E.EQUIPMENTCODE=T.EQUIPMENTCODE ");

      pstmt = conn.prepareStatement(sql.toString());
      pstmt.setString(1, equipmentId);
      pstmt.setString(2, interfaceId);

      rs = pstmt.executeQuery();

      if (rs.next())
      {
        id = rs.getString(1);
      }
    } catch (SQLException e) {
      e.printStackTrace();
      throw new Exception("获取设备编码异常", e);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    } finally {
      SQLHelper.close(rs);
      SQLHelper.close(pstmt);
      SQLHelper.close(conn);
    }
    return id;
  }

  public String getMaxId(String tableName, String colunmName) throws Exception
  {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    String id = "";

    label198: 
    try { conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("select max(to_number(" + colunmName + "))+1 from " + tableName);
      pstmt = conn.prepareStatement(sql.toString());
      rs = pstmt.executeQuery();

      if (rs.next()) {
        long idLong = rs.getLong(1);
        if (idLong == 0L) break label198; id = String.valueOf(idLong);
      }
    } catch (SQLException e)
    {
      e.printStackTrace();
      throw new Exception("获取" + tableName + "表里最大ID错误", e);
    } finally {
      SQLHelper.close(rs);
      SQLHelper.close(pstmt);
      SQLHelper.close(conn);
    }
    return id;
  }

  public String getEquipmentById(String EquipmentId) throws Exception
  {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    String id = "";
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append(" SELECT EQUIPMENTCODE  FROM COM_EQUIPMENT");
      sql.append(" WHERE  EQUIPMENTID =:1 ");

      pstmt = conn.prepareStatement(sql.toString());
      pstmt.setString(1, EquipmentId);

      rs = pstmt.executeQuery();

      if (rs.next())
      {
        id = rs.getString(1);
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      throw new Exception("获取设备编码异常", e);
    } finally {
      SQLHelper.close(rs);
      SQLHelper.close(pstmt);
      SQLHelper.close(conn);
    }
    return id;
  }

  public boolean updateInterface(InputInterface input)
  {
    Connection conn = null;
    PreparedStatement stmt = null;
    boolean flag = false;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("UPDATE ");
      sql.append("EPON_INTERFACE");
      sql.append(" SET NAME=:1 ,TYPE=:2,ADDRESS=:3, speed=:4 ,UPDATETIME=sysdate ");
      sql.append(" WHERE OLTCODE=:5 AND INTERFACEID=:6 ");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, input.name());

      stmt.setString(2, input.type());

      stmt.setString(3, input.address());

      stmt.setString(4, input.speed());
      
      stmt.setString(5, input.oltId());

      stmt.setString(6, input.interfaceId());

      if (stmt.executeUpdate() == 1)
      {
        flag = true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("更新olt接口异常:" + e.getMessage());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }
    return flag;
  }

  public boolean addUNI(InputUNI input)
  {
    Connection conn = null;
    PreparedStatement stmt = null;
    boolean flag = false;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("INSERT INTO ");
      sql.append("EPON_UNI");
      sql.append(" ( OLTCODE ,ONUID,UNIID,NAME,TYPE,SPEED,ADDRESS )");
      sql.append(" values( :1, :2, :3, :4, :5, :6, :7 ) ");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, input.oltId());

      stmt.setString(2, input.onuId());

      stmt.setString(3, input.uniId());

      stmt.setString(4, input.name());

      stmt.setString(5, input.type());

      stmt.setString(6, input.speed());

      stmt.setString(7, input.address());

      if (stmt.executeUpdate() == 1)
      {
        flag = true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("新增uni异常:" + e.getMessage());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }
    return flag;
  }

  public boolean removeUNI(String oltId, String onuId, String uniId)
  {
    Connection conn = null;
    ResultSet result = null;
    PreparedStatement stmt = null;
    boolean flag = false;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append(" DELETE  FROM ");
      sql.append("EPON_UNI");
      sql.append(" WHERE OLTCODE=:1 AND ONUID =:2 AND UNIID =:3 ");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, oltId);

      stmt.setString(2, onuId);

      stmt.setString(3, uniId);

      if (stmt.executeUpdate() == 1)
      {
        flag = true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("删除uni异常:" + e.getMessage());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      SQLHelper.close(result);

      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }
    return flag;
  }

  public boolean updateUNI(InputUNI input)
  {
    Connection conn = null;
    PreparedStatement stmt = null;
    boolean flag = false;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("UPDATE ");
      sql.append("EPON_UNI");
      sql.append(" SET NAME=:1 ,TYPE=:2,ADDRESS=:3, SPEED=:4 ");
      sql.append(" WHERE OLTCODE=:5 AND ONUID=:6 AND UNIID =:7   ");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, input.name());

      stmt.setString(2, input.type());

      stmt.setString(3, input.address());

      stmt.setString(4, input.speed());

      stmt.setString(5, input.oltId());

      stmt.setString(6, input.onuId());

      stmt.setString(7, input.uniId());

      if (stmt.executeUpdate() == 1)
      {
        flag = true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("更新设备uni异常:" + e.getMessage());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }
    return flag;
  }

  public boolean addONU(InputONU input)
  {
    Connection conn = null;
    PreparedStatement stmt = null;
    boolean flag = false;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("INSERT INTO ");
      sql.append("com_equipment");
      sql.append(" ( OLTCODE ,EQUIPMENTID,INTERFACEID,NAME,DEV_MODEL,MAC,ADDRESS,VENDOR,EQUIPMENTCODE,SYNC_STATUS,DOMAIN,TYPE )");
      sql.append(" values( :1,:2, :3, :4, :5, :6, :7,:8,:9,:10,:11,:12) ");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, input.oltId());

//      stmt.setString(2, input.onuId());
      stmt.setString(2, input.ip().equals("--")?input.onuId():input.ip());

      stmt.setString(3, input.interfaceId());

      stmt.setString(4, input.name());

      stmt.setString(5, input.type());

      stmt.setString(6, input.mac());

      stmt.setString(7, input.ip());

      stmt.setString(8, input.vendor());
      stmt.setString(9, CodeGenerator.genDefaultCode());
      
      stmt.setString(10, SyncStatus.ADD);
      stmt.setString(11, this.domain);
      stmt.setString(12, "ONU");

      if (stmt.executeUpdate() == 1)
      {
        flag = true;
      }else{
    	  WxLogger.flow.error("新增onu失败："+input.name());
      }
    } catch (SQLException e) {
      e.printStackTrace();
      WxLogger.flow.error("新增onu异常："+input.name(),e);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }
    return flag;
  }

  public boolean removeONU(String oltId, String onuId)
  {
    Connection conn = null;
    ResultSet result = null;
    PreparedStatement stmt = null;
    boolean flag = false;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("UPDATE ");
      sql.append("com_equipment");
      sql.append(" SET SYNC_STATUS=:1 ");
      sql.append(" WHERE OLTCODE=:2 AND EQUIPMENTID=:3  ");
      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, SyncStatus.DELETE);
      stmt.setString(2, oltId);
      stmt.setString(3, onuId);
      if (stmt.executeUpdate() == 1)
      {
        flag = true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("删除onu异常:" + e.getMessage());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      SQLHelper.close(result);

      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }
    return flag;
  }

  public boolean updateONU(InputONU input)
  {
    Connection conn = null;
    PreparedStatement stmt = null;
    boolean flag = false;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("UPDATE ");
      sql.append("com_equipment");
      sql.append(" SET INTERFACEID=:1,NAME=:2,UPDATETIME=SYSDATE,DEV_MODEL=:3,MAC=:4,ADDRESS=:5,VENDOR=:6,TYPE=:7 ");
      sql.append(" WHERE OLTCODE=:8 AND EQUIPMENTID=:9 ");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, input.interfaceId());

      stmt.setString(2, input.name());

      stmt.setString(3, input.type());

      stmt.setString(4, input.mac());

      stmt.setString(5, input.ip());


      stmt.setString(6, input.vendor());

      stmt.setString(7, "ONU");
      
      stmt.setString(8, input.oltId());

      stmt.setString(9, input.onuId());

      if (stmt.executeUpdate() == 1)
      {
        flag = true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("更新设备onu异常:" + e.getMessage());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }
    return flag;
  }

  public boolean addOLT(InputOLT equip)
  {
    Connection conn = null;
    PreparedStatement stmt = null;
    boolean flag = false;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("INSERT INTO ");
      sql.append("COM_EQUIPMENT");
      sql.append(" ( EQUIPMENTCODE,DOMAIN,EQUIPMENTID,NAME,DEV_MODEL,ADDRESS,SYNC_STATUS,VENDOR, Version ,X,Y,TYPE");
      sql.append(" UPDATEtime ) ");
      sql.append(" values( :1, :2, :3, :4, :5, :6, :7, :8, :9,:10,:11, sysdate ) ");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, equip.oltId());

      stmt.setString(2, this.domain);

      stmt.setString(3, equip.oltId());

      stmt.setString(4, equip.name());

      stmt.setString(5, equip.type());

      stmt.setString(6, equip.address());

      stmt.setString(7, SyncStatus.ADD);

      stmt.setString(8, "ZY0801");

      stmt.setString(9, equip.version());

      stmt.setInt(10, (int)Math.random() * 100);

      stmt.setInt(11, (int)Math.random() * 100);
      
      stmt.setString(12, "OLT");

      if (stmt.executeUpdate() == 1)
      {
        flag = true;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("新增设备异常:" + e.getMessage());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }
    return flag;
  }

  public boolean modifyOLT(InputOLT equip)
  {
    Connection conn = null;
    PreparedStatement stmt = null;
    boolean flag = false;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("UPDATE ");
      sql.append("COM_equipment");
      sql.append(" SET UPDATETIME=SYSDATE, UPDATEUSER=:1,type=:2,dev_model=:3，name=:4 ");
      sql.append("WHERE DOMAIN=:5 and equipmentId =:6 ");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, this.domain);
      
      stmt.setString(2, "OLT");
      
      stmt.setString(3, equip.type());
      
      stmt.setString(4, equip.name());

      stmt.setString(5, this.domain);

      stmt.setString(6, equip.oltId());

      if (stmt.executeUpdate() == 1)
      {
        flag = true;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("更新设备异常:" + e.getMessage());
    }
    finally {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }
    return flag;
  }

  public boolean delOLT(String oltId)
  {
    Connection conn = null;
    PreparedStatement stmt = null;
    boolean flag = false;
    try
    {
      conn = DriverManager.getConnection("proxool.input_" + this.domain);

      StringBuffer sql = new StringBuffer();
      sql.append("UPDATE ");
      sql.append("COM_equipment");
      sql.append(" SET SYNC_STATUS=:1, UPDATETIME=SYSDATE, UPDATEUSER=:2 ");
      sql.append("WHERE DOMAIN=:3 and equipmentId =:4 ");

      stmt = conn.prepareStatement(sql.toString());

      stmt.setString(1, SyncStatus.DELETE);

      stmt.setString(2, this.domain);

      stmt.setString(3, this.domain);

      stmt.setString(4, oltId);

      if (stmt.executeUpdate() == 1)
      {
        flag = true;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      Logger.global.severe("删除设备异常:" + e.getMessage());
    }
    finally {
      SQLHelper.close(stmt);

      SQLHelper.close(conn);
    }
    return flag;
  }

public List<TaskInDB> getTasks(String domain) {
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	List<TaskInDB> tasks = new ArrayList<TaskInDB>();
	String sql = "select * from timed_task t where t.performer = ?";
	try {
		conn = DriverManager.getConnection("proxool.input_" + this.domain);

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
		SQLHelper.close(pst);
		SQLHelper.close(rs);
	     SQLHelper.close(conn);
		
	}
	
	
	
	return tasks;
}

	public boolean move_to_history(){
		
		Connection conn = null;
		PreparedStatement pst  = null;
		Statement st = null;
		int count = -1;
		
		try {
			conn = DriverManager.getConnection("proxool.input_" + this.domain);
			pst = conn.prepareStatement(this.move_to_history);
			count = pst.executeUpdate();
			st = conn.createStatement();
			st.executeUpdate("delete from com_ifperformance ifp where ifp.interfacecode in "
					+ "(select i.interfaceid from epon_interface i where i.oltcode in "
					+ "(select e.equipmentcode from com_equipment e where domain = 'hw_wx_epon'))");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			SQLHelper.close(conn);
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			SQLHelper.close(st);
		}
		System.out.println(count);
		return count != -1;
		
	}
	public static void main(String[] args) {
		EponDatabase db = new EponDatabase();
		try {
			db.initDB();
			db.startDB();
		} catch (InputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputAlarm a = new InputAlarm();
		a.alarmId("abcd");
		a.cause("cause");
		a.content("content");
		a.description("description");
		a.objectName("oname");
		a.objectType("ONU");
		a.type("conmu");
		a.severity("critical");
		a.time(HuaweiHelper.mapTime("2014-09-01 17:33:35"));
		Interface inter = new Interface();
		inter.oltId("10.1.33.10");
		inter.interfaceId("NA-0-4-8");
		a.setEquip(inter);
		db.raiseAlarm(a);
	}

	public void updatePortToEquip(String domain){
		
		Connection conn = null;
		Statement st = null;
		int count = -1;
		String sql = "update epon_interface ei "
				+ "set ei.anotherendequipname = getlinkequip(ei.interfaceid,ei.oltcode,'"+domain+"') "
				+ "where ei.sync_status <> 'ZT03'";
		try {
			conn = DriverManager.getConnection("proxool.input_" + this.domain);
			st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("更新端口去向失败，"+e.getMessage());
			WxLogger.db.error("更新端口去向失败，"+e.getMessage(), e);
		}finally{
			SQLHelper.close(conn);
			SQLHelper.close(st);
		}
		
	}
	
}

/* Location:           D:\work\workspace\huawei_tl1\lib\epon.jar
* Qualified Name:     com.metarnet.epon.input.oracle.OracleInputDatabase
* JD-Core Version:    0.6.0
*/