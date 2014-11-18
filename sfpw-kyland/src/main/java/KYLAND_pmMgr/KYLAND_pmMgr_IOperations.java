package KYLAND_pmMgr;

/**
 *	Generated from IDL interface "KYLAND_pmMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface KYLAND_pmMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllCurrentPMData(performance.PMTPSelect_T[] pmTPSelectList, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException;
}
