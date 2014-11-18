
package org.tmforum.mtop.nrf.xsd.mfdfr.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SHGCreateDataListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SHGCreateDataListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shgCreateData" type="{http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1}SHGCreateDataType" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHGCreateDataListType", propOrder = {
    "shgCreateData"
})
public class SHGCreateDataListType {

    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1")
    protected List<SHGCreateDataType> shgCreateData;

    /**
     * Gets the value of the shgCreateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shgCreateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShgCreateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHGCreateDataType }
     * 
     * 
     */
    public List<SHGCreateDataType> getShgCreateData() {
        if (shgCreateData == null) {
            shgCreateData = new ArrayList<SHGCreateDataType>();
        }
        return this.shgCreateData;
    }

}
