
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>DynamicRPType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DynamicRPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="parameterList" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicRPType", propOrder = {
    "tpName",
    "parameterList"
})
public class DynamicRPType {

    @XmlElement(required = true)
    protected NamingAttributeType tpName;
    @XmlElement(required = true)
    protected NameAndValueStringListType parameterList;

    /**
     * ��ȡtpName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getTpName() {
        return tpName;
    }

    /**
     * ����tpName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setTpName(NamingAttributeType value) {
        this.tpName = value;
    }

    /**
     * ��ȡparameterList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getParameterList() {
        return parameterList;
    }

    /**
     * ����parameterList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setParameterList(NameAndValueStringListType value) {
        this.parameterList = value;
    }

}
