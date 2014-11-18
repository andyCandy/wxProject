
package org.tmforum.mtop.nra.xsd.cmo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OAMMeasureStatisticType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OAMMeasureStatisticType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="measureResults" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAMMeasureStatisticType", propOrder = {
    "result",
    "endType",
    "measureResults",
    "reason"
})
public class OAMMeasureStatisticType {

    protected int result;
    @XmlElement(required = true)
    protected String endType;
    @XmlElement(nillable = true)
    protected List<String> measureResults;
    protected String reason;

    /**
     * ��ȡresult���Ե�ֵ��
     * 
     */
    public int getResult() {
        return result;
    }

    /**
     * ����result���Ե�ֵ��
     * 
     */
    public void setResult(int value) {
        this.result = value;
    }

    /**
     * ��ȡendType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndType() {
        return endType;
    }

    /**
     * ����endType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndType(String value) {
        this.endType = value;
    }

    /**
     * Gets the value of the measureResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measureResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasureResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMeasureResults() {
        if (measureResults == null) {
            measureResults = new ArrayList<String>();
        }
        return this.measureResults;
    }

    /**
     * ��ȡreason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * ����reason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
