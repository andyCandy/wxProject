package CosNotifyComm;

/**
 *	Generated from IDL interface "NotifyPublish"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface NotifyPublishOperations
{
	/* constants */
	/* operations  */
	void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType;
}
