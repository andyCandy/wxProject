/*     */ package com.metarnet.epon.input;
/*     */ 
/*     */ public class InputInterface
/*     */ {
/*     */   private String oltId;
/*     */   private String interfaceId;
/*     */   private String name;
/*     */   private String type;
/*     */   private String speed;
/*     */   private String address;
/*     */   public static final String NAME = "NAME";
/*     */   public static final String TYPE = "TYPE";
/*     */   public static final String SPEED = "SPEED";
/*     */   public static final String ADDRESS = "ADDRESS";
/*     */ 
/*     */   public InputInterface()
/*     */   {
/*     */   }
/*     */ 
/*     */   public InputInterface(String oltId)
/*     */   {
/*  49 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public InputInterface(String oltId, String interfaceId)
/*     */   {
/*  59 */     this.oltId = oltId;
/*  60 */     this.interfaceId = interfaceId;
/*     */   }
/*     */ 
/*     */   public InputInterface(String oltId, String interfaceId, String name, String type, String speed, String address)
/*     */   {
/*  75 */     this.oltId = oltId;
/*  76 */     this.interfaceId = interfaceId;
/*  77 */     this.name = name;
/*  78 */     this.type = type;
/*  79 */     this.speed = speed;
/*  80 */     this.address = address;
/*     */   }
/*     */ 
/*     */   public String oltId()
/*     */   {
/*  89 */     if (this.oltId == null) {
/*  90 */       return "";
/*     */     }
/*  92 */     return this.oltId;
/*     */   }
/*     */ 
/*     */   public void oltId(String oltId)
/*     */   {
/* 101 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public String interfaceId()
/*     */   {
/* 110 */     if (this.interfaceId == null) {
/* 111 */       return "";
/*     */     }
/* 113 */     return this.interfaceId;
/*     */   }
/*     */ 
/*     */   public void interfaceId(String interfaceId)
/*     */   {
/* 122 */     this.interfaceId = interfaceId;
/*     */   }
/*     */ 
/*     */   public String name()
/*     */   {
/* 131 */     if (this.name == null) {
/* 132 */       return "";
/*     */     }
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
/* 152 */     if (this.type == null) {
/* 153 */       return "";
/*     */     }
/* 155 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(String type)
/*     */   {
/* 164 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String speed()
/*     */   {
/* 173 */     if (this.speed == null) {
/* 174 */       return "";
/*     */     }
/* 176 */     return this.speed;
/*     */   }
/*     */ 
/*     */   public void speed(String speed)
/*     */   {
/* 185 */     this.speed = speed;
/*     */   }
/*     */ 
/*     */   public String address()
/*     */   {
/* 194 */     if (this.address == null) {
/* 195 */       return "";
/*     */     }
/* 197 */     return this.address;
/*     */   }
/*     */ 
/*     */   public void address(String address)
/*     */   {
/* 206 */     this.address = address;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.input.InputInterface
 * JD-Core Version:    0.6.0
 */