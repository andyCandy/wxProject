package org.tmforum.mtop.mri.wsdl.eir.v1_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:52:24.875+08:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "EquipmentInventoryRetrievalHttp", 
                  wsdlLocation = "http://192.168.189.46:9997/EquipmentInventoryRetrieval?wsdl",
                  targetNamespace = "http://www.tmforum.org/mtop/mri/wsdl/eir/v1-0") 
public class EquipmentInventoryRetrievalHttp extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.tmforum.org/mtop/mri/wsdl/eir/v1-0", "EquipmentInventoryRetrievalHttp");
    public final static QName EquipmentInventoryRetrievalRPC = new QName("http://www.tmforum.org/mtop/mri/wsdl/eir/v1-0", "EquipmentInventoryRetrieval_RPC");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.189.46:9997/EquipmentInventoryRetrieval?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EquipmentInventoryRetrievalHttp.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.189.46:9997/EquipmentInventoryRetrieval?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EquipmentInventoryRetrievalHttp(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EquipmentInventoryRetrievalHttp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EquipmentInventoryRetrievalHttp() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns EquipmentInventoryRetrievalRPC
     */
    @WebEndpoint(name = "EquipmentInventoryRetrieval_RPC")
    public EquipmentInventoryRetrievalRPC getEquipmentInventoryRetrievalRPC() {
        return super.getPort(EquipmentInventoryRetrievalRPC, EquipmentInventoryRetrievalRPC.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EquipmentInventoryRetrievalRPC
     */
    @WebEndpoint(name = "EquipmentInventoryRetrieval_RPC")
    public EquipmentInventoryRetrievalRPC getEquipmentInventoryRetrievalRPC(WebServiceFeature... features) {
        return super.getPort(EquipmentInventoryRetrievalRPC, EquipmentInventoryRetrievalRPC.class, features);
    }

}