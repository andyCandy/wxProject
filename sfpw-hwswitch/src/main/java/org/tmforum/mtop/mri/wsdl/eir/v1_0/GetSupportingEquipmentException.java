
package org.tmforum.mtop.mri.wsdl.eir.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:52:24.796+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getSupportingEquipmentException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1")
public class GetSupportingEquipmentException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.eir.v1.GetSupportingEquipmentException getSupportingEquipmentException;

    public GetSupportingEquipmentException() {
        super();
    }
    
    public GetSupportingEquipmentException(String message) {
        super(message);
    }
    
    public GetSupportingEquipmentException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetSupportingEquipmentException(String message, org.tmforum.mtop.mri.xsd.eir.v1.GetSupportingEquipmentException getSupportingEquipmentException) {
        super(message);
        this.getSupportingEquipmentException = getSupportingEquipmentException;
    }

    public GetSupportingEquipmentException(String message, org.tmforum.mtop.mri.xsd.eir.v1.GetSupportingEquipmentException getSupportingEquipmentException, Throwable cause) {
        super(message, cause);
        this.getSupportingEquipmentException = getSupportingEquipmentException;
    }

    public org.tmforum.mtop.mri.xsd.eir.v1.GetSupportingEquipmentException getFaultInfo() {
        return this.getSupportingEquipmentException;
    }
}
