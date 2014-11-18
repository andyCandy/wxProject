package CosNotifyFilter;


/**
 *	Generated from IDL interface "MappingFilter"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class MappingFilterHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyFilter.MappingFilter s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyFilter.MappingFilter extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyFilter/MappingFilter:1.0", "MappingFilter");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/MappingFilter:1.0";
	}
	public static MappingFilter read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyFilter.MappingFilter s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyFilter.MappingFilter narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyFilter.MappingFilter)
		{
			return (CosNotifyFilter.MappingFilter)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyFilter.MappingFilter narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyFilter.MappingFilter)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyFilter/MappingFilter:1.0"))
			{
				CosNotifyFilter._MappingFilterStub stub;
				stub = new CosNotifyFilter._MappingFilterStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyFilter.MappingFilter)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyFilter.MappingFilter unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyFilter.MappingFilter)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyFilter._MappingFilterStub stub;
				stub = new CosNotifyFilter._MappingFilterStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyFilter.MappingFilter)stub;
		}
	}
}
