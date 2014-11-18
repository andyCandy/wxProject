
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>MaintenancePointType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MaintenancePointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mepName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="mdLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mepType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interface" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="vlanIdOfSubInterface" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="peVlanIdOfSubInterface" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ceVlanIdOfSubInterface" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mepDirection" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enableCcmSend" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="clearArpEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="QinQ_peVlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QinQ_ceVlanId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Dot1q_vlanId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remoteMacAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enableCcmReceive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="triggerInterfaceRestart" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="createTypeOnIf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createModeOnIf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addtionalInfo" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenancePointType", propOrder = {
    "mepName",
    "mdLevel",
    "mepType",
    "_interface",
    "vlanIdOfSubInterface",
    "peVlanIdOfSubInterface",
    "ceVlanIdOfSubInterface",
    "mepDirection",
    "enableCcmSend",
    "clearArpEntry",
    "qinQPeVlanId",
    "qinQCeVlanId",
    "dot1QVlanId",
    "remoteMacAddress",
    "enableCcmReceive",
    "triggerInterfaceRestart",
    "createTypeOnIf",
    "createModeOnIf",
    "addtionalInfo"
})
public class MaintenancePointType {

    @XmlElement(required = true)
    protected NamingAttributeType mepName;
    protected int mdLevel;
    @XmlElement(required = true)
    protected String mepType;
    @XmlElement(name = "interface", required = true)
    protected NamingAttributeType _interface;
    protected int vlanIdOfSubInterface;
    protected int peVlanIdOfSubInterface;
    protected int ceVlanIdOfSubInterface;
    @XmlElement(required = true)
    protected String mepDirection;
    protected boolean enableCcmSend;
    protected boolean clearArpEntry;
    @XmlElement(name = "QinQ_peVlanId")
    protected int qinQPeVlanId;
    @XmlElement(name = "QinQ_ceVlanId", required = true)
    protected String qinQCeVlanId;
    @XmlElement(name = "Dot1q_vlanId", required = true)
    protected String dot1QVlanId;
    @XmlElement(required = true)
    protected String remoteMacAddress;
    protected boolean enableCcmReceive;
    protected boolean triggerInterfaceRestart;
    @XmlElement(required = true)
    protected String createTypeOnIf;
    @XmlElement(required = true)
    protected String createModeOnIf;
    @XmlElement(required = true)
    protected NameAndValueStringListType addtionalInfo;

    /**
     * 获取mepName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMepName() {
        return mepName;
    }

    /**
     * 设置mepName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMepName(NamingAttributeType value) {
        this.mepName = value;
    }

    /**
     * 获取mdLevel属性的值。
     * 
     */
    public int getMdLevel() {
        return mdLevel;
    }

    /**
     * 设置mdLevel属性的值。
     * 
     */
    public void setMdLevel(int value) {
        this.mdLevel = value;
    }

    /**
     * 获取mepType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMepType() {
        return mepType;
    }

    /**
     * 设置mepType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMepType(String value) {
        this.mepType = value;
    }

    /**
     * 获取interface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getInterface() {
        return _interface;
    }

    /**
     * 设置interface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setInterface(NamingAttributeType value) {
        this._interface = value;
    }

    /**
     * 获取vlanIdOfSubInterface属性的值。
     * 
     */
    public int getVlanIdOfSubInterface() {
        return vlanIdOfSubInterface;
    }

    /**
     * 设置vlanIdOfSubInterface属性的值。
     * 
     */
    public void setVlanIdOfSubInterface(int value) {
        this.vlanIdOfSubInterface = value;
    }

    /**
     * 获取peVlanIdOfSubInterface属性的值。
     * 
     */
    public int getPeVlanIdOfSubInterface() {
        return peVlanIdOfSubInterface;
    }

    /**
     * 设置peVlanIdOfSubInterface属性的值。
     * 
     */
    public void setPeVlanIdOfSubInterface(int value) {
        this.peVlanIdOfSubInterface = value;
    }

    /**
     * 获取ceVlanIdOfSubInterface属性的值。
     * 
     */
    public int getCeVlanIdOfSubInterface() {
        return ceVlanIdOfSubInterface;
    }

    /**
     * 设置ceVlanIdOfSubInterface属性的值。
     * 
     */
    public void setCeVlanIdOfSubInterface(int value) {
        this.ceVlanIdOfSubInterface = value;
    }

    /**
     * 获取mepDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMepDirection() {
        return mepDirection;
    }

    /**
     * 设置mepDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMepDirection(String value) {
        this.mepDirection = value;
    }

    /**
     * 获取enableCcmSend属性的值。
     * 
     */
    public boolean isEnableCcmSend() {
        return enableCcmSend;
    }

    /**
     * 设置enableCcmSend属性的值。
     * 
     */
    public void setEnableCcmSend(boolean value) {
        this.enableCcmSend = value;
    }

    /**
     * 获取clearArpEntry属性的值。
     * 
     */
    public boolean isClearArpEntry() {
        return clearArpEntry;
    }

    /**
     * 设置clearArpEntry属性的值。
     * 
     */
    public void setClearArpEntry(boolean value) {
        this.clearArpEntry = value;
    }

    /**
     * 获取qinQPeVlanId属性的值。
     * 
     */
    public int getQinQPeVlanId() {
        return qinQPeVlanId;
    }

    /**
     * 设置qinQPeVlanId属性的值。
     * 
     */
    public void setQinQPeVlanId(int value) {
        this.qinQPeVlanId = value;
    }

    /**
     * 获取qinQCeVlanId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQinQCeVlanId() {
        return qinQCeVlanId;
    }

    /**
     * 设置qinQCeVlanId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQinQCeVlanId(String value) {
        this.qinQCeVlanId = value;
    }

    /**
     * 获取dot1QVlanId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDot1QVlanId() {
        return dot1QVlanId;
    }

    /**
     * 设置dot1QVlanId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDot1QVlanId(String value) {
        this.dot1QVlanId = value;
    }

    /**
     * 获取remoteMacAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteMacAddress() {
        return remoteMacAddress;
    }

    /**
     * 设置remoteMacAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteMacAddress(String value) {
        this.remoteMacAddress = value;
    }

    /**
     * 获取enableCcmReceive属性的值。
     * 
     */
    public boolean isEnableCcmReceive() {
        return enableCcmReceive;
    }

    /**
     * 设置enableCcmReceive属性的值。
     * 
     */
    public void setEnableCcmReceive(boolean value) {
        this.enableCcmReceive = value;
    }

    /**
     * 获取triggerInterfaceRestart属性的值。
     * 
     */
    public boolean isTriggerInterfaceRestart() {
        return triggerInterfaceRestart;
    }

    /**
     * 设置triggerInterfaceRestart属性的值。
     * 
     */
    public void setTriggerInterfaceRestart(boolean value) {
        this.triggerInterfaceRestart = value;
    }

    /**
     * 获取createTypeOnIf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTypeOnIf() {
        return createTypeOnIf;
    }

    /**
     * 设置createTypeOnIf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTypeOnIf(String value) {
        this.createTypeOnIf = value;
    }

    /**
     * 获取createModeOnIf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateModeOnIf() {
        return createModeOnIf;
    }

    /**
     * 设置createModeOnIf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateModeOnIf(String value) {
        this.createModeOnIf = value;
    }

    /**
     * 获取addtionalInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getAddtionalInfo() {
        return addtionalInfo;
    }

    /**
     * 设置addtionalInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setAddtionalInfo(NameAndValueStringListType value) {
        this.addtionalInfo = value;
    }

}
