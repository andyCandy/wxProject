
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConnectionDirectionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionDirectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CD_UNI"/>
 *     &lt;enumeration value="CD_BI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectionDirectionType")
@XmlEnum
public enum ConnectionDirectionType {

    CD_UNI,
    CD_BI;

    public String value() {
        return name();
    }

    public static ConnectionDirectionType fromValue(String v) {
        return valueOf(v);
    }

}
