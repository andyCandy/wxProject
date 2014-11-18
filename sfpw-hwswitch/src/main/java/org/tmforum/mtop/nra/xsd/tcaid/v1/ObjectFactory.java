
package org.tmforum.mtop.nra.xsd.tcaid.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nra.xsd.tcaid.v1 package. 
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

    private final static QName _TcaId_QNAME = new QName("http://www.tmforum.org/mtop/nra/xsd/tcaid/v1", "tcaId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nra.xsd.tcaid.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TcaIdType }
     * 
     */
    public TcaIdType createTcaIdType() {
        return new TcaIdType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TcaIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nra/xsd/tcaid/v1", name = "tcaId")
    public JAXBElement<TcaIdType> createTcaId(TcaIdType value) {
        return new JAXBElement<TcaIdType>(_TcaId_QNAME, TcaIdType.class, null, value);
    }

}
