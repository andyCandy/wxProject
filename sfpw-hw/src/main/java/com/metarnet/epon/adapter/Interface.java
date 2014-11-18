/*     */ package com.metarnet.epon.adapter;
/*     */ 
/*     */ public class Interface
/*     */ {
/*     */   private String oltId;
/*     */   private String interfaceId;
/*     */   private String name;
/*     */   private String type;
/*     */   private String speed;
/*     */   private String address;
/*     */ 
/*     */   public Interface()
/*     */   {
/*     */   }
/*     */ 
/*     */   public Interface(String oltId)
/*     */   {
/*  39 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public Interface(String oltId, String interfaceId)
/*     */   {
/*  49 */     this.oltId = oltId;
/*  50 */     this.interfaceId = interfaceId;
/*     */   }
/*     */ 
/*     */   public Interface(String oltId, String interfaceId, String name, String type, String speed, String address)
/*     */   {
/*  65 */     this.oltId = oltId;
/*  66 */     this.interfaceId = interfaceId;
/*  67 */     this.name = name;
/*  68 */     this.type = type;
/*  69 */     this.speed = speed;
/*  70 */     this.address = address;
/*     */   }
/*     */ 
/*     */   public String oltId()
/*     */   {
/*  79 */     if (this.oltId == null) {
/*  80 */       return "";
/*     */     }
/*  82 */     return this.oltId;
/*     */   }
/*     */ 
/*     */   public void oltId(String oltId)
/*     */   {
/*  91 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public String interfaceId()
/*     */   {
/* 100 */     if (this.interfaceId == null) {
/* 101 */       return "";
/*     */     }
/* 103 */     return this.interfaceId;
/*     */   }
/*     */ 
/*     */   public void interfaceId(String interfaceId)
/*     */   {
/* 112 */     this.interfaceId = interfaceId;
/*     */   }
/*     */ 
/*     */   public String name()
/*     */   {
/* 121 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void name(String name)
/*     */   {
/* 130 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public String type()
/*     */   {
/* 139 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(String type)
/*     */   {
			  if("EPON_OLT".equals(type)){
				  this.type = "光口";
			  }else if("OPT_GE".equals(type)){
				  this.type = "以太口";
			  }else{
/* 148 */     	this.type = type;
			  }
/*     */   }
/*     */ 
/*     */   public String speed()
/*     */   {
/* 157 */     return this.speed;
/*     */   }
/*     */ 
/*     */   public void speed(String speed)
/*     */   {
/* 166 */     this.speed = speed;
/*     */   }
/*     */ 
/*     */   public String address()
/*     */   {
/* 175 */     return this.address;
/*     */   }
/*     */ 
/*     */   public void address(String address)
/*     */   {
/* 184 */     this.address = address;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.Interface
 * JD-Core Version:    0.6.0
 */