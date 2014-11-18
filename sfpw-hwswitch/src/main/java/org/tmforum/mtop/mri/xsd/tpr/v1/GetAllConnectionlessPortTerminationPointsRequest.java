
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrf.xsd.com.v1.ConnectionlessPortTerminationPointRoleType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfdRef���Ե�ֵ��
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
     * ����fdRef���Ե�ֵ��
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
     * ��ȡcptpRole���Ե�ֵ��
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
     * ����cptpRole���Ե�ֵ��
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
