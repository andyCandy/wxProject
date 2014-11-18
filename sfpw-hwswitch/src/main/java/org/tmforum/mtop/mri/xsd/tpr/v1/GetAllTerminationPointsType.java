
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateListType;


/**
 * <p>GetAllTerminationPointsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetAllTerminationPointsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="tpLayerRateList" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateListType" minOccurs="0"/>
 *         &lt;element name="connectionLayerRateList" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllTerminationPointsType", propOrder = {
    "meRef",
    "tpLayerRateList",
    "connectionLayerRateList"
})
public class GetAllTerminationPointsType {

    protected NamingAttributeType meRef;
    protected LayerRateListType tpLayerRateList;
    protected LayerRateListType connectionLayerRateList;

    /**
     * ��ȡmeRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMeRef() {
        return meRef;
    }

    /**
     * ����meRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMeRef(NamingAttributeType value) {
        this.meRef = value;
    }

    /**
     * ��ȡtpLayerRateList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LayerRateListType }
     *     
     */
    public LayerRateListType getTpLayerRateList() {
        return tpLayerRateList;
    }

    /**
     * ����tpLayerRateList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateListType }
     *     
     */
    public void setTpLayerRateList(LayerRateListType value) {
        this.tpLayerRateList = value;
    }

    /**
     * ��ȡconnectionLayerRateList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LayerRateListType }
     *     
     */
    public LayerRateListType getConnectionLayerRateList() {
        return connectionLayerRateList;
    }

    /**
     * ����connectionLayerRateList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateListType }
     *     
     */
    public void setConnectionLayerRateList(LayerRateListType value) {
        this.connectionLayerRateList = value;
    }

}