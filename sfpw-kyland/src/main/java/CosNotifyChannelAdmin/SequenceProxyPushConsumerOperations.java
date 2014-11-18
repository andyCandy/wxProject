package CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "SequenceProxyPushConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface SequenceProxyPushConsumerOperations
	extends org.omg.CosNotifyChannelAdmin.ProxyConsumerOperations , org.omg.CosNotifyComm.SequencePushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_sequence_push_supplier(org.omg.CosNotifyComm.SequencePushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
