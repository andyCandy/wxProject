
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Level2ToLevel1Leaking complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Level2ToLevel1Leaking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level2ToLevel1" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filterPolicyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterPolicyVaule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Level2ToLevel1Leaking", propOrder = {
    "level2ToLevel1",
    "filterPolicyType",
    "filterPolicyVaule",
    "action"
})
public class Level2ToLevel1Leaking {

    protected boolean level2ToLevel1;
    @XmlElement(required = true)
    protected String filterPolicyType;
    @XmlElement(required = true)
    protected String filterPolicyVaule;
    @XmlElement(required = true)
    protected String action;

    /**
     * ��ȡlevel2ToLevel1���Ե�ֵ��
     * 
     */
    public boolean isLevel2ToLevel1() {
        return level2ToLevel1;
    }

    /**
     * ����level2ToLevel1���Ե�ֵ��
     * 
     */
    public void setLevel2ToLevel1(boolean value) {
        this.level2ToLevel1 = value;
    }

    /**
     * ��ȡfilterPolicyType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterPolicyType() {
        return filterPolicyType;
    }

    /**
     * ����filterPolicyType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterPolicyType(String value) {
        this.filterPolicyType = value;
    }

    /**
     * ��ȡfilterPolicyVaule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterPolicyVaule() {
        return filterPolicyVaule;
    }

    /**
     * ����filterPolicyVaule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterPolicyVaule(String value) {
        this.filterPolicyVaule = value;
    }

    /**
     * ��ȡaction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * ����action���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
