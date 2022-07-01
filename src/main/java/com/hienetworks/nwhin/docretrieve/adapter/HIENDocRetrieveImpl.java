package com.hienetworks.nwhin.docretrieve.adapter;

import java.util.List;

import javax.activation.DataHandler;
import javax.annotation.Resource;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;

import gov.hhs.fha.nhinc.common.nhinccommonadapter.RespondingGatewayCrossGatewayRetrieveRequestType;
import gov.hhs.fha.nhinc.docretrieve.MessageGenerator;
import gov.hhs.fha.nhinc.policyengine.adapter.pip.CDAConstants;
import ihe.iti.xds_b._2007.RetrieveDocumentSetRequestType;
import ihe.iti.xds_b._2007.RetrieveDocumentSetRequestType.DocumentRequest;
import ihe.iti.xds_b._2007.RetrieveDocumentSetResponseType;
import ihe.iti.xds_b._2007.RetrieveDocumentSetResponseType.DocumentResponse;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryResponseType;

/**
 * HIEN eHealth Exchange Initiating Gateway / CONNECT Document Retrieval Implementation
 * <p>
 *  Utilize ITI-39 Cross-Enterprise Document Sharing (XDS/XCA) Framework
 *  Attach a BASE64 UTF-8 Binary encoded CDA Document
 *  Utilize SwA (MTOM/XOP) to attach document to SOAP message
 *  In this case Document = A constant representing the identity/value of the SOAP 1.2 over HTTP binding.
 * @author auhl
 */
@BindingType(value = javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class HIENDocRetrieveImpl implements gov.hhs.fha.nhinc.adapterdocretrieve.AdapterDocRetrievePortType {
    
    // TODO: The below resource is not currently used - determine what's up with it's use/disuse.(?)
	@Resource
	private WebServiceContext context;

	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(HIENDocRetrieveImpl.class);

    /**
     * Retrieve/return a clinical document given the unique request ID and target (participant)
     * @param rgcgrt    Retrieval Document (RD) Request container
     * @return  Retrieve Document Response container
     */
    @Override
	public RetrieveDocumentSetResponseType respondingGatewayCrossGatewayRetrieve(
			RespondingGatewayCrossGatewayRetrieveRequestType rgcgrt) {
		RetrieveDocumentSetResponseType oResponse = null;
		try {

            // Add document list to the RD request 
			List<RetrieveDocumentSetRequestType.DocumentRequest> docList = rgcgrt.getRetrieveDocumentSetRequest()
					.getDocumentRequest();
			DocumentRequest request = docList.get(0);
			logger.info("HIEN DocRetrieve..............");

            // ****************************************************************
            // Setup RD Request
            // ****************************************************************            
            
            // Get target HCID
			String homeComunityId = request.getHomeCommunityId();
			System.out.println("hcid :" + homeComunityId);			
            // Get Unitque document identifier
            String docUniqueId = request.getDocumentUniqueId();
			logger.info("doc id :" + docUniqueId);                        
            // Get Target Unique ID
			String docRepositryUniqueId = request.getRepositoryUniqueId();            
			logger.info("DocRetrieve Webservice call.........");
            
            // Get RD Clent
			HIENDocRetrieveClient client = HIENDocRetrieveClient.getInstance();
            
            // ****************************************************************
            // Call Client / Send Request
            // ****************************************************************
            
			String clientResponse = client.sendData(docUniqueId);
            
			if (null != clientResponse && !clientResponse.isEmpty()) {
            
                // ****************************************************************
                // Setup response
                // ****************************************************************
                                            
				oResponse = new RetrieveDocumentSetResponseType();
				RegistryResponseType registryResponseType = new RegistryResponseType();

                // Set Response Status
				registryResponseType.setStatus(CDAConstants.XDS_RETRIEVE_RESPONSE_STATUS_SUCCESS);
				List<DocumentResponse> docResList = oResponse.getDocumentResponse();
				DocumentResponse docRes = new DocumentResponse();

                // Set response encapsulation type
				String mimeType = CDAConstants.PROVIDE_REGISTER_MIME_TYPE;
				DataHandler dh = new DataHandler(clientResponse, mimeType);

                // And Load above into the document response
                docRes.setDocument(dh);
				docRes.setHomeCommunityId(homeComunityId);
				docRes.setRepositoryUniqueId(docRepositryUniqueId);
				docRes.setMimeType(mimeType);
				docRes.setDocumentUniqueId(docUniqueId);
				docResList.add(docRes);
				oResponse.setRegistryResponse(registryResponseType);
			} else {
				logger.info("no content from HIEN DocRetrieve api");
				oResponse = MessageGenerator.getInstance().createRegistryResponseError("Internal Repository Error");
			}
		} catch (Exception ex) {
			logger.error(ex);
			ex.printStackTrace();
		}

		return oResponse;
	}
}