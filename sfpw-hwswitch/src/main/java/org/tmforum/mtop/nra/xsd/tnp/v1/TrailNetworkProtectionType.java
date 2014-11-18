
package org.tmforum.mtop.nra.xsd.tnp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nra.xsd.com.v1.G7743APSfunctionType;
import org.tmforum.mtop.nra.xsd.com.v1.ProtectionGroupTypeType;
import org.tmforum.mtop.nra.xsd.com.v1.ReversionModeType;
import org.tmforum.mtop.nra.xsd.pgp.v1.ProtectionGroupParameterListType;
import org.tmforum.mtop.nrb.xsd.com.v1.ProtectionSchemeStateType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateType;


/**
 * <p>TrailNetworkProtectionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrailNetworkProtectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="protectionGroupType" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}ProtectionGroupTypeType"/>
 *         &lt;element name="layerRate" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateType"/>
 *         &lt;element name="protectionSchemeState" type="{http://www.tmforum.org/mtop/nrb/xsd/com/v1}ProtectionSchemeStateType"/>
 *         &lt;element name="reversionMode" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}ReversionModeType"/>
 *         &lt;element name="pgARef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="pgZRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="trailNtwProtectionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pgATpRefList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *         &lt;element name="pgZTpRefList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *         &lt;element name="workerTrailRefList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *         &lt;element name="protectionTrailRefList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *         &lt;element name="tnpParameterList" type="{http://www.tmforum.org/mtop/nra/xsd/pgp/v1}ProtectionGroupParameterListType"/>
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
@XmlType(name = "TrailNetworkProtectionType", propOrder = {
    "protectionGroupType",
    "layerRate",
    "protectionSchemeState",
    "reversionMode",
    "pgARef",
    "pgZRef",
    "trailNtwProtectionType",
    "pgATpRefList",
    "pgZTpRefList",
    "workerTrailRefList",
    "protectionTrailRefList",
    "tnpParameterList",
    "apsProtocolType",
    "asapRef"
})
public class TrailNetworkProtectionType
    extends CommonResourceInfoType
{

    @XmlElement(required = true)
    protected ProtectionGroupTypeType protectionGroupType;
    @XmlElement(required = true)
    protected LayerRateType layerRate;
    @XmlElement(required = true)
    protected ProtectionSchemeStateType protectionSchemeState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ReversionModeType reversionMode;
    @XmlElement(required = true)
    protected NamingAttributeType pgARef;
    @XmlElement(required = true)
    protected NamingAttributeType pgZRef;
    @XmlElement(required = true)
    protected String trailNtwProtectionType;
    @XmlElement(required = true)
    protected NamingAttributeListType pgATpRefList;
    @XmlElement(required = true)
    protected NamingAttributeListType pgZTpRefList;
    @XmlElement(required = true)
    protected NamingAttributeListType workerTrailRefList;
    @XmlElement(required = true)
    protected NamingAttributeListType protectionTrailRefList;
    @XmlElement(required = true)
    protected ProtectionGroupParameterListType tnpParameterList;
    @XmlElement(required = true)
    protected G7743APSfunctionType apsProtocolType;
    @XmlElement(required = true)
    protected String asapRef;

    /**
     * 获取protectionGroupType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProtectionGroupTypeType }
     *     
     */
    public ProtectionGroupTypeType getProtectionGroupType() {
        return protectionGroupType;
    }

    /**
     * 设置protectionGroupType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionGroupTypeType }
     *     
     */
    public void setProtectionGroupType(ProtectionGroupTypeType value) {
        this.protectionGroupType = value;
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
     * 获取pgARef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getPgARef() {
        return pgARef;
    }

    /**
     * 设置pgARef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setPgARef(NamingAttributeType value) {
        this.pgARef = value;
    }

    /**
     * 获取pgZRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getPgZRef() {
        return pgZRef;
    }

    /**
     * 设置pgZRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setPgZRef(NamingAttributeType value) {
        this.pgZRef = value;
    }

    /**
     * 获取trailNtwProtectionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailNtwProtectionType() {
        return trailNtwProtectionType;
    }

    /**
     * 设置trailNtwProtectionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailNtwProtectionType(String value) {
        this.trailNtwProtectionType = value;
    }

    /**
     * 获取pgATpRefList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getPgATpRefList() {
        return pgATpRefList;
    }

    /**
     * 设置pgATpRefList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setPgATpRefList(NamingAttributeListType value) {
        this.pgATpRefList = value;
    }

    /**
     * 获取pgZTpRefList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getPgZTpRefList() {
        return pgZTpRefList;
    }

    /**
     * 设置pgZTpRefList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setPgZTpRefList(NamingAttributeListType value) {
        this.pgZTpRefList = value;
    }

    /**
     * 获取workerTrailRefList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getWorkerTrailRefList() {
        return workerTrailRefList;
    }

    /**
     * 设置workerTrailRefList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setWorkerTrailRefList(NamingAttributeListType value) {
        this.workerTrailRefList = value;
    }

    /**
     * 获取protectionTrailRefList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getProtectionTrailRefList() {
        return protectionTrailRefList;
    }

    /**
     * 设置protectionTrailRefList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setProtectionTrailRefList(NamingAttributeListType value) {
        this.protectionTrailRefList = value;
    }

    /**
     * 获取tnpParameterList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProtectionGroupParameterListType }
     *     
     */
    public ProtectionGroupParameterListType getTnpParameterList() {
        return tnpParameterList;
    }

    /**
     * 设置tnpParameterList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionGroupParameterListType }
     *     
     */
    public void setTnpParameterList(ProtectionGroupParameterListType value) {
        this.tnpParameterList = value;
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
