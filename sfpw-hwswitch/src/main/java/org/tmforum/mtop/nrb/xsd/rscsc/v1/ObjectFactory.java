
package org.tmforum.mtop.nrb.xsd.rscsc.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nrb.xsd.rscsc.v1 package. 
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

    private final static QName _ResourceStateChange_QNAME = new QName("http://www.tmforum.org/mtop/nrb/xsd/rscsc/v1", "resourceStateChange");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nrb.xsd.rscsc.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResourceStateChangeType }
     * 
     */
    public ResourceStateChangeType createResourceStateChangeType() {
        return new ResourceStateChangeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceStateChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrb/xsd/rscsc/v1", name = "resourceStateChange")
    public JAXBElement<ResourceStateChangeType> createResourceStateChange(ResourceStateChangeType value) {
        return new JAXBElement<ResourceStateChangeType>(_ResourceStateChange_QNAME, ResourceStateChangeType.class, null, value);
    }

}
