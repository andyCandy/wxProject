
package org.tmforum.mtop.nrf.xsd.eh.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrf.xsd.com.v1.EquipmentHolderTypeType;
import org.tmforum.mtop.nrf.xsd.com.v1.HolderStateType;


/**
 * <p>EquipmentHolderType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EquipmentHolderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="isReportingAlarms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="holderType" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}EquipmentHolderTypeType"/>
 *         &lt;element name="acceptableEquipmentTypeList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="acceptableEquipmentType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="expectedOrInstalledEquipmentRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="holderState" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}HolderStateType"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manufactureDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="asapRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentHolderType", propOrder = {
    "isReportingAlarms",
    "holderType",
    "acceptableEquipmentTypeList",
    "expectedOrInstalledEquipmentRef",
    "holderState",
    "location",
    "manufacturer",
    "manufactureDate",
    "asapRef"
})
public class EquipmentHolderType
    extends CommonResourceInfoType
{

    protected boolean isReportingAlarms;
    @XmlElement(required = true)
    protected EquipmentHolderTypeType holderType;
    @XmlElement(required = true)
    protected EquipmentHolderType.AcceptableEquipmentTypeList acceptableEquipmentTypeList;
    @XmlElement(required = true)
    protected NamingAttributeType expectedOrInstalledEquipmentRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HolderStateType holderState;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String manufacturer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object manufactureDate;
    @XmlElement(required = true)
    protected NamingAttributeType asapRef;

    /**
     * ��ȡisReportingAlarms���Ե�ֵ��
     * 
     */
    public boolean isIsReportingAlarms() {
        return isReportingAlarms;
    }

    /**
     * ����isReportingAlarms���Ե�ֵ��
     * 
     */
    public void setIsReportingAlarms(boolean value) {
        this.isReportingAlarms = value;
    }

    /**
     * ��ȡholderType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EquipmentHolderTypeType }
     *     
     */
    public EquipmentHolderTypeType getHolderType() {
        return holderType;
    }

    /**
     * ����holderType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentHolderTypeType }
     *     
     */
    public void setHolderType(EquipmentHolderTypeType value) {
        this.holderType = value;
    }

    /**
     * ��ȡacceptableEquipmentTypeList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EquipmentHolderType.AcceptableEquipmentTypeList }
     *     
     */
    public EquipmentHolderType.AcceptableEquipmentTypeList getAcceptableEquipmentTypeList() {
        return acceptableEquipmentTypeList;
    }

    /**
     * ����acceptableEquipmentTypeList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentHolderType.AcceptableEquipmentTypeList }
     *     
     */
    public void setAcceptableEquipmentTypeList(EquipmentHolderType.AcceptableEquipmentTypeList value) {
        this.acceptableEquipmentTypeList = value;
    }

    /**
     * ��ȡexpectedOrInstalledEquipmentRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getExpectedOrInstalledEquipmentRef() {
        return expectedOrInstalledEquipmentRef;
    }

    /**
     * ����expectedOrInstalledEquipmentRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setExpectedOrInstalledEquipmentRef(NamingAttributeType value) {
        this.expectedOrInstalledEquipmentRef = value;
    }

    /**
     * ��ȡholderState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HolderStateType }
     *     
     */
    public HolderStateType getHolderState() {
        return holderState;
    }

    /**
     * ����holderState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HolderStateType }
     *     
     */
    public void setHolderState(HolderStateType value) {
        this.holderState = value;
    }

    /**
     * ��ȡlocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * ��ȡmanufacturer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * ����manufacturer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * ��ȡmanufactureDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getManufactureDate() {
        return manufactureDate;
    }

    /**
     * ����manufactureDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setManufactureDate(Object value) {
        this.manufactureDate = value;
    }

    /**
     * ��ȡasapRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getAsapRef() {
        return asapRef;
    }

    /**
     * ����asapRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setAsapRef(NamingAttributeType value) {
        this.asapRef = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="acceptableEquipmentType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acceptableEquipmentType"
    })
    public static class AcceptableEquipmentTypeList {

        @XmlElement(required = true)
        protected List<String> acceptableEquipmentType;

        /**
         * Gets the value of the acceptableEquipmentType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acceptableEquipmentType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcceptableEquipmentType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAcceptableEquipmentType() {
            if (acceptableEquipmentType == null) {
                acceptableEquipmentType = new ArrayList<String>();
            }
            return this.acceptableEquipmentType;
        }

    }

}
