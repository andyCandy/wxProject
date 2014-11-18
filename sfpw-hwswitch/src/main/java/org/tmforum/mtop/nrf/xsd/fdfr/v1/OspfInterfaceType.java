
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>OspfInterfaceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OspfInterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interfaceName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="helloInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deadInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transDelay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="drPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="authType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="runStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="backupDesignatedRouter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="designatedRouter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OspfInterfaceType", propOrder = {
    "interfaceName",
    "helloInterval",
    "deadInterval",
    "transDelay",
    "drPriority",
    "authType",
    "password",
    "runStatus",
    "backupDesignatedRouter",
    "designatedRouter"
})
public class OspfInterfaceType {

    @XmlElement(required = true)
    protected NamingAttributeType interfaceName;
    protected int helloInterval;
    protected int deadInterval;
    protected int transDelay;
    protected int drPriority;
    @XmlElement(required = true)
    protected String authType;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String runStatus;
    @XmlElement(required = true)
    protected String backupDesignatedRouter;
    @XmlElement(required = true)
    protected String designatedRouter;

    /**
     * 获取interfaceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getInterfaceName() {
        return interfaceName;
    }

    /**
     * 设置interfaceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setInterfaceName(NamingAttributeType value) {
        this.interfaceName = value;
    }

    /**
     * 获取helloInterval属性的值。
     * 
     */
    public int getHelloInterval() {
        return helloInterval;
    }

    /**
     * 设置helloInterval属性的值。
     * 
     */
    public void setHelloInterval(int value) {
        this.helloInterval = value;
    }

    /**
     * 获取deadInterval属性的值。
     * 
     */
    public int getDeadInterval() {
        return deadInterval;
    }

    /**
     * 设置deadInterval属性的值。
     * 
     */
    public void setDeadInterval(int value) {
        this.deadInterval = value;
    }

    /**
     * 获取transDelay属性的值。
     * 
     */
    public int getTransDelay() {
        return transDelay;
    }

    /**
     * 设置transDelay属性的值。
     * 
     */
    public void setTransDelay(int value) {
        this.transDelay = value;
    }

    /**
     * 获取drPriority属性的值。
     * 
     */
    public int getDrPriority() {
        return drPriority;
    }

    /**
     * 设置drPriority属性的值。
     * 
     */
    public void setDrPriority(int value) {
        this.drPriority = value;
    }

    /**
     * 获取authType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * 设置authType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthType(String value) {
        this.authType = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取runStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunStatus() {
        return runStatus;
    }

    /**
     * 设置runStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunStatus(String value) {
        this.runStatus = value;
    }

    /**
     * 获取backupDesignatedRouter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupDesignatedRouter() {
        return backupDesignatedRouter;
    }

    /**
     * 设置backupDesignatedRouter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupDesignatedRouter(String value) {
        this.backupDesignatedRouter = value;
    }

    /**
     * 获取designatedRouter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignatedRouter() {
        return designatedRouter;
    }

    /**
     * 设置designatedRouter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignatedRouter(String value) {
        this.designatedRouter = value;
    }

}
