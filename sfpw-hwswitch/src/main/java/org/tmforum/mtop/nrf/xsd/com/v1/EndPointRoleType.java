
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EndPointRoleType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EndPointRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}TerminationPointRole" minOccurs="0"/>
 *         &lt;element name="tpIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndPointRoleType", propOrder = {
    "role",
    "tpIndex"
})
public class EndPointRoleType {

    @XmlSchemaType(name = "string")
    protected TerminationPointRole role;
    @XmlSchemaType(name = "unsignedInt")
    protected Long tpIndex;

    /**
     * ��ȡrole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointRole }
     *     
     */
    public TerminationPointRole getRole() {
        return role;
    }

    /**
     * ����role���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointRole }
     *     
     */
    public void setRole(TerminationPointRole value) {
        this.role = value;
    }

    /**
     * ��ȡtpIndex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTpIndex() {
        return tpIndex;
    }

    /**
     * ����tpIndex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTpIndex(Long value) {
        this.tpIndex = value;
    }

}
