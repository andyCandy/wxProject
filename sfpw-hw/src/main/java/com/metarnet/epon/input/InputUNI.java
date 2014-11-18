/*     */ package com.metarnet.epon.input;
/*     */ 
/*     */ public class InputUNI
/*     */ {
/*     */   private String oltId;
/*     */   private String onuId;
/*     */   private String uniId;
/*     */   private String name;
/*     */   private String type;
/*     */   private String speed;
/*     */   private String address;
/*     */   public static final String NAME = "NAME";
/*     */   public static final String TYPE = "TYPE";
/*     */   public static final String SPEED = "SPEED";
/*     */   public static final String ADDRESS = "ADDRESS";
/*     */ 
/*     */   public InputUNI()
/*     */   {
/*     */   }
/*     */ 
/*     */   public InputUNI(String oltId)
/*     */   {
/*  51 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public InputUNI(String oltId, String onuId)
/*     */   {
/*  61 */     this.oltId = oltId;
/*  62 */     this.onuId = onuId;
/*     */   }
/*     */ 
/*     */   public InputUNI(String oltId, String onuId, String uniId)
/*     */   {
/*  73 */     this.oltId = oltId;
/*  74 */     this.onuId = onuId;
/*  75 */     this.uniId = uniId;
/*     */   }
/*     */ 
/*     */   public InputUNI(String oltId, String onuId, String uniId, String name, String type, String speed, String address)
/*     */   {
/*  91 */     this.oltId = oltId;
/*  92 */     this.onuId = onuId;
/*  93 */     this.uniId = uniId;
/*  94 */     this.name = name;
/*  95 */     this.type = type;
/*  96 */     this.speed = speed;
/*  97 */     this.address = address;
/*     */   }
/*     */ 
/*     */   public String oltId()
/*     */   {
/* 106 */     if (this.oltId == null) {
/* 107 */       return "";
/*     */     }
/* 109 */     return this.oltId;
/*     */   }
/*     */ 
/*     */   public void oltId(String oltId)
/*     */   {
/* 118 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public String onuId()
/*     */   {
/* 127 */     if (this.onuId == null) {
/* 128 */       return "";
/*     */     }
/* 130 */     return this.onuId;
/*     */   }
/*     */ 
/*     */   public void onuId(String onuId)
/*     */   {
/* 139 */     this.onuId = onuId;
/*     */   }
/*     */ 
/*     */   public String uniId()
/*     */   {
/* 148 */     if (this.uniId == null) {
/* 149 */       return "";
/*     */     }
/* 151 */     return this.uniId;
/*     */   }
/*     */ 
/*     */   public void uniId(String uniId)
/*     */   {
/* 160 */     this.uniId = uniId;
/*     */   }
/*     */ 
/*     */   public String name()
/*     */   {
/* 169 */     if (this.name == null) {
/* 170 */       return "";
/*     */     }
/* 172 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void name(String name)
/*     */   {
/* 181 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public String type()
/*     */   {
/* 190 */     if (this.type == null) {
/* 191 */       return "";
/*     */     }
/* 193 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(String type)
/*     */   {
/* 202 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String speed()
/*     */   {
/* 211 */     if (this.speed == null) {
/* 212 */       return "";
/*     */     }
/* 214 */     return this.speed;
/*     */   }
/*     */ 
/*     */   public void speed(String speed)
/*     */   {
/* 223 */     this.speed = speed;
/*     */   }
/*     */ 
/*     */   public String address()
/*     */   {
/* 232 */     if (this.address == null) {
/* 233 */       return "";
/*     */     }
/* 235 */     return this.address;
/*     */   }
/*     */ 
/*     */   public void address(String address)
/*     */   {
/* 244 */     this.address = address;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.input.InputUNI
 * JD-Core Version:    0.6.0
 */