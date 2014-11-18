
package org.tmforum.mtop.rtm.wsdl.ar.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:52:42.953+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getActiveAlarmsException", targetNamespace = "http://www.tmforum.org/mtop/rtm/xsd/ar/v1")
public class GetActiveAlarmsException extends Exception {
    
    private org.tmforum.mtop.rtm.xsd.ar.v1.GetActiveAlarmsException getActiveAlarmsException;

    public GetActiveAlarmsException() {
        super();
    }
    
    public GetActiveAlarmsException(String message) {
        super(message);
    }
    
    public GetActiveAlarmsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetActiveAlarmsException(String message, org.tmforum.mtop.rtm.xsd.ar.v1.GetActiveAlarmsException getActiveAlarmsException) {
        super(message);
        this.getActiveAlarmsException = getActiveAlarmsException;
    }

    public GetActiveAlarmsException(String message, org.tmforum.mtop.rtm.xsd.ar.v1.GetActiveAlarmsException getActiveAlarmsException, Throwable cause) {
        super(message, cause);
        this.getActiveAlarmsException = getActiveAlarmsException;
    }

    public org.tmforum.mtop.rtm.xsd.ar.v1.GetActiveAlarmsException getFaultInfo() {
        return this.getActiveAlarmsException;
    }
}