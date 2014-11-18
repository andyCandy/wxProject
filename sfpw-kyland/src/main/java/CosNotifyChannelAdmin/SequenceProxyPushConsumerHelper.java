package CosNotifyChannelAdmin;


/**
 *	Generated from IDL interface "SequenceProxyPushConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class SequenceProxyPushConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyChannelAdmin.SequenceProxyPushConsumer s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyChannelAdmin.SequenceProxyPushConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyChannelAdmin/SequenceProxyPushConsumer:1.0", "SequenceProxyPushConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/SequenceProxyPushConsumer:1.0";
	}
	public static SequenceProxyPushConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyChannelAdmin.SequenceProxyPushConsumer s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyChannelAdmin.SequenceProxyPushConsumer narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyChannelAdmin.SequenceProxyPushConsumer)
		{
			return (CosNotifyChannelAdmin.SequenceProxyPushConsumer)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyChannelAdmin.SequenceProxyPushConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyChannelAdmin.SequenceProxyPushConsumer)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyChannelAdmin/SequenceProxyPushConsumer:1.0"))
			{
				CosNotifyChannelAdmin._SequenceProxyPushConsumerStub stub;
				stub = new CosNotifyChannelAdmin._SequenceProxyPushConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyChannelAdmin.SequenceProxyPushConsumer)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyChannelAdmin.SequenceProxyPushConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyChannelAdmin.SequenceProxyPushConsumer)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyChannelAdmin._SequenceProxyPushConsumerStub stub;
				stub = new CosNotifyChannelAdmin._SequenceProxyPushConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyChannelAdmin.SequenceProxyPushConsumer)stub;
		}
	}
}
