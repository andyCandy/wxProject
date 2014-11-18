
package org.tmforum.mtop.nrf.xsd.tppool.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nrf.xsd.tppool.v1 package. 
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

    private final static QName _TpPool_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/tppool/v1", "tpPool");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nrf.xsd.tppool.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TerminationPointPoolType }
     * 
     */
    public TerminationPointPoolType createTerminationPointPoolType() {
        return new TerminationPointPoolType();
    }

    /**
     * Create an instance of {@link TerminationPointPoolListType }
     * 
     */
    public TerminationPointPoolListType createTerminationPointPoolListType() {
        return new TerminationPointPoolListType();
    }

    /**
     * Create an instance of {@link TerminationPointPoolType.ContainedMemberList }
     * 
     */
    public TerminationPointPoolType.ContainedMemberList createTerminationPointPoolTypeContainedMemberList() {
        return new TerminationPointPoolType.ContainedMemberList();
    }

    /**
     * Create an instance of {@link TerminationPointPoolType.MemberContainingMeList }
     * 
     */
    public TerminationPointPoolType.MemberContainingMeList createTerminationPointPoolTypeMemberContainingMeList() {
        return new TerminationPointPoolType.MemberContainingMeList();
    }

    /**
     * Create an instance of {@link TerminationPointPoolType.MemberContainingTpList }
     * 
     */
    public TerminationPointPoolType.MemberContainingTpList createTerminationPointPoolTypeMemberContainingTpList() {
        return new TerminationPointPoolType.MemberContainingTpList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminationPointPoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/tppool/v1", name = "tpPool")
    public JAXBElement<TerminationPointPoolType> createTpPool(TerminationPointPoolType value) {
        return new JAXBElement<TerminationPointPoolType>(_TpPool_QNAME, TerminationPointPoolType.class, null, value);
    }

}
