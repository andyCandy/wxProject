
package org.tmforum.mtop.mri.xsd.dusr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ipAssociatedMEInfosList" type="{http://www.tmforum.org/mtop/mri/xsd/dusr/v1}IPAssociatedMEInfosListType"/>
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
    "ipAssociatedMEInfosList"
})
@XmlRootElement(name = "getAllManagedElementInfosByIPsResponse")
public class GetAllManagedElementInfosByIPsResponse {

    @XmlElement(required = true)
    protected IPAssociatedMEInfosListType ipAssociatedMEInfosList;

    /**
     * ��ȡipAssociatedMEInfosList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IPAssociatedMEInfosListType }
     *     
     */
    public IPAssociatedMEInfosListType getIpAssociatedMEInfosList() {
        return ipAssociatedMEInfosList;
    }

    /**
     * ����ipAssociatedMEInfosList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IPAssociatedMEInfosListType }
     *     
     */
    public void setIpAssociatedMEInfosList(IPAssociatedMEInfosListType value) {
        this.ipAssociatedMEInfosList = value;
    }

}
