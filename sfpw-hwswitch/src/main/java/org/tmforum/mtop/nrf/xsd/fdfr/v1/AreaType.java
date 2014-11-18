
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AreaType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="networkList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}NetworkAddressListType"/>
 *         &lt;element name="protocolInterfaceList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}OspfInterfaceListType"/>
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
@XmlType(name = "AreaType", propOrder = {
    "areaID",
    "areaType",
    "networkList",
    "protocolInterfaceList",
    "action"
})
public class AreaType {

    @XmlElement(required = true)
    protected String areaID;
    @XmlElement(required = true)
    protected String areaType;
    @XmlElement(required = true)
    protected NetworkAddressListType networkList;
    @XmlElement(required = true)
    protected OspfInterfaceListType protocolInterfaceList;
    @XmlElement(required = true)
    protected String action;

    /**
     * ��ȡareaID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaID() {
        return areaID;
    }

    /**
     * ����areaID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaID(String value) {
        this.areaID = value;
    }

    /**
     * ��ȡareaType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaType() {
        return areaType;
    }

    /**
     * ����areaType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaType(String value) {
        this.areaType = value;
    }

    /**
     * ��ȡnetworkList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NetworkAddressListType }
     *     
     */
    public NetworkAddressListType getNetworkList() {
        return networkList;
    }

    /**
     * ����networkList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkAddressListType }
     *     
     */
    public void setNetworkList(NetworkAddressListType value) {
        this.networkList = value;
    }

    /**
     * ��ȡprotocolInterfaceList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OspfInterfaceListType }
     *     
     */
    public OspfInterfaceListType getProtocolInterfaceList() {
        return protocolInterfaceList;
    }

    /**
     * ����protocolInterfaceList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OspfInterfaceListType }
     *     
     */
    public void setProtocolInterfaceList(OspfInterfaceListType value) {
        this.protocolInterfaceList = value;
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
