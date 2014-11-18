
package org.tmforum.mtop.nrf.xsd.tcp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersListType;


/**
 * <p>TrafficConditioningProfileType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TrafficConditioningProfileType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isDefaultProfile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="classifierList" type="{http://www.tmforum.org/mtop/nrf/xsd/tcp/v1}TrafficClassifierListType"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}transmissionParametersList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficConditioningProfileType", propOrder = {
    "type",
    "isDefaultProfile",
    "classifierList",
    "transmissionParametersList"
})
public class TrafficConditioningProfileType
    extends CommonResourceInfoType
{

    @XmlElement(required = true)
    protected String type;
    protected boolean isDefaultProfile;
    @XmlElement(required = true)
    protected TrafficClassifierListType classifierList;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1")
    protected LayeredParametersListType transmissionParametersList;

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * ��ȡisDefaultProfile���Ե�ֵ��
     * 
     */
    public boolean isIsDefaultProfile() {
        return isDefaultProfile;
    }

    /**
     * ����isDefaultProfile���Ե�ֵ��
     * 
     */
    public void setIsDefaultProfile(boolean value) {
        this.isDefaultProfile = value;
    }

    /**
     * ��ȡclassifierList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrafficClassifierListType }
     *     
     */
    public TrafficClassifierListType getClassifierList() {
        return classifierList;
    }

    /**
     * ����classifierList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficClassifierListType }
     *     
     */
    public void setClassifierList(TrafficClassifierListType value) {
        this.classifierList = value;
    }

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

}
