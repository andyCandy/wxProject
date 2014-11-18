/*    */ package com.metarnet.epon.adapter;
/*    */ 
/*    */ public enum ObjectType
/*    */ {
/* 13 */   DOMAIN("com_domain", 0, "主域"), 
/*    */ 
/* 15 */   OLT("com_equipment", 1, "OLT设备"), 
/*    */ 
/* 17 */   ONU("epon_onu", 2, "ONU设备"), 
/*    */ 
/* 19 */   SPLITTER("epon_splitter", 2, "分光器"), 
/*    */ 
/* 21 */   INTERFACE("epon_interface", 2, "接口"), 
/*    */ 
/* 23 */   UNI("epon_uni", 3, "UNI接口");
/*    */ 
/*    */   private String value;
/*    */   private int length;
/*    */   private String description;
/*    */ 
/*    */   private ObjectType(String value, int length, String description)
/*    */   {
/* 40 */     this.value = value;
/* 41 */     this.length = length;
/* 42 */     this.description = description;
/*    */   }
/*    */ 
/*    */   public String value()
/*    */   {
/* 51 */     return this.value;
/*    */   }
/*    */ 
/*    */   public int length()
/*    */   {
/* 60 */     return this.length;
/*    */   }
/*    */ 
/*    */   public String description()
/*    */   {
/* 69 */     return this.description;
/*    */   }
/*    */ 
/*    */   public static ObjectType from_value(String value)
/*    */   {
/* 79 */     for (ObjectType type : values()) {
/* 80 */       if (type.value.equals(value)) {
/* 81 */         return type;
/*    */       }
/*    */     }
/* 84 */     return null;
/*    */   }
/*    */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.ObjectType
 * JD-Core Version:    0.6.0
 */