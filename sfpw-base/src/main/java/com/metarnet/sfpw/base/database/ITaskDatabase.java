package com.metarnet.sfpw.base.database;

import java.util.List;

import com.metarnet.sfpw.base.timedtask.TaskInDB;


/**
 * 
 * @author bcmeng
 * 查询数据库中任务描述接口
 */
public interface ITaskDatabase {

	public List<TaskInDB> getTasks(String domain) ;
	
}
