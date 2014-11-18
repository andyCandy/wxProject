
package org.tmforum.mtop.nrb.xsd.lp.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nrb.xsd.lp.v1 package. 
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

    private final static QName _TransmissionParametersList_QNAME = new QName("http://www.tmforum.org/mtop/nrb/xsd/lp/v1", "transmissionParametersList");
    private final static QName _TransmissionParameters_QNAME = new QName("http://www.tmforum.org/mtop/nrb/xsd/lp/v1", "transmissionParameters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nrb.xsd.lp.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LayeredParametersType }
     * 
     */
    public LayeredParametersType createLayeredParametersType() {
        return new LayeredParametersType();
    }

    /**
     * Create an instance of {@link LayeredParametersListType }
     * 
     */
    public LayeredParametersListType createLayeredParametersListType() {
        return new LayeredParametersListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayeredParametersListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1", name = "transmissionParametersList")
    public JAXBElement<LayeredParametersListType> createTransmissionParametersList(LayeredParametersListType value) {
        return new JAXBElement<LayeredParametersListType>(_TransmissionParametersList_QNAME, LayeredParametersListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayeredParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1", name = "transmissionParameters")
    public JAXBElement<LayeredParametersType> createTransmissionParameters(LayeredParametersType value) {
        return new JAXBElement<LayeredParametersType>(_TransmissionParameters_QNAME, LayeredParametersType.class, null, value);
    }

}
