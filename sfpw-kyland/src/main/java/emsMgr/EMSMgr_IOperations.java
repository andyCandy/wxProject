package emsMgr;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface EMSMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getEMS(emsMgr.EMS_THolder emsInfo) throws globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworks(int how_many, multiLayerSubnetwork.SubnetworkList_THolder sList, multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworkNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinks(int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinkNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getTopLevelTopologicalLink(globaldefs.NameAndStringValue_T[] topoLinkName, topologicalLink.TopologicalLink_THolder topoLink) throws globaldefs.ProcessingFailureException;
	void getAllEMSAndMEActiveAlarms(java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void getAllEMSSystemActiveAlarms(notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void getObjectRootAlarms(globaldefs.NameAndStringValue_T[] objectName, java.lang.String startTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
}
