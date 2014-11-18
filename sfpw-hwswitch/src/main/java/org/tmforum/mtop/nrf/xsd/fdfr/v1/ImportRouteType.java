
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ImportRouteType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ImportRouteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protocolType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="procID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bgpMed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="strBgpMed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="routePolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ImportRouteType", propOrder = {
    "protocolType",
    "procID",
    "bgpMed",
    "strBgpMed",
    "cost",
    "routePolicy",
    "action"
})
public class ImportRouteType {

    @XmlElement(required = true)
    protected String protocolType;
    protected int procID;
    protected int bgpMed;
    @XmlElement(required = true)
    protected String strBgpMed;
    protected int cost;
    @XmlElement(required = true)
    protected String routePolicy;
    @XmlElement(required = true)
    protected String action;

    /**
     * ��ȡprotocolType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * ����protocolType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolType(String value) {
        this.protocolType = value;
    }

    /**
     * ��ȡprocID���Ե�ֵ��
     * 
     */
    public int getProcID() {
        return procID;
    }

    /**
     * ����procID���Ե�ֵ��
     * 
     */
    public void setProcID(int value) {
        this.procID = value;
    }

    /**
     * ��ȡbgpMed���Ե�ֵ��
     * 
     */
    public int getBgpMed() {
        return bgpMed;
    }

    /**
     * ����bgpMed���Ե�ֵ��
     * 
     */
    public void setBgpMed(int value) {
        this.bgpMed = value;
    }

    /**
     * ��ȡstrBgpMed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrBgpMed() {
        return strBgpMed;
    }

    /**
     * ����strBgpMed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrBgpMed(String value) {
        this.strBgpMed = value;
    }

    /**
     * ��ȡcost���Ե�ֵ��
     * 
     */
    public int getCost() {
        return cost;
    }

    /**
     * ����cost���Ե�ֵ��
     * 
     */
    public void setCost(int value) {
        this.cost = value;
    }

    /**
     * ��ȡroutePolicy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePolicy() {
        return routePolicy;
    }

    /**
     * ����routePolicy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePolicy(String value) {
        this.routePolicy = value;
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
