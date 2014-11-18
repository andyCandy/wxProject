package flowDomain;

/**
 *	Generated from IDL interface "FDIterator_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface FDIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, flowDomain.FDList_THolder fdList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
