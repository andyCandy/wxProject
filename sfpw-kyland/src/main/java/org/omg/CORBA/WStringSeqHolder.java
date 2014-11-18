package org.omg.CORBA;

/**
 *	Generated from IDL definition of alias "WStringSeq"
 *	@author JacORB IDL compiler 
 */

public final class WStringSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public WStringSeqHolder ()
	{
	}
	public WStringSeqHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return WStringSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = WStringSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		WStringSeqHelper.write (out,value);
	}
}
