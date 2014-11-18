
package org.tmforum.mtop.nra.xsd.pm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PerformanceMonitoringIntervalStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PerformanceMonitoringIntervalStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PMIS_Valid"/>
 *     &lt;enumeration value="PMIS_Incomplete"/>
 *     &lt;enumeration value="PMIS_Invalid"/>
 *     &lt;enumeration value="PMIS_Unavailable"/>
 *     &lt;enumeration value="PMIS_ZeroSuppressed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PerformanceMonitoringIntervalStatusType")
@XmlEnum
public enum PerformanceMonitoringIntervalStatusType {

    @XmlEnumValue("PMIS_Valid")
    PMIS_VALID("PMIS_Valid"),
    @XmlEnumValue("PMIS_Incomplete")
    PMIS_INCOMPLETE("PMIS_Incomplete"),
    @XmlEnumValue("PMIS_Invalid")
    PMIS_INVALID("PMIS_Invalid"),
    @XmlEnumValue("PMIS_Unavailable")
    PMIS_UNAVAILABLE("PMIS_Unavailable"),
    @XmlEnumValue("PMIS_ZeroSuppressed")
    PMIS_ZERO_SUPPRESSED("PMIS_ZeroSuppressed");
    private final String value;

    PerformanceMonitoringIntervalStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerformanceMonitoringIntervalStatusType fromValue(String v) {
        for (PerformanceMonitoringIntervalStatusType c: PerformanceMonitoringIntervalStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
