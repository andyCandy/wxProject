package CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "SequencePushSupplier"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class SequencePushSupplierPOATie
	extends SequencePushSupplierPOA
{
	private SequencePushSupplierOperations _delegate;

	private POA _poa;
	public SequencePushSupplierPOATie(SequencePushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public SequencePushSupplierPOATie(SequencePushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.SequencePushSupplier _this()
	{
		return org.omg.CosNotifyComm.SequencePushSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.SequencePushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.SequencePushSupplierHelper.narrow(_this_object(orb));
	}
	public SequencePushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SequencePushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

	public void disconnect_sequence_push_supplier()
	{
_delegate.disconnect_sequence_push_supplier();
	}

}
