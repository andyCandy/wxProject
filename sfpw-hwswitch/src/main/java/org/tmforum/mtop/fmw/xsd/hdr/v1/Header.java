
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
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取activityName属性的值。
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
     * 设置activityName属性的值。
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
     * 获取msgName属性的值。
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
     * 设置msgName属性的值。
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
     * 获取msgType属性的值。
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
     * 设置msgType属性的值。
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
     * 获取senderURI属性的值。
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
     * 设置senderURI属性的值。
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
     * 获取destinationURI属性的值。
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
     * 设置destinationURI属性的值。
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
     * 获取replyToURI属性的值。
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
     * 设置replyToURI属性的值。
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
     * 获取originatorURI属性的值。
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
     * 设置originatorURI属性的值。
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
     * 获取failureReplytoURI属性的值。
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
     * 设置failureReplytoURI属性的值。
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
     * 获取activityStatus属性的值。
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
     * 设置activityStatus属性的值。
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
     * 获取correlationId属性的值。
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
     * 设置correlationId属性的值。
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
     * 获取security属性的值。
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
     * 设置security属性的值。
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
     * 获取securityType属性的值。
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
     * 设置securityType属性的值。
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
     * 获取priority属性的值。
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
     * 设置priority属性的值。
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
     * 获取msgSpecificProperties属性的值。
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
     * 设置msgSpecificProperties属性的值。
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
     * 获取communicationPattern属性的值。
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
     * 设置communicationPattern属性的值。
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
     * 获取communicationStyle属性的值。
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
     * 设置communicationStyle属性的值。
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
     * 获取requestedBatchSize属性的值。
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
     * 设置requestedBatchSize属性的值。
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
     * 获取batchSequenceNumber属性的值。
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
     * 设置batchSequenceNumber属性的值。
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
     * 获取batchSequenceEndOfReply属性的值。
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
     * 设置batchSequenceEndOfReply属性的值。
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
     * 获取iteratorReferenceURI属性的值。
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
     * 设置iteratorReferenceURI属性的值。
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
     * 获取fileLocationURI属性的值。
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
     * 设置fileLocationURI属性的值。
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
     * 获取compressionType属性的值。
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
     * 设置compressionType属性的值。
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
     * 获取packingType属性的值。
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
     * 设置packingType属性的值。
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
     * 获取timestamp属性的值。
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
     * 设置timestamp属性的值。
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
     * 获取vendorExtensions属性的值。
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
     * 设置vendorExtensions属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取propName属性的值。
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
             * 设置propName属性的值。
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
             * 获取propValue属性的值。
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
             * 设置propValue属性的值。
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
