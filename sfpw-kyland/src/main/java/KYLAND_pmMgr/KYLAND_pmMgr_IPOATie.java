package KYLAND_pmMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "KYLAND_pmMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class KYLAND_pmMgr_IPOATie
	extends KYLAND_pmMgr_IPOA
{
	private KYLAND_pmMgr_IOperations _delegate;

	private POA _poa;
	public KYLAND_pmMgr_IPOATie(KYLAND_pmMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public KYLAND_pmMgr_IPOATie(KYLAND_pmMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public KYLAND_pmMgr.KYLAND_pmMgr_I _this()
	{
		return KYLAND_pmMgr.KYLAND_pmMgr_IHelper.narrow(_this_object());
	}
	public KYLAND_pmMgr.KYLAND_pmMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return KYLAND_pmMgr.KYLAND_pmMgr_IHelper.narrow(_this_object(orb));
	}
	public KYLAND_pmMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(KYLAND_pmMgr_IOperations delegate)
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

	public void getAllCurrentPMData(performance.PMTPSelect_T[] pmTPSelectList, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCurrentPMData(pmTPSelectList,how_many,pmDataList,pmIt);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

}
