
package org.tmforum.mtop.mri.xsd.tlr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.tl.v1.TopologicalLinkType;


/**
 * <p>SingleObjectResponseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SingleObjectResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tl" type="{http://www.tmforum.org/mtop/nrf/xsd/tl/v1}TopologicalLinkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleObjectResponseType", propOrder = {
    "tl"
})
public class SingleObjectResponseType {

    protected TopologicalLinkType tl;

    /**
     * ��ȡtl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TopologicalLinkType }
     *     
     */
    public TopologicalLinkType getTl() {
        return tl;
    }

    /**
     * ����tl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TopologicalLinkType }
     *     
     */
    public void setTl(TopologicalLinkType value) {
        this.tl = value;
    }

}
