
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;


/**
 * <p>HWVPLSExtensionsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmacLearning���Ե�ֵ��
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
     * ����macLearning���Ե�ֵ��
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
     * ��ȡmacLearningStyle���Ե�ֵ��
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
     * ����macLearningStyle���Ե�ֵ��
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
     * ��ȡmaxMacLimit���Ե�ֵ��
     * 
     */
    public int getMaxMacLimit() {
        return maxMacLimit;
    }

    /**
     * ����maxMacLimit���Ե�ֵ��
     * 
     */
    public void setMaxMacLimit(int value) {
        this.maxMacLimit = value;
    }

    /**
     * ��ȡmacLearningInterval���Ե�ֵ��
     * 
     */
    public int getMacLearningInterval() {
        return macLearningInterval;
    }

    /**
     * ����macLearningInterval���Ե�ֵ��
     * 
     */
    public void setMacLearningInterval(int value) {
        this.macLearningInterval = value;
    }

    /**
     * ��ȡagingAbility���Ե�ֵ��
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
     * ����agingAbility���Ե�ֵ��
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
     * ��ȡagingTime���Ե�ֵ��
     * 
     */
    public int getAgingTime() {
        return agingTime;
    }

    /**
     * ����agingTime���Ե�ֵ��
     * 
     */
    public void setAgingTime(int value) {
        this.agingTime = value;
    }

    /**
     * ��ȡmaxMacMonitor���Ե�ֵ��
     * 
     */
    public int getMaxMacMonitor() {
        return maxMacMonitor;
    }

    /**
     * ����maxMacMonitor���Ե�ֵ��
     * 
     */
    public void setMaxMacMonitor(int value) {
        this.maxMacMonitor = value;
    }

    /**
     * ��ȡminMacMonitor���Ե�ֵ��
     * 
     */
    public int getMinMacMonitor() {
        return minMacMonitor;
    }

    /**
     * ����minMacMonitor���Ե�ֵ��
     * 
     */
    public void setMinMacMonitor(int value) {
        this.minMacMonitor = value;
    }

    /**
     * ��ȡmacMaxAction���Ե�ֵ��
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
     * ����macMaxAction���Ե�ֵ��
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
     * ��ȡmacWithdraw���Ե�ֵ��
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
     * ����macWithdraw���Ե�ֵ��
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
     * ��ȡupenpeMacWithdraw���Ե�ֵ��
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
     * ����upenpeMacWithdraw���Ե�ֵ��
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
     * ��ȡnpeupeMacWithdraw���Ե�ֵ��
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
     * ����npeupeMacWithdraw���Ե�ֵ��
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
     * ��ȡupeupeMacWithdraw���Ե�ֵ��
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
     * ����upeupeMacWithdraw���Ե�ֵ��
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
     * ��ȡadditionalParameters���Ե�ֵ��
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
     * ����additionalParameters���Ե�ֵ��
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
     * ��ȡstaticMACAddressList���Ե�ֵ��
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
     * ����staticMACAddressList���Ե�ֵ��
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
     * ��ȡshgList���Ե�ֵ��
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
     * ����shgList���Ե�ֵ��
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
     * ��ȡisolate���Ե�ֵ��
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
     * ����isolate���Ե�ֵ��
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
