package CosEventChannelAdmin;


/**
 *	Generated from IDL interface "ProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class ProxyPushSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosEventChannelAdmin.ProxyPushSupplier s)
	{
			any.insert_Object(s);
	}
	public static CosEventChannelAdmin.ProxyPushSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosEventChannelAdmin/ProxyPushSupplier:1.0", "ProxyPushSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventChannelAdmin/ProxyPushSupplier:1.0";
	}
	public static ProxyPushSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosEventChannelAdmin.ProxyPushSupplier s)
	{
		_out.write_Object(s);
	}
	public static CosEventChannelAdmin.ProxyPushSupplier narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosEventChannelAdmin.ProxyPushSupplier)
		{
			return (CosEventChannelAdmin.ProxyPushSupplier)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosEventChannelAdmin.ProxyPushSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosEventChannelAdmin.ProxyPushSupplier)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosEventChannelAdmin/ProxyPushSupplier:1.0"))
			{
				CosEventChannelAdmin._ProxyPushSupplierStub stub;
				stub = new CosEventChannelAdmin._ProxyPushSupplierStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosEventChannelAdmin.ProxyPushSupplier)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosEventChannelAdmin.ProxyPushSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosEventChannelAdmin.ProxyPushSupplier)obj;
		}
		catch (ClassCastException c)
		{
				CosEventChannelAdmin._ProxyPushSupplierStub stub;
				stub = new CosEventChannelAdmin._ProxyPushSupplierStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosEventChannelAdmin.ProxyPushSupplier)stub;
		}
	}
}
