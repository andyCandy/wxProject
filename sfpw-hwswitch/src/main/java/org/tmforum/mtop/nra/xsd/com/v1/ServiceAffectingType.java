
package org.tmforum.mtop.nra.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ServiceAffectingType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceAffectingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="SERVICE_AFFECTING"/>
 *     &lt;enumeration value="NON_SERVICE_AFFECTING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceAffectingType")
@XmlEnum
public enum ServiceAffectingType {

    UNKNOWN,
    SERVICE_AFFECTING,
    NON_SERVICE_AFFECTING;

    public String value() {
        return name();
    }

    public static ServiceAffectingType fromValue(String v) {
        return valueOf(v);
    }

}
