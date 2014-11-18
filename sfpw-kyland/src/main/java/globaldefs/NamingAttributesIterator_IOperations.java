package globaldefs;

/**
 *	Generated from IDL interface "NamingAttributesIterator_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface NamingAttributesIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
