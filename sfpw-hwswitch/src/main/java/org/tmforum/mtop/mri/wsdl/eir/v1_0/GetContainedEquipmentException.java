
package org.tmforum.mtop.mri.wsdl.eir.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:52:24.703+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getContainedEquipmentException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1")
public class GetContainedEquipmentException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.eir.v1.GetContainedEquipmentException getContainedEquipmentException;

    public GetContainedEquipmentException() {
        super();
    }
    
    public GetContainedEquipmentException(String message) {
        super(message);
    }
    
    public GetContainedEquipmentException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetContainedEquipmentException(String message, org.tmforum.mtop.mri.xsd.eir.v1.GetContainedEquipmentException getContainedEquipmentException) {
        super(message);
        this.getContainedEquipmentException = getContainedEquipmentException;
    }

    public GetContainedEquipmentException(String message, org.tmforum.mtop.mri.xsd.eir.v1.GetContainedEquipmentException getContainedEquipmentException, Throwable cause) {
        super(message, cause);
        this.getContainedEquipmentException = getContainedEquipmentException;
    }

    public org.tmforum.mtop.mri.xsd.eir.v1.GetContainedEquipmentException getFaultInfo() {
        return this.getContainedEquipmentException;
    }
}