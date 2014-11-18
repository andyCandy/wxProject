package flowDomain;

/**
 *	Generated from IDL interface "MFDIterator_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface MFDIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, flowDomain.MFDList_THolder mfdList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
