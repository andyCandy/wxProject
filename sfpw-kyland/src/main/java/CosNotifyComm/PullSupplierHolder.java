package CosNotifyComm;

/**
 *	Generated from IDL interface "PullSupplier"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class PullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public PullSupplier value;
	public PullSupplierHolder()
	{
	}
	public PullSupplierHolder (final PullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PullSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PullSupplierHelper.write (_out,value);
	}
}
