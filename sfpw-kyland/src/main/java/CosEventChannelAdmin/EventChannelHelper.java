package CosEventChannelAdmin;


/**
 *	Generated from IDL interface "EventChannel"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class EventChannelHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosEventChannelAdmin.EventChannel s)
	{
			any.insert_Object(s);
	}
	public static CosEventChannelAdmin.EventChannel extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosEventChannelAdmin/EventChannel:1.0", "EventChannel");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventChannelAdmin/EventChannel:1.0";
	}
	public static EventChannel read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosEventChannelAdmin.EventChannel s)
	{
		_out.write_Object(s);
	}
	public static CosEventChannelAdmin.EventChannel narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosEventChannelAdmin.EventChannel)
		{
			return (CosEventChannelAdmin.EventChannel)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosEventChannelAdmin.EventChannel narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosEventChannelAdmin.EventChannel)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosEventChannelAdmin/EventChannel:1.0"))
			{
				CosEventChannelAdmin._EventChannelStub stub;
				stub = new CosEventChannelAdmin._EventChannelStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (EventChannel) stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosEventChannelAdmin.EventChannel unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosEventChannelAdmin.EventChannel)obj;
		}
		catch (ClassCastException c)
		{
				CosEventChannelAdmin._EventChannelStub stub;
				stub = new CosEventChannelAdmin._EventChannelStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (EventChannel) stub;
		}
	}
}
