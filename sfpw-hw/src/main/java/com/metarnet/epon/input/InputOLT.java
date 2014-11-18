/*     */ package com.metarnet.epon.input;
/*     */ 
/*     */ public class InputOLT
/*     */ {
/*     */   private String oltId;
/*     */   private String name;
/*     */   private String type;
/*     */   private String version;
/*     */   private String address;
/*     */   private String vendor;
/*     */   public static final String NAME = "NAME";
/*     */   public static final String TYPE = "TYPE";
/*     */   public static final String VERSION = "VERSION";
/*     */   public static final String ADDRESS = "ADDRESS";
/*     */   public static final String VENDOR = "VENDOR";
/*     */ 
/*     */   public InputOLT()
/*     */   {
/*     */   }
/*     */ 
/*     */   public InputOLT(String oltId)
/*     */   {
/*  51 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public InputOLT(String oltId, String name, String type, String version, String address, String vendor)
/*     */   {
/*  66 */     this.oltId = oltId;
/*  67 */     this.name = name;
/*  68 */     this.type = type;
/*  69 */     this.version = version;
/*  70 */     this.address = address;
/*  71 */     this.vendor = vendor;
/*     */   }
/*     */ 
/*     */   public String oltId()
/*     */   {
/*  80 */     if (this.oltId == null) {
/*  81 */       return "";
/*     */     }
/*  83 */     return this.oltId;
/*     */   }
/*     */ 
/*     */   public void oltId(String oltId)
/*     */   {
/*  92 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public String name()
/*     */   {
/* 101 */     if (this.name == null) {
/* 102 */       return "";
/*     */     }
/* 104 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void name(String name)
/*     */   {
/* 113 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public String type()
/*     */   {
/* 122 */     if (this.type == null) {
/* 123 */       return "";
/*     */     }
/* 125 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(String type)
/*     */   {
/* 134 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String version()
/*     */   {
/* 143 */     if (this.version == null) {
/* 144 */       return "";
/*     */     }
/* 146 */     return this.version;
/*     */   }
/*     */ 
/*     */   public void version(String version)
/*     */   {
/* 155 */     this.version = version;
/*     */   }
/*     */ 
/*     */   public String address()
/*     */   {
/* 164 */     if (this.address == null) {
/* 165 */       return "";
/*     */     }
/* 167 */     return this.address;
/*     */   }
/*     */ 
/*     */   public void address(String address)
/*     */   {
/* 176 */     this.address = address;
/*     */   }
/*     */ 
/*     */   public String vendor()
/*     */   {
/* 185 */     if (this.vendor == null) {
/* 186 */       return "";
/*     */     }
/* 188 */     return this.vendor;
/*     */   }
/*     */ 
/*     */   public void vendor(String vendor)
/*     */   {
/* 197 */     this.vendor = vendor;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.input.InputOLT
 * JD-Core Version:    0.6.0
 */