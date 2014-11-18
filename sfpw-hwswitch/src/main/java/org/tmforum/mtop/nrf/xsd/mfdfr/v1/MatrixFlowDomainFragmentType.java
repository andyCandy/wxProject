
package org.tmforum.mtop.nrf.xsd.mfdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AnyListType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersType;
import org.tmforum.mtop.nrf.xsd.com.v1.ConnectionDirectionType;
import org.tmforum.mtop.nrf.xsd.tpdata.v1.TerminationPointDataListType;


/**
 * <p>MatrixFlowDomainFragmentType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MatrixFlowDomainFragmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}ConnectionDirectionType" form="qualified"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}transmissionParameters" minOccurs="0"/>
 *         &lt;element name="aEndTpDataList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}TerminationPointDataListType" form="qualified"/>
 *         &lt;element name="zEndTpDataList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}TerminationPointDataListType" form="qualified"/>
 *         &lt;element name="isFlexible" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="mfdfrType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="vendorExtensions" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AnyListType" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixFlowDomainFragmentType", propOrder = {
    "direction",
    "transmissionParameters",
    "aEndTpDataList",
    "zEndTpDataList",
    "isFlexible",
    "isActive",
    "mfdfrType",
    "vendorExtensions"
})
public class MatrixFlowDomainFragmentType {

    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", required = true)
    @XmlSchemaType(name = "string")
    protected ConnectionDirectionType direction;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1")
    protected LayeredParametersType transmissionParameters;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", required = true)
    protected TerminationPointDataListType aEndTpDataList;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", required = true)
    protected TerminationPointDataListType zEndTpDataList;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1")
    protected boolean isFlexible;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1")
    protected boolean isActive;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", required = true)
    protected String mfdfrType;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1", required = true)
    protected AnyListType vendorExtensions;

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
     * ��ȡtransmissionParameters���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LayeredParametersType }
     *     
     */
    public LayeredParametersType getTransmissionParameters() {
        return transmissionParameters;
    }

    /**
     * ����transmissionParameters���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LayeredParametersType }
     *     
     */
    public void setTransmissionParameters(LayeredParametersType value) {
        this.transmissionParameters = value;
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
     * ��ȡisFlexible���Ե�ֵ��
     * 
     */
    public boolean isIsFlexible() {
        return isFlexible;
    }

    /**
     * ����isFlexible���Ե�ֵ��
     * 
     */
    public void setIsFlexible(boolean value) {
        this.isFlexible = value;
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
     * ��ȡmfdfrType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfdfrType() {
        return mfdfrType;
    }

    /**
     * ����mfdfrType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfdfrType(String value) {
        this.mfdfrType = value;
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

}
