
package org.tmforum.mtop.nrf.xsd.snc.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nrf.xsd.snc.v1 package. 
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

    private final static QName _Ep_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/snc/v1", "ep");
    private final static QName _TnlPolicy_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/snc/v1", "tnlPolicy");
    private final static QName _Snc_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/snc/v1", "snc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nrf.xsd.snc.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubnetworkConnectionType }
     * 
     */
    public SubnetworkConnectionType createSubnetworkConnectionType() {
        return new SubnetworkConnectionType();
    }

    /**
     * Create an instance of {@link ExplicitPathType }
     * 
     */
    public ExplicitPathType createExplicitPathType() {
        return new ExplicitPathType();
    }

    /**
     * Create an instance of {@link TunnelPolicyType }
     * 
     */
    public TunnelPolicyType createTunnelPolicyType() {
        return new TunnelPolicyType();
    }

    /**
     * Create an instance of {@link TunnelPolicyListType }
     * 
     */
    public TunnelPolicyListType createTunnelPolicyListType() {
        return new TunnelPolicyListType();
    }

    /**
     * Create an instance of {@link SubnetworkConnectionListType }
     * 
     */
    public SubnetworkConnectionListType createSubnetworkConnectionListType() {
        return new SubnetworkConnectionListType();
    }

    /**
     * Create an instance of {@link ExplicitPathHopType }
     * 
     */
    public ExplicitPathHopType createExplicitPathHopType() {
        return new ExplicitPathHopType();
    }

    /**
     * Create an instance of {@link ExplicitPathListType }
     * 
     */
    public ExplicitPathListType createExplicitPathListType() {
        return new ExplicitPathListType();
    }

    /**
     * Create an instance of {@link SubnetworkConnectionType.AEndPointsRole }
     * 
     */
    public SubnetworkConnectionType.AEndPointsRole createSubnetworkConnectionTypeAEndPointsRole() {
        return new SubnetworkConnectionType.AEndPointsRole();
    }

    /**
     * Create an instance of {@link SubnetworkConnectionType.ZEndPointsRole }
     * 
     */
    public SubnetworkConnectionType.ZEndPointsRole createSubnetworkConnectionTypeZEndPointsRole() {
        return new SubnetworkConnectionType.ZEndPointsRole();
    }

    /**
     * Create an instance of {@link ExplicitPathType.EpHopList }
     * 
     */
    public ExplicitPathType.EpHopList createExplicitPathTypeEpHopList() {
        return new ExplicitPathType.EpHopList();
    }

    /**
     * Create an instance of {@link TunnelPolicyType.BindingList }
     * 
     */
    public TunnelPolicyType.BindingList createTunnelPolicyTypeBindingList() {
        return new TunnelPolicyType.BindingList();
    }

    /**
     * Create an instance of {@link TunnelPolicyType.SelectSequence }
     * 
     */
    public TunnelPolicyType.SelectSequence createTunnelPolicyTypeSelectSequence() {
        return new TunnelPolicyType.SelectSequence();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExplicitPathType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/snc/v1", name = "ep")
    public JAXBElement<ExplicitPathType> createEp(ExplicitPathType value) {
        return new JAXBElement<ExplicitPathType>(_Ep_QNAME, ExplicitPathType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TunnelPolicyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/snc/v1", name = "tnlPolicy")
    public JAXBElement<TunnelPolicyType> createTnlPolicy(TunnelPolicyType value) {
        return new JAXBElement<TunnelPolicyType>(_TnlPolicy_QNAME, TunnelPolicyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubnetworkConnectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/snc/v1", name = "snc")
    public JAXBElement<SubnetworkConnectionType> createSnc(SubnetworkConnectionType value) {
        return new JAXBElement<SubnetworkConnectionType>(_Snc_QNAME, SubnetworkConnectionType.class, null, value);
    }

}
