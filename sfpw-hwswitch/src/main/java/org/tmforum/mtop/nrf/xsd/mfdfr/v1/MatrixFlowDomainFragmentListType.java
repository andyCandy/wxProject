
package org.tmforum.mtop.nrf.xsd.mfdfr.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MatrixFlowDomainFragmentListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MatrixFlowDomainFragmentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mfdfr" type="{http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1}MatrixFlowDomainFragmentType" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixFlowDomainFragmentListType", propOrder = {
    "mfdfr"
})
public class MatrixFlowDomainFragmentListType {

    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1")
    protected List<MatrixFlowDomainFragmentType> mfdfr;

    /**
     * Gets the value of the mfdfr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mfdfr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMfdfr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatrixFlowDomainFragmentType }
     * 
     * 
     */
    public List<MatrixFlowDomainFragmentType> getMfdfr() {
        if (mfdfr == null) {
            mfdfr = new ArrayList<MatrixFlowDomainFragmentType>();
        }
        return this.mfdfr;
    }

}
