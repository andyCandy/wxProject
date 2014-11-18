
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TerminationPointProtectionAssociationType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="TerminationPointProtectionAssociationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TPPA_NA"/>
 *     &lt;enumeration value="TPPA_PSR_RELATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TerminationPointProtectionAssociationType")
@XmlEnum
public enum TerminationPointProtectionAssociationType {

    TPPA_NA,
    TPPA_PSR_RELATED;

    public String value() {
        return name();
    }

    public static TerminationPointProtectionAssociationType fromValue(String v) {
        return valueOf(v);
    }

}
