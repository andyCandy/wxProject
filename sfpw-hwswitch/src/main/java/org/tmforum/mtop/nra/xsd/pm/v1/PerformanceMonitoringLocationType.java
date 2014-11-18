
package org.tmforum.mtop.nra.xsd.pm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PerformanceMonitoringLocationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PerformanceMonitoringLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PML_NEAR_END_Rx"/>
 *     &lt;enumeration value="PML_FAR_END_Rx"/>
 *     &lt;enumeration value="PML_FAR_ENDTypex"/>
 *     &lt;enumeration value="PML_BIDIRECTIONAL"/>
 *     &lt;enumeration value="PML_CONTRA_NEAR_END_Rx"/>
 *     &lt;enumeration value="PML_CONTRA_FAR_END_Rx"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PerformanceMonitoringLocationType")
@XmlEnum
public enum PerformanceMonitoringLocationType {

    @XmlEnumValue("PML_NEAR_END_Rx")
    PML_NEAR_END_RX("PML_NEAR_END_Rx"),
    @XmlEnumValue("PML_FAR_END_Rx")
    PML_FAR_END_RX("PML_FAR_END_Rx"),
    @XmlEnumValue("PML_FAR_ENDTypex")
    PML_FAR_END_TYPEX("PML_FAR_ENDTypex"),
    PML_BIDIRECTIONAL("PML_BIDIRECTIONAL"),
    @XmlEnumValue("PML_CONTRA_NEAR_END_Rx")
    PML_CONTRA_NEAR_END_RX("PML_CONTRA_NEAR_END_Rx"),
    @XmlEnumValue("PML_CONTRA_FAR_END_Rx")
    PML_CONTRA_FAR_END_RX("PML_CONTRA_FAR_END_Rx");
    private final String value;

    PerformanceMonitoringLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerformanceMonitoringLocationType fromValue(String v) {
        for (PerformanceMonitoringLocationType c: PerformanceMonitoringLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
