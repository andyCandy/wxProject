
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.tppool.v1.TerminationPointPoolType;


/**
 * <p>SingleTerminationPointPoolObjectResponseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SingleTerminationPointPoolObjectResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpPool" type="{http://www.tmforum.org/mtop/nrf/xsd/tppool/v1}TerminationPointPoolType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleTerminationPointPoolObjectResponseType", propOrder = {
    "tpPool"
})
public class SingleTerminationPointPoolObjectResponseType {

    protected TerminationPointPoolType tpPool;

    /**
     * ��ȡtpPool���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointPoolType }
     *     
     */
    public TerminationPointPoolType getTpPool() {
        return tpPool;
    }

    /**
     * ����tpPool���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointPoolType }
     *     
     */
    public void setTpPool(TerminationPointPoolType value) {
        this.tpPool = value;
    }

}
