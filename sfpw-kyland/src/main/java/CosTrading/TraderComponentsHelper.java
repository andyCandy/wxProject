package CosTrading;


/**
 *	Generated from IDL interface "TraderComponents"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class TraderComponentsHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosTrading.TraderComponents s)
	{
			any.insert_Object(s);
	}
	public static CosTrading.TraderComponents extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTrading/TraderComponents:1.0", "TraderComponents");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTrading/TraderComponents:1.0";
	}
	public static TraderComponents read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosTrading.TraderComponents s)
	{
		_out.write_Object(s);
	}
	public static CosTrading.TraderComponents narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosTrading.TraderComponents)
		{
			return (CosTrading.TraderComponents)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosTrading.TraderComponents narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosTrading.TraderComponents)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosTrading/TraderComponents:1.0"))
			{
				CosTrading._TraderComponentsStub stub;
				stub = new CosTrading._TraderComponentsStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosTrading.TraderComponents)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosTrading.TraderComponents unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosTrading.TraderComponents)obj;
		}
		catch (ClassCastException c)
		{
				CosTrading._TraderComponentsStub stub;
				stub = new CosTrading._TraderComponentsStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosTrading.TraderComponents)stub;
		}
	}
}
