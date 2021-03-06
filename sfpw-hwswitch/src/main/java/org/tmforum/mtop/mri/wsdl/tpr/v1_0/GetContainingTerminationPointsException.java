
package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:30.484+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getContainingTerminationPointsException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tpr/v1")
public class GetContainingTerminationPointsException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tpr.v1.GetContainingTerminationPointsException getContainingTerminationPointsException;

    public GetContainingTerminationPointsException() {
        super();
    }
    
    public GetContainingTerminationPointsException(String message) {
        super(message);
    }
    
    public GetContainingTerminationPointsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetContainingTerminationPointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetContainingTerminationPointsException getContainingTerminationPointsException) {
        super(message);
        this.getContainingTerminationPointsException = getContainingTerminationPointsException;
    }

    public GetContainingTerminationPointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetContainingTerminationPointsException getContainingTerminationPointsException, Throwable cause) {
        super(message, cause);
        this.getContainingTerminationPointsException = getContainingTerminationPointsException;
    }

    public org.tmforum.mtop.mri.xsd.tpr.v1.GetContainingTerminationPointsException getFaultInfo() {
        return this.getContainingTerminationPointsException;
    }
}
