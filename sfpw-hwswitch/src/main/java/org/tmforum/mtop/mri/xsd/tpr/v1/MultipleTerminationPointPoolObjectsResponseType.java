
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.tppool.v1.TerminationPointPoolListType;


/**
 * <p>MultipleTerminationPointPoolObjectsResponseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MultipleTerminationPointPoolObjectsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpPoolList" type="{http://www.tmforum.org/mtop/nrf/xsd/tppool/v1}TerminationPointPoolListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleTerminationPointPoolObjectsResponseType", propOrder = {
    "tpPoolList"
})
public class MultipleTerminationPointPoolObjectsResponseType {

    protected TerminationPointPoolListType tpPoolList;

    /**
     * ��ȡtpPoolList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointPoolListType }
     *     
     */
    public TerminationPointPoolListType getTpPoolList() {
        return tpPoolList;
    }

    /**
     * ����tpPoolList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointPoolListType }
     *     
     */
    public void setTpPoolList(TerminationPointPoolListType value) {
        this.tpPoolList = value;
    }

}
