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

@BindingType(value = javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class HIENDocRetrieveImpl implements gov.hhs.fha.nhinc.adapterdocretrieve.AdapterDocRetrievePortType {

	@Resource
	private WebServiceContext context;

	private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(HIENDocRetrieveImpl.class);

	@Override
	public RetrieveDocumentSetResponseType respondingGatewayCrossGatewayRetrieve(
			RespondingGatewayCrossGatewayRetrieveRequestType rgcgrt) {
		RetrieveDocumentSetResponseType oResponse = null;
		try {

			List<RetrieveDocumentSetRequestType.DocumentRequest> docList = rgcgrt.getRetrieveDocumentSetRequest()
					.getDocumentRequest();
			DocumentRequest doc = docList.get(0);
			logger.info("HIEN DocRetrieve..............");

			String homeComunityId = doc.getHomeCommunityId();
			System.out.println("hcid :" + homeComunityId);
			String docUniqueId = doc.getDocumentUniqueId();
			logger.info("doc id :" + docUniqueId);
			String docRepositryUniqueId = doc.getRepositoryUniqueId();
			logger.info("DocRetrieve Webservice call.........");
			HIENDocRetrieveClient client = HIENDocRetrieveClient.getInstance();
			String clientResponse = client.sendData(docUniqueId);
			if (clientResponse != null && !clientResponse.isEmpty()) {

				oResponse = new RetrieveDocumentSetResponseType();
				RegistryResponseType registryResponseType = new RegistryResponseType();
				registryResponseType.setStatus(CDAConstants.XDS_RETRIEVE_RESPONSE_STATUS_SUCCESS);
				List<DocumentResponse> docResList = oResponse.getDocumentResponse();
				DocumentResponse docRes = new DocumentResponse();
				String mimeType = CDAConstants.PROVIDE_REGISTER_MIME_TYPE;
				DataHandler dh = new DataHandler(clientResponse, mimeType);
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