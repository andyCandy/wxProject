
package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:30.312+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getMemberTerminationPointsException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tpr/v1")
public class GetMemberTerminationPointsException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tpr.v1.GetMemberTerminationPointsException getMemberTerminationPointsException;

    public GetMemberTerminationPointsException() {
        super();
    }
    
    public GetMemberTerminationPointsException(String message) {
        super(message);
    }
    
    public GetMemberTerminationPointsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetMemberTerminationPointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetMemberTerminationPointsException getMemberTerminationPointsException) {
        super(message);
        this.getMemberTerminationPointsException = getMemberTerminationPointsException;
    }

    public GetMemberTerminationPointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetMemberTerminationPointsException getMemberTerminationPointsException, Throwable cause) {
        super(message, cause);
        this.getMemberTerminationPointsException = getMemberTerminationPointsException;
    }

    public org.tmforum.mtop.mri.xsd.tpr.v1.GetMemberTerminationPointsException getFaultInfo() {
        return this.getMemberTerminationPointsException;
    }
}
