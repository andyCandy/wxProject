/*     */ package com.metarnet.epon.input;
/*     */ 
/*     */ public class InputSplitter
/*     */ {
/*     */   private String oltId;
/*     */   private String splitterId;
/*     */   private String interfaceId;
/*     */   private String name;
/*     */   private String type;
/*     */   public static final String INTERFACEID = "INTERFACEID";
/*     */   public static final String NAME = "NAME";
/*     */   public static final String TYPE = "TYPE";
/*     */ 
/*     */   public InputSplitter()
/*     */   {
/*     */   }
/*     */ 
/*     */   public InputSplitter(String oltId)
/*     */   {
/*  45 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public InputSplitter(String oltId, String splitterId)
/*     */   {
/*  55 */     this.oltId = oltId;
/*  56 */     this.splitterId = splitterId;
/*     */   }
/*     */ 
/*     */   public InputSplitter(String oltId, String splitterId, String interfaceId, String name, String type)
/*     */   {
/*  70 */     this.oltId = oltId;
/*  71 */     this.splitterId = splitterId;
/*  72 */     this.interfaceId = interfaceId;
/*  73 */     this.name = name;
/*  74 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String oltId()
/*     */   {
/*  83 */     if (this.oltId == null) {
/*  84 */       return "";
/*     */     }
/*  86 */     return this.oltId;
/*     */   }
/*     */ 
/*     */   public void oltId(String oltId)
/*     */   {
/*  95 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public String splitterId()
/*     */   {
/* 104 */     if (this.splitterId == null) {
/* 105 */       return "";
/*     */     }
/* 107 */     return this.splitterId;
/*     */   }
/*     */ 
/*     */   public void splitterId(String splitterId)
/*     */   {
/* 116 */     this.splitterId = splitterId;
/*     */   }
/*     */ 
/*     */   public String interfaceId()
/*     */   {
/* 125 */     if (this.interfaceId == null) {
/* 126 */       return "";
/*     */     }
/* 128 */     return this.interfaceId;
/*     */   }
/*     */ 
/*     */   public void interfaceId(String interfaceId)
/*     */   {
/* 137 */     this.interfaceId = interfaceId;
/*     */   }
/*     */ 
/*     */   public String name()
/*     */   {
/* 146 */     if (this.name == null) {
/* 147 */       return "";
/*     */     }
/* 149 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void name(String name)
/*     */   {
/* 158 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public String type()
/*     */   {
/* 167 */     if (this.type == null) {
/* 168 */       return "";
/*     */     }
/* 170 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(String type)
/*     */   {
/* 179 */     this.type = type;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.input.InputSplitter
 * JD-Core Version:    0.6.0
 */