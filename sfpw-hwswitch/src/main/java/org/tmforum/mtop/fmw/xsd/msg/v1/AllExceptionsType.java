
package org.tmforum.mtop.fmw.xsd.msg.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAllAssignableConnectionlessPortTerminationPointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAllAssignedConnectionlessPortTerminationPointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAllConnectionlessPortTerminationPointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAllEdgePointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAllFloatingTerminationPointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAllGroupTerminationPointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAllPhysicalTerminationPointNamesException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAllPhysicalTerminationPointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAllPhysicalTerminationPointsWithoutFtpsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAllSupportedPhysicalTerminationPointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAllTerminationPointPoolsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAssociatedGroupTerminationPointException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetAssociatedTerminationPointException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetContainedCurrentConnectionTerminationPointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetContainedInUseConnectionTerminationPointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetContainedPotentialConnectionTerminationPointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetContainingGroupTerminationPointException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetContainingTerminationPointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetGroupTerminationPointException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetMemberTerminationPointsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetTerminationPointException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetTerminationPointGroupingRelationshipsException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetTerminationPointPoolException;
import org.tmforum.mtop.mri.xsd.tpr.v1.GetTrafficConditioningProfileAssociatedTpsException;
import org.tmforum.mtop.vs.xsd.rr.v1.GetAttributesByNativeEMSNameException;


/**
 * <p>AllExceptionsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AllExceptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessDenied" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="capacityExceeded" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="commLoss" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="entityNotFound" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="internalError" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="invalidFilterDefinition" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="invalidInput" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="invalidTopic" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="notificationServiceProblem" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="notImplemented" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="notInValidState" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="objectInUse" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="protectionEffortNotMet" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="timeslotInUse" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="tooManyOpenIterators" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="tpInvalidEndPoint" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="unableToComply" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="unsupportedCompressionFormat" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="unsupportedPackingFormat" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="unsupportedRoutingConstraints" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *         &lt;element name="userlabelInUse" type="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}BaseExceptionMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllExceptionsType", propOrder = {
    "accessDenied",
    "capacityExceeded",
    "commLoss",
    "entityNotFound",
    "internalError",
    "invalidFilterDefinition",
    "invalidInput",
    "invalidTopic",
    "notificationServiceProblem",
    "notImplemented",
    "notInValidState",
    "objectInUse",
    "protectionEffortNotMet",
    "timeslotInUse",
    "tooManyOpenIterators",
    "tpInvalidEndPoint",
    "unableToComply",
    "unsupportedCompressionFormat",
    "unsupportedPackingFormat",
    "unsupportedRoutingConstraints",
    "userlabelInUse"
})
@XmlSeeAlso({
    GetAllDataIteratorExceptionType.class,
    GetAllSupportedPhysicalTerminationPointsException.class,
    GetAllAssignableConnectionlessPortTerminationPointsException.class,
    GetMemberTerminationPointsException.class,
    GetTerminationPointPoolException.class,
    GetTerminationPointGroupingRelationshipsException.class,
    GetAssociatedTerminationPointException.class,
    GetContainingGroupTerminationPointException.class,
    GetAllConnectionlessPortTerminationPointsException.class,
    GetContainedInUseConnectionTerminationPointsException.class,
    GetAssociatedGroupTerminationPointException.class,
    GetAllAssignedConnectionlessPortTerminationPointsException.class,
    GetTerminationPointException.class,
    GetContainedCurrentConnectionTerminationPointsException.class,
    GetAllFloatingTerminationPointsException.class,
    GetTrafficConditioningProfileAssociatedTpsException.class,
    GetAllPhysicalTerminationPointNamesException.class,
    GetAllTerminationPointPoolsException.class,
    GetGroupTerminationPointException.class,
    GetAllGroupTerminationPointsException.class,
    GetAllPhysicalTerminationPointsException.class,
    GetContainingTerminationPointsException.class,
    GetAllPhysicalTerminationPointsWithoutFtpsException.class,
    GetContainedPotentialConnectionTerminationPointsException.class,
    GetAllEdgePointsException.class,
    GetAttributesByNativeEMSNameException.class
})
public class AllExceptionsType {

    protected BaseExceptionMessageType accessDenied;
    protected BaseExceptionMessageType capacityExceeded;
    protected BaseExceptionMessageType commLoss;
    protected BaseExceptionMessageType entityNotFound;
    protected BaseExceptionMessageType internalError;
    protected BaseExceptionMessageType invalidFilterDefinition;
    protected BaseExceptionMessageType invalidInput;
    protected BaseExceptionMessageType invalidTopic;
    protected BaseExceptionMessageType notificationServiceProblem;
    protected BaseExceptionMessageType notImplemented;
    protected BaseExceptionMessageType notInValidState;
    protected BaseExceptionMessageType objectInUse;
    protected BaseExceptionMessageType protectionEffortNotMet;
    protected BaseExceptionMessageType timeslotInUse;
    protected BaseExceptionMessageType tooManyOpenIterators;
    protected BaseExceptionMessageType tpInvalidEndPoint;
    protected BaseExceptionMessageType unableToComply;
    protected BaseExceptionMessageType unsupportedCompressionFormat;
    protected BaseExceptionMessageType unsupportedPackingFormat;
    protected BaseExceptionMessageType unsupportedRoutingConstraints;
    protected BaseExceptionMessageType userlabelInUse;

    /**
     * ��ȡaccessDenied���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getAccessDenied() {
        return accessDenied;
    }

    /**
     * ����accessDenied���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setAccessDenied(BaseExceptionMessageType value) {
        this.accessDenied = value;
    }

    /**
     * ��ȡcapacityExceeded���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getCapacityExceeded() {
        return capacityExceeded;
    }

    /**
     * ����capacityExceeded���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setCapacityExceeded(BaseExceptionMessageType value) {
        this.capacityExceeded = value;
    }

    /**
     * ��ȡcommLoss���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getCommLoss() {
        return commLoss;
    }

    /**
     * ����commLoss���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setCommLoss(BaseExceptionMessageType value) {
        this.commLoss = value;
    }

    /**
     * ��ȡentityNotFound���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getEntityNotFound() {
        return entityNotFound;
    }

    /**
     * ����entityNotFound���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setEntityNotFound(BaseExceptionMessageType value) {
        this.entityNotFound = value;
    }

    /**
     * ��ȡinternalError���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getInternalError() {
        return internalError;
    }

    /**
     * ����internalError���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setInternalError(BaseExceptionMessageType value) {
        this.internalError = value;
    }

    /**
     * ��ȡinvalidFilterDefinition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getInvalidFilterDefinition() {
        return invalidFilterDefinition;
    }

    /**
     * ����invalidFilterDefinition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setInvalidFilterDefinition(BaseExceptionMessageType value) {
        this.invalidFilterDefinition = value;
    }

    /**
     * ��ȡinvalidInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getInvalidInput() {
        return invalidInput;
    }

    /**
     * ����invalidInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setInvalidInput(BaseExceptionMessageType value) {
        this.invalidInput = value;
    }

    /**
     * ��ȡinvalidTopic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getInvalidTopic() {
        return invalidTopic;
    }

    /**
     * ����invalidTopic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setInvalidTopic(BaseExceptionMessageType value) {
        this.invalidTopic = value;
    }

    /**
     * ��ȡnotificationServiceProblem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getNotificationServiceProblem() {
        return notificationServiceProblem;
    }

    /**
     * ����notificationServiceProblem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setNotificationServiceProblem(BaseExceptionMessageType value) {
        this.notificationServiceProblem = value;
    }

    /**
     * ��ȡnotImplemented���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getNotImplemented() {
        return notImplemented;
    }

    /**
     * ����notImplemented���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setNotImplemented(BaseExceptionMessageType value) {
        this.notImplemented = value;
    }

    /**
     * ��ȡnotInValidState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getNotInValidState() {
        return notInValidState;
    }

    /**
     * ����notInValidState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setNotInValidState(BaseExceptionMessageType value) {
        this.notInValidState = value;
    }

    /**
     * ��ȡobjectInUse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getObjectInUse() {
        return objectInUse;
    }

    /**
     * ����objectInUse���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setObjectInUse(BaseExceptionMessageType value) {
        this.objectInUse = value;
    }

    /**
     * ��ȡprotectionEffortNotMet���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getProtectionEffortNotMet() {
        return protectionEffortNotMet;
    }

    /**
     * ����protectionEffortNotMet���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setProtectionEffortNotMet(BaseExceptionMessageType value) {
        this.protectionEffortNotMet = value;
    }

    /**
     * ��ȡtimeslotInUse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getTimeslotInUse() {
        return timeslotInUse;
    }

    /**
     * ����timeslotInUse���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setTimeslotInUse(BaseExceptionMessageType value) {
        this.timeslotInUse = value;
    }

    /**
     * ��ȡtooManyOpenIterators���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getTooManyOpenIterators() {
        return tooManyOpenIterators;
    }

    /**
     * ����tooManyOpenIterators���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setTooManyOpenIterators(BaseExceptionMessageType value) {
        this.tooManyOpenIterators = value;
    }

    /**
     * ��ȡtpInvalidEndPoint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getTpInvalidEndPoint() {
        return tpInvalidEndPoint;
    }

    /**
     * ����tpInvalidEndPoint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setTpInvalidEndPoint(BaseExceptionMessageType value) {
        this.tpInvalidEndPoint = value;
    }

    /**
     * ��ȡunableToComply���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getUnableToComply() {
        return unableToComply;
    }

    /**
     * ����unableToComply���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setUnableToComply(BaseExceptionMessageType value) {
        this.unableToComply = value;
    }

    /**
     * ��ȡunsupportedCompressionFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getUnsupportedCompressionFormat() {
        return unsupportedCompressionFormat;
    }

    /**
     * ����unsupportedCompressionFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setUnsupportedCompressionFormat(BaseExceptionMessageType value) {
        this.unsupportedCompressionFormat = value;
    }

    /**
     * ��ȡunsupportedPackingFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getUnsupportedPackingFormat() {
        return unsupportedPackingFormat;
    }

    /**
     * ����unsupportedPackingFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setUnsupportedPackingFormat(BaseExceptionMessageType value) {
        this.unsupportedPackingFormat = value;
    }

    /**
     * ��ȡunsupportedRoutingConstraints���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getUnsupportedRoutingConstraints() {
        return unsupportedRoutingConstraints;
    }

    /**
     * ����unsupportedRoutingConstraints���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setUnsupportedRoutingConstraints(BaseExceptionMessageType value) {
        this.unsupportedRoutingConstraints = value;
    }

    /**
     * ��ȡuserlabelInUse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public BaseExceptionMessageType getUserlabelInUse() {
        return userlabelInUse;
    }

    /**
     * ����userlabelInUse���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseExceptionMessageType }
     *     
     */
    public void setUserlabelInUse(BaseExceptionMessageType value) {
        this.userlabelInUse = value;
    }

}
