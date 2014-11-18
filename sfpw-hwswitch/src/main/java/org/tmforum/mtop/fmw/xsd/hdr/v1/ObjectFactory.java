
package org.tmforum.mtop.fmw.xsd.hdr.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.fmw.xsd.hdr.v1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.fmw.xsd.hdr.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Header.MsgSpecificProperties }
     * 
     */
    public Header.MsgSpecificProperties createHeaderMsgSpecificProperties() {
        return new Header.MsgSpecificProperties();
    }

    /**
     * Create an instance of {@link ActivityStatusType }
     * 
     */
    public ActivityStatusType createActivityStatusType() {
        return new ActivityStatusType();
    }

    /**
     * Create an instance of {@link CompressionTypeType }
     * 
     */
    public CompressionTypeType createCompressionTypeType() {
        return new CompressionTypeType();
    }

    /**
     * Create an instance of {@link PackingTypeType }
     * 
     */
    public PackingTypeType createPackingTypeType() {
        return new PackingTypeType();
    }

    /**
     * Create an instance of {@link Header.MsgSpecificProperties.Property }
     * 
     */
    public Header.MsgSpecificProperties.Property createHeaderMsgSpecificPropertiesProperty() {
        return new Header.MsgSpecificProperties.Property();
    }

}
