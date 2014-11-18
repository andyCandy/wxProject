
package org.tmforum.mtop.rpm.xsd.pmr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pm.v1.HoldingTimeType;


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
 *         &lt;element name="holdingTime" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}HoldingTimeType" minOccurs="0"/>
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
    "holdingTime"
})
@XmlRootElement(name = "getHoldingTimeResponse")
public class GetHoldingTimeResponse {

    @XmlSchemaType(name = "string")
    protected HoldingTimeType holdingTime;

    /**
     * ��ȡholdingTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HoldingTimeType }
     *     
     */
    public HoldingTimeType getHoldingTime() {
        return holdingTime;
    }

    /**
     * ����holdingTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingTimeType }
     *     
     */
    public void setHoldingTime(HoldingTimeType value) {
        this.holdingTime = value;
    }

}
