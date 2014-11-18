package CosNotifyChannelAdmin;


/**
 *	Generated from IDL interface "EventChannelFactory"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class EventChannelFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyChannelAdmin.EventChannelFactory s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyChannelAdmin.EventChannelFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyChannelAdmin/EventChannelFactory:1.0", "EventChannelFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/EventChannelFactory:1.0";
	}
	public static EventChannelFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyChannelAdmin.EventChannelFactory s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyChannelAdmin.EventChannelFactory narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyChannelAdmin.EventChannelFactory)
		{
			return (CosNotifyChannelAdmin.EventChannelFactory)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyChannelAdmin.EventChannelFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyChannelAdmin.EventChannelFactory)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyChannelAdmin/EventChannelFactory:1.0"))
			{
				CosNotifyChannelAdmin._EventChannelFactoryStub stub;
				stub = new CosNotifyChannelAdmin._EventChannelFactoryStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyChannelAdmin.EventChannelFactory)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyChannelAdmin.EventChannelFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyChannelAdmin.EventChannelFactory)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyChannelAdmin._EventChannelFactoryStub stub;
				stub = new CosNotifyChannelAdmin._EventChannelFactoryStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyChannelAdmin.EventChannelFactory)stub;
		}
	}
}
