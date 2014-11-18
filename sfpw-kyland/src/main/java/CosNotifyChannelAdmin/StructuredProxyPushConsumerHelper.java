package CosNotifyChannelAdmin;


/**
 *	Generated from IDL interface "StructuredProxyPushConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class StructuredProxyPushConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyChannelAdmin.StructuredProxyPushConsumer s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyChannelAdmin.StructuredProxyPushConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyChannelAdmin/StructuredProxyPushConsumer:1.0", "StructuredProxyPushConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/StructuredProxyPushConsumer:1.0";
	}
	public static StructuredProxyPushConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyChannelAdmin.StructuredProxyPushConsumer s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyChannelAdmin.StructuredProxyPushConsumer narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyChannelAdmin.StructuredProxyPushConsumer)
		{
			return (CosNotifyChannelAdmin.StructuredProxyPushConsumer)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyChannelAdmin.StructuredProxyPushConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyChannelAdmin.StructuredProxyPushConsumer)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyChannelAdmin/StructuredProxyPushConsumer:1.0"))
			{
				CosNotifyChannelAdmin._StructuredProxyPushConsumerStub stub;
				stub = new CosNotifyChannelAdmin._StructuredProxyPushConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyChannelAdmin.StructuredProxyPushConsumer)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyChannelAdmin.StructuredProxyPushConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyChannelAdmin.StructuredProxyPushConsumer)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyChannelAdmin._StructuredProxyPushConsumerStub stub;
				stub = new CosNotifyChannelAdmin._StructuredProxyPushConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyChannelAdmin.StructuredProxyPushConsumer)stub;
		}
	}
}
