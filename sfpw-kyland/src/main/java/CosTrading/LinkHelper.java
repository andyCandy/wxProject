package CosTrading;


/**
 *	Generated from IDL interface "Link"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class LinkHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosTrading.Link s)
	{
			any.insert_Object(s);
	}
	public static CosTrading.Link extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTrading/Link:1.0", "Link");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTrading/Link:1.0";
	}
	public static Link read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosTrading.Link s)
	{
		_out.write_Object(s);
	}
	public static CosTrading.Link narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosTrading.Link)
		{
			return (CosTrading.Link)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosTrading.Link narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosTrading.Link)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosTrading/Link:1.0"))
			{
				CosTrading._LinkStub stub;
				stub = new CosTrading._LinkStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosTrading.Link)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosTrading.Link unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosTrading.Link)obj;
		}
		catch (ClassCastException c)
		{
				CosTrading._LinkStub stub;
				stub = new CosTrading._LinkStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosTrading.Link)stub;
		}
	}
}
