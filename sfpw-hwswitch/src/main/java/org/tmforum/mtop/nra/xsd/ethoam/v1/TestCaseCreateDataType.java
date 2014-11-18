
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>TestCaseCreateDataType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TestCaseCreateDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testSuiteName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="testCaseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="testCaseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="testCaseDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceDevice" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="sourceDeviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="testCaseParaInfo" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType"/>
 *         &lt;element name="advancedConfInfo" type="{http://www.tmforum.org/mtop/nra/xsd/ethoam/v1}AdvancedConfType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestCaseCreateDataType", propOrder = {
    "testSuiteName",
    "testCaseName",
    "testCaseType",
    "testCaseDesc",
    "templateName",
    "sourceDevice",
    "sourceDeviceName",
    "sourceAddress",
    "testCaseParaInfo",
    "advancedConfInfo"
})
public class TestCaseCreateDataType {

    @XmlElement(required = true)
    protected NamingAttributeType testSuiteName;
    @XmlElement(required = true)
    protected String testCaseName;
    @XmlElement(required = true)
    protected String testCaseType;
    @XmlElement(required = true)
    protected String testCaseDesc;
    @XmlElement(required = true)
    protected String templateName;
    @XmlElement(required = true)
    protected NamingAttributeType sourceDevice;
    @XmlElement(required = true)
    protected String sourceDeviceName;
    @XmlElement(required = true)
    protected String sourceAddress;
    @XmlElement(required = true)
    protected NameAndValueStringListType testCaseParaInfo;
    @XmlElement(required = true)
    protected AdvancedConfType advancedConfInfo;

    /**
     * ��ȡtestSuiteName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getTestSuiteName() {
        return testSuiteName;
    }

    /**
     * ����testSuiteName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setTestSuiteName(NamingAttributeType value) {
        this.testSuiteName = value;
    }

    /**
     * ��ȡtestCaseName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCaseName() {
        return testCaseName;
    }

    /**
     * ����testCaseName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCaseName(String value) {
        this.testCaseName = value;
    }

    /**
     * ��ȡtestCaseType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCaseType() {
        return testCaseType;
    }

    /**
     * ����testCaseType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCaseType(String value) {
        this.testCaseType = value;
    }

    /**
     * ��ȡtestCaseDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCaseDesc() {
        return testCaseDesc;
    }

    /**
     * ����testCaseDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCaseDesc(String value) {
        this.testCaseDesc = value;
    }

    /**
     * ��ȡtemplateName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * ����templateName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * ��ȡsourceDevice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getSourceDevice() {
        return sourceDevice;
    }

    /**
     * ����sourceDevice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setSourceDevice(NamingAttributeType value) {
        this.sourceDevice = value;
    }

    /**
     * ��ȡsourceDeviceName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDeviceName() {
        return sourceDeviceName;
    }

    /**
     * ����sourceDeviceName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDeviceName(String value) {
        this.sourceDeviceName = value;
    }

    /**
     * ��ȡsourceAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /**
     * ����sourceAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAddress(String value) {
        this.sourceAddress = value;
    }

    /**
     * ��ȡtestCaseParaInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getTestCaseParaInfo() {
        return testCaseParaInfo;
    }

    /**
     * ����testCaseParaInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setTestCaseParaInfo(NameAndValueStringListType value) {
        this.testCaseParaInfo = value;
    }

    /**
     * ��ȡadvancedConfInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AdvancedConfType }
     *     
     */
    public AdvancedConfType getAdvancedConfInfo() {
        return advancedConfInfo;
    }

    /**
     * ����advancedConfInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AdvancedConfType }
     *     
     */
    public void setAdvancedConfInfo(AdvancedConfType value) {
        this.advancedConfInfo = value;
    }

}
