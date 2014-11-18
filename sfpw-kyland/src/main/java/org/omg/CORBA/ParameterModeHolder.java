package org.omg.CORBA;
/**
 *	Generated from IDL definition of enum "ParameterMode"
 *	@author JacORB IDL compiler 
 */

public final class ParameterModeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ParameterMode value;

	public ParameterModeHolder ()
	{
	}
	public ParameterModeHolder (final ParameterMode initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ParameterModeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ParameterModeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ParameterModeHelper.write (out,value);
	}
}
