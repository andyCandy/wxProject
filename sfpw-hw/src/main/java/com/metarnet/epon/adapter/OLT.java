/*     */ package com.metarnet.epon.adapter;
/*     */ 
/*     */ import com.metarnet.common.Vendor;
/*     */ 
/*     */ public class OLT
/*     */ {
/*     */   private String oltId;
/*     */   private String name;
/*     */   private String type;
/*     */   private String version;
/*     */   private String address;
/*     */   private Vendor vendor;
/*     */ 
/*     */   public OLT()
/*     */   {
/*     */   }
/*     */ 
/*     */   public OLT(String oltId)
/*     */   {
/*  41 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public OLT(String oltId, String name, String type, String version, String address, Vendor vendor)
/*     */   {
/*  55 */     this.oltId = oltId;
/*  56 */     this.name = name;
/*  57 */     this.type = type;
/*  58 */     this.version = version;
/*  59 */     this.address = address;
/*  60 */     this.vendor = vendor;
/*     */   }
/*     */ 
/*     */   public String oltId()
/*     */   {
/*  69 */     if (this.oltId == null) {
/*  70 */       return "";
/*     */     }
/*  72 */     return this.oltId;
/*     */   }
/*     */ 
/*     */   public void oltId(String oltId)
/*     */   {
/*  81 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public String name()
/*     */   {
/*  90 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void name(String name)
/*     */   {
/*  99 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public String type()
/*     */   {
/* 108 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(String type)
/*     */   {
/* 117 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String version()
/*     */   {
/* 126 */     return this.version;
/*     */   }
/*     */ 
/*     */   public void version(String version)
/*     */   {
/* 135 */     this.version = version;
/*     */   }
/*     */ 
/*     */   public String address()
/*     */   {
/* 144 */     return this.address;
/*     */   }
/*     */ 
/*     */   public void address(String address)
/*     */   {
/* 153 */     this.address = address;
/*     */   }
/*     */ 
/*     */   public Vendor vendor()
/*     */   {
/* 162 */     return this.vendor;
/*     */   }
/*     */ 
/*     */   public void vendor(Vendor vendor)
/*     */   {
/* 171 */     this.vendor = vendor;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.OLT
 * JD-Core Version:    0.6.0
 */