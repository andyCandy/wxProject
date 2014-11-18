package org.omg.CORBA;
/**
 *	Generated from IDL definition of enum "TCKind"
 *	@author JacORB IDL compiler 
 */

public final class TCKindHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CORBA.TCKindHelper.id(),"TCKind",new String[]{"tk_null","tk_void","tk_short","tk_long","tk_ushort","tk_ulong","tk_float","tk_double","tk_boolean","tk_char","tk_octet","tk_any","tk_TypeCode","tk_Principal","tk_objref","tk_struct","tk_union","tk_enum","tk_string","tk_sequence","tk_array","tk_alias","tk_except","tk_longlong","tk_ulonglong","tk_longdouble","tk_wchar","tk_wstring","tk_fixed","tk_value","tk_value_box","tk_native","tk_abstract_interface","tk_local_interface","tk_component","tk_home"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.TCKind s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.TCKind extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/TCKind:1.0";
	}
	public static TCKind read (final org.omg.CORBA.portable.InputStream in)
	{
		return TCKind.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final TCKind s)
	{
		out.write_long(s.value());
	}
}
