package CosNotifyComm;


/**
 *	Generated from IDL interface "PullSupplier"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class PullSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotifyComm.PullSupplier s)
	{
			any.insert_Object(s);
	}
	public static CosNotifyComm.PullSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyComm/PullSupplier:1.0", "PullSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/PullSupplier:1.0";
	}
	public static PullSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotifyComm.PullSupplier s)
	{
		_out.write_Object(s);
	}
	public static CosNotifyComm.PullSupplier narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotifyComm.PullSupplier)
		{
			return (CosNotifyComm.PullSupplier)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotifyComm.PullSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyComm.PullSupplier)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyComm/PullSupplier:1.0"))
			{
				CosNotifyComm._PullSupplierStub stub;
				stub = new CosNotifyComm._PullSupplierStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyComm.PullSupplier)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotifyComm.PullSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotifyComm.PullSupplier)obj;
		}
		catch (ClassCastException c)
		{
				CosNotifyComm._PullSupplierStub stub;
				stub = new CosNotifyComm._PullSupplierStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotifyComm.PullSupplier)stub;
		}
	}
}
