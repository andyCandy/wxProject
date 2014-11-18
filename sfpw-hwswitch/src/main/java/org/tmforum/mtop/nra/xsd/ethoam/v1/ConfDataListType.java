
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConfDataListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ConfDataListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lstParamInfo" type="{http://www.tmforum.org/mtop/nra/xsd/ethoam/v1}ConfDataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfDataListType", propOrder = {
    "lstParamInfo"
})
public class ConfDataListType {

    @XmlElement(nillable = true)
    protected List<ConfDataType> lstParamInfo;

    /**
     * Gets the value of the lstParamInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstParamInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstParamInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfDataType }
     * 
     * 
     */
    public List<ConfDataType> getLstParamInfo() {
        if (lstParamInfo == null) {
            lstParamInfo = new ArrayList<ConfDataType>();
        }
        return this.lstParamInfo;
    }

}
