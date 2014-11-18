
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TestSuiteResultInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TestSuiteResultInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testCaseResultInfoList" type="{http://www.tmforum.org/mtop/nra/xsd/ethoam/v1}TestCaseResultInfoListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestSuiteResultInfoType", propOrder = {
    "testCaseResultInfoList"
})
public class TestSuiteResultInfoType {

    @XmlElement(required = true)
    protected TestCaseResultInfoListType testCaseResultInfoList;

    /**
     * 获取testCaseResultInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TestCaseResultInfoListType }
     *     
     */
    public TestCaseResultInfoListType getTestCaseResultInfoList() {
        return testCaseResultInfoList;
    }

    /**
     * 设置testCaseResultInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TestCaseResultInfoListType }
     *     
     */
    public void setTestCaseResultInfoList(TestCaseResultInfoListType value) {
        this.testCaseResultInfoList = value;
    }

}
