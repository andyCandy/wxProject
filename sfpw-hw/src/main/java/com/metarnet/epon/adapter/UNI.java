/*     */ package com.metarnet.epon.adapter;
/*     */ 
/*     */ public class UNI
/*     */ {
/*     */   private String oltId;
/*     */   private String onuId;
/*     */   private String uniId;
/*     */   private String name;
/*     */   private String type;
/*     */   private Speed speed;
/*     */   private String address;
/*     */ 
/*     */   public UNI()
/*     */   {
/*     */   }
/*     */ 
/*     */   public UNI(String oltId)
/*     */   {
/*  41 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public UNI(String oltId, String onuId)
/*     */   {
/*  51 */     this.oltId = oltId;
/*  52 */     this.onuId = onuId;
/*     */   }
/*     */ 
/*     */   public UNI(String oltId, String onuId, String uniId)
/*     */   {
/*  63 */     this.oltId = oltId;
/*  64 */     this.onuId = onuId;
/*  65 */     this.uniId = uniId;
/*     */   }
/*     */ 
/*     */   public UNI(String oltId, String onuId, String uniId, String name, String type, Speed speed, String address)
/*     */   {
/*  81 */     this.oltId = oltId;
/*  82 */     this.onuId = onuId;
/*  83 */     this.uniId = uniId;
/*  84 */     this.name = name;
/*  85 */     this.type = type;
/*  86 */     this.speed = speed;
/*  87 */     this.address = address;
/*     */   }
/*     */ 
/*     */   public String oltId()
/*     */   {
/*  96 */     if (this.oltId == null) {
/*  97 */       return "";
/*     */     }
/*  99 */     return this.oltId;
/*     */   }
/*     */ 
/*     */   public void oltId(String oltId)
/*     */   {
/* 108 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public String onuId()
/*     */   {
/* 117 */     if (this.onuId == null) {
/* 118 */       return "";
/*     */     }
/* 120 */     return this.onuId;
/*     */   }
/*     */ 
/*     */   public void onuId(String onuId)
/*     */   {
/* 129 */     this.onuId = onuId;
/*     */   }
/*     */ 
/*     */   public String uniId()
/*     */   {
/* 138 */     if (this.uniId == null) {
/* 139 */       return "";
/*     */     }
/* 141 */     return this.uniId;
/*     */   }
/*     */ 
/*     */   public void uniId(String uniId)
/*     */   {
/* 150 */     this.uniId = uniId;
/*     */   }
/*     */ 
/*     */   public String name()
/*     */   {
/* 159 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void name(String name)
/*     */   {
/* 168 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public String type()
/*     */   {
/* 177 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(String type)
/*     */   {
/* 186 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public Speed speed()
/*     */   {
/* 195 */     return this.speed;
/*     */   }
/*     */ 
/*     */   public void speed(Speed speed)
/*     */   {
/* 204 */     this.speed = speed;
/*     */   }
/*     */ 
/*     */   public String address()
/*     */   {
/* 213 */     return this.address;
/*     */   }
/*     */ 
/*     */   public void address(String address)
/*     */   {
/* 222 */     this.address = address;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.UNI
 * JD-Core Version:    0.6.0
 */