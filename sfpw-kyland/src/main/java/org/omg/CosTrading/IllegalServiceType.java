package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "IllegalServiceType"
 *	@author JacORB IDL compiler 
 */

public final class IllegalServiceType
	extends org.omg.CORBA.UserException
{
	public IllegalServiceType()
	{
		super(org.omg.CosTrading.IllegalServiceTypeHelper.id());
	}

	public java.lang.String type;
	public IllegalServiceType(java.lang.String _reason,java.lang.String type)
	{
		super(org.omg.CosTrading.IllegalServiceTypeHelper.id()+ " " + _reason);
		this.type = type;
	}
	public IllegalServiceType(java.lang.String type)
	{
		super(org.omg.CosTrading.IllegalServiceTypeHelper.id());
		this.type = type;
	}
}
