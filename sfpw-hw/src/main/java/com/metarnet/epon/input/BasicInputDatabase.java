/*    */ package com.metarnet.epon.input;
/*    */ 
/*    */ import com.metarnet.service.Service;
/*    */ import com.metarnet.service.ServiceException;
/*    */ 
/*    */ public abstract class BasicInputDatabase extends Service
/*    */   implements InputDatabase
/*    */ {
/*    */   public BasicInputDatabase()
/*    */   {
/* 17 */     super("EPON适配器录入库");
/*    */   }
/*    */ 
/*    */   public BasicInputDatabase(String name)
/*    */   {
/* 26 */     super(name);
/*    */   }
/*    */ 
/*    */   protected final void doInit()
/*    */     throws ServiceException
/*    */   {
/*    */     try
/*    */     {
/* 36 */       initDB();
/*    */     }
/*    */     catch (InputException e) {
/* 39 */       throw new ServiceException("初始化录入库异常.", e);
/*    */     }
/*    */   }
/*    */ 
/*    */   protected final void doStart()
/*    */     throws ServiceException
/*    */   {
/*    */     try
/*    */     {
/* 50 */       startDB();
/*    */     }
/*    */     catch (InputException e) {
/* 53 */       throw new ServiceException("启动录入库异常.", e);
/*    */     }
/*    */   }
/*    */ 
/*    */   protected final void doStop()
/*    */     throws ServiceException
/*    */   {
/*    */     try
/*    */     {
/* 64 */       stopDB();
/*    */     }
/*    */     catch (InputException e) {
/* 67 */       throw new ServiceException("停止录入库异常.", e);
/*    */     }
/*    */   }
/*    */ 
/*    */   protected abstract void initDB()
/*    */     throws InputException;
/*    */ 
/*    */   protected abstract void startDB()
/*    */     throws InputException;
/*    */ 
/*    */   protected abstract void stopDB()
/*    */     throws InputException;
/*    */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.input.BasicInputDatabase
 * JD-Core Version:    0.6.0
 */