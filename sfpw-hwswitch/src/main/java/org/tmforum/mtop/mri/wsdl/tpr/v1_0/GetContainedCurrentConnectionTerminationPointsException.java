
package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:30.671+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getContainedCurrentConnectionTerminationPointsException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tpr/v1")
public class GetContainedCurrentConnectionTerminationPointsException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tpr.v1.GetContainedCurrentConnectionTerminationPointsException getContainedCurrentConnectionTerminationPointsException;

    public GetContainedCurrentConnectionTerminationPointsException() {
        super();
    }
    
    public GetContainedCurrentConnectionTerminationPointsException(String message) {
        super(message);
    }
    
    public GetContainedCurrentConnectionTerminationPointsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetContainedCurrentConnectionTerminationPointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetContainedCurrentConnectionTerminationPointsException getContainedCurrentConnectionTerminationPointsException) {
        super(message);
        this.getContainedCurrentConnectionTerminationPointsException = getContainedCurrentConnectionTerminationPointsException;
    }

    public GetContainedCurrentConnectionTerminationPointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetContainedCurrentConnectionTerminationPointsException getContainedCurrentConnectionTerminationPointsException, Throwable cause) {
        super(message, cause);
        this.getContainedCurrentConnectionTerminationPointsException = getContainedCurrentConnectionTerminationPointsException;
    }

    public org.tmforum.mtop.mri.xsd.tpr.v1.GetContainedCurrentConnectionTerminationPointsException getFaultInfo() {
        return this.getContainedCurrentConnectionTerminationPointsException;
    }
}