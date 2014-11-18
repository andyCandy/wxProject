package managedElementManager;

/**
 *	Generated from IDL interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public abstract class ManagedElementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, managedElementManager.ManagedElementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getContainedCurrentTPs", new java.lang.Integer(0));
		m_opsHash.put ( "setOwner", new java.lang.Integer(1));
		m_opsHash.put ( "checkActiveAlarms", new java.lang.Integer(2));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(3));
		m_opsHash.put ( "getContainingTPNames", new java.lang.Integer(4));
		m_opsHash.put ( "getContainedInUseTPNames", new java.lang.Integer(5));
		m_opsHash.put ( "getAllManagedElementNames", new java.lang.Integer(6));
		m_opsHash.put ( "getAllPTPs", new java.lang.Integer(7));
		m_opsHash.put ( "deleteCrossConnections", new java.lang.Integer(8));
		m_opsHash.put ( "getContainedPotentialTPs", new java.lang.Integer(9));
		m_opsHash.put ( "getContainedInUseTPs", new java.lang.Integer(10));
		m_opsHash.put ( "getAllAlarmsByFTP", new java.lang.Integer(11));
		m_opsHash.put ( "setTPData", new java.lang.Integer(12));
		m_opsHash.put ( "createCrossConnections", new java.lang.Integer(13));
		m_opsHash.put ( "getAllCrossConnections", new java.lang.Integer(14));
		m_opsHash.put ( "getAllManagedElements", new java.lang.Integer(15));
		m_opsHash.put ( "getTP", new java.lang.Integer(16));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(17));
		m_opsHash.put ( "getContainingSubnetworkNames", new java.lang.Integer(18));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(19));
		m_opsHash.put ( "getContainedPotentialTPNames", new java.lang.Integer(20));
		m_opsHash.put ( "getAllActiveAlarms", new java.lang.Integer(21));
		m_opsHash.put ( "deactivateCrossConnections", new java.lang.Integer(22));
		m_opsHash.put ( "getNEStaticInfo", new java.lang.Integer(23));
		m_opsHash.put ( "getContainedCurrentTPNames", new java.lang.Integer(24));
		m_opsHash.put ( "getManagedElement", new java.lang.Integer(25));
		m_opsHash.put ( "activateCrossConnections", new java.lang.Integer(26));
		m_opsHash.put ( "getActiveAlarms", new java.lang.Integer(27));
		m_opsHash.put ( "getContainingTPs", new java.lang.Integer(28));
		m_opsHash.put ( "getAllPTPNames", new java.lang.Integer(29));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public managedElementManager.ManagedElementMgr_I _this()
	{
		return managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object());
	}
	public managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getContainedCurrentTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg4= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // setOwner
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
			case 2: // checkActiveAlarms
			{
			try
			{
				org.omg.CosNotification.StructuredEvent[] _arg0=notifications.EventList_THelper.read(_input);
				notifications.EventList_THolder _arg1= new notifications.EventList_THolder();
				_out = handler.createReply();
				checkActiveAlarms(_arg0,_arg1);
				notifications.EventList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setUserLabel
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
			case 4: // getContainingTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingTPNames(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getContainedInUseTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getAllManagedElementNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg2= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0,_arg1,_arg2);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllPTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg4= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg5= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllPTPs(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg4.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // deleteCrossConnections
			{
			try
			{
				subnetworkConnection.CrossConnect_T[] _arg0=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg1= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deleteCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getContainedPotentialTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg4= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getContainedInUseTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg4= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAllAlarmsByFTP
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				globaldefs.NameAndStringValue_T[][] _arg3=globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg4=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg5=notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg6=_input.read_string();
				java.lang.String _arg7=_input.read_string();
				globaldefs.NamingAttributesList_THolder _arg8= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllAlarmsByFTP(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg8.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // setTPData
			{
			try
			{
				subnetworkConnection.TPData_T _arg0=subnetworkConnection.TPData_THelper.read(_input);
				terminationPoint.TerminationPoint_THolder _arg1= new terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				setTPData(_arg0,_arg1);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // createCrossConnections
			{
			try
			{
				subnetworkConnection.CrossConnect_T[] _arg0=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg1= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				createCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getAllCrossConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				subnetworkConnection.CrossConnectList_THolder _arg3= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CCIterator_IHolder _arg4= new subnetworkConnection.CCIterator_IHolder();
				_out = handler.createReply();
				getAllCrossConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg3.value);
				subnetworkConnection.CCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getAllManagedElements
			{
			try
			{
				int _arg0=_input.read_ulong();
				managedElement.ManagedElementList_THolder _arg1= new managedElement.ManagedElementList_THolder();
				managedElement.ManagedElementIterator_IHolder _arg2= new managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0,_arg1,_arg2);
				managedElement.ManagedElementList_THelper.write(_out,_arg1.value);
				managedElement.ManagedElementIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				terminationPoint.TerminationPoint_THolder _arg1= new terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				getTP(_arg0,_arg1);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getCapabilities
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
			case 18: // getContainingSubnetworkNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingSubnetworkNames(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // setNativeEMSName
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
			case 20: // getContainedPotentialTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAllActiveAlarms
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg2=notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				notifications.EventList_THolder _arg4= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg5= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				notifications.EventList_THelper.write(_out,_arg4.value);
				notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // deactivateCrossConnections
			{
			try
			{
				subnetworkConnection.CrossConnect_T[] _arg0=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg1= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deactivateCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getNEStaticInfo
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getNEStaticInfo(_arg0,_arg1,_arg2,_arg3);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getContainedCurrentTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getManagedElement
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				managedElement.ManagedElement_THolder _arg1= new managedElement.ManagedElement_THolder();
				_out = handler.createReply();
				getManagedElement(_arg0,_arg1);
				managedElement.ManagedElement_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // activateCrossConnections
			{
			try
			{
				subnetworkConnection.CrossConnect_T[] _arg0=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg1= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				activateCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getActiveAlarms
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg1=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg2=notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				notifications.EventList_THolder _arg4= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg5= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				notifications.EventList_THelper.write(_out,_arg4.value);
				notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getContainingTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				terminationPoint.TerminationPointList_THolder _arg1= new terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getContainingTPs(_arg0,_arg1);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // getAllPTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg4= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg5= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPTPNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg5.value);
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
