
package org.tmforum.mtop.rtm.xsd.ar.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AliasNameListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>ServiceNameType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}aliasNameList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceNameType", propOrder = {
    "name",
    "aliasNameList"
})
public class ServiceNameType {

    @XmlElement(nillable = true)
    protected List<NamingAttributeType> name;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/fmw/xsd/gen/v1")
    protected List<AliasNameListType> aliasNameList;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamingAttributeType }
     * 
     * 
     */
    public List<NamingAttributeType> getName() {
        if (name == null) {
            name = new ArrayList<NamingAttributeType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the aliasNameList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aliasNameList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAliasNameList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AliasNameListType }
     * 
     * 
     */
    public List<AliasNameListType> getAliasNameList() {
        if (aliasNameList == null) {
            aliasNameList = new ArrayList<AliasNameListType>();
        }
        return this.aliasNameList;
    }

}
