
package org.tmforum.mtop.nra.xsd.atcaid.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nra.xsd.atcaid.v1 package. 
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

    private final static QName _AlarmOrTcaId_QNAME = new QName("http://www.tmforum.org/mtop/nra/xsd/atcaid/v1", "alarmOrTcaId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nra.xsd.atcaid.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlarmOrTcaIdType }
     * 
     */
    public AlarmOrTcaIdType createAlarmOrTcaIdType() {
        return new AlarmOrTcaIdType();
    }

    /**
     * Create an instance of {@link AlarmOrTcaIdListType }
     * 
     */
    public AlarmOrTcaIdListType createAlarmOrTcaIdListType() {
        return new AlarmOrTcaIdListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlarmOrTcaIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nra/xsd/atcaid/v1", name = "alarmOrTcaId")
    public JAXBElement<AlarmOrTcaIdType> createAlarmOrTcaId(AlarmOrTcaIdType value) {
        return new JAXBElement<AlarmOrTcaIdType>(_AlarmOrTcaId_QNAME, AlarmOrTcaIdType.class, null, value);
    }

}
