
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TestSuiteResultInfoType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtestCaseResultInfoList���Ե�ֵ��
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
     * ����testCaseResultInfoList���Ե�ֵ��
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
