
package org.tmforum.mtop.mri.wsdl.tlr.v1_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:51:55.484+08:00
 * Generated source version: 3.0.1
 * 
 */
public final class TopologicalLinkRetrievalRPC_TopologicalLinkRetrievalRPC_Client {

    private static final QName SERVICE_NAME = new QName("http://www.tmforum.org/mtop/mri/wsdl/tlr/v1-0", "TopologicalLinkRetrievalHttp");

    private TopologicalLinkRetrievalRPC_TopologicalLinkRetrievalRPC_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = TopologicalLinkRetrievalHttp.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        TopologicalLinkRetrievalHttp ss = new TopologicalLinkRetrievalHttp(wsdlURL, SERVICE_NAME);
        TopologicalLinkRetrievalRPC port = ss.getTopologicalLinkRetrievalRPC();  
        
        {
        System.out.println("Invoking getAllTopLevelTopologicalLinks...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getAllTopLevelTopologicalLinks_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getAllTopLevelTopologicalLinks_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getAllTopLevelTopologicalLinks_mtopHeaderVal);
        org.tmforum.mtop.mri.xsd.tlr.v1.GetAllTopLevelTopologicalLinksRequest _getAllTopLevelTopologicalLinks_mtopBody = null;
        try {
            org.tmforum.mtop.mri.xsd.tlr.v1.MultipleTlObjectsResponseType _getAllTopLevelTopologicalLinks__return = port.getAllTopLevelTopologicalLinks(_getAllTopLevelTopologicalLinks_mtopHeader, _getAllTopLevelTopologicalLinks_mtopBody);
            System.out.println("getAllTopLevelTopologicalLinks.result=" + _getAllTopLevelTopologicalLinks__return);

            System.out.println("getAllTopLevelTopologicalLinks._getAllTopLevelTopologicalLinks_mtopHeader=" + _getAllTopLevelTopologicalLinks_mtopHeader.value);
        } catch (GetAllTopLevelTopologicalLinksException e) { 
            System.out.println("Expected exception: GetAllTopLevelTopologicalLinksException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getTopLevelTopologicalLink...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getTopLevelTopologicalLink_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getTopLevelTopologicalLink_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getTopLevelTopologicalLink_mtopHeaderVal);
        org.tmforum.mtop.mri.xsd.tlr.v1.GetTopLevelTopologicalLinkRequest _getTopLevelTopologicalLink_mtopBody = null;
        try {
            org.tmforum.mtop.mri.xsd.tlr.v1.GetTopLevelTopologicalLinkResponse _getTopLevelTopologicalLink__return = port.getTopLevelTopologicalLink(_getTopLevelTopologicalLink_mtopHeader, _getTopLevelTopologicalLink_mtopBody);
            System.out.println("getTopLevelTopologicalLink.result=" + _getTopLevelTopologicalLink__return);

            System.out.println("getTopLevelTopologicalLink._getTopLevelTopologicalLink_mtopHeader=" + _getTopLevelTopologicalLink_mtopHeader.value);
        } catch (GetTopLevelTopologicalLinkException e) { 
            System.out.println("Expected exception: GetTopLevelTopologicalLinkException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getAllTopologicalLinksBetweenMds...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getAllTopologicalLinksBetweenMds_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getAllTopologicalLinksBetweenMds_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getAllTopologicalLinksBetweenMds_mtopHeaderVal);
        org.tmforum.mtop.mri.xsd.tlr.v1.GetAllTopologicalLinksBetweenMdsRequest _getAllTopologicalLinksBetweenMds_mtopBody = null;
        try {
            org.tmforum.mtop.mri.xsd.tlr.v1.MultipleTlObjectsResponseType _getAllTopologicalLinksBetweenMds__return = port.getAllTopologicalLinksBetweenMds(_getAllTopologicalLinksBetweenMds_mtopHeader, _getAllTopologicalLinksBetweenMds_mtopBody);
            System.out.println("getAllTopologicalLinksBetweenMds.result=" + _getAllTopologicalLinksBetweenMds__return);

            System.out.println("getAllTopologicalLinksBetweenMds._getAllTopologicalLinksBetweenMds_mtopHeader=" + _getAllTopologicalLinksBetweenMds_mtopHeader.value);
        } catch (GetAllTopologicalLinksBetweenMdsException e) { 
            System.out.println("Expected exception: GetAllTopologicalLinksBetweenMdsException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getRouteAndTopologicalLinks...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getRouteAndTopologicalLinks_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getRouteAndTopologicalLinks_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getRouteAndTopologicalLinks_mtopHeaderVal);
        org.tmforum.mtop.mri.xsd.tlr.v1.GetRouteAndTopologicalLinksRequest _getRouteAndTopologicalLinks_mtopBody = null;
        try {
            org.tmforum.mtop.mri.xsd.tlr.v1.GetRouteAndTopologicalLinksResponse _getRouteAndTopologicalLinks__return = port.getRouteAndTopologicalLinks(_getRouteAndTopologicalLinks_mtopHeader, _getRouteAndTopologicalLinks_mtopBody);
            System.out.println("getRouteAndTopologicalLinks.result=" + _getRouteAndTopologicalLinks__return);

            System.out.println("getRouteAndTopologicalLinks._getRouteAndTopologicalLinks_mtopHeader=" + _getRouteAndTopologicalLinks_mtopHeader.value);
        } catch (GetRouteAndTopologicalLinksException e) { 
            System.out.println("Expected exception: GetRouteAndTopologicalLinksException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getTopologicalLinksIterator...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getTopologicalLinksIterator_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getTopologicalLinksIterator_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getTopologicalLinksIterator_mtopHeaderVal);
        org.tmforum.mtop.fmw.xsd.msg.v1.GetAllDataIteratorRequestType _getTopologicalLinksIterator_mtopBody = null;
        try {
            org.tmforum.mtop.mri.xsd.tlr.v1.MultipleTlObjectsResponseType _getTopologicalLinksIterator__return = port.getTopologicalLinksIterator(_getTopologicalLinksIterator_mtopHeader, _getTopologicalLinksIterator_mtopBody);
            System.out.println("getTopologicalLinksIterator.result=" + _getTopologicalLinksIterator__return);

            System.out.println("getTopologicalLinksIterator._getTopologicalLinksIterator_mtopHeader=" + _getTopologicalLinksIterator_mtopHeader.value);
        } catch (GetTopologicalLinksIteratorException e) { 
            System.out.println("Expected exception: GetTopologicalLinksIteratorException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getTopologicalLink...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getTopologicalLink_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getTopologicalLink_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getTopologicalLink_mtopHeaderVal);
        org.tmforum.mtop.mri.xsd.tlr.v1.GetTopologicalLinkRequest _getTopologicalLink_mtopBody = null;
        try {
            org.tmforum.mtop.mri.xsd.tlr.v1.SingleObjectResponseType _getTopologicalLink__return = port.getTopologicalLink(_getTopologicalLink_mtopHeader, _getTopologicalLink_mtopBody);
            System.out.println("getTopologicalLink.result=" + _getTopologicalLink__return);

            System.out.println("getTopologicalLink._getTopologicalLink_mtopHeader=" + _getTopologicalLink_mtopHeader.value);
        } catch (GetTopologicalLinkException e) { 
            System.out.println("Expected exception: GetTopologicalLinkException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getAllTopologicalLinksWrtOs...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getAllTopologicalLinksWrtOs_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getAllTopologicalLinksWrtOs_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getAllTopologicalLinksWrtOs_mtopHeaderVal);
        org.tmforum.mtop.mri.xsd.tlr.v1.GetAllTopologicalLinksWrtOsRequest _getAllTopologicalLinksWrtOs_mtopBody = null;
        try {
            org.tmforum.mtop.mri.xsd.tlr.v1.MultipleTlObjectsResponseType _getAllTopologicalLinksWrtOs__return = port.getAllTopologicalLinksWrtOs(_getAllTopologicalLinksWrtOs_mtopHeader, _getAllTopologicalLinksWrtOs_mtopBody);
            System.out.println("getAllTopologicalLinksWrtOs.result=" + _getAllTopologicalLinksWrtOs__return);

            System.out.println("getAllTopologicalLinksWrtOs._getAllTopologicalLinksWrtOs_mtopHeader=" + _getAllTopologicalLinksWrtOs_mtopHeader.value);
        } catch (GetAllTopologicalLinksWrtOsException e) { 
            System.out.println("Expected exception: GetAllTopologicalLinksWrtOsException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getAllTopologicalLinks...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getAllTopologicalLinks_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getAllTopologicalLinks_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getAllTopologicalLinks_mtopHeaderVal);
        org.tmforum.mtop.mri.xsd.tlr.v1.GetAllTopologicalLinksRequest _getAllTopologicalLinks_mtopBody = null;
        try {
            org.tmforum.mtop.mri.xsd.tlr.v1.MultipleTlObjectsResponseType _getAllTopologicalLinks__return = port.getAllTopologicalLinks(_getAllTopologicalLinks_mtopHeader, _getAllTopologicalLinks_mtopBody);
            System.out.println("getAllTopologicalLinks.result=" + _getAllTopologicalLinks__return);

            System.out.println("getAllTopologicalLinks._getAllTopologicalLinks_mtopHeader=" + _getAllTopologicalLinks_mtopHeader.value);
        } catch (GetAllTopologicalLinksException e) { 
            System.out.println("Expected exception: GetAllTopologicalLinksException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getAllTopologicalLinksOfFd...");
        org.tmforum.mtop.fmw.xsd.hdr.v1.Header _getAllTopologicalLinksOfFd_mtopHeaderVal = null;
        javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header> _getAllTopologicalLinksOfFd_mtopHeader = new javax.xml.ws.Holder<org.tmforum.mtop.fmw.xsd.hdr.v1.Header>(_getAllTopologicalLinksOfFd_mtopHeaderVal);
        org.tmforum.mtop.mri.xsd.tlr.v1.GetAllTopologicalLinksOfFdRequest _getAllTopologicalLinksOfFd_mtopBody = null;
        try {
            org.tmforum.mtop.mri.xsd.tlr.v1.MultipleTlObjectsResponseType _getAllTopologicalLinksOfFd__return = port.getAllTopologicalLinksOfFd(_getAllTopologicalLinksOfFd_mtopHeader, _getAllTopologicalLinksOfFd_mtopBody);
            System.out.println("getAllTopologicalLinksOfFd.result=" + _getAllTopologicalLinksOfFd__return);

            System.out.println("getAllTopologicalLinksOfFd._getAllTopologicalLinksOfFd_mtopHeader=" + _getAllTopologicalLinksOfFd_mtopHeader.value);
        } catch (GetAllTopologicalLinksOfFdException e) { 
            System.out.println("Expected exception: GetAllTopologicalLinksOfFdException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
