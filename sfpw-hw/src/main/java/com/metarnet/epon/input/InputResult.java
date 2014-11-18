/*    */ package com.metarnet.epon.input;
/*    */ 
/*    */ public class InputResult
/*    */ {
/*    */   private boolean result;
/*    */   private String reason;
/*    */ 
/*    */   public boolean result()
/*    */   {
/* 28 */     return this.result;
/*    */   }
/*    */ 
/*    */   public void result(boolean result)
/*    */   {
/* 37 */     this.result = result;
/*    */   }
/*    */ 
/*    */   public String reason()
/*    */   {
/* 46 */     return this.reason;
/*    */   }
/*    */ 
/*    */   public void reason(String reason)
/*    */   {
/* 55 */     this.reason = reason;
/*    */   }
@Override
public String toString() {
	return "InputResult [result=" + result + ", reason=" + reason + "]";
}
	
/*    */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.input.InputResult
 * JD-Core Version:    0.6.0
 */