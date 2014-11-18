package CosTrading;


/**
 *	Generated from IDL interface "Proxy"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class ProxyHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosTrading.Proxy s)
	{
			any.insert_Object(s);
	}
	public static CosTrading.Proxy extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTrading/Proxy:1.0", "Proxy");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTrading/Proxy:1.0";
	}
	public static Proxy read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosTrading.Proxy s)
	{
		_out.write_Object(s);
	}
	public static CosTrading.Proxy narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosTrading.Proxy)
		{
			return (CosTrading.Proxy)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosTrading.Proxy narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosTrading.Proxy)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosTrading/Proxy:1.0"))
			{
				CosTrading._ProxyStub stub;
				stub = new CosTrading._ProxyStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosTrading.Proxy)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosTrading.Proxy unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosTrading.Proxy)obj;
		}
		catch (ClassCastException c)
		{
				CosTrading._ProxyStub stub;
				stub = new CosTrading._ProxyStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosTrading.Proxy)stub;
		}
	}
}
