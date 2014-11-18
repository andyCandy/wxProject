
package org.tmforum.mtop.mri.xsd.ancp.v1;

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
 *         &lt;element name="ancpNeighborList" type="{http://www.tmforum.org/mtop/mri/xsd/ancp/v1}ANCPNeighborProfileListType" minOccurs="0"/>
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
    "ancpNeighborList"
})
@XmlRootElement(name = "getAllANCPNeighborProfilesResponse")
public class GetAllANCPNeighborProfilesResponse {

    protected ANCPNeighborProfileListType ancpNeighborList;

    /**
     * ��ȡancpNeighborList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ANCPNeighborProfileListType }
     *     
     */
    public ANCPNeighborProfileListType getAncpNeighborList() {
        return ancpNeighborList;
    }

    /**
     * ����ancpNeighborList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ANCPNeighborProfileListType }
     *     
     */
    public void setAncpNeighborList(ANCPNeighborProfileListType value) {
        this.ancpNeighborList = value;
    }

}
