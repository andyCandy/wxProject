package CosNotifyComm;


/**
 *	Generated from IDL interface "PullConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class PullConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyComm.PullConsumer s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyComm.PullConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyComm/PullConsumer:1.0", "PullConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/PullConsumer:1.0";
	}
	public static PullConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyComm.PullConsumer s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyComm.PullConsumer narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyComm.PullConsumer)
		{
			return (CosNotifyComm.PullConsumer)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyComm.PullConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyComm.PullConsumer)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyComm/PullConsumer:1.0"))
			{
				CosNotifyComm._PullConsumerStub stub;
				stub = new CosNotifyComm._PullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyComm.PullConsumer)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyComm.PullConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyComm.PullConsumer)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyComm._PullConsumerStub stub;
				stub = new CosNotifyComm._PullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyComm.PullConsumer)stub;
		}
	}
}
