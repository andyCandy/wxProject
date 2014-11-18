package org.omg.CORBA;


/**
 *	Generated from IDL definition of struct "NamedValue"
 *	@author JacORB IDL compiler 
 */

public final class NamedValueHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.NamedValueHelper.id(),"NamedValue",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.IdentifierHelper.type(), null),new org.omg.CORBA.StructMember("argument", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null),new org.omg.CORBA.StructMember("len", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("arg_modes", org.omg.CORBA.FlagsHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.NamedValue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.NamedValue extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/NamedValue:1.0";
	}
	public static org.omg.CORBA.NamedValue read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.NamedValue result = new org.omg.CORBA.NamedValue();
		result.name=in.read_string();
		result.argument=in.read_any();
		result.len=in.read_long();
		result.arg_modes=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.NamedValue s)
	{
		out.write_string(s.name);
		out.write_any(s.argument);
		out.write_long(s.len);
		out.write_ulong(s.arg_modes);
	}
}
