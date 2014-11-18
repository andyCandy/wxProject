package CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "SequenceProxyPullSupplier"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface SequenceProxyPullSupplierOperations
	extends org.omg.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.CosNotifyComm.SequencePullSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_sequence_pull_consumer(org.omg.CosNotifyComm.SequencePullConsumer pull_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
