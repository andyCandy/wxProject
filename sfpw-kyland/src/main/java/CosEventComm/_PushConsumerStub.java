package CosEventComm;


/**
 *	Generated from IDL interface "PushConsumer"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class _PushConsumerStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosEventComm.PushConsumer
{
	private String[] ids = {"IDL:omg.org/CosEventComm/PushConsumer:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = CosEventComm.PushConsumerOperations.class;
	public void disconnect_push_consumer()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "disconnect_push_consumer", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "disconnect_push_consumer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PushConsumerOperations _localServant = (PushConsumerOperations)_so.servant;
			try
			{
			_localServant.disconnect_push_consumer();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void push(org.omg.CORBA.Any data) throws org.omg.CosEventComm.Disconnected
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "push", true);
				_os.write_any(data);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosEventComm/Disconnected:1.0"))
				{
					throw org.omg.CosEventComm.DisconnectedHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "push", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PushConsumerOperations _localServant = (PushConsumerOperations)_so.servant;
			try
			{
			_localServant.push(data);
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
