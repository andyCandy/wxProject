
package org.tmforum.mtop.nra.xsd.alm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.cornot.v1.CorrelatedNotificationListType;
import org.tmforum.mtop.fmw.xsd.ei.v1.EventInformationType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AliasNameListType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndAnyValueListType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nra.xsd.com.v1.AcknowledgeIndicationType;
import org.tmforum.mtop.nra.xsd.com.v1.PerceivedSeverityType;
import org.tmforum.mtop.nra.xsd.com.v1.ProposedRepairActionListType;
import org.tmforum.mtop.nra.xsd.com.v1.ServiceAffectingType;
import org.tmforum.mtop.nra.xsd.com.v1.SpecificProblemListType;
import org.tmforum.mtop.nra.xsd.prc.v1.ProbableCauseType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateType;


/**
 * <p>AlarmType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AlarmType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/ei/v1}EventInformationType">
 *       &lt;sequence>
 *         &lt;element name="probableCauseQualifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isEdgePointRelated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isClearable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="aliasNameList" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AliasNameListType"/>
 *         &lt;element name="layerRate" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateType"/>
 *         &lt;element name="probableCause" type="{http://www.tmforum.org/mtop/nra/xsd/prc/v1}ProbableCauseType"/>
 *         &lt;element name="nativeProbableCause" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="perceivedSeverity" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}PerceivedSeverityType"/>
 *         &lt;element name="affectedPtpRefList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *         &lt;element name="serviceAffecting" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}ServiceAffectingType"/>
 *         &lt;element name="rootCauseAlarmIndication" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="acknowledgeIndication" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}AcknowledgeIndicationType"/>
 *         &lt;element name="X733_EventType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="X733_SpecificProblems" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}SpecificProblemListType"/>
 *         &lt;element name="X733_BackedUpStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="X733_BackUpObjectRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="X733_TrendIndication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="X733_CorrelatedNotificationList" type="{http://www.tmforum.org/mtop/fmw/xsd/cornot/v1}CorrelatedNotificationListType"/>
 *         &lt;element name="X733_MonitoredAttributeList" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType"/>
 *         &lt;element name="X733_ProposedRepairActionList" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}ProposedRepairActionListType"/>
 *         &lt;element name="X733_AdditionalInformation" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndAnyValueListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmType", propOrder = {
    "probableCauseQualifier",
    "isEdgePointRelated",
    "isClearable",
    "aliasNameList",
    "layerRate",
    "probableCause",
    "nativeProbableCause",
    "additionalText",
    "perceivedSeverity",
    "affectedPtpRefList",
    "serviceAffecting",
    "rootCauseAlarmIndication",
    "acknowledgeIndication",
    "x733EventType",
    "x733SpecificProblems",
    "x733BackedUpStatus",
    "x733BackUpObjectRef",
    "x733TrendIndication",
    "x733CorrelatedNotificationList",
    "x733MonitoredAttributeList",
    "x733ProposedRepairActionList",
    "x733AdditionalInformation"
})
public class AlarmType
    extends EventInformationType
{

    @XmlElement(required = true)
    protected String probableCauseQualifier;
    protected boolean isEdgePointRelated;
    protected boolean isClearable;
    @XmlElement(required = true)
    protected AliasNameListType aliasNameList;
    @XmlElement(required = true)
    protected LayerRateType layerRate;
    @XmlElement(required = true)
    protected ProbableCauseType probableCause;
    @XmlElement(required = true)
    protected String nativeProbableCause;
    @XmlElement(required = true)
    protected String additionalText;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerceivedSeverityType perceivedSeverity;
    @XmlElement(required = true)
    protected NamingAttributeListType affectedPtpRefList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ServiceAffectingType serviceAffecting;
    protected boolean rootCauseAlarmIndication;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AcknowledgeIndicationType acknowledgeIndication;
    @XmlElement(name = "X733_EventType", required = true)
    protected String x733EventType;
    @XmlElement(name = "X733_SpecificProblems", required = true)
    protected SpecificProblemListType x733SpecificProblems;
    @XmlElement(name = "X733_BackedUpStatus", required = true)
    protected String x733BackedUpStatus;
    @XmlElement(name = "X733_BackUpObjectRef", required = true)
    protected NamingAttributeType x733BackUpObjectRef;
    @XmlElement(name = "X733_TrendIndication", required = true)
    protected String x733TrendIndication;
    @XmlElement(name = "X733_CorrelatedNotificationList", required = true)
    protected CorrelatedNotificationListType x733CorrelatedNotificationList;
    @XmlElement(name = "X733_MonitoredAttributeList", required = true)
    protected NameAndValueStringListType x733MonitoredAttributeList;
    @XmlElement(name = "X733_ProposedRepairActionList", required = true)
    protected ProposedRepairActionListType x733ProposedRepairActionList;
    @XmlElement(name = "X733_AdditionalInformation", required = true)
    protected NameAndAnyValueListType x733AdditionalInformation;

    /**
     * 获取probableCauseQualifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbableCauseQualifier() {
        return probableCauseQualifier;
    }

    /**
     * 设置probableCauseQualifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbableCauseQualifier(String value) {
        this.probableCauseQualifier = value;
    }

    /**
     * 获取isEdgePointRelated属性的值。
     * 
     */
    public boolean isIsEdgePointRelated() {
        return isEdgePointRelated;
    }

    /**
     * 设置isEdgePointRelated属性的值。
     * 
     */
    public void setIsEdgePointRelated(boolean value) {
        this.isEdgePointRelated = value;
    }

    /**
     * 获取isClearable属性的值。
     * 
     */
    public boolean isIsClearable() {
        return isClearable;
    }

    /**
     * 设置isClearable属性的值。
     * 
     */
    public void setIsClearable(boolean value) {
        this.isClearable = value;
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
     * 获取layerRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LayerRateType }
     *     
     */
    public LayerRateType getLayerRate() {
        return layerRate;
    }

    /**
     * 设置layerRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateType }
     *     
     */
    public void setLayerRate(LayerRateType value) {
        this.layerRate = value;
    }

    /**
     * 获取probableCause属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProbableCauseType }
     *     
     */
    public ProbableCauseType getProbableCause() {
        return probableCause;
    }

    /**
     * 设置probableCause属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProbableCauseType }
     *     
     */
    public void setProbableCause(ProbableCauseType value) {
        this.probableCause = value;
    }

    /**
     * 获取nativeProbableCause属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeProbableCause() {
        return nativeProbableCause;
    }

    /**
     * 设置nativeProbableCause属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeProbableCause(String value) {
        this.nativeProbableCause = value;
    }

    /**
     * 获取additionalText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalText() {
        return additionalText;
    }

    /**
     * 设置additionalText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalText(String value) {
        this.additionalText = value;
    }

    /**
     * 获取perceivedSeverity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PerceivedSeverityType }
     *     
     */
    public PerceivedSeverityType getPerceivedSeverity() {
        return perceivedSeverity;
    }

    /**
     * 设置perceivedSeverity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PerceivedSeverityType }
     *     
     */
    public void setPerceivedSeverity(PerceivedSeverityType value) {
        this.perceivedSeverity = value;
    }

    /**
     * 获取affectedPtpRefList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getAffectedPtpRefList() {
        return affectedPtpRefList;
    }

    /**
     * 设置affectedPtpRefList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setAffectedPtpRefList(NamingAttributeListType value) {
        this.affectedPtpRefList = value;
    }

    /**
     * 获取serviceAffecting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceAffectingType }
     *     
     */
    public ServiceAffectingType getServiceAffecting() {
        return serviceAffecting;
    }

    /**
     * 设置serviceAffecting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAffectingType }
     *     
     */
    public void setServiceAffecting(ServiceAffectingType value) {
        this.serviceAffecting = value;
    }

    /**
     * 获取rootCauseAlarmIndication属性的值。
     * 
     */
    public boolean isRootCauseAlarmIndication() {
        return rootCauseAlarmIndication;
    }

    /**
     * 设置rootCauseAlarmIndication属性的值。
     * 
     */
    public void setRootCauseAlarmIndication(boolean value) {
        this.rootCauseAlarmIndication = value;
    }

    /**
     * 获取acknowledgeIndication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeIndicationType }
     *     
     */
    public AcknowledgeIndicationType getAcknowledgeIndication() {
        return acknowledgeIndication;
    }

    /**
     * 设置acknowledgeIndication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeIndicationType }
     *     
     */
    public void setAcknowledgeIndication(AcknowledgeIndicationType value) {
        this.acknowledgeIndication = value;
    }

    /**
     * 获取x733EventType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX733EventType() {
        return x733EventType;
    }

    /**
     * 设置x733EventType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX733EventType(String value) {
        this.x733EventType = value;
    }

    /**
     * 获取x733SpecificProblems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecificProblemListType }
     *     
     */
    public SpecificProblemListType getX733SpecificProblems() {
        return x733SpecificProblems;
    }

    /**
     * 设置x733SpecificProblems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificProblemListType }
     *     
     */
    public void setX733SpecificProblems(SpecificProblemListType value) {
        this.x733SpecificProblems = value;
    }

    /**
     * 获取x733BackedUpStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX733BackedUpStatus() {
        return x733BackedUpStatus;
    }

    /**
     * 设置x733BackedUpStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX733BackedUpStatus(String value) {
        this.x733BackedUpStatus = value;
    }

    /**
     * 获取x733BackUpObjectRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getX733BackUpObjectRef() {
        return x733BackUpObjectRef;
    }

    /**
     * 设置x733BackUpObjectRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setX733BackUpObjectRef(NamingAttributeType value) {
        this.x733BackUpObjectRef = value;
    }

    /**
     * 获取x733TrendIndication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX733TrendIndication() {
        return x733TrendIndication;
    }

    /**
     * 设置x733TrendIndication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX733TrendIndication(String value) {
        this.x733TrendIndication = value;
    }

    /**
     * 获取x733CorrelatedNotificationList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CorrelatedNotificationListType }
     *     
     */
    public CorrelatedNotificationListType getX733CorrelatedNotificationList() {
        return x733CorrelatedNotificationList;
    }

    /**
     * 设置x733CorrelatedNotificationList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelatedNotificationListType }
     *     
     */
    public void setX733CorrelatedNotificationList(CorrelatedNotificationListType value) {
        this.x733CorrelatedNotificationList = value;
    }

    /**
     * 获取x733MonitoredAttributeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getX733MonitoredAttributeList() {
        return x733MonitoredAttributeList;
    }

    /**
     * 设置x733MonitoredAttributeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setX733MonitoredAttributeList(NameAndValueStringListType value) {
        this.x733MonitoredAttributeList = value;
    }

    /**
     * 获取x733ProposedRepairActionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProposedRepairActionListType }
     *     
     */
    public ProposedRepairActionListType getX733ProposedRepairActionList() {
        return x733ProposedRepairActionList;
    }

    /**
     * 设置x733ProposedRepairActionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProposedRepairActionListType }
     *     
     */
    public void setX733ProposedRepairActionList(ProposedRepairActionListType value) {
        this.x733ProposedRepairActionList = value;
    }

    /**
     * 获取x733AdditionalInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameAndAnyValueListType }
     *     
     */
    public NameAndAnyValueListType getX733AdditionalInformation() {
        return x733AdditionalInformation;
    }

    /**
     * 设置x733AdditionalInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAnyValueListType }
     *     
     */
    public void setX733AdditionalInformation(NameAndAnyValueListType value) {
        this.x733AdditionalInformation = value;
    }

}
