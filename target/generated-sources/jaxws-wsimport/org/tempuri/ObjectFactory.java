
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.hielibrary.FilesEntity;
import org.datacontract.schemas._2004._07.hielibrary.GenericEntity;
import org.datacontract.schemas._2004._07.hielibrary.PatientRMPIEntity;
import org.datacontract.schemas._2004._07.hielibrary.RHINFilesEntity;
import org.datacontract.schemas._2004._07.hielibrary.RHINRepositoryEntity;
import org.datacontract.schemas._2004._07.hielibrary.RHINUserEntity;
import org.datacontract.schemas._2004._07.hielibrary.UserDesktopActionsEntity;
import org.datacontract.schemas._2004._07.hielibrary_entities.ArrayOfClinicalDocumentEntity;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _DesktopUpdateUploadFileStatusResponseDesktopUpdateUploadFileStatusResult_QNAME = new QName("http://tempuri.org/", "DesktopUpdateUploadFileStatusResult");
    private final static QName _GetCONNECTCCDADocumentResponseGetCONNECTCCDADocumentResult_QNAME = new QName("http://tempuri.org/", "GetCONNECTCCDADocumentResult");
    private final static QName _GatewayDownloadRHINFileSessionToken_QNAME = new QName("http://tempuri.org/", "SessionToken");
    private final static QName _AuthenticateGatewayRepositoryResponseAuthenticateGatewayRepositoryResult_QNAME = new QName("http://tempuri.org/", "AuthenticateGatewayRepositoryResult");
    private final static QName _DesktopDeleteUserActionResponseDesktopDeleteUserActionResult_QNAME = new QName("http://tempuri.org/", "DesktopDeleteUserActionResult");
    private final static QName _UpdateTrackingReferralStatusResponseUpdateTrackingReferralStatusResult_QNAME = new QName("http://tempuri.org/", "UpdateTrackingReferralStatusResult");
    private final static QName _GatewayUploadHL7MessageResponseGatewayUploadHL7MessageResult_QNAME = new QName("http://tempuri.org/", "GatewayUploadHL7MessageResult");
    private final static QName _DesktopGetUserActionsDesktopHeartbeatDateTime_QNAME = new QName("http://tempuri.org/", "DesktopHeartbeatDateTime");
    private final static QName _AuthenticateUserUserCradentials_QNAME = new QName("http://tempuri.org/", "UserCradentials");
    private final static QName _GatewayUploadFileUpdateStatusResponseGatewayUploadFileUpdateStatusResult_QNAME = new QName("http://tempuri.org/", "GatewayUploadFileUpdateStatusResult");
    private final static QName _GatewayUploadFileResponseGatewayUploadFileResult_QNAME = new QName("http://tempuri.org/", "GatewayUploadFileResult");
    private final static QName _GatewayUploadFileUpdateStatusDetails_QNAME = new QName("http://tempuri.org/", "Details");
    private final static QName _GatewayUploadFileUpdateStatusJobID_QNAME = new QName("http://tempuri.org/", "JobID");
    private final static QName _GetCONNECTPatientResponseGetCONNECTPatientResult_QNAME = new QName("http://tempuri.org/", "GetCONNECTPatientResult");
    private final static QName _GatewayGetResponseGatewayGetResult_QNAME = new QName("http://tempuri.org/", "GatewayGetResult");
    private final static QName _GetCONNECTPatientCallingOID_QNAME = new QName("http://tempuri.org/", "CallingOID");
    private final static QName _GetCONNECTPatientFirstName_QNAME = new QName("http://tempuri.org/", "FirstName");
    private final static QName _GetCONNECTPatientDOB_QNAME = new QName("http://tempuri.org/", "DOB");
    private final static QName _GetCONNECTPatientState_QNAME = new QName("http://tempuri.org/", "State");
    private final static QName _GetCONNECTPatientAddress_QNAME = new QName("http://tempuri.org/", "Address");
    private final static QName _GetCONNECTPatientLastName_QNAME = new QName("http://tempuri.org/", "LastName");
    private final static QName _GetCONNECTPatientGender_QNAME = new QName("http://tempuri.org/", "Gender");
    private final static QName _GetCONNECTPatientCity_QNAME = new QName("http://tempuri.org/", "City");
    private final static QName _GetCONNECTPatientPostalCode_QNAME = new QName("http://tempuri.org/", "PostalCode");
    private final static QName _GetCONNECTPatientRepositoryOID_QNAME = new QName("http://tempuri.org/", "RepositoryOID");
    private final static QName _GetCONNECTPatientSSN_QNAME = new QName("http://tempuri.org/", "SSN");
    private final static QName _PingGatewayResponsePingGatewayResult_QNAME = new QName("http://tempuri.org/", "PingGatewayResult");
    private final static QName _LogoutUserResponseLogoutUserResult_QNAME = new QName("http://tempuri.org/", "LogoutUserResult");
    private final static QName _AuthenticateUserResponseAuthenticateUserResult_QNAME = new QName("http://tempuri.org/", "AuthenticateUserResult");
    private final static QName _AddOrganizationReferralStatusResponseAddOrganizationReferralStatusResult_QNAME = new QName("http://tempuri.org/", "AddOrganizationReferralStatusResult");
    private final static QName _LogMessageServicePrefix_QNAME = new QName("http://tempuri.org/", "ServicePrefix");
    private final static QName _LogMessageServiceName_QNAME = new QName("http://tempuri.org/", "ServiceName");
    private final static QName _LogMessageMessage_QNAME = new QName("http://tempuri.org/", "Message");
    private final static QName _GatewayDowloadListResponseGatewayDowloadListResult_QNAME = new QName("http://tempuri.org/", "GatewayDowloadListResult");
    private final static QName _GatewayDownloadRHINFileResponseGatewayDownloadRHINFileResult_QNAME = new QName("http://tempuri.org/", "GatewayDownloadRHINFileResult");
    private final static QName _DesktopGetUserActionsResponseDesktopGetUserActionsResult_QNAME = new QName("http://tempuri.org/", "DesktopGetUserActionsResult");
    private final static QName _DeleteReferralOrganizationStatusResponseDeleteReferralOrganizationStatusResult_QNAME = new QName("http://tempuri.org/", "DeleteReferralOrganizationStatusResult");
    private final static QName _GetCONNECTClinicalDocumentListPrimaryRMPINumber_QNAME = new QName("http://tempuri.org/", "PrimaryRMPINumber");
    private final static QName _GetCONNECTClinicalDocumentListStartDate_QNAME = new QName("http://tempuri.org/", "StartDate");
    private final static QName _GetCONNECTClinicalDocumentListEndDate_QNAME = new QName("http://tempuri.org/", "EndDate");
    private final static QName _AuthenticateGatewayRepositoryApplicationName_QNAME = new QName("http://tempuri.org/", "ApplicationName");
    private final static QName _AuthenticateGatewayRepositoryApplicationVersion_QNAME = new QName("http://tempuri.org/", "ApplicationVersion");
    private final static QName _AuthenticateGatewayRepositoryRepositoryShortName_QNAME = new QName("http://tempuri.org/", "RepositoryShortName");
    private final static QName _AuthenticateGatewayRepositoryRepositoryKey_QNAME = new QName("http://tempuri.org/", "RepositoryKey");
    private final static QName _GatewayUploadFileGetStatusResponseGatewayUploadFileGetStatusResult_QNAME = new QName("http://tempuri.org/", "GatewayUploadFileGetStatusResult");
    private final static QName _GatewaySaveClientGatewayDownloadFolder_QNAME = new QName("http://tempuri.org/", "GatewayDownloadFolder");
    private final static QName _GatewaySaveClientGatewayUploadFolder_QNAME = new QName("http://tempuri.org/", "GatewayUploadFolder");
    private final static QName _GatewaySaveClientGatewayHL7UploadFolder_QNAME = new QName("http://tempuri.org/", "GatewayHL7UploadFolder");
    private final static QName _GatewaySaveClientResponseGatewaySaveClientResult_QNAME = new QName("http://tempuri.org/", "GatewaySaveClientResult");
    private final static QName _DesktopSaveUserSettingsDesktopDownloadFolder_QNAME = new QName("http://tempuri.org/", "DesktopDownloadFolder");
    private final static QName _DesktopSaveUserSettingsSignatureFileData_QNAME = new QName("http://tempuri.org/", "signatureFileData");
    private final static QName _GetCONNECTCCDADocumentUniqueID_QNAME = new QName("http://tempuri.org/", "UniqueID");
    private final static QName _GatewayUploadFileFileNamme_QNAME = new QName("http://tempuri.org/", "FileNamme");
    private final static QName _GatewayUploadFileUploadFolder_QNAME = new QName("http://tempuri.org/", "UploadFolder");
    private final static QName _GatewayUploadFileFileData_QNAME = new QName("http://tempuri.org/", "FileData");
    private final static QName _DesktopUploadFileResponseDesktopUploadFileResult_QNAME = new QName("http://tempuri.org/", "DesktopUploadFileResult");
    private final static QName _DesktopDownloadRHINFileResponseDesktopDownloadRHINFileResult_QNAME = new QName("http://tempuri.org/", "DesktopDownloadRHINFileResult");
    private final static QName _DesktopSaveUserSettingsResponseDesktopSaveUserSettingsResult_QNAME = new QName("http://tempuri.org/", "DesktopSaveUserSettingsResult");
    private final static QName _GetCONNECTClinicalDocumentListResponseGetCONNECTClinicalDocumentListResult_QNAME = new QName("http://tempuri.org/", "GetCONNECTClinicalDocumentListResult");
    private final static QName _GatewayDownloadUpdateRHINFileStatusResponseGatewayDownloadUpdateRHINFileStatusResult_QNAME = new QName("http://tempuri.org/", "GatewayDownloadUpdateRHINFileStatusResult");
    private final static QName _GetUserResponseGetUserResult_QNAME = new QName("http://tempuri.org/", "GetUserResult");
    private final static QName _LogMessageResponseLogMessageResult_QNAME = new QName("http://tempuri.org/", "LogMessageResult");
    private final static QName _DesktopUploadFileFileName_QNAME = new QName("http://tempuri.org/", "FileName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GatewayUploadFileGetStatus }
     * 
     */
    public GatewayUploadFileGetStatus createGatewayUploadFileGetStatus() {
        return new GatewayUploadFileGetStatus();
    }

    /**
     * Create an instance of {@link DeleteReferralOrganizationStatusResponse }
     * 
     */
    public DeleteReferralOrganizationStatusResponse createDeleteReferralOrganizationStatusResponse() {
        return new DeleteReferralOrganizationStatusResponse();
    }

    /**
     * Create an instance of {@link GatewayUploadFileResponse }
     * 
     */
    public GatewayUploadFileResponse createGatewayUploadFileResponse() {
        return new GatewayUploadFileResponse();
    }

    /**
     * Create an instance of {@link GatewayDownloadRHINFileResponse }
     * 
     */
    public GatewayDownloadRHINFileResponse createGatewayDownloadRHINFileResponse() {
        return new GatewayDownloadRHINFileResponse();
    }

    /**
     * Create an instance of {@link DesktopUploadFile }
     * 
     */
    public DesktopUploadFile createDesktopUploadFile() {
        return new DesktopUploadFile();
    }

    /**
     * Create an instance of {@link DesktopGetUserActions }
     * 
     */
    public DesktopGetUserActions createDesktopGetUserActions() {
        return new DesktopGetUserActions();
    }

    /**
     * Create an instance of {@link GatewayUploadFile }
     * 
     */
    public GatewayUploadFile createGatewayUploadFile() {
        return new GatewayUploadFile();
    }

    /**
     * Create an instance of {@link LogoutUser }
     * 
     */
    public LogoutUser createLogoutUser() {
        return new LogoutUser();
    }

    /**
     * Create an instance of {@link DesktopDownloadRHINFileResponse }
     * 
     */
    public DesktopDownloadRHINFileResponse createDesktopDownloadRHINFileResponse() {
        return new DesktopDownloadRHINFileResponse();
    }

    /**
     * Create an instance of {@link GatewayUploadHL7Message }
     * 
     */
    public GatewayUploadHL7Message createGatewayUploadHL7Message() {
        return new GatewayUploadHL7Message();
    }

    /**
     * Create an instance of {@link GetCONNECTPatient }
     * 
     */
    public GetCONNECTPatient createGetCONNECTPatient() {
        return new GetCONNECTPatient();
    }

    /**
     * Create an instance of {@link GatewayUploadFileGetStatusResponse }
     * 
     */
    public GatewayUploadFileGetStatusResponse createGatewayUploadFileGetStatusResponse() {
        return new GatewayUploadFileGetStatusResponse();
    }

    /**
     * Create an instance of {@link PingGatewayResponse }
     * 
     */
    public PingGatewayResponse createPingGatewayResponse() {
        return new PingGatewayResponse();
    }

    /**
     * Create an instance of {@link UpdateTrackingReferralStatusResponse }
     * 
     */
    public UpdateTrackingReferralStatusResponse createUpdateTrackingReferralStatusResponse() {
        return new UpdateTrackingReferralStatusResponse();
    }

    /**
     * Create an instance of {@link GatewaySaveClient }
     * 
     */
    public GatewaySaveClient createGatewaySaveClient() {
        return new GatewaySaveClient();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link DesktopUpdateUploadFileStatusResponse }
     * 
     */
    public DesktopUpdateUploadFileStatusResponse createDesktopUpdateUploadFileStatusResponse() {
        return new DesktopUpdateUploadFileStatusResponse();
    }

    /**
     * Create an instance of {@link GatewayUploadHL7MessageResponse }
     * 
     */
    public GatewayUploadHL7MessageResponse createGatewayUploadHL7MessageResponse() {
        return new GatewayUploadHL7MessageResponse();
    }

    /**
     * Create an instance of {@link DesktopUploadFileResponse }
     * 
     */
    public DesktopUploadFileResponse createDesktopUploadFileResponse() {
        return new DesktopUploadFileResponse();
    }

    /**
     * Create an instance of {@link GetCONNECTClinicalDocumentList }
     * 
     */
    public GetCONNECTClinicalDocumentList createGetCONNECTClinicalDocumentList() {
        return new GetCONNECTClinicalDocumentList();
    }

    /**
     * Create an instance of {@link GatewayDownloadUpdateRHINFileStatus }
     * 
     */
    public GatewayDownloadUpdateRHINFileStatus createGatewayDownloadUpdateRHINFileStatus() {
        return new GatewayDownloadUpdateRHINFileStatus();
    }

    /**
     * Create an instance of {@link LogMessageResponse }
     * 
     */
    public LogMessageResponse createLogMessageResponse() {
        return new LogMessageResponse();
    }

    /**
     * Create an instance of {@link DesktopGetUserActionsResponse }
     * 
     */
    public DesktopGetUserActionsResponse createDesktopGetUserActionsResponse() {
        return new DesktopGetUserActionsResponse();
    }

    /**
     * Create an instance of {@link DesktopSaveUserSettings }
     * 
     */
    public DesktopSaveUserSettings createDesktopSaveUserSettings() {
        return new DesktopSaveUserSettings();
    }

    /**
     * Create an instance of {@link LogoutUserResponse }
     * 
     */
    public LogoutUserResponse createLogoutUserResponse() {
        return new LogoutUserResponse();
    }

    /**
     * Create an instance of {@link AddOrganizationReferralStatusResponse }
     * 
     */
    public AddOrganizationReferralStatusResponse createAddOrganizationReferralStatusResponse() {
        return new AddOrganizationReferralStatusResponse();
    }

    /**
     * Create an instance of {@link AddOrganizationReferralStatus }
     * 
     */
    public AddOrganizationReferralStatus createAddOrganizationReferralStatus() {
        return new AddOrganizationReferralStatus();
    }

    /**
     * Create an instance of {@link GatewayDowloadList }
     * 
     */
    public GatewayDowloadList createGatewayDowloadList() {
        return new GatewayDowloadList();
    }

    /**
     * Create an instance of {@link GatewayDownloadUpdateRHINFileStatusResponse }
     * 
     */
    public GatewayDownloadUpdateRHINFileStatusResponse createGatewayDownloadUpdateRHINFileStatusResponse() {
        return new GatewayDownloadUpdateRHINFileStatusResponse();
    }

    /**
     * Create an instance of {@link AuthenticateGatewayRepositoryResponse }
     * 
     */
    public AuthenticateGatewayRepositoryResponse createAuthenticateGatewayRepositoryResponse() {
        return new AuthenticateGatewayRepositoryResponse();
    }

    /**
     * Create an instance of {@link GetCONNECTCCDADocumentResponse }
     * 
     */
    public GetCONNECTCCDADocumentResponse createGetCONNECTCCDADocumentResponse() {
        return new GetCONNECTCCDADocumentResponse();
    }

    /**
     * Create an instance of {@link DeleteReferralOrganizationStatus }
     * 
     */
    public DeleteReferralOrganizationStatus createDeleteReferralOrganizationStatus() {
        return new DeleteReferralOrganizationStatus();
    }

    /**
     * Create an instance of {@link GetCONNECTPatientResponse }
     * 
     */
    public GetCONNECTPatientResponse createGetCONNECTPatientResponse() {
        return new GetCONNECTPatientResponse();
    }

    /**
     * Create an instance of {@link GatewayUploadFileUpdateStatus }
     * 
     */
    public GatewayUploadFileUpdateStatus createGatewayUploadFileUpdateStatus() {
        return new GatewayUploadFileUpdateStatus();
    }

    /**
     * Create an instance of {@link GetCONNECTCCDADocument }
     * 
     */
    public GetCONNECTCCDADocument createGetCONNECTCCDADocument() {
        return new GetCONNECTCCDADocument();
    }

    /**
     * Create an instance of {@link PingGateway }
     * 
     */
    public PingGateway createPingGateway() {
        return new PingGateway();
    }

    /**
     * Create an instance of {@link AuthenticateUser }
     * 
     */
    public AuthenticateUser createAuthenticateUser() {
        return new AuthenticateUser();
    }

    /**
     * Create an instance of {@link GatewayGet }
     * 
     */
    public GatewayGet createGatewayGet() {
        return new GatewayGet();
    }

    /**
     * Create an instance of {@link DesktopDeleteUserActionResponse }
     * 
     */
    public DesktopDeleteUserActionResponse createDesktopDeleteUserActionResponse() {
        return new DesktopDeleteUserActionResponse();
    }

    /**
     * Create an instance of {@link AuthenticateUserResponse }
     * 
     */
    public AuthenticateUserResponse createAuthenticateUserResponse() {
        return new AuthenticateUserResponse();
    }

    /**
     * Create an instance of {@link GatewayGetResponse }
     * 
     */
    public GatewayGetResponse createGatewayGetResponse() {
        return new GatewayGetResponse();
    }

    /**
     * Create an instance of {@link DesktopSaveUserSettingsResponse }
     * 
     */
    public DesktopSaveUserSettingsResponse createDesktopSaveUserSettingsResponse() {
        return new DesktopSaveUserSettingsResponse();
    }

    /**
     * Create an instance of {@link GatewaySaveClientResponse }
     * 
     */
    public GatewaySaveClientResponse createGatewaySaveClientResponse() {
        return new GatewaySaveClientResponse();
    }

    /**
     * Create an instance of {@link DesktopDeleteUserAction }
     * 
     */
    public DesktopDeleteUserAction createDesktopDeleteUserAction() {
        return new DesktopDeleteUserAction();
    }

    /**
     * Create an instance of {@link GatewayDownloadRHINFile }
     * 
     */
    public GatewayDownloadRHINFile createGatewayDownloadRHINFile() {
        return new GatewayDownloadRHINFile();
    }

    /**
     * Create an instance of {@link GatewayUploadFileUpdateStatusResponse }
     * 
     */
    public GatewayUploadFileUpdateStatusResponse createGatewayUploadFileUpdateStatusResponse() {
        return new GatewayUploadFileUpdateStatusResponse();
    }

    /**
     * Create an instance of {@link AuthenticateGatewayRepository }
     * 
     */
    public AuthenticateGatewayRepository createAuthenticateGatewayRepository() {
        return new AuthenticateGatewayRepository();
    }

    /**
     * Create an instance of {@link GetCONNECTClinicalDocumentListResponse }
     * 
     */
    public GetCONNECTClinicalDocumentListResponse createGetCONNECTClinicalDocumentListResponse() {
        return new GetCONNECTClinicalDocumentListResponse();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link LogMessage }
     * 
     */
    public LogMessage createLogMessage() {
        return new LogMessage();
    }

    /**
     * Create an instance of {@link DesktopUpdateUploadFileStatus }
     * 
     */
    public DesktopUpdateUploadFileStatus createDesktopUpdateUploadFileStatus() {
        return new DesktopUpdateUploadFileStatus();
    }

    /**
     * Create an instance of {@link UpdateTrackingReferralStatus }
     * 
     */
    public UpdateTrackingReferralStatus createUpdateTrackingReferralStatus() {
        return new UpdateTrackingReferralStatus();
    }

    /**
     * Create an instance of {@link DesktopDownloadRHINFile }
     * 
     */
    public DesktopDownloadRHINFile createDesktopDownloadRHINFile() {
        return new DesktopDownloadRHINFile();
    }

    /**
     * Create an instance of {@link GatewayDowloadListResponse }
     * 
     */
    public GatewayDowloadListResponse createGatewayDowloadListResponse() {
        return new GatewayDowloadListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DesktopUpdateUploadFileStatusResult", scope = DesktopUpdateUploadFileStatusResponse.class)
    public JAXBElement<String> createDesktopUpdateUploadFileStatusResponseDesktopUpdateUploadFileStatusResult(String value) {
        return new JAXBElement<String>(_DesktopUpdateUploadFileStatusResponseDesktopUpdateUploadFileStatusResult_QNAME, String.class, DesktopUpdateUploadFileStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCONNECTCCDADocumentResult", scope = GetCONNECTCCDADocumentResponse.class)
    public JAXBElement<String> createGetCONNECTCCDADocumentResponseGetCONNECTCCDADocumentResult(String value) {
        return new JAXBElement<String>(_GetCONNECTCCDADocumentResponseGetCONNECTCCDADocumentResult_QNAME, String.class, GetCONNECTCCDADocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GatewayDownloadRHINFile.class)
    public JAXBElement<String> createGatewayDownloadRHINFileSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GatewayDownloadRHINFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINRepositoryEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AuthenticateGatewayRepositoryResult", scope = AuthenticateGatewayRepositoryResponse.class)
    public JAXBElement<RHINRepositoryEntity> createAuthenticateGatewayRepositoryResponseAuthenticateGatewayRepositoryResult(RHINRepositoryEntity value) {
        return new JAXBElement<RHINRepositoryEntity>(_AuthenticateGatewayRepositoryResponseAuthenticateGatewayRepositoryResult_QNAME, RHINRepositoryEntity.class, AuthenticateGatewayRepositoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DesktopDeleteUserActionResult", scope = DesktopDeleteUserActionResponse.class)
    public JAXBElement<String> createDesktopDeleteUserActionResponseDesktopDeleteUserActionResult(String value) {
        return new JAXBElement<String>(_DesktopDeleteUserActionResponseDesktopDeleteUserActionResult_QNAME, String.class, DesktopDeleteUserActionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateTrackingReferralStatusResult", scope = UpdateTrackingReferralStatusResponse.class)
    public JAXBElement<String> createUpdateTrackingReferralStatusResponseUpdateTrackingReferralStatusResult(String value) {
        return new JAXBElement<String>(_UpdateTrackingReferralStatusResponseUpdateTrackingReferralStatusResult_QNAME, String.class, UpdateTrackingReferralStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GatewayUploadHL7MessageResult", scope = GatewayUploadHL7MessageResponse.class)
    public JAXBElement<String> createGatewayUploadHL7MessageResponseGatewayUploadHL7MessageResult(String value) {
        return new JAXBElement<String>(_GatewayUploadHL7MessageResponseGatewayUploadHL7MessageResult_QNAME, String.class, GatewayUploadHL7MessageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = DesktopDeleteUserAction.class)
    public JAXBElement<String> createDesktopDeleteUserActionSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, DesktopDeleteUserAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = DesktopGetUserActions.class)
    public JAXBElement<String> createDesktopGetUserActionsSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, DesktopGetUserActions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DesktopHeartbeatDateTime", scope = DesktopGetUserActions.class)
    public JAXBElement<XMLGregorianCalendar> createDesktopGetUserActionsDesktopHeartbeatDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DesktopGetUserActionsDesktopHeartbeatDateTime_QNAME, XMLGregorianCalendar.class, DesktopGetUserActions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserCradentials", scope = AuthenticateUser.class)
    public JAXBElement<String> createAuthenticateUserUserCradentials(String value) {
        return new JAXBElement<String>(_AuthenticateUserUserCradentials_QNAME, String.class, AuthenticateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GatewayUploadFileUpdateStatusResult", scope = GatewayUploadFileUpdateStatusResponse.class)
    public JAXBElement<String> createGatewayUploadFileUpdateStatusResponseGatewayUploadFileUpdateStatusResult(String value) {
        return new JAXBElement<String>(_GatewayUploadFileUpdateStatusResponseGatewayUploadFileUpdateStatusResult_QNAME, String.class, GatewayUploadFileUpdateStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GatewayUploadFileResult", scope = GatewayUploadFileResponse.class)
    public JAXBElement<String> createGatewayUploadFileResponseGatewayUploadFileResult(String value) {
        return new JAXBElement<String>(_GatewayUploadFileResponseGatewayUploadFileResult_QNAME, String.class, GatewayUploadFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GatewayUploadFileGetStatus.class)
    public JAXBElement<String> createGatewayUploadFileGetStatusSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GatewayUploadFileGetStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Details", scope = GatewayUploadFileUpdateStatus.class)
    public JAXBElement<String> createGatewayUploadFileUpdateStatusDetails(String value) {
        return new JAXBElement<String>(_GatewayUploadFileUpdateStatusDetails_QNAME, String.class, GatewayUploadFileUpdateStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GatewayUploadFileUpdateStatus.class)
    public JAXBElement<String> createGatewayUploadFileUpdateStatusSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GatewayUploadFileUpdateStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "JobID", scope = GatewayUploadFileUpdateStatus.class)
    public JAXBElement<String> createGatewayUploadFileUpdateStatusJobID(String value) {
        return new JAXBElement<String>(_GatewayUploadFileUpdateStatusJobID_QNAME, String.class, GatewayUploadFileUpdateStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatientRMPIEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCONNECTPatientResult", scope = GetCONNECTPatientResponse.class)
    public JAXBElement<PatientRMPIEntity> createGetCONNECTPatientResponseGetCONNECTPatientResult(PatientRMPIEntity value) {
        return new JAXBElement<PatientRMPIEntity>(_GetCONNECTPatientResponseGetCONNECTPatientResult_QNAME, PatientRMPIEntity.class, GetCONNECTPatientResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINRepositoryEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GatewayGetResult", scope = GatewayGetResponse.class)
    public JAXBElement<RHINRepositoryEntity> createGatewayGetResponseGatewayGetResult(RHINRepositoryEntity value) {
        return new JAXBElement<RHINRepositoryEntity>(_GatewayGetResponseGatewayGetResult_QNAME, RHINRepositoryEntity.class, GatewayGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CallingOID", scope = GetCONNECTPatient.class)
    public JAXBElement<String> createGetCONNECTPatientCallingOID(String value) {
        return new JAXBElement<String>(_GetCONNECTPatientCallingOID_QNAME, String.class, GetCONNECTPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FirstName", scope = GetCONNECTPatient.class)
    public JAXBElement<String> createGetCONNECTPatientFirstName(String value) {
        return new JAXBElement<String>(_GetCONNECTPatientFirstName_QNAME, String.class, GetCONNECTPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DOB", scope = GetCONNECTPatient.class)
    public JAXBElement<XMLGregorianCalendar> createGetCONNECTPatientDOB(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetCONNECTPatientDOB_QNAME, XMLGregorianCalendar.class, GetCONNECTPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "State", scope = GetCONNECTPatient.class)
    public JAXBElement<String> createGetCONNECTPatientState(String value) {
        return new JAXBElement<String>(_GetCONNECTPatientState_QNAME, String.class, GetCONNECTPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GetCONNECTPatient.class)
    public JAXBElement<String> createGetCONNECTPatientSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GetCONNECTPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Address", scope = GetCONNECTPatient.class)
    public JAXBElement<String> createGetCONNECTPatientAddress(String value) {
        return new JAXBElement<String>(_GetCONNECTPatientAddress_QNAME, String.class, GetCONNECTPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LastName", scope = GetCONNECTPatient.class)
    public JAXBElement<String> createGetCONNECTPatientLastName(String value) {
        return new JAXBElement<String>(_GetCONNECTPatientLastName_QNAME, String.class, GetCONNECTPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Gender", scope = GetCONNECTPatient.class)
    public JAXBElement<String> createGetCONNECTPatientGender(String value) {
        return new JAXBElement<String>(_GetCONNECTPatientGender_QNAME, String.class, GetCONNECTPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "City", scope = GetCONNECTPatient.class)
    public JAXBElement<String> createGetCONNECTPatientCity(String value) {
        return new JAXBElement<String>(_GetCONNECTPatientCity_QNAME, String.class, GetCONNECTPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PostalCode", scope = GetCONNECTPatient.class)
    public JAXBElement<String> createGetCONNECTPatientPostalCode(String value) {
        return new JAXBElement<String>(_GetCONNECTPatientPostalCode_QNAME, String.class, GetCONNECTPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RepositoryOID", scope = GetCONNECTPatient.class)
    public JAXBElement<String> createGetCONNECTPatientRepositoryOID(String value) {
        return new JAXBElement<String>(_GetCONNECTPatientRepositoryOID_QNAME, String.class, GetCONNECTPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SSN", scope = GetCONNECTPatient.class)
    public JAXBElement<String> createGetCONNECTPatientSSN(String value) {
        return new JAXBElement<String>(_GetCONNECTPatientSSN_QNAME, String.class, GetCONNECTPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GatewayGet.class)
    public JAXBElement<String> createGatewayGetSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GatewayGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PingGatewayResult", scope = PingGatewayResponse.class)
    public JAXBElement<String> createPingGatewayResponsePingGatewayResult(String value) {
        return new JAXBElement<String>(_PingGatewayResponsePingGatewayResult_QNAME, String.class, PingGatewayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LogoutUserResult", scope = LogoutUserResponse.class)
    public JAXBElement<String> createLogoutUserResponseLogoutUserResult(String value) {
        return new JAXBElement<String>(_LogoutUserResponseLogoutUserResult_QNAME, String.class, LogoutUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINUserEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AuthenticateUserResult", scope = AuthenticateUserResponse.class)
    public JAXBElement<RHINUserEntity> createAuthenticateUserResponseAuthenticateUserResult(RHINUserEntity value) {
        return new JAXBElement<RHINUserEntity>(_AuthenticateUserResponseAuthenticateUserResult_QNAME, RHINUserEntity.class, AuthenticateUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddOrganizationReferralStatusResult", scope = AddOrganizationReferralStatusResponse.class)
    public JAXBElement<String> createAddOrganizationReferralStatusResponseAddOrganizationReferralStatusResult(String value) {
        return new JAXBElement<String>(_AddOrganizationReferralStatusResponseAddOrganizationReferralStatusResult_QNAME, String.class, AddOrganizationReferralStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = UpdateTrackingReferralStatus.class)
    public JAXBElement<String> createUpdateTrackingReferralStatusSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, UpdateTrackingReferralStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServicePrefix", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageServicePrefix(String value) {
        return new JAXBElement<String>(_LogMessageServicePrefix_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceName", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageServiceName(String value) {
        return new JAXBElement<String>(_LogMessageServiceName_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Message", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageMessage(String value) {
        return new JAXBElement<String>(_LogMessageMessage_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GetUser.class)
    public JAXBElement<String> createGetUserSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GetUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GatewayDowloadListResult", scope = GatewayDowloadListResponse.class)
    public JAXBElement<GenericEntity> createGatewayDowloadListResponseGatewayDowloadListResult(GenericEntity value) {
        return new JAXBElement<GenericEntity>(_GatewayDowloadListResponseGatewayDowloadListResult_QNAME, GenericEntity.class, GatewayDowloadListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = DesktopDownloadRHINFile.class)
    public JAXBElement<String> createDesktopDownloadRHINFileSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, DesktopDownloadRHINFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINFilesEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GatewayDownloadRHINFileResult", scope = GatewayDownloadRHINFileResponse.class)
    public JAXBElement<RHINFilesEntity> createGatewayDownloadRHINFileResponseGatewayDownloadRHINFileResult(RHINFilesEntity value) {
        return new JAXBElement<RHINFilesEntity>(_GatewayDownloadRHINFileResponseGatewayDownloadRHINFileResult_QNAME, RHINFilesEntity.class, GatewayDownloadRHINFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDesktopActionsEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DesktopGetUserActionsResult", scope = DesktopGetUserActionsResponse.class)
    public JAXBElement<UserDesktopActionsEntity> createDesktopGetUserActionsResponseDesktopGetUserActionsResult(UserDesktopActionsEntity value) {
        return new JAXBElement<UserDesktopActionsEntity>(_DesktopGetUserActionsResponseDesktopGetUserActionsResult_QNAME, UserDesktopActionsEntity.class, DesktopGetUserActionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeleteReferralOrganizationStatusResult", scope = DeleteReferralOrganizationStatusResponse.class)
    public JAXBElement<String> createDeleteReferralOrganizationStatusResponseDeleteReferralOrganizationStatusResult(String value) {
        return new JAXBElement<String>(_DeleteReferralOrganizationStatusResponseDeleteReferralOrganizationStatusResult_QNAME, String.class, DeleteReferralOrganizationStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PrimaryRMPINumber", scope = GetCONNECTClinicalDocumentList.class)
    public JAXBElement<String> createGetCONNECTClinicalDocumentListPrimaryRMPINumber(String value) {
        return new JAXBElement<String>(_GetCONNECTClinicalDocumentListPrimaryRMPINumber_QNAME, String.class, GetCONNECTClinicalDocumentList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartDate", scope = GetCONNECTClinicalDocumentList.class)
    public JAXBElement<XMLGregorianCalendar> createGetCONNECTClinicalDocumentListStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetCONNECTClinicalDocumentListStartDate_QNAME, XMLGregorianCalendar.class, GetCONNECTClinicalDocumentList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CallingOID", scope = GetCONNECTClinicalDocumentList.class)
    public JAXBElement<String> createGetCONNECTClinicalDocumentListCallingOID(String value) {
        return new JAXBElement<String>(_GetCONNECTPatientCallingOID_QNAME, String.class, GetCONNECTClinicalDocumentList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GetCONNECTClinicalDocumentList.class)
    public JAXBElement<String> createGetCONNECTClinicalDocumentListSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GetCONNECTClinicalDocumentList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EndDate", scope = GetCONNECTClinicalDocumentList.class)
    public JAXBElement<XMLGregorianCalendar> createGetCONNECTClinicalDocumentListEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetCONNECTClinicalDocumentListEndDate_QNAME, XMLGregorianCalendar.class, GetCONNECTClinicalDocumentList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ApplicationName", scope = AuthenticateGatewayRepository.class)
    public JAXBElement<String> createAuthenticateGatewayRepositoryApplicationName(String value) {
        return new JAXBElement<String>(_AuthenticateGatewayRepositoryApplicationName_QNAME, String.class, AuthenticateGatewayRepository.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ApplicationVersion", scope = AuthenticateGatewayRepository.class)
    public JAXBElement<String> createAuthenticateGatewayRepositoryApplicationVersion(String value) {
        return new JAXBElement<String>(_AuthenticateGatewayRepositoryApplicationVersion_QNAME, String.class, AuthenticateGatewayRepository.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RepositoryShortName", scope = AuthenticateGatewayRepository.class)
    public JAXBElement<String> createAuthenticateGatewayRepositoryRepositoryShortName(String value) {
        return new JAXBElement<String>(_AuthenticateGatewayRepositoryRepositoryShortName_QNAME, String.class, AuthenticateGatewayRepository.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RepositoryKey", scope = AuthenticateGatewayRepository.class)
    public JAXBElement<String> createAuthenticateGatewayRepositoryRepositoryKey(String value) {
        return new JAXBElement<String>(_AuthenticateGatewayRepositoryRepositoryKey_QNAME, String.class, AuthenticateGatewayRepository.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilesEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GatewayUploadFileGetStatusResult", scope = GatewayUploadFileGetStatusResponse.class)
    public JAXBElement<FilesEntity> createGatewayUploadFileGetStatusResponseGatewayUploadFileGetStatusResult(FilesEntity value) {
        return new JAXBElement<FilesEntity>(_GatewayUploadFileGetStatusResponseGatewayUploadFileGetStatusResult_QNAME, FilesEntity.class, GatewayUploadFileGetStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = AddOrganizationReferralStatus.class)
    public JAXBElement<String> createAddOrganizationReferralStatusSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, AddOrganizationReferralStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GatewayUploadHL7Message.class)
    public JAXBElement<String> createGatewayUploadHL7MessageSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GatewayUploadHL7Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Message", scope = GatewayUploadHL7Message.class)
    public JAXBElement<String> createGatewayUploadHL7MessageMessage(String value) {
        return new JAXBElement<String>(_LogMessageMessage_QNAME, String.class, GatewayUploadHL7Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GatewaySaveClient.class)
    public JAXBElement<String> createGatewaySaveClientSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GatewaySaveClient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GatewayDownloadFolder", scope = GatewaySaveClient.class)
    public JAXBElement<String> createGatewaySaveClientGatewayDownloadFolder(String value) {
        return new JAXBElement<String>(_GatewaySaveClientGatewayDownloadFolder_QNAME, String.class, GatewaySaveClient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GatewayUploadFolder", scope = GatewaySaveClient.class)
    public JAXBElement<String> createGatewaySaveClientGatewayUploadFolder(String value) {
        return new JAXBElement<String>(_GatewaySaveClientGatewayUploadFolder_QNAME, String.class, GatewaySaveClient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GatewayHL7UploadFolder", scope = GatewaySaveClient.class)
    public JAXBElement<String> createGatewaySaveClientGatewayHL7UploadFolder(String value) {
        return new JAXBElement<String>(_GatewaySaveClientGatewayHL7UploadFolder_QNAME, String.class, GatewaySaveClient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GatewayDowloadList.class)
    public JAXBElement<String> createGatewayDowloadListSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GatewayDowloadList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = LogoutUser.class)
    public JAXBElement<String> createLogoutUserSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, LogoutUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GatewaySaveClientResult", scope = GatewaySaveClientResponse.class)
    public JAXBElement<String> createGatewaySaveClientResponseGatewaySaveClientResult(String value) {
        return new JAXBElement<String>(_GatewaySaveClientResponseGatewaySaveClientResult_QNAME, String.class, GatewaySaveClientResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = DesktopUpdateUploadFileStatus.class)
    public JAXBElement<String> createDesktopUpdateUploadFileStatusSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, DesktopUpdateUploadFileStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DesktopDownloadFolder", scope = DesktopSaveUserSettings.class)
    public JAXBElement<String> createDesktopSaveUserSettingsDesktopDownloadFolder(String value) {
        return new JAXBElement<String>(_DesktopSaveUserSettingsDesktopDownloadFolder_QNAME, String.class, DesktopSaveUserSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = DesktopSaveUserSettings.class)
    public JAXBElement<String> createDesktopSaveUserSettingsSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, DesktopSaveUserSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signatureFileData", scope = DesktopSaveUserSettings.class)
    public JAXBElement<byte[]> createDesktopSaveUserSettingsSignatureFileData(byte[] value) {
        return new JAXBElement<byte[]>(_DesktopSaveUserSettingsSignatureFileData_QNAME, byte[].class, DesktopSaveUserSettings.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UniqueID", scope = GetCONNECTCCDADocument.class)
    public JAXBElement<String> createGetCONNECTCCDADocumentUniqueID(String value) {
        return new JAXBElement<String>(_GetCONNECTCCDADocumentUniqueID_QNAME, String.class, GetCONNECTCCDADocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CallingOID", scope = GetCONNECTCCDADocument.class)
    public JAXBElement<String> createGetCONNECTCCDADocumentCallingOID(String value) {
        return new JAXBElement<String>(_GetCONNECTPatientCallingOID_QNAME, String.class, GetCONNECTCCDADocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GetCONNECTCCDADocument.class)
    public JAXBElement<String> createGetCONNECTCCDADocumentSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GetCONNECTCCDADocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Details", scope = GatewayDownloadUpdateRHINFileStatus.class)
    public JAXBElement<String> createGatewayDownloadUpdateRHINFileStatusDetails(String value) {
        return new JAXBElement<String>(_GatewayUploadFileUpdateStatusDetails_QNAME, String.class, GatewayDownloadUpdateRHINFileStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GatewayDownloadUpdateRHINFileStatus.class)
    public JAXBElement<String> createGatewayDownloadUpdateRHINFileStatusSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GatewayDownloadUpdateRHINFileStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FileNamme", scope = GatewayUploadFile.class)
    public JAXBElement<String> createGatewayUploadFileFileNamme(String value) {
        return new JAXBElement<String>(_GatewayUploadFileFileNamme_QNAME, String.class, GatewayUploadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = GatewayUploadFile.class)
    public JAXBElement<String> createGatewayUploadFileSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, GatewayUploadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UploadFolder", scope = GatewayUploadFile.class)
    public JAXBElement<String> createGatewayUploadFileUploadFolder(String value) {
        return new JAXBElement<String>(_GatewayUploadFileUploadFolder_QNAME, String.class, GatewayUploadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FileData", scope = GatewayUploadFile.class)
    public JAXBElement<byte[]> createGatewayUploadFileFileData(byte[] value) {
        return new JAXBElement<byte[]>(_GatewayUploadFileFileData_QNAME, byte[].class, GatewayUploadFile.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DesktopUploadFileResult", scope = DesktopUploadFileResponse.class)
    public JAXBElement<String> createDesktopUploadFileResponseDesktopUploadFileResult(String value) {
        return new JAXBElement<String>(_DesktopUploadFileResponseDesktopUploadFileResult_QNAME, String.class, DesktopUploadFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINFilesEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DesktopDownloadRHINFileResult", scope = DesktopDownloadRHINFileResponse.class)
    public JAXBElement<RHINFilesEntity> createDesktopDownloadRHINFileResponseDesktopDownloadRHINFileResult(RHINFilesEntity value) {
        return new JAXBElement<RHINFilesEntity>(_DesktopDownloadRHINFileResponseDesktopDownloadRHINFileResult_QNAME, RHINFilesEntity.class, DesktopDownloadRHINFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DesktopSaveUserSettingsResult", scope = DesktopSaveUserSettingsResponse.class)
    public JAXBElement<String> createDesktopSaveUserSettingsResponseDesktopSaveUserSettingsResult(String value) {
        return new JAXBElement<String>(_DesktopSaveUserSettingsResponseDesktopSaveUserSettingsResult_QNAME, String.class, DesktopSaveUserSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClinicalDocumentEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCONNECTClinicalDocumentListResult", scope = GetCONNECTClinicalDocumentListResponse.class)
    public JAXBElement<ArrayOfClinicalDocumentEntity> createGetCONNECTClinicalDocumentListResponseGetCONNECTClinicalDocumentListResult(ArrayOfClinicalDocumentEntity value) {
        return new JAXBElement<ArrayOfClinicalDocumentEntity>(_GetCONNECTClinicalDocumentListResponseGetCONNECTClinicalDocumentListResult_QNAME, ArrayOfClinicalDocumentEntity.class, GetCONNECTClinicalDocumentListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = DeleteReferralOrganizationStatus.class)
    public JAXBElement<String> createDeleteReferralOrganizationStatusSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, DeleteReferralOrganizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GatewayDownloadUpdateRHINFileStatusResult", scope = GatewayDownloadUpdateRHINFileStatusResponse.class)
    public JAXBElement<String> createGatewayDownloadUpdateRHINFileStatusResponseGatewayDownloadUpdateRHINFileStatusResult(String value) {
        return new JAXBElement<String>(_GatewayDownloadUpdateRHINFileStatusResponseGatewayDownloadUpdateRHINFileStatusResult_QNAME, String.class, GatewayDownloadUpdateRHINFileStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINUserEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetUserResult", scope = GetUserResponse.class)
    public JAXBElement<RHINUserEntity> createGetUserResponseGetUserResult(RHINUserEntity value) {
        return new JAXBElement<RHINUserEntity>(_GetUserResponseGetUserResult_QNAME, RHINUserEntity.class, GetUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LogMessageResult", scope = LogMessageResponse.class)
    public JAXBElement<String> createLogMessageResponseLogMessageResult(String value) {
        return new JAXBElement<String>(_LogMessageResponseLogMessageResult_QNAME, String.class, LogMessageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FileName", scope = DesktopUploadFile.class)
    public JAXBElement<String> createDesktopUploadFileFileName(String value) {
        return new JAXBElement<String>(_DesktopUploadFileFileName_QNAME, String.class, DesktopUploadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionToken", scope = DesktopUploadFile.class)
    public JAXBElement<String> createDesktopUploadFileSessionToken(String value) {
        return new JAXBElement<String>(_GatewayDownloadRHINFileSessionToken_QNAME, String.class, DesktopUploadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FileData", scope = DesktopUploadFile.class)
    public JAXBElement<byte[]> createDesktopUploadFileFileData(byte[] value) {
        return new JAXBElement<byte[]>(_GatewayUploadFileFileData_QNAME, byte[].class, DesktopUploadFile.class, ((byte[]) value));
    }

}
