
package org.tmforum.mtop.fmw.xsd.fts.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.cei.v1.CommonEventInformationType;


/**
 * <p>FileTransferStatusType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FileTransferStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/cei/v1}CommonEventInformationType">
 *       &lt;sequence>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transferStatus" type="{http://www.tmforum.org/mtop/fmw/xsd/fts/v1}FileTransferStatusEnumType" minOccurs="0"/>
 *         &lt;element name="percentComplete" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="failureReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileTransferStatusType", propOrder = {
    "fileName",
    "transferStatus",
    "percentComplete",
    "failureReason"
})
public class FileTransferStatusType
    extends CommonEventInformationType
{

    protected String fileName;
    @XmlSchemaType(name = "string")
    protected FileTransferStatusEnumType transferStatus;
    @XmlSchemaType(name = "unsignedInt")
    protected Long percentComplete;
    protected String failureReason;

    /**
     * 获取fileName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置fileName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * 获取transferStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FileTransferStatusEnumType }
     *     
     */
    public FileTransferStatusEnumType getTransferStatus() {
        return transferStatus;
    }

    /**
     * 设置transferStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransferStatusEnumType }
     *     
     */
    public void setTransferStatus(FileTransferStatusEnumType value) {
        this.transferStatus = value;
    }

    /**
     * 获取percentComplete属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPercentComplete() {
        return percentComplete;
    }

    /**
     * 设置percentComplete属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPercentComplete(Long value) {
        this.percentComplete = value;
    }

    /**
     * 获取failureReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * 设置failureReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureReason(String value) {
        this.failureReason = value;
    }

}
