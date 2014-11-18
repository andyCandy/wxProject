
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>TestSuiteCreateDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TestSuiteCreateDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="testSuiteName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="testSuiteDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestSuiteCreateDataType", propOrder = {
    "meName",
    "testSuiteName",
    "serviceName",
    "serviceType",
    "testSuiteDesc"
})
public class TestSuiteCreateDataType {

    @XmlElement(required = true)
    protected NamingAttributeType meName;
    @XmlElement(required = true)
    protected String testSuiteName;
    @XmlElement(required = true)
    protected String serviceName;
    @XmlElement(required = true)
    protected String serviceType;
    @XmlElement(required = true)
    protected String testSuiteDesc;

    /**
     * 获取meName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMeName() {
        return meName;
    }

    /**
     * 设置meName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMeName(NamingAttributeType value) {
        this.meName = value;
    }

    /**
     * 获取testSuiteName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestSuiteName() {
        return testSuiteName;
    }

    /**
     * 设置testSuiteName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestSuiteName(String value) {
        this.testSuiteName = value;
    }

    /**
     * 获取serviceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 设置serviceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * 获取serviceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * 设置serviceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * 获取testSuiteDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestSuiteDesc() {
        return testSuiteDesc;
    }

    /**
     * 设置testSuiteDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestSuiteDesc(String value) {
        this.testSuiteDesc = value;
    }

}
