
package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:30.937+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getAllEdgePointsException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tpr/v1")
public class GetAllEdgePointsException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tpr.v1.GetAllEdgePointsException getAllEdgePointsException;

    public GetAllEdgePointsException() {
        super();
    }
    
    public GetAllEdgePointsException(String message) {
        super(message);
    }
    
    public GetAllEdgePointsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetAllEdgePointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetAllEdgePointsException getAllEdgePointsException) {
        super(message);
        this.getAllEdgePointsException = getAllEdgePointsException;
    }

    public GetAllEdgePointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetAllEdgePointsException getAllEdgePointsException, Throwable cause) {
        super(message, cause);
        this.getAllEdgePointsException = getAllEdgePointsException;
    }

    public org.tmforum.mtop.mri.xsd.tpr.v1.GetAllEdgePointsException getFaultInfo() {
        return this.getAllEdgePointsException;
    }
}
