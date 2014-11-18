
package org.tmforum.mtop.nrf.xsd.tcp.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nrf.xsd.tcp.v1 package. 
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

    private final static QName _Tcp_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/tcp/v1", "tcp");
    private final static QName _Tcf_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/tcp/v1", "tcf");
    private final static QName _Tcpd_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/tcp/v1", "tcpd");
    private final static QName _Tcpa_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/tcp/v1", "tcpa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nrf.xsd.tcp.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrafficConditioningProfileDeassignType }
     * 
     */
    public TrafficConditioningProfileDeassignType createTrafficConditioningProfileDeassignType() {
        return new TrafficConditioningProfileDeassignType();
    }

    /**
     * Create an instance of {@link TrafficConditioningProfileAssignType }
     * 
     */
    public TrafficConditioningProfileAssignType createTrafficConditioningProfileAssignType() {
        return new TrafficConditioningProfileAssignType();
    }

    /**
     * Create an instance of {@link TrafficConditioningProfileType }
     * 
     */
    public TrafficConditioningProfileType createTrafficConditioningProfileType() {
        return new TrafficConditioningProfileType();
    }

    /**
     * Create an instance of {@link TrafficClassifierType }
     * 
     */
    public TrafficClassifierType createTrafficClassifierType() {
        return new TrafficClassifierType();
    }

    /**
     * Create an instance of {@link TrafficClassifierListType }
     * 
     */
    public TrafficClassifierListType createTrafficClassifierListType() {
        return new TrafficClassifierListType();
    }

    /**
     * Create an instance of {@link TrafficConditioningProfileDeassignListType }
     * 
     */
    public TrafficConditioningProfileDeassignListType createTrafficConditioningProfileDeassignListType() {
        return new TrafficConditioningProfileDeassignListType();
    }

    /**
     * Create an instance of {@link TrafficConditioningProfileAssignListType }
     * 
     */
    public TrafficConditioningProfileAssignListType createTrafficConditioningProfileAssignListType() {
        return new TrafficConditioningProfileAssignListType();
    }

    /**
     * Create an instance of {@link TrafficConditioningProfileListType }
     * 
     */
    public TrafficConditioningProfileListType createTrafficConditioningProfileListType() {
        return new TrafficConditioningProfileListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficConditioningProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/tcp/v1", name = "tcp")
    public JAXBElement<TrafficConditioningProfileType> createTcp(TrafficConditioningProfileType value) {
        return new JAXBElement<TrafficConditioningProfileType>(_Tcp_QNAME, TrafficConditioningProfileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficClassifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/tcp/v1", name = "tcf")
    public JAXBElement<TrafficClassifierType> createTcf(TrafficClassifierType value) {
        return new JAXBElement<TrafficClassifierType>(_Tcf_QNAME, TrafficClassifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficConditioningProfileDeassignType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/tcp/v1", name = "tcpd")
    public JAXBElement<TrafficConditioningProfileDeassignType> createTcpd(TrafficConditioningProfileDeassignType value) {
        return new JAXBElement<TrafficConditioningProfileDeassignType>(_Tcpd_QNAME, TrafficConditioningProfileDeassignType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficConditioningProfileAssignType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/tcp/v1", name = "tcpa")
    public JAXBElement<TrafficConditioningProfileAssignType> createTcpa(TrafficConditioningProfileAssignType value) {
        return new JAXBElement<TrafficConditioningProfileAssignType>(_Tcpa_QNAME, TrafficConditioningProfileAssignType.class, null, value);
    }

}
