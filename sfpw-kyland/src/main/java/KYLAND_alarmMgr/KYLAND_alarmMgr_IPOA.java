package KYLAND_alarmMgr;

/**
 *	Generated from IDL interface "KYLAND_alarmMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public abstract class KYLAND_alarmMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, KYLAND_alarmMgr.KYLAND_alarmMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(0));
		m_opsHash.put ( "setOwner", new java.lang.Integer(1));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(2));
		m_opsHash.put ( "getAllHisAlarms", new java.lang.Integer(3));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(4));
		m_opsHash.put ( "getMEHisAlarms", new java.lang.Integer(5));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/KYLAND_alarmMgr/KYLAND_alarmMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public KYLAND_alarmMgr.KYLAND_alarmMgr_I _this()
	{
		return KYLAND_alarmMgr.KYLAND_alarmMgr_IHelper.narrow(_this_object());
	}
	public KYLAND_alarmMgr.KYLAND_alarmMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return KYLAND_alarmMgr.KYLAND_alarmMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // setNativeEMSName
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
			case 2: // setUserLabel
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
			case 3: // getAllHisAlarms
			{
			try
			{
				java.lang.String[] _arg0=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg1=notifications.PerceivedSeverityList_THelper.read(_input);
				int[] _arg2=KYLAND_alarmMgr.AlarmTypeList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				java.lang.String _arg4=_input.read_string();
				java.lang.String _arg5=_input.read_string();
				notifications.EventList_THolder _arg6= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg7= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllHisAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				notifications.EventList_THelper.write(_out,_arg6.value);
				notifications.EventIterator_IHelper.write(_out,_arg7.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getCapabilities
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
			case 5: // getMEHisAlarms
			{
			try
			{
				java.lang.String[] _arg0=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg1=notifications.PerceivedSeverityList_THelper.read(_input);
				int[] _arg2=KYLAND_alarmMgr.AlarmTypeList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg3=globaldefs.NVSList_THelper.read(_input);
				int _arg4=_input.read_ulong();
				java.lang.String _arg5=_input.read_string();
				java.lang.String _arg6=_input.read_string();
				notifications.EventList_THolder _arg7= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg8= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getMEHisAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				notifications.EventList_THelper.write(_out,_arg7.value);
				notifications.EventIterator_IHelper.write(_out,_arg8.value);
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
