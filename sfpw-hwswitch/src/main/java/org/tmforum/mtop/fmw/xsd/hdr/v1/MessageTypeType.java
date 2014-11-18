
package org.tmforum.mtop.fmw.xsd.hdr.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MessageTypeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MessageTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUEST"/>
 *     &lt;enumeration value="RESPONSE"/>
 *     &lt;enumeration value="NOTIFICATION"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageTypeType")
@XmlEnum
public enum MessageTypeType {

    REQUEST,
    RESPONSE,
    NOTIFICATION,
    ERROR;

    public String value() {
        return name();
    }

    public static MessageTypeType fromValue(String v) {
        return valueOf(v);
    }

}
