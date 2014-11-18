
package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:30.546+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getContainingGroupTerminationPointException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tpr/v1")
public class GetContainingGroupTerminationPointException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tpr.v1.GetContainingGroupTerminationPointException getContainingGroupTerminationPointException;

    public GetContainingGroupTerminationPointException() {
        super();
    }
    
    public GetContainingGroupTerminationPointException(String message) {
        super(message);
    }
    
    public GetContainingGroupTerminationPointException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetContainingGroupTerminationPointException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetContainingGroupTerminationPointException getContainingGroupTerminationPointException) {
        super(message);
        this.getContainingGroupTerminationPointException = getContainingGroupTerminationPointException;
    }

    public GetContainingGroupTerminationPointException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetContainingGroupTerminationPointException getContainingGroupTerminationPointException, Throwable cause) {
        super(message, cause);
        this.getContainingGroupTerminationPointException = getContainingGroupTerminationPointException;
    }

    public org.tmforum.mtop.mri.xsd.tpr.v1.GetContainingGroupTerminationPointException getFaultInfo() {
        return this.getContainingGroupTerminationPointException;
    }
}