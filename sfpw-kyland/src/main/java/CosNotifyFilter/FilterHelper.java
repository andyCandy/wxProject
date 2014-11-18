package CosNotifyFilter;


/**
 *	Generated from IDL interface "Filter"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class FilterHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyFilter.Filter s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyFilter.Filter extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyFilter/Filter:1.0", "Filter");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/Filter:1.0";
	}
	public static Filter read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyFilter.Filter s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyFilter.Filter narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyFilter.Filter)
		{
			return (CosNotifyFilter.Filter)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyFilter.Filter narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyFilter.Filter)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyFilter/Filter:1.0"))
			{
				CosNotifyFilter._FilterStub stub;
				stub = new CosNotifyFilter._FilterStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyFilter.Filter)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyFilter.Filter unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyFilter.Filter)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyFilter._FilterStub stub;
				stub = new CosNotifyFilter._FilterStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyFilter.Filter)stub;
		}
	}
}
