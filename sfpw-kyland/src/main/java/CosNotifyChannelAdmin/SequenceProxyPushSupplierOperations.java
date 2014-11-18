package CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "SequenceProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface SequenceProxyPushSupplierOperations
	extends org.omg.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.CosNotifyComm.SequencePushSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_sequence_push_consumer(org.omg.CosNotifyComm.SequencePushConsumer push_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError;
	void suspend_connection() throws org.omg.CosNotifyChannelAdmin.NotConnected,org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactive;
	void resume_connection() throws org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActive,org.omg.CosNotifyChannelAdmin.NotConnected;
}
