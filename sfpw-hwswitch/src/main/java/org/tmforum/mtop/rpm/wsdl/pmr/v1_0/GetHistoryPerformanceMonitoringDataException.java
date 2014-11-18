
package org.tmforum.mtop.rpm.wsdl.pmr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:37:25.484+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getHistoryPerformanceMonitoringDataException", targetNamespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1")
public class GetHistoryPerformanceMonitoringDataException extends Exception {
    
    private org.tmforum.mtop.rpm.xsd.pmr.v1.GetHistoryPerformanceMonitoringDataException getHistoryPerformanceMonitoringDataException;

    public GetHistoryPerformanceMonitoringDataException() {
        super();
    }
    
    public GetHistoryPerformanceMonitoringDataException(String message) {
        super(message);
    }
    
    public GetHistoryPerformanceMonitoringDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetHistoryPerformanceMonitoringDataException(String message, org.tmforum.mtop.rpm.xsd.pmr.v1.GetHistoryPerformanceMonitoringDataException getHistoryPerformanceMonitoringDataException) {
        super(message);
        this.getHistoryPerformanceMonitoringDataException = getHistoryPerformanceMonitoringDataException;
    }

    public GetHistoryPerformanceMonitoringDataException(String message, org.tmforum.mtop.rpm.xsd.pmr.v1.GetHistoryPerformanceMonitoringDataException getHistoryPerformanceMonitoringDataException, Throwable cause) {
        super(message, cause);
        this.getHistoryPerformanceMonitoringDataException = getHistoryPerformanceMonitoringDataException;
    }

    public org.tmforum.mtop.rpm.xsd.pmr.v1.GetHistoryPerformanceMonitoringDataException getFaultInfo() {
        return this.getHistoryPerformanceMonitoringDataException;
    }
}