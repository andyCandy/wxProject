
package org.tmforum.mtop.nra.xsd.pgp.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AnyListType;


/**
 * <p>ProtectionGroupParameterListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ProtectionGroupParameterListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="switchMode" type="{http://www.tmforum.org/mtop/nra/xsd/pgp/v1}SwitchModeType" minOccurs="0"/>
 *         &lt;element name="springProtocol" type="{http://www.tmforum.org/mtop/nra/xsd/pgp/v1}SpringProtocolType" minOccurs="0"/>
 *         &lt;element name="springNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="switchPosition" type="{http://www.tmforum.org/mtop/nra/xsd/pgp/v1}SwitchPositionType" minOccurs="0"/>
 *         &lt;element name="nonPreEmptibleTraffic" type="{http://www.tmforum.org/mtop/nra/xsd/pgp/v1}NonPreEmptibleTrafficType" minOccurs="0"/>
 *         &lt;element name="wtrTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="holdOffTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lodNumSwitches" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lodDuration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="tandemSwitching" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bundleSwitching" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hitless" type="{http://www.tmforum.org/mtop/nra/xsd/pgp/v1}HitlessType" minOccurs="0"/>
 *         &lt;element name="exerciseOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="availabilityStatus" type="{http://www.tmforum.org/mtop/nra/xsd/pgp/v1}AvailabilityStatusType" minOccurs="0"/>
 *         &lt;element name="switchCriteriaEnable" type="{http://www.tmforum.org/mtop/nra/xsd/pgp/v1}SwitchCriteriaEnableType" minOccurs="0"/>
 *         &lt;element name="privilegedChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorExtensions" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AnyListType" minOccurs="0"/>
 *         &lt;element name="enableSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionGroupParameterListType", propOrder = {
    "switchMode",
    "springProtocol",
    "springNodeId",
    "switchPosition",
    "nonPreEmptibleTraffic",
    "wtrTime",
    "holdOffTime",
    "lodNumSwitches",
    "lodDuration",
    "tandemSwitching",
    "bundleSwitching",
    "hitless",
    "exerciseOn",
    "availabilityStatus",
    "switchCriteriaEnable",
    "privilegedChannel",
    "vendorExtensions",
    "enableSD",
    "workMode"
})
public class ProtectionGroupParameterListType {

    protected SwitchModeType switchMode;
    protected SpringProtocolType springProtocol;
    protected String springNodeId;
    @XmlSchemaType(name = "string")
    protected SwitchPositionType switchPosition;
    @XmlSchemaType(name = "string")
    protected NonPreEmptibleTrafficType nonPreEmptibleTraffic;
    protected BigInteger wtrTime;
    protected String holdOffTime;
    protected Long lodNumSwitches;
    protected BigInteger lodDuration;
    protected String tandemSwitching;
    protected String bundleSwitching;
    @XmlSchemaType(name = "string")
    protected HitlessType hitless;
    protected Boolean exerciseOn;
    protected AvailabilityStatusType availabilityStatus;
    protected SwitchCriteriaEnableType switchCriteriaEnable;
    protected String privilegedChannel;
    protected AnyListType vendorExtensions;
    protected String enableSD;
    protected String workMode;

    /**
     * ��ȡswitchMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SwitchModeType }
     *     
     */
    public SwitchModeType getSwitchMode() {
        return switchMode;
    }

    /**
     * ����switchMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchModeType }
     *     
     */
    public void setSwitchMode(SwitchModeType value) {
        this.switchMode = value;
    }

    /**
     * ��ȡspringProtocol���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SpringProtocolType }
     *     
     */
    public SpringProtocolType getSpringProtocol() {
        return springProtocol;
    }

    /**
     * ����springProtocol���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SpringProtocolType }
     *     
     */
    public void setSpringProtocol(SpringProtocolType value) {
        this.springProtocol = value;
    }

    /**
     * ��ȡspringNodeId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpringNodeId() {
        return springNodeId;
    }

    /**
     * ����springNodeId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpringNodeId(String value) {
        this.springNodeId = value;
    }

    /**
     * ��ȡswitchPosition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SwitchPositionType }
     *     
     */
    public SwitchPositionType getSwitchPosition() {
        return switchPosition;
    }

    /**
     * ����switchPosition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchPositionType }
     *     
     */
    public void setSwitchPosition(SwitchPositionType value) {
        this.switchPosition = value;
    }

    /**
     * ��ȡnonPreEmptibleTraffic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NonPreEmptibleTrafficType }
     *     
     */
    public NonPreEmptibleTrafficType getNonPreEmptibleTraffic() {
        return nonPreEmptibleTraffic;
    }

    /**
     * ����nonPreEmptibleTraffic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NonPreEmptibleTrafficType }
     *     
     */
    public void setNonPreEmptibleTraffic(NonPreEmptibleTrafficType value) {
        this.nonPreEmptibleTraffic = value;
    }

    /**
     * ��ȡwtrTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWtrTime() {
        return wtrTime;
    }

    /**
     * ����wtrTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWtrTime(BigInteger value) {
        this.wtrTime = value;
    }

    /**
     * ��ȡholdOffTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldOffTime() {
        return holdOffTime;
    }

    /**
     * ����holdOffTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldOffTime(String value) {
        this.holdOffTime = value;
    }

    /**
     * ��ȡlodNumSwitches���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLodNumSwitches() {
        return lodNumSwitches;
    }

    /**
     * ����lodNumSwitches���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLodNumSwitches(Long value) {
        this.lodNumSwitches = value;
    }

    /**
     * ��ȡlodDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLodDuration() {
        return lodDuration;
    }

    /**
     * ����lodDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLodDuration(BigInteger value) {
        this.lodDuration = value;
    }

    /**
     * ��ȡtandemSwitching���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTandemSwitching() {
        return tandemSwitching;
    }

    /**
     * ����tandemSwitching���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTandemSwitching(String value) {
        this.tandemSwitching = value;
    }

    /**
     * ��ȡbundleSwitching���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleSwitching() {
        return bundleSwitching;
    }

    /**
     * ����bundleSwitching���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleSwitching(String value) {
        this.bundleSwitching = value;
    }

    /**
     * ��ȡhitless���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HitlessType }
     *     
     */
    public HitlessType getHitless() {
        return hitless;
    }

    /**
     * ����hitless���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HitlessType }
     *     
     */
    public void setHitless(HitlessType value) {
        this.hitless = value;
    }

    /**
     * ��ȡexerciseOn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExerciseOn() {
        return exerciseOn;
    }

    /**
     * ����exerciseOn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExerciseOn(Boolean value) {
        this.exerciseOn = value;
    }

    /**
     * ��ȡavailabilityStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityStatusType }
     *     
     */
    public AvailabilityStatusType getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * ����availabilityStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityStatusType }
     *     
     */
    public void setAvailabilityStatus(AvailabilityStatusType value) {
        this.availabilityStatus = value;
    }

    /**
     * ��ȡswitchCriteriaEnable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SwitchCriteriaEnableType }
     *     
     */
    public SwitchCriteriaEnableType getSwitchCriteriaEnable() {
        return switchCriteriaEnable;
    }

    /**
     * ����switchCriteriaEnable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchCriteriaEnableType }
     *     
     */
    public void setSwitchCriteriaEnable(SwitchCriteriaEnableType value) {
        this.switchCriteriaEnable = value;
    }

    /**
     * ��ȡprivilegedChannel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivilegedChannel() {
        return privilegedChannel;
    }

    /**
     * ����privilegedChannel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivilegedChannel(String value) {
        this.privilegedChannel = value;
    }

    /**
     * ��ȡvendorExtensions���Ե�ֵ��
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
     * ����vendorExtensions���Ե�ֵ��
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
     * ��ȡenableSD���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableSD() {
        return enableSD;
    }

    /**
     * ����enableSD���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableSD(String value) {
        this.enableSD = value;
    }

    /**
     * ��ȡworkMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkMode() {
        return workMode;
    }

    /**
     * ����workMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkMode(String value) {
        this.workMode = value;
    }

}
