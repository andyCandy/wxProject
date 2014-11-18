package org.omg.CORBA;


/**
 *	Generated from IDL definition of struct "ServiceDetail"
 *	@author JacORB IDL compiler 
 */

public final class ServiceDetailHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ServiceDetailHelper.id(),"ServiceDetail",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("service_detail_type", org.omg.CORBA.ServiceDetailTypeHelper.type(), null),new org.omg.CORBA.StructMember("service_detail", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ServiceDetail s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.ServiceDetail extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/ServiceDetail:1.0";
	}
	public static org.omg.CORBA.ServiceDetail read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.ServiceDetail result = new org.omg.CORBA.ServiceDetail();
		result.service_detail_type=in.read_ulong();
		int _lresult_service_detail11 = in.read_long();
		result.service_detail = new byte[_lresult_service_detail11];
	in.read_octet_array(result.service_detail,0,_lresult_service_detail11);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.ServiceDetail s)
	{
		out.write_ulong(s.service_detail_type);
		
		out.write_long(s.service_detail.length);
		out.write_octet_array(s.service_detail,0,s.service_detail.length);
	}
}
