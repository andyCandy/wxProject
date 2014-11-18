package com.metarnet.sfpw.base.database;

import java.sql.SQLException;
import java.util.List;



import com.metarnet.adapter.model.ADPAlarm;
import com.metarnet.sfpw.base.model.EquipPerf;
import com.metarnet.sfpw.base.model.IfPerformance;
import com.metarnet.sfpw.base.model.ManagedElement;
import com.metarnet.sfpw.base.model.Port;
import com.metarnet.sfpw.base.model.TopologicalLink;
import com.metarnet.sfpw.base.timedtask.TaskInDB;


public interface IDatabase {

	public List<ADPAlarm> getAllActiveAlarm(String domain) throws SQLException ;
	
	public List<ADPAlarm> getMeActiveAlarm(String domain,String meid);
	
	public void raiseAlarm(String domain, ADPAlarm alarm);

	public void clearAlarm(String domain, ADPAlarm dalarm);
	
	public void saveME(String domain,ManagedElement me);
	
	public void savePorts(String domain,List<Port> ports);
	
	public void saveTLs(String domain,List<TopologicalLink> topolist);

	public void saveME(String domain, List<ManagedElement> meList);

	public void flag(String domain,String meid,boolean isFinished);

	public void saveIfPM(String domain,List<IfPerformance> ifPerfList);

	public void saveMePM(String domain ,List<EquipPerf> equipPerfList);
	
	public List<TaskInDB> getTasks(String domain);
	
	public void updatePortToEquip(String domain);

}
