package CosNotifyComm;


/**
 *	Generated from IDL interface "StructuredPullSupplier"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class StructuredPullSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyComm.StructuredPullSupplier s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyComm.StructuredPullSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyComm/StructuredPullSupplier:1.0", "StructuredPullSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/StructuredPullSupplier:1.0";
	}
	public static StructuredPullSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyComm.StructuredPullSupplier s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyComm.StructuredPullSupplier narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyComm.StructuredPullSupplier)
		{
			return (CosNotifyComm.StructuredPullSupplier)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyComm.StructuredPullSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyComm.StructuredPullSupplier)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyComm/StructuredPullSupplier:1.0"))
			{
				CosNotifyComm._StructuredPullSupplierStub stub;
				stub = new CosNotifyComm._StructuredPullSupplierStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyComm.StructuredPullSupplier)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyComm.StructuredPullSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyComm.StructuredPullSupplier)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyComm._StructuredPullSupplierStub stub;
				stub = new CosNotifyComm._StructuredPullSupplierStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyComm.StructuredPullSupplier)stub;
		}
	}
}
