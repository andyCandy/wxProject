package CosEventChannelAdmin;


/**
 *	Generated from IDL interface "ProxyPullConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class ProxyPullConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosEventChannelAdmin.ProxyPullConsumer s)
	{
			any.insert_Object(s);
	}
	public static CosEventChannelAdmin.ProxyPullConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosEventChannelAdmin/ProxyPullConsumer:1.0", "ProxyPullConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventChannelAdmin/ProxyPullConsumer:1.0";
	}
	public static ProxyPullConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosEventChannelAdmin.ProxyPullConsumer s)
	{
		_out.write_Object(s);
	}
	public static CosEventChannelAdmin.ProxyPullConsumer narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosEventChannelAdmin.ProxyPullConsumer)
		{
			return (CosEventChannelAdmin.ProxyPullConsumer)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosEventChannelAdmin.ProxyPullConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosEventChannelAdmin.ProxyPullConsumer)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosEventChannelAdmin/ProxyPullConsumer:1.0"))
			{
				CosEventChannelAdmin._ProxyPullConsumerStub stub;
				stub = new CosEventChannelAdmin._ProxyPullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (ProxyPullConsumer) stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosEventChannelAdmin.ProxyPullConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosEventChannelAdmin.ProxyPullConsumer)obj;
		}
		catch (ClassCastException c)
		{
				CosEventChannelAdmin._ProxyPullConsumerStub stub;
				stub = new CosEventChannelAdmin._ProxyPullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (ProxyPullConsumer) stub;
		}
	}
}
