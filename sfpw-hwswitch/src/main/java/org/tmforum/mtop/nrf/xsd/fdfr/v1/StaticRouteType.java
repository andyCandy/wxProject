
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>StaticRouteType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StaticRouteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outTpName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="nextVrfName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="nextHop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "StaticRouteType", propOrder = {
    "destAddress",
    "mask",
    "outTpName",
    "nextVrfName",
    "nextHop",
    "preference",
    "status",
    "action"
})
public class StaticRouteType {

    @XmlElement(required = true)
    protected String destAddress;
    @XmlElement(required = true)
    protected String mask;
    @XmlElement(required = true)
    protected NamingAttributeType outTpName;
    @XmlElement(required = true)
    protected NamingAttributeType nextVrfName;
    @XmlElement(required = true)
    protected String nextHop;
    protected int preference;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String action;

    /**
     * ��ȡdestAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAddress() {
        return destAddress;
    }

    /**
     * ����destAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAddress(String value) {
        this.destAddress = value;
    }

    /**
     * ��ȡmask���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * ����mask���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * ��ȡoutTpName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getOutTpName() {
        return outTpName;
    }

    /**
     * ����outTpName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setOutTpName(NamingAttributeType value) {
        this.outTpName = value;
    }

    /**
     * ��ȡnextVrfName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getNextVrfName() {
        return nextVrfName;
    }

    /**
     * ����nextVrfName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setNextVrfName(NamingAttributeType value) {
        this.nextVrfName = value;
    }

    /**
     * ��ȡnextHop���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextHop() {
        return nextHop;
    }

    /**
     * ����nextHop���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextHop(String value) {
        this.nextHop = value;
    }

    /**
     * ��ȡpreference���Ե�ֵ��
     * 
     */
    public int getPreference() {
        return preference;
    }

    /**
     * ����preference���Ե�ֵ��
     * 
     */
    public void setPreference(int value) {
        this.preference = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
