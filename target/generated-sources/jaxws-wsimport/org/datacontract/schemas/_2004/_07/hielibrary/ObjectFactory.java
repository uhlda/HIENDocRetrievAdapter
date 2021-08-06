
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.hielibrary package. 
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

    private final static QName _Entity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "Entity");
    private final static QName _RepositorySessionEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RepositorySessionEntity");
    private final static QName _RHINFileEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RHINFileEntity");
    private final static QName _ArrayOfRHINUserEntityUserPermissions_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ArrayOfRHINUserEntity.UserPermissions");
    private final static QName _PatientEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "PatientEntity");
    private final static QName _DocumentEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "DocumentEntity");
    private final static QName _RHINUserEntityUserSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RHINUserEntity.UserSettings");
    private final static QName _ClinicalDocumentEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ClinicalDocumentEntity");
    private final static QName _ArrayOfFileEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ArrayOfFileEntity");
    private final static QName _RHINRepositoryEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RHINRepositoryEntity");
    private final static QName _ParticipantEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ParticipantEntity");
    private final static QName _ArrayOfRHINUserEntityUserSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ArrayOfRHINUserEntity.UserSettings");
    private final static QName _RepositoryEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RepositoryEntity");
    private final static QName _RHINUserEntityUserAcknowledgement_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RHINUserEntity.UserAcknowledgement");
    private final static QName _ArrayOfRHINFileEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ArrayOfRHINFileEntity");
    private final static QName _RHINFilesEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RHINFilesEntity");
    private final static QName _UserEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "UserEntity");
    private final static QName _OrganizationEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "OrganizationEntity");
    private final static QName _FilesEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "FilesEntity");
    private final static QName _UserSessionEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "UserSessionEntity");
    private final static QName _ArrayOfClinicalDocumentEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ArrayOfClinicalDocumentEntity");
    private final static QName _UserDesktopActionsEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "UserDesktopActionsEntity");
    private final static QName _RHINUserEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RHINUserEntity");
    private final static QName _RHINUserEntityUserPermissions_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RHINUserEntity.UserPermissions");
    private final static QName _GenericEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "GenericEntity");
    private final static QName _ArrayOfUserDesktopActionEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ArrayOfUserDesktopActionEntity");
    private final static QName _RHINUserEntityUserOrganizations_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RHINUserEntity.UserOrganizations");
    private final static QName _ArrayOfRHINUserEntityUserOrganizations_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ArrayOfRHINUserEntity.UserOrganizations");
    private final static QName _FileEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "FileEntity");
    private final static QName _UserDesktopActionEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "UserDesktopActionEntity");
    private final static QName _FileEntityFilePath_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "FilePath");
    private final static QName _FileEntityFileExtension_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "FileExtension");
    private final static QName _FileEntityFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "FileName");
    private final static QName _FileEntityFileData_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "FileData");
    private final static QName _GenericEntityStringList_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "StringList");
    private final static QName _GenericEntityIntList_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "IntList");
    private final static QName _EntityApplicationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ApplicationName");
    private final static QName _EntityApplicationVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ApplicationVersion");
    private final static QName _EntityError_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "Error");
    private final static QName _RHINUserEntityUserAcknowledgementSignedName_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "SignedName");
    private final static QName _RHINUserEntityUserAcknowledgementAcknowledgedText_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "AcknowledgedText");
    private final static QName _RHINUserEntityUserAcknowledgementCreateDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "CreateDate");
    private final static QName _RHINFileEntityFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "File");
    private final static QName _RHINFileEntityDocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "Document");
    private final static QName _RepositorySessionEntitySessionToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "SessionToken");
    private final static QName _RepositorySessionEntitySessionEndDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "SessionEndDateTime");
    private final static QName _RHINUserEntityUserSettingsSettingValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "SettingValue");
    private final static QName _RHINUserEntityUserSettingsSetting_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "Setting");
    private final static QName _DocumentEntityThumbnailLink_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ThumbnailLink");
    private final static QName _DocumentEntityExtension_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "Extension");
    private final static QName _DocumentEntityDocumentDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "DocumentDescription");
    private final static QName _DocumentEntityLoadDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "LoadDateTime");
    private final static QName _DocumentEntityReceivingOrganizationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ReceivingOrganizationName");
    private final static QName _DocumentEntityDocumentDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "DocumentDate");
    private final static QName _DocumentEntityDocumentLink_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "DocumentLink");
    private final static QName _DocumentEntityDocumentTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "DocumentTitle");
    private final static QName _DocumentEntityRHINUserDisplayName_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RHINUserDisplayName");
    private final static QName _DocumentEntityTypeAndSubType_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "TypeAndSubType");
    private final static QName _UserDesktopActionsEntityUserDesktopActionList_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "UserDesktopActionList");
    private final static QName _RHINUserEntityUserOrganizationsOrganizationNameAbbreviated_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "OrganizationNameAbbreviated");
    private final static QName _RHINRepositoryEntityRepositoryDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RepositoryDetails");
    private final static QName _RHINRepositoryEntityReferringOrganization_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ReferringOrganization");
    private final static QName _RHINRepositoryEntityParticipant_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "Participant");
    private final static QName _RHINRepositoryEntitySession_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "Session");
    private final static QName _RHINFilesEntityFiles_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "Files");
    private final static QName _RepositoryEntityDICOMSerialNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "DICOMSerialNumber");
    private final static QName _RepositoryEntityENSSendMapping_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ENSSendMapping");
    private final static QName _RepositoryEntityXDSDatabaseName_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "XDSDatabaseName");
    private final static QName _RepositoryEntityGatewayDownloadFolder_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "GatewayDownloadFolder");
    private final static QName _RepositoryEntityDICOMID_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "DICOMID");
    private final static QName _RepositoryEntityDICOMNamespace_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "DICOMNamespace");
    private final static QName _RepositoryEntityGatewayDefaultAreaCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "GatewayDefaultAreaCode");
    private final static QName _RepositoryEntityXDSDBConnectionString_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "XDSDBConnectionString");
    private final static QName _RepositoryEntityConnectionString_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ConnectionString");
    private final static QName _RepositoryEntityRepositoryKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RepositoryKey");
    private final static QName _RepositoryEntityGatewayHL7UploadFolder_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "GatewayHL7UploadFolder");
    private final static QName _RepositoryEntityGatewayDownloadFilePrefix_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "GatewayDownloadFilePrefix");
    private final static QName _RepositoryEntityUserUpdated_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "UserUpdated");
    private final static QName _RepositoryEntityGatewayUploadFolder_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "GatewayUploadFolder");
    private final static QName _RepositoryEntityLastUpdateDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "LastUpdateDateTime");
    private final static QName _RepositoryEntityInterfaceDBConnectionString_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "InterfaceDBConnectionString");
    private final static QName _RepositoryEntityGatewayHL7SenderIPAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "GatewayHL7SenderIPAddress");
    private final static QName _RepositoryEntityRepositoryShortName_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RepositoryShortName");
    private final static QName _RepositoryEntityDatabaseName_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "DatabaseName");
    private final static QName _RepositoryEntityGatewayUploadFileTypeFilters_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "GatewayUploadFileTypeFilters");
    private final static QName _RepositoryEntityInterfaceDatabaseName_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "InterfaceDatabaseName");
    private final static QName _RepositoryEntityRepositoryName_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "RepositoryName");
    private final static QName _RepositoryEntityGatewayAllowedIPAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "GatewayAllowedIPAddress");
    private final static QName _RepositoryEntityConfigurationFileLink_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "ConfigurationFileLink");
    private final static QName _RHINUserEntityUserPermissionsPermission_QNAME = new QName("http://schemas.datacontract.org/2004/07/HIELibrary.Entities", "Permission");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.hielibrary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RHINFilesEntity }
     * 
     */
    public RHINFilesEntity createRHINFilesEntity() {
        return new RHINFilesEntity();
    }

    /**
     * Create an instance of {@link FilesEntity }
     * 
     */
    public FilesEntity createFilesEntity() {
        return new FilesEntity();
    }

    /**
     * Create an instance of {@link UserDesktopActionsEntity }
     * 
     */
    public UserDesktopActionsEntity createUserDesktopActionsEntity() {
        return new UserDesktopActionsEntity();
    }

    /**
     * Create an instance of {@link RHINRepositoryEntity }
     * 
     */
    public RHINRepositoryEntity createRHINRepositoryEntity() {
        return new RHINRepositoryEntity();
    }

    /**
     * Create an instance of {@link PatientEntity }
     * 
     */
    public PatientEntity createPatientEntity() {
        return new PatientEntity();
    }

    /**
     * Create an instance of {@link RHINUserEntity }
     * 
     */
    public RHINUserEntity createRHINUserEntity() {
        return new RHINUserEntity();
    }

    /**
     * Create an instance of {@link ArrayOfClinicalDocumentEntity }
     * 
     */
    public ArrayOfClinicalDocumentEntity createArrayOfClinicalDocumentEntity() {
        return new ArrayOfClinicalDocumentEntity();
    }

    /**
     * Create an instance of {@link GenericEntity }
     * 
     */
    public GenericEntity createGenericEntity() {
        return new GenericEntity();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link RepositorySessionEntity }
     * 
     */
    public RepositorySessionEntity createRepositorySessionEntity() {
        return new RepositorySessionEntity();
    }

    /**
     * Create an instance of {@link RHINFileEntity }
     * 
     */
    public RHINFileEntity createRHINFileEntity() {
        return new RHINFileEntity();
    }

    /**
     * Create an instance of {@link ArrayOfRHINUserEntityUserPermissions }
     * 
     */
    public ArrayOfRHINUserEntityUserPermissions createArrayOfRHINUserEntityUserPermissions() {
        return new ArrayOfRHINUserEntityUserPermissions();
    }

    /**
     * Create an instance of {@link OrganizationEntity }
     * 
     */
    public OrganizationEntity createOrganizationEntity() {
        return new OrganizationEntity();
    }

    /**
     * Create an instance of {@link UserSessionEntity }
     * 
     */
    public UserSessionEntity createUserSessionEntity() {
        return new UserSessionEntity();
    }

    /**
     * Create an instance of {@link ArrayOfRHINUserEntityUserOrganizations }
     * 
     */
    public ArrayOfRHINUserEntityUserOrganizations createArrayOfRHINUserEntityUserOrganizations() {
        return new ArrayOfRHINUserEntityUserOrganizations();
    }

    /**
     * Create an instance of {@link RHINUserEntityUserOrganizations }
     * 
     */
    public RHINUserEntityUserOrganizations createRHINUserEntityUserOrganizations() {
        return new RHINUserEntityUserOrganizations();
    }

    /**
     * Create an instance of {@link FileEntity }
     * 
     */
    public FileEntity createFileEntity() {
        return new FileEntity();
    }

    /**
     * Create an instance of {@link ArrayOfRHINUserEntityUserSettings }
     * 
     */
    public ArrayOfRHINUserEntityUserSettings createArrayOfRHINUserEntityUserSettings() {
        return new ArrayOfRHINUserEntityUserSettings();
    }

    /**
     * Create an instance of {@link ParticipantEntity }
     * 
     */
    public ParticipantEntity createParticipantEntity() {
        return new ParticipantEntity();
    }

    /**
     * Create an instance of {@link RHINUserEntityUserAcknowledgement }
     * 
     */
    public RHINUserEntityUserAcknowledgement createRHINUserEntityUserAcknowledgement() {
        return new RHINUserEntityUserAcknowledgement();
    }

    /**
     * Create an instance of {@link UserDesktopActionEntity }
     * 
     */
    public UserDesktopActionEntity createUserDesktopActionEntity() {
        return new UserDesktopActionEntity();
    }

    /**
     * Create an instance of {@link RepositoryEntity }
     * 
     */
    public RepositoryEntity createRepositoryEntity() {
        return new RepositoryEntity();
    }

    /**
     * Create an instance of {@link ArrayOfRHINFileEntity }
     * 
     */
    public ArrayOfRHINFileEntity createArrayOfRHINFileEntity() {
        return new ArrayOfRHINFileEntity();
    }

    /**
     * Create an instance of {@link UserEntity }
     * 
     */
    public UserEntity createUserEntity() {
        return new UserEntity();
    }

    /**
     * Create an instance of {@link DocumentEntity }
     * 
     */
    public DocumentEntity createDocumentEntity() {
        return new DocumentEntity();
    }

    /**
     * Create an instance of {@link RHINUserEntityUserPermissions }
     * 
     */
    public RHINUserEntityUserPermissions createRHINUserEntityUserPermissions() {
        return new RHINUserEntityUserPermissions();
    }

    /**
     * Create an instance of {@link RHINUserEntityUserSettings }
     * 
     */
    public RHINUserEntityUserSettings createRHINUserEntityUserSettings() {
        return new RHINUserEntityUserSettings();
    }

    /**
     * Create an instance of {@link ArrayOfUserDesktopActionEntity }
     * 
     */
    public ArrayOfUserDesktopActionEntity createArrayOfUserDesktopActionEntity() {
        return new ArrayOfUserDesktopActionEntity();
    }

    /**
     * Create an instance of {@link ClinicalDocumentEntity }
     * 
     */
    public ClinicalDocumentEntity createClinicalDocumentEntity() {
        return new ClinicalDocumentEntity();
    }

    /**
     * Create an instance of {@link ArrayOfFileEntity }
     * 
     */
    public ArrayOfFileEntity createArrayOfFileEntity() {
        return new ArrayOfFileEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "Entity")
    public JAXBElement<Entity> createEntity(Entity value) {
        return new JAXBElement<Entity>(_Entity_QNAME, Entity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositorySessionEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RepositorySessionEntity")
    public JAXBElement<RepositorySessionEntity> createRepositorySessionEntity(RepositorySessionEntity value) {
        return new JAXBElement<RepositorySessionEntity>(_RepositorySessionEntity_QNAME, RepositorySessionEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINFileEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RHINFileEntity")
    public JAXBElement<RHINFileEntity> createRHINFileEntity(RHINFileEntity value) {
        return new JAXBElement<RHINFileEntity>(_RHINFileEntity_QNAME, RHINFileEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRHINUserEntityUserPermissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ArrayOfRHINUserEntity.UserPermissions")
    public JAXBElement<ArrayOfRHINUserEntityUserPermissions> createArrayOfRHINUserEntityUserPermissions(ArrayOfRHINUserEntityUserPermissions value) {
        return new JAXBElement<ArrayOfRHINUserEntityUserPermissions>(_ArrayOfRHINUserEntityUserPermissions_QNAME, ArrayOfRHINUserEntityUserPermissions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatientEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "PatientEntity")
    public JAXBElement<PatientEntity> createPatientEntity(PatientEntity value) {
        return new JAXBElement<PatientEntity>(_PatientEntity_QNAME, PatientEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "DocumentEntity")
    public JAXBElement<DocumentEntity> createDocumentEntity(DocumentEntity value) {
        return new JAXBElement<DocumentEntity>(_DocumentEntity_QNAME, DocumentEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINUserEntityUserSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RHINUserEntity.UserSettings")
    public JAXBElement<RHINUserEntityUserSettings> createRHINUserEntityUserSettings(RHINUserEntityUserSettings value) {
        return new JAXBElement<RHINUserEntityUserSettings>(_RHINUserEntityUserSettings_QNAME, RHINUserEntityUserSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClinicalDocumentEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ClinicalDocumentEntity")
    public JAXBElement<ClinicalDocumentEntity> createClinicalDocumentEntity(ClinicalDocumentEntity value) {
        return new JAXBElement<ClinicalDocumentEntity>(_ClinicalDocumentEntity_QNAME, ClinicalDocumentEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFileEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ArrayOfFileEntity")
    public JAXBElement<ArrayOfFileEntity> createArrayOfFileEntity(ArrayOfFileEntity value) {
        return new JAXBElement<ArrayOfFileEntity>(_ArrayOfFileEntity_QNAME, ArrayOfFileEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINRepositoryEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RHINRepositoryEntity")
    public JAXBElement<RHINRepositoryEntity> createRHINRepositoryEntity(RHINRepositoryEntity value) {
        return new JAXBElement<RHINRepositoryEntity>(_RHINRepositoryEntity_QNAME, RHINRepositoryEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ParticipantEntity")
    public JAXBElement<ParticipantEntity> createParticipantEntity(ParticipantEntity value) {
        return new JAXBElement<ParticipantEntity>(_ParticipantEntity_QNAME, ParticipantEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRHINUserEntityUserSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ArrayOfRHINUserEntity.UserSettings")
    public JAXBElement<ArrayOfRHINUserEntityUserSettings> createArrayOfRHINUserEntityUserSettings(ArrayOfRHINUserEntityUserSettings value) {
        return new JAXBElement<ArrayOfRHINUserEntityUserSettings>(_ArrayOfRHINUserEntityUserSettings_QNAME, ArrayOfRHINUserEntityUserSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RepositoryEntity")
    public JAXBElement<RepositoryEntity> createRepositoryEntity(RepositoryEntity value) {
        return new JAXBElement<RepositoryEntity>(_RepositoryEntity_QNAME, RepositoryEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINUserEntityUserAcknowledgement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RHINUserEntity.UserAcknowledgement")
    public JAXBElement<RHINUserEntityUserAcknowledgement> createRHINUserEntityUserAcknowledgement(RHINUserEntityUserAcknowledgement value) {
        return new JAXBElement<RHINUserEntityUserAcknowledgement>(_RHINUserEntityUserAcknowledgement_QNAME, RHINUserEntityUserAcknowledgement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRHINFileEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ArrayOfRHINFileEntity")
    public JAXBElement<ArrayOfRHINFileEntity> createArrayOfRHINFileEntity(ArrayOfRHINFileEntity value) {
        return new JAXBElement<ArrayOfRHINFileEntity>(_ArrayOfRHINFileEntity_QNAME, ArrayOfRHINFileEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINFilesEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RHINFilesEntity")
    public JAXBElement<RHINFilesEntity> createRHINFilesEntity(RHINFilesEntity value) {
        return new JAXBElement<RHINFilesEntity>(_RHINFilesEntity_QNAME, RHINFilesEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "UserEntity")
    public JAXBElement<UserEntity> createUserEntity(UserEntity value) {
        return new JAXBElement<UserEntity>(_UserEntity_QNAME, UserEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "OrganizationEntity")
    public JAXBElement<OrganizationEntity> createOrganizationEntity(OrganizationEntity value) {
        return new JAXBElement<OrganizationEntity>(_OrganizationEntity_QNAME, OrganizationEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilesEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "FilesEntity")
    public JAXBElement<FilesEntity> createFilesEntity(FilesEntity value) {
        return new JAXBElement<FilesEntity>(_FilesEntity_QNAME, FilesEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSessionEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "UserSessionEntity")
    public JAXBElement<UserSessionEntity> createUserSessionEntity(UserSessionEntity value) {
        return new JAXBElement<UserSessionEntity>(_UserSessionEntity_QNAME, UserSessionEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClinicalDocumentEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ArrayOfClinicalDocumentEntity")
    public JAXBElement<ArrayOfClinicalDocumentEntity> createArrayOfClinicalDocumentEntity(ArrayOfClinicalDocumentEntity value) {
        return new JAXBElement<ArrayOfClinicalDocumentEntity>(_ArrayOfClinicalDocumentEntity_QNAME, ArrayOfClinicalDocumentEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDesktopActionsEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "UserDesktopActionsEntity")
    public JAXBElement<UserDesktopActionsEntity> createUserDesktopActionsEntity(UserDesktopActionsEntity value) {
        return new JAXBElement<UserDesktopActionsEntity>(_UserDesktopActionsEntity_QNAME, UserDesktopActionsEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINUserEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RHINUserEntity")
    public JAXBElement<RHINUserEntity> createRHINUserEntity(RHINUserEntity value) {
        return new JAXBElement<RHINUserEntity>(_RHINUserEntity_QNAME, RHINUserEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINUserEntityUserPermissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RHINUserEntity.UserPermissions")
    public JAXBElement<RHINUserEntityUserPermissions> createRHINUserEntityUserPermissions(RHINUserEntityUserPermissions value) {
        return new JAXBElement<RHINUserEntityUserPermissions>(_RHINUserEntityUserPermissions_QNAME, RHINUserEntityUserPermissions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "GenericEntity")
    public JAXBElement<GenericEntity> createGenericEntity(GenericEntity value) {
        return new JAXBElement<GenericEntity>(_GenericEntity_QNAME, GenericEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserDesktopActionEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ArrayOfUserDesktopActionEntity")
    public JAXBElement<ArrayOfUserDesktopActionEntity> createArrayOfUserDesktopActionEntity(ArrayOfUserDesktopActionEntity value) {
        return new JAXBElement<ArrayOfUserDesktopActionEntity>(_ArrayOfUserDesktopActionEntity_QNAME, ArrayOfUserDesktopActionEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RHINUserEntityUserOrganizations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RHINUserEntity.UserOrganizations")
    public JAXBElement<RHINUserEntityUserOrganizations> createRHINUserEntityUserOrganizations(RHINUserEntityUserOrganizations value) {
        return new JAXBElement<RHINUserEntityUserOrganizations>(_RHINUserEntityUserOrganizations_QNAME, RHINUserEntityUserOrganizations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRHINUserEntityUserOrganizations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ArrayOfRHINUserEntity.UserOrganizations")
    public JAXBElement<ArrayOfRHINUserEntityUserOrganizations> createArrayOfRHINUserEntityUserOrganizations(ArrayOfRHINUserEntityUserOrganizations value) {
        return new JAXBElement<ArrayOfRHINUserEntityUserOrganizations>(_ArrayOfRHINUserEntityUserOrganizations_QNAME, ArrayOfRHINUserEntityUserOrganizations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "FileEntity")
    public JAXBElement<FileEntity> createFileEntity(FileEntity value) {
        return new JAXBElement<FileEntity>(_FileEntity_QNAME, FileEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDesktopActionEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "UserDesktopActionEntity")
    public JAXBElement<UserDesktopActionEntity> createUserDesktopActionEntity(UserDesktopActionEntity value) {
        return new JAXBElement<UserDesktopActionEntity>(_UserDesktopActionEntity_QNAME, UserDesktopActionEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "FilePath", scope = FileEntity.class)
    public JAXBElement<String> createFileEntityFilePath(String value) {
        return new JAXBElement<String>(_FileEntityFilePath_QNAME, String.class, FileEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "FileExtension", scope = FileEntity.class)
    public JAXBElement<String> createFileEntityFileExtension(String value) {
        return new JAXBElement<String>(_FileEntityFileExtension_QNAME, String.class, FileEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "FileName", scope = FileEntity.class)
    public JAXBElement<String> createFileEntityFileName(String value) {
        return new JAXBElement<String>(_FileEntityFileName_QNAME, String.class, FileEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "FileData", scope = FileEntity.class)
    public JAXBElement<byte[]> createFileEntityFileData(byte[] value) {
        return new JAXBElement<byte[]>(_FileEntityFileData_QNAME, byte[].class, FileEntity.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "StringList", scope = GenericEntity.class)
    public JAXBElement<ArrayOfstring> createGenericEntityStringList(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GenericEntityStringList_QNAME, ArrayOfstring.class, GenericEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "IntList", scope = GenericEntity.class)
    public JAXBElement<ArrayOfint> createGenericEntityIntList(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GenericEntityIntList_QNAME, ArrayOfint.class, GenericEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ApplicationName", scope = Entity.class)
    public JAXBElement<String> createEntityApplicationName(String value) {
        return new JAXBElement<String>(_EntityApplicationName_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ApplicationVersion", scope = Entity.class)
    public JAXBElement<String> createEntityApplicationVersion(String value) {
        return new JAXBElement<String>(_EntityApplicationVersion_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "Error", scope = Entity.class)
    public JAXBElement<String> createEntityError(String value) {
        return new JAXBElement<String>(_EntityError_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "SignedName", scope = RHINUserEntityUserAcknowledgement.class)
    public JAXBElement<String> createRHINUserEntityUserAcknowledgementSignedName(String value) {
        return new JAXBElement<String>(_RHINUserEntityUserAcknowledgementSignedName_QNAME, String.class, RHINUserEntityUserAcknowledgement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "AcknowledgedText", scope = RHINUserEntityUserAcknowledgement.class)
    public JAXBElement<String> createRHINUserEntityUserAcknowledgementAcknowledgedText(String value) {
        return new JAXBElement<String>(_RHINUserEntityUserAcknowledgementAcknowledgedText_QNAME, String.class, RHINUserEntityUserAcknowledgement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "CreateDate", scope = RHINUserEntityUserAcknowledgement.class)
    public JAXBElement<XMLGregorianCalendar> createRHINUserEntityUserAcknowledgementCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RHINUserEntityUserAcknowledgementCreateDate_QNAME, XMLGregorianCalendar.class, RHINUserEntityUserAcknowledgement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "File", scope = RHINFileEntity.class)
    public JAXBElement<FileEntity> createRHINFileEntityFile(FileEntity value) {
        return new JAXBElement<FileEntity>(_RHINFileEntityFile_QNAME, FileEntity.class, RHINFileEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "Document", scope = RHINFileEntity.class)
    public JAXBElement<DocumentEntity> createRHINFileEntityDocument(DocumentEntity value) {
        return new JAXBElement<DocumentEntity>(_RHINFileEntityDocument_QNAME, DocumentEntity.class, RHINFileEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "SessionToken", scope = RepositorySessionEntity.class)
    public JAXBElement<String> createRepositorySessionEntitySessionToken(String value) {
        return new JAXBElement<String>(_RepositorySessionEntitySessionToken_QNAME, String.class, RepositorySessionEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "SessionEndDateTime", scope = RepositorySessionEntity.class)
    public JAXBElement<XMLGregorianCalendar> createRepositorySessionEntitySessionEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RepositorySessionEntitySessionEndDateTime_QNAME, XMLGregorianCalendar.class, RepositorySessionEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "SettingValue", scope = RHINUserEntityUserSettings.class)
    public JAXBElement<String> createRHINUserEntityUserSettingsSettingValue(String value) {
        return new JAXBElement<String>(_RHINUserEntityUserSettingsSettingValue_QNAME, String.class, RHINUserEntityUserSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "Setting", scope = RHINUserEntityUserSettings.class)
    public JAXBElement<String> createRHINUserEntityUserSettingsSetting(String value) {
        return new JAXBElement<String>(_RHINUserEntityUserSettingsSetting_QNAME, String.class, RHINUserEntityUserSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ThumbnailLink", scope = DocumentEntity.class)
    public JAXBElement<String> createDocumentEntityThumbnailLink(String value) {
        return new JAXBElement<String>(_DocumentEntityThumbnailLink_QNAME, String.class, DocumentEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "Extension", scope = DocumentEntity.class)
    public JAXBElement<String> createDocumentEntityExtension(String value) {
        return new JAXBElement<String>(_DocumentEntityExtension_QNAME, String.class, DocumentEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "DocumentDescription", scope = DocumentEntity.class)
    public JAXBElement<String> createDocumentEntityDocumentDescription(String value) {
        return new JAXBElement<String>(_DocumentEntityDocumentDescription_QNAME, String.class, DocumentEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "LoadDateTime", scope = DocumentEntity.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentEntityLoadDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentEntityLoadDateTime_QNAME, XMLGregorianCalendar.class, DocumentEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ReceivingOrganizationName", scope = DocumentEntity.class)
    public JAXBElement<String> createDocumentEntityReceivingOrganizationName(String value) {
        return new JAXBElement<String>(_DocumentEntityReceivingOrganizationName_QNAME, String.class, DocumentEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "DocumentDate", scope = DocumentEntity.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentEntityDocumentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentEntityDocumentDate_QNAME, XMLGregorianCalendar.class, DocumentEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "DocumentLink", scope = DocumentEntity.class)
    public JAXBElement<String> createDocumentEntityDocumentLink(String value) {
        return new JAXBElement<String>(_DocumentEntityDocumentLink_QNAME, String.class, DocumentEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "DocumentTitle", scope = DocumentEntity.class)
    public JAXBElement<String> createDocumentEntityDocumentTitle(String value) {
        return new JAXBElement<String>(_DocumentEntityDocumentTitle_QNAME, String.class, DocumentEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RHINUserDisplayName", scope = DocumentEntity.class)
    public JAXBElement<String> createDocumentEntityRHINUserDisplayName(String value) {
        return new JAXBElement<String>(_DocumentEntityRHINUserDisplayName_QNAME, String.class, DocumentEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "TypeAndSubType", scope = DocumentEntity.class)
    public JAXBElement<String> createDocumentEntityTypeAndSubType(String value) {
        return new JAXBElement<String>(_DocumentEntityTypeAndSubType_QNAME, String.class, DocumentEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserDesktopActionEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "UserDesktopActionList", scope = UserDesktopActionsEntity.class)
    public JAXBElement<ArrayOfUserDesktopActionEntity> createUserDesktopActionsEntityUserDesktopActionList(ArrayOfUserDesktopActionEntity value) {
        return new JAXBElement<ArrayOfUserDesktopActionEntity>(_UserDesktopActionsEntityUserDesktopActionList_QNAME, ArrayOfUserDesktopActionEntity.class, UserDesktopActionsEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "OrganizationNameAbbreviated", scope = RHINUserEntityUserOrganizations.class)
    public JAXBElement<String> createRHINUserEntityUserOrganizationsOrganizationNameAbbreviated(String value) {
        return new JAXBElement<String>(_RHINUserEntityUserOrganizationsOrganizationNameAbbreviated_QNAME, String.class, RHINUserEntityUserOrganizations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RepositoryDetails", scope = RHINRepositoryEntity.class)
    public JAXBElement<RepositoryEntity> createRHINRepositoryEntityRepositoryDetails(RepositoryEntity value) {
        return new JAXBElement<RepositoryEntity>(_RHINRepositoryEntityRepositoryDetails_QNAME, RepositoryEntity.class, RHINRepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ReferringOrganization", scope = RHINRepositoryEntity.class)
    public JAXBElement<OrganizationEntity> createRHINRepositoryEntityReferringOrganization(OrganizationEntity value) {
        return new JAXBElement<OrganizationEntity>(_RHINRepositoryEntityReferringOrganization_QNAME, OrganizationEntity.class, RHINRepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "Participant", scope = RHINRepositoryEntity.class)
    public JAXBElement<ParticipantEntity> createRHINRepositoryEntityParticipant(ParticipantEntity value) {
        return new JAXBElement<ParticipantEntity>(_RHINRepositoryEntityParticipant_QNAME, ParticipantEntity.class, RHINRepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositorySessionEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "Session", scope = RHINRepositoryEntity.class)
    public JAXBElement<RepositorySessionEntity> createRHINRepositoryEntitySession(RepositorySessionEntity value) {
        return new JAXBElement<RepositorySessionEntity>(_RHINRepositoryEntitySession_QNAME, RepositorySessionEntity.class, RHINRepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRHINFileEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "Files", scope = RHINFilesEntity.class)
    public JAXBElement<ArrayOfRHINFileEntity> createRHINFilesEntityFiles(ArrayOfRHINFileEntity value) {
        return new JAXBElement<ArrayOfRHINFileEntity>(_RHINFilesEntityFiles_QNAME, ArrayOfRHINFileEntity.class, RHINFilesEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "DICOMSerialNumber", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityDICOMSerialNumber(String value) {
        return new JAXBElement<String>(_RepositoryEntityDICOMSerialNumber_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ENSSendMapping", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityENSSendMapping(String value) {
        return new JAXBElement<String>(_RepositoryEntityENSSendMapping_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "XDSDatabaseName", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityXDSDatabaseName(String value) {
        return new JAXBElement<String>(_RepositoryEntityXDSDatabaseName_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "GatewayDownloadFolder", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityGatewayDownloadFolder(String value) {
        return new JAXBElement<String>(_RepositoryEntityGatewayDownloadFolder_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "DICOMID", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityDICOMID(String value) {
        return new JAXBElement<String>(_RepositoryEntityDICOMID_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "DICOMNamespace", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityDICOMNamespace(String value) {
        return new JAXBElement<String>(_RepositoryEntityDICOMNamespace_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "GatewayDefaultAreaCode", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityGatewayDefaultAreaCode(String value) {
        return new JAXBElement<String>(_RepositoryEntityGatewayDefaultAreaCode_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "XDSDBConnectionString", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityXDSDBConnectionString(String value) {
        return new JAXBElement<String>(_RepositoryEntityXDSDBConnectionString_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ConnectionString", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityConnectionString(String value) {
        return new JAXBElement<String>(_RepositoryEntityConnectionString_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RepositoryKey", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityRepositoryKey(String value) {
        return new JAXBElement<String>(_RepositoryEntityRepositoryKey_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "GatewayHL7UploadFolder", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityGatewayHL7UploadFolder(String value) {
        return new JAXBElement<String>(_RepositoryEntityGatewayHL7UploadFolder_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "GatewayDownloadFilePrefix", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityGatewayDownloadFilePrefix(String value) {
        return new JAXBElement<String>(_RepositoryEntityGatewayDownloadFilePrefix_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "UserUpdated", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityUserUpdated(String value) {
        return new JAXBElement<String>(_RepositoryEntityUserUpdated_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "GatewayUploadFolder", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityGatewayUploadFolder(String value) {
        return new JAXBElement<String>(_RepositoryEntityGatewayUploadFolder_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "LastUpdateDateTime", scope = RepositoryEntity.class)
    public JAXBElement<XMLGregorianCalendar> createRepositoryEntityLastUpdateDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RepositoryEntityLastUpdateDateTime_QNAME, XMLGregorianCalendar.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "InterfaceDBConnectionString", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityInterfaceDBConnectionString(String value) {
        return new JAXBElement<String>(_RepositoryEntityInterfaceDBConnectionString_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "GatewayHL7SenderIPAddress", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityGatewayHL7SenderIPAddress(String value) {
        return new JAXBElement<String>(_RepositoryEntityGatewayHL7SenderIPAddress_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RepositoryShortName", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityRepositoryShortName(String value) {
        return new JAXBElement<String>(_RepositoryEntityRepositoryShortName_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "DatabaseName", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityDatabaseName(String value) {
        return new JAXBElement<String>(_RepositoryEntityDatabaseName_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "GatewayUploadFileTypeFilters", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityGatewayUploadFileTypeFilters(String value) {
        return new JAXBElement<String>(_RepositoryEntityGatewayUploadFileTypeFilters_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "InterfaceDatabaseName", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityInterfaceDatabaseName(String value) {
        return new JAXBElement<String>(_RepositoryEntityInterfaceDatabaseName_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "RepositoryName", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityRepositoryName(String value) {
        return new JAXBElement<String>(_RepositoryEntityRepositoryName_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "GatewayAllowedIPAddress", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityGatewayAllowedIPAddress(String value) {
        return new JAXBElement<String>(_RepositoryEntityGatewayAllowedIPAddress_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "ConfigurationFileLink", scope = RepositoryEntity.class)
    public JAXBElement<String> createRepositoryEntityConfigurationFileLink(String value) {
        return new JAXBElement<String>(_RepositoryEntityConfigurationFileLink_QNAME, String.class, RepositoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "Permission", scope = RHINUserEntityUserPermissions.class)
    public JAXBElement<String> createRHINUserEntityUserPermissionsPermission(String value) {
        return new JAXBElement<String>(_RHINUserEntityUserPermissionsPermission_QNAME, String.class, RHINUserEntityUserPermissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFileEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", name = "Files", scope = FilesEntity.class)
    public JAXBElement<ArrayOfFileEntity> createFilesEntityFiles(ArrayOfFileEntity value) {
        return new JAXBElement<ArrayOfFileEntity>(_RHINFilesEntityFiles_QNAME, ArrayOfFileEntity.class, FilesEntity.class, value);
    }

}
