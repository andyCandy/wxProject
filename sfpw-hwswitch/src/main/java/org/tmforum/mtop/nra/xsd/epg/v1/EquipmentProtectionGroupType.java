
package org.tmforum.mtop.nra.xsd.epg.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;
import org.tmforum.mtop.nra.xsd.com.v1.EquipmentProtectionGroupTypeType;
import org.tmforum.mtop.nra.xsd.com.v1.ReversionModeType;
import org.tmforum.mtop.nra.xsd.pgp.v1.ProtectionGroupParameterListType;
import org.tmforum.mtop.nrb.xsd.com.v1.ProtectionSchemeStateType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;


/**
 * <p>EquipmentProtectionGroupType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EquipmentProtectionGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}EquipmentProtectionGroupTypeType"/>
 *         &lt;element name="protectionSchemeState" type="{http://www.tmforum.org/mtop/nrb/xsd/com/v1}ProtectionSchemeStateType"/>
 *         &lt;element name="reversionMode" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}ReversionModeType"/>
 *         &lt;element name="parameterList" type="{http://www.tmforum.org/mtop/nra/xsd/pgp/v1}ProtectionGroupParameterListType"/>
 *         &lt;element name="protectedEquipmentRefList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *         &lt;element name="protectingEquipmentRefList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
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
@XmlType(name = "EquipmentProtectionGroupType", propOrder = {
    "type",
    "protectionSchemeState",
    "reversionMode",
    "parameterList",
    "protectedEquipmentRefList",
    "protectingEquipmentRefList",
    "asapRef"
})
public class EquipmentProtectionGroupType
    extends CommonResourceInfoType
{

    @XmlElement(required = true)
    protected EquipmentProtectionGroupTypeType type;
    @XmlElement(required = true)
    protected ProtectionSchemeStateType protectionSchemeState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ReversionModeType reversionMode;
    @XmlElement(required = true)
    protected ProtectionGroupParameterListType parameterList;
    @XmlElement(required = true)
    protected NamingAttributeListType protectedEquipmentRefList;
    @XmlElement(required = true)
    protected NamingAttributeListType protectingEquipmentRefList;
    @XmlElement(required = true)
    protected String asapRef;

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EquipmentProtectionGroupTypeType }
     *     
     */
    public EquipmentProtectionGroupTypeType getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentProtectionGroupTypeType }
     *     
     */
    public void setType(EquipmentProtectionGroupTypeType value) {
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
     * ��ȡprotectedEquipmentRefList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getProtectedEquipmentRefList() {
        return protectedEquipmentRefList;
    }

    /**
     * ����protectedEquipmentRefList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setProtectedEquipmentRefList(NamingAttributeListType value) {
        this.protectedEquipmentRefList = value;
    }

    /**
     * ��ȡprotectingEquipmentRefList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getProtectingEquipmentRefList() {
        return protectingEquipmentRefList;
    }

    /**
     * ����protectingEquipmentRefList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setProtectingEquipmentRefList(NamingAttributeListType value) {
        this.protectingEquipmentRefList = value;
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
