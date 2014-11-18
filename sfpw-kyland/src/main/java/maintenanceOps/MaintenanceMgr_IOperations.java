package maintenanceOps;

/**
 *	Generated from IDL interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface MaintenanceMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void performMaintenanceOperation(maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws globaldefs.ProcessingFailureException;
	void getActiveMaintenanceOperations(globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOpeationList, maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws globaldefs.ProcessingFailureException;
	void enablePRBSTest(maintenanceOps.PRBSTestParameter_T[] testParaList, globaldefs.NamingAttributesList_THolder failedTPList) throws globaldefs.ProcessingFailureException;
	void disablePRBSTest(globaldefs.NameAndStringValue_T[][] tpNameList, globaldefs.NamingAttributesList_THolder failedTPList) throws globaldefs.ProcessingFailureException;
	void getPRBSTestResult(globaldefs.NameAndStringValue_T[][] tpNameList, maintenanceOps.PRBSTestResultList_THolder resultList) throws globaldefs.ProcessingFailureException;
}
