
package org.tmforum.mtop.mri.xsd.dusr.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.mri.xsd.dusr.v1 package. 
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

    private final static QName _IpAddressList_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/dusr/v1", "ipAddressList");
    private final static QName _IpAssociatedMEInfosType_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/dusr/v1", "ipAssociatedMEInfosType");
    private final static QName _MeInfoRef_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/dusr/v1", "meInfoRef");
    private final static QName _MeInfoListRef_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/dusr/v1", "meInfoListRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.mri.xsd.dusr.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IPAddressListType }
     * 
     */
    public IPAddressListType createIPAddressListType() {
        return new IPAddressListType();
    }

    /**
     * Create an instance of {@link GetAllManagedElementInfosByIPsRequest }
     * 
     */
    public GetAllManagedElementInfosByIPsRequest createGetAllManagedElementInfosByIPsRequest() {
        return new GetAllManagedElementInfosByIPsRequest();
    }

    /**
     * Create an instance of {@link GetAllManagedElementInfosByIPsResponse }
     * 
     */
    public GetAllManagedElementInfosByIPsResponse createGetAllManagedElementInfosByIPsResponse() {
        return new GetAllManagedElementInfosByIPsResponse();
    }

    /**
     * Create an instance of {@link IPAssociatedMEInfosListType }
     * 
     */
    public IPAssociatedMEInfosListType createIPAssociatedMEInfosListType() {
        return new IPAssociatedMEInfosListType();
    }

    /**
     * Create an instance of {@link IPAssociatedMEInfosType }
     * 
     */
    public IPAssociatedMEInfosType createIPAssociatedMEInfosType() {
        return new IPAssociatedMEInfosType();
    }

    /**
     * Create an instance of {@link SimpleMEInfoType }
     * 
     */
    public SimpleMEInfoType createSimpleMEInfoType() {
        return new SimpleMEInfoType();
    }

    /**
     * Create an instance of {@link SimpleMEInfoListType }
     * 
     */
    public SimpleMEInfoListType createSimpleMEInfoListType() {
        return new SimpleMEInfoListType();
    }

    /**
     * Create an instance of {@link GetAllManagedElementInfosByIPsException }
     * 
     */
    public GetAllManagedElementInfosByIPsException createGetAllManagedElementInfosByIPsException() {
        return new GetAllManagedElementInfosByIPsException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IPAddressListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/dusr/v1", name = "ipAddressList")
    public JAXBElement<IPAddressListType> createIpAddressList(IPAddressListType value) {
        return new JAXBElement<IPAddressListType>(_IpAddressList_QNAME, IPAddressListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IPAssociatedMEInfosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/dusr/v1", name = "ipAssociatedMEInfosType")
    public JAXBElement<IPAssociatedMEInfosType> createIpAssociatedMEInfosType(IPAssociatedMEInfosType value) {
        return new JAXBElement<IPAssociatedMEInfosType>(_IpAssociatedMEInfosType_QNAME, IPAssociatedMEInfosType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleMEInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/dusr/v1", name = "meInfoRef")
    public JAXBElement<SimpleMEInfoType> createMeInfoRef(SimpleMEInfoType value) {
        return new JAXBElement<SimpleMEInfoType>(_MeInfoRef_QNAME, SimpleMEInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleMEInfoListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/dusr/v1", name = "meInfoListRef")
    public JAXBElement<SimpleMEInfoListType> createMeInfoListRef(SimpleMEInfoListType value) {
        return new JAXBElement<SimpleMEInfoListType>(_MeInfoListRef_QNAME, SimpleMEInfoListType.class, null, value);
    }

}
