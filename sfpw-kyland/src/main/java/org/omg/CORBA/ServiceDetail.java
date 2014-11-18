package org.omg.CORBA;

/**
 *	Generated from IDL definition of struct "ServiceDetail"
 *	@author JacORB IDL compiler 
 */

public final class ServiceDetail
	implements org.omg.CORBA.portable.IDLEntity
{
	public ServiceDetail(){}
	public int service_detail_type;
	public byte[] service_detail;
	public ServiceDetail(int service_detail_type, byte[] service_detail)
	{
		this.service_detail_type = service_detail_type;
		this.service_detail = service_detail;
	}
}
