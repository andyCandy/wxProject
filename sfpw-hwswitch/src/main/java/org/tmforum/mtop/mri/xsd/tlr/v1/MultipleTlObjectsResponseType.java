
package org.tmforum.mtop.mri.xsd.tlr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.tl.v1.TopologicalLinkListType;


/**
 * <p>MultipleTlObjectsResponseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MultipleTlObjectsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tlList" type="{http://www.tmforum.org/mtop/nrf/xsd/tl/v1}TopologicalLinkListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleTlObjectsResponseType", propOrder = {
    "tlList"
})
public class MultipleTlObjectsResponseType {

    protected TopologicalLinkListType tlList;

    /**
     * ��ȡtlList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TopologicalLinkListType }
     *     
     */
    public TopologicalLinkListType getTlList() {
        return tlList;
    }

    /**
     * ����tlList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TopologicalLinkListType }
     *     
     */
    public void setTlList(TopologicalLinkListType value) {
        this.tlList = value;
    }

}
