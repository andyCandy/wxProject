
package org.tmforum.mtop.nra.xsd.pmtgt.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pm.v1.InstanceEnumType;


/**
 * <p>PerformanceTemplateType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PerformanceTemplateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}InstanceEnumType"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceTemplateType", propOrder = {
    "id",
    "name",
    "type",
    "period"
})
public class PerformanceTemplateType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InstanceEnumType type;
    protected int period;

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link InstanceEnumType }
     *     
     */
    public InstanceEnumType getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceEnumType }
     *     
     */
    public void setType(InstanceEnumType value) {
        this.type = value;
    }

    /**
     * ��ȡperiod���Ե�ֵ��
     * 
     */
    public int getPeriod() {
        return period;
    }

    /**
     * ����period���Ե�ֵ��
     * 
     */
    public void setPeriod(int value) {
        this.period = value;
    }

}
