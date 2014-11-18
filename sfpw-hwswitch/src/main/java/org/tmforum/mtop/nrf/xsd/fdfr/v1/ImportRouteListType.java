
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ImportRouteListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ImportRouteListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importRoute" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ImportRouteType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportRouteListType", propOrder = {
    "importRoute"
})
public class ImportRouteListType {

    @XmlElement(nillable = true)
    protected List<ImportRouteType> importRoute;

    /**
     * Gets the value of the importRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportRouteType }
     * 
     * 
     */
    public List<ImportRouteType> getImportRoute() {
        if (importRoute == null) {
            importRoute = new ArrayList<ImportRouteType>();
        }
        return this.importRoute;
    }

}
