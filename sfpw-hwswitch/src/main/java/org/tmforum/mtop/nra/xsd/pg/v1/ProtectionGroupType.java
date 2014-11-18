
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
 * <p>ProtectionGroupType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtype���Ե�ֵ��
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
     * ����type���Ե�ֵ��
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
     * ��ȡparameterList���Ե�ֵ��
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
     * ����parameterList���Ե�ֵ��
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
     * ��ȡprotectionRelatedTpRefList���Ե�ֵ��
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
     * ����protectionRelatedTpRefList���Ե�ֵ��
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
