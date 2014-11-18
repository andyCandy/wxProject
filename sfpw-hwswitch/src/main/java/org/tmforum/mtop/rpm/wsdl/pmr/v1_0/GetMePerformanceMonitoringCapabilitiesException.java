
package org.tmforum.mtop.rpm.wsdl.pmr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:37:25.484+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getMePerformanceMonitoringCapabilitiesException", targetNamespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1")
public class GetMePerformanceMonitoringCapabilitiesException extends Exception {
    
    private org.tmforum.mtop.rpm.xsd.pmr.v1.GetMePerformanceMonitoringCapabilitiesException getMePerformanceMonitoringCapabilitiesException;

    public GetMePerformanceMonitoringCapabilitiesException() {
        super();
    }
    
    public GetMePerformanceMonitoringCapabilitiesException(String message) {
        super(message);
    }
    
    public GetMePerformanceMonitoringCapabilitiesException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetMePerformanceMonitoringCapabilitiesException(String message, org.tmforum.mtop.rpm.xsd.pmr.v1.GetMePerformanceMonitoringCapabilitiesException getMePerformanceMonitoringCapabilitiesException) {
        super(message);
        this.getMePerformanceMonitoringCapabilitiesException = getMePerformanceMonitoringCapabilitiesException;
    }

    public GetMePerformanceMonitoringCapabilitiesException(String message, org.tmforum.mtop.rpm.xsd.pmr.v1.GetMePerformanceMonitoringCapabilitiesException getMePerformanceMonitoringCapabilitiesException, Throwable cause) {
        super(message, cause);
        this.getMePerformanceMonitoringCapabilitiesException = getMePerformanceMonitoringCapabilitiesException;
    }

    public org.tmforum.mtop.rpm.xsd.pmr.v1.GetMePerformanceMonitoringCapabilitiesException getFaultInfo() {
        return this.getMePerformanceMonitoringCapabilitiesException;
    }
}
