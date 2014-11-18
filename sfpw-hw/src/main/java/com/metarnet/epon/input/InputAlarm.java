/*     */ package com.metarnet.epon.input;
/*     */ 
/*     */ public class InputAlarm
/*     */ {
/*     */   private String alarmId;
/*     */   private String objectType;
/*     */   private String objectName;
/*     */   private String oltId;
			private Object equip;  //告警所属设备或端口
/*     */   private String type;
/*     */   private String severity;
/*     */   private String cause;
/*     */   private String content;
/*     */   private String description;
/*     */   private String time;
/*     */   private String remark;
/*     */ 
/*     */   public InputAlarm()
/*     */   {
/*     */   }
/*     */ 
/*     */   public InputAlarm(String alarmId)
/*     */   {
/*  49 */     this.alarmId = alarmId;
/*     */   }
/*     */ 
/*     */   public InputAlarm(String alarmId, String objectType, String objectName, String oltId, String type, String severity, String cause, String content, String description, String time, String remark)
/*     */   {
/*  70 */     this.alarmId = alarmId;
/*  71 */     this.objectType = objectType;
/*  72 */     this.objectName = objectName;
/*  73 */     this.oltId = oltId;
/*  74 */     this.type = type;
/*  75 */     this.severity = severity;
/*  76 */     this.cause = cause;
/*  77 */     this.content = content;
/*  78 */     this.description = description;
/*  79 */     this.time = time;
/*  80 */     this.remark = remark;
/*     */   }
/*     */ 
/*     */   public String alarmId()
/*     */   {
/*  89 */     if (this.alarmId == null) {
/*  90 */       return "";
/*     */     }
/*  92 */     return this.alarmId;
/*     */   }
/*     */ 
/*     */   public void alarmId(String alarmId)
/*     */   {
/* 101 */     this.alarmId = alarmId;
/*     */   }
/*     */ 
/*     */   public String objectType()
/*     */   {
/* 110 */     if (this.objectType == null) {
/* 111 */       return "";
/*     */     }
/* 113 */     return this.objectType;
/*     */   }
/*     */ 
/*     */   public void objectType(String objectType)
/*     */   {
/* 122 */     this.objectType = objectType;
/*     */   }
/*     */ 
/*     */   public String objectName()
/*     */   {
/* 131 */     if (this.objectName == null) {
/* 132 */       return "";
/*     */     }
/* 134 */     return this.objectName;
/*     */   }
/*     */ 
/*     */   public void objectName(String objectName)
/*     */   {
/* 143 */     this.objectName = objectName;
/*     */   }
/*     */ 
/*     */   public String oltId()
/*     */   {
/* 152 */     if (this.oltId == null) {
/* 153 */       return "";
/*     */     }
/* 155 */     return this.oltId;
/*     */   }
/*     */ 
/*     */   public void oltId(String oltId)
/*     */   {
/* 164 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public String type()
/*     */   {
/* 173 */     if (this.type == null) {
/* 174 */       return "";
/*     */     }
/* 176 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(String type)
/*     */   {
/* 185 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String severity()
/*     */   {
/* 194 */     if (this.severity == null) {
/* 195 */       return "";
/*     */     }
/* 197 */     return this.severity;
/*     */   }
/*     */ 
/*     */   public void severity(String severity)
/*     */   {
/* 206 */     this.severity = severity;
/*     */   }
/*     */ 
/*     */   public String cause()
/*     */   {
/* 215 */     if (this.cause == null) {
/* 216 */       return "";
/*     */     }
/* 218 */     return this.cause;
/*     */   }
/*     */ 
/*     */   public void cause(String cause)
/*     */   {
/* 227 */     this.cause = cause;
/*     */   }
/*     */ 
/*     */   public String content()
/*     */   {
/* 236 */     if (this.content == null) {
/* 237 */       return "";
/*     */     }
/* 239 */     return this.content;
/*     */   }
/*     */ 
/*     */   public void content(String content)
/*     */   {
/* 248 */     this.content = content;
/*     */   }
/*     */ 
/*     */   public String description()
/*     */   {
/* 257 */     if (this.description == null) {
/* 258 */       return "";
/*     */     }
/* 260 */     return this.description;
/*     */   }
/*     */ 
/*     */   public void description(String description)
/*     */   {
/* 269 */     this.description = description;
/*     */   }
/*     */ 
/*     */   public String time()
/*     */   {
/* 278 */     if (this.time == null) {
/* 279 */       return "";
/*     */     }
/* 281 */     return this.time;
/*     */   }
/*     */ 
/*     */   public void time(String time)
/*     */   {
/* 290 */     this.time = time;
/*     */   }
/*     */ 
/*     */   public String remark()
/*     */   {
/* 299 */     if (this.remark == null) {
/* 300 */       return "";
/*     */     }
/* 302 */     return this.remark;
/*     */   }
/*     */ 
/*     */   public void remark(String remark)
/*     */   {
/* 311 */     this.remark = remark;
/*     */   }
public Object getEquip() {
	return equip;
}
public void setEquip(Object equip) {
	this.equip = equip;
}

			
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.input.InputAlarm
 * JD-Core Version:    0.6.0
 */