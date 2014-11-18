package managedElement;

/**
 *	Generated from IDL interface "ManagedElementIterator_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface ManagedElementIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, managedElement.ManagedElementList_THolder meList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
