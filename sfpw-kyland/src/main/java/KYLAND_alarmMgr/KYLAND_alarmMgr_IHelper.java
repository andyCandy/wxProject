package KYLAND_alarmMgr;


/**
 *	Generated from IDL interface "KYLAND_alarmMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class KYLAND_alarmMgr_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final KYLAND_alarmMgr.KYLAND_alarmMgr_I s)
	{
			any.insert_Object(s);
	}
	public static KYLAND_alarmMgr.KYLAND_alarmMgr_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/KYLAND_alarmMgr/KYLAND_alarmMgr_I:1.0", "KYLAND_alarmMgr_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/KYLAND_alarmMgr/KYLAND_alarmMgr_I:1.0";
	}
	public static KYLAND_alarmMgr_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final KYLAND_alarmMgr.KYLAND_alarmMgr_I s)
	{
		_out.write_Object(s);
	}
	public static KYLAND_alarmMgr.KYLAND_alarmMgr_I narrow(final java.lang.Object obj)
	{
		if (obj instanceof KYLAND_alarmMgr.KYLAND_alarmMgr_I)
		{
			return (KYLAND_alarmMgr.KYLAND_alarmMgr_I)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static KYLAND_alarmMgr.KYLAND_alarmMgr_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (KYLAND_alarmMgr.KYLAND_alarmMgr_I)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:mtnm.tmforum.org/KYLAND_alarmMgr/KYLAND_alarmMgr_I:1.0"))
			{
				KYLAND_alarmMgr._KYLAND_alarmMgr_IStub stub;
				stub = new KYLAND_alarmMgr._KYLAND_alarmMgr_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static KYLAND_alarmMgr.KYLAND_alarmMgr_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (KYLAND_alarmMgr.KYLAND_alarmMgr_I)obj;
		}
		catch (ClassCastException c)
		{
				KYLAND_alarmMgr._KYLAND_alarmMgr_IStub stub;
				stub = new KYLAND_alarmMgr._KYLAND_alarmMgr_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
