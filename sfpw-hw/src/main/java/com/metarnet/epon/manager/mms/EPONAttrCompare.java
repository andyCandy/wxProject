/*    */ package com.metarnet.epon.manager.mms;
/*    */ 
/*    */ import com.metarnet.epon.adapter.Speed;
/*    */ import com.metarnet.util.AttrCompare;
/*    */ 
/*    */ public class EPONAttrCompare extends AttrCompare
/*    */ {
/*    */   public boolean add(String name, String ovalue, Integer nvalue)
/*    */   {
/* 31 */     if (nvalue == null) {
/* 32 */       return false;
/*    */     }
/*    */ 
/* 36 */     return add(name, ovalue, nvalue.toString());
/*    */   }
/*    */ 
/*    */   public boolean add(String name, String ovalue, Speed nvalue)
/*    */   {
/* 49 */     if (nvalue == null) {
/* 50 */       return false;
/*    */     }
/*    */ 
/* 54 */     return add(name, ovalue, nvalue.value());
/*    */   }
/*    */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.manager.mms.EPONAttrCompare
 * JD-Core Version:    0.6.0
 */