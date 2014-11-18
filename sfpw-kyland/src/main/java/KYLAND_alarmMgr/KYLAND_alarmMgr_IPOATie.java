package KYLAND_alarmMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "KYLAND_alarmMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class KYLAND_alarmMgr_IPOATie
	extends KYLAND_alarmMgr_IPOA
{
	private KYLAND_alarmMgr_IOperations _delegate;

	private POA _poa;
	public KYLAND_alarmMgr_IPOATie(KYLAND_alarmMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public KYLAND_alarmMgr_IPOATie(KYLAND_alarmMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public KYLAND_alarmMgr.KYLAND_alarmMgr_I _this()
	{
		return KYLAND_alarmMgr.KYLAND_alarmMgr_IHelper.narrow(_this_object());
	}
	public KYLAND_alarmMgr.KYLAND_alarmMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return KYLAND_alarmMgr.KYLAND_alarmMgr_IHelper.narrow(_this_object(orb));
	}
	public KYLAND_alarmMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(KYLAND_alarmMgr_IOperations delegate)
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
	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllHisAlarms(java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int[] excludeTypeList, int how_many, java.lang.String startTime, java.lang.String endTime, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllHisAlarms(excludeProbCauseList,excludeSeverityList,excludeTypeList,how_many,startTime,endTime,eventList,eventIt);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getMEHisAlarms(java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int[] excludeTypeList, globaldefs.NameAndStringValue_T[] managedElementName, int how_many, java.lang.String startTime, java.lang.String endTime, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getMEHisAlarms(excludeProbCauseList,excludeSeverityList,excludeTypeList,managedElementName,how_many,startTime,endTime,eventList,eventIt);
	}

}
