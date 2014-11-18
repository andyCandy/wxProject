/*     */ package com.metarnet.epon.adapter;
/*     */ 
/*     */ import com.metarnet.common.Vendor;
/*     */ 
/*     */ public class ONU
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
/*     */   private Vendor vendor;
/*     */ 
/*     */   public ONU()
/*     */   {
/*     */   }
/*     */ 
/*     */   public ONU(String oltId)
/*     */   {
/*  49 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public ONU(String oltId, String onuId)
/*     */   {
/*  59 */     this.oltId = oltId;
/*  60 */     this.onuId = onuId;
/*     */   }
/*     */ 
/*     */   public ONU(String oltId, String onuId, String splitterId, String interfaceId, String name, String type, String mac, String ip, String distance, Vendor vendor)
/*     */   {
/*  79 */     this.oltId = oltId;
/*  80 */     this.onuId = onuId;
/*  81 */     this.splitterId = splitterId;
/*  82 */     this.interfaceId = interfaceId;
/*  83 */     this.name = name;
/*  84 */     this.type = type;
/*  85 */     this.mac = mac;
/*  86 */     this.ip = ip;
/*  87 */     this.distance = distance;
/*  88 */     this.vendor = vendor;
/*     */   }
/*     */ 
/*     */   public String oltId()
/*     */   {
/*  97 */     if (this.oltId == null) {
/*  98 */       return "";
/*     */     }
/* 100 */     return this.oltId;
/*     */   }
/*     */ 
/*     */   public void oltId(String oltId)
/*     */   {
/* 109 */     this.oltId = oltId;
/*     */   }
/*     */ 
/*     */   public String onuId()
/*     */   {
/* 118 */     if (this.onuId == null) {
/* 119 */       return "";
/*     */     }
/* 121 */     return this.onuId;
/*     */   }
/*     */ 
/*     */   public void onuId(String onuId)
/*     */   {
/* 130 */     this.onuId = onuId;
/*     */   }
/*     */ 
/*     */   public String splitterId()
/*     */   {
/* 139 */     return this.splitterId;
/*     */   }
/*     */ 
/*     */   public void splitterId(String splitterId)
/*     */   {
/* 148 */     this.splitterId = splitterId;
/*     */   }
/*     */ 
/*     */   public String interfaceId()
/*     */   {
/* 157 */     return this.interfaceId;
/*     */   }
/*     */ 
/*     */   public void interfaceId(String interfaceId)
/*     */   {
/* 166 */     this.interfaceId = interfaceId;
/*     */   }
/*     */ 
/*     */   public String name()
/*     */   {
/* 175 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void name(String name)
/*     */   {
/* 184 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public String type()
/*     */   {
/* 193 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void type(String type)
/*     */   {
/* 202 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String mac()
/*     */   {
/* 211 */     return this.mac;
/*     */   }
/*     */ 
/*     */   public void mac(String mac)
/*     */   {
/* 220 */     this.mac = mac;
/*     */   }
/*     */ 
/*     */   public String ip()
/*     */   {
/* 229 */     return this.ip;
/*     */   }
/*     */ 
/*     */   public void ip(String ip)
/*     */   {
/* 238 */     this.ip = ip;
/*     */   }
/*     */ 
/*     */   public String distance()
/*     */   {
/* 247 */     return this.distance;
/*     */   }
/*     */ 
/*     */   public void distance(String distance)
/*     */   {
/* 256 */     this.distance = distance;
/*     */   }
/*     */ 
/*     */   public Vendor vendor()
/*     */   {
/* 265 */     return this.vendor;
/*     */   }
/*     */ 
/*     */   public void vendor(Vendor vendor)
/*     */   {
/* 274 */     this.vendor = vendor;
/*     */   }
/*     */ }

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.ONU
 * JD-Core Version:    0.6.0
 */