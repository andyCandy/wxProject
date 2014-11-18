/*     */ package com.metarnet.epon.adapter;
/*     */ 
/*     */ import com.metarnet.common.AlarmSeverity;
/*     */ import com.metarnet.common.AlarmType;
/*     */ 
/*     */ public class Alarm
/*     */ {
/*     */   private String alarmId;
/*     */   private ObjectType objectType;
/*     */   private String[] objectName;
/*     */   private AlarmType type;
/*     */   private AlarmSeverity severity;
/*     */   private String cause;
/*     */   private String content;
/*     */   private String description;
/*     */   private String time;
/*     */   private String remark;
/*     */ 
/*     */   public Alarm()
/*     */   {
/*     */   }
/*     */ 
/*     */   public Alarm(String alarmId)
/*     */   {
/*  49 */     this.alarmId = alarmId;
/*     */   }
/*     */ 
/*     */   public Alarm(String alarmId, ObjectType objectType, String[] objectName, AlarmType type, AlarmSeverity severity, String cause, String content, String description, String time, String remark)
/*     */   {
/*  69 */     this.alarmId = alarmId;
/*  70 */     this.objectType = objectType;
/*  71 */     this.objectName = objectName;
/*  72 */     this.type = type;
/*  73 */     this.severity = severity;
/*  74 */     this.cause = cause;
/*  75 */     this.content = content;
/*  76 */     this.description = description;
/*  77 */     this.time = time;
/*  78 */     this.remark = remark;
/*     */   }
/*     */ 
/*     */   public String alarmId()
/*     */   {
/*  87 */     if (this.alarmId == null) {
/*  88 */       return "";
/*     */     }
/*  90 */     return this.alarmId;
/*     */   }
/*     */ 
/*     */   public void alarmId(String alarmId)
/*     */   {
/*  99 */     this.alarmId = alarmId;
/*     */   }
/*     */ 
/*     */   public ObjectType objectType()
/*     */   {
/* 108 */     return this.objectType;
/*     */   }
/*     */ 
/*     */   public void objectType(ObjectType objectType)
/*     */   {
/* 117 */     this.objectType = objectType;
/*     */   }
/*     */ 
/*     */   public String[] objectName()
/*     */   {
/* 126 */     return this.objectName;
/*     */   }
/*     */ 
/*     */   public void objectName(String[] objectName)
/*     */   {
/* 135 */     this.objectName = objectName;
/*     */   }
/*     */ 
/*     */   public AlarmType type()
/*     */   {
/* 144 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(AlarmType type)
/*     */   {
/* 153 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public AlarmSeverity severity()
/*     */   {
/* 162 */     return this.severity;
/*     */   }
/*     */ 
/*     */   public void severity(AlarmSeverity severity)
/*     */   {
/* 171 */     this.severity = severity;
/*     */   }
/*     */ 
/*     */   public String cause()
/*     */   {
/* 180 */     return this.cause;
/*     */   }
/*     */ 
/*     */   public void cause(String cause)
/*     */   {
/* 189 */     this.cause = cause;
/*     */   }
/*     */ 
/*     */   public String content()
/*     */   {
/* 198 */     return this.content;
/*     */   }
/*     */ 
/*     */   public void content(String content)
/*     */   {
/* 207 */     this.content = content;
/*     */   }
/*     */ 
/*     */   public String description()
/*     */   {
/* 216 */     return this.description;
/*     */   }
/*     */ 
/*     */   public void description(String description)
/*     */   {
/* 225 */     this.description = description;
/*     */   }
/*     */ 
/*     */   public String time()
/*     */   {
/* 234 */     return this.time;
/*     */   }
/*     */ 
/*     */   public void time(String time)
/*     */   {
/* 243 */     this.time = time;
/*     */   }
/*     */ 
/*     */   public String remark()
/*     */   {
/* 252 */     return this.remark;
/*     */   }
/*     */ 
/*     */   public void remark(String remark)
/*     */   {
/* 261 */     this.remark = remark;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.Alarm
 * JD-Core Version:    0.6.0
 */