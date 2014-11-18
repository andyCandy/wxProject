
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.tp.v1.TerminationPointListType;


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
 *         &lt;element name="cptpList" type="{http://www.tmforum.org/mtop/nrf/xsd/tp/v1}TerminationPointListType" minOccurs="0"/>
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
    "cptpList"
})
@XmlRootElement(name = "getAllAssignedConnectionlessPortTerminationPointsResponse")
public class GetAllAssignedConnectionlessPortTerminationPointsResponse {

    protected TerminationPointListType cptpList;

    /**
     * ��ȡcptpList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointListType }
     *     
     */
    public TerminationPointListType getCptpList() {
        return cptpList;
    }

    /**
     * ����cptpList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointListType }
     *     
     */
    public void setCptpList(TerminationPointListType value) {
        this.cptpList = value;
    }

}
