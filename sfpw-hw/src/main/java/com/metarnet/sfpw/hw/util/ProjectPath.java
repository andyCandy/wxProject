package com.metarnet.sfpw.hw.util;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;

/**
 * 
 * 获取项目路径
 * 
 * @author Administrator
 * @version 
 * @see com.metarnet.epon.huawei.util
 * @since
 */
public class ProjectPath {

	private static String projectPath = readProjectPath();
    private static String logPath = readProjectLogPath();
	/**
	 * 获取项目路径
	 * 分开发环境下和发布环境下两种情况
	 * 
	 * @return
	 */
	private static String readProjectPath() {
		URL url = ProjectPath.class.getProtectionDomain().getCodeSource().getLocation();
		String filePath = null;
		try {
			filePath = URLDecoder.decode(url.getPath(), "utf-8");
			if (filePath.endsWith("/bin/"))
			{
			    filePath = filePath.substring(0, filePath.length() - 4) + "conf/";
			}
		} catch (Exception e) {
		    e.printStackTrace();
		}
		if (filePath.endsWith(".jar"))
			filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1);
		File file = new File(filePath);
		filePath = file.getAbsolutePath();
		return filePath;
	}
	
	/**
     * 获取项目log路径
     * 分开发环境下和发布环境下两种情况
     * 
     * @return
     */
    private static String readProjectLogPath() {
        URL url = ProjectPath.class.getProtectionDomain().getCodeSource().getLocation();
        String filePath = null;
        try {
            filePath = URLDecoder.decode(url.getPath(), "utf-8");
            if (filePath.endsWith("/bin/"))
            {
                filePath = filePath.substring(0, filePath.length() - 4) + "log/";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (filePath.endsWith(".jar"))
            filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1) + "log/";
        File file = new File(filePath);
        filePath = file.getAbsolutePath();
        return filePath;
    }
	
	public static String getProjectPath(){
		return ProjectPath.projectPath;
	}
    public static String getLogPath()
    {
        return ProjectPath.logPath;
    }
    
    
}
