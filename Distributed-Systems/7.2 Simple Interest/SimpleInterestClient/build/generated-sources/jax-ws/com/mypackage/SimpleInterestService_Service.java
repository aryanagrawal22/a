
package com.mypackage;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SimpleInterestService", targetNamespace = "http://MyPackage.com/", wsdlLocation = "http://localhost:8080/SimpleInterest/SimpleInterestService?wsdl")
public class SimpleInterestService_Service
    extends Service
{

    private final static URL SIMPLEINTERESTSERVICE_WSDL_LOCATION;
    private final static WebServiceException SIMPLEINTERESTSERVICE_EXCEPTION;
    private final static QName SIMPLEINTERESTSERVICE_QNAME = new QName("http://MyPackage.com/", "SimpleInterestService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SimpleInterest/SimpleInterestService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIMPLEINTERESTSERVICE_WSDL_LOCATION = url;
        SIMPLEINTERESTSERVICE_EXCEPTION = e;
    }

    public SimpleInterestService_Service() {
        super(__getWsdlLocation(), SIMPLEINTERESTSERVICE_QNAME);
    }

    public SimpleInterestService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIMPLEINTERESTSERVICE_QNAME, features);
    }

    public SimpleInterestService_Service(URL wsdlLocation) {
        super(wsdlLocation, SIMPLEINTERESTSERVICE_QNAME);
    }

    public SimpleInterestService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIMPLEINTERESTSERVICE_QNAME, features);
    }

    public SimpleInterestService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SimpleInterestService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SimpleInterestService
     */
    @WebEndpoint(name = "SimpleInterestServicePort")
    public SimpleInterestService getSimpleInterestServicePort() {
        return super.getPort(new QName("http://MyPackage.com/", "SimpleInterestServicePort"), SimpleInterestService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SimpleInterestService
     */
    @WebEndpoint(name = "SimpleInterestServicePort")
    public SimpleInterestService getSimpleInterestServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://MyPackage.com/", "SimpleInterestServicePort"), SimpleInterestService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIMPLEINTERESTSERVICE_EXCEPTION!= null) {
            throw SIMPLEINTERESTSERVICE_EXCEPTION;
        }
        return SIMPLEINTERESTSERVICE_WSDL_LOCATION;
    }

}