
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateListType;


/**
 * <p>GetAllConnectionTerminationPointsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetAllConnectionTerminationPointsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="layerRateList" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllConnectionTerminationPointsType", propOrder = {
    "tpRef",
    "layerRateList"
})
public class GetAllConnectionTerminationPointsType {

    protected NamingAttributeType tpRef;
    protected LayerRateListType layerRateList;

    /**
     * ��ȡtpRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getTpRef() {
        return tpRef;
    }

    /**
     * ����tpRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setTpRef(NamingAttributeType value) {
        this.tpRef = value;
    }

    /**
     * ��ȡlayerRateList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LayerRateListType }
     *     
     */
    public LayerRateListType getLayerRateList() {
        return layerRateList;
    }

    /**
     * ����layerRateList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateListType }
     *     
     */
    public void setLayerRateList(LayerRateListType value) {
        this.layerRateList = value;
    }

}
