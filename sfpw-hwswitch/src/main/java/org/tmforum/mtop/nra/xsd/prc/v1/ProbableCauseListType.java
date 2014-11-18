
package org.tmforum.mtop.nra.xsd.prc.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProbableCauseListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProbableCauseListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prc" type="{http://www.tmforum.org/mtop/nra/xsd/prc/v1}ProbableCauseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProbableCauseListType", propOrder = {
    "prc"
})
public class ProbableCauseListType {

    @XmlElement(nillable = true)
    protected List<ProbableCauseType> prc;

    /**
     * Gets the value of the prc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProbableCauseType }
     * 
     * 
     */
    public List<ProbableCauseType> getPrc() {
        if (prc == null) {
            prc = new ArrayList<ProbableCauseType>();
        }
        return this.prc;
    }

}
