
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TestSuiteListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TestSuiteListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testSuite" type="{http://www.tmforum.org/mtop/nra/xsd/ethoam/v1}TestSuiteType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestSuiteListType", propOrder = {
    "testSuite"
})
public class TestSuiteListType {

    @XmlElement(nillable = true)
    protected List<TestSuiteType> testSuite;

    /**
     * Gets the value of the testSuite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSuite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSuite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSuiteType }
     * 
     * 
     */
    public List<TestSuiteType> getTestSuite() {
        if (testSuite == null) {
            testSuite = new ArrayList<TestSuiteType>();
        }
        return this.testSuite;
    }

}
