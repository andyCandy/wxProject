/*     */ package com.metarnet.epon.input;
/*     */ 
/*     */ public class InputONU
/*     */ {
/*     */   private String oltId;
/*     */   private String onuId;
/*     */   private String splitterId;
/*     */   private String interfaceId;
/*     */   private String name;
/*     */   private String type;
/*     */   private String mac;
/*     */   private String ip;
/*     */   private String distance;
/*     */   private String vendor;
/*     */   public static final String SPLITTERID = "splitterId";
/*     */   public static final String INTERFACEID = "interfaceId";
/*     */   public static final String NAME = "name";
/*     */   public static final String TYPE = "type";
/*     */   public static final String MAC = "mac";
/*     */   public static final String IP = "ip";
/*     */   public static final String DISTANCE = "distance";
/*     */   public static final String VENDOR = "vendor";
/*     */ 
/*     */   public InputONU()
/*     */   {
/*     */   }
/*     */ 
/*     */   public InputONU(String oltId)
/*     */   {
/*  65 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public InputONU(String oltId, String onuId)
/*     */   {
/*  75 */     this.oltId = oltId;
/*  76 */     this.onuId = onuId;
/*     */   }
/*     */ 
/*     */   public InputONU(String oltId, String onuId, String splitterId, String interfaceId, String name, String type, String mac, String ip, String distance, String vendor)
/*     */   {
/*  95 */     this.oltId = oltId;
/*  96 */     this.onuId = onuId;
/*  97 */     this.splitterId = splitterId;
/*  98 */     this.interfaceId = interfaceId;
/*  99 */     this.name = name;
/* 100 */     this.type = type;
/* 101 */     this.mac = mac;
/* 102 */     this.ip = ip;
/* 103 */     this.distance = distance;
/* 104 */     this.vendor = vendor;
/*     */   }
/*     */ 
/*     */   public String oltId()
/*     */   {
/* 113 */     if (this.oltId == null) {
/* 114 */       return "";
/*     */     }
/* 116 */     return this.oltId;
/*     */   }
/*     */ 
/*     */   public void oltId(String oltId)
/*     */   {
/* 125 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public String onuId()
/*     */   {
/* 134 */     if (this.onuId == null) {
/* 135 */       return "";
/*     */     }
/* 137 */     return this.onuId;
/*     */   }
/*     */ 
/*     */   public void onuId(String onuId)
/*     */   {
/* 146 */     this.onuId = onuId;
/*     */   }
/*     */ 
/*     */   public String splitterId()
/*     */   {
/* 155 */     if (this.splitterId == null) {
/* 156 */       return "";
/*     */     }
/* 158 */     return this.splitterId;
/*     */   }
/*     */ 
/*     */   public void splitterId(String splitterId)
/*     */   {
/* 167 */     this.splitterId = splitterId;
/*     */   }
/*     */ 
/*     */   public String interfaceId()
/*     */   {
/* 176 */     if (this.interfaceId == null) {
/* 177 */       return "";
/*     */     }
/* 179 */     return this.interfaceId;
/*     */   }
/*     */ 
/*     */   public void interfaceId(String interfaceId)
/*     */   {
/* 188 */     this.interfaceId = interfaceId;
/*     */   }
/*     */ 
/*     */   public String name()
/*     */   {
/* 197 */     if (this.name == null) {
/* 198 */       return "";
/*     */     }
/* 200 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void name(String name)
/*     */   {
/* 209 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public String type()
/*     */   {
/* 218 */     if (this.type == null) {
/* 219 */       return "";
/*     */     }
/* 221 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(String type)
/*     */   {
/* 230 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String mac()
/*     */   {
/* 239 */     if (this.mac == null) {
/* 240 */       return "";
/*     */     }
/* 242 */     return this.mac;
/*     */   }
/*     */ 
/*     */   public void mac(String mac)
/*     */   {
/* 251 */     this.mac = mac;
/*     */   }
/*     */ 
/*     */   public String ip()
/*     */   {
/* 260 */     if (this.ip == null) {
/* 261 */       return "";
/*     */     }
/* 263 */     return this.ip;
/*     */   }
/*     */ 
/*     */   public void ip(String ip)
/*     */   {
/* 272 */     this.ip = ip;
/*     */   }
/*     */ 
/*     */   public String distance()
/*     */   {
/* 281 */     if (this.distance == null) {
/* 282 */       return "";
/*     */     }
/* 284 */     return this.distance;
/*     */   }
/*     */ 
/*     */   public void distance(String distance)
/*     */   {
/* 293 */     this.distance = distance;
/*     */   }
/*     */ 
/*     */   public String vendor()
/*     */   {
/* 302 */     if (this.vendor == null) {
/* 303 */       return "";
/*     */     }
/* 305 */     return this.vendor;
/*     */   }
/*     */ 
/*     */   public void vendor(String vendor)
/*     */   {
/* 314 */     this.vendor = vendor;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.input.InputONU
 * JD-Core Version:    0.6.0
 */