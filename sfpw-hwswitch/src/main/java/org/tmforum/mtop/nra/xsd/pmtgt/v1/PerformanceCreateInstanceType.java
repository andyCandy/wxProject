
package org.tmforum.mtop.nra.xsd.pmtgt.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tmforum.mtop.fmw.xsd.gen.v1.AliasNameListType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AnyListType;


/**
 * <p>PerformanceCreateInstanceType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PerformanceCreateInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aliasNameList" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AliasNameListType"/>
 *         &lt;element name="vendorExtensions" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AnyListType"/>
 *         &lt;element name="resType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pmScheduleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="resourceList" type="{http://www.tmforum.org/mtop/nra/xsd/pmtgt/v1}PerformanceCreateResourceType" maxOccurs="unbounded"/>
 *         &lt;element name="templateList" type="{http://www.tmforum.org/mtop/nra/xsd/pmtgt/v1}PerformanceTemplateType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceCreateInstanceType", propOrder = {
    "userLabel",
    "aliasNameList",
    "vendorExtensions",
    "resType",
    "pmScheduleName",
    "startTime",
    "endTime",
    "resourceList",
    "templateList"
})
public class PerformanceCreateInstanceType {

    @XmlElement(required = true)
    protected String userLabel;
    @XmlElement(required = true)
    protected AliasNameListType aliasNameList;
    @XmlElement(required = true)
    protected AnyListType vendorExtensions;
    protected int resType;
    @XmlElement(required = true, nillable = true)
    protected String pmScheduleName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(required = true)
    protected List<PerformanceCreateResourceType> resourceList;
    @XmlElement(required = true)
    protected List<PerformanceTemplateType> templateList;

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
     * ��ȡresType���Ե�ֵ��
     * 
     */
    public int getResType() {
        return resType;
    }

    /**
     * ����resType���Ե�ֵ��
     * 
     */
    public void setResType(int value) {
        this.resType = value;
    }

    /**
     * ��ȡpmScheduleName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmScheduleName() {
        return pmScheduleName;
    }

    /**
     * ����pmScheduleName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmScheduleName(String value) {
        this.pmScheduleName = value;
    }

    /**
     * ��ȡstartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * ����startTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * ��ȡendTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * ����endTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the resourceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceCreateResourceType }
     * 
     * 
     */
    public List<PerformanceCreateResourceType> getResourceList() {
        if (resourceList == null) {
            resourceList = new ArrayList<PerformanceCreateResourceType>();
        }
        return this.resourceList;
    }

    /**
     * Gets the value of the templateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceTemplateType }
     * 
     * 
     */
    public List<PerformanceTemplateType> getTemplateList() {
        if (templateList == null) {
            templateList = new ArrayList<PerformanceTemplateType>();
        }
        return this.templateList;
    }

}
