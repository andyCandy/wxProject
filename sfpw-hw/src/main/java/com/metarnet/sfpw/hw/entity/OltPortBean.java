package com.metarnet.sfpw.hw.entity;

public class OltPortBean {

	private String did;
	private String interfaceid;
	private String fn;
	private String sn;
	private String pn;
	private String pt;
	private String ptstat;
	private String name;
	private String alias;
	private String pspeed;
	private String pdirect;
	private String loopStat;
	private String teststat;
	private String fec;
	private String rn;
	private String astate;
	
	public OltPortBean(String portStr){
		
		String[] fields = portStr.split("\t");
		did = fields[0];
		fn = fields[1];
		sn = fields[2];
		pn = fields[3];
		pt = fields[4];
		ptstat = fields[5];
		name = fields[6];
		alias = fields[7].equals("--")?null:fields[7];
		pspeed = fields[8];
		pdirect = fields[9];
		loopStat = fields[10];
		teststat = fields[11];
		fec = fields[12];
		rn = fields[13];
		astate = fields[14].equals("--")?null:fields[14];
		interfaceid = "NA-"+fn+"-"+sn+"-"+pn;
	}
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getPn() {
		return pn;
	}
	public void setPn(String pn) {
		this.pn = pn;
	}
	public String getPt() {
		return pt;
	}
	public void setPt(String pt) {
		this.pt = pt;
	}
	public String getPtstat() {
		return ptstat;
	}
	public void setPtstat(String ptstat) {
		this.ptstat = ptstat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getPspeed() {
		return pspeed;
	}
	public void setPspeed(String pspeed) {
		this.pspeed = pspeed;
	}
	public String getPdirect() {
		return pdirect;
	}
	public void setPdirect(String pdirect) {
		this.pdirect = pdirect;
	}
	public String getLoopStat() {
		return loopStat;
	}
	public void setLoopStat(String loopStat) {
		this.loopStat = loopStat;
	}
	public String getTeststat() {
		return teststat;
	}
	public void setTeststat(String teststat) {
		this.teststat = teststat;
	}
	public String getFec() {
		return fec;
	}
	public void setFec(String fec) {
		this.fec = fec;
	}
	public String getRn() {
		return rn;
	}
	public void setRn(String rn) {
		this.rn = rn;
	}
	public String getAstate() {
		return astate;
	}
	public void setAstate(String astate) {
		this.astate = astate;
	}
	
	public String getInterfaceid() {
		return interfaceid;
	}

	public void setInterfaceid(String interfaceid) {
		this.interfaceid = interfaceid;
	}

	@Override
	public String toString() {
		return "OltPortBean [did=" + did + ", interfaceid=" + interfaceid
				+ ", fn=" + fn + ", sn=" + sn + ", pn=" + pn + ", pt=" + pt
				+ ", ptstat=" + ptstat + ", name=" + name + ", alias=" + alias
				+ ", pspeed=" + pspeed + ", pdirect=" + pdirect + ", loopStat="
				+ loopStat + ", teststat=" + teststat + ", fec=" + fec
				+ ", rn=" + rn + ", astate=" + astate + "]";
	}


}
