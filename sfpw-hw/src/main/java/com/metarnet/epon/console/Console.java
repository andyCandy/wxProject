/*    */ package com.metarnet.epon.console;
/*    */ 
/*    */ import com.metarnet.epon.manager.Manager;
/*    */ import com.metarnet.service.Service;
/*    */ import com.metarnet.service.ServiceException;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class Console extends Service
/*    */   implements Runnable
/*    */ {
/* 17 */   protected Manager manager = null;
/*    */ 
/* 20 */   private Thread thread = null;
/*    */ 
/*    */   public Console(Manager manager)
/*    */   {
/* 28 */     super("EPON适配器控制台");
/* 29 */     if (manager == null) {
/* 30 */       throw new IllegalArgumentException("适配层接口为空.");
/*    */     }
/* 32 */     this.manager = manager;
/*    */   }
/*    */ 
/*    */   protected final void doInit()
/*    */     throws ServiceException
/*    */   {
/* 41 */     this.thread = new Thread(this, getName());
/*    */   }
/*    */ 
/*    */   protected final void doStart()
/*    */     throws ServiceException
/*    */   {
/* 50 */     this.thread.start();
/*    */   }
/*    */ 
/*    */   protected final void doStop()
/*    */     throws ServiceException
/*    */   {
/* 59 */     this.thread.interrupt();
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 67 */     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
/* 68 */     String prompt = this.manager.getDomain() + ">";
/*    */ 
/* 71 */     while ((!Thread.interrupted()) && (isStarted()))
/*    */     {
/* 73 */       System.out.print(prompt);
/*    */       try
/*    */       {
/* 78 */         String line = reader.readLine();
/*    */ 
/* 81 */         if ((line == null) || (line.length() == 0))
/*    */           continue;
/* 83 */         if (line.equalsIgnoreCase("exit")) {
/* 84 */           System.exit(0);
/* 85 */           break;
/*    */         }
/*    */ 
/* 88 */         if (line.equalsIgnoreCase("info")) {
/* 89 */           System.out.println("适配器信息:");
/* 90 */           System.out.println("适配器标识:  " + this.manager.getDomain());
/* 91 */           System.out.println("适配器名称:  " + this.manager.getName());
/* 92 */           System.out.println("适配器版本:  " + this.manager.getVersion());
/* 93 */           System.out.println("适配器状态:  " + this.manager.getStatus());
/*    */         }
/* 97 */         else if (line.equalsIgnoreCase("id")) {
/* 98 */           System.out.println("适配器标识:  " + this.manager.getDomain());
/*    */         }
/* 102 */         else if (line.equalsIgnoreCase("name")) {
/* 103 */           System.out.println("适配器名称:  " + this.manager.getName());
/*    */         }
/* 107 */         else if (line.equalsIgnoreCase("version")) {
/* 108 */           System.out.println("适配器版本:  " + this.manager.getVersion());
/*    */         }
/* 112 */         else if (line.equalsIgnoreCase("status")) {
/* 113 */           System.out.println("适配器状态:  " + this.manager.getStatus());
/*    */         }
/* 117 */         else if (line.equalsIgnoreCase("help")) {
/* 118 */           System.out.println("常用命令:");
/* 119 */           System.out.println("exit:       退出");
/* 120 */           System.out.println("info:       显示信息");
/* 121 */           System.out.println("id:         显示标识");
/* 122 */           System.out.println("name:       显示名称");
/* 123 */           System.out.println("version:    显示版本");
/* 124 */           System.out.println("status:     显示状态");
/* 125 */           System.out.println("help:       显示帮助");
/*    */         }
/*    */         else
/*    */         {
/* 129 */           System.out.println("无效命令:" + line);
/*    */         }
/*    */       }
/*    */       catch (IOException e) {
/* 133 */         break;
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.console.Console
 * JD-Core Version:    0.6.0
 */