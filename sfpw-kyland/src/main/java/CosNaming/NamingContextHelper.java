package CosNaming;


/**
 *	Generated from IDL interface "NamingContext"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class NamingContextHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNaming.NamingContext s)
	{
			any.insert_Object(s);
	}
	public static CosNaming.NamingContext extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNaming/NamingContext:1.0", "NamingContext");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNaming/NamingContext:1.0";
	}
	public static NamingContext read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNaming.NamingContext s)
	{
		_out.write_Object(s);
	}
	public static CosNaming.NamingContext narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNaming.NamingContext)
		{
			return (CosNaming.NamingContext)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNaming.NamingContext narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNaming.NamingContext)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNaming/NamingContext:1.0"))
			{
				CosNaming._NamingContextStub stub;
				stub = new CosNaming._NamingContextStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNaming.NamingContext)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNaming.NamingContext unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNaming.NamingContext)obj;
		}
		catch (ClassCastException c)
		{
				CosNaming._NamingContextStub stub;
				stub = new CosNaming._NamingContextStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNaming.NamingContext)stub;
		}
	}
}
