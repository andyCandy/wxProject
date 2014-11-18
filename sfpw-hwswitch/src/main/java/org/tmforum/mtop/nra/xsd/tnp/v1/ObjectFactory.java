
package org.tmforum.mtop.nra.xsd.tnp.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nra.xsd.tnp.v1 package. 
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

    private final static QName _Tnp_QNAME = new QName("http://www.tmforum.org/mtop/nra/xsd/tnp/v1", "tnp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nra.xsd.tnp.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrailNetworkProtectionType }
     * 
     */
    public TrailNetworkProtectionType createTrailNetworkProtectionType() {
        return new TrailNetworkProtectionType();
    }

    /**
     * Create an instance of {@link TrailNetworkProtectionListType }
     * 
     */
    public TrailNetworkProtectionListType createTrailNetworkProtectionListType() {
        return new TrailNetworkProtectionListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrailNetworkProtectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nra/xsd/tnp/v1", name = "tnp")
    public JAXBElement<TrailNetworkProtectionType> createTnp(TrailNetworkProtectionType value) {
        return new JAXBElement<TrailNetworkProtectionType>(_Tnp_QNAME, TrailNetworkProtectionType.class, null, value);
    }

}
