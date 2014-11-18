
package org.tmforum.mtop.nrf.xsd.fd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FdTypeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FdTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FDT_SINGLETON"/>
 *     &lt;enumeration value="FDT_NETWORK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FdTypeType")
@XmlEnum
public enum FdTypeType {

    FDT_SINGLETON,
    FDT_NETWORK;

    public String value() {
        return name();
    }

    public static FdTypeType fromValue(String v) {
        return valueOf(v);
    }

}
