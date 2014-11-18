
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NetworkRoutedType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkRoutedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NR_NA"/>
 *     &lt;enumeration value="NR_NO"/>
 *     &lt;enumeration value="NR_YES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkRoutedType")
@XmlEnum
public enum NetworkRoutedType {

    NR_NA,
    NR_NO,
    NR_YES;

    public String value() {
        return name();
    }

    public static NetworkRoutedType fromValue(String v) {
        return valueOf(v);
    }

}
