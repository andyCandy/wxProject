
package org.tmforum.mtop.mri.wsdl.tlr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:51:55.812+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getAllTopologicalLinksOfFdException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tlr/v1")
public class GetAllTopologicalLinksOfFdException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tlr.v1.GetAllTopologicalLinksOfFdException getAllTopologicalLinksOfFdException;

    public GetAllTopologicalLinksOfFdException() {
        super();
    }
    
    public GetAllTopologicalLinksOfFdException(String message) {
        super(message);
    }
    
    public GetAllTopologicalLinksOfFdException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetAllTopologicalLinksOfFdException(String message, org.tmforum.mtop.mri.xsd.tlr.v1.GetAllTopologicalLinksOfFdException getAllTopologicalLinksOfFdException) {
        super(message);
        this.getAllTopologicalLinksOfFdException = getAllTopologicalLinksOfFdException;
    }

    public GetAllTopologicalLinksOfFdException(String message, org.tmforum.mtop.mri.xsd.tlr.v1.GetAllTopologicalLinksOfFdException getAllTopologicalLinksOfFdException, Throwable cause) {
        super(message, cause);
        this.getAllTopologicalLinksOfFdException = getAllTopologicalLinksOfFdException;
    }

    public org.tmforum.mtop.mri.xsd.tlr.v1.GetAllTopologicalLinksOfFdException getFaultInfo() {
        return this.getAllTopologicalLinksOfFdException;
    }
}
