
package org.tmforum.mtop.nrf.xsd.cc.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AliasNameListType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AnyListType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.itu.v1.X721AdministrativeStateType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersListType;
import org.tmforum.mtop.nrf.xsd.com.v1.ConnectionDirectionType;
import org.tmforum.mtop.nrf.xsd.com.v1.SubnetworkConnectionTypeType;
import org.tmforum.mtop.nrf.xsd.tpdata.v1.TerminationPointDataListType;


/**
 * <p>CrossConnectType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CrossConnectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="userLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aliasNameList" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AliasNameListType"/>
 *         &lt;element name="transmissionParametersList" type="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}LayeredParametersListType"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="administrativeState" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}X721.AdministrativeStateType"/>
 *         &lt;element name="direction" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}ConnectionDirectionType"/>
 *         &lt;element name="ccType" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}SubnetworkConnectionTypeType"/>
 *         &lt;element name="isFixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="aEndRefList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aEndName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="zEndRefList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="zEndName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="aEndTpDataList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}TerminationPointDataListType"/>
 *         &lt;element name="zEndTpDataList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}TerminationPointDataListType"/>
 *         &lt;element name="connectionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routeActualState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routeAdminState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isRouteExclusive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="routeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isRouteIntended" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isRouteInUseBy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vendorExtensions" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AnyListType" minOccurs="0"/>
 *         &lt;element name="additionalInfo" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossConnectType", propOrder = {
    "name",
    "userLabel",
    "aliasNameList",
    "transmissionParametersList",
    "isActive",
    "administrativeState",
    "direction",
    "ccType",
    "isFixed",
    "aEndRefList",
    "zEndRefList",
    "aEndTpDataList",
    "zEndTpDataList",
    "connectionId",
    "routeActualState",
    "routeAdminState",
    "isRouteExclusive",
    "routeId",
    "isRouteIntended",
    "isRouteInUseBy",
    "vendorExtensions",
    "additionalInfo"
})
public class CrossConnectType {

    @XmlElement(required = true)
    protected NamingAttributeType name;
    @XmlElement(required = true)
    protected String userLabel;
    @XmlElement(required = true)
    protected AliasNameListType aliasNameList;
    @XmlElement(required = true)
    protected LayeredParametersListType transmissionParametersList;
    protected boolean isActive;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected X721AdministrativeStateType administrativeState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConnectionDirectionType direction;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SubnetworkConnectionTypeType ccType;
    protected boolean isFixed;
    @XmlElement(required = true)
    protected CrossConnectType.AEndRefList aEndRefList;
    @XmlElement(required = true)
    protected CrossConnectType.ZEndRefList zEndRefList;
    @XmlElement(required = true)
    protected TerminationPointDataListType aEndTpDataList;
    @XmlElement(required = true)
    protected TerminationPointDataListType zEndTpDataList;
    @XmlElement(required = true)
    protected String connectionId;
    @XmlElement(required = true)
    protected String routeActualState;
    @XmlElement(required = true)
    protected String routeAdminState;
    protected boolean isRouteExclusive;
    @XmlElement(required = true)
    protected String routeId;
    protected boolean isRouteIntended;
    protected boolean isRouteInUseBy;
    protected AnyListType vendorExtensions;
    protected NameAndValueStringListType additionalInfo;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setName(NamingAttributeType value) {
        this.name = value;
    }

    /**
     * 获取userLabel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLabel() {
        return userLabel;
    }

    /**
     * 设置userLabel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLabel(String value) {
        this.userLabel = value;
    }

    /**
     * 获取aliasNameList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AliasNameListType }
     *     
     */
    public AliasNameListType getAliasNameList() {
        return aliasNameList;
    }

    /**
     * 设置aliasNameList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AliasNameListType }
     *     
     */
    public void setAliasNameList(AliasNameListType value) {
        this.aliasNameList = value;
    }

    /**
     * 获取transmissionParametersList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LayeredParametersListType }
     *     
     */
    public LayeredParametersListType getTransmissionParametersList() {
        return transmissionParametersList;
    }

    /**
     * 设置transmissionParametersList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LayeredParametersListType }
     *     
     */
    public void setTransmissionParametersList(LayeredParametersListType value) {
        this.transmissionParametersList = value;
    }

    /**
     * 获取isActive属性的值。
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * 设置isActive属性的值。
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * 获取administrativeState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link X721AdministrativeStateType }
     *     
     */
    public X721AdministrativeStateType getAdministrativeState() {
        return administrativeState;
    }

    /**
     * 设置administrativeState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link X721AdministrativeStateType }
     *     
     */
    public void setAdministrativeState(X721AdministrativeStateType value) {
        this.administrativeState = value;
    }

    /**
     * 获取direction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDirectionType }
     *     
     */
    public ConnectionDirectionType getDirection() {
        return direction;
    }

    /**
     * 设置direction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDirectionType }
     *     
     */
    public void setDirection(ConnectionDirectionType value) {
        this.direction = value;
    }

    /**
     * 获取ccType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubnetworkConnectionTypeType }
     *     
     */
    public SubnetworkConnectionTypeType getCcType() {
        return ccType;
    }

    /**
     * 设置ccType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubnetworkConnectionTypeType }
     *     
     */
    public void setCcType(SubnetworkConnectionTypeType value) {
        this.ccType = value;
    }

    /**
     * 获取isFixed属性的值。
     * 
     */
    public boolean isIsFixed() {
        return isFixed;
    }

    /**
     * 设置isFixed属性的值。
     * 
     */
    public void setIsFixed(boolean value) {
        this.isFixed = value;
    }

    /**
     * 获取aEndRefList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CrossConnectType.AEndRefList }
     *     
     */
    public CrossConnectType.AEndRefList getAEndRefList() {
        return aEndRefList;
    }

    /**
     * 设置aEndRefList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CrossConnectType.AEndRefList }
     *     
     */
    public void setAEndRefList(CrossConnectType.AEndRefList value) {
        this.aEndRefList = value;
    }

    /**
     * 获取zEndRefList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CrossConnectType.ZEndRefList }
     *     
     */
    public CrossConnectType.ZEndRefList getZEndRefList() {
        return zEndRefList;
    }

    /**
     * 设置zEndRefList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CrossConnectType.ZEndRefList }
     *     
     */
    public void setZEndRefList(CrossConnectType.ZEndRefList value) {
        this.zEndRefList = value;
    }

    /**
     * 获取aEndTpDataList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointDataListType }
     *     
     */
    public TerminationPointDataListType getAEndTpDataList() {
        return aEndTpDataList;
    }

    /**
     * 设置aEndTpDataList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointDataListType }
     *     
     */
    public void setAEndTpDataList(TerminationPointDataListType value) {
        this.aEndTpDataList = value;
    }

    /**
     * 获取zEndTpDataList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointDataListType }
     *     
     */
    public TerminationPointDataListType getZEndTpDataList() {
        return zEndTpDataList;
    }

    /**
     * 设置zEndTpDataList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointDataListType }
     *     
     */
    public void setZEndTpDataList(TerminationPointDataListType value) {
        this.zEndTpDataList = value;
    }

    /**
     * 获取connectionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * 设置connectionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
    }

    /**
     * 获取routeActualState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteActualState() {
        return routeActualState;
    }

    /**
     * 设置routeActualState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteActualState(String value) {
        this.routeActualState = value;
    }

    /**
     * 获取routeAdminState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteAdminState() {
        return routeAdminState;
    }

    /**
     * 设置routeAdminState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteAdminState(String value) {
        this.routeAdminState = value;
    }

    /**
     * 获取isRouteExclusive属性的值。
     * 
     */
    public boolean isIsRouteExclusive() {
        return isRouteExclusive;
    }

    /**
     * 设置isRouteExclusive属性的值。
     * 
     */
    public void setIsRouteExclusive(boolean value) {
        this.isRouteExclusive = value;
    }

    /**
     * 获取routeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * 设置routeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteId(String value) {
        this.routeId = value;
    }

    /**
     * 获取isRouteIntended属性的值。
     * 
     */
    public boolean isIsRouteIntended() {
        return isRouteIntended;
    }

    /**
     * 设置isRouteIntended属性的值。
     * 
     */
    public void setIsRouteIntended(boolean value) {
        this.isRouteIntended = value;
    }

    /**
     * 获取isRouteInUseBy属性的值。
     * 
     */
    public boolean isIsRouteInUseBy() {
        return isRouteInUseBy;
    }

    /**
     * 设置isRouteInUseBy属性的值。
     * 
     */
    public void setIsRouteInUseBy(boolean value) {
        this.isRouteInUseBy = value;
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
     * 获取additionalInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * 设置additionalInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setAdditionalInfo(NameAndValueStringListType value) {
        this.additionalInfo = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="aEndName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aEndName"
    })
    public static class AEndRefList {

        @XmlElement(required = true)
        protected List<NamingAttributeType> aEndName;

        /**
         * Gets the value of the aEndName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aEndName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAEndName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NamingAttributeType }
         * 
         * 
         */
        public List<NamingAttributeType> getAEndName() {
            if (aEndName == null) {
                aEndName = new ArrayList<NamingAttributeType>();
            }
            return this.aEndName;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="zEndName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "zEndName"
    })
    public static class ZEndRefList {

        @XmlElement(required = true)
        protected List<NamingAttributeType> zEndName;

        /**
         * Gets the value of the zEndName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zEndName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZEndName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NamingAttributeType }
         * 
         * 
         */
        public List<NamingAttributeType> getZEndName() {
            if (zEndName == null) {
                zEndName = new ArrayList<NamingAttributeType>();
            }
            return this.zEndName;
        }

    }

}
