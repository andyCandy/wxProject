
package org.tmforum.mtop.fmw.xsd.gen.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NameAndValueStringListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="NameAndValueStringListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nvs" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndStringValueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAndValueStringListType", propOrder = {
    "nvs"
})
public class NameAndValueStringListType {

    @XmlElement(nillable = true)
    protected List<NameAndStringValueType> nvs;

    /**
     * Gets the value of the nvs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nvs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNvs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameAndStringValueType }
     * 
     * 
     */
    public List<NameAndStringValueType> getNvs() {
        if (nvs == null) {
            nvs = new ArrayList<NameAndStringValueType>();
        }
        return this.nvs;
    }

}
