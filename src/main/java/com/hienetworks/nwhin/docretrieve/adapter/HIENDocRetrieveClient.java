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
import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotType1;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ValueListType;

/**
 * ITI-39 / Retrieve Document (RD)
 * <p>
 * This section corresponds to transaction ITI-39 of the IHE Technical Framework. 
 * Transaction 3325 ITI-39 is used by the Initiating Gateway and Responding Gateway Actors.
 * Similar to the ITI-43 / Retrieve Document Set
 * @see IHE.ITI.TF Rev14.0 3.39 Cross Gateway Retrieve [ITI-39]
 * 
 * @author auhl
 */
public class HIENDocRetrieveClient {
	private static final Logger logger = Logger.getLogger(HIENDocRetrieveClient.class);
	private PropertyAccessor propertyAccessor = PropertyAccessor.getInstance();
	private static IRHINWebService rdPort;
	private static Resource rdWsdl = new DefaultResourceLoader()
			.getResource("classpath:wsdl/RHINWebService1.wsdl");
	private static HIENDocRetrieveClient client = null;
    private final static int CONNECTION_TIMEOUT = 120000;
    private final static String CENTRALIS_AUTHENTICATION_TOKEN = "9DB9082B-68F3-4A7B-8B11-1BA0649945DE";
 
    /**
     *
     */
    public String AuthToken = "";
	
	private HIENDocRetrieveClient() throws MissingURLException {
		try {
			init();
		} catch (IOException e) {
            java.util.logging.Logger.getLogger(HIENDocRetrieveClient.class.getName()).log(Level.SEVERE, null, e);
		} catch (PropertyAccessException ep) {
            java.util.logging.Logger.getLogger(HIENDocRetrieveClient.class.getName()).log(Level.SEVERE, null, ep);            
		}
	}
	
    /**
     *
     * @return
     * @throws MissingURLException
     */
    public static HIENDocRetrieveClient getInstance() throws MissingURLException {
		if(null == client) {
			client = new HIENDocRetrieveClient();
		}
		return client;
	}
	
    /**
     *
     * @throws IOException
     * @throws PropertyAccessException
     * @throws MissingURLException
     */
    public void init() throws IOException, PropertyAccessException, MissingURLException {

        // Fetch RHINWebService URL from Gateway .properties file
        String urlString = propertyAccessor.getProperty(NhincConstants.GATEWAY_PROPERTY_FILE,"RHINWebServiceUrl");
        if (com.google.common.base.Strings.isNullOrEmpty(urlString))
        {
            throw new MissingURLException("Centralis RHIN Web Service URL Empty or Not Found");
        }
        
        // Try Fetching the Centralis RHINWebService application authentication
        AuthToken = propertyAccessor.getProperty(NhincConstants.GATEWAY_PROPERTY_FILE, "CentralisAuthenticationToken");   
        if (com.google.common.base.Strings.isNullOrEmpty(AuthToken))
        {
            AuthToken = CENTRALIS_AUTHENTICATION_TOKEN;
        }
        
		RHINWebService rdService = new RHINWebService(rdWsdl.getURL());
		rdPort = rdService.getPort(IRHINWebService.class);
		BindingProvider pdBindingProvider = (BindingProvider) rdPort;
		pdBindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, urlString);
        
		Map<String, Object> rdContext = pdBindingProvider.getRequestContext();
		rdContext.put("com.sun.xml.internal.ws.connect.timeout", CONNECTION_TIMEOUT);
		rdContext.put("com.sun.xml.internal.ws.request.timeout", CONNECTION_TIMEOUT);
	}
    
    /**
     *
     * @param uniqueKey
     * @return
     */
    public String sendData(String uniqueKey) {

		String response = null;
		try {
			response = rdPort.getCONNECTCCDADocument(AuthToken, uniqueKey);
		} catch (Exception e) {
			logger.error("error while calling RepositoryPatientCCDADocument service", e);
		}

		return response;
	}
    
    /**
     * Make sure that a missing URL is a bad thing
     */
    public class MissingURLException extends Exception {

        /**
         * Inherit from baseline Exception
         * @param message Whatever additional condition information
         */
        public MissingURLException(String message) {
            super(message);
        }
    }
}


