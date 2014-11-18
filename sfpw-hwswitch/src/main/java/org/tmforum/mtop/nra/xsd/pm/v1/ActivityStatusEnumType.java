
package org.tmforum.mtop.nra.xsd.pm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActivityStatusEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityStatusEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_STARTED"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivityStatusEnumType")
@XmlEnum
public enum ActivityStatusEnumType {

    NOT_STARTED,
    ACTIVE,
    SUSPENDED;

    public String value() {
        return name();
    }

    public static ActivityStatusEnumType fromValue(String v) {
        return valueOf(v);
    }

}
