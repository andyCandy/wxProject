
package org.tmforum.mtop.mri.xsd.ancp.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.mri.xsd.ancp.v1 package. 
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

    private final static QName _AncpLine_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/ancp/v1", "ancpLine");
    private final static QName _AncpNeighbor_QNAME = new QName("http://www.tmforum.org/mtop/mri/xsd/ancp/v1", "ancpNeighbor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.mri.xsd.ancp.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetANCPProfileAssociatedResourceNamesException }
     * 
     */
    public GetANCPProfileAssociatedResourceNamesException createGetANCPProfileAssociatedResourceNamesException() {
        return new GetANCPProfileAssociatedResourceNamesException();
    }

    /**
     * Create an instance of {@link GetANCPParameterResponse }
     * 
     */
    public GetANCPParameterResponse createGetANCPParameterResponse() {
        return new GetANCPParameterResponse();
    }

    /**
     * Create an instance of {@link ANCPParameterType }
     * 
     */
    public ANCPParameterType createANCPParameterType() {
        return new ANCPParameterType();
    }

    /**
     * Create an instance of {@link GetAllANCPNeighborProfilesRequest }
     * 
     */
    public GetAllANCPNeighborProfilesRequest createGetAllANCPNeighborProfilesRequest() {
        return new GetAllANCPNeighborProfilesRequest();
    }

    /**
     * Create an instance of {@link GetANCPProfileAssociatedResourceNamesRequest }
     * 
     */
    public GetANCPProfileAssociatedResourceNamesRequest createGetANCPProfileAssociatedResourceNamesRequest() {
        return new GetANCPProfileAssociatedResourceNamesRequest();
    }

    /**
     * Create an instance of {@link GetAllANCPAccessLinesResponse }
     * 
     */
    public GetAllANCPAccessLinesResponse createGetAllANCPAccessLinesResponse() {
        return new GetAllANCPAccessLinesResponse();
    }

    /**
     * Create an instance of {@link ANCPAccessLineListType }
     * 
     */
    public ANCPAccessLineListType createANCPAccessLineListType() {
        return new ANCPAccessLineListType();
    }

    /**
     * Create an instance of {@link ANCPAccessLineType }
     * 
     */
    public ANCPAccessLineType createANCPAccessLineType() {
        return new ANCPAccessLineType();
    }

    /**
     * Create an instance of {@link GetAllANCPAccessLinesRequest }
     * 
     */
    public GetAllANCPAccessLinesRequest createGetAllANCPAccessLinesRequest() {
        return new GetAllANCPAccessLinesRequest();
    }

    /**
     * Create an instance of {@link GetANCPParameterRequest }
     * 
     */
    public GetANCPParameterRequest createGetANCPParameterRequest() {
        return new GetANCPParameterRequest();
    }

    /**
     * Create an instance of {@link GetAllANCPAccessLinesException }
     * 
     */
    public GetAllANCPAccessLinesException createGetAllANCPAccessLinesException() {
        return new GetAllANCPAccessLinesException();
    }

    /**
     * Create an instance of {@link GetAllANCPNeighborProfilesResponse }
     * 
     */
    public GetAllANCPNeighborProfilesResponse createGetAllANCPNeighborProfilesResponse() {
        return new GetAllANCPNeighborProfilesResponse();
    }

    /**
     * Create an instance of {@link ANCPNeighborProfileListType }
     * 
     */
    public ANCPNeighborProfileListType createANCPNeighborProfileListType() {
        return new ANCPNeighborProfileListType();
    }

    /**
     * Create an instance of {@link GetAllANCPNeighborProfilesException }
     * 
     */
    public GetAllANCPNeighborProfilesException createGetAllANCPNeighborProfilesException() {
        return new GetAllANCPNeighborProfilesException();
    }

    /**
     * Create an instance of {@link ANCPNeighborProfileType }
     * 
     */
    public ANCPNeighborProfileType createANCPNeighborProfileType() {
        return new ANCPNeighborProfileType();
    }

    /**
     * Create an instance of {@link GetANCPProfileAssociatedResourceNamesResponse }
     * 
     */
    public GetANCPProfileAssociatedResourceNamesResponse createGetANCPProfileAssociatedResourceNamesResponse() {
        return new GetANCPProfileAssociatedResourceNamesResponse();
    }

    /**
     * Create an instance of {@link GetANCPParameterException }
     * 
     */
    public GetANCPParameterException createGetANCPParameterException() {
        return new GetANCPParameterException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANCPAccessLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/ancp/v1", name = "ancpLine")
    public JAXBElement<ANCPAccessLineType> createAncpLine(ANCPAccessLineType value) {
        return new JAXBElement<ANCPAccessLineType>(_AncpLine_QNAME, ANCPAccessLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANCPNeighborProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/mri/xsd/ancp/v1", name = "ancpNeighbor")
    public JAXBElement<ANCPNeighborProfileType> createAncpNeighbor(ANCPNeighborProfileType value) {
        return new JAXBElement<ANCPNeighborProfileType>(_AncpNeighbor_QNAME, ANCPNeighborProfileType.class, null, value);
    }

}
