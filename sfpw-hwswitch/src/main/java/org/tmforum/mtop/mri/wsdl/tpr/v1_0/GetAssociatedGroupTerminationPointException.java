
package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:30.406+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getAssociatedGroupTerminationPointException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tpr/v1")
public class GetAssociatedGroupTerminationPointException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tpr.v1.GetAssociatedGroupTerminationPointException getAssociatedGroupTerminationPointException;

    public GetAssociatedGroupTerminationPointException() {
        super();
    }
    
    public GetAssociatedGroupTerminationPointException(String message) {
        super(message);
    }
    
    public GetAssociatedGroupTerminationPointException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetAssociatedGroupTerminationPointException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetAssociatedGroupTerminationPointException getAssociatedGroupTerminationPointException) {
        super(message);
        this.getAssociatedGroupTerminationPointException = getAssociatedGroupTerminationPointException;
    }

    public GetAssociatedGroupTerminationPointException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetAssociatedGroupTerminationPointException getAssociatedGroupTerminationPointException, Throwable cause) {
        super(message, cause);
        this.getAssociatedGroupTerminationPointException = getAssociatedGroupTerminationPointException;
    }

    public org.tmforum.mtop.mri.xsd.tpr.v1.GetAssociatedGroupTerminationPointException getFaultInfo() {
        return this.getAssociatedGroupTerminationPointException;
    }
}
