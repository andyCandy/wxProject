
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NetworkEntityList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="NetworkEntityList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityOne" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityTwo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityThree" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkEntityList", propOrder = {
    "entityOne",
    "entityTwo",
    "entityThree"
})
public class NetworkEntityList {

    @XmlElement(required = true)
    protected String entityOne;
    @XmlElement(required = true)
    protected String entityTwo;
    @XmlElement(required = true)
    protected String entityThree;

    /**
     * ��ȡentityOne���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityOne() {
        return entityOne;
    }

    /**
     * ����entityOne���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityOne(String value) {
        this.entityOne = value;
    }

    /**
     * ��ȡentityTwo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityTwo() {
        return entityTwo;
    }

    /**
     * ����entityTwo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityTwo(String value) {
        this.entityTwo = value;
    }

    /**
     * ��ȡentityThree���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityThree() {
        return entityThree;
    }

    /**
     * ����entityThree���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityThree(String value) {
        this.entityThree = value;
    }

}
