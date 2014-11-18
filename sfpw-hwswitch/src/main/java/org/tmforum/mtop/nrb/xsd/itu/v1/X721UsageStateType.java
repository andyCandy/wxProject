
package org.tmforum.mtop.nrb.xsd.itu.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>X721.UsageStateType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="X721.UsageStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IDLE"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="BUSY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "X721.UsageStateType")
@XmlEnum
public enum X721UsageStateType {

    IDLE,
    ACTIVE,
    BUSY;

    public String value() {
        return name();
    }

    public static X721UsageStateType fromValue(String v) {
        return valueOf(v);
    }

}
