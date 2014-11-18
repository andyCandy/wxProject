
package org.tmforum.mtop.nrf.xsd.sc.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;


/**
 * <p>ServerConnectionType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ServerConnectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usedAs" type="{http://www.tmforum.org/mtop/nrf/xsd/sc/v1}UsedAsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerConnectionType", propOrder = {
    "name",
    "channel",
    "usedAs"
})
public class ServerConnectionType {

    @XmlElement(required = true)
    protected NamingAttributeListType name;
    @XmlElement(required = true)
    protected String channel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UsedAsType usedAs;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setName(NamingAttributeListType value) {
        this.name = value;
    }

    /**
     * ��ȡchannel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * ����channel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * ��ȡusedAs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UsedAsType }
     *     
     */
    public UsedAsType getUsedAs() {
        return usedAs;
    }

    /**
     * ����usedAs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UsedAsType }
     *     
     */
    public void setUsedAs(UsedAsType value) {
        this.usedAs = value;
    }

}
