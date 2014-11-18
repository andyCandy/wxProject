package CosNotifyComm;


/**
 *	Generated from IDL interface "NotifyPublish"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class NotifyPublishHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyComm.NotifyPublish s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyComm.NotifyPublish extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyComm/NotifyPublish:1.0", "NotifyPublish");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/NotifyPublish:1.0";
	}
	public static NotifyPublish read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyComm.NotifyPublish s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyComm.NotifyPublish narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyComm.NotifyPublish)
		{
			return (CosNotifyComm.NotifyPublish)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyComm.NotifyPublish narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyComm.NotifyPublish)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyComm/NotifyPublish:1.0"))
			{
				CosNotifyComm._NotifyPublishStub stub;
				stub = new CosNotifyComm._NotifyPublishStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyComm.NotifyPublish)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyComm.NotifyPublish unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyComm.NotifyPublish)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyComm._NotifyPublishStub stub;
				stub = new CosNotifyComm._NotifyPublishStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyComm.NotifyPublish)stub;
		}
	}
}
