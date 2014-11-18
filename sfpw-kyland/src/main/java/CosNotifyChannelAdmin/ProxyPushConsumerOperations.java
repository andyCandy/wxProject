package CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "ProxyPushConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface ProxyPushConsumerOperations
	extends org.omg.CosNotifyChannelAdmin.ProxyConsumerOperations , org.omg.CosNotifyComm.PushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_any_push_supplier(org.omg.CosEventComm.PushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
