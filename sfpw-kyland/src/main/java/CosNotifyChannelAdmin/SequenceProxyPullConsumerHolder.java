package CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "SequenceProxyPullConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class SequenceProxyPullConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceProxyPullConsumer value;
	public SequenceProxyPullConsumerHolder()
	{
	}
	public SequenceProxyPullConsumerHolder (final SequenceProxyPullConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequenceProxyPullConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceProxyPullConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceProxyPullConsumerHelper.write (_out,value);
	}
}
