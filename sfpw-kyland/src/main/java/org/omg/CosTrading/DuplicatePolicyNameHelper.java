package org.omg.CosTrading;


/**
 *	Generated from IDL definition of exception "DuplicatePolicyName"
 *	@author JacORB IDL compiler 
 */

public final class DuplicatePolicyNameHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosTrading.DuplicatePolicyNameHelper.id(),"DuplicatePolicyName",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CosTrading.PolicyNameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.DuplicatePolicyName s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.DuplicatePolicyName extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/DuplicatePolicyName:1.0";
	}
	public static org.omg.CosTrading.DuplicatePolicyName read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.DuplicatePolicyName result = new org.omg.CosTrading.DuplicatePolicyName();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.name=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.DuplicatePolicyName s)
	{
		out.write_string(id());
		out.write_string(s.name);
	}
}
