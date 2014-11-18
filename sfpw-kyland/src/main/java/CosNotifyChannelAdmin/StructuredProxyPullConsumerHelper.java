package CosNotifyChannelAdmin;


/**
 *	Generated from IDL interface "StructuredProxyPullConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class StructuredProxyPullConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyChannelAdmin.StructuredProxyPullConsumer s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyChannelAdmin.StructuredProxyPullConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyChannelAdmin/StructuredProxyPullConsumer:1.0", "StructuredProxyPullConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/StructuredProxyPullConsumer:1.0";
	}
	public static StructuredProxyPullConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyChannelAdmin.StructuredProxyPullConsumer s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyChannelAdmin.StructuredProxyPullConsumer narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyChannelAdmin.StructuredProxyPullConsumer)
		{
			return (CosNotifyChannelAdmin.StructuredProxyPullConsumer)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyChannelAdmin.StructuredProxyPullConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyChannelAdmin.StructuredProxyPullConsumer)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyChannelAdmin/StructuredProxyPullConsumer:1.0"))
			{
				CosNotifyChannelAdmin._StructuredProxyPullConsumerStub stub;
				stub = new CosNotifyChannelAdmin._StructuredProxyPullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyChannelAdmin.StructuredProxyPullConsumer)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyChannelAdmin.StructuredProxyPullConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyChannelAdmin.StructuredProxyPullConsumer)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyChannelAdmin._StructuredProxyPullConsumerStub stub;
				stub = new CosNotifyChannelAdmin._StructuredProxyPullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyChannelAdmin.StructuredProxyPullConsumer)stub;
		}
	}
}
