package subnetworkConnection;

/**
 *	Generated from IDL interface "SNCIterator_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface SNCIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
