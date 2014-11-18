
package org.tmforum.mtop.nra.xsd.prc.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProbableCauseEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ProbableCauseEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VENDOR_EXT"/>
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="UNIDENTIFIED"/>
 *     &lt;enumeration value="AIS"/>
 *     &lt;enumeration value="AMS"/>
 *     &lt;enumeration value="ATPC_FAIL"/>
 *     &lt;enumeration value="AU-AIS"/>
 *     &lt;enumeration value="BER_SD"/>
 *     &lt;enumeration value="BER_SF"/>
 *     &lt;enumeration value="BLOCKED_FE"/>
 *     &lt;enumeration value="CFG_ABORT"/>
 *     &lt;enumeration value="CFG_ABORT_FE"/>
 *     &lt;enumeration value="DCC_FAILURE"/>
 *     &lt;enumeration value="DEMODULATION_FAIL"/>
 *     &lt;enumeration value="EMS"/>
 *     &lt;enumeration value="EMS_ALM_LOSS"/>
 *     &lt;enumeration value="EMS_LIFECYCLE_LOSS"/>
 *     &lt;enumeration value="EMS_ALM_AND_LIFECYCLE_LOSS"/>
 *     &lt;enumeration value="EQPT"/>
 *     &lt;enumeration value="ENV"/>
 *     &lt;enumeration value="FF"/>
 *     &lt;enumeration value="FOP_APS"/>
 *     &lt;enumeration value="INSUFF_LINKS"/>
 *     &lt;enumeration value="INSUFF_LINKS_FE"/>
 *     &lt;enumeration value="LCD"/>
 *     &lt;enumeration value="LIF"/>
 *     &lt;enumeration value="LOA"/>
 *     &lt;enumeration value="LOC"/>
 *     &lt;enumeration value="LODS"/>
 *     &lt;enumeration value="LOF"/>
 *     &lt;enumeration value="LOM"/>
 *     &lt;enumeration value="LOP"/>
 *     &lt;enumeration value="LOPC"/>
 *     &lt;enumeration value="LOS"/>
 *     &lt;enumeration value="LOTC"/>
 *     &lt;enumeration value="MODULATION_FAIL"/>
 *     &lt;enumeration value="MS-AIS"/>
 *     &lt;enumeration value="OS"/>
 *     &lt;enumeration value="OS_ALM_LOSS"/>
 *     &lt;enumeration value="OS_LIFECYCLE_LOSS"/>
 *     &lt;enumeration value="OS_ALM_AND_LIFECYCLE_LOSS"/>
 *     &lt;enumeration value="OSC-AIS"/>
 *     &lt;enumeration value="OSC_BER_SF"/>
 *     &lt;enumeration value="OSC_FERF"/>
 *     &lt;enumeration value="OSC_LOF"/>
 *     &lt;enumeration value="OSC_LOS"/>
 *     &lt;enumeration value="OSC_SD"/>
 *     &lt;enumeration value="PLM"/>
 *     &lt;enumeration value="RAI"/>
 *     &lt;enumeration value="RX_FAIL"/>
 *     &lt;enumeration value="RX_MIS_CONNECT"/>
 *     &lt;enumeration value="RX_UNUSABLE_FE"/>
 *     &lt;enumeration value="SECURITY_VIOLATION"/>
 *     &lt;enumeration value="SQL"/>
 *     &lt;enumeration value="SSF"/>
 *     &lt;enumeration value="STARTUP_FE"/>
 *     &lt;enumeration value="TCF"/>
 *     &lt;enumeration value="TCFE"/>
 *     &lt;enumeration value="TCFI"/>
 *     &lt;enumeration value="TIM"/>
 *     &lt;enumeration value="TIMING_SYNCH"/>
 *     &lt;enumeration value="TSD"/>
 *     &lt;enumeration value="TSF"/>
 *     &lt;enumeration value="TU-AIS"/>
 *     &lt;enumeration value="TX_DEGRADE"/>
 *     &lt;enumeration value="TX_FAIL"/>
 *     &lt;enumeration value="TX_MIS_CONNECT"/>
 *     &lt;enumeration value="TX_UNUSABLE_FE"/>
 *     &lt;enumeration value="UAT"/>
 *     &lt;enumeration value="UNEQ"/>
 *     &lt;enumeration value="VC-AIS"/>
 *     &lt;enumeration value="VC-RDI"/>
 *     &lt;enumeration value="VP-AIS"/>
 *     &lt;enumeration value="VP-RDI"/>
 *     &lt;enumeration value="XPIC_FAIL"/>
 *     &lt;enumeration value="NE_COMMU_BREAK"/>
 *     &lt;enumeration value="GNE_CONNECT_FAIL"/>
 *     &lt;enumeration value="GNE_MGR_LIMIT_OVER"/>
 *     &lt;enumeration value="TCM-TIM"/>
 *     &lt;enumeration value="TCM-AIS"/>
 *     &lt;enumeration value="TCM-SSF"/>
 *     &lt;enumeration value="NBI_DATA_NEED_SYNC"/>
 *     &lt;enumeration value="TCM_SD"/>
 *     &lt;enumeration value="K1K2M"/>
 *     &lt;enumeration value="OOF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProbableCauseEnumType")
@XmlEnum
public enum ProbableCauseEnumType {

    VENDOR_EXT("VENDOR_EXT"),
    MINOR_EXT("MINOR_EXT"),
    UNIDENTIFIED("UNIDENTIFIED"),
    AIS("AIS"),
    AMS("AMS"),
    ATPC_FAIL("ATPC_FAIL"),
    @XmlEnumValue("AU-AIS")
    AU_AIS("AU-AIS"),
    BER_SD("BER_SD"),
    BER_SF("BER_SF"),
    BLOCKED_FE("BLOCKED_FE"),
    CFG_ABORT("CFG_ABORT"),
    CFG_ABORT_FE("CFG_ABORT_FE"),
    DCC_FAILURE("DCC_FAILURE"),
    DEMODULATION_FAIL("DEMODULATION_FAIL"),
    EMS("EMS"),
    EMS_ALM_LOSS("EMS_ALM_LOSS"),
    EMS_LIFECYCLE_LOSS("EMS_LIFECYCLE_LOSS"),
    EMS_ALM_AND_LIFECYCLE_LOSS("EMS_ALM_AND_LIFECYCLE_LOSS"),
    EQPT("EQPT"),
    ENV("ENV"),
    FF("FF"),
    FOP_APS("FOP_APS"),
    INSUFF_LINKS("INSUFF_LINKS"),
    INSUFF_LINKS_FE("INSUFF_LINKS_FE"),
    LCD("LCD"),
    LIF("LIF"),
    LOA("LOA"),
    LOC("LOC"),
    LODS("LODS"),
    LOF("LOF"),
    LOM("LOM"),
    LOP("LOP"),
    LOPC("LOPC"),
    LOS("LOS"),
    LOTC("LOTC"),
    MODULATION_FAIL("MODULATION_FAIL"),
    @XmlEnumValue("MS-AIS")
    MS_AIS("MS-AIS"),
    OS("OS"),
    OS_ALM_LOSS("OS_ALM_LOSS"),
    OS_LIFECYCLE_LOSS("OS_LIFECYCLE_LOSS"),
    OS_ALM_AND_LIFECYCLE_LOSS("OS_ALM_AND_LIFECYCLE_LOSS"),
    @XmlEnumValue("OSC-AIS")
    OSC_AIS("OSC-AIS"),
    OSC_BER_SF("OSC_BER_SF"),
    OSC_FERF("OSC_FERF"),
    OSC_LOF("OSC_LOF"),
    OSC_LOS("OSC_LOS"),
    OSC_SD("OSC_SD"),
    PLM("PLM"),
    RAI("RAI"),
    RX_FAIL("RX_FAIL"),
    RX_MIS_CONNECT("RX_MIS_CONNECT"),
    RX_UNUSABLE_FE("RX_UNUSABLE_FE"),
    SECURITY_VIOLATION("SECURITY_VIOLATION"),
    SQL("SQL"),
    SSF("SSF"),
    STARTUP_FE("STARTUP_FE"),
    TCF("TCF"),
    TCFE("TCFE"),
    TCFI("TCFI"),
    TIM("TIM"),
    TIMING_SYNCH("TIMING_SYNCH"),
    TSD("TSD"),
    TSF("TSF"),
    @XmlEnumValue("TU-AIS")
    TU_AIS("TU-AIS"),
    TX_DEGRADE("TX_DEGRADE"),
    TX_FAIL("TX_FAIL"),
    TX_MIS_CONNECT("TX_MIS_CONNECT"),
    TX_UNUSABLE_FE("TX_UNUSABLE_FE"),
    UAT("UAT"),
    UNEQ("UNEQ"),
    @XmlEnumValue("VC-AIS")
    VC_AIS("VC-AIS"),
    @XmlEnumValue("VC-RDI")
    VC_RDI("VC-RDI"),
    @XmlEnumValue("VP-AIS")
    VP_AIS("VP-AIS"),
    @XmlEnumValue("VP-RDI")
    VP_RDI("VP-RDI"),
    XPIC_FAIL("XPIC_FAIL"),
    NE_COMMU_BREAK("NE_COMMU_BREAK"),
    GNE_CONNECT_FAIL("GNE_CONNECT_FAIL"),
    GNE_MGR_LIMIT_OVER("GNE_MGR_LIMIT_OVER"),
    @XmlEnumValue("TCM-TIM")
    TCM_TIM("TCM-TIM"),
    @XmlEnumValue("TCM-AIS")
    TCM_AIS("TCM-AIS"),
    @XmlEnumValue("TCM-SSF")
    TCM_SSF("TCM-SSF"),
    NBI_DATA_NEED_SYNC("NBI_DATA_NEED_SYNC"),
    TCM_SD("TCM_SD"),
    @XmlEnumValue("K1K2M")
    K_1_K_2_M("K1K2M"),
    OOF("OOF");
    private final String value;

    ProbableCauseEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProbableCauseEnumType fromValue(String v) {
        for (ProbableCauseEnumType c: ProbableCauseEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
