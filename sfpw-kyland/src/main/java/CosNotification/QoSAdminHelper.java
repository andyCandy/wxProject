package CosNotification;


/**
 *	Generated from IDL interface "QoSAdmin"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class QoSAdminHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CosNotification.QoSAdmin s)
	{
			any.insert_Object(s);
	}
	public static CosNotification.QoSAdmin extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotification/QoSAdmin:1.0", "QoSAdmin");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotification/QoSAdmin:1.0";
	}
	public static QoSAdmin read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosNotification.QoSAdmin s)
	{
		_out.write_Object(s);
	}
	public static CosNotification.QoSAdmin narrow(final java.lang.Object obj)
	{
		if (obj instanceof CosNotification.QoSAdmin)
		{
			return (CosNotification.QoSAdmin)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static CosNotification.QoSAdmin narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotification.QoSAdmin)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotification/QoSAdmin:1.0"))
			{
				CosNotification._QoSAdminStub stub;
				stub = new CosNotification._QoSAdminStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotification.QoSAdmin)stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static CosNotification.QoSAdmin unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (CosNotification.QoSAdmin)obj;
		}
		catch (ClassCastException c)
		{
				CosNotification._QoSAdminStub stub;
				stub = new CosNotification._QoSAdminStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return (CosNotification.QoSAdmin)stub;
		}
	}
}
