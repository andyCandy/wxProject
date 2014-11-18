
package org.tmforum.mtop.mri.xsd.mer.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.me.v1.ManagedElementType;


/**
 * <p>SingleMeObjectResponseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SingleMeObjectResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="me" type="{http://www.tmforum.org/mtop/nrf/xsd/me/v1}ManagedElementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleMeObjectResponseType", propOrder = {
    "me"
})
public class SingleMeObjectResponseType {

    protected ManagedElementType me;

    /**
     * ��ȡme���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ManagedElementType }
     *     
     */
    public ManagedElementType getMe() {
        return me;
    }

    /**
     * ����me���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedElementType }
     *     
     */
    public void setMe(ManagedElementType value) {
        this.me = value;
    }

}
