package org.omg.CORBA;


/**
 *	Generated from IDL definition of struct "ServiceInformation"
 *	@author JacORB IDL compiler 
 */

public final class ServiceInformationHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ServiceInformationHelper.id(),"ServiceInformation",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("service_options", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ServiceOptionHelper.type()), null),new org.omg.CORBA.StructMember("service_details", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ServiceDetailHelper.type()), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ServiceInformation s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.ServiceInformation extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/ServiceInformation:1.0";
	}
	public static org.omg.CORBA.ServiceInformation read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.ServiceInformation result = new org.omg.CORBA.ServiceInformation();
		int _lresult_service_options12 = in.read_long();
		result.service_options = new int[_lresult_service_options12];
		for (int i=0;i<result.service_options.length;i++)
		{
			result.service_options[i]=in.read_ulong();
		}

		int _lresult_service_details13 = in.read_long();
		result.service_details = new org.omg.CORBA.ServiceDetail[_lresult_service_details13];
		for (int i=0;i<result.service_details.length;i++)
		{
			result.service_details[i]=org.omg.CORBA.ServiceDetailHelper.read(in);
		}

		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.ServiceInformation s)
	{
		
		out.write_long(s.service_options.length);
		for (int i=0; i<s.service_options.length;i++)
		{
			out.write_ulong(s.service_options[i]);
		}

		
		out.write_long(s.service_details.length);
		for (int i=0; i<s.service_details.length;i++)
		{
			org.omg.CORBA.ServiceDetailHelper.write(out,s.service_details[i]);
		}

	}
}
