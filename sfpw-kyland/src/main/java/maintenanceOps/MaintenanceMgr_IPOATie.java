package maintenanceOps;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class MaintenanceMgr_IPOATie
	extends MaintenanceMgr_IPOA
{
	private MaintenanceMgr_IOperations _delegate;

	private POA _poa;
	public MaintenanceMgr_IPOATie(MaintenanceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MaintenanceMgr_IPOATie(MaintenanceMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public maintenanceOps.MaintenanceMgr_I _this()
	{
		return maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object());
	}
	public maintenanceOps.MaintenanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object(orb));
	}
	public MaintenanceMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MaintenanceMgr_IOperations delegate)
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
	public void performMaintenanceOperation(maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws globaldefs.ProcessingFailureException
	{
_delegate.performMaintenanceOperation(maintenanceOperation,maintenanceOperationMode);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void enablePRBSTest(maintenanceOps.PRBSTestParameter_T[] testParaList, globaldefs.NamingAttributesList_THolder failedTPList) throws globaldefs.ProcessingFailureException
	{
_delegate.enablePRBSTest(testParaList,failedTPList);
	}

	public void getPRBSTestResult(globaldefs.NameAndStringValue_T[][] tpNameList, maintenanceOps.PRBSTestResultList_THolder resultList) throws globaldefs.ProcessingFailureException
	{
_delegate.getPRBSTestResult(tpNameList,resultList);
	}

	public void getActiveMaintenanceOperations(globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOpeationList, maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getActiveMaintenanceOperations(tpOrMeName,how_many,currentMaintenanceOpeationList,cmoIt);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void disablePRBSTest(globaldefs.NameAndStringValue_T[][] tpNameList, globaldefs.NamingAttributesList_THolder failedTPList) throws globaldefs.ProcessingFailureException
	{
_delegate.disablePRBSTest(tpNameList,failedTPList);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
