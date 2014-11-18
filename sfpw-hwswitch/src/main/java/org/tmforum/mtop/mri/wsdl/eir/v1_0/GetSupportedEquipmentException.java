
package org.tmforum.mtop.mri.wsdl.eir.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:52:24.812+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getSupportedEquipmentException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1")
public class GetSupportedEquipmentException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.eir.v1.GetSupportedEquipmentException getSupportedEquipmentException;

    public GetSupportedEquipmentException() {
        super();
    }
    
    public GetSupportedEquipmentException(String message) {
        super(message);
    }
    
    public GetSupportedEquipmentException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetSupportedEquipmentException(String message, org.tmforum.mtop.mri.xsd.eir.v1.GetSupportedEquipmentException getSupportedEquipmentException) {
        super(message);
        this.getSupportedEquipmentException = getSupportedEquipmentException;
    }

    public GetSupportedEquipmentException(String message, org.tmforum.mtop.mri.xsd.eir.v1.GetSupportedEquipmentException getSupportedEquipmentException, Throwable cause) {
        super(message, cause);
        this.getSupportedEquipmentException = getSupportedEquipmentException;
    }

    public org.tmforum.mtop.mri.xsd.eir.v1.GetSupportedEquipmentException getFaultInfo() {
        return this.getSupportedEquipmentException;
    }
}