
package org.tmforum.mtop.nra.xsd.pgp.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AnyListType;


/**
 * <p>ProtectionGroupParameterListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取switchMode属性的值。
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
     * 设置switchMode属性的值。
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
     * 获取springProtocol属性的值。
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
     * 设置springProtocol属性的值。
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
     * 获取springNodeId属性的值。
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
     * 设置springNodeId属性的值。
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
     * 获取switchPosition属性的值。
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
     * 设置switchPosition属性的值。
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
     * 获取nonPreEmptibleTraffic属性的值。
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
     * 设置nonPreEmptibleTraffic属性的值。
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
     * 获取wtrTime属性的值。
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
     * 设置wtrTime属性的值。
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
     * 获取holdOffTime属性的值。
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
     * 设置holdOffTime属性的值。
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
     * 获取lodNumSwitches属性的值。
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
     * 设置lodNumSwitches属性的值。
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
     * 获取lodDuration属性的值。
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
     * 设置lodDuration属性的值。
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
     * 获取tandemSwitching属性的值。
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
     * 设置tandemSwitching属性的值。
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
     * 获取bundleSwitching属性的值。
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
     * 设置bundleSwitching属性的值。
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
     * 获取hitless属性的值。
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
     * 设置hitless属性的值。
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
     * 获取exerciseOn属性的值。
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
     * 设置exerciseOn属性的值。
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
     * 获取availabilityStatus属性的值。
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
     * 设置availabilityStatus属性的值。
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
     * 获取switchCriteriaEnable属性的值。
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
     * 设置switchCriteriaEnable属性的值。
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
     * 获取privilegedChannel属性的值。
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
     * 设置privilegedChannel属性的值。
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
     * 获取vendorExtensions属性的值。
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
     * 设置vendorExtensions属性的值。
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
     * 获取enableSD属性的值。
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
     * 设置enableSD属性的值。
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
     * 获取workMode属性的值。
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
     * 设置workMode属性的值。
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
