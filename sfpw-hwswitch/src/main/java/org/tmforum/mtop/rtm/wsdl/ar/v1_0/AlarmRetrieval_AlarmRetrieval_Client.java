
package org.tmforum.mtop.rtm.wsdl.ar.v1_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:52:42.671+08:00
 * Generated source version: 3.0.1
 * 
 */
public final class AlarmRetrieval_AlarmRetrieval_Client {

    private static final QName SERVICE_NAME = new QName("http://www.tmforum.org/mtop/rtm/wsdl/ar/v1-0", "AlarmRetrievalHttp");

    private AlarmRetrieval_AlarmRetrieval_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AlarmRetrievalHttp.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        AlarmRetrievalHttp ss = new AlarmRetrievalHttp(wsdlURL, SERVICE_NAME);
        AlarmRetrieval port = ss.getAlarmRetrieval();  
        
        {
        System.out.println("Invoking getActiveAlarms...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getActiveAlarms_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getActiveAlarms_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getActiveAlarms_mtopHeaderVal);
        org.tmforum.mtop.rtm.xsd.ar.v1.GetActiveAlarmsRequest _getActiveAlarms_mtopBody = null;
        try {
            org.tmforum.mtop.nra.xsd.alm.v1.AlarmListType _getActiveAlarms__return = port.getActiveAlarms(_getActiveAlarms_mtopHeader, _getActiveAlarms_mtopBody);
            System.out.println("getActiveAlarms.result=" + _getActiveAlarms__return);

            System.out.println("getActiveAlarms._getActiveAlarms_mtopHeader=" + _getActiveAlarms_mtopHeader.value);
        } catch (GetActiveAlarmsException e) { 
            System.out.println("Expected exception: GetActiveAlarmsException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getAlarmAffectedServiceNames...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getAlarmAffectedServiceNames_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getAlarmAffectedServiceNames_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getAlarmAffectedServiceNames_mtopHeaderVal);
        org.tmforum.mtop.rtm.xsd.ar.v1.GetAlarmAffectedServiceNamesRequest _getAlarmAffectedServiceNames_mtopBody = null;
        try {
            org.tmforum.mtop.rtm.xsd.ar.v1.GetAlarmAffectedServiceNamesResponse _getAlarmAffectedServiceNames__return = port.getAlarmAffectedServiceNames(_getAlarmAffectedServiceNames_mtopHeader, _getAlarmAffectedServiceNames_mtopBody);
            System.out.println("getAlarmAffectedServiceNames.result=" + _getAlarmAffectedServiceNames__return);

            System.out.println("getAlarmAffectedServiceNames._getAlarmAffectedServiceNames_mtopHeader=" + _getAlarmAffectedServiceNames_mtopHeader.value);
        } catch (GetAlarmAffectedServiceNamesException e) { 
            System.out.println("Expected exception: GetAlarmAffectedServiceNamesException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getActiveAlarmsCount...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getActiveAlarmsCount_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getActiveAlarmsCount_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getActiveAlarmsCount_mtopHeaderVal);
        org.tmforum.mtop.rtm.xsd.ar.v1.GetActiveAlarmsCountRequest _getActiveAlarmsCount_mtopBody = null;
        try {
            org.tmforum.mtop.rtm.xsd.ar.v1.GetActiveAlarmsCountResponse _getActiveAlarmsCount__return = port.getActiveAlarmsCount(_getActiveAlarmsCount_mtopHeader, _getActiveAlarmsCount_mtopBody);
            System.out.println("getActiveAlarmsCount.result=" + _getActiveAlarmsCount__return);

            System.out.println("getActiveAlarmsCount._getActiveAlarmsCount_mtopHeader=" + _getActiveAlarmsCount_mtopHeader.value);
        } catch (GetActiveAlarmsCountException e) { 
            System.out.println("Expected exception: GetActiveAlarmsCountException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getThresholdCrossingAlerts...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getThresholdCrossingAlerts_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getThresholdCrossingAlerts_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getThresholdCrossingAlerts_mtopHeaderVal);
        org.tmforum.mtop.rtm.xsd.ar.v1.GetThresholdCrossingAlertsRequest _getThresholdCrossingAlerts_mtopBody = null;
        try {
            org.tmforum.mtop.nra.xsd.tca.v1.ThresholdCrossingAlertListType _getThresholdCrossingAlerts__return = port.getThresholdCrossingAlerts(_getThresholdCrossingAlerts_mtopHeader, _getThresholdCrossingAlerts_mtopBody);
            System.out.println("getThresholdCrossingAlerts.result=" + _getThresholdCrossingAlerts__return);

            System.out.println("getThresholdCrossingAlerts._getThresholdCrossingAlerts_mtopHeader=" + _getThresholdCrossingAlerts_mtopHeader.value);
        } catch (GetThresholdCrossingAlertsException e) { 
            System.out.println("Expected exception: GetThresholdCrossingAlertsException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getSecondlyAlarms...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getSecondlyAlarms_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getSecondlyAlarms_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getSecondlyAlarms_mtopHeaderVal);
        org.tmforum.mtop.rtm.xsd.ar.v1.GetSecondlyAlarmsRequest _getSecondlyAlarms_mtopBody = null;
        try {
            org.tmforum.mtop.nra.xsd.alm.v1.AlarmListType _getSecondlyAlarms__return = port.getSecondlyAlarms(_getSecondlyAlarms_mtopHeader, _getSecondlyAlarms_mtopBody);
            System.out.println("getSecondlyAlarms.result=" + _getSecondlyAlarms__return);

            System.out.println("getSecondlyAlarms._getSecondlyAlarms_mtopHeader=" + _getSecondlyAlarms_mtopHeader.value);
        } catch (GetSecondlyAlarmsException e) { 
            System.out.println("Expected exception: GetSecondlyAlarmsException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
