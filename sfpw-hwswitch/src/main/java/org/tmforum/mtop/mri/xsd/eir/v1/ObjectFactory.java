
package org.tmforum.mtop.mri.xsd.eir.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.tmforum.mtop.nrf.xsd.eq_inv.v1.EquipmentOrEquipmentHolderListType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.mri.xsd.eir.v1 package. 
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

    private final static QName _GetSupportedEquipmentRequest_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/eir/v1", "getSupportedEquipmentRequest");
    private final static QName _GetAllEquipmentRequest_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/eir/v1", "getAllEquipmentRequest");
    private final static QName _GetAllEquipmentResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/eir/v1", "getAllEquipmentResponse");
    private final static QName _GetSupportingEquipmentResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/eir/v1", "getSupportingEquipmentResponse");
    private final static QName _GetSupportedEquipmentResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/eir/v1", "getSupportedEquipmentResponse");
    private final static QName _GetAllSupportingEquipmentResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/eir/v1", "getAllSupportingEquipmentResponse");
    private final static QName _GetAllSupportingEquipmentRequest_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/eir/v1", "getAllSupportingEquipmentRequest");
    private final static QName _GetEquipmentIteratorResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/eir/v1", "getEquipmentIteratorResponse");
    private final static QName _GetEquipmentIteratorRequest_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/eir/v1", "getEquipmentIteratorRequest");
    private final static QName _GetSupportingEquipmentRequest_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/eir/v1", "getSupportingEquipmentRequest");
    private final static QName _GetContainedEquipmentResponse_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/eir/v1", "getContainedEquipmentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.mri.xsd.eir.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSupportEquipmentRequestType }
     * 
     */
    public GetSupportEquipmentRequestType createGetSupportEquipmentRequestType() {
        return new GetSupportEquipmentRequestType();
    }

    /**
     * Create an instance of {@link GetEquipmentResponse }
     * 
     */
    public GetEquipmentResponse createGetEquipmentResponse() {
        return new GetEquipmentResponse();
    }

    /**
     * Create an instance of {@link GetAllEquipmentException }
     * 
     */
    public GetAllEquipmentException createGetAllEquipmentException() {
        return new GetAllEquipmentException();
    }

    /**
     * Create an instance of {@link GetContainedEquipmentRequest }
     * 
     */
    public GetContainedEquipmentRequest createGetContainedEquipmentRequest() {
        return new GetContainedEquipmentRequest();
    }

    /**
     * Create an instance of {@link GetAllSupportingEquipmentException }
     * 
     */
    public GetAllSupportingEquipmentException createGetAllSupportingEquipmentException() {
        return new GetAllSupportingEquipmentException();
    }

    /**
     * Create an instance of {@link GetAllEquipmentWithPtpRequestType }
     * 
     */
    public GetAllEquipmentWithPtpRequestType createGetAllEquipmentWithPtpRequestType() {
        return new GetAllEquipmentWithPtpRequestType();
    }

    /**
     * Create an instance of {@link GetEquipmentRequest }
     * 
     */
    public GetEquipmentRequest createGetEquipmentRequest() {
        return new GetEquipmentRequest();
    }

    /**
     * Create an instance of {@link GetEquipmentIteratorException }
     * 
     */
    public GetEquipmentIteratorException createGetEquipmentIteratorException() {
        return new GetEquipmentIteratorException();
    }

    /**
     * Create an instance of {@link GetEquipmentException }
     * 
     */
    public GetEquipmentException createGetEquipmentException() {
        return new GetEquipmentException();
    }

    /**
     * Create an instance of {@link GetSupportedEquipmentException }
     * 
     */
    public GetSupportedEquipmentException createGetSupportedEquipmentException() {
        return new GetSupportedEquipmentException();
    }

    /**
     * Create an instance of {@link GetContainedEquipmentException }
     * 
     */
    public GetContainedEquipmentException createGetContainedEquipmentException() {
        return new GetContainedEquipmentException();
    }

    /**
     * Create an instance of {@link GetSupportingEquipmentException }
     * 
     */
    public GetSupportingEquipmentException createGetSupportingEquipmentException() {
        return new GetSupportingEquipmentException();
    }

    /**
     * Create an instance of {@link GetAllEquipmentRequestType }
     * 
     */
    public GetAllEquipmentRequestType createGetAllEquipmentRequestType() {
        return new GetAllEquipmentRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupportEquipmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1", name = "getSupportedEquipmentRequest")
    public JAXBElement<GetSupportEquipmentRequestType> createGetSupportedEquipmentRequest(GetSupportEquipmentRequestType value) {
        return new JAXBElement<GetSupportEquipmentRequestType>(_GetSupportedEquipmentRequest_QNAME, GetSupportEquipmentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEquipmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1", name = "getAllEquipmentRequest")
    public JAXBElement<GetAllEquipmentRequestType> createGetAllEquipmentRequest(GetAllEquipmentRequestType value) {
        return new JAXBElement<GetAllEquipmentRequestType>(_GetAllEquipmentRequest_QNAME, GetAllEquipmentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentOrEquipmentHolderListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1", name = "getAllEquipmentResponse")
    public JAXBElement<EquipmentOrEquipmentHolderListType> createGetAllEquipmentResponse(EquipmentOrEquipmentHolderListType value) {
        return new JAXBElement<EquipmentOrEquipmentHolderListType>(_GetAllEquipmentResponse_QNAME, EquipmentOrEquipmentHolderListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentOrEquipmentHolderListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1", name = "getSupportingEquipmentResponse")
    public JAXBElement<EquipmentOrEquipmentHolderListType> createGetSupportingEquipmentResponse(EquipmentOrEquipmentHolderListType value) {
        return new JAXBElement<EquipmentOrEquipmentHolderListType>(_GetSupportingEquipmentResponse_QNAME, EquipmentOrEquipmentHolderListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentOrEquipmentHolderListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1", name = "getSupportedEquipmentResponse")
    public JAXBElement<EquipmentOrEquipmentHolderListType> createGetSupportedEquipmentResponse(EquipmentOrEquipmentHolderListType value) {
        return new JAXBElement<EquipmentOrEquipmentHolderListType>(_GetSupportedEquipmentResponse_QNAME, EquipmentOrEquipmentHolderListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentOrEquipmentHolderListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1", name = "getAllSupportingEquipmentResponse")
    public JAXBElement<EquipmentOrEquipmentHolderListType> createGetAllSupportingEquipmentResponse(EquipmentOrEquipmentHolderListType value) {
        return new JAXBElement<EquipmentOrEquipmentHolderListType>(_GetAllSupportingEquipmentResponse_QNAME, EquipmentOrEquipmentHolderListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEquipmentWithPtpRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1", name = "getAllSupportingEquipmentRequest")
    public JAXBElement<GetAllEquipmentWithPtpRequestType> createGetAllSupportingEquipmentRequest(GetAllEquipmentWithPtpRequestType value) {
        return new JAXBElement<GetAllEquipmentWithPtpRequestType>(_GetAllSupportingEquipmentRequest_QNAME, GetAllEquipmentWithPtpRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentOrEquipmentHolderListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1", name = "getEquipmentIteratorResponse")
    public JAXBElement<EquipmentOrEquipmentHolderListType> createGetEquipmentIteratorResponse(EquipmentOrEquipmentHolderListType value) {
        return new JAXBElement<EquipmentOrEquipmentHolderListType>(_GetEquipmentIteratorResponse_QNAME, EquipmentOrEquipmentHolderListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1", name = "getEquipmentIteratorRequest")
    public JAXBElement<Object> createGetEquipmentIteratorRequest(Object value) {
        return new JAXBElement<Object>(_GetEquipmentIteratorRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupportEquipmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1", name = "getSupportingEquipmentRequest")
    public JAXBElement<GetSupportEquipmentRequestType> createGetSupportingEquipmentRequest(GetSupportEquipmentRequestType value) {
        return new JAXBElement<GetSupportEquipmentRequestType>(_GetSupportingEquipmentRequest_QNAME, GetSupportEquipmentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentOrEquipmentHolderListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/eir/v1", name = "getContainedEquipmentResponse")
    public JAXBElement<EquipmentOrEquipmentHolderListType> createGetContainedEquipmentResponse(EquipmentOrEquipmentHolderListType value) {
        return new JAXBElement<EquipmentOrEquipmentHolderListType>(_GetContainedEquipmentResponse_QNAME, EquipmentOrEquipmentHolderListType.class, null, value);
    }

}
