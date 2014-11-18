
package org.tmforum.mtop.nrf.xsd.tp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.ctp.v1.ConnectionTerminationPointType;
import org.tmforum.mtop.nrf.xsd.ftp.v1.FloatingTerminationPointType;
import org.tmforum.mtop.nrf.xsd.ptp.v1.PhysicalTerminationPointType;


/**
 * <p>TerminationPointType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取ptp属性的值。
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
     * 设置ptp属性的值。
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
     * 获取ftp属性的值。
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
     * 设置ftp属性的值。
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
     * 获取ctp属性的值。
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
     * 设置ctp属性的值。
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
