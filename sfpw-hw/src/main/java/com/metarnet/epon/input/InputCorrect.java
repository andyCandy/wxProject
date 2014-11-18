/*     */ package com.metarnet.epon.input;
/*     */ 
/*     */ import com.metarnet.common.CorrectType;
/*     */ 
/*     */ public class InputCorrect
/*     */ {
/*     */   private String oltId;
/*     */   private String objectType;
/*     */   private String objectName;
/*     */   private CorrectType type;
/*     */   private String attrnames;
/*     */   private String attrovalues;
/*     */   private String attrnvalues;
/*     */ 
/*     */   public InputCorrect()
/*     */   {
/*     */   }
/*     */ 
/*     */   public InputCorrect(String oltId, String objectType, String objectName, CorrectType type, String attrnames, String attrovalues, String attrnvalues)
/*     */   {
/*  47 */     this.oltId = oltId;
/*  48 */     this.objectType = objectType;
/*  49 */     this.objectName = objectName;
/*  50 */     this.type = type;
/*  51 */     this.attrnames = attrnames;
/*  52 */     this.attrovalues = attrovalues;
/*  53 */     this.attrnvalues = attrnvalues;
/*     */   }
/*     */ 
/*     */   public String oltId()
/*     */   {
/*  62 */     if (this.oltId == null) {
/*  63 */       return "";
/*     */     }
/*  65 */     return this.oltId;
/*     */   }
/*     */ 
/*     */   public void oltId(String oltId)
/*     */   {
/*  74 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public String objectType()
/*     */   {
/*  83 */     if (this.objectType == null) {
/*  84 */       return "";
/*     */     }
/*  86 */     return this.objectType;
/*     */   }
/*     */ 
/*     */   public void objectType(String objectType)
/*     */   {
/*  95 */     this.objectType = objectType;
/*     */   }
/*     */ 
/*     */   public String objectName()
/*     */   {
/* 104 */     if (this.objectName == null) {
/* 105 */       return "";
/*     */     }
/* 107 */     return this.objectName;
/*     */   }
/*     */ 
/*     */   public void objectName(String objectName)
/*     */   {
/* 116 */     this.objectName = objectName;
/*     */   }
/*     */ 
/*     */   public CorrectType type()
/*     */   {
/* 125 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(CorrectType type)
/*     */   {
/* 134 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String attrnames()
/*     */   {
/* 143 */     if (this.attrnames == null) {
/* 144 */       return "";
/*     */     }
/* 146 */     return this.attrnames;
/*     */   }
/*     */ 
/*     */   public void attrnames(String attrnames)
/*     */   {
/* 155 */     this.attrnames = attrnames;
/*     */   }
/*     */ 
/*     */   public String attrovalues()
/*     */   {
/* 164 */     if (this.attrovalues == null) {
/* 165 */       return "";
/*     */     }
/* 167 */     return this.attrovalues;
/*     */   }
/*     */ 
/*     */   public void attrovalues(String attrovalues)
/*     */   {
/* 176 */     this.attrovalues = attrovalues;
/*     */   }
/*     */ 
/*     */   public String attrnvalues()
/*     */   {
/* 185 */     if (this.attrnvalues == null) {
/* 186 */       return "";
/*     */     }
/* 188 */     return this.attrnvalues;
/*     */   }
/*     */ 
/*     */   public void attrnvalues(String attrnvalues)
/*     */   {
/* 197 */     this.attrnvalues = attrnvalues;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.input.InputCorrect
 * JD-Core Version:    0.6.0
 */