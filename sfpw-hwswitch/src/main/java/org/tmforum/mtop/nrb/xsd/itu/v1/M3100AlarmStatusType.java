
package org.tmforum.mtop.nrb.xsd.itu.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>M3100.AlarmStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="M3100.AlarmStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLEARED"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="INDETERMINATE"/>
 *     &lt;enumeration value="MINOR"/>
 *     &lt;enumeration value="MAJOR"/>
 *     &lt;enumeration value="CRITICAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "M3100.AlarmStatusType")
@XmlEnum
public enum M3100AlarmStatusType {

    CLEARED,
    PENDING,
    WARNING,
    INDETERMINATE,
    MINOR,
    MAJOR,
    CRITICAL;

    public String value() {
        return name();
    }

    public static M3100AlarmStatusType fromValue(String v) {
        return valueOf(v);
    }

}
