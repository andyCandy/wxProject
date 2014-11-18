package CosNotifyFilter;


/**
 *	Generated from IDL interface "FilterFactory"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class FilterFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyFilter.FilterFactory s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyFilter.FilterFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyFilter/FilterFactory:1.0", "FilterFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/FilterFactory:1.0";
	}
	public static FilterFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyFilter.FilterFactory s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyFilter.FilterFactory narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyFilter.FilterFactory)
		{
			return (CosNotifyFilter.FilterFactory)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyFilter.FilterFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyFilter.FilterFactory)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyFilter/FilterFactory:1.0"))
			{
				CosNotifyFilter._FilterFactoryStub stub;
				stub = new CosNotifyFilter._FilterFactoryStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyFilter.FilterFactory)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyFilter.FilterFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyFilter.FilterFactory)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyFilter._FilterFactoryStub stub;
				stub = new CosNotifyFilter._FilterFactoryStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyFilter.FilterFactory)stub;
		}
	}
}
