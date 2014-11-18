package CosNotifyComm;


/**
 *	Generated from IDL interface "PushConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class PushConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyComm.PushConsumer s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyComm.PushConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyComm/PushConsumer:1.0", "PushConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/PushConsumer:1.0";
	}
	public static PushConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyComm.PushConsumer s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyComm.PushConsumer narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyComm.PushConsumer)
		{
			return (CosNotifyComm.PushConsumer)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyComm.PushConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyComm.PushConsumer)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyComm/PushConsumer:1.0"))
			{
				CosNotifyComm._PushConsumerStub stub;
				stub = new CosNotifyComm._PushConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyComm.PushConsumer)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyComm.PushConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyComm.PushConsumer)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyComm._PushConsumerStub stub;
				stub = new CosNotifyComm._PushConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyComm.PushConsumer)stub;
		}
	}
}
