package emsSessionFactory;

/**
 *	Generated from IDL interface "EmsSessionFactory_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface EmsSessionFactory_IOperations
	extends mtnmVersion.Version_IOperations
{
	/* constants */
	/* operations  */
	void getEmsSession(java.lang.String user, java.lang.String password, nmsSession.NmsSession_I client, emsSession.EmsSession_IHolder emsSessionInterface) throws globaldefs.ProcessingFailureException;
}
