
package org.tmforum.mtop.vs.xsd.rr.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.vs.xsd.rr.v1 package. 
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

    private final static QName _Cit_QNAME = new QName("http://www.tmforum.org/mtop/vs/xsd/rr/v1", "cit");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.vs.xsd.rr.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAttributesByNativeEMSNameException }
     * 
     */
    public GetAttributesByNativeEMSNameException createGetAttributesByNativeEMSNameException() {
        return new GetAttributesByNativeEMSNameException();
    }

    /**
     * Create an instance of {@link GetAttributesByNativeEMSNameRequest }
     * 
     */
    public GetAttributesByNativeEMSNameRequest createGetAttributesByNativeEMSNameRequest() {
        return new GetAttributesByNativeEMSNameRequest();
    }

    /**
     * Create an instance of {@link CustomerInfoType }
     * 
     */
    public CustomerInfoType createCustomerInfoType() {
        return new CustomerInfoType();
    }

    /**
     * Create an instance of {@link GetAttributesByNativeEMSNameResponse }
     * 
     */
    public GetAttributesByNativeEMSNameResponse createGetAttributesByNativeEMSNameResponse() {
        return new GetAttributesByNativeEMSNameResponse();
    }

    /**
     * Create an instance of {@link CustomerInfoListType }
     * 
     */
    public CustomerInfoListType createCustomerInfoListType() {
        return new CustomerInfoListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/vs/xsd/rr/v1", name = "cit")
    public JAXBElement<CustomerInfoType> createCit(CustomerInfoType value) {
        return new JAXBElement<CustomerInfoType>(_Cit_QNAME, CustomerInfoType.class, null, value);
    }

}
