package CosEventChannelAdmin;

/**
 *	Generated from IDL interface "ProxyPushConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface ProxyPushConsumerOperations
	extends org.omg.CosEventComm.PushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_push_supplier(org.omg.CosEventComm.PushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
