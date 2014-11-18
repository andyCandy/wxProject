
package org.tmforum.mtop.rpm.xsd.pmr.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorExceptionType;
import org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorRequestType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.rpm.xsd.pmr.v1 package. 
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

    private final static QName _GetPerformanceMonitoringDataIteratorRequest_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getPerformanceMonitoringDataIteratorRequest");
    private final static QName _GetPerformanceMonitoringDataIteratorResponse_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getPerformanceMonitoringDataIteratorResponse");
    private final static QName _GetPerformanceMonitoringPointsIteratorRequest_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getPerformanceMonitoringPointsIteratorRequest");
    private final static QName _GetAllCurrentPerformanceMonitoringDataResponse_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getAllCurrentPerformanceMonitoringDataResponse");
    private final static QName _GetPerformanceMonitoringDataIteratorException_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getPerformanceMonitoringDataIteratorException");
    private final static QName _GetPerformanceMonitoringPointNamesIteratorResponse_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getPerformanceMonitoringPointNamesIteratorResponse");
    private final static QName _GetAllPerformanceMonitoringPointNamesResponse_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getAllPerformanceMonitoringPointNamesResponse");
    private final static QName _GetPerformanceMonitoringPointNamesIteratorRequest_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getPerformanceMonitoringPointNamesIteratorRequest");
    private final static QName _GetHoldingTimeRequest_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getHoldingTimeRequest");
    private final static QName _GetAllPerformanceMonitoringPointsResponse_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getAllPerformanceMonitoringPointsResponse");
    private final static QName _GetPerformanceMonitoringPointsIteratorResponse_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getPerformanceMonitoringPointsIteratorResponse");
    private final static QName _GetPerformanceMonitoringPointNamesIteratorException_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getPerformanceMonitoringPointNamesIteratorException");
    private final static QName _GetPerformanceMonitoringPointsIteratorException_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getPerformanceMonitoringPointsIteratorException");
    private final static QName _GetHistoryPerformanceMonitoringDataResponse_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getHistoryPerformanceMonitoringDataResponse");
    private final static QName _GetProfileAssociatedTerminationPointsResponse_QNAME = new QName("http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", "getProfileAssociatedTerminationPointsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.rpm.xsd.pmr.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProfileAssociatedTerminationPointsRequest }
     * 
     */
    public GetProfileAssociatedTerminationPointsRequest createGetProfileAssociatedTerminationPointsRequest() {
        return new GetProfileAssociatedTerminationPointsRequest();
    }

    /**
     * Create an instance of {@link GetPfmInstanceByResourceResponse }
     * 
     */
    public GetPfmInstanceByResourceResponse createGetPfmInstanceByResourceResponse() {
        return new GetPfmInstanceByResourceResponse();
    }

    /**
     * Create an instance of {@link GetMePerformanceMonitoringCapabilitiesException }
     * 
     */
    public GetMePerformanceMonitoringCapabilitiesException createGetMePerformanceMonitoringCapabilitiesException() {
        return new GetMePerformanceMonitoringCapabilitiesException();
    }

    /**
     * Create an instance of {@link GetPfmInstanceByResourceRequest }
     * 
     */
    public GetPfmInstanceByResourceRequest createGetPfmInstanceByResourceRequest() {
        return new GetPfmInstanceByResourceRequest();
    }

    /**
     * Create an instance of {@link GetMePerformanceMonitoringCapabilitiesResponse }
     * 
     */
    public GetMePerformanceMonitoringCapabilitiesResponse createGetMePerformanceMonitoringCapabilitiesResponse() {
        return new GetMePerformanceMonitoringCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link MultipleProfileAssociatedTerminationPointObjectNamesResponseType }
     * 
     */
    public MultipleProfileAssociatedTerminationPointObjectNamesResponseType createMultipleProfileAssociatedTerminationPointObjectNamesResponseType() {
        return new MultipleProfileAssociatedTerminationPointObjectNamesResponseType();
    }

    /**
     * Create an instance of {@link MultiplePerformanceMonitoringPointObjectsResponseType }
     * 
     */
    public MultiplePerformanceMonitoringPointObjectsResponseType createMultiplePerformanceMonitoringPointObjectsResponseType() {
        return new MultiplePerformanceMonitoringPointObjectsResponseType();
    }

    /**
     * Create an instance of {@link GetAllPerformanceMonitoringPointsRequest }
     * 
     */
    public GetAllPerformanceMonitoringPointsRequest createGetAllPerformanceMonitoringPointsRequest() {
        return new GetAllPerformanceMonitoringPointsRequest();
    }

    /**
     * Create an instance of {@link MultiplePerformanceMonitoringPointObjectNamesResponseType }
     * 
     */
    public MultiplePerformanceMonitoringPointObjectNamesResponseType createMultiplePerformanceMonitoringPointObjectNamesResponseType() {
        return new MultiplePerformanceMonitoringPointObjectNamesResponseType();
    }

    /**
     * Create an instance of {@link GetPfmInstanceByResourceException }
     * 
     */
    public GetPfmInstanceByResourceException createGetPfmInstanceByResourceException() {
        return new GetPfmInstanceByResourceException();
    }

    /**
     * Create an instance of {@link MultiplePerformanceMonitoringDataObjectsResponseType }
     * 
     */
    public MultiplePerformanceMonitoringDataObjectsResponseType createMultiplePerformanceMonitoringDataObjectsResponseType() {
        return new MultiplePerformanceMonitoringDataObjectsResponseType();
    }

    /**
     * Create an instance of {@link GetHoldingTimeException }
     * 
     */
    public GetHoldingTimeException createGetHoldingTimeException() {
        return new GetHoldingTimeException();
    }

    /**
     * Create an instance of {@link GetProfileAssociatedTerminationPointsException }
     * 
     */
    public GetProfileAssociatedTerminationPointsException createGetProfileAssociatedTerminationPointsException() {
        return new GetProfileAssociatedTerminationPointsException();
    }

    /**
     * Create an instance of {@link GetAllPerformanceMonitoringPointNamesRequest }
     * 
     */
    public GetAllPerformanceMonitoringPointNamesRequest createGetAllPerformanceMonitoringPointNamesRequest() {
        return new GetAllPerformanceMonitoringPointNamesRequest();
    }

    /**
     * Create an instance of {@link GetAllCurrentPerformanceMonitoringDataRequest }
     * 
     */
    public GetAllCurrentPerformanceMonitoringDataRequest createGetAllCurrentPerformanceMonitoringDataRequest() {
        return new GetAllCurrentPerformanceMonitoringDataRequest();
    }

    /**
     * Create an instance of {@link GetAllCurrentPerformanceMonitoringDataException }
     * 
     */
    public GetAllCurrentPerformanceMonitoringDataException createGetAllCurrentPerformanceMonitoringDataException() {
        return new GetAllCurrentPerformanceMonitoringDataException();
    }

    /**
     * Create an instance of {@link GetAllPerformanceMonitoringPointsException }
     * 
     */
    public GetAllPerformanceMonitoringPointsException createGetAllPerformanceMonitoringPointsException() {
        return new GetAllPerformanceMonitoringPointsException();
    }

    /**
     * Create an instance of {@link GetAllPerformanceMonitoringPointNamesException }
     * 
     */
    public GetAllPerformanceMonitoringPointNamesException createGetAllPerformanceMonitoringPointNamesException() {
        return new GetAllPerformanceMonitoringPointNamesException();
    }

    /**
     * Create an instance of {@link GetHoldingTimeResponse }
     * 
     */
    public GetHoldingTimeResponse createGetHoldingTimeResponse() {
        return new GetHoldingTimeResponse();
    }

    /**
     * Create an instance of {@link GetHistoryPerformanceMonitoringDataException }
     * 
     */
    public GetHistoryPerformanceMonitoringDataException createGetHistoryPerformanceMonitoringDataException() {
        return new GetHistoryPerformanceMonitoringDataException();
    }

    /**
     * Create an instance of {@link GetHistoryPerformanceMonitoringDataRequest }
     * 
     */
    public GetHistoryPerformanceMonitoringDataRequest createGetHistoryPerformanceMonitoringDataRequest() {
        return new GetHistoryPerformanceMonitoringDataRequest();
    }

    /**
     * Create an instance of {@link GetMePerformanceMonitoringCapabilitiesRequest }
     * 
     */
    public GetMePerformanceMonitoringCapabilitiesRequest createGetMePerformanceMonitoringCapabilitiesRequest() {
        return new GetMePerformanceMonitoringCapabilitiesRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getPerformanceMonitoringDataIteratorRequest")
    public JAXBElement<GetAllDataIteratorRequestType> createGetPerformanceMonitoringDataIteratorRequest(GetAllDataIteratorRequestType value) {
        return new JAXBElement<GetAllDataIteratorRequestType>(_GetPerformanceMonitoringDataIteratorRequest_QNAME, GetAllDataIteratorRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplePerformanceMonitoringDataObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getPerformanceMonitoringDataIteratorResponse")
    public JAXBElement<MultiplePerformanceMonitoringDataObjectsResponseType> createGetPerformanceMonitoringDataIteratorResponse(MultiplePerformanceMonitoringDataObjectsResponseType value) {
        return new JAXBElement<MultiplePerformanceMonitoringDataObjectsResponseType>(_GetPerformanceMonitoringDataIteratorResponse_QNAME, MultiplePerformanceMonitoringDataObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getPerformanceMonitoringPointsIteratorRequest")
    public JAXBElement<GetAllDataIteratorRequestType> createGetPerformanceMonitoringPointsIteratorRequest(GetAllDataIteratorRequestType value) {
        return new JAXBElement<GetAllDataIteratorRequestType>(_GetPerformanceMonitoringPointsIteratorRequest_QNAME, GetAllDataIteratorRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplePerformanceMonitoringDataObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getAllCurrentPerformanceMonitoringDataResponse")
    public JAXBElement<MultiplePerformanceMonitoringDataObjectsResponseType> createGetAllCurrentPerformanceMonitoringDataResponse(MultiplePerformanceMonitoringDataObjectsResponseType value) {
        return new JAXBElement<MultiplePerformanceMonitoringDataObjectsResponseType>(_GetAllCurrentPerformanceMonitoringDataResponse_QNAME, MultiplePerformanceMonitoringDataObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getPerformanceMonitoringDataIteratorException")
    public JAXBElement<GetAllDataIteratorExceptionType> createGetPerformanceMonitoringDataIteratorException(GetAllDataIteratorExceptionType value) {
        return new JAXBElement<GetAllDataIteratorExceptionType>(_GetPerformanceMonitoringDataIteratorException_QNAME, GetAllDataIteratorExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplePerformanceMonitoringPointObjectNamesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getPerformanceMonitoringPointNamesIteratorResponse")
    public JAXBElement<MultiplePerformanceMonitoringPointObjectNamesResponseType> createGetPerformanceMonitoringPointNamesIteratorResponse(MultiplePerformanceMonitoringPointObjectNamesResponseType value) {
        return new JAXBElement<MultiplePerformanceMonitoringPointObjectNamesResponseType>(_GetPerformanceMonitoringPointNamesIteratorResponse_QNAME, MultiplePerformanceMonitoringPointObjectNamesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplePerformanceMonitoringPointObjectNamesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getAllPerformanceMonitoringPointNamesResponse")
    public JAXBElement<MultiplePerformanceMonitoringPointObjectNamesResponseType> createGetAllPerformanceMonitoringPointNamesResponse(MultiplePerformanceMonitoringPointObjectNamesResponseType value) {
        return new JAXBElement<MultiplePerformanceMonitoringPointObjectNamesResponseType>(_GetAllPerformanceMonitoringPointNamesResponse_QNAME, MultiplePerformanceMonitoringPointObjectNamesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getPerformanceMonitoringPointNamesIteratorRequest")
    public JAXBElement<GetAllDataIteratorRequestType> createGetPerformanceMonitoringPointNamesIteratorRequest(GetAllDataIteratorRequestType value) {
        return new JAXBElement<GetAllDataIteratorRequestType>(_GetPerformanceMonitoringPointNamesIteratorRequest_QNAME, GetAllDataIteratorRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getHoldingTimeRequest")
    public JAXBElement<Object> createGetHoldingTimeRequest(Object value) {
        return new JAXBElement<Object>(_GetHoldingTimeRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplePerformanceMonitoringPointObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getAllPerformanceMonitoringPointsResponse")
    public JAXBElement<MultiplePerformanceMonitoringPointObjectsResponseType> createGetAllPerformanceMonitoringPointsResponse(MultiplePerformanceMonitoringPointObjectsResponseType value) {
        return new JAXBElement<MultiplePerformanceMonitoringPointObjectsResponseType>(_GetAllPerformanceMonitoringPointsResponse_QNAME, MultiplePerformanceMonitoringPointObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplePerformanceMonitoringPointObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getPerformanceMonitoringPointsIteratorResponse")
    public JAXBElement<MultiplePerformanceMonitoringPointObjectsResponseType> createGetPerformanceMonitoringPointsIteratorResponse(MultiplePerformanceMonitoringPointObjectsResponseType value) {
        return new JAXBElement<MultiplePerformanceMonitoringPointObjectsResponseType>(_GetPerformanceMonitoringPointsIteratorResponse_QNAME, MultiplePerformanceMonitoringPointObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getPerformanceMonitoringPointNamesIteratorException")
    public JAXBElement<GetAllDataIteratorExceptionType> createGetPerformanceMonitoringPointNamesIteratorException(GetAllDataIteratorExceptionType value) {
        return new JAXBElement<GetAllDataIteratorExceptionType>(_GetPerformanceMonitoringPointNamesIteratorException_QNAME, GetAllDataIteratorExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getPerformanceMonitoringPointsIteratorException")
    public JAXBElement<GetAllDataIteratorExceptionType> createGetPerformanceMonitoringPointsIteratorException(GetAllDataIteratorExceptionType value) {
        return new JAXBElement<GetAllDataIteratorExceptionType>(_GetPerformanceMonitoringPointsIteratorException_QNAME, GetAllDataIteratorExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplePerformanceMonitoringDataObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getHistoryPerformanceMonitoringDataResponse")
    public JAXBElement<MultiplePerformanceMonitoringDataObjectsResponseType> createGetHistoryPerformanceMonitoringDataResponse(MultiplePerformanceMonitoringDataObjectsResponseType value) {
        return new JAXBElement<MultiplePerformanceMonitoringDataObjectsResponseType>(_GetHistoryPerformanceMonitoringDataResponse_QNAME, MultiplePerformanceMonitoringDataObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleProfileAssociatedTerminationPointObjectNamesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1", name = "getProfileAssociatedTerminationPointsResponse")
    public JAXBElement<MultipleProfileAssociatedTerminationPointObjectNamesResponseType> createGetProfileAssociatedTerminationPointsResponse(MultipleProfileAssociatedTerminationPointObjectNamesResponseType value) {
        return new JAXBElement<MultipleProfileAssociatedTerminationPointObjectNamesResponseType>(_GetProfileAssociatedTerminationPointsResponse_QNAME, MultipleProfileAssociatedTerminationPointObjectNamesResponseType.class, null, value);
    }

}
