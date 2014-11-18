
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.gtp.v1.GroupTerminationPointType;


/**
 * <p>SingleGroupTerminationPointObjectResponseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SingleGroupTerminationPointObjectResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gtp" type="{http://www.tmforum.org/mtop/nrf/xsd/gtp/v1}GroupTerminationPointType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleGroupTerminationPointObjectResponseType", propOrder = {
    "gtp"
})
public class SingleGroupTerminationPointObjectResponseType {

    protected GroupTerminationPointType gtp;

    /**
     * ��ȡgtp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GroupTerminationPointType }
     *     
     */
    public GroupTerminationPointType getGtp() {
        return gtp;
    }

    /**
     * ����gtp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GroupTerminationPointType }
     *     
     */
    public void setGtp(GroupTerminationPointType value) {
        this.gtp = value;
    }

}
