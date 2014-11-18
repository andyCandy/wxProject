/*     */ package com.metarnet.epon.adapter.example;
/*     */ 
/*     */ import com.metarnet.epon.adapter.AdapterException;
/*     */ import com.metarnet.epon.adapter.Alarm;
/*     */ import com.metarnet.epon.adapter.BasicAdapter;
/*     */ import com.metarnet.epon.adapter.Interface;
/*     */ import com.metarnet.epon.adapter.OLT;
/*     */ import com.metarnet.epon.adapter.ONU;
/*     */ import com.metarnet.epon.adapter.Splitter;
/*     */ import com.metarnet.epon.adapter.UNI;
/*     */ import com.metarnet.message.AddEquipmentRequest;
/*     */ import com.metarnet.message.DelEquipmentRequest;
/*     */ import java.util.List;
/*     */ 
/*     */ public class ExampleAdapter extends BasicAdapter
/*     */ {
/*     */   public ExampleAdapter(String config)
/*     */   {
/*  22 */     super("例子EPON适配器适配层");
/*     */   }
/*     */ 
/*     */   protected void initAdp()
/*     */     throws AdapterException
/*     */   {
/*     */   }
/*     */ 
/*     */   protected void startAdp()
/*     */     throws AdapterException
/*     */   {
/*     */   }
/*     */ 
/*     */   protected void stopAdp()
/*     */     throws AdapterException
/*     */   {
/*     */   }
/*     */ 
/*     */   public OLT getOLT(String oltId)
/*     */     throws AdapterException
/*     */   {
/*  61 */     return null;
/*     */   }
/*     */ 
/*     */   public List<OLT> getAllOLTs()
/*     */     throws AdapterException
/*     */   {
/*  72 */     return null;
/*     */   }
/*     */ 
/*     */   public List<Interface> getAllInterfaces(String oltId)
/*     */     throws AdapterException
/*     */   {
/*  84 */     return null;
/*     */   }
/*     */ 
/*     */   public List<Splitter> getAllSplitters(String oltId)
/*     */     throws AdapterException
/*     */   {
/*  96 */     return null;
/*     */   }
/*     */ 
/*     */   public List<ONU> getAllONUs(String oltId)
/*     */     throws AdapterException
/*     */   {
/* 108 */     return null;
/*     */   }
/*     */ 
/*     */   public List<UNI> getAllUNIs(String oltId)
/*     */     throws AdapterException
/*     */   {
/* 120 */     return null;
/*     */   }
/*     */ 
/*     */   public List<Alarm> getAllActiveAlarms()
/*     */     throws AdapterException
/*     */   {
/* 131 */     return null;
/*     */   }
/*     */ 
/*     */   public List<Alarm> getAllActiveAlarms(String oltId)
/*     */     throws AdapterException
/*     */   {
/* 143 */     return null;
/*     */   }
/*     */ 
/*     */   public boolean addEquipment(AddEquipmentRequest request)
/*     */   {
/* 148 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean delEquipment(DelEquipmentRequest request)
/*     */   {
/* 153 */     return false;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.example.ExampleAdapter
 * JD-Core Version:    0.6.0
 */