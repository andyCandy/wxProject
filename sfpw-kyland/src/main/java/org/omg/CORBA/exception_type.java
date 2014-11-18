package org.omg.CORBA;
/**
 *	Generated from IDL definition of enum "exception_type"
 *	@author JacORB IDL compiler 
 */

public final class exception_type
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _NO_EXCEPTION = 0;
	public static final exception_type NO_EXCEPTION = new exception_type(_NO_EXCEPTION);
	public static final int _USER_EXCEPTION = 1;
	public static final exception_type USER_EXCEPTION = new exception_type(_USER_EXCEPTION);
	public static final int _SYSTEM_EXCEPTION = 2;
	public static final exception_type SYSTEM_EXCEPTION = new exception_type(_SYSTEM_EXCEPTION);
	public int value()
	{
		return value;
	}
	public static exception_type from_int(int value)
	{
		switch (value) {
			case _NO_EXCEPTION: return NO_EXCEPTION;
			case _USER_EXCEPTION: return USER_EXCEPTION;
			case _SYSTEM_EXCEPTION: return SYSTEM_EXCEPTION;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected exception_type(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
