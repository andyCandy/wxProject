package CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "NotifyPublish"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class NotifyPublishPOATie
	extends NotifyPublishPOA
{
	private NotifyPublishOperations _delegate;

	private POA _poa;
	public NotifyPublishPOATie(NotifyPublishOperations delegate)
	{
		_delegate = delegate;
	}
	public NotifyPublishPOATie(NotifyPublishOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.NotifyPublish _this()
	{
		return org.omg.CosNotifyComm.NotifyPublishHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.NotifyPublish _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.NotifyPublishHelper.narrow(_this_object(orb));
	}
	public NotifyPublishOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NotifyPublishOperations delegate)
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
	public void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

}
