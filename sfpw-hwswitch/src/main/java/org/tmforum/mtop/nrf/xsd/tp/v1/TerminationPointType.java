
package org.tmforum.mtop.nrf.xsd.tp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.ctp.v1.ConnectionTerminationPointType;
import org.tmforum.mtop.nrf.xsd.ftp.v1.FloatingTerminationPointType;
import org.tmforum.mtop.nrf.xsd.ptp.v1.PhysicalTerminationPointType;


/**
 * <p>TerminationPointType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TerminationPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrf/xsd/ptp/v1}ptp" minOccurs="0"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrf/xsd/ftp/v1}ftp" minOccurs="0"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrf/xsd/ctp/v1}ctp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminationPointType", propOrder = {
    "ptp",
    "ftp",
    "ctp"
})
public class TerminationPointType {

    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/ptp/v1")
    protected PhysicalTerminationPointType ptp;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/ftp/v1")
    protected FloatingTerminationPointType ftp;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/ctp/v1")
    protected ConnectionTerminationPointType ctp;

    /**
     * ��ȡptp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTerminationPointType }
     *     
     */
    public PhysicalTerminationPointType getPtp() {
        return ptp;
    }

    /**
     * ����ptp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTerminationPointType }
     *     
     */
    public void setPtp(PhysicalTerminationPointType value) {
        this.ptp = value;
    }

    /**
     * ��ȡftp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FloatingTerminationPointType }
     *     
     */
    public FloatingTerminationPointType getFtp() {
        return ftp;
    }

    /**
     * ����ftp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingTerminationPointType }
     *     
     */
    public void setFtp(FloatingTerminationPointType value) {
        this.ftp = value;
    }

    /**
     * ��ȡctp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ConnectionTerminationPointType }
     *     
     */
    public ConnectionTerminationPointType getCtp() {
        return ctp;
    }

    /**
     * ����ctp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTerminationPointType }
     *     
     */
    public void setCtp(ConnectionTerminationPointType value) {
        this.ctp = value;
    }

}
