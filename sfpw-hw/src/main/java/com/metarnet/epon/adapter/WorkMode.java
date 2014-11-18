/*    */ package com.metarnet.epon.adapter;
/*    */ 
/*    */ public enum WorkMode
/*    */ {
/* 12 */   AUTO("auto", "自动模式"), 
/*    */ 
/* 14 */   HALF("half", "半双工模式"), 
/*    */ 
/* 16 */   FULL("full", "全双工模式"), 
/*    */ 
/* 18 */   UNKNOWN("unknown", "未知模式");
/*    */ 
/*    */   private String value;
/*    */   private String description;
/*    */ 
/*    */   private WorkMode(String value, String description)
/*    */   {
/* 32 */     this.value = value;
/* 33 */     this.description = description;
/*    */   }
/*    */ 
/*    */   public String value()
/*    */   {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public String description()
/*    */   {
/* 51 */     return this.description;
/*    */   }
/*    */ 
/*    */   public static WorkMode from_value(String value)
/*    */   {
/* 61 */     for (WorkMode mode : values()) {
/* 62 */       if (mode.value.equals(value)) {
/* 63 */         return mode;
/*    */       }
/*    */     }
/* 66 */     return null;
/*    */   }
/*    */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.WorkMode
 * JD-Core Version:    0.6.0
 */