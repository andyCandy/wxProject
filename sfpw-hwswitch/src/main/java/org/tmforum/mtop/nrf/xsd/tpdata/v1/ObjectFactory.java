
package org.tmforum.mtop.nrf.xsd.tpdata.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nrf.xsd.tpdata.v1 package. 
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

    private final static QName _IPAddressList_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1", "IPAddressList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nrf.xsd.tpdata.v1
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
     * Create an instance of {@link VlanIDSectionType }
     * 
     */
    public VlanIDSectionType createVlanIDSectionType() {
        return new VlanIDSectionType();
    }

    /**
     * Create an instance of {@link TerminationPointDataListType }
     * 
     */
    public TerminationPointDataListType createTerminationPointDataListType() {
        return new TerminationPointDataListType();
    }

    /**
     * Create an instance of {@link IPAddressType }
     * 
     */
    public IPAddressType createIPAddressType() {
        return new IPAddressType();
    }

    /**
     * Create an instance of {@link VlanIDSectionListType }
     * 
     */
    public VlanIDSectionListType createVlanIDSectionListType() {
        return new VlanIDSectionListType();
    }

    /**
     * Create an instance of {@link TerminationPointDataType }
     * 
     */
    public TerminationPointDataType createTerminationPointDataType() {
        return new TerminationPointDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IPAddressListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1", name = "IPAddressList")
    public JAXBElement<IPAddressListType> createIPAddressList(IPAddressListType value) {
        return new JAXBElement<IPAddressListType>(_IPAddressList_QNAME, IPAddressListType.class, null, value);
    }

}
