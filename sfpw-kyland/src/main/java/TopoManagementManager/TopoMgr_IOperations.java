package TopoManagementManager;

/**
 *	Generated from IDL interface "TopoMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface TopoMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getTopoSubnetworkViewInfo(int how_many, TopoManagementManager.NodeList_THolder nodeList, TopoManagementManager.NodeIterator_IHolder NodeIt) throws globaldefs.ProcessingFailureException;
	void getProtectSubnetworkViewInfo(int how_many, TopoManagementManager.NodeList_THolder nodeList, TopoManagementManager.NodeIterator_IHolder NodeIt) throws globaldefs.ProcessingFailureException;
}
