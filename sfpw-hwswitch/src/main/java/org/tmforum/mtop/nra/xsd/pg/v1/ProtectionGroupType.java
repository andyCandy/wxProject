
package org.tmforum.mtop.nra.xsd.pg.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;
import org.tmforum.mtop.nra.xsd.com.v1.G7743APSfunctionType;
import org.tmforum.mtop.nra.xsd.com.v1.ProtectionGroupTypeType;
import org.tmforum.mtop.nra.xsd.com.v1.ReversionModeType;
import org.tmforum.mtop.nra.xsd.pgp.v1.ProtectionGroupParameterListType;
import org.tmforum.mtop.nrb.xsd.com.v1.ProtectionSchemeStateType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateType;


/**
 * <p>ProtectionGroupType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProtectionGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}ProtectionGroupTypeType"/>
 *         &lt;element name="protectionSchemeState" type="{http://www.tmforum.org/mtop/nrb/xsd/com/v1}ProtectionSchemeStateType"/>
 *         &lt;element name="reversionMode" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}ReversionModeType"/>
 *         &lt;element name="layerRate" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateType"/>
 *         &lt;element name="parameterList" type="{http://www.tmforum.org/mtop/nra/xsd/pgp/v1}ProtectionGroupParameterListType"/>
 *         &lt;element name="protectionRelatedTpRefList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *         &lt;element name="apsProtocolType" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}G_774_3_APSfunctionType"/>
 *         &lt;element name="asapRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionGroupType", propOrder = {
    "type",
    "protectionSchemeState",
    "reversionMode",
    "layerRate",
    "parameterList",
    "protectionRelatedTpRefList",
    "apsProtocolType",
    "asapRef"
})
public class ProtectionGroupType
    extends CommonResourceInfoType
{

    @XmlElement(required = true)
    protected ProtectionGroupTypeType type;
    @XmlElement(required = true)
    protected ProtectionSchemeStateType protectionSchemeState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ReversionModeType reversionMode;
    @XmlElement(required = true)
    protected LayerRateType layerRate;
    @XmlElement(required = true)
    protected ProtectionGroupParameterListType parameterList;
    @XmlElement(required = true)
    protected NamingAttributeListType protectionRelatedTpRefList;
    @XmlElement(required = true)
    protected G7743APSfunctionType apsProtocolType;
    @XmlElement(required = true)
    protected String asapRef;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProtectionGroupTypeType }
     *     
     */
    public ProtectionGroupTypeType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionGroupTypeType }
     *     
     */
    public void setType(ProtectionGroupTypeType value) {
        this.type = value;
    }

    /**
     * 获取protectionSchemeState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProtectionSchemeStateType }
     *     
     */
    public ProtectionSchemeStateType getProtectionSchemeState() {
        return protectionSchemeState;
    }

    /**
     * 设置protectionSchemeState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionSchemeStateType }
     *     
     */
    public void setProtectionSchemeState(ProtectionSchemeStateType value) {
        this.protectionSchemeState = value;
    }

    /**
     * 获取reversionMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReversionModeType }
     *     
     */
    public ReversionModeType getReversionMode() {
        return reversionMode;
    }

    /**
     * 设置reversionMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReversionModeType }
     *     
     */
    public void setReversionMode(ReversionModeType value) {
        this.reversionMode = value;
    }

    /**
     * 获取layerRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LayerRateType }
     *     
     */
    public LayerRateType getLayerRate() {
        return layerRate;
    }

    /**
     * 设置layerRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateType }
     *     
     */
    public void setLayerRate(LayerRateType value) {
        this.layerRate = value;
    }

    /**
     * 获取parameterList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProtectionGroupParameterListType }
     *     
     */
    public ProtectionGroupParameterListType getParameterList() {
        return parameterList;
    }

    /**
     * 设置parameterList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionGroupParameterListType }
     *     
     */
    public void setParameterList(ProtectionGroupParameterListType value) {
        this.parameterList = value;
    }

    /**
     * 获取protectionRelatedTpRefList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getProtectionRelatedTpRefList() {
        return protectionRelatedTpRefList;
    }

    /**
     * 设置protectionRelatedTpRefList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setProtectionRelatedTpRefList(NamingAttributeListType value) {
        this.protectionRelatedTpRefList = value;
    }

    /**
     * 获取apsProtocolType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link G7743APSfunctionType }
     *     
     */
    public G7743APSfunctionType getApsProtocolType() {
        return apsProtocolType;
    }

    /**
     * 设置apsProtocolType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link G7743APSfunctionType }
     *     
     */
    public void setApsProtocolType(G7743APSfunctionType value) {
        this.apsProtocolType = value;
    }

    /**
     * 获取asapRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsapRef() {
        return asapRef;
    }

    /**
     * 设置asapRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsapRef(String value) {
        this.asapRef = value;
    }

}
