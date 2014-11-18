
package org.tmforum.mtop.nrf.xsd.mfdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AnyListType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersType;
import org.tmforum.mtop.nrf.xsd.com.v1.ConnectionDirectionType;
import org.tmforum.mtop.nrf.xsd.tpdata.v1.TerminationPointDataListType;


/**
 * <p>MatrixFlowDomainFragmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MatrixFlowDomainFragmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}ConnectionDirectionType" form="qualified"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}transmissionParameters" minOccurs="0"/>
 *         &lt;element name="aEndTpDataList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}TerminationPointDataListType" form="qualified"/>
 *         &lt;element name="zEndTpDataList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}TerminationPointDataListType" form="qualified"/>
 *         &lt;element name="isFlexible" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="mfdfrType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="vendorExtensions" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AnyListType" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixFlowDomainFragmentType", propOrder = {
    "direction",
    "transmissionParameters",
    "aEndTpDataList",
    "zEndTpDataList",
    "isFlexible",
    "isActive",
    "mfdfrType",
    "vendorExtensions"
})
public class MatrixFlowDomainFragmentType {

    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", required = true)
    @XmlSchemaType(name = "string")
    protected ConnectionDirectionType direction;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1")
    protected LayeredParametersType transmissionParameters;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", required = true)
    protected TerminationPointDataListType aEndTpDataList;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", required = true)
    protected TerminationPointDataListType zEndTpDataList;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1")
    protected boolean isFlexible;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1")
    protected boolean isActive;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", required = true)
    protected String mfdfrType;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", required = true)
    protected AnyListType vendorExtensions;

    /**
     * 获取direction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDirectionType }
     *     
     */
    public ConnectionDirectionType getDirection() {
        return direction;
    }

    /**
     * 设置direction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDirectionType }
     *     
     */
    public void setDirection(ConnectionDirectionType value) {
        this.direction = value;
    }

    /**
     * 获取transmissionParameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LayeredParametersType }
     *     
     */
    public LayeredParametersType getTransmissionParameters() {
        return transmissionParameters;
    }

    /**
     * 设置transmissionParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LayeredParametersType }
     *     
     */
    public void setTransmissionParameters(LayeredParametersType value) {
        this.transmissionParameters = value;
    }

    /**
     * 获取aEndTpDataList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointDataListType }
     *     
     */
    public TerminationPointDataListType getAEndTpDataList() {
        return aEndTpDataList;
    }

    /**
     * 设置aEndTpDataList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointDataListType }
     *     
     */
    public void setAEndTpDataList(TerminationPointDataListType value) {
        this.aEndTpDataList = value;
    }

    /**
     * 获取zEndTpDataList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointDataListType }
     *     
     */
    public TerminationPointDataListType getZEndTpDataList() {
        return zEndTpDataList;
    }

    /**
     * 设置zEndTpDataList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointDataListType }
     *     
     */
    public void setZEndTpDataList(TerminationPointDataListType value) {
        this.zEndTpDataList = value;
    }

    /**
     * 获取isFlexible属性的值。
     * 
     */
    public boolean isIsFlexible() {
        return isFlexible;
    }

    /**
     * 设置isFlexible属性的值。
     * 
     */
    public void setIsFlexible(boolean value) {
        this.isFlexible = value;
    }

    /**
     * 获取isActive属性的值。
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * 设置isActive属性的值。
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * 获取mfdfrType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfdfrType() {
        return mfdfrType;
    }

    /**
     * 设置mfdfrType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfdfrType(String value) {
        this.mfdfrType = value;
    }

    /**
     * 获取vendorExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnyListType }
     *     
     */
    public AnyListType getVendorExtensions() {
        return vendorExtensions;
    }

    /**
     * 设置vendorExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnyListType }
     *     
     */
    public void setVendorExtensions(AnyListType value) {
        this.vendorExtensions = value;
    }

}
