
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;


/**
 * <p>HWVPLSExtensionsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HWVPLSExtensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="macLearning" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="macLearningStyle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxMacLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="macLearningInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="agingAbility" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agingTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxMacMonitor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minMacMonitor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="macMaxAction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="macWithdraw" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UPE_NPEMacWithdraw" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NPE_UPEMacWithdraw" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UPE_UPEMacWithdraw" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalParameters" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType" minOccurs="0"/>
 *         &lt;element name="staticMACAddressList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}StaticMACAddressListType"/>
 *         &lt;element name="shgList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}SHGListType"/>
 *         &lt;element name="isolate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HWVPLSExtensionsType", propOrder = {
    "macLearning",
    "macLearningStyle",
    "maxMacLimit",
    "macLearningInterval",
    "agingAbility",
    "agingTime",
    "maxMacMonitor",
    "minMacMonitor",
    "macMaxAction",
    "macWithdraw",
    "upenpeMacWithdraw",
    "npeupeMacWithdraw",
    "upeupeMacWithdraw",
    "additionalParameters",
    "staticMACAddressList",
    "shgList",
    "isolate"
})
public class HWVPLSExtensionsType {

    @XmlElement(required = true)
    protected String macLearning;
    @XmlElement(required = true)
    protected String macLearningStyle;
    protected int maxMacLimit;
    protected int macLearningInterval;
    @XmlElement(required = true)
    protected String agingAbility;
    protected int agingTime;
    protected int maxMacMonitor;
    protected int minMacMonitor;
    @XmlElement(required = true)
    protected String macMaxAction;
    @XmlElement(required = true)
    protected String macWithdraw;
    @XmlElement(name = "UPE_NPEMacWithdraw", required = true)
    protected String upenpeMacWithdraw;
    @XmlElement(name = "NPE_UPEMacWithdraw", required = true)
    protected String npeupeMacWithdraw;
    @XmlElement(name = "UPE_UPEMacWithdraw", required = true)
    protected String upeupeMacWithdraw;
    protected NameAndValueStringListType additionalParameters;
    @XmlElement(required = true)
    protected StaticMACAddressListType staticMACAddressList;
    @XmlElement(required = true)
    protected SHGListType shgList;
    @XmlElement(required = true)
    protected String isolate;

    /**
     * 获取macLearning属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacLearning() {
        return macLearning;
    }

    /**
     * 设置macLearning属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacLearning(String value) {
        this.macLearning = value;
    }

    /**
     * 获取macLearningStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacLearningStyle() {
        return macLearningStyle;
    }

    /**
     * 设置macLearningStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacLearningStyle(String value) {
        this.macLearningStyle = value;
    }

    /**
     * 获取maxMacLimit属性的值。
     * 
     */
    public int getMaxMacLimit() {
        return maxMacLimit;
    }

    /**
     * 设置maxMacLimit属性的值。
     * 
     */
    public void setMaxMacLimit(int value) {
        this.maxMacLimit = value;
    }

    /**
     * 获取macLearningInterval属性的值。
     * 
     */
    public int getMacLearningInterval() {
        return macLearningInterval;
    }

    /**
     * 设置macLearningInterval属性的值。
     * 
     */
    public void setMacLearningInterval(int value) {
        this.macLearningInterval = value;
    }

    /**
     * 获取agingAbility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgingAbility() {
        return agingAbility;
    }

    /**
     * 设置agingAbility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgingAbility(String value) {
        this.agingAbility = value;
    }

    /**
     * 获取agingTime属性的值。
     * 
     */
    public int getAgingTime() {
        return agingTime;
    }

    /**
     * 设置agingTime属性的值。
     * 
     */
    public void setAgingTime(int value) {
        this.agingTime = value;
    }

    /**
     * 获取maxMacMonitor属性的值。
     * 
     */
    public int getMaxMacMonitor() {
        return maxMacMonitor;
    }

    /**
     * 设置maxMacMonitor属性的值。
     * 
     */
    public void setMaxMacMonitor(int value) {
        this.maxMacMonitor = value;
    }

    /**
     * 获取minMacMonitor属性的值。
     * 
     */
    public int getMinMacMonitor() {
        return minMacMonitor;
    }

    /**
     * 设置minMacMonitor属性的值。
     * 
     */
    public void setMinMacMonitor(int value) {
        this.minMacMonitor = value;
    }

    /**
     * 获取macMaxAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacMaxAction() {
        return macMaxAction;
    }

    /**
     * 设置macMaxAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacMaxAction(String value) {
        this.macMaxAction = value;
    }

    /**
     * 获取macWithdraw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacWithdraw() {
        return macWithdraw;
    }

    /**
     * 设置macWithdraw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacWithdraw(String value) {
        this.macWithdraw = value;
    }

    /**
     * 获取upenpeMacWithdraw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPENPEMacWithdraw() {
        return upenpeMacWithdraw;
    }

    /**
     * 设置upenpeMacWithdraw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPENPEMacWithdraw(String value) {
        this.upenpeMacWithdraw = value;
    }

    /**
     * 获取npeupeMacWithdraw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPEUPEMacWithdraw() {
        return npeupeMacWithdraw;
    }

    /**
     * 设置npeupeMacWithdraw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPEUPEMacWithdraw(String value) {
        this.npeupeMacWithdraw = value;
    }

    /**
     * 获取upeupeMacWithdraw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPEUPEMacWithdraw() {
        return upeupeMacWithdraw;
    }

    /**
     * 设置upeupeMacWithdraw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPEUPEMacWithdraw(String value) {
        this.upeupeMacWithdraw = value;
    }

    /**
     * 获取additionalParameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getAdditionalParameters() {
        return additionalParameters;
    }

    /**
     * 设置additionalParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setAdditionalParameters(NameAndValueStringListType value) {
        this.additionalParameters = value;
    }

    /**
     * 获取staticMACAddressList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StaticMACAddressListType }
     *     
     */
    public StaticMACAddressListType getStaticMACAddressList() {
        return staticMACAddressList;
    }

    /**
     * 设置staticMACAddressList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StaticMACAddressListType }
     *     
     */
    public void setStaticMACAddressList(StaticMACAddressListType value) {
        this.staticMACAddressList = value;
    }

    /**
     * 获取shgList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SHGListType }
     *     
     */
    public SHGListType getShgList() {
        return shgList;
    }

    /**
     * 设置shgList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SHGListType }
     *     
     */
    public void setShgList(SHGListType value) {
        this.shgList = value;
    }

    /**
     * 获取isolate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsolate() {
        return isolate;
    }

    /**
     * 设置isolate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsolate(String value) {
        this.isolate = value;
    }

}
