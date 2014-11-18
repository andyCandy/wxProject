/*    */ package com.metarnet.epon.manager.mms;
/*    */ 
/*    */ import com.metarnet.epon.adapter.Speed;
/*    */ import com.metarnet.util.AttrAddition;
/*    */ 
/*    */ public class EPONAttrAddition extends AttrAddition
/*    */ {
/*    */   public boolean add(String name, Integer value)
/*    */   {
/* 30 */     if (value == null) {
/* 31 */       return false;
/*    */     }
/*    */ 
/* 35 */     return add(name, value.toString());
/*    */   }
/*    */ 
/*    */   public boolean add(String name, Speed value)
/*    */   {
/* 47 */     if (value == null) {
/* 48 */       return false;
/*    */     }
/*    */ 
/* 52 */     return add(name, value.value());
/*    */   }
/*    */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.manager.mms.EPONAttrAddition
 * JD-Core Version:    0.6.0
 */