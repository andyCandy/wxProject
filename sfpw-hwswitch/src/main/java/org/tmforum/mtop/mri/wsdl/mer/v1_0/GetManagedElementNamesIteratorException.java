
package org.tmforum.mtop.mri.wsdl.mer.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:52:10.750+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getManagedElementNamesIteratorException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1")
public class GetManagedElementNamesIteratorException extends Exception {
    
    private org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorExceptionType getManagedElementNamesIteratorException;

    public GetManagedElementNamesIteratorException() {
        super();
    }
    
    public GetManagedElementNamesIteratorException(String message) {
        super(message);
    }
    
    public GetManagedElementNamesIteratorException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetManagedElementNamesIteratorException(String message, org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorExceptionType getManagedElementNamesIteratorException) {
        super(message);
        this.getManagedElementNamesIteratorException = getManagedElementNamesIteratorException;
    }

    public GetManagedElementNamesIteratorException(String message, org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorExceptionType getManagedElementNamesIteratorException, Throwable cause) {
        super(message, cause);
        this.getManagedElementNamesIteratorException = getManagedElementNamesIteratorException;
    }

    public org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorExceptionType getFaultInfo() {
        return this.getManagedElementNamesIteratorException;
    }
}
