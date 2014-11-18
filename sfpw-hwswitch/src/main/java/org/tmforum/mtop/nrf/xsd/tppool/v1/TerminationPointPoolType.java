
package org.tmforum.mtop.nrf.xsd.tppool.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersListType;


/**
 * <p>TerminationPointPoolType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TerminationPointPoolType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="numberOfMembers" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numberOfIdleMembers" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="descriptionOfUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}transmissionParametersList" minOccurs="0"/>
 *         &lt;element name="containedMemberList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="containedMember" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="memberContainingMeList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="memberContainingMe" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="memberContainingTpList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="memberContainingTp" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminationPointPoolType", propOrder = {
    "numberOfMembers",
    "numberOfIdleMembers",
    "descriptionOfUse",
    "transmissionParametersList",
    "containedMemberList",
    "memberContainingMeList",
    "memberContainingTpList"
})
public class TerminationPointPoolType
    extends CommonResourceInfoType
{

    protected long numberOfMembers;
    protected long numberOfIdleMembers;
    @XmlElement(required = true)
    protected String descriptionOfUse;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1")
    protected LayeredParametersListType transmissionParametersList;
    @XmlElement(required = true)
    protected TerminationPointPoolType.ContainedMemberList containedMemberList;
    @XmlElement(required = true)
    protected TerminationPointPoolType.MemberContainingMeList memberContainingMeList;
    @XmlElement(required = true)
    protected TerminationPointPoolType.MemberContainingTpList memberContainingTpList;

    /**
     * 获取numberOfMembers属性的值。
     * 
     */
    public long getNumberOfMembers() {
        return numberOfMembers;
    }

    /**
     * 设置numberOfMembers属性的值。
     * 
     */
    public void setNumberOfMembers(long value) {
        this.numberOfMembers = value;
    }

    /**
     * 获取numberOfIdleMembers属性的值。
     * 
     */
    public long getNumberOfIdleMembers() {
        return numberOfIdleMembers;
    }

    /**
     * 设置numberOfIdleMembers属性的值。
     * 
     */
    public void setNumberOfIdleMembers(long value) {
        this.numberOfIdleMembers = value;
    }

    /**
     * 获取descriptionOfUse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionOfUse() {
        return descriptionOfUse;
    }

    /**
     * 设置descriptionOfUse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionOfUse(String value) {
        this.descriptionOfUse = value;
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
     * 获取containedMemberList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointPoolType.ContainedMemberList }
     *     
     */
    public TerminationPointPoolType.ContainedMemberList getContainedMemberList() {
        return containedMemberList;
    }

    /**
     * 设置containedMemberList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointPoolType.ContainedMemberList }
     *     
     */
    public void setContainedMemberList(TerminationPointPoolType.ContainedMemberList value) {
        this.containedMemberList = value;
    }

    /**
     * 获取memberContainingMeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointPoolType.MemberContainingMeList }
     *     
     */
    public TerminationPointPoolType.MemberContainingMeList getMemberContainingMeList() {
        return memberContainingMeList;
    }

    /**
     * 设置memberContainingMeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointPoolType.MemberContainingMeList }
     *     
     */
    public void setMemberContainingMeList(TerminationPointPoolType.MemberContainingMeList value) {
        this.memberContainingMeList = value;
    }

    /**
     * 获取memberContainingTpList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointPoolType.MemberContainingTpList }
     *     
     */
    public TerminationPointPoolType.MemberContainingTpList getMemberContainingTpList() {
        return memberContainingTpList;
    }

    /**
     * 设置memberContainingTpList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointPoolType.MemberContainingTpList }
     *     
     */
    public void setMemberContainingTpList(TerminationPointPoolType.MemberContainingTpList value) {
        this.memberContainingTpList = value;
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
     *         &lt;element name="containedMember" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "containedMember"
    })
    public static class ContainedMemberList {

        @XmlElement(nillable = true)
        protected List<String> containedMember;

        /**
         * Gets the value of the containedMember property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the containedMember property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContainedMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getContainedMember() {
            if (containedMember == null) {
                containedMember = new ArrayList<String>();
            }
            return this.containedMember;
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
     *         &lt;element name="memberContainingMe" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "memberContainingMe"
    })
    public static class MemberContainingMeList {

        @XmlElement(nillable = true)
        protected List<String> memberContainingMe;

        /**
         * Gets the value of the memberContainingMe property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberContainingMe property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberContainingMe().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMemberContainingMe() {
            if (memberContainingMe == null) {
                memberContainingMe = new ArrayList<String>();
            }
            return this.memberContainingMe;
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
     *         &lt;element name="memberContainingTp" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "memberContainingTp"
    })
    public static class MemberContainingTpList {

        @XmlElement(nillable = true)
        protected List<String> memberContainingTp;

        /**
         * Gets the value of the memberContainingTp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberContainingTp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberContainingTp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMemberContainingTp() {
            if (memberContainingTp == null) {
                memberContainingTp = new ArrayList<String>();
            }
            return this.memberContainingTp;
        }

    }

}
