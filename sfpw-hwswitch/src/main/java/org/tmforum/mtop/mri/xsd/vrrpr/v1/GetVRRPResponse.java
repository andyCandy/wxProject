
package org.tmforum.mtop.mri.xsd.vrrpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vrrpInfoList" type="{http://www.tmforum.org/mtop/mri/xsd/vrrpr/v1}VRRPListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vrrpInfoList"
})
@XmlRootElement(name = "getVRRPResponse")
public class GetVRRPResponse {

    protected VRRPListType vrrpInfoList;

    /**
     * ��ȡvrrpInfoList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VRRPListType }
     *     
     */
    public VRRPListType getVrrpInfoList() {
        return vrrpInfoList;
    }

    /**
     * ����vrrpInfoList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VRRPListType }
     *     
     */
    public void setVrrpInfoList(VRRPListType value) {
        this.vrrpInfoList = value;
    }

}
