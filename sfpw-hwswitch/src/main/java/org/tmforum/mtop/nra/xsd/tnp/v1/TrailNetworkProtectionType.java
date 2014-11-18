
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
 * <p>TrailNetworkProtectionType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡprotectionGroupType���Ե�ֵ��
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
     * ����protectionGroupType���Ե�ֵ��
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
     * ��ȡlayerRate���Ե�ֵ��
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
     * ����layerRate���Ե�ֵ��
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
     * ��ȡprotectionSchemeState���Ե�ֵ��
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
     * ����protectionSchemeState���Ե�ֵ��
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
     * ��ȡreversionMode���Ե�ֵ��
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
     * ����reversionMode���Ե�ֵ��
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
     * ��ȡpgARef���Ե�ֵ��
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
     * ����pgARef���Ե�ֵ��
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
     * ��ȡpgZRef���Ե�ֵ��
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
     * ����pgZRef���Ե�ֵ��
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
     * ��ȡtrailNtwProtectionType���Ե�ֵ��
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
     * ����trailNtwProtectionType���Ե�ֵ��
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
     * ��ȡpgATpRefList���Ե�ֵ��
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
     * ����pgATpRefList���Ե�ֵ��
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
     * ��ȡpgZTpRefList���Ե�ֵ��
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
     * ����pgZTpRefList���Ե�ֵ��
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
     * ��ȡworkerTrailRefList���Ե�ֵ��
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
     * ����workerTrailRefList���Ե�ֵ��
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
     * ��ȡprotectionTrailRefList���Ե�ֵ��
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
     * ����protectionTrailRefList���Ե�ֵ��
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
     * ��ȡtnpParameterList���Ե�ֵ��
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
     * ����tnpParameterList���Ե�ֵ��
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
     * ��ȡapsProtocolType���Ե�ֵ��
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
     * ����apsProtocolType���Ե�ֵ��
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
     * ��ȡasapRef���Ե�ֵ��
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
     * ����asapRef���Ե�ֵ��
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
