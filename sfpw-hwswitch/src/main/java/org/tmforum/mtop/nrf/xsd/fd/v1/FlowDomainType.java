
package org.tmforum.mtop.nrf.xsd.fd.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersListType;


/**
 * <p>FlowDomainType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtransmissionParametersList���Ե�ֵ��
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
     * ����transmissionParametersList���Ե�ֵ��
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
     * ��ȡconnectivityState���Ե�ֵ��
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
     * ����connectivityState���Ե�ֵ��
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
     * ��ȡtype���Ե�ֵ��
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
     * ����type���Ե�ֵ��
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
