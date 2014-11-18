package CosEventComm;

/**
 *	Generated from IDL interface "PushConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface PushConsumerOperations
{
	/* constants */
	/* operations  */
	void push(org.omg.CORBA.Any data) throws org.omg.CosEventComm.Disconnected;
	void disconnect_push_consumer();
}
