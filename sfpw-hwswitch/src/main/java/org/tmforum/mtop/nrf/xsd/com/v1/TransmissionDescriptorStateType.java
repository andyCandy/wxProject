
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransmissionDescriptorStateType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TransmissionDescriptorStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TMD_MISSING"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="APPLIED"/>
 *     &lt;enumeration value="MISMATCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransmissionDescriptorStateType")
@XmlEnum
public enum TransmissionDescriptorStateType {

    TMD_MISSING,
    NOT_APPLICABLE,
    PENDING,
    APPLIED,
    MISMATCH;

    public String value() {
        return name();
    }

    public static TransmissionDescriptorStateType fromValue(String v) {
        return valueOf(v);
    }

}
