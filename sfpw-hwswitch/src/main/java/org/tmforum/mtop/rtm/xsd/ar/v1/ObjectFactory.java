
package org.tmforum.mtop.rtm.xsd.ar.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorExceptionType;
import org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorRequestType;
import org.tmforum.mtop.nra.xsd.alm.v1.AlarmListType;
import org.tmforum.mtop.nra.xsd.tca.v1.ThresholdCrossingAlertListType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.rtm.xsd.ar.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetActiveAlarmsIteratorRequest_QNAME = new QName("http://www.tmforum.org/mtop/rtm/xsd/ar/v1", "getActiveAlarmsIteratorRequest");
    private final static QName _GetActiveAlarmsResponse_QNAME = new QName("http://www.tmforum.org/mtop/rtm/xsd/ar/v1", "getActiveAlarmsResponse");
    private final static QName _GetActiveAlarmsIteratorResponse_QNAME = new QName("http://www.tmforum.org/mtop/rtm/xsd/ar/v1", "getActiveAlarmsIteratorResponse");
    private final static QName _GetSecondlyAlarmsResponse_QNAME = new QName("http://www.tmforum.org/mtop/rtm/xsd/ar/v1", "getSecondlyAlarmsResponse");
    private final static QName _GetActiveAlarmsIteratorException_QNAME = new QName("http://www.tmforum.org/mtop/rtm/xsd/ar/v1", "getActiveAlarmsIteratorException");
    private final static QName _GetThresholdCrossingAlertsResponse_QNAME = new QName("http://www.tmforum.org/mtop/rtm/xsd/ar/v1", "getThresholdCrossingAlertsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.rtm.xsd.ar.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetActiveAlarmsCountRequest }
     * 
     */
    public GetActiveAlarmsCountRequest createGetActiveAlarmsCountRequest() {
        return new GetActiveAlarmsCountRequest();
    }

    /**
     * Create an instance of {@link ActiveAlarmFilterType }
     * 
     */
    public ActiveAlarmFilterType createActiveAlarmFilterType() {
        return new ActiveAlarmFilterType();
    }

    /**
     * Create an instance of {@link GetActiveAlarmsCountResponse }
     * 
     */
    public GetActiveAlarmsCountResponse createGetActiveAlarmsCountResponse() {
        return new GetActiveAlarmsCountResponse();
    }

    /**
     * Create an instance of {@link GetSecondlyAlarmsRequest }
     * 
     */
    public GetSecondlyAlarmsRequest createGetSecondlyAlarmsRequest() {
        return new GetSecondlyAlarmsRequest();
    }

    /**
     * Create an instance of {@link GetActiveAlarmsException }
     * 
     */
    public GetActiveAlarmsException createGetActiveAlarmsException() {
        return new GetActiveAlarmsException();
    }

    /**
     * Create an instance of {@link GetAlarmAffectedServiceNamesRequest }
     * 
     */
    public GetAlarmAffectedServiceNamesRequest createGetAlarmAffectedServiceNamesRequest() {
        return new GetAlarmAffectedServiceNamesRequest();
    }

    /**
     * Create an instance of {@link GetThresholdCrossingAlertsRequest }
     * 
     */
    public GetThresholdCrossingAlertsRequest createGetThresholdCrossingAlertsRequest() {
        return new GetThresholdCrossingAlertsRequest();
    }

    /**
     * Create an instance of {@link GetActiveAlarmsCountException }
     * 
     */
    public GetActiveAlarmsCountException createGetActiveAlarmsCountException() {
        return new GetActiveAlarmsCountException();
    }

    /**
     * Create an instance of {@link GetActiveAlarmsRequest }
     * 
     */
    public GetActiveAlarmsRequest createGetActiveAlarmsRequest() {
        return new GetActiveAlarmsRequest();
    }

    /**
     * Create an instance of {@link GetThresholdCrossingAlertsException }
     * 
     */
    public GetThresholdCrossingAlertsException createGetThresholdCrossingAlertsException() {
        return new GetThresholdCrossingAlertsException();
    }

    /**
     * Create an instance of {@link GetSecondlyAlarmsException }
     * 
     */
    public GetSecondlyAlarmsException createGetSecondlyAlarmsException() {
        return new GetSecondlyAlarmsException();
    }

    /**
     * Create an instance of {@link GetAlarmAffectedServiceNamesException }
     * 
     */
    public GetAlarmAffectedServiceNamesException createGetAlarmAffectedServiceNamesException() {
        return new GetAlarmAffectedServiceNamesException();
    }

    /**
     * Create an instance of {@link GetAlarmAffectedServiceNamesResponse }
     * 
     */
    public GetAlarmAffectedServiceNamesResponse createGetAlarmAffectedServiceNamesResponse() {
        return new GetAlarmAffectedServiceNamesResponse();
    }

    /**
     * Create an instance of {@link ServiceNameListType }
     * 
     */
    public ServiceNameListType createServiceNameListType() {
        return new ServiceNameListType();
    }

    /**
     * Create an instance of {@link ServiceNameType }
     * 
     */
    public ServiceNameType createServiceNameType() {
        return new ServiceNameType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rtm/xsd/ar/v1", name = "getActiveAlarmsIteratorRequest")
    public JAXBElement<GetAllDataIteratorRequestType> createGetActiveAlarmsIteratorRequest(GetAllDataIteratorRequestType value) {
        return new JAXBElement<GetAllDataIteratorRequestType>(_GetActiveAlarmsIteratorRequest_QNAME, GetAllDataIteratorRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlarmListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rtm/xsd/ar/v1", name = "getActiveAlarmsResponse")
    public JAXBElement<AlarmListType> createGetActiveAlarmsResponse(AlarmListType value) {
        return new JAXBElement<AlarmListType>(_GetActiveAlarmsResponse_QNAME, AlarmListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlarmListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rtm/xsd/ar/v1", name = "getActiveAlarmsIteratorResponse")
    public JAXBElement<AlarmListType> createGetActiveAlarmsIteratorResponse(AlarmListType value) {
        return new JAXBElement<AlarmListType>(_GetActiveAlarmsIteratorResponse_QNAME, AlarmListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlarmListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rtm/xsd/ar/v1", name = "getSecondlyAlarmsResponse")
    public JAXBElement<AlarmListType> createGetSecondlyAlarmsResponse(AlarmListType value) {
        return new JAXBElement<AlarmListType>(_GetSecondlyAlarmsResponse_QNAME, AlarmListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rtm/xsd/ar/v1", name = "getActiveAlarmsIteratorException")
    public JAXBElement<GetAllDataIteratorExceptionType> createGetActiveAlarmsIteratorException(GetAllDataIteratorExceptionType value) {
        return new JAXBElement<GetAllDataIteratorExceptionType>(_GetActiveAlarmsIteratorException_QNAME, GetAllDataIteratorExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdCrossingAlertListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rtm/xsd/ar/v1", name = "getThresholdCrossingAlertsResponse")
    public JAXBElement<ThresholdCrossingAlertListType> createGetThresholdCrossingAlertsResponse(ThresholdCrossingAlertListType value) {
        return new JAXBElement<ThresholdCrossingAlertListType>(_GetThresholdCrossingAlertsResponse_QNAME, ThresholdCrossingAlertListType.class, null, value);
    }

}
