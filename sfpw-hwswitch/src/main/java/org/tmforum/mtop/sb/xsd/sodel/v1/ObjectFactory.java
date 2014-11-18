
package org.tmforum.mtop.sb.xsd.sodel.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.sb.xsd.sodel.v1 package. 
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

    private final static QName _ServiceObjectDeletion_QNAME = new QName("http://www.tmforum.org/mtop/sb/xsd/sodel/v1", "serviceObjectDeletion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.sb.xsd.sodel.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceObjectDeletionType }
     * 
     */
    public ServiceObjectDeletionType createServiceObjectDeletionType() {
        return new ServiceObjectDeletionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceObjectDeletionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/sb/xsd/sodel/v1", name = "serviceObjectDeletion")
    public JAXBElement<ServiceObjectDeletionType> createServiceObjectDeletion(ServiceObjectDeletionType value) {
        return new JAXBElement<ServiceObjectDeletionType>(_ServiceObjectDeletion_QNAME, ServiceObjectDeletionType.class, null, value);
    }

}
