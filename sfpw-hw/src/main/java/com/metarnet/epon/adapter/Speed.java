/*    */ package com.metarnet.epon.adapter;
/*    */ 
/*    */ public enum Speed
/*    */ {
/* 12 */   SPEED10M("10Mb/s", "十兆速率"), 
/*    */ 
/* 14 */   SPEED100M("100Mb/s", "百兆速率"), 
/*    */ 
/* 16 */   SPEED1000M("1000Mb/s", "千兆速率"), 
/*    */ 
/* 18 */   UNKONWN("unknown", "未知速率");
/*    */ 
/*    */   private String value;
/*    */   private String description;
/*    */ 
/*    */   private Speed(String value, String description)
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
/*    */   public static Speed from_value(String value)
/*    */   {
/* 61 */     for (Speed speed : values()) {
/* 62 */       if (speed.value.equals(value)) {
/* 63 */         return speed;
/*    */       }
/*    */     }
/* 66 */     return null;
/*    */   }
/*    */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.Speed
 * JD-Core Version:    0.6.0
 */