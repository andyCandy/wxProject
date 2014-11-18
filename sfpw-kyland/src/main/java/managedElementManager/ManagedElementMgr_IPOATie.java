package managedElementManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class ManagedElementMgr_IPOATie
	extends ManagedElementMgr_IPOA
{
	private ManagedElementMgr_IOperations _delegate;

	private POA _poa;
	public ManagedElementMgr_IPOATie(ManagedElementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ManagedElementMgr_IPOATie(ManagedElementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public managedElementManager.ManagedElementMgr_I _this()
	{
		return managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object());
	}
	public managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object(orb));
	}
	public ManagedElementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ManagedElementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void getContainedCurrentTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedCurrentTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void checkActiveAlarms(org.omg.CosNotification.StructuredEvent[] activeEventList, notifications.EventList_THolder clearedEventList) throws globaldefs.ProcessingFailureException
	{
_delegate.checkActiveAlarms(activeEventList,clearedEventList);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getContainingTPNames(globaldefs.NameAndStringValue_T[] tpName, globaldefs.NamingAttributesList_THolder tpNameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainingTPNames(tpName,tpNameList);
	}

	public void getContainedInUseTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedInUseTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void getAllManagedElementNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementNames(how_many,nameList,nameIt);
	}

	public void getAllPTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void deleteCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedCCList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteCrossConnections(ccList,successedCCList,failedCCList);
	}

	public void getContainedPotentialTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedPotentialTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getContainedInUseTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedInUseTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getAllAlarmsByFTP(java.lang.String destination, java.lang.String userName, java.lang.String password, globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, globaldefs.NamingAttributesList_THolder failedMeNameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllAlarmsByFTP(destination,userName,password,meNameList,excludeProbCauseList,excludeSeverityList,startTime,endTime,failedMeNameList);
	}

	public void setTPData(subnetworkConnection.TPData_T tpInfo, terminationPoint.TerminationPoint_THolder modifiedTP) throws globaldefs.ProcessingFailureException
	{
_delegate.setTPData(tpInfo,modifiedTP);
	}

	public void createCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedCCList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException
	{
_delegate.createCrossConnections(ccList,successedCCList,failedCCList);
	}

	public void getAllCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, subnetworkConnection.CrossConnectList_THolder ccList, subnetworkConnection.CCIterator_IHolder ccIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCrossConnections(managedElementName,connectionRateList,how_many,ccList,ccIt);
	}

	public void getAllManagedElements(int how_many, managedElement.ManagedElementList_THolder meList, managedElement.ManagedElementIterator_IHolder meIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElements(how_many,meList,meIt);
	}

	public void getTP(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPoint_THolder tp) throws globaldefs.ProcessingFailureException
	{
_delegate.getTP(tpName,tp);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getContainingSubnetworkNames(globaldefs.NameAndStringValue_T[] managedElementName, globaldefs.NamingAttributesList_THolder subnetNames) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainingSubnetworkNames(managedElementName,subnetNames);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getContainedPotentialTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedPotentialTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void getAllActiveAlarms(globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllActiveAlarms(meName,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void deactivateCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedCCList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateCrossConnections(ccList,successedCCList,failedCCList);
	}

	public void getNEStaticInfo(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, globaldefs.NamingAttributesList_THolder staticInfoList, globaldefs.NamingAttributesIterator_IHolder staticInfoIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getNEStaticInfo(managedElementName,how_many,staticInfoList,staticInfoIt);
	}

	public void getContainedCurrentTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedCurrentTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void getManagedElement(globaldefs.NameAndStringValue_T[] managedElementName, managedElement.ManagedElement_THolder me) throws globaldefs.ProcessingFailureException
	{
_delegate.getManagedElement(managedElementName,me);
	}

	public void activateCrossConnections(subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder successedCCList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException
	{
_delegate.activateCrossConnections(ccList,successedCCList,failedCCList);
	}

	public void getActiveAlarms(globaldefs.NameAndStringValue_T[][] objectNameList, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getActiveAlarms(objectNameList,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getContainingTPs(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainingTPs(tpName,tpList);
	}

	public void getAllPTPNames(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPNames(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

}
