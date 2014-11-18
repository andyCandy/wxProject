
package org.tmforum.mtop.nrf.xsd.mfdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>StaticMACAddressType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StaticMACAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staticMACType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="macAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="peVID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ceVID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tpName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticMACAddressType", propOrder = {
    "staticMACType",
    "macAddress",
    "peVID",
    "ceVID",
    "tpName",
    "action"
})
public class StaticMACAddressType {

    @XmlElement(required = true)
    protected String staticMACType;
    @XmlElement(required = true)
    protected String macAddress;
    @XmlElement(required = true)
    protected String peVID;
    @XmlElement(required = true)
    protected String ceVID;
    @XmlElement(required = true)
    protected NamingAttributeType tpName;
    @XmlElement(required = true)
    protected String action;

    /**
     * ��ȡstaticMACType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaticMACType() {
        return staticMACType;
    }

    /**
     * ����staticMACType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaticMACType(String value) {
        this.staticMACType = value;
    }

    /**
     * ��ȡmacAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * ����macAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * ��ȡpeVID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeVID() {
        return peVID;
    }

    /**
     * ����peVID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeVID(String value) {
        this.peVID = value;
    }

    /**
     * ��ȡceVID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeVID() {
        return ceVID;
    }

    /**
     * ����ceVID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeVID(String value) {
        this.ceVID = value;
    }

    /**
     * ��ȡtpName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getTpName() {
        return tpName;
    }

    /**
     * ����tpName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setTpName(NamingAttributeType value) {
        this.tpName = value;
    }

    /**
     * ��ȡaction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * ����action���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
