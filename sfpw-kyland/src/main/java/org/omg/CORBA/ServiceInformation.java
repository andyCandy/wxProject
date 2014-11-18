package org.omg.CORBA;

/**
 *	Generated from IDL definition of struct "ServiceInformation"
 *	@author JacORB IDL compiler 
 */

public final class ServiceInformation
	implements org.omg.CORBA.portable.IDLEntity
{
	public ServiceInformation(){}
	public int[] service_options;
	public org.omg.CORBA.ServiceDetail[] service_details;
	public ServiceInformation(int[] service_options, org.omg.CORBA.ServiceDetail[] service_details)
	{
		this.service_options = service_options;
		this.service_details = service_details;
	}
}
