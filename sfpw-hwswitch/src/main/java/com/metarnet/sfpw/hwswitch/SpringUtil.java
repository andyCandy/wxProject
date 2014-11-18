package com.metarnet.sfpw.hwswitch;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringUtil {
    
    private ApplicationContext context;
    
    private static SpringUtil su = null;
    
    public static synchronized SpringUtil getInstance(){
    	if(su == null) 
    		su = new SpringUtil();
    	return su;
    }
    
    private SpringUtil(){
    	context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    
    public <T> T getObject(String name, Class<T> clazz){
    	return context.getBean(name, clazz);
    }
    
    public  Object getObject(String name){
    	return context.getBean(name);
    }

}