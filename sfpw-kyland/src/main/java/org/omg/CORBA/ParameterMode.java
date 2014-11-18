package org.omg.CORBA;
/**
 *	Generated from IDL definition of enum "ParameterMode"
 *	@author JacORB IDL compiler 
 */

public final class ParameterMode
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _PARAM_IN = 0;
	public static final ParameterMode PARAM_IN = new ParameterMode(_PARAM_IN);
	public static final int _PARAM_OUT = 1;
	public static final ParameterMode PARAM_OUT = new ParameterMode(_PARAM_OUT);
	public static final int _PARAM_INOUT = 2;
	public static final ParameterMode PARAM_INOUT = new ParameterMode(_PARAM_INOUT);
	public int value()
	{
		return value;
	}
	public static ParameterMode from_int(int value)
	{
		switch (value) {
			case _PARAM_IN: return PARAM_IN;
			case _PARAM_OUT: return PARAM_OUT;
			case _PARAM_INOUT: return PARAM_INOUT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ParameterMode(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
