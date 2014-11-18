
package org.tmforum.mtop.nrf.xsd.gtp.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nrf.xsd.gtp.v1 package. 
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

    private final static QName _Gtp_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/gtp/v1", "gtp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nrf.xsd.gtp.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GroupTerminationPointType }
     * 
     */
    public GroupTerminationPointType createGroupTerminationPointType() {
        return new GroupTerminationPointType();
    }

    /**
     * Create an instance of {@link GroupTerminationPointListType }
     * 
     */
    public GroupTerminationPointListType createGroupTerminationPointListType() {
        return new GroupTerminationPointListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupTerminationPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/gtp/v1", name = "gtp")
    public JAXBElement<GroupTerminationPointType> createGtp(GroupTerminationPointType value) {
        return new JAXBElement<GroupTerminationPointType>(_Gtp_QNAME, GroupTerminationPointType.class, null, value);
    }

}
