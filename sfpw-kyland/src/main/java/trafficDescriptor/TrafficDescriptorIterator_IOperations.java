package trafficDescriptor;

/**
 *	Generated from IDL interface "TrafficDescriptorIterator_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface TrafficDescriptorIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, trafficDescriptor.TrafficDescriptorList_THolder trafficDescList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
