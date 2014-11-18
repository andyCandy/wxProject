package org.omg.CORBA;

/**
 *	Generated from IDL definition of struct "NamedValue"
 *	@author JacORB IDL compiler 
 */

public final class NamedValue
	implements org.omg.CORBA.portable.IDLEntity
{
	public NamedValue(){}
	public java.lang.String name;
	public org.omg.CORBA.Any argument;
	public int len;
	public int arg_modes;
	public NamedValue(java.lang.String name, org.omg.CORBA.Any argument, int len, int arg_modes)
	{
		this.name = name;
		this.argument = argument;
		this.len = len;
		this.arg_modes = arg_modes;
	}
}
