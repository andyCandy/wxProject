
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>ProtocolInterface complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ProtocolInterface">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interfaceName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="helloTimer" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}HelloTimerList"/>
 *         &lt;element name="interfaceCost" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}InterfaceCostList"/>
 *         &lt;element name="suppressInterface" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="netType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ProtocolInterface", propOrder = {
    "interfaceName",
    "helloTimer",
    "interfaceCost",
    "suppressInterface",
    "netType",
    "action"
})
public class ProtocolInterface {

    @XmlElement(required = true)
    protected NamingAttributeType interfaceName;
    @XmlElement(required = true)
    protected HelloTimerList helloTimer;
    @XmlElement(required = true)
    protected InterfaceCostList interfaceCost;
    protected boolean suppressInterface;
    @XmlElement(required = true)
    protected String netType;
    @XmlElement(required = true)
    protected String action;

    /**
     * ��ȡinterfaceName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getInterfaceName() {
        return interfaceName;
    }

    /**
     * ����interfaceName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setInterfaceName(NamingAttributeType value) {
        this.interfaceName = value;
    }

    /**
     * ��ȡhelloTimer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HelloTimerList }
     *     
     */
    public HelloTimerList getHelloTimer() {
        return helloTimer;
    }

    /**
     * ����helloTimer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HelloTimerList }
     *     
     */
    public void setHelloTimer(HelloTimerList value) {
        this.helloTimer = value;
    }

    /**
     * ��ȡinterfaceCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link InterfaceCostList }
     *     
     */
    public InterfaceCostList getInterfaceCost() {
        return interfaceCost;
    }

    /**
     * ����interfaceCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceCostList }
     *     
     */
    public void setInterfaceCost(InterfaceCostList value) {
        this.interfaceCost = value;
    }

    /**
     * ��ȡsuppressInterface���Ե�ֵ��
     * 
     */
    public boolean isSuppressInterface() {
        return suppressInterface;
    }

    /**
     * ����suppressInterface���Ե�ֵ��
     * 
     */
    public void setSuppressInterface(boolean value) {
        this.suppressInterface = value;
    }

    /**
     * ��ȡnetType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetType() {
        return netType;
    }

    /**
     * ����netType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetType(String value) {
        this.netType = value;
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
