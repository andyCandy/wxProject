
package org.tmforum.mtop.nra.xsd.pg.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nra.xsd.pg.v1 package. 
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

    private final static QName _Pg_QNAME = new QName("http://www.tmforum.org/mtop/nra/xsd/pg/v1", "pg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nra.xsd.pg.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProtectionGroupType }
     * 
     */
    public ProtectionGroupType createProtectionGroupType() {
        return new ProtectionGroupType();
    }

    /**
     * Create an instance of {@link ProtectionGroupListType }
     * 
     */
    public ProtectionGroupListType createProtectionGroupListType() {
        return new ProtectionGroupListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtectionGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nra/xsd/pg/v1", name = "pg")
    public JAXBElement<ProtectionGroupType> createPg(ProtectionGroupType value) {
        return new JAXBElement<ProtectionGroupType>(_Pg_QNAME, ProtectionGroupType.class, null, value);
    }

}
