package KYLAND_pmMgr;

/**
 *	Generated from IDL interface "KYLAND_pmMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class KYLAND_pmMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public KYLAND_pmMgr_I value;
	public KYLAND_pmMgr_IHolder()
	{
	}
	public KYLAND_pmMgr_IHolder (final KYLAND_pmMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KYLAND_pmMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KYLAND_pmMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KYLAND_pmMgr_IHelper.write (_out,value);
	}
}
