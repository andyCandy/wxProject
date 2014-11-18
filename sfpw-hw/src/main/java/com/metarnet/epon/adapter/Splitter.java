/*     */ package com.metarnet.epon.adapter;
/*     */ 
/*     */ public class Splitter
/*     */ {
/*     */   private String oltId;
/*     */   private String splitterId;
/*     */   private String interfaceId;
/*     */   private String name;
/*     */   private String type;
/*     */ 
/*     */   public Splitter()
/*     */   {
/*     */   }
/*     */ 
/*     */   public Splitter(String oltId)
/*     */   {
/*  37 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public Splitter(String oltId, String splitterId)
/*     */   {
/*  47 */     this.oltId = oltId;
/*  48 */     this.splitterId = splitterId;
/*     */   }
/*     */ 
/*     */   public Splitter(String oltId, String splitterId, String interfaceId, String name, String type)
/*     */   {
/*  61 */     this.oltId = oltId;
/*  62 */     this.splitterId = splitterId;
/*  63 */     this.interfaceId = interfaceId;
/*  64 */     this.name = name;
/*  65 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String oltId()
/*     */   {
/*  74 */     if (this.oltId == null) {
/*  75 */       return "";
/*     */     }
/*  77 */     return this.oltId;
/*     */   }
/*     */ 
/*     */   public void oltId(String oltId)
/*     */   {
/*  86 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public String splitterId()
/*     */   {
/*  95 */     if (this.splitterId == null) {
/*  96 */       return "";
/*     */     }
/*  98 */     return this.splitterId;
/*     */   }
/*     */ 
/*     */   public void splitterId(String splitterId)
/*     */   {
/* 107 */     this.splitterId = splitterId;
/*     */   }
/*     */ 
/*     */   public String interfaceId()
/*     */   {
/* 116 */     return this.interfaceId;
/*     */   }
/*     */ 
/*     */   public void interfaceId(String interfaceId)
/*     */   {
/* 125 */     this.interfaceId = interfaceId;
/*     */   }
/*     */ 
/*     */   public String name()
/*     */   {
/* 134 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void name(String name)
/*     */   {
/* 143 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public String type()
/*     */   {
/* 152 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(String type)
/*     */   {
/* 161 */     this.type = type;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.Splitter
 * JD-Core Version:    0.6.0
 */