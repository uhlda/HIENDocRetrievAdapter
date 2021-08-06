package com.hienetworks.nwhin.docretrieve.adapter;

import gov.hhs.fha.nhinc.nhinclib.NhincConstants;
import gov.hhs.fha.nhinc.properties.PropertyAccessException;
import java.io.IOException;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.tempuri.IRHINWebService;
import org.tempuri.RHINWebService;


import gov.hhs.fha.nhinc.properties.PropertyAccessor;
import java.util.Map;
import java.util.logging.Level;

public class HIENDocRetrieveClient {
	private static final Logger logger = Logger.getLogger(HIENDocRetrieveClient.class);
	private PropertyAccessor propertyAccessor = PropertyAccessor.getInstance();
	private static IRHINWebService rdPort;
	private static Resource rdWsdl = new DefaultResourceLoader()
			.getResource("classpath:wsdl/RHINWebService1.wsdl");
	private static HIENDocRetrieveClient client = null;
    private final static int CONNECTION_TIMEOUT = 60000;
    private final static String CENTRALIS_AUTHENTICATION_TOKEN = "9DB9082B-68F3-4A7B-8B11-1BA0649945DE";
	
	private HIENDocRetrieveClient() {
		try {
			init();
		} catch (IOException e) {
            java.util.logging.Logger.getLogger(HIENDocRetrieveClient.class.getName()).log(Level.SEVERE, null, e);
		} catch (PropertyAccessException ep) {
            java.util.logging.Logger.getLogger(HIENDocRetrieveClient.class.getName()).log(Level.SEVERE, null, ep);            
		}
	}
	
	public static HIENDocRetrieveClient getInstance() {
		if(null == client) {
			client = new HIENDocRetrieveClient();
		}
		return client;
	}
	
	public void init() throws IOException, PropertyAccessException {
		String urlString = propertyAccessor.getProperty(NhincConstants.GATEWAY_PROPERTY_FILE,"RHINWebServiceUrl");
		RHINWebService rdService = new RHINWebService(rdWsdl.getURL());
		rdPort = rdService.getPort(IRHINWebService.class);
		BindingProvider pdBindingProvider = (BindingProvider) rdPort;
		pdBindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, urlString);
        
		Map<String, Object> rdContext = pdBindingProvider.getRequestContext();
		rdContext.put("com.sun.xml.internal.ws.connect.timeout", CONNECTION_TIMEOUT);
		rdContext.put("com.sun.xml.internal.ws.request.timeout", CONNECTION_TIMEOUT);
	}
    
	public String sendData(String uniqueKey) {

		String response = null;
		try {
			// String sessionToken =
			// propertyAccessor.getProperty(NhincConstants.GATEWAY_PROPERTY_FILE,"sessionToken");
			response = rdPort.getCONNECTCCDADocument(CENTRALIS_AUTHENTICATION_TOKEN, uniqueKey);
		} catch (Exception e) {
			logger.error("error while calling RepositoryPatientCCDADocument service", e);
		}

		return response;
	}
}
