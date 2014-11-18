package CosNotifyComm;

/**
 *	Generated from IDL interface "StructuredPushConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface StructuredPushConsumerOperations
	extends org.omg.CosNotifyComm.NotifyPublishOperations
{
	/* constants */
	/* operations  */
	void push_structured_event(org.omg.CosNotification.StructuredEvent notification) throws org.omg.CosEventComm.Disconnected;
	void disconnect_structured_push_consumer();
}
