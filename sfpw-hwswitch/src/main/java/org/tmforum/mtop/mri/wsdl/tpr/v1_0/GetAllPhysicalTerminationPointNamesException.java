
package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:30.828+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getAllPhysicalTerminationPointNamesException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tpr/v1")
public class GetAllPhysicalTerminationPointNamesException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tpr.v1.GetAllPhysicalTerminationPointNamesException getAllPhysicalTerminationPointNamesException;

    public GetAllPhysicalTerminationPointNamesException() {
        super();
    }
    
    public GetAllPhysicalTerminationPointNamesException(String message) {
        super(message);
    }
    
    public GetAllPhysicalTerminationPointNamesException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetAllPhysicalTerminationPointNamesException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetAllPhysicalTerminationPointNamesException getAllPhysicalTerminationPointNamesException) {
        super(message);
        this.getAllPhysicalTerminationPointNamesException = getAllPhysicalTerminationPointNamesException;
    }

    public GetAllPhysicalTerminationPointNamesException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetAllPhysicalTerminationPointNamesException getAllPhysicalTerminationPointNamesException, Throwable cause) {
        super(message, cause);
        this.getAllPhysicalTerminationPointNamesException = getAllPhysicalTerminationPointNamesException;
    }

    public org.tmforum.mtop.mri.xsd.tpr.v1.GetAllPhysicalTerminationPointNamesException getFaultInfo() {
        return this.getAllPhysicalTerminationPointNamesException;
    }
}