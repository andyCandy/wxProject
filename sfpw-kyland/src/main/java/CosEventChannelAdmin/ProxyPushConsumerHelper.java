package CosEventChannelAdmin;


/**
 *	Generated from IDL interface "ProxyPushConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class ProxyPushConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosEventChannelAdmin.ProxyPushConsumer s)
	{
			any.insert_Object(s);
	}
	public static CosEventChannelAdmin.ProxyPushConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosEventChannelAdmin/ProxyPushConsumer:1.0", "ProxyPushConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventChannelAdmin/ProxyPushConsumer:1.0";
	}
	public static ProxyPushConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosEventChannelAdmin.ProxyPushConsumer s)
	{
		_out.write_Object(s);
	}
	public static CosEventChannelAdmin.ProxyPushConsumer narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosEventChannelAdmin.ProxyPushConsumer)
		{
			return (CosEventChannelAdmin.ProxyPushConsumer)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosEventChannelAdmin.ProxyPushConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosEventChannelAdmin.ProxyPushConsumer)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosEventChannelAdmin/ProxyPushConsumer:1.0"))
			{
				CosEventChannelAdmin._ProxyPushConsumerStub stub;
				stub = new CosEventChannelAdmin._ProxyPushConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosEventChannelAdmin.ProxyPushConsumer)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosEventChannelAdmin.ProxyPushConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosEventChannelAdmin.ProxyPushConsumer)obj;
		}
		catch (ClassCastException c)
		{
				CosEventChannelAdmin._ProxyPushConsumerStub stub;
				stub = new CosEventChannelAdmin._ProxyPushConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosEventChannelAdmin.ProxyPushConsumer)stub;
		}
	}
}
