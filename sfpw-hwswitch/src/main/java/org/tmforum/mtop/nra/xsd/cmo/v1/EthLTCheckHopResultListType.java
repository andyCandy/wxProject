
package org.tmforum.mtop.nra.xsd.cmo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EthLTCheckHopResultListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EthLTCheckHopResultListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hop" type="{http://www.tmforum.org/mtop/nra/xsd/cmo/v1}EthLTCheckHopResultType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EthLTCheckHopResultListType", propOrder = {
    "hop"
})
public class EthLTCheckHopResultListType {

    @XmlElement(nillable = true)
    protected List<EthLTCheckHopResultType> hop;

    /**
     * Gets the value of the hop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EthLTCheckHopResultType }
     * 
     * 
     */
    public List<EthLTCheckHopResultType> getHop() {
        if (hop == null) {
            hop = new ArrayList<EthLTCheckHopResultType>();
        }
        return this.hop;
    }

}
