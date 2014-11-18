
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrf.xsd.com.v1.ConnectionlessPortTerminationPointRoleType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fdRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="cptpRole" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}ConnectionlessPortTerminationPointRoleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fdRef",
    "cptpRole"
})
@XmlRootElement(name = "getAllConnectionlessPortTerminationPointsRequest")
public class GetAllConnectionlessPortTerminationPointsRequest {

    protected NamingAttributeType fdRef;
    @XmlSchemaType(name = "string")
    protected ConnectionlessPortTerminationPointRoleType cptpRole;

    /**
     * 获取fdRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getFdRef() {
        return fdRef;
    }

    /**
     * 设置fdRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setFdRef(NamingAttributeType value) {
        this.fdRef = value;
    }

    /**
     * 获取cptpRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConnectionlessPortTerminationPointRoleType }
     *     
     */
    public ConnectionlessPortTerminationPointRoleType getCptpRole() {
        return cptpRole;
    }

    /**
     * 设置cptpRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionlessPortTerminationPointRoleType }
     *     
     */
    public void setCptpRole(ConnectionlessPortTerminationPointRoleType value) {
        this.cptpRole = value;
    }

}
