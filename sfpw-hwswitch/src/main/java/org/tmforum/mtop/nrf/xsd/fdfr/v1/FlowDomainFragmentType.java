
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.itu.v1.X721AdministrativeStateType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersType;
import org.tmforum.mtop.nrf.xsd.com.v1.ConnectionDirectionType;
import org.tmforum.mtop.nrf.xsd.com.v1.SubnetworkConnectionStateType;
import org.tmforum.mtop.nrf.xsd.tpdata.v1.TerminationPointDataListType;


/**
 * <p>FlowDomainFragmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlowDomainFragmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}ConnectionDirectionType"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}transmissionParameters" minOccurs="0"/>
 *         &lt;element name="aEndTpDataList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}TerminationPointDataListType"/>
 *         &lt;element name="zEndTpDataList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}TerminationPointDataListType"/>
 *         &lt;element name="isFlexible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="administrativeState" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}X721.AdministrativeStateType"/>
 *         &lt;element name="fdfrState" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}SubnetworkConnectionStateType"/>
 *         &lt;element name="fdfrType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hwVPLSExtensions" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}HWVPLSExtensionsType"/>
 *         &lt;element name="hwL3VPNExtensions" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}HWL3VPNExtensionsType"/>
 *         &lt;element name="hwL3VPNExtensionsList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}HWL3VPNExtensionsListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowDomainFragmentType", propOrder = {
    "direction",
    "transmissionParameters",
    "aEndTpDataList",
    "zEndTpDataList",
    "isFlexible",
    "administrativeState",
    "fdfrState",
    "fdfrType",
    "hwVPLSExtensions",
    "hwL3VPNExtensions",
    "hwL3VPNExtensionsList"
})
public class FlowDomainFragmentType
    extends CommonResourceInfoType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConnectionDirectionType direction;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1")
    protected LayeredParametersType transmissionParameters;
    @XmlElement(required = true)
    protected TerminationPointDataListType aEndTpDataList;
    @XmlElement(required = true)
    protected TerminationPointDataListType zEndTpDataList;
    protected boolean isFlexible;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected X721AdministrativeStateType administrativeState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SubnetworkConnectionStateType fdfrState;
    @XmlElement(required = true)
    protected String fdfrType;
    @XmlElement(required = true)
    protected HWVPLSExtensionsType hwVPLSExtensions;
    @XmlElement(required = true)
    protected HWL3VPNExtensionsType hwL3VPNExtensions;
    @XmlElement(required = true)
    protected HWL3VPNExtensionsListType hwL3VPNExtensionsList;

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
     * 获取administrativeState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link X721AdministrativeStateType }
     *     
     */
    public X721AdministrativeStateType getAdministrativeState() {
        return administrativeState;
    }

    /**
     * 设置administrativeState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link X721AdministrativeStateType }
     *     
     */
    public void setAdministrativeState(X721AdministrativeStateType value) {
        this.administrativeState = value;
    }

    /**
     * 获取fdfrState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubnetworkConnectionStateType }
     *     
     */
    public SubnetworkConnectionStateType getFdfrState() {
        return fdfrState;
    }

    /**
     * 设置fdfrState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubnetworkConnectionStateType }
     *     
     */
    public void setFdfrState(SubnetworkConnectionStateType value) {
        this.fdfrState = value;
    }

    /**
     * 获取fdfrType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdfrType() {
        return fdfrType;
    }

    /**
     * 设置fdfrType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdfrType(String value) {
        this.fdfrType = value;
    }

    /**
     * 获取hwVPLSExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HWVPLSExtensionsType }
     *     
     */
    public HWVPLSExtensionsType getHwVPLSExtensions() {
        return hwVPLSExtensions;
    }

    /**
     * 设置hwVPLSExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HWVPLSExtensionsType }
     *     
     */
    public void setHwVPLSExtensions(HWVPLSExtensionsType value) {
        this.hwVPLSExtensions = value;
    }

    /**
     * 获取hwL3VPNExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HWL3VPNExtensionsType }
     *     
     */
    public HWL3VPNExtensionsType getHwL3VPNExtensions() {
        return hwL3VPNExtensions;
    }

    /**
     * 设置hwL3VPNExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HWL3VPNExtensionsType }
     *     
     */
    public void setHwL3VPNExtensions(HWL3VPNExtensionsType value) {
        this.hwL3VPNExtensions = value;
    }

    /**
     * 获取hwL3VPNExtensionsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HWL3VPNExtensionsListType }
     *     
     */
    public HWL3VPNExtensionsListType getHwL3VPNExtensionsList() {
        return hwL3VPNExtensionsList;
    }

    /**
     * 设置hwL3VPNExtensionsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HWL3VPNExtensionsListType }
     *     
     */
    public void setHwL3VPNExtensionsList(HWL3VPNExtensionsListType value) {
        this.hwL3VPNExtensionsList = value;
    }

}
