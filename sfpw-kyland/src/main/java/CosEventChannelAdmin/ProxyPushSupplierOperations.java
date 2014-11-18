package CosEventChannelAdmin;

/**
 *	Generated from IDL interface "ProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface ProxyPushSupplierOperations
	extends org.omg.CosEventComm.PushSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_push_consumer(org.omg.CosEventComm.PushConsumer push_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError;
}
