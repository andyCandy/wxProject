/*    */ package com.metarnet.epon.manager;
/*    */ 
/*    */ import com.metarnet.epon.adapter.Adapter;
/*    */ import com.metarnet.epon.adapter.Reporter;
/*    */ import com.metarnet.service.Service;
/*    */ import com.metarnet.service.ServiceException;
/*    */ 
/*    */ public abstract class BasicManager extends Service
/*    */   implements Manager, Reporter
/*    */ {
/* 15 */   protected Adapter adapter = null;
/*    */ 
/*    */   public BasicManager(Adapter adapter)
/*    */   {
/* 23 */     super("EPON适配器管理层");
/* 24 */     if (adapter == null) {
/* 25 */       throw new IllegalArgumentException("适配层接口为空.");
/*    */     }
/* 27 */     this.adapter = adapter;
/*    */   }
/*    */ 
/*    */   public BasicManager(String name, Adapter adapter)
/*    */   {
/* 37 */     super(name);
/* 38 */     if (adapter == null) {
/* 39 */       throw new IllegalArgumentException("适配层接口为空.");
/*    */     }
/* 41 */     this.adapter = adapter;
/*    */   }
/*    */ 
/*    */   protected final void doInit()
/*    */     throws ServiceException
/*    */   {
/*    */     try
/*    */     {
/* 51 */       initMgr();
/*    */     }
/*    */     catch (ManagerException e) {
/* 54 */       throw new ServiceException("初始化管理层异常.", e);
/*    */     }
/*    */   }
/*    */ 
/*    */   protected final void doStart()
/*    */     throws ServiceException
/*    */   {
/*    */     try
/*    */     {
/* 65 */       startMgr();
/*    */     }
/*    */     catch (ManagerException e) {
/* 68 */       throw new ServiceException("启动管理层异常.", e);
/*    */     }
/*    */   }
/*    */ 
/*    */   protected final void doStop()
/*    */     throws ServiceException
/*    */   {
/*    */     try
/*    */     {
/* 79 */       stopMgr();
/*    */     }
/*    */     catch (ManagerException e) {
/* 82 */       throw new ServiceException("停止管理层异常.", e);
/*    */     }
/*    */   }
/*    */ 
/*    */   protected abstract void initMgr()
/*    */     throws ManagerException;
/*    */ 
/*    */   protected abstract void startMgr()
/*    */     throws ManagerException;
/*    */ 
/*    */   protected abstract void stopMgr()
/*    */     throws ManagerException;
/*    */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.manager.BasicManager
 * JD-Core Version:    0.6.0
 */