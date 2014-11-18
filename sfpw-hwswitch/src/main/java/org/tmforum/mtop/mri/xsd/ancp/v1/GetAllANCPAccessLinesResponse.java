
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
 *         &lt;element name="ancpLineList" type="{http://www.tmforum.org/mtop/mri/xsd/ancp/v1}ANCPAccessLineListType" minOccurs="0"/>
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
    "ancpLineList"
})
@XmlRootElement(name = "getAllANCPAccessLinesResponse")
public class GetAllANCPAccessLinesResponse {

    protected ANCPAccessLineListType ancpLineList;

    /**
     * ��ȡancpLineList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ANCPAccessLineListType }
     *     
     */
    public ANCPAccessLineListType getAncpLineList() {
        return ancpLineList;
    }

    /**
     * ����ancpLineList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ANCPAccessLineListType }
     *     
     */
    public void setAncpLineList(ANCPAccessLineListType value) {
        this.ancpLineList = value;
    }

}
