
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TunnelDynSelType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TunnelDynSelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nextHop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bandwidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TunnelDynSelType", propOrder = {
    "nextHop",
    "bandwidth",
    "mode"
})
public class TunnelDynSelType {

    @XmlElement(required = true)
    protected String nextHop;
    protected int bandwidth;
    @XmlElement(required = true)
    protected String mode;

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
     * ��ȡbandwidth���Ե�ֵ��
     * 
     */
    public int getBandwidth() {
        return bandwidth;
    }

    /**
     * ����bandwidth���Ե�ֵ��
     * 
     */
    public void setBandwidth(int value) {
        this.bandwidth = value;
    }

    /**
     * ��ȡmode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * ����mode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

}
