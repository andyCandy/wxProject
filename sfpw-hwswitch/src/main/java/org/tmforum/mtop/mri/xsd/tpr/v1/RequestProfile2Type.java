
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>RequestProfile2Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RequestProfile2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestProfile2Type", propOrder = {
    "tpRef"
})
public class RequestProfile2Type {

    protected NamingAttributeType tpRef;

    /**
     * ��ȡtpRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getTpRef() {
        return tpRef;
    }

    /**
     * ����tpRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setTpRef(NamingAttributeType value) {
        this.tpRef = value;
    }

}
