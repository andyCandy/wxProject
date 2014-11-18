
package org.tmforum.mtop.vs.xsd.rr.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerInfoListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CustomerInfoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cit" type="{http://www.tmforum.org/mtop/vs/xsd/rr/v1}CustomerInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInfoListType", propOrder = {
    "cit"
})
public class CustomerInfoListType {

    @XmlElement(nillable = true)
    protected List<CustomerInfoType> cit;

    /**
     * Gets the value of the cit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerInfoType }
     * 
     * 
     */
    public List<CustomerInfoType> getCit() {
        if (cit == null) {
            cit = new ArrayList<CustomerInfoType>();
        }
        return this.cit;
    }

}
