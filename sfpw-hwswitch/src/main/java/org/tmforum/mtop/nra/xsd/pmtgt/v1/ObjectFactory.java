
package org.tmforum.mtop.nra.xsd.pmtgt.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.nra.xsd.pmtgt.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PmObjectSelect_QNAME = new QName("http://www.tmforum.org/mtop/nra/xsd/pmtgt/v1", "pmObjectSelect");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.nra.xsd.pmtgt.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PerformanceMonitoringInstanceListType }
     * 
     */
    public PerformanceMonitoringInstanceListType createPerformanceMonitoringInstanceListType() {
        return new PerformanceMonitoringInstanceListType();
    }

    /**
     * Create an instance of {@link PerformanceMonitoringObjectSelectListType }
     * 
     */
    public PerformanceMonitoringObjectSelectListType createPerformanceMonitoringObjectSelectListType() {
        return new PerformanceMonitoringObjectSelectListType();
    }

    /**
     * Create an instance of {@link PerformanceMonitoringObjectSelectType }
     * 
     */
    public PerformanceMonitoringObjectSelectType createPerformanceMonitoringObjectSelectType() {
        return new PerformanceMonitoringObjectSelectType();
    }

    /**
     * Create an instance of {@link PerformanceCreateInstanceType }
     * 
     */
    public PerformanceCreateInstanceType createPerformanceCreateInstanceType() {
        return new PerformanceCreateInstanceType();
    }

    /**
     * Create an instance of {@link PerformanceCreateResourceType }
     * 
     */
    public PerformanceCreateResourceType createPerformanceCreateResourceType() {
        return new PerformanceCreateResourceType();
    }

    /**
     * Create an instance of {@link PerformanceTemplateType }
     * 
     */
    public PerformanceTemplateType createPerformanceTemplateType() {
        return new PerformanceTemplateType();
    }

    /**
     * Create an instance of {@link PerformanceMonitoringInstanceType }
     * 
     */
    public PerformanceMonitoringInstanceType createPerformanceMonitoringInstanceType() {
        return new PerformanceMonitoringInstanceType();
    }

    /**
     * Create an instance of {@link PmMonitorConditioningTypeList }
     * 
     */
    public PmMonitorConditioningTypeList createPmMonitorConditioningTypeList() {
        return new PmMonitorConditioningTypeList();
    }

    /**
     * Create an instance of {@link PmMonitorConditioningType }
     * 
     */
    public PmMonitorConditioningType createPmMonitorConditioningType() {
        return new PmMonitorConditioningType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformanceMonitoringObjectSelectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/nra/xsd/pmtgt/v1", name = "pmObjectSelect")
    public JAXBElement<PerformanceMonitoringObjectSelectType> createPmObjectSelect(PerformanceMonitoringObjectSelectType value) {
        return new JAXBElement<PerformanceMonitoringObjectSelectType>(_PmObjectSelect_QNAME, PerformanceMonitoringObjectSelectType.class, null, value);
    }

}
