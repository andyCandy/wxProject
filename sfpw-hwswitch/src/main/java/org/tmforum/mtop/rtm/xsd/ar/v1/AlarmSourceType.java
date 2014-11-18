
package org.tmforum.mtop.rtm.xsd.ar.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AlarmSourceType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AlarmSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTERNAL"/>
 *     &lt;enumeration value="EXTERNAL"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlarmSourceType")
@XmlEnum
public enum AlarmSourceType {

    INTERNAL,
    EXTERNAL,
    NOT_APPLICABLE;

    public String value() {
        return name();
    }

    public static AlarmSourceType fromValue(String v) {
        return valueOf(v);
    }

}
