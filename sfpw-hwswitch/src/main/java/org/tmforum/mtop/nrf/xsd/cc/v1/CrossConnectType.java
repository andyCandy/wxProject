
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
 * <p>CrossConnectType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡuserLabel���Ե�ֵ��
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
     * ����userLabel���Ե�ֵ��
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
     * ��ȡaliasNameList���Ե�ֵ��
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
     * ����aliasNameList���Ե�ֵ��
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
     * ��ȡtransmissionParametersList���Ե�ֵ��
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
     * ����transmissionParametersList���Ե�ֵ��
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
     * ��ȡisActive���Ե�ֵ��
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * ����isActive���Ե�ֵ��
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * ��ȡadministrativeState���Ե�ֵ��
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
     * ����administrativeState���Ե�ֵ��
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
     * ��ȡdirection���Ե�ֵ��
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
     * ����direction���Ե�ֵ��
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
     * ��ȡccType���Ե�ֵ��
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
     * ����ccType���Ե�ֵ��
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
     * ��ȡisFixed���Ե�ֵ��
     * 
     */
    public boolean isIsFixed() {
        return isFixed;
    }

    /**
     * ����isFixed���Ե�ֵ��
     * 
     */
    public void setIsFixed(boolean value) {
        this.isFixed = value;
    }

    /**
     * ��ȡaEndRefList���Ե�ֵ��
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
     * ����aEndRefList���Ե�ֵ��
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
     * ��ȡzEndRefList���Ե�ֵ��
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
     * ����zEndRefList���Ե�ֵ��
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
     * ��ȡaEndTpDataList���Ե�ֵ��
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
     * ����aEndTpDataList���Ե�ֵ��
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
     * ��ȡzEndTpDataList���Ե�ֵ��
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
     * ����zEndTpDataList���Ե�ֵ��
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
     * ��ȡconnectionId���Ե�ֵ��
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
     * ����connectionId���Ե�ֵ��
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
     * ��ȡrouteActualState���Ե�ֵ��
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
     * ����routeActualState���Ե�ֵ��
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
     * ��ȡrouteAdminState���Ե�ֵ��
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
     * ����routeAdminState���Ե�ֵ��
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
     * ��ȡisRouteExclusive���Ե�ֵ��
     * 
     */
    public boolean isIsRouteExclusive() {
        return isRouteExclusive;
    }

    /**
     * ����isRouteExclusive���Ե�ֵ��
     * 
     */
    public void setIsRouteExclusive(boolean value) {
        this.isRouteExclusive = value;
    }

    /**
     * ��ȡrouteId���Ե�ֵ��
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
     * ����routeId���Ե�ֵ��
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
     * ��ȡisRouteIntended���Ե�ֵ��
     * 
     */
    public boolean isIsRouteIntended() {
        return isRouteIntended;
    }

    /**
     * ����isRouteIntended���Ե�ֵ��
     * 
     */
    public void setIsRouteIntended(boolean value) {
        this.isRouteIntended = value;
    }

    /**
     * ��ȡisRouteInUseBy���Ե�ֵ��
     * 
     */
    public boolean isIsRouteInUseBy() {
        return isRouteInUseBy;
    }

    /**
     * ����isRouteInUseBy���Ե�ֵ��
     * 
     */
    public void setIsRouteInUseBy(boolean value) {
        this.isRouteInUseBy = value;
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
     * ��ȡadditionalInfo���Ե�ֵ��
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
     * ����additionalInfo���Ե�ֵ��
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
