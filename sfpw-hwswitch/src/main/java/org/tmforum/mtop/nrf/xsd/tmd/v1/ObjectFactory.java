
package org.tmforum.mtop.nrf.xsd.tmd.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nrf.xsd.tmd.v1 package. 
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

    private final static QName _Tmd_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/tmd/v1", "tmd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nrf.xsd.tmd.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransmissionDescriptorType }
     * 
     */
    public TransmissionDescriptorType createTransmissionDescriptorType() {
        return new TransmissionDescriptorType();
    }

    /**
     * Create an instance of {@link TransmissionDescriptorListType }
     * 
     */
    public TransmissionDescriptorListType createTransmissionDescriptorListType() {
        return new TransmissionDescriptorListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransmissionDescriptorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/tmd/v1", name = "tmd")
    public JAXBElement<TransmissionDescriptorType> createTmd(TransmissionDescriptorType value) {
        return new JAXBElement<TransmissionDescriptorType>(_Tmd_QNAME, TransmissionDescriptorType.class, null, value);
    }

}
