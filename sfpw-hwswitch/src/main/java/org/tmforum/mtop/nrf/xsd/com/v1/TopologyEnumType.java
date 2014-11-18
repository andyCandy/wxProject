
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TopologyEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TopologyEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="TOPO_SINGLETON"/>
 *     &lt;enumeration value="TOPO_CHAIN"/>
 *     &lt;enumeration value="TOPO_PSR"/>
 *     &lt;enumeration value="TOPO_OPEN_PSR"/>
 *     &lt;enumeration value="TOPO_SPRING"/>
 *     &lt;enumeration value="TOPO_OPEN_SPRING"/>
 *     &lt;enumeration value="TOPO_MESH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TopologyEnumType")
@XmlEnum
public enum TopologyEnumType {

    MINOR_EXT,
    TOPO_SINGLETON,
    TOPO_CHAIN,
    TOPO_PSR,
    TOPO_OPEN_PSR,
    TOPO_SPRING,
    TOPO_OPEN_SPRING,
    TOPO_MESH;

    public String value() {
        return name();
    }

    public static TopologyEnumType fromValue(String v) {
        return valueOf(v);
    }

}
