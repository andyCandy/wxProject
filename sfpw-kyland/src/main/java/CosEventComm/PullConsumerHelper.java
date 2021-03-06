package CosEventComm;


/**
 *	Generated from IDL interface "PullConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class PullConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosEventComm.PullConsumer s)
	{
			any.insert_Object(s);
	}
	public static CosEventComm.PullConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosEventComm/PullConsumer:1.0", "PullConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventComm/PullConsumer:1.0";
	}
	public static PullConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosEventComm.PullConsumer s)
	{
		_out.write_Object(s);
	}
	public static CosEventComm.PullConsumer narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosEventComm.PullConsumer)
		{
			return (CosEventComm.PullConsumer)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosEventComm.PullConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosEventComm.PullConsumer)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosEventComm/PullConsumer:1.0"))
			{
				CosEventComm._PullConsumerStub stub;
				stub = new CosEventComm._PullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosEventComm.PullConsumer)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosEventComm.PullConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosEventComm.PullConsumer)obj;
		}
		catch (ClassCastException c)
		{
				CosEventComm._PullConsumerStub stub;
				stub = new CosEventComm._PullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosEventComm.PullConsumer)stub;
		}
	}
}
