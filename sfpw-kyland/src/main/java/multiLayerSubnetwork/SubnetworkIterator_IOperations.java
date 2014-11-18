package multiLayerSubnetwork;

/**
 *	Generated from IDL interface "SubnetworkIterator_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface SubnetworkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, multiLayerSubnetwork.SubnetworkList_THolder subnetworkList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
