package CosNotifyComm;


/**
 *	Generated from IDL interface "SequencePullConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class SequencePullConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyComm.SequencePullConsumer s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyComm.SequencePullConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyComm/SequencePullConsumer:1.0", "SequencePullConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/SequencePullConsumer:1.0";
	}
	public static SequencePullConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyComm.SequencePullConsumer s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyComm.SequencePullConsumer narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyComm.SequencePullConsumer)
		{
			return (CosNotifyComm.SequencePullConsumer)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyComm.SequencePullConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyComm.SequencePullConsumer)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyComm/SequencePullConsumer:1.0"))
			{
				CosNotifyComm._SequencePullConsumerStub stub;
				stub = new CosNotifyComm._SequencePullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyComm.SequencePullConsumer)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyComm.SequencePullConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyComm.SequencePullConsumer)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyComm._SequencePullConsumerStub stub;
				stub = new CosNotifyComm._SequencePullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyComm.SequencePullConsumer)stub;
		}
	}
}
