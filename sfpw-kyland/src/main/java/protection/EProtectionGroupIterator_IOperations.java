package protection;

/**
 *	Generated from IDL interface "EProtectionGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface EProtectionGroupIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, protection.EProtectionGroupList_THolder ePGPList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
