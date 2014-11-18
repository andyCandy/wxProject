
package org.tmforum.mtop.nrb.xsd.itu.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>M3100.ArcQIStatusType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="M3100.ArcQIStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="NALM_NOT_READY"/>
 *     &lt;enumeration value="NALM_COUNT_DOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "M3100.ArcQIStatusType")
@XmlEnum
public enum M3100ArcQIStatusType {

    NOT_APPLICABLE,
    NALM_NOT_READY,
    NALM_COUNT_DOWN;

    public String value() {
        return name();
    }

    public static M3100ArcQIStatusType fromValue(String v) {
        return valueOf(v);
    }

}
