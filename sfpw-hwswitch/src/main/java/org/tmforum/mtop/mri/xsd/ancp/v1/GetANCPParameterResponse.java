
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
 *         &lt;element name="ancp" type="{http://www.tmforum.org/mtop/mri/xsd/ancp/v1}ANCPParameterType" minOccurs="0"/>
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
    "ancp"
})
@XmlRootElement(name = "getANCPParameterResponse")
public class GetANCPParameterResponse {

    protected ANCPParameterType ancp;

    /**
     * ��ȡancp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ANCPParameterType }
     *     
     */
    public ANCPParameterType getAncp() {
        return ancp;
    }

    /**
     * ����ancp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ANCPParameterType }
     *     
     */
    public void setAncp(ANCPParameterType value) {
        this.ancp = value;
    }

}
