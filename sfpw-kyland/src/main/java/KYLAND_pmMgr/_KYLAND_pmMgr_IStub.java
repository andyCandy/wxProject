package KYLAND_pmMgr;


/**
 *	Generated from IDL interface "KYLAND_pmMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class _KYLAND_pmMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements KYLAND_pmMgr.KYLAND_pmMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/KYLAND_pmMgr/KYLAND_pmMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = KYLAND_pmMgr.KYLAND_pmMgr_IOperations.class;
	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setNativeEMSName", true);
				globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(nativeEMSName);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setNativeEMSName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			KYLAND_pmMgr_IOperations _localServant = (KYLAND_pmMgr_IOperations)_so.servant;
			try
			{
			_localServant.setNativeEMSName(objectName,nativeEMSName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setOwner", true);
				globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(owner);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setOwner", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			KYLAND_pmMgr_IOperations _localServant = (KYLAND_pmMgr_IOperations)_so.servant;
			try
			{
			_localServant.setOwner(objectName,owner);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setUserLabel", true);
				globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(userLabel);
				_os.write_boolean(enforceUniqueness);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			KYLAND_pmMgr_IOperations _localServant = (KYLAND_pmMgr_IOperations)_so.servant;
			try
			{
			_localServant.setUserLabel(objectName,userLabel,enforceUniqueness);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCurrentPMData(performance.PMTPSelect_T[] pmTPSelectList, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCurrentPMData", true);
				performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				pmDataList.value = performance.PMDataList_THelper.read(_is);
				pmIt.value = performance.PMDataIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCurrentPMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			KYLAND_pmMgr_IOperations _localServant = (KYLAND_pmMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCurrentPMData(pmTPSelectList,how_many,pmDataList,pmIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCapabilities", true);
				_is = _invoke(_os);
				capabilities.value = common.CapabilityList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCapabilities", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			KYLAND_pmMgr_IOperations _localServant = (KYLAND_pmMgr_IOperations)_so.servant;
			try
			{
			_localServant.getCapabilities(capabilities);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

}
