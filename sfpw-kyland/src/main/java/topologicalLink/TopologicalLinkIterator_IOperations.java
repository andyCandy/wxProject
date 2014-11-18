package topologicalLink;

/**
 *	Generated from IDL interface "TopologicalLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface TopologicalLinkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, topologicalLink.TopologicalLinkList_THolder topoLinkList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
