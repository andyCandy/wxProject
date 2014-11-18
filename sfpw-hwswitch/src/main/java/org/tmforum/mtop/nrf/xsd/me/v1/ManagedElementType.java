
package org.tmforum.mtop.nrf.xsd.me.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateListType;


/**
 * <p>ManagedElementType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ManagedElementType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manufactureDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="softwareVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isInSyncState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="supportedConnectionLayerRateList" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateListType"/>
 *         &lt;element name="communicationState" type="{http://www.tmforum.org/mtop/nrf/xsd/me/v1}CommunicationStateType"/>
 *         &lt;element name="asapRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="ipaddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addtionalCreateInfo" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType"/>
 *         &lt;element name="networkStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedElementType", propOrder = {
    "location",
    "manufacturer",
    "manufactureDate",
    "productName",
    "softwareVersion",
    "isInSyncState",
    "supportedConnectionLayerRateList",
    "communicationState",
    "asapRef",
    "ipaddress",
    "addtionalCreateInfo",
    "networkStatus"
})
public class ManagedElementType
    extends CommonResourceInfoType
{

    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String manufacturer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object manufactureDate;
    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected String softwareVersion;
    protected boolean isInSyncState;
    @XmlElement(required = true)
    protected LayerRateListType supportedConnectionLayerRateList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CommunicationStateType communicationState;
    @XmlElement(required = true)
    protected NamingAttributeType asapRef;
    @XmlElement(required = true)
    protected String ipaddress;
    @XmlElement(required = true)
    protected NameAndValueStringListType addtionalCreateInfo;
    @XmlElement(required = true)
    protected String networkStatus;

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * 获取manufacturer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * 设置manufacturer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * 获取manufactureDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getManufactureDate() {
        return manufactureDate;
    }

    /**
     * 设置manufactureDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setManufactureDate(Object value) {
        this.manufactureDate = value;
    }

    /**
     * 获取productName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置productName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * 获取softwareVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * 设置softwareVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVersion(String value) {
        this.softwareVersion = value;
    }

    /**
     * 获取isInSyncState属性的值。
     * 
     */
    public boolean isIsInSyncState() {
        return isInSyncState;
    }

    /**
     * 设置isInSyncState属性的值。
     * 
     */
    public void setIsInSyncState(boolean value) {
        this.isInSyncState = value;
    }

    /**
     * 获取supportedConnectionLayerRateList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LayerRateListType }
     *     
     */
    public LayerRateListType getSupportedConnectionLayerRateList() {
        return supportedConnectionLayerRateList;
    }

    /**
     * 设置supportedConnectionLayerRateList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateListType }
     *     
     */
    public void setSupportedConnectionLayerRateList(LayerRateListType value) {
        this.supportedConnectionLayerRateList = value;
    }

    /**
     * 获取communicationState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommunicationStateType }
     *     
     */
    public CommunicationStateType getCommunicationState() {
        return communicationState;
    }

    /**
     * 设置communicationState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationStateType }
     *     
     */
    public void setCommunicationState(CommunicationStateType value) {
        this.communicationState = value;
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

    /**
     * 获取ipaddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * 设置ipaddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpaddress(String value) {
        this.ipaddress = value;
    }

    /**
     * 获取addtionalCreateInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getAddtionalCreateInfo() {
        return addtionalCreateInfo;
    }

    /**
     * 设置addtionalCreateInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setAddtionalCreateInfo(NameAndValueStringListType value) {
        this.addtionalCreateInfo = value;
    }

    /**
     * 获取networkStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkStatus() {
        return networkStatus;
    }

    /**
     * 设置networkStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkStatus(String value) {
        this.networkStatus = value;
    }

}
