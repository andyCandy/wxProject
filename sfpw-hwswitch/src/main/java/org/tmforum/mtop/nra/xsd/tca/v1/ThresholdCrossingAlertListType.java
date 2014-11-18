
package org.tmforum.mtop.nra.xsd.tca.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ThresholdCrossingAlertListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ThresholdCrossingAlertListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thresholdCrossingAlert" type="{http://www.tmforum.org/mtop/nra/xsd/tca/v1}ThresholdCrossingAlertType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThresholdCrossingAlertListType", propOrder = {
    "thresholdCrossingAlert"
})
public class ThresholdCrossingAlertListType {

    @XmlElement(nillable = true)
    protected List<ThresholdCrossingAlertType> thresholdCrossingAlert;

    /**
     * Gets the value of the thresholdCrossingAlert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thresholdCrossingAlert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThresholdCrossingAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThresholdCrossingAlertType }
     * 
     * 
     */
    public List<ThresholdCrossingAlertType> getThresholdCrossingAlert() {
        if (thresholdCrossingAlert == null) {
            thresholdCrossingAlert = new ArrayList<ThresholdCrossingAlertType>();
        }
        return this.thresholdCrossingAlert;
    }

}
