package CosTrading;


/**
 *	Generated from IDL interface "ImportAttributes"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class ImportAttributesHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosTrading.ImportAttributes s)
	{
			any.insert_Object(s);
	}
	public static CosTrading.ImportAttributes extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTrading/ImportAttributes:1.0", "ImportAttributes");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTrading/ImportAttributes:1.0";
	}
	public static ImportAttributes read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosTrading.ImportAttributes s)
	{
		_out.write_Object(s);
	}
	public static CosTrading.ImportAttributes narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosTrading.ImportAttributes)
		{
			return (CosTrading.ImportAttributes)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosTrading.ImportAttributes narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosTrading.ImportAttributes)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosTrading/ImportAttributes:1.0"))
			{
				CosTrading._ImportAttributesStub stub;
				stub = new CosTrading._ImportAttributesStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosTrading.ImportAttributes)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosTrading.ImportAttributes unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosTrading.ImportAttributes)obj;
		}
		catch (ClassCastException c)
		{
				CosTrading._ImportAttributesStub stub;
				stub = new CosTrading._ImportAttributesStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosTrading.ImportAttributes)stub;
		}
	}
}
