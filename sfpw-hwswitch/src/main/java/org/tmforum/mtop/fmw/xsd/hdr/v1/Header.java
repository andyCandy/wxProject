
package org.tmforum.mtop.fmw.xsd.hdr.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tmforum.mtop.fmw.xsd.gen.v1.AnyListType;


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
 *         &lt;element name="activityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgType" type="{http://www.tmforum.org/mtop/fmw/xsd/hdr/v1}MessageTypeType" minOccurs="0"/>
 *         &lt;element name="senderURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="destinationURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="replyToURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="originatorURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="failureReplytoURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="activityStatus" type="{http://www.tmforum.org/mtop/fmw/xsd/hdr/v1}ActivityStatusType" minOccurs="0"/>
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="security" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgSpecificProperties" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="property" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="propName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="propValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="communicationPattern" type="{http://www.tmforum.org/mtop/fmw/xsd/hdr/v1}CommunicationPatternType" minOccurs="0"/>
 *         &lt;element name="communicationStyle" type="{http://www.tmforum.org/mtop/fmw/xsd/hdr/v1}CommunicationStyleType" minOccurs="0"/>
 *         &lt;element name="requestedBatchSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="batchSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="batchSequenceEndOfReply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="iteratorReferenceURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="fileLocationURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="compressionType" type="{http://www.tmforum.org/mtop/fmw/xsd/hdr/v1}CompressionTypeType" minOccurs="0"/>
 *         &lt;element name="packingType" type="{http://www.tmforum.org/mtop/fmw/xsd/hdr/v1}PackingTypeType" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vendorExtensions" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AnyListType" minOccurs="0"/>
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
    "activityName",
    "msgName",
    "msgType",
    "senderURI",
    "destinationURI",
    "replyToURI",
    "originatorURI",
    "failureReplytoURI",
    "activityStatus",
    "correlationId",
    "security",
    "securityType",
    "priority",
    "msgSpecificProperties",
    "communicationPattern",
    "communicationStyle",
    "requestedBatchSize",
    "batchSequenceNumber",
    "batchSequenceEndOfReply",
    "iteratorReferenceURI",
    "fileLocationURI",
    "compressionType",
    "packingType",
    "timestamp",
    "vendorExtensions"
})
@XmlRootElement(name = "header")
public class Header {

    protected String activityName;
    protected String msgName;
    @XmlSchemaType(name = "string")
    protected MessageTypeType msgType;
    @XmlSchemaType(name = "anyURI")
    protected String senderURI;
    @XmlSchemaType(name = "anyURI")
    protected String destinationURI;
    @XmlSchemaType(name = "anyURI")
    protected String replyToURI;
    @XmlSchemaType(name = "anyURI")
    protected String originatorURI;
    @XmlSchemaType(name = "anyURI")
    protected String failureReplytoURI;
    protected ActivityStatusType activityStatus;
    protected String correlationId;
    protected String security;
    protected String securityType;
    protected String priority;
    protected Header.MsgSpecificProperties msgSpecificProperties;
    @XmlSchemaType(name = "string")
    protected CommunicationPatternType communicationPattern;
    @XmlSchemaType(name = "string")
    protected CommunicationStyleType communicationStyle;
    @XmlSchemaType(name = "unsignedInt")
    protected Long requestedBatchSize;
    @XmlSchemaType(name = "unsignedInt")
    protected Long batchSequenceNumber;
    protected Boolean batchSequenceEndOfReply;
    @XmlSchemaType(name = "anyURI")
    protected String iteratorReferenceURI;
    @XmlSchemaType(name = "anyURI")
    protected String fileLocationURI;
    protected CompressionTypeType compressionType;
    protected PackingTypeType packingType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    protected AnyListType vendorExtensions;

    /**
     * ��ȡactivityName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * ����activityName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityName(String value) {
        this.activityName = value;
    }

    /**
     * ��ȡmsgName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgName() {
        return msgName;
    }

    /**
     * ����msgName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgName(String value) {
        this.msgName = value;
    }

    /**
     * ��ȡmsgType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MessageTypeType }
     *     
     */
    public MessageTypeType getMsgType() {
        return msgType;
    }

    /**
     * ����msgType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTypeType }
     *     
     */
    public void setMsgType(MessageTypeType value) {
        this.msgType = value;
    }

    /**
     * ��ȡsenderURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderURI() {
        return senderURI;
    }

    /**
     * ����senderURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderURI(String value) {
        this.senderURI = value;
    }

    /**
     * ��ȡdestinationURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationURI() {
        return destinationURI;
    }

    /**
     * ����destinationURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationURI(String value) {
        this.destinationURI = value;
    }

    /**
     * ��ȡreplyToURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToURI() {
        return replyToURI;
    }

    /**
     * ����replyToURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToURI(String value) {
        this.replyToURI = value;
    }

    /**
     * ��ȡoriginatorURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorURI() {
        return originatorURI;
    }

    /**
     * ����originatorURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorURI(String value) {
        this.originatorURI = value;
    }

    /**
     * ��ȡfailureReplytoURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureReplytoURI() {
        return failureReplytoURI;
    }

    /**
     * ����failureReplytoURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureReplytoURI(String value) {
        this.failureReplytoURI = value;
    }

    /**
     * ��ȡactivityStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ActivityStatusType }
     *     
     */
    public ActivityStatusType getActivityStatus() {
        return activityStatus;
    }

    /**
     * ����activityStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityStatusType }
     *     
     */
    public void setActivityStatus(ActivityStatusType value) {
        this.activityStatus = value;
    }

    /**
     * ��ȡcorrelationId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * ����correlationId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    /**
     * ��ȡsecurity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * ����security���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

    /**
     * ��ȡsecurityType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityType() {
        return securityType;
    }

    /**
     * ����securityType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityType(String value) {
        this.securityType = value;
    }

    /**
     * ��ȡpriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * ����priority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * ��ȡmsgSpecificProperties���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Header.MsgSpecificProperties }
     *     
     */
    public Header.MsgSpecificProperties getMsgSpecificProperties() {
        return msgSpecificProperties;
    }

    /**
     * ����msgSpecificProperties���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Header.MsgSpecificProperties }
     *     
     */
    public void setMsgSpecificProperties(Header.MsgSpecificProperties value) {
        this.msgSpecificProperties = value;
    }

    /**
     * ��ȡcommunicationPattern���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommunicationPatternType }
     *     
     */
    public CommunicationPatternType getCommunicationPattern() {
        return communicationPattern;
    }

    /**
     * ����communicationPattern���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationPatternType }
     *     
     */
    public void setCommunicationPattern(CommunicationPatternType value) {
        this.communicationPattern = value;
    }

    /**
     * ��ȡcommunicationStyle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommunicationStyleType }
     *     
     */
    public CommunicationStyleType getCommunicationStyle() {
        return communicationStyle;
    }

    /**
     * ����communicationStyle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationStyleType }
     *     
     */
    public void setCommunicationStyle(CommunicationStyleType value) {
        this.communicationStyle = value;
    }

    /**
     * ��ȡrequestedBatchSize���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestedBatchSize() {
        return requestedBatchSize;
    }

    /**
     * ����requestedBatchSize���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestedBatchSize(Long value) {
        this.requestedBatchSize = value;
    }

    /**
     * ��ȡbatchSequenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBatchSequenceNumber() {
        return batchSequenceNumber;
    }

    /**
     * ����batchSequenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBatchSequenceNumber(Long value) {
        this.batchSequenceNumber = value;
    }

    /**
     * ��ȡbatchSequenceEndOfReply���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBatchSequenceEndOfReply() {
        return batchSequenceEndOfReply;
    }

    /**
     * ����batchSequenceEndOfReply���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatchSequenceEndOfReply(Boolean value) {
        this.batchSequenceEndOfReply = value;
    }

    /**
     * ��ȡiteratorReferenceURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIteratorReferenceURI() {
        return iteratorReferenceURI;
    }

    /**
     * ����iteratorReferenceURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIteratorReferenceURI(String value) {
        this.iteratorReferenceURI = value;
    }

    /**
     * ��ȡfileLocationURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileLocationURI() {
        return fileLocationURI;
    }

    /**
     * ����fileLocationURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileLocationURI(String value) {
        this.fileLocationURI = value;
    }

    /**
     * ��ȡcompressionType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CompressionTypeType }
     *     
     */
    public CompressionTypeType getCompressionType() {
        return compressionType;
    }

    /**
     * ����compressionType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionTypeType }
     *     
     */
    public void setCompressionType(CompressionTypeType value) {
        this.compressionType = value;
    }

    /**
     * ��ȡpackingType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PackingTypeType }
     *     
     */
    public PackingTypeType getPackingType() {
        return packingType;
    }

    /**
     * ����packingType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PackingTypeType }
     *     
     */
    public void setPackingType(PackingTypeType value) {
        this.packingType = value;
    }

    /**
     * ��ȡtimestamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * ����timestamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * ��ȡvendorExtensions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AnyListType }
     *     
     */
    public AnyListType getVendorExtensions() {
        return vendorExtensions;
    }

    /**
     * ����vendorExtensions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AnyListType }
     *     
     */
    public void setVendorExtensions(AnyListType value) {
        this.vendorExtensions = value;
    }


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
     *         &lt;element name="property" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="propName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="propValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "property"
    })
    public static class MsgSpecificProperties {

        @XmlElement(nillable = true)
        protected List<Header.MsgSpecificProperties.Property> property;

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Header.MsgSpecificProperties.Property }
         * 
         * 
         */
        public List<Header.MsgSpecificProperties.Property> getProperty() {
            if (property == null) {
                property = new ArrayList<Header.MsgSpecificProperties.Property>();
            }
            return this.property;
        }


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
         *         &lt;element name="propName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="propValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "propName",
            "propValue"
        })
        public static class Property {

            @XmlElement(required = true)
            protected String propName;
            @XmlElement(required = true)
            protected String propValue;

            /**
             * ��ȡpropName���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPropName() {
                return propName;
            }

            /**
             * ����propName���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPropName(String value) {
                this.propName = value;
            }

            /**
             * ��ȡpropValue���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPropValue() {
                return propValue;
            }

            /**
             * ����propValue���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPropValue(String value) {
                this.propValue = value;
            }

        }

    }

}
