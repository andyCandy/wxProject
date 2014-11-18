package org.omg.CORBA;
/**
 *	Generated from IDL definition of enum "ParameterMode"
 *	@author JacORB IDL compiler 
 */

public final class ParameterModeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CORBA.ParameterModeHelper.id(),"ParameterMode",new String[]{"PARAM_IN","PARAM_OUT","PARAM_INOUT"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ParameterMode s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.ParameterMode extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/ParameterMode:1.0";
	}
	public static ParameterMode read (final org.omg.CORBA.portable.InputStream in)
	{
		return ParameterMode.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ParameterMode s)
	{
		out.write_long(s.value());
	}
}
