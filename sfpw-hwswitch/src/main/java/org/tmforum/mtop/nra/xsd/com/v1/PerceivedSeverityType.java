
package org.tmforum.mtop.nra.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PerceivedSeverityType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PerceivedSeverityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INDETERMINATE"/>
 *     &lt;enumeration value="CRITICAL"/>
 *     &lt;enumeration value="MAJOR"/>
 *     &lt;enumeration value="MINOR"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="CLEARED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PerceivedSeverityType")
@XmlEnum
public enum PerceivedSeverityType {

    INDETERMINATE,
    CRITICAL,
    MAJOR,
    MINOR,
    WARNING,
    CLEARED;

    public String value() {
        return name();
    }

    public static PerceivedSeverityType fromValue(String v) {
        return valueOf(v);
    }

}
