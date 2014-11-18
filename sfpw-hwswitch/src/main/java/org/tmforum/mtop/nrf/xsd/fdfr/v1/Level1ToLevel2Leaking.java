
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Level1ToLevel2Leaking complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Level1ToLevel2Leaking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level1ToLevel2" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "Level1ToLevel2Leaking", propOrder = {
    "level1ToLevel2",
    "filterPolicyType",
    "filterPolicyVaule",
    "action"
})
public class Level1ToLevel2Leaking {

    protected boolean level1ToLevel2;
    @XmlElement(required = true)
    protected String filterPolicyType;
    @XmlElement(required = true)
    protected String filterPolicyVaule;
    @XmlElement(required = true)
    protected String action;

    /**
     * ��ȡlevel1ToLevel2���Ե�ֵ��
     * 
     */
    public boolean isLevel1ToLevel2() {
        return level1ToLevel2;
    }

    /**
     * ����level1ToLevel2���Ե�ֵ��
     * 
     */
    public void setLevel1ToLevel2(boolean value) {
        this.level1ToLevel2 = value;
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
