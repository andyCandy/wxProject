
package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:30.828+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getTerminationPointException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tpr/v1")
public class GetTerminationPointException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tpr.v1.GetTerminationPointException getTerminationPointException;

    public GetTerminationPointException() {
        super();
    }
    
    public GetTerminationPointException(String message) {
        super(message);
    }
    
    public GetTerminationPointException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetTerminationPointException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetTerminationPointException getTerminationPointException) {
        super(message);
        this.getTerminationPointException = getTerminationPointException;
    }

    public GetTerminationPointException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetTerminationPointException getTerminationPointException, Throwable cause) {
        super(message, cause);
        this.getTerminationPointException = getTerminationPointException;
    }

    public org.tmforum.mtop.mri.xsd.tpr.v1.GetTerminationPointException getFaultInfo() {
        return this.getTerminationPointException;
    }
}
