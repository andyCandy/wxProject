package protection;

/**
 *	Generated from IDL interface "ProtectionSubnetworkIterator_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface ProtectionSubnetworkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, protection.ProtectionSubnetworkList_THolder PGPList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
