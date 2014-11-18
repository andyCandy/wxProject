package CosNotifyChannelAdmin;


/**
 *	Generated from IDL interface "SequenceProxyPullSupplier"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class SequenceProxyPullSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyChannelAdmin.SequenceProxyPullSupplier s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyChannelAdmin.SequenceProxyPullSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyChannelAdmin/SequenceProxyPullSupplier:1.0", "SequenceProxyPullSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/SequenceProxyPullSupplier:1.0";
	}
	public static SequenceProxyPullSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyChannelAdmin.SequenceProxyPullSupplier s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyChannelAdmin.SequenceProxyPullSupplier narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyChannelAdmin.SequenceProxyPullSupplier)
		{
			return (CosNotifyChannelAdmin.SequenceProxyPullSupplier)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyChannelAdmin.SequenceProxyPullSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyChannelAdmin.SequenceProxyPullSupplier)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyChannelAdmin/SequenceProxyPullSupplier:1.0"))
			{
				CosNotifyChannelAdmin._SequenceProxyPullSupplierStub stub;
				stub = new CosNotifyChannelAdmin._SequenceProxyPullSupplierStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyChannelAdmin.SequenceProxyPullSupplier)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyChannelAdmin.SequenceProxyPullSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyChannelAdmin.SequenceProxyPullSupplier)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyChannelAdmin._SequenceProxyPullSupplierStub stub;
				stub = new CosNotifyChannelAdmin._SequenceProxyPullSupplierStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyChannelAdmin.SequenceProxyPullSupplier)stub;
		}
	}
}
