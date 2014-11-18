
package org.tmforum.mtop.mri.xsd.mer.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorExceptionType;
import org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorRequestType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.mri.xsd.mer.v1 package. 
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

    private final static QName _GetAllManagedElementsResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/mer/v1", "getAllManagedElementsResponse");
    private final static QName _GetAllManagedElementNamesResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/mer/v1", "getAllManagedElementNamesResponse");
    private final static QName _GetManagedElementNamesIteratorResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/mer/v1", "getManagedElementNamesIteratorResponse");
    private final static QName _GetManagedElementResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/mer/v1", "getManagedElementResponse");
    private final static QName _GetManagedElementNamesIteratorException_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/mer/v1", "getManagedElementNamesIteratorException");
    private final static QName _GetManagedElementNamesIteratorRequest_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/mer/v1", "getManagedElementNamesIteratorRequest");
    private final static QName _GetManagedElementsIteratorException_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/mer/v1", "getManagedElementsIteratorException");
    private final static QName _GetAllManagedElementsWrtOsResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/mer/v1", "getAllManagedElementsWrtOsResponse");
    private final static QName _GetManagedElementsIteratorRequest_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/mer/v1", "getManagedElementsIteratorRequest");
    private final static QName _GetManagedElementsIteratorResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/mer/v1", "getManagedElementsIteratorResponse");
    private final static QName _GetSubtendingManagedElementsResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/mer/v1", "getSubtendingManagedElementsResponse");
    private final static QName _GetAllManagedElementsPassingFilterResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/mer/v1", "getAllManagedElementsPassingFilterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.mri.xsd.mer.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetManagedElementException }
     * 
     */
    public GetManagedElementException createGetManagedElementException() {
        return new GetManagedElementException();
    }

    /**
     * Create an instance of {@link MultipleMeObjectsResponseType }
     * 
     */
    public MultipleMeObjectsResponseType createMultipleMeObjectsResponseType() {
        return new MultipleMeObjectsResponseType();
    }

    /**
     * Create an instance of {@link SingleMeObjectResponseType }
     * 
     */
    public SingleMeObjectResponseType createSingleMeObjectResponseType() {
        return new SingleMeObjectResponseType();
    }

    /**
     * Create an instance of {@link GetAllManagedElementNamesException }
     * 
     */
    public GetAllManagedElementNamesException createGetAllManagedElementNamesException() {
        return new GetAllManagedElementNamesException();
    }

    /**
     * Create an instance of {@link GetAllManagedElementsPassingFilterRequest }
     * 
     */
    public GetAllManagedElementsPassingFilterRequest createGetAllManagedElementsPassingFilterRequest() {
        return new GetAllManagedElementsPassingFilterRequest();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link GetAllManagedElementsWrtOsException }
     * 
     */
    public GetAllManagedElementsWrtOsException createGetAllManagedElementsWrtOsException() {
        return new GetAllManagedElementsWrtOsException();
    }

    /**
     * Create an instance of {@link GetAllManagedElementNamesRequest }
     * 
     */
    public GetAllManagedElementNamesRequest createGetAllManagedElementNamesRequest() {
        return new GetAllManagedElementNamesRequest();
    }

    /**
     * Create an instance of {@link GetAllManagedElementsRequest }
     * 
     */
    public GetAllManagedElementsRequest createGetAllManagedElementsRequest() {
        return new GetAllManagedElementsRequest();
    }

    /**
     * Create an instance of {@link GetAllManagedElementsException }
     * 
     */
    public GetAllManagedElementsException createGetAllManagedElementsException() {
        return new GetAllManagedElementsException();
    }

    /**
     * Create an instance of {@link GetAllManagedElementsWrtOsRequest }
     * 
     */
    public GetAllManagedElementsWrtOsRequest createGetAllManagedElementsWrtOsRequest() {
        return new GetAllManagedElementsWrtOsRequest();
    }

    /**
     * Create an instance of {@link GetManagedElementRequest }
     * 
     */
    public GetManagedElementRequest createGetManagedElementRequest() {
        return new GetManagedElementRequest();
    }

    /**
     * Create an instance of {@link GetAllManagedElementsPassingFilterException }
     * 
     */
    public GetAllManagedElementsPassingFilterException createGetAllManagedElementsPassingFilterException() {
        return new GetAllManagedElementsPassingFilterException();
    }

    /**
     * Create an instance of {@link GetSubtendingManagedElementsException }
     * 
     */
    public GetSubtendingManagedElementsException createGetSubtendingManagedElementsException() {
        return new GetSubtendingManagedElementsException();
    }

    /**
     * Create an instance of {@link GetSubtendingManagedElementsRequest }
     * 
     */
    public GetSubtendingManagedElementsRequest createGetSubtendingManagedElementsRequest() {
        return new GetSubtendingManagedElementsRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleMeObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1", name = "getAllManagedElementsResponse")
    public JAXBElement<MultipleMeObjectsResponseType> createGetAllManagedElementsResponse(MultipleMeObjectsResponseType value) {
        return new JAXBElement<MultipleMeObjectsResponseType>(_GetAllManagedElementsResponse_QNAME, MultipleMeObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamingAttributeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1", name = "getAllManagedElementNamesResponse")
    public JAXBElement<NamingAttributeListType> createGetAllManagedElementNamesResponse(NamingAttributeListType value) {
        return new JAXBElement<NamingAttributeListType>(_GetAllManagedElementNamesResponse_QNAME, NamingAttributeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamingAttributeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1", name = "getManagedElementNamesIteratorResponse")
    public JAXBElement<NamingAttributeListType> createGetManagedElementNamesIteratorResponse(NamingAttributeListType value) {
        return new JAXBElement<NamingAttributeListType>(_GetManagedElementNamesIteratorResponse_QNAME, NamingAttributeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingleMeObjectResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1", name = "getManagedElementResponse")
    public JAXBElement<SingleMeObjectResponseType> createGetManagedElementResponse(SingleMeObjectResponseType value) {
        return new JAXBElement<SingleMeObjectResponseType>(_GetManagedElementResponse_QNAME, SingleMeObjectResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1", name = "getManagedElementNamesIteratorException")
    public JAXBElement<GetAllDataIteratorExceptionType> createGetManagedElementNamesIteratorException(GetAllDataIteratorExceptionType value) {
        return new JAXBElement<GetAllDataIteratorExceptionType>(_GetManagedElementNamesIteratorException_QNAME, GetAllDataIteratorExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1", name = "getManagedElementNamesIteratorRequest")
    public JAXBElement<GetAllDataIteratorRequestType> createGetManagedElementNamesIteratorRequest(GetAllDataIteratorRequestType value) {
        return new JAXBElement<GetAllDataIteratorRequestType>(_GetManagedElementNamesIteratorRequest_QNAME, GetAllDataIteratorRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1", name = "getManagedElementsIteratorException")
    public JAXBElement<GetAllDataIteratorExceptionType> createGetManagedElementsIteratorException(GetAllDataIteratorExceptionType value) {
        return new JAXBElement<GetAllDataIteratorExceptionType>(_GetManagedElementsIteratorException_QNAME, GetAllDataIteratorExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleMeObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1", name = "getAllManagedElementsWrtOsResponse")
    public JAXBElement<MultipleMeObjectsResponseType> createGetAllManagedElementsWrtOsResponse(MultipleMeObjectsResponseType value) {
        return new JAXBElement<MultipleMeObjectsResponseType>(_GetAllManagedElementsWrtOsResponse_QNAME, MultipleMeObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1", name = "getManagedElementsIteratorRequest")
    public JAXBElement<GetAllDataIteratorRequestType> createGetManagedElementsIteratorRequest(GetAllDataIteratorRequestType value) {
        return new JAXBElement<GetAllDataIteratorRequestType>(_GetManagedElementsIteratorRequest_QNAME, GetAllDataIteratorRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleMeObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1", name = "getManagedElementsIteratorResponse")
    public JAXBElement<MultipleMeObjectsResponseType> createGetManagedElementsIteratorResponse(MultipleMeObjectsResponseType value) {
        return new JAXBElement<MultipleMeObjectsResponseType>(_GetManagedElementsIteratorResponse_QNAME, MultipleMeObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleMeObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1", name = "getSubtendingManagedElementsResponse")
    public JAXBElement<MultipleMeObjectsResponseType> createGetSubtendingManagedElementsResponse(MultipleMeObjectsResponseType value) {
        return new JAXBElement<MultipleMeObjectsResponseType>(_GetSubtendingManagedElementsResponse_QNAME, MultipleMeObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleMeObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/mer/v1", name = "getAllManagedElementsPassingFilterResponse")
    public JAXBElement<MultipleMeObjectsResponseType> createGetAllManagedElementsPassingFilterResponse(MultipleMeObjectsResponseType value) {
        return new JAXBElement<MultipleMeObjectsResponseType>(_GetAllManagedElementsPassingFilterResponse_QNAME, MultipleMeObjectsResponseType.class, null, value);
    }

}
