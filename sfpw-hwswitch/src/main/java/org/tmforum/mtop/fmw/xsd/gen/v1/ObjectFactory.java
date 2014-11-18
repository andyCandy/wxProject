
package org.tmforum.mtop.fmw.xsd.gen.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.fmw.xsd.gen.v1 package. 
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

    private final static QName _NvsList_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/gen/v1", "nvsList");
    private final static QName _AliasNameList_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/gen/v1", "aliasNameList");
    private final static QName _NameAndStringValueType_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/gen/v1", "nameAndStringValueType");
    private final static QName _NvList_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/gen/v1", "nvList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.fmw.xsd.gen.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AliasNameListType }
     * 
     */
    public AliasNameListType createAliasNameListType() {
        return new AliasNameListType();
    }

    /**
     * Create an instance of {@link AnyListType }
     * 
     */
    public AnyListType createAnyListType() {
        return new AnyListType();
    }

    /**
     * Create an instance of {@link AdditionalInfo }
     * 
     */
    public AdditionalInfo createAdditionalInfo() {
        return new AdditionalInfo();
    }

    /**
     * Create an instance of {@link NameAndStringValueType }
     * 
     */
    public NameAndStringValueType createNameAndStringValueType() {
        return new NameAndStringValueType();
    }

    /**
     * Create an instance of {@link NameAndValueStringListType }
     * 
     */
    public NameAndValueStringListType createNameAndValueStringListType() {
        return new NameAndValueStringListType();
    }

    /**
     * Create an instance of {@link NameAndAnyValueListType }
     * 
     */
    public NameAndAnyValueListType createNameAndAnyValueListType() {
        return new NameAndAnyValueListType();
    }

    /**
     * Create an instance of {@link MultiEventInventoryAttributesType }
     * 
     */
    public MultiEventInventoryAttributesType createMultiEventInventoryAttributesType() {
        return new MultiEventInventoryAttributesType();
    }

    /**
     * Create an instance of {@link NotificationIdentifierListType }
     * 
     */
    public NotificationIdentifierListType createNotificationIdentifierListType() {
        return new NotificationIdentifierListType();
    }

    /**
     * Create an instance of {@link NameAndAnyValueType }
     * 
     */
    public NameAndAnyValueType createNameAndAnyValueType() {
        return new NameAndAnyValueType();
    }

    /**
     * Create an instance of {@link QueryExpressionType }
     * 
     */
    public QueryExpressionType createQueryExpressionType() {
        return new QueryExpressionType();
    }

    /**
     * Create an instance of {@link AliasNameListType.Alias }
     * 
     */
    public AliasNameListType.Alias createAliasNameListTypeAlias() {
        return new AliasNameListType.Alias();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameAndValueStringListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/gen/v1", name = "nvsList")
    public JAXBElement<NameAndValueStringListType> createNvsList(NameAndValueStringListType value) {
        return new JAXBElement<NameAndValueStringListType>(_NvsList_QNAME, NameAndValueStringListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AliasNameListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/gen/v1", name = "aliasNameList")
    public JAXBElement<AliasNameListType> createAliasNameList(AliasNameListType value) {
        return new JAXBElement<AliasNameListType>(_AliasNameList_QNAME, AliasNameListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameAndStringValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/gen/v1", name = "nameAndStringValueType")
    public JAXBElement<NameAndStringValueType> createNameAndStringValueType(NameAndStringValueType value) {
        return new JAXBElement<NameAndStringValueType>(_NameAndStringValueType_QNAME, NameAndStringValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameAndAnyValueListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/gen/v1", name = "nvList")
    public JAXBElement<NameAndAnyValueListType> createNvList(NameAndAnyValueListType value) {
        return new JAXBElement<NameAndAnyValueListType>(_NvList_QNAME, NameAndAnyValueListType.class, null, value);
    }

}
