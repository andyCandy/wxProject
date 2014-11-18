
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>MaintenancePointType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmepName���Ե�ֵ��
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
     * ����mepName���Ե�ֵ��
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
     * ��ȡmdLevel���Ե�ֵ��
     * 
     */
    public int getMdLevel() {
        return mdLevel;
    }

    /**
     * ����mdLevel���Ե�ֵ��
     * 
     */
    public void setMdLevel(int value) {
        this.mdLevel = value;
    }

    /**
     * ��ȡmepType���Ե�ֵ��
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
     * ����mepType���Ե�ֵ��
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
     * ��ȡinterface���Ե�ֵ��
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
     * ����interface���Ե�ֵ��
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
     * ��ȡvlanIdOfSubInterface���Ե�ֵ��
     * 
     */
    public int getVlanIdOfSubInterface() {
        return vlanIdOfSubInterface;
    }

    /**
     * ����vlanIdOfSubInterface���Ե�ֵ��
     * 
     */
    public void setVlanIdOfSubInterface(int value) {
        this.vlanIdOfSubInterface = value;
    }

    /**
     * ��ȡpeVlanIdOfSubInterface���Ե�ֵ��
     * 
     */
    public int getPeVlanIdOfSubInterface() {
        return peVlanIdOfSubInterface;
    }

    /**
     * ����peVlanIdOfSubInterface���Ե�ֵ��
     * 
     */
    public void setPeVlanIdOfSubInterface(int value) {
        this.peVlanIdOfSubInterface = value;
    }

    /**
     * ��ȡceVlanIdOfSubInterface���Ե�ֵ��
     * 
     */
    public int getCeVlanIdOfSubInterface() {
        return ceVlanIdOfSubInterface;
    }

    /**
     * ����ceVlanIdOfSubInterface���Ե�ֵ��
     * 
     */
    public void setCeVlanIdOfSubInterface(int value) {
        this.ceVlanIdOfSubInterface = value;
    }

    /**
     * ��ȡmepDirection���Ե�ֵ��
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
     * ����mepDirection���Ե�ֵ��
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
     * ��ȡenableCcmSend���Ե�ֵ��
     * 
     */
    public boolean isEnableCcmSend() {
        return enableCcmSend;
    }

    /**
     * ����enableCcmSend���Ե�ֵ��
     * 
     */
    public void setEnableCcmSend(boolean value) {
        this.enableCcmSend = value;
    }

    /**
     * ��ȡclearArpEntry���Ե�ֵ��
     * 
     */
    public boolean isClearArpEntry() {
        return clearArpEntry;
    }

    /**
     * ����clearArpEntry���Ե�ֵ��
     * 
     */
    public void setClearArpEntry(boolean value) {
        this.clearArpEntry = value;
    }

    /**
     * ��ȡqinQPeVlanId���Ե�ֵ��
     * 
     */
    public int getQinQPeVlanId() {
        return qinQPeVlanId;
    }

    /**
     * ����qinQPeVlanId���Ե�ֵ��
     * 
     */
    public void setQinQPeVlanId(int value) {
        this.qinQPeVlanId = value;
    }

    /**
     * ��ȡqinQCeVlanId���Ե�ֵ��
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
     * ����qinQCeVlanId���Ե�ֵ��
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
     * ��ȡdot1QVlanId���Ե�ֵ��
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
     * ����dot1QVlanId���Ե�ֵ��
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
     * ��ȡremoteMacAddress���Ե�ֵ��
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
     * ����remoteMacAddress���Ե�ֵ��
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
     * ��ȡenableCcmReceive���Ե�ֵ��
     * 
     */
    public boolean isEnableCcmReceive() {
        return enableCcmReceive;
    }

    /**
     * ����enableCcmReceive���Ե�ֵ��
     * 
     */
    public void setEnableCcmReceive(boolean value) {
        this.enableCcmReceive = value;
    }

    /**
     * ��ȡtriggerInterfaceRestart���Ե�ֵ��
     * 
     */
    public boolean isTriggerInterfaceRestart() {
        return triggerInterfaceRestart;
    }

    /**
     * ����triggerInterfaceRestart���Ե�ֵ��
     * 
     */
    public void setTriggerInterfaceRestart(boolean value) {
        this.triggerInterfaceRestart = value;
    }

    /**
     * ��ȡcreateTypeOnIf���Ե�ֵ��
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
     * ����createTypeOnIf���Ե�ֵ��
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
     * ��ȡcreateModeOnIf���Ե�ֵ��
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
     * ����createModeOnIf���Ե�ֵ��
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
     * ��ȡaddtionalInfo���Ե�ֵ��
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
     * ����addtionalInfo���Ե�ֵ��
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
