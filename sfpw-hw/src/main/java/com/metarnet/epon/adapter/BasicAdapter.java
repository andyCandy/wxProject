/*    */ package com.metarnet.epon.adapter;
/*    */ 
/*    */ import com.metarnet.service.Service;
/*    */ import com.metarnet.service.ServiceException;
/*    */ 
/*    */ public abstract class BasicAdapter extends Service
/*    */   implements Adapter
/*    */ {
/* 14 */   protected Reporter reporter = null;
/*    */ 
/*    */   public BasicAdapter()
/*    */   {
/* 20 */     super("EPON适配器适配层");
/*    */   }
/*    */ 
/*    */   public BasicAdapter(String name)
/*    */   {
/* 29 */     super(name);
/*    */   }
/*    */ 
/*    */   public final void setReporter(Reporter reporter)
/*    */   {
/* 38 */     if (reporter == null) {
/* 39 */       throw new IllegalArgumentException("上报接口为空.");
/*    */     }
/* 41 */     this.reporter = reporter;
/*    */   }
/*    */ 
/*    */   protected final void doInit()
/*    */     throws ServiceException
/*    */   {
/*    */     try
/*    */     {
/* 51 */       initAdp();
/*    */     }
/*    */     catch (AdapterException e) {
/* 54 */       throw new ServiceException("初始化适配层异常.", e);
/*    */     }
/*    */   }
/*    */ 
/*    */   protected final void doStart()
/*    */     throws ServiceException
/*    */   {
/*    */     try
/*    */     {
/* 65 */       startAdp();
/*    */     }
/*    */     catch (AdapterException e) {
/* 68 */       throw new ServiceException("启动适配层异常.", e);
/*    */     }
/*    */   }
/*    */ 
/*    */   protected final void doStop()
/*    */     throws ServiceException
/*    */   {
/*    */     try
/*    */     {
/* 79 */       stopAdp();
/*    */     }
/*    */     catch (AdapterException e) {
/* 82 */       throw new ServiceException("停止适配层异常.", e);
/*    */     }
/*    */   }
/*    */ 
/*    */   protected abstract void initAdp()
/*    */     throws AdapterException;
/*    */ 
/*    */   protected abstract void startAdp()
/*    */     throws AdapterException;
/*    */ 
/*    */   protected abstract void stopAdp()
/*    */     throws AdapterException;
/*    */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.BasicAdapter
 * JD-Core Version:    0.6.0
 */