package maintenanceOps;

/**
 *	Generated from IDL interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public abstract class MaintenanceMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, maintenanceOps.MaintenanceMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "performMaintenanceOperation", new java.lang.Integer(0));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(1));
		m_opsHash.put ( "enablePRBSTest", new java.lang.Integer(2));
		m_opsHash.put ( "getPRBSTestResult", new java.lang.Integer(3));
		m_opsHash.put ( "getActiveMaintenanceOperations", new java.lang.Integer(4));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(5));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(6));
		m_opsHash.put ( "disablePRBSTest", new java.lang.Integer(7));
		m_opsHash.put ( "setOwner", new java.lang.Integer(8));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/maintenanceOps/MaintenanceMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public maintenanceOps.MaintenanceMgr_I _this()
	{
		return maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object());
	}
	public maintenanceOps.MaintenanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // performMaintenanceOperation
			{
			try
			{
				maintenanceOps.CurrentMaintenanceOperation_T _arg0=maintenanceOps.CurrentMaintenanceOperation_THelper.read(_input);
				maintenanceOps.MaintenanceOperationMode_T _arg1=maintenanceOps.MaintenanceOperationMode_THelper.read(_input);
				_out = handler.createReply();
				performMaintenanceOperation(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getCapabilities
			{
			try
			{
				common.CapabilityList_THolder _arg0= new common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // enablePRBSTest
			{
			try
			{
				maintenanceOps.PRBSTestParameter_T[] _arg0=maintenanceOps.PRBSTestParameterList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				enablePRBSTest(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getPRBSTestResult
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				maintenanceOps.PRBSTestResultList_THolder _arg1= new maintenanceOps.PRBSTestResultList_THolder();
				_out = handler.createReply();
				getPRBSTestResult(_arg0,_arg1);
				maintenanceOps.PRBSTestResultList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getActiveMaintenanceOperations
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				maintenanceOps.CurrentMaintenanceOperationList_THolder _arg2= new maintenanceOps.CurrentMaintenanceOperationList_THolder();
				maintenanceOps.CurrentMaintenanceOperationIterator_IHolder _arg3= new maintenanceOps.CurrentMaintenanceOperationIterator_IHolder();
				_out = handler.createReply();
				getActiveMaintenanceOperations(_arg0,_arg1,_arg2,_arg3);
				maintenanceOps.CurrentMaintenanceOperationList_THelper.write(_out,_arg2.value);
				maintenanceOps.CurrentMaintenanceOperationIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setUserLabel
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // setNativeEMSName
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // disablePRBSTest
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				disablePRBSTest(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setOwner
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setOwner(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
