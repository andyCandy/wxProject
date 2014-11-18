package performance;

/**
 *	Generated from IDL interface "PMDataIterator_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface PMDataIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, performance.PMDataList_THolder pmDataList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
