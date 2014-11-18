
package org.tmforum.mtop.rtm.xsd.ar.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.QueryExpressionType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;
import org.tmforum.mtop.nra.xsd.com.v1.AcknowledgeIndicationType;
import org.tmforum.mtop.nra.xsd.com.v1.PerceivedSeverityListType;
import org.tmforum.mtop.nra.xsd.prc.v1.ProbableCauseListType;


/**
 * <p>ActiveAlarmFilterType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ActiveAlarmFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.tmforum.org/mtop/rtm/xsd/ar/v1}AlarmSourceType" minOccurs="0"/>
 *         &lt;element name="rootCauseAlarmIndication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scope" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType" minOccurs="0"/>
 *         &lt;element name="perceivedSeverityList" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}PerceivedSeverityListType" minOccurs="0"/>
 *         &lt;element name="probableCauseList" type="{http://www.tmforum.org/mtop/nra/xsd/prc/v1}ProbableCauseListType" minOccurs="0"/>
 *         &lt;element name="acknowledgeIndication" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}AcknowledgeIndicationType" minOccurs="0"/>
 *         &lt;element name="queryExpression" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}QueryExpressionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveAlarmFilterType", propOrder = {
    "source",
    "rootCauseAlarmIndication",
    "scope",
    "perceivedSeverityList",
    "probableCauseList",
    "acknowledgeIndication",
    "queryExpression"
})
public class ActiveAlarmFilterType {

    @XmlSchemaType(name = "string")
    protected AlarmSourceType source;
    protected Boolean rootCauseAlarmIndication;
    protected NamingAttributeListType scope;
    protected PerceivedSeverityListType perceivedSeverityList;
    protected ProbableCauseListType probableCauseList;
    @XmlSchemaType(name = "string")
    protected AcknowledgeIndicationType acknowledgeIndication;
    protected QueryExpressionType queryExpression;

    /**
     * ��ȡsource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AlarmSourceType }
     *     
     */
    public AlarmSourceType getSource() {
        return source;
    }

    /**
     * ����source���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmSourceType }
     *     
     */
    public void setSource(AlarmSourceType value) {
        this.source = value;
    }

    /**
     * ��ȡrootCauseAlarmIndication���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRootCauseAlarmIndication() {
        return rootCauseAlarmIndication;
    }

    /**
     * ����rootCauseAlarmIndication���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRootCauseAlarmIndication(Boolean value) {
        this.rootCauseAlarmIndication = value;
    }

    /**
     * ��ȡscope���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getScope() {
        return scope;
    }

    /**
     * ����scope���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setScope(NamingAttributeListType value) {
        this.scope = value;
    }

    /**
     * ��ȡperceivedSeverityList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PerceivedSeverityListType }
     *     
     */
    public PerceivedSeverityListType getPerceivedSeverityList() {
        return perceivedSeverityList;
    }

    /**
     * ����perceivedSeverityList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PerceivedSeverityListType }
     *     
     */
    public void setPerceivedSeverityList(PerceivedSeverityListType value) {
        this.perceivedSeverityList = value;
    }

    /**
     * ��ȡprobableCauseList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProbableCauseListType }
     *     
     */
    public ProbableCauseListType getProbableCauseList() {
        return probableCauseList;
    }

    /**
     * ����probableCauseList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProbableCauseListType }
     *     
     */
    public void setProbableCauseList(ProbableCauseListType value) {
        this.probableCauseList = value;
    }

    /**
     * ��ȡacknowledgeIndication���Ե�ֵ��
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
     * ����acknowledgeIndication���Ե�ֵ��
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
     * ��ȡqueryExpression���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link QueryExpressionType }
     *     
     */
    public QueryExpressionType getQueryExpression() {
        return queryExpression;
    }

    /**
     * ����queryExpression���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpressionType }
     *     
     */
    public void setQueryExpression(QueryExpressionType value) {
        this.queryExpression = value;
    }

}
