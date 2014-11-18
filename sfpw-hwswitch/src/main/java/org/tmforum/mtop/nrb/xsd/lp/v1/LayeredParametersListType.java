
package org.tmforum.mtop.nrb.xsd.lp.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LayeredParametersListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LayeredParametersListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transmissionParameters" type="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}LayeredParametersType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayeredParametersListType", propOrder = {
    "transmissionParameters"
})
public class LayeredParametersListType {

    @XmlElement(nillable = true)
    protected List<LayeredParametersType> transmissionParameters;

    /**
     * Gets the value of the transmissionParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transmissionParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransmissionParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayeredParametersType }
     * 
     * 
     */
    public List<LayeredParametersType> getTransmissionParameters() {
        if (transmissionParameters == null) {
            transmissionParameters = new ArrayList<LayeredParametersType>();
        }
        return this.transmissionParameters;
    }

}
