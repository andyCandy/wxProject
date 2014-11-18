
package org.tmforum.mtop.nrf.xsd.fd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConnectivityStateType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectivityStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CS_UNKNOWN"/>
 *     &lt;enumeration value="CS_FULLY_CONNECTED"/>
 *     &lt;enumeration value="CS_NOT_FULLY_CONNECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectivityStateType")
@XmlEnum
public enum ConnectivityStateType {

    CS_UNKNOWN,
    CS_FULLY_CONNECTED,
    CS_NOT_FULLY_CONNECTED;

    public String value() {
        return name();
    }

    public static ConnectivityStateType fromValue(String v) {
        return valueOf(v);
    }

}
