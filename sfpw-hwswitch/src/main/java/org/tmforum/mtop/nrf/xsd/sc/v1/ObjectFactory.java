
package org.tmforum.mtop.nrf.xsd.sc.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nrf.xsd.sc.v1 package. 
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

    private final static QName _ServerConnectionList_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/sc/v1", "serverConnectionList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nrf.xsd.sc.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServerConnectionListType }
     * 
     */
    public ServerConnectionListType createServerConnectionListType() {
        return new ServerConnectionListType();
    }

    /**
     * Create an instance of {@link ServerConnectionType }
     * 
     */
    public ServerConnectionType createServerConnectionType() {
        return new ServerConnectionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerConnectionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/sc/v1", name = "serverConnectionList")
    public JAXBElement<ServerConnectionListType> createServerConnectionList(ServerConnectionListType value) {
        return new JAXBElement<ServerConnectionListType>(_ServerConnectionList_QNAME, ServerConnectionListType.class, null, value);
    }

}
