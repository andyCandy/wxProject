
package org.tmforum.mtop.nra.xsd.epg.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nra.xsd.epg.v1 package. 
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

    private final static QName _Epgp_QNAME = new QName("http://www.tmforum.org/mtop/nra/xsd/epg/v1", "epgp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nra.xsd.epg.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EquipmentProtectionGroupType }
     * 
     */
    public EquipmentProtectionGroupType createEquipmentProtectionGroupType() {
        return new EquipmentProtectionGroupType();
    }

    /**
     * Create an instance of {@link EquipmentProtectionGroupListType }
     * 
     */
    public EquipmentProtectionGroupListType createEquipmentProtectionGroupListType() {
        return new EquipmentProtectionGroupListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentProtectionGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nra/xsd/epg/v1", name = "epgp")
    public JAXBElement<EquipmentProtectionGroupType> createEpgp(EquipmentProtectionGroupType value) {
        return new JAXBElement<EquipmentProtectionGroupType>(_Epgp_QNAME, EquipmentProtectionGroupType.class, null, value);
    }

}
