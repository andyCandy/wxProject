
package org.tmforum.mtop.rpm.wsdl.pmr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:37:25.375+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getPerformanceMonitoringDataIteratorException", targetNamespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1")
public class GetPerformanceMonitoringDataIteratorException extends Exception {
    
    private org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorExceptionType getPerformanceMonitoringDataIteratorException;

    public GetPerformanceMonitoringDataIteratorException() {
        super();
    }
    
    public GetPerformanceMonitoringDataIteratorException(String message) {
        super(message);
    }
    
    public GetPerformanceMonitoringDataIteratorException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetPerformanceMonitoringDataIteratorException(String message, org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorExceptionType getPerformanceMonitoringDataIteratorException) {
        super(message);
        this.getPerformanceMonitoringDataIteratorException = getPerformanceMonitoringDataIteratorException;
    }

    public GetPerformanceMonitoringDataIteratorException(String message, org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorExceptionType getPerformanceMonitoringDataIteratorException, Throwable cause) {
        super(message, cause);
        this.getPerformanceMonitoringDataIteratorException = getPerformanceMonitoringDataIteratorException;
    }

    public org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorExceptionType getFaultInfo() {
        return this.getPerformanceMonitoringDataIteratorException;
    }
}
