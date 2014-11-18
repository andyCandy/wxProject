
package org.tmforum.mtop.nrf.xsd.mfdfr.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nrf.xsd.mfdfr.v1 package. 
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

    private final static QName _HwMFdfrExtendsionCreateData_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", "hwMFdfrExtendsionCreateData");
    private final static QName _ShgCreateData_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", "shgCreateData");
    private final static QName _StaticMACAddressType_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", "staticMACAddressType");
    private final static QName _ShgType_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", "shgType");
    private final static QName _HwMFdfrExtendsion_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", "hwMFdfrExtendsion");
    private final static QName _Mfdfr_QNAME = new QName("http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", "mfdfr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nrf.xsd.mfdfr.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SHGType }
     * 
     */
    public SHGType createSHGType() {
        return new SHGType();
    }

    /**
     * Create an instance of {@link HWMFdfrExtendsionType }
     * 
     */
    public HWMFdfrExtendsionType createHWMFdfrExtendsionType() {
        return new HWMFdfrExtendsionType();
    }

    /**
     * Create an instance of {@link StaticMACAddressType }
     * 
     */
    public StaticMACAddressType createStaticMACAddressType() {
        return new StaticMACAddressType();
    }

    /**
     * Create an instance of {@link SHGCreateDataType }
     * 
     */
    public SHGCreateDataType createSHGCreateDataType() {
        return new SHGCreateDataType();
    }

    /**
     * Create an instance of {@link HWMFdfrExtendsionCreateDataType }
     * 
     */
    public HWMFdfrExtendsionCreateDataType createHWMFdfrExtendsionCreateDataType() {
        return new HWMFdfrExtendsionCreateDataType();
    }

    /**
     * Create an instance of {@link MatrixFlowDomainFragmentType }
     * 
     */
    public MatrixFlowDomainFragmentType createMatrixFlowDomainFragmentType() {
        return new MatrixFlowDomainFragmentType();
    }

    /**
     * Create an instance of {@link HWMFdfrExtendsionCommonDataType }
     * 
     */
    public HWMFdfrExtendsionCommonDataType createHWMFdfrExtendsionCommonDataType() {
        return new HWMFdfrExtendsionCommonDataType();
    }

    /**
     * Create an instance of {@link SHGCreateDataListType }
     * 
     */
    public SHGCreateDataListType createSHGCreateDataListType() {
        return new SHGCreateDataListType();
    }

    /**
     * Create an instance of {@link SHGListType }
     * 
     */
    public SHGListType createSHGListType() {
        return new SHGListType();
    }

    /**
     * Create an instance of {@link MatrixFlowDomainFragmentListType }
     * 
     */
    public MatrixFlowDomainFragmentListType createMatrixFlowDomainFragmentListType() {
        return new MatrixFlowDomainFragmentListType();
    }

    /**
     * Create an instance of {@link StaticMACAddressListType }
     * 
     */
    public StaticMACAddressListType createStaticMACAddressListType() {
        return new StaticMACAddressListType();
    }

    /**
     * Create an instance of {@link HWMFdfrExtendsionDataType }
     * 
     */
    public HWMFdfrExtendsionDataType createHWMFdfrExtendsionDataType() {
        return new HWMFdfrExtendsionDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HWMFdfrExtendsionCreateDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", name = "hwMFdfrExtendsionCreateData")
    public JAXBElement<HWMFdfrExtendsionCreateDataType> createHwMFdfrExtendsionCreateData(HWMFdfrExtendsionCreateDataType value) {
        return new JAXBElement<HWMFdfrExtendsionCreateDataType>(_HwMFdfrExtendsionCreateData_QNAME, HWMFdfrExtendsionCreateDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHGCreateDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", name = "shgCreateData")
    public JAXBElement<SHGCreateDataType> createShgCreateData(SHGCreateDataType value) {
        return new JAXBElement<SHGCreateDataType>(_ShgCreateData_QNAME, SHGCreateDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaticMACAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", name = "staticMACAddressType")
    public JAXBElement<StaticMACAddressType> createStaticMACAddressType(StaticMACAddressType value) {
        return new JAXBElement<StaticMACAddressType>(_StaticMACAddressType_QNAME, StaticMACAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHGType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", name = "shgType")
    public JAXBElement<SHGType> createShgType(SHGType value) {
        return new JAXBElement<SHGType>(_ShgType_QNAME, SHGType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HWMFdfrExtendsionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", name = "hwMFdfrExtendsion")
    public JAXBElement<HWMFdfrExtendsionType> createHwMFdfrExtendsion(HWMFdfrExtendsionType value) {
        return new JAXBElement<HWMFdfrExtendsionType>(_HwMFdfrExtendsion_QNAME, HWMFdfrExtendsionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixFlowDomainFragmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", name = "mfdfr")
    public JAXBElement<MatrixFlowDomainFragmentType> createMfdfr(MatrixFlowDomainFragmentType value) {
        return new JAXBElement<MatrixFlowDomainFragmentType>(_Mfdfr_QNAME, MatrixFlowDomainFragmentType.class, null, value);
    }

}
