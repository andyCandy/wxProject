
package org.tmforum.mtop.nrf.xsd.fd.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersListType;


/**
 * <p>FlowDomainType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlowDomainType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}transmissionParametersList" minOccurs="0"/>
 *         &lt;element name="connectivityState" type="{http://www.tmforum.org/mtop/nrf/xsd/fd/v1}ConnectivityStateType"/>
 *         &lt;element name="type" type="{http://www.tmforum.org/mtop/nrf/xsd/fd/v1}FdTypeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowDomainType", propOrder = {
    "transmissionParametersList",
    "connectivityState",
    "type"
})
public class FlowDomainType
    extends CommonResourceInfoType
{

    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1")
    protected LayeredParametersListType transmissionParametersList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConnectivityStateType connectivityState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FdTypeType type;

    /**
     * 获取transmissionParametersList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LayeredParametersListType }
     *     
     */
    public LayeredParametersListType getTransmissionParametersList() {
        return transmissionParametersList;
    }

    /**
     * 设置transmissionParametersList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LayeredParametersListType }
     *     
     */
    public void setTransmissionParametersList(LayeredParametersListType value) {
        this.transmissionParametersList = value;
    }

    /**
     * 获取connectivityState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConnectivityStateType }
     *     
     */
    public ConnectivityStateType getConnectivityState() {
        return connectivityState;
    }

    /**
     * 设置connectivityState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivityStateType }
     *     
     */
    public void setConnectivityState(ConnectivityStateType value) {
        this.connectivityState = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FdTypeType }
     *     
     */
    public FdTypeType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FdTypeType }
     *     
     */
    public void setType(FdTypeType value) {
        this.type = value;
    }

}
