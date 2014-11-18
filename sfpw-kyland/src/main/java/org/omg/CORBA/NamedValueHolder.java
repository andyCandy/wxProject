package org.omg.CORBA;

/**
 *	Generated from IDL definition of struct "NamedValue"
 *	@author JacORB IDL compiler 
 */

public final class NamedValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.NamedValue value;

	public NamedValueHolder ()
	{
	}
	public NamedValueHolder(final org.omg.CORBA.NamedValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.NamedValueHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.NamedValueHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.NamedValueHelper.write(_out, value);
	}
}
