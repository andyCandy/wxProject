package KYLAND_alarmMgr;

/**
 *	Generated from IDL interface "KYLAND_alarmMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface KYLAND_alarmMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllHisAlarms(java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int[] excludeTypeList, int how_many, java.lang.String startTime, java.lang.String endTime, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void getMEHisAlarms(java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int[] excludeTypeList, globaldefs.NameAndStringValue_T[] managedElementName, int how_many, java.lang.String startTime, java.lang.String endTime, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
}
