
package org.tmforum.mtop.nra.xsd.pm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PerformanceMonitoringThresholdTypeType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="PerformanceMonitoringThresholdTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TWM_HIGHEST"/>
 *     &lt;enumeration value="TWM_HIGH"/>
 *     &lt;enumeration value="TWM_LOW"/>
 *     &lt;enumeration value="TWM_LOWEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PerformanceMonitoringThresholdTypeType")
@XmlEnum
public enum PerformanceMonitoringThresholdTypeType {

    TWM_HIGHEST,
    TWM_HIGH,
    TWM_LOW,
    TWM_LOWEST;

    public String value() {
        return name();
    }

    public static PerformanceMonitoringThresholdTypeType fromValue(String v) {
        return valueOf(v);
    }

}
