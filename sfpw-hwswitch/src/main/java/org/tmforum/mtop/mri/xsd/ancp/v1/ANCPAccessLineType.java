
package org.tmforum.mtop.mri.xsd.ancp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;


/**
 * <p>ANCPAccessLineType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ANCPAccessLineType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="qosAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANCPAccessLineType", propOrder = {
    "qosAction",
    "peerAddress",
    "state"
})
public class ANCPAccessLineType
    extends CommonResourceInfoType
{

    protected String qosAction;
    protected String peerAddress;
    protected String state;

    /**
     * 获取qosAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQosAction() {
        return qosAction;
    }

    /**
     * 设置qosAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQosAction(String value) {
        this.qosAction = value;
    }

    /**
     * 获取peerAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerAddress() {
        return peerAddress;
    }

    /**
     * 设置peerAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerAddress(String value) {
        this.peerAddress = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
