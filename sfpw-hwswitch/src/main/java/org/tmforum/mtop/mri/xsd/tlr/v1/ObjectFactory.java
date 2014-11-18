
package org.tmforum.mtop.mri.xsd.tlr.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorExceptionType;
import org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorRequestType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.mri.xsd.tlr.v1 package. 
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

    private final static QName _GetAllTopologicalLinksWrtOsResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/tlr/v1", "getAllTopologicalLinksWrtOsResponse");
    private final static QName _GetTopologicalLinksIteratorException_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/tlr/v1", "getTopologicalLinksIteratorException");
    private final static QName _GetTopologicalLinkResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/tlr/v1", "getTopologicalLinkResponse");
    private final static QName _GetAllTopologicalLinksResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/tlr/v1", "getAllTopologicalLinksResponse");
    private final static QName _GetAllTopologicalLinksOfFdResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/tlr/v1", "getAllTopologicalLinksOfFdResponse");
    private final static QName _GetAllTopologicalLinksBetweenMdsResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/tlr/v1", "getAllTopologicalLinksBetweenMdsResponse");
    private final static QName _GetAllTopLevelTopologicalLinksResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/tlr/v1", "getAllTopLevelTopologicalLinksResponse");
    private final static QName _GetTopologicalLinksIteratorResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/tlr/v1", "getTopologicalLinksIteratorResponse");
    private final static QName _GetTopologicalLinksIteratorRequest_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/tlr/v1", "getTopologicalLinksIteratorRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.mri.xsd.tlr.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MultipleTlObjectsResponseType }
     * 
     */
    public MultipleTlObjectsResponseType createMultipleTlObjectsResponseType() {
        return new MultipleTlObjectsResponseType();
    }

    /**
     * Create an instance of {@link GetAllTopologicalLinksRequest }
     * 
     */
    public GetAllTopologicalLinksRequest createGetAllTopologicalLinksRequest() {
        return new GetAllTopologicalLinksRequest();
    }

    /**
     * Create an instance of {@link GetRouteAndTopologicalLinksRequest }
     * 
     */
    public GetRouteAndTopologicalLinksRequest createGetRouteAndTopologicalLinksRequest() {
        return new GetRouteAndTopologicalLinksRequest();
    }

    /**
     * Create an instance of {@link SingleObjectResponseType }
     * 
     */
    public SingleObjectResponseType createSingleObjectResponseType() {
        return new SingleObjectResponseType();
    }

    /**
     * Create an instance of {@link GetTopLevelTopologicalLinkResponse }
     * 
     */
    public GetTopLevelTopologicalLinkResponse createGetTopLevelTopologicalLinkResponse() {
        return new GetTopLevelTopologicalLinkResponse();
    }

    /**
     * Create an instance of {@link GetAllTopologicalLinksException }
     * 
     */
    public GetAllTopologicalLinksException createGetAllTopologicalLinksException() {
        return new GetAllTopologicalLinksException();
    }

    /**
     * Create an instance of {@link GetAllTopologicalLinksBetweenMdsException }
     * 
     */
    public GetAllTopologicalLinksBetweenMdsException createGetAllTopologicalLinksBetweenMdsException() {
        return new GetAllTopologicalLinksBetweenMdsException();
    }

    /**
     * Create an instance of {@link GetRouteAndTopologicalLinksException }
     * 
     */
    public GetRouteAndTopologicalLinksException createGetRouteAndTopologicalLinksException() {
        return new GetRouteAndTopologicalLinksException();
    }

    /**
     * Create an instance of {@link GetRouteAndTopologicalLinksResponse }
     * 
     */
    public GetRouteAndTopologicalLinksResponse createGetRouteAndTopologicalLinksResponse() {
        return new GetRouteAndTopologicalLinksResponse();
    }

    /**
     * Create an instance of {@link GetAllTopologicalLinksBetweenMdsRequest }
     * 
     */
    public GetAllTopologicalLinksBetweenMdsRequest createGetAllTopologicalLinksBetweenMdsRequest() {
        return new GetAllTopologicalLinksBetweenMdsRequest();
    }

    /**
     * Create an instance of {@link GetTopLevelTopologicalLinkRequest }
     * 
     */
    public GetTopLevelTopologicalLinkRequest createGetTopLevelTopologicalLinkRequest() {
        return new GetTopLevelTopologicalLinkRequest();
    }

    /**
     * Create an instance of {@link GetAllTopLevelTopologicalLinksException }
     * 
     */
    public GetAllTopLevelTopologicalLinksException createGetAllTopLevelTopologicalLinksException() {
        return new GetAllTopLevelTopologicalLinksException();
    }

    /**
     * Create an instance of {@link GetAllTopologicalLinksOfFdRequest }
     * 
     */
    public GetAllTopologicalLinksOfFdRequest createGetAllTopologicalLinksOfFdRequest() {
        return new GetAllTopologicalLinksOfFdRequest();
    }

    /**
     * Create an instance of {@link GetAllTopologicalLinksOfFdException }
     * 
     */
    public GetAllTopologicalLinksOfFdException createGetAllTopologicalLinksOfFdException() {
        return new GetAllTopologicalLinksOfFdException();
    }

    /**
     * Create an instance of {@link GetAllTopLevelTopologicalLinksRequest }
     * 
     */
    public GetAllTopLevelTopologicalLinksRequest createGetAllTopLevelTopologicalLinksRequest() {
        return new GetAllTopLevelTopologicalLinksRequest();
    }

    /**
     * Create an instance of {@link GetAllTopologicalLinksWrtOsException }
     * 
     */
    public GetAllTopologicalLinksWrtOsException createGetAllTopologicalLinksWrtOsException() {
        return new GetAllTopologicalLinksWrtOsException();
    }

    /**
     * Create an instance of {@link GetTopologicalLinkException }
     * 
     */
    public GetTopologicalLinkException createGetTopologicalLinkException() {
        return new GetTopologicalLinkException();
    }

    /**
     * Create an instance of {@link GetTopLevelTopologicalLinkException }
     * 
     */
    public GetTopLevelTopologicalLinkException createGetTopLevelTopologicalLinkException() {
        return new GetTopLevelTopologicalLinkException();
    }

    /**
     * Create an instance of {@link GetTopologicalLinkRequest }
     * 
     */
    public GetTopologicalLinkRequest createGetTopologicalLinkRequest() {
        return new GetTopologicalLinkRequest();
    }

    /**
     * Create an instance of {@link GetAllTopologicalLinksWrtOsRequest }
     * 
     */
    public GetAllTopologicalLinksWrtOsRequest createGetAllTopologicalLinksWrtOsRequest() {
        return new GetAllTopologicalLinksWrtOsRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTlObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/tlr/v1", name = "getAllTopologicalLinksWrtOsResponse")
    public JAXBElement<MultipleTlObjectsResponseType> createGetAllTopologicalLinksWrtOsResponse(MultipleTlObjectsResponseType value) {
        return new JAXBElement<MultipleTlObjectsResponseType>(_GetAllTopologicalLinksWrtOsResponse_QNAME, MultipleTlObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/tlr/v1", name = "getTopologicalLinksIteratorException")
    public JAXBElement<GetAllDataIteratorExceptionType> createGetTopologicalLinksIteratorException(GetAllDataIteratorExceptionType value) {
        return new JAXBElement<GetAllDataIteratorExceptionType>(_GetTopologicalLinksIteratorException_QNAME, GetAllDataIteratorExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingleObjectResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/tlr/v1", name = "getTopologicalLinkResponse")
    public JAXBElement<SingleObjectResponseType> createGetTopologicalLinkResponse(SingleObjectResponseType value) {
        return new JAXBElement<SingleObjectResponseType>(_GetTopologicalLinkResponse_QNAME, SingleObjectResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTlObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/tlr/v1", name = "getAllTopologicalLinksResponse")
    public JAXBElement<MultipleTlObjectsResponseType> createGetAllTopologicalLinksResponse(MultipleTlObjectsResponseType value) {
        return new JAXBElement<MultipleTlObjectsResponseType>(_GetAllTopologicalLinksResponse_QNAME, MultipleTlObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTlObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/tlr/v1", name = "getAllTopologicalLinksOfFdResponse")
    public JAXBElement<MultipleTlObjectsResponseType> createGetAllTopologicalLinksOfFdResponse(MultipleTlObjectsResponseType value) {
        return new JAXBElement<MultipleTlObjectsResponseType>(_GetAllTopologicalLinksOfFdResponse_QNAME, MultipleTlObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTlObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/tlr/v1", name = "getAllTopologicalLinksBetweenMdsResponse")
    public JAXBElement<MultipleTlObjectsResponseType> createGetAllTopologicalLinksBetweenMdsResponse(MultipleTlObjectsResponseType value) {
        return new JAXBElement<MultipleTlObjectsResponseType>(_GetAllTopologicalLinksBetweenMdsResponse_QNAME, MultipleTlObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTlObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/tlr/v1", name = "getAllTopLevelTopologicalLinksResponse")
    public JAXBElement<MultipleTlObjectsResponseType> createGetAllTopLevelTopologicalLinksResponse(MultipleTlObjectsResponseType value) {
        return new JAXBElement<MultipleTlObjectsResponseType>(_GetAllTopLevelTopologicalLinksResponse_QNAME, MultipleTlObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTlObjectsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/tlr/v1", name = "getTopologicalLinksIteratorResponse")
    public JAXBElement<MultipleTlObjectsResponseType> createGetTopologicalLinksIteratorResponse(MultipleTlObjectsResponseType value) {
        return new JAXBElement<MultipleTlObjectsResponseType>(_GetTopologicalLinksIteratorResponse_QNAME, MultipleTlObjectsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataIteratorRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/tlr/v1", name = "getTopologicalLinksIteratorRequest")
    public JAXBElement<GetAllDataIteratorRequestType> createGetTopologicalLinksIteratorRequest(GetAllDataIteratorRequestType value) {
        return new JAXBElement<GetAllDataIteratorRequestType>(_GetTopologicalLinksIteratorRequest_QNAME, GetAllDataIteratorRequestType.class, null, value);
    }

}
