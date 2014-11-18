
package org.tmforum.mtop.nrf.xsd.sc.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;


/**
 * <p>ServerConnectionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取name属性的值。
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
     * 设置name属性的值。
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
     * 获取channel属性的值。
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
     * 设置channel属性的值。
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
     * 获取usedAs属性的值。
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
     * 设置usedAs属性的值。
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
