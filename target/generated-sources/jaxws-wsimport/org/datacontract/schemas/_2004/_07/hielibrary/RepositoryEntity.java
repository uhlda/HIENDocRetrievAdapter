
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RepositoryEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepositoryEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="ConfigurationFileLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DICOMID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DICOMNamespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DICOMSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatabaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENSSendMapping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExportItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExportTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GatewayAllowedIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayDefaultAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayDownloadCreateWorkQueueFolders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GatewayDownloadFilePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayDownloadFileTemplateID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GatewayDownloadFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayDownloadOverwriteFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GatewayDownloadTIFF" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GatewayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GatewayHL7ListenerEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GatewayHL7ListenerPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GatewayHL7SenderEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GatewayHL7SenderIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayHL7SenderPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GatewayHL7UploadDeleteFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GatewayHL7UploadFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayPollingInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GatewayUploadCheckSubFolders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GatewayUploadDeleteFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GatewayUploadFileTemplateID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GatewayUploadFileTypeFilters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayUploadFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayUploadStatusFileTemplateID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterfaceDBConnectionString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterfaceDatabaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsProtected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ParticipantID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReferringOrganizationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RepositoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RepositoryKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepositoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepositoryShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserUpdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XDSDBConnectionString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XDSDatabaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositoryEntity", propOrder = {
    "configurationFileLink",
    "connectionString",
    "dicomid",
    "dicomNamespace",
    "dicomSerialNumber",
    "databaseName",
    "ensSendMapping",
    "exportItems",
    "exportTypeID",
    "gatewayAllowedIPAddress",
    "gatewayDefaultAreaCode",
    "gatewayDownloadCreateWorkQueueFolders",
    "gatewayDownloadFilePrefix",
    "gatewayDownloadFileTemplateID",
    "gatewayDownloadFolder",
    "gatewayDownloadOverwriteFiles",
    "gatewayDownloadTIFF",
    "gatewayEnabled",
    "gatewayHL7ListenerEnabled",
    "gatewayHL7ListenerPort",
    "gatewayHL7SenderEnabled",
    "gatewayHL7SenderIPAddress",
    "gatewayHL7SenderPort",
    "gatewayHL7UploadDeleteFiles",
    "gatewayHL7UploadFolder",
    "gatewayPollingInterval",
    "gatewayUploadCheckSubFolders",
    "gatewayUploadDeleteFiles",
    "gatewayUploadFileTemplateID",
    "gatewayUploadFileTypeFilters",
    "gatewayUploadFolder",
    "gatewayUploadStatusFileTemplateID",
    "interfaceDBConnectionString",
    "interfaceDatabaseName",
    "isActive",
    "isProtected",
    "isTest",
    "lastUpdateDateTime",
    "participantID",
    "referringOrganizationID",
    "repositoryID",
    "repositoryKey",
    "repositoryName",
    "repositoryShortName",
    "userUpdated",
    "xdsdbConnectionString",
    "xdsDatabaseName"
})
public class RepositoryEntity
    extends Entity
{

    @XmlElementRef(name = "ConfigurationFileLink", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> configurationFileLink;
    @XmlElementRef(name = "ConnectionString", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> connectionString;
    @XmlElementRef(name = "DICOMID", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dicomid;
    @XmlElementRef(name = "DICOMNamespace", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dicomNamespace;
    @XmlElementRef(name = "DICOMSerialNumber", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dicomSerialNumber;
    @XmlElementRef(name = "DatabaseName", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> databaseName;
    @XmlElementRef(name = "ENSSendMapping", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ensSendMapping;
    @XmlElement(name = "ExportItems")
    protected Integer exportItems;
    @XmlElement(name = "ExportTypeID")
    protected Integer exportTypeID;
    @XmlElementRef(name = "GatewayAllowedIPAddress", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gatewayAllowedIPAddress;
    @XmlElementRef(name = "GatewayDefaultAreaCode", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gatewayDefaultAreaCode;
    @XmlElement(name = "GatewayDownloadCreateWorkQueueFolders")
    protected Boolean gatewayDownloadCreateWorkQueueFolders;
    @XmlElementRef(name = "GatewayDownloadFilePrefix", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gatewayDownloadFilePrefix;
    @XmlElement(name = "GatewayDownloadFileTemplateID")
    protected Integer gatewayDownloadFileTemplateID;
    @XmlElementRef(name = "GatewayDownloadFolder", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gatewayDownloadFolder;
    @XmlElement(name = "GatewayDownloadOverwriteFiles")
    protected Boolean gatewayDownloadOverwriteFiles;
    @XmlElement(name = "GatewayDownloadTIFF")
    protected Boolean gatewayDownloadTIFF;
    @XmlElement(name = "GatewayEnabled")
    protected Boolean gatewayEnabled;
    @XmlElement(name = "GatewayHL7ListenerEnabled")
    protected Boolean gatewayHL7ListenerEnabled;
    @XmlElement(name = "GatewayHL7ListenerPort")
    protected Integer gatewayHL7ListenerPort;
    @XmlElement(name = "GatewayHL7SenderEnabled")
    protected Boolean gatewayHL7SenderEnabled;
    @XmlElementRef(name = "GatewayHL7SenderIPAddress", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gatewayHL7SenderIPAddress;
    @XmlElement(name = "GatewayHL7SenderPort")
    protected Integer gatewayHL7SenderPort;
    @XmlElement(name = "GatewayHL7UploadDeleteFiles")
    protected Boolean gatewayHL7UploadDeleteFiles;
    @XmlElementRef(name = "GatewayHL7UploadFolder", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gatewayHL7UploadFolder;
    @XmlElement(name = "GatewayPollingInterval")
    protected Integer gatewayPollingInterval;
    @XmlElement(name = "GatewayUploadCheckSubFolders")
    protected Boolean gatewayUploadCheckSubFolders;
    @XmlElement(name = "GatewayUploadDeleteFiles")
    protected Boolean gatewayUploadDeleteFiles;
    @XmlElement(name = "GatewayUploadFileTemplateID")
    protected Integer gatewayUploadFileTemplateID;
    @XmlElementRef(name = "GatewayUploadFileTypeFilters", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gatewayUploadFileTypeFilters;
    @XmlElementRef(name = "GatewayUploadFolder", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gatewayUploadFolder;
    @XmlElement(name = "GatewayUploadStatusFileTemplateID")
    protected Integer gatewayUploadStatusFileTemplateID;
    @XmlElementRef(name = "InterfaceDBConnectionString", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceDBConnectionString;
    @XmlElementRef(name = "InterfaceDatabaseName", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceDatabaseName;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "IsProtected")
    protected Boolean isProtected;
    @XmlElement(name = "IsTest")
    protected Boolean isTest;
    @XmlElementRef(name = "LastUpdateDateTime", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateDateTime;
    @XmlElement(name = "ParticipantID")
    protected Integer participantID;
    @XmlElement(name = "ReferringOrganizationID")
    protected Integer referringOrganizationID;
    @XmlElement(name = "RepositoryID")
    protected Integer repositoryID;
    @XmlElementRef(name = "RepositoryKey", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> repositoryKey;
    @XmlElementRef(name = "RepositoryName", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> repositoryName;
    @XmlElementRef(name = "RepositoryShortName", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> repositoryShortName;
    @XmlElementRef(name = "UserUpdated", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userUpdated;
    @XmlElementRef(name = "XDSDBConnectionString", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xdsdbConnectionString;
    @XmlElementRef(name = "XDSDatabaseName", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xdsDatabaseName;

    /**
     * Gets the value of the configurationFileLink property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConfigurationFileLink() {
        return configurationFileLink;
    }

    /**
     * Sets the value of the configurationFileLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConfigurationFileLink(JAXBElement<String> value) {
        this.configurationFileLink = value;
    }

    /**
     * Gets the value of the connectionString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConnectionString() {
        return connectionString;
    }

    /**
     * Sets the value of the connectionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConnectionString(JAXBElement<String> value) {
        this.connectionString = value;
    }

    /**
     * Gets the value of the dicomid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDICOMID() {
        return dicomid;
    }

    /**
     * Sets the value of the dicomid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDICOMID(JAXBElement<String> value) {
        this.dicomid = value;
    }

    /**
     * Gets the value of the dicomNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDICOMNamespace() {
        return dicomNamespace;
    }

    /**
     * Sets the value of the dicomNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDICOMNamespace(JAXBElement<String> value) {
        this.dicomNamespace = value;
    }

    /**
     * Gets the value of the dicomSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDICOMSerialNumber() {
        return dicomSerialNumber;
    }

    /**
     * Sets the value of the dicomSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDICOMSerialNumber(JAXBElement<String> value) {
        this.dicomSerialNumber = value;
    }

    /**
     * Gets the value of the databaseName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatabaseName() {
        return databaseName;
    }

    /**
     * Sets the value of the databaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatabaseName(JAXBElement<String> value) {
        this.databaseName = value;
    }

    /**
     * Gets the value of the ensSendMapping property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getENSSendMapping() {
        return ensSendMapping;
    }

    /**
     * Sets the value of the ensSendMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setENSSendMapping(JAXBElement<String> value) {
        this.ensSendMapping = value;
    }

    /**
     * Gets the value of the exportItems property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExportItems() {
        return exportItems;
    }

    /**
     * Sets the value of the exportItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExportItems(Integer value) {
        this.exportItems = value;
    }

    /**
     * Gets the value of the exportTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExportTypeID() {
        return exportTypeID;
    }

    /**
     * Sets the value of the exportTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExportTypeID(Integer value) {
        this.exportTypeID = value;
    }

    /**
     * Gets the value of the gatewayAllowedIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGatewayAllowedIPAddress() {
        return gatewayAllowedIPAddress;
    }

    /**
     * Sets the value of the gatewayAllowedIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGatewayAllowedIPAddress(JAXBElement<String> value) {
        this.gatewayAllowedIPAddress = value;
    }

    /**
     * Gets the value of the gatewayDefaultAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGatewayDefaultAreaCode() {
        return gatewayDefaultAreaCode;
    }

    /**
     * Sets the value of the gatewayDefaultAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGatewayDefaultAreaCode(JAXBElement<String> value) {
        this.gatewayDefaultAreaCode = value;
    }

    /**
     * Gets the value of the gatewayDownloadCreateWorkQueueFolders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGatewayDownloadCreateWorkQueueFolders() {
        return gatewayDownloadCreateWorkQueueFolders;
    }

    /**
     * Sets the value of the gatewayDownloadCreateWorkQueueFolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGatewayDownloadCreateWorkQueueFolders(Boolean value) {
        this.gatewayDownloadCreateWorkQueueFolders = value;
    }

    /**
     * Gets the value of the gatewayDownloadFilePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGatewayDownloadFilePrefix() {
        return gatewayDownloadFilePrefix;
    }

    /**
     * Sets the value of the gatewayDownloadFilePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGatewayDownloadFilePrefix(JAXBElement<String> value) {
        this.gatewayDownloadFilePrefix = value;
    }

    /**
     * Gets the value of the gatewayDownloadFileTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGatewayDownloadFileTemplateID() {
        return gatewayDownloadFileTemplateID;
    }

    /**
     * Sets the value of the gatewayDownloadFileTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGatewayDownloadFileTemplateID(Integer value) {
        this.gatewayDownloadFileTemplateID = value;
    }

    /**
     * Gets the value of the gatewayDownloadFolder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGatewayDownloadFolder() {
        return gatewayDownloadFolder;
    }

    /**
     * Sets the value of the gatewayDownloadFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGatewayDownloadFolder(JAXBElement<String> value) {
        this.gatewayDownloadFolder = value;
    }

    /**
     * Gets the value of the gatewayDownloadOverwriteFiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGatewayDownloadOverwriteFiles() {
        return gatewayDownloadOverwriteFiles;
    }

    /**
     * Sets the value of the gatewayDownloadOverwriteFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGatewayDownloadOverwriteFiles(Boolean value) {
        this.gatewayDownloadOverwriteFiles = value;
    }

    /**
     * Gets the value of the gatewayDownloadTIFF property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGatewayDownloadTIFF() {
        return gatewayDownloadTIFF;
    }

    /**
     * Sets the value of the gatewayDownloadTIFF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGatewayDownloadTIFF(Boolean value) {
        this.gatewayDownloadTIFF = value;
    }

    /**
     * Gets the value of the gatewayEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGatewayEnabled() {
        return gatewayEnabled;
    }

    /**
     * Sets the value of the gatewayEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGatewayEnabled(Boolean value) {
        this.gatewayEnabled = value;
    }

    /**
     * Gets the value of the gatewayHL7ListenerEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGatewayHL7ListenerEnabled() {
        return gatewayHL7ListenerEnabled;
    }

    /**
     * Sets the value of the gatewayHL7ListenerEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGatewayHL7ListenerEnabled(Boolean value) {
        this.gatewayHL7ListenerEnabled = value;
    }

    /**
     * Gets the value of the gatewayHL7ListenerPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGatewayHL7ListenerPort() {
        return gatewayHL7ListenerPort;
    }

    /**
     * Sets the value of the gatewayHL7ListenerPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGatewayHL7ListenerPort(Integer value) {
        this.gatewayHL7ListenerPort = value;
    }

    /**
     * Gets the value of the gatewayHL7SenderEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGatewayHL7SenderEnabled() {
        return gatewayHL7SenderEnabled;
    }

    /**
     * Sets the value of the gatewayHL7SenderEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGatewayHL7SenderEnabled(Boolean value) {
        this.gatewayHL7SenderEnabled = value;
    }

    /**
     * Gets the value of the gatewayHL7SenderIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGatewayHL7SenderIPAddress() {
        return gatewayHL7SenderIPAddress;
    }

    /**
     * Sets the value of the gatewayHL7SenderIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGatewayHL7SenderIPAddress(JAXBElement<String> value) {
        this.gatewayHL7SenderIPAddress = value;
    }

    /**
     * Gets the value of the gatewayHL7SenderPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGatewayHL7SenderPort() {
        return gatewayHL7SenderPort;
    }

    /**
     * Sets the value of the gatewayHL7SenderPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGatewayHL7SenderPort(Integer value) {
        this.gatewayHL7SenderPort = value;
    }

    /**
     * Gets the value of the gatewayHL7UploadDeleteFiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGatewayHL7UploadDeleteFiles() {
        return gatewayHL7UploadDeleteFiles;
    }

    /**
     * Sets the value of the gatewayHL7UploadDeleteFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGatewayHL7UploadDeleteFiles(Boolean value) {
        this.gatewayHL7UploadDeleteFiles = value;
    }

    /**
     * Gets the value of the gatewayHL7UploadFolder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGatewayHL7UploadFolder() {
        return gatewayHL7UploadFolder;
    }

    /**
     * Sets the value of the gatewayHL7UploadFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGatewayHL7UploadFolder(JAXBElement<String> value) {
        this.gatewayHL7UploadFolder = value;
    }

    /**
     * Gets the value of the gatewayPollingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGatewayPollingInterval() {
        return gatewayPollingInterval;
    }

    /**
     * Sets the value of the gatewayPollingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGatewayPollingInterval(Integer value) {
        this.gatewayPollingInterval = value;
    }

    /**
     * Gets the value of the gatewayUploadCheckSubFolders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGatewayUploadCheckSubFolders() {
        return gatewayUploadCheckSubFolders;
    }

    /**
     * Sets the value of the gatewayUploadCheckSubFolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGatewayUploadCheckSubFolders(Boolean value) {
        this.gatewayUploadCheckSubFolders = value;
    }

    /**
     * Gets the value of the gatewayUploadDeleteFiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGatewayUploadDeleteFiles() {
        return gatewayUploadDeleteFiles;
    }

    /**
     * Sets the value of the gatewayUploadDeleteFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGatewayUploadDeleteFiles(Boolean value) {
        this.gatewayUploadDeleteFiles = value;
    }

    /**
     * Gets the value of the gatewayUploadFileTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGatewayUploadFileTemplateID() {
        return gatewayUploadFileTemplateID;
    }

    /**
     * Sets the value of the gatewayUploadFileTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGatewayUploadFileTemplateID(Integer value) {
        this.gatewayUploadFileTemplateID = value;
    }

    /**
     * Gets the value of the gatewayUploadFileTypeFilters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGatewayUploadFileTypeFilters() {
        return gatewayUploadFileTypeFilters;
    }

    /**
     * Sets the value of the gatewayUploadFileTypeFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGatewayUploadFileTypeFilters(JAXBElement<String> value) {
        this.gatewayUploadFileTypeFilters = value;
    }

    /**
     * Gets the value of the gatewayUploadFolder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGatewayUploadFolder() {
        return gatewayUploadFolder;
    }

    /**
     * Sets the value of the gatewayUploadFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGatewayUploadFolder(JAXBElement<String> value) {
        this.gatewayUploadFolder = value;
    }

    /**
     * Gets the value of the gatewayUploadStatusFileTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGatewayUploadStatusFileTemplateID() {
        return gatewayUploadStatusFileTemplateID;
    }

    /**
     * Sets the value of the gatewayUploadStatusFileTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGatewayUploadStatusFileTemplateID(Integer value) {
        this.gatewayUploadStatusFileTemplateID = value;
    }

    /**
     * Gets the value of the interfaceDBConnectionString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceDBConnectionString() {
        return interfaceDBConnectionString;
    }

    /**
     * Sets the value of the interfaceDBConnectionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceDBConnectionString(JAXBElement<String> value) {
        this.interfaceDBConnectionString = value;
    }

    /**
     * Gets the value of the interfaceDatabaseName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceDatabaseName() {
        return interfaceDatabaseName;
    }

    /**
     * Sets the value of the interfaceDatabaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceDatabaseName(JAXBElement<String> value) {
        this.interfaceDatabaseName = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isProtected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProtected() {
        return isProtected;
    }

    /**
     * Sets the value of the isProtected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProtected(Boolean value) {
        this.isProtected = value;
    }

    /**
     * Gets the value of the isTest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTest() {
        return isTest;
    }

    /**
     * Sets the value of the isTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTest(Boolean value) {
        this.isTest = value;
    }

    /**
     * Gets the value of the lastUpdateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * Sets the value of the lastUpdateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdateDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdateDateTime = value;
    }

    /**
     * Gets the value of the participantID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParticipantID() {
        return participantID;
    }

    /**
     * Sets the value of the participantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParticipantID(Integer value) {
        this.participantID = value;
    }

    /**
     * Gets the value of the referringOrganizationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferringOrganizationID() {
        return referringOrganizationID;
    }

    /**
     * Sets the value of the referringOrganizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferringOrganizationID(Integer value) {
        this.referringOrganizationID = value;
    }

    /**
     * Gets the value of the repositoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepositoryID() {
        return repositoryID;
    }

    /**
     * Sets the value of the repositoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepositoryID(Integer value) {
        this.repositoryID = value;
    }

    /**
     * Gets the value of the repositoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRepositoryKey() {
        return repositoryKey;
    }

    /**
     * Sets the value of the repositoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRepositoryKey(JAXBElement<String> value) {
        this.repositoryKey = value;
    }

    /**
     * Gets the value of the repositoryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRepositoryName() {
        return repositoryName;
    }

    /**
     * Sets the value of the repositoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRepositoryName(JAXBElement<String> value) {
        this.repositoryName = value;
    }

    /**
     * Gets the value of the repositoryShortName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRepositoryShortName() {
        return repositoryShortName;
    }

    /**
     * Sets the value of the repositoryShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRepositoryShortName(JAXBElement<String> value) {
        this.repositoryShortName = value;
    }

    /**
     * Gets the value of the userUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserUpdated() {
        return userUpdated;
    }

    /**
     * Sets the value of the userUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserUpdated(JAXBElement<String> value) {
        this.userUpdated = value;
    }

    /**
     * Gets the value of the xdsdbConnectionString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXDSDBConnectionString() {
        return xdsdbConnectionString;
    }

    /**
     * Sets the value of the xdsdbConnectionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXDSDBConnectionString(JAXBElement<String> value) {
        this.xdsdbConnectionString = value;
    }

    /**
     * Gets the value of the xdsDatabaseName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXDSDatabaseName() {
        return xdsDatabaseName;
    }

    /**
     * Sets the value of the xdsDatabaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXDSDatabaseName(JAXBElement<String> value) {
        this.xdsDatabaseName = value;
    }

}
