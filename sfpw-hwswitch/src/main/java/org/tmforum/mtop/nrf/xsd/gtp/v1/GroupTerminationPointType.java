
package org.tmforum.mtop.nrf.xsd.gtp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrf.xsd.com.v1.TerminationPointConnectionStateType;


/**
 * <p>GroupTerminationPointType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GroupTerminationPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="isReportingAlarms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="containedTpRefList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *         &lt;element name="connectionState" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}TerminationPointConnectionStateType"/>
 *         &lt;element name="asapRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupTerminationPointType", propOrder = {
    "isReportingAlarms",
    "containedTpRefList",
    "connectionState",
    "asapRef"
})
public class GroupTerminationPointType
    extends CommonResourceInfoType
{

    protected boolean isReportingAlarms;
    @XmlElement(required = true)
    protected NamingAttributeListType containedTpRefList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TerminationPointConnectionStateType connectionState;
    @XmlElement(required = true)
    protected NamingAttributeType asapRef;

    /**
     * 获取isReportingAlarms属性的值。
     * 
     */
    public boolean isIsReportingAlarms() {
        return isReportingAlarms;
    }

    /**
     * 设置isReportingAlarms属性的值。
     * 
     */
    public void setIsReportingAlarms(boolean value) {
        this.isReportingAlarms = value;
    }

    /**
     * 获取containedTpRefList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getContainedTpRefList() {
        return containedTpRefList;
    }

    /**
     * 设置containedTpRefList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setContainedTpRefList(NamingAttributeListType value) {
        this.containedTpRefList = value;
    }

    /**
     * 获取connectionState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointConnectionStateType }
     *     
     */
    public TerminationPointConnectionStateType getConnectionState() {
        return connectionState;
    }

    /**
     * 设置connectionState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointConnectionStateType }
     *     
     */
    public void setConnectionState(TerminationPointConnectionStateType value) {
        this.connectionState = value;
    }

    /**
     * 获取asapRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getAsapRef() {
        return asapRef;
    }

    /**
     * 设置asapRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setAsapRef(NamingAttributeType value) {
        this.asapRef = value;
    }

}
