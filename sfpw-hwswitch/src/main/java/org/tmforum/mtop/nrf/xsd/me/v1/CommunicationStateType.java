
package org.tmforum.mtop.nrf.xsd.me.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CommunicationStateType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CS_AVAILABLE"/>
 *     &lt;enumeration value="CS_UNAVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationStateType")
@XmlEnum
public enum CommunicationStateType {

    CS_AVAILABLE,
    CS_UNAVAILABLE;

    public String value() {
        return name();
    }

    public static CommunicationStateType fromValue(String v) {
        return valueOf(v);
    }

}
