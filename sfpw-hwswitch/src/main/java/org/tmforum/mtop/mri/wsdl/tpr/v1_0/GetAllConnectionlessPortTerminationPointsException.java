
package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:30.578+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getAllConnectionlessPortTerminationPointsException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tpr/v1")
public class GetAllConnectionlessPortTerminationPointsException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tpr.v1.GetAllConnectionlessPortTerminationPointsException getAllConnectionlessPortTerminationPointsException;

    public GetAllConnectionlessPortTerminationPointsException() {
        super();
    }
    
    public GetAllConnectionlessPortTerminationPointsException(String message) {
        super(message);
    }
    
    public GetAllConnectionlessPortTerminationPointsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetAllConnectionlessPortTerminationPointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetAllConnectionlessPortTerminationPointsException getAllConnectionlessPortTerminationPointsException) {
        super(message);
        this.getAllConnectionlessPortTerminationPointsException = getAllConnectionlessPortTerminationPointsException;
    }

    public GetAllConnectionlessPortTerminationPointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetAllConnectionlessPortTerminationPointsException getAllConnectionlessPortTerminationPointsException, Throwable cause) {
        super(message, cause);
        this.getAllConnectionlessPortTerminationPointsException = getAllConnectionlessPortTerminationPointsException;
    }

    public org.tmforum.mtop.mri.xsd.tpr.v1.GetAllConnectionlessPortTerminationPointsException getFaultInfo() {
        return this.getAllConnectionlessPortTerminationPointsException;
    }
}
