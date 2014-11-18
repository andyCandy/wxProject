
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
 * <p>TerminationPointPoolType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡnumberOfMembers���Ե�ֵ��
     * 
     */
    public long getNumberOfMembers() {
        return numberOfMembers;
    }

    /**
     * ����numberOfMembers���Ե�ֵ��
     * 
     */
    public void setNumberOfMembers(long value) {
        this.numberOfMembers = value;
    }

    /**
     * ��ȡnumberOfIdleMembers���Ե�ֵ��
     * 
     */
    public long getNumberOfIdleMembers() {
        return numberOfIdleMembers;
    }

    /**
     * ����numberOfIdleMembers���Ե�ֵ��
     * 
     */
    public void setNumberOfIdleMembers(long value) {
        this.numberOfIdleMembers = value;
    }

    /**
     * ��ȡdescriptionOfUse���Ե�ֵ��
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
     * ����descriptionOfUse���Ե�ֵ��
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
     * ��ȡcontainedMemberList���Ե�ֵ��
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
     * ����containedMemberList���Ե�ֵ��
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
     * ��ȡmemberContainingMeList���Ե�ֵ��
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
     * ����memberContainingMeList���Ե�ֵ��
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
     * ��ȡmemberContainingTpList���Ե�ֵ��
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
     * ����memberContainingTpList���Ե�ֵ��
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
