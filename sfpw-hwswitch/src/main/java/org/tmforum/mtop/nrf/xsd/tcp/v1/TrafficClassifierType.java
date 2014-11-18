
package org.tmforum.mtop.nrf.xsd.tcp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersListType;


/**
 * <p>TrafficClassifierType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TrafficClassifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="classifierID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logicalRelationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matchRules" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matchvalue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mactchSourcePortValue" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="matchDestinationPort" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="matchEgressPort" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}transmissionParametersList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficClassifierType", propOrder = {
    "name",
    "classifierID",
    "logicalRelationType",
    "action",
    "matchRules",
    "matchvalue",
    "mactchSourcePortValue",
    "matchDestinationPort",
    "matchEgressPort",
    "transmissionParametersList"
})
public class TrafficClassifierType {

    @XmlElement(required = true)
    protected NamingAttributeType name;
    @XmlElement(required = true)
    protected String classifierID;
    @XmlElement(required = true)
    protected String logicalRelationType;
    @XmlElement(required = true)
    protected String action;
    @XmlElement(required = true)
    protected String matchRules;
    @XmlElement(required = true)
    protected String matchvalue;
    @XmlElement(required = true)
    protected NamingAttributeType mactchSourcePortValue;
    @XmlElement(required = true)
    protected NamingAttributeType matchDestinationPort;
    @XmlElement(required = true)
    protected NamingAttributeType matchEgressPort;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1")
    protected LayeredParametersListType transmissionParametersList;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setName(NamingAttributeType value) {
        this.name = value;
    }

    /**
     * ��ȡclassifierID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifierID() {
        return classifierID;
    }

    /**
     * ����classifierID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifierID(String value) {
        this.classifierID = value;
    }

    /**
     * ��ȡlogicalRelationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalRelationType() {
        return logicalRelationType;
    }

    /**
     * ����logicalRelationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalRelationType(String value) {
        this.logicalRelationType = value;
    }

    /**
     * ��ȡaction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * ����action���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * ��ȡmatchRules���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchRules() {
        return matchRules;
    }

    /**
     * ����matchRules���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchRules(String value) {
        this.matchRules = value;
    }

    /**
     * ��ȡmatchvalue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchvalue() {
        return matchvalue;
    }

    /**
     * ����matchvalue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchvalue(String value) {
        this.matchvalue = value;
    }

    /**
     * ��ȡmactchSourcePortValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMactchSourcePortValue() {
        return mactchSourcePortValue;
    }

    /**
     * ����mactchSourcePortValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMactchSourcePortValue(NamingAttributeType value) {
        this.mactchSourcePortValue = value;
    }

    /**
     * ��ȡmatchDestinationPort���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMatchDestinationPort() {
        return matchDestinationPort;
    }

    /**
     * ����matchDestinationPort���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMatchDestinationPort(NamingAttributeType value) {
        this.matchDestinationPort = value;
    }

    /**
     * ��ȡmatchEgressPort���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMatchEgressPort() {
        return matchEgressPort;
    }

    /**
     * ����matchEgressPort���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMatchEgressPort(NamingAttributeType value) {
        this.matchEgressPort = value;
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
