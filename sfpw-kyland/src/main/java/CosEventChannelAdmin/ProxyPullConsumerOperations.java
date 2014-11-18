package CosEventChannelAdmin;

/**
 *	Generated from IDL interface "ProxyPullConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface ProxyPullConsumerOperations
	extends org.omg.CosEventComm.PullConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_pull_supplier(org.omg.CosEventComm.PullSupplier pull_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError;
}
