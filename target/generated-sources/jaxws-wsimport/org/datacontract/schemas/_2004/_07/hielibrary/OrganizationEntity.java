
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrganizationEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="DirectConnectionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DirectEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DirectPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DirectServerPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DirectServerURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InboundFax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAutoDownload" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAutoSort" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsDirectActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsExclusive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsNoCoverPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsNonMemberUpload" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPatientRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPatientRequestFile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsRHIOMember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsUnlimitedInboundFax" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsUserMasked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NoArchive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OrganizationDBA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrganizationDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrganizationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrganizationNameAbbreviated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrganizationNameLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrganizationTaxID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrganizationTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParticipantID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParticipantName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhysicalAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhysicalAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhysicalCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhysicalPostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhysicalStateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessErrorFax" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReferralFax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SendingFax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_LastUpdateDateTime_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="_x003C_UserUpdated_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationEntity", propOrder = {
    "directConnectionType",
    "directEmail",
    "directPassword",
    "directServerPort",
    "directServerURL",
    "inboundFax",
    "isActive",
    "isAutoDownload",
    "isAutoSort",
    "isDirectActive",
    "isExclusive",
    "isHidden",
    "isNoCoverPage",
    "isNonMemberUpload",
    "isPatientRequest",
    "isPatientRequestFile",
    "isPrivate",
    "isRHIOMember",
    "isUnlimitedInboundFax",
    "isUserMasked",
    "noArchive",
    "organizationDBA",
    "organizationDescription",
    "organizationID",
    "organizationNameAbbreviated",
    "organizationNameLegal",
    "organizationTaxID",
    "organizationTypeID",
    "participantID",
    "participantName",
    "phoneNumber",
    "physicalAddress1",
    "physicalAddress2",
    "physicalCity",
    "physicalPostalCode",
    "physicalStateCode",
    "processErrorFax",
    "referralFax",
    "sendingFax",
    "x003CLastUpdateDateTimeX003EKBackingField",
    "x003CUserUpdatedX003EKBackingField"
})
public class OrganizationEntity
    extends Entity
{

    @XmlElement(name = "DirectConnectionType", required = true, nillable = true)
    protected String directConnectionType;
    @XmlElement(name = "DirectEmail", required = true, nillable = true)
    protected String directEmail;
    @XmlElement(name = "DirectPassword", required = true, nillable = true)
    protected String directPassword;
    @XmlElement(name = "DirectServerPort")
    protected int directServerPort;
    @XmlElement(name = "DirectServerURL", required = true, nillable = true)
    protected String directServerURL;
    @XmlElement(name = "InboundFax", required = true, nillable = true)
    protected String inboundFax;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "IsAutoDownload")
    protected boolean isAutoDownload;
    @XmlElement(name = "IsAutoSort")
    protected boolean isAutoSort;
    @XmlElement(name = "IsDirectActive")
    protected boolean isDirectActive;
    @XmlElement(name = "IsExclusive")
    protected boolean isExclusive;
    @XmlElement(name = "IsHidden")
    protected boolean isHidden;
    @XmlElement(name = "IsNoCoverPage")
    protected boolean isNoCoverPage;
    @XmlElement(name = "IsNonMemberUpload")
    protected boolean isNonMemberUpload;
    @XmlElement(name = "IsPatientRequest")
    protected boolean isPatientRequest;
    @XmlElement(name = "IsPatientRequestFile")
    protected boolean isPatientRequestFile;
    @XmlElement(name = "IsPrivate")
    protected boolean isPrivate;
    @XmlElement(name = "IsRHIOMember")
    protected boolean isRHIOMember;
    @XmlElement(name = "IsUnlimitedInboundFax")
    protected boolean isUnlimitedInboundFax;
    @XmlElement(name = "IsUserMasked")
    protected boolean isUserMasked;
    @XmlElement(name = "NoArchive")
    protected boolean noArchive;
    @XmlElement(name = "OrganizationDBA", required = true, nillable = true)
    protected String organizationDBA;
    @XmlElement(name = "OrganizationDescription", required = true, nillable = true)
    protected String organizationDescription;
    @XmlElement(name = "OrganizationID")
    protected int organizationID;
    @XmlElement(name = "OrganizationNameAbbreviated", required = true, nillable = true)
    protected String organizationNameAbbreviated;
    @XmlElement(name = "OrganizationNameLegal", required = true, nillable = true)
    protected String organizationNameLegal;
    @XmlElement(name = "OrganizationTaxID", required = true, nillable = true)
    protected String organizationTaxID;
    @XmlElement(name = "OrganizationTypeID")
    protected int organizationTypeID;
    @XmlElement(name = "ParticipantID")
    protected int participantID;
    @XmlElement(name = "ParticipantName", required = true, nillable = true)
    protected String participantName;
    @XmlElement(name = "PhoneNumber", required = true, nillable = true)
    protected String phoneNumber;
    @XmlElement(name = "PhysicalAddress1", required = true, nillable = true)
    protected String physicalAddress1;
    @XmlElement(name = "PhysicalAddress2", required = true, nillable = true)
    protected String physicalAddress2;
    @XmlElement(name = "PhysicalCity", required = true, nillable = true)
    protected String physicalCity;
    @XmlElement(name = "PhysicalPostalCode", required = true, nillable = true)
    protected String physicalPostalCode;
    @XmlElement(name = "PhysicalStateCode", required = true, nillable = true)
    protected String physicalStateCode;
    @XmlElement(name = "ProcessErrorFax")
    protected boolean processErrorFax;
    @XmlElement(name = "ReferralFax", required = true, nillable = true)
    protected String referralFax;
    @XmlElement(name = "SendingFax", required = true, nillable = true)
    protected String sendingFax;
    @XmlElement(name = "_x003C_LastUpdateDateTime_x003E_k__BackingField", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar x003CLastUpdateDateTimeX003EKBackingField;
    @XmlElement(name = "_x003C_UserUpdated_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CUserUpdatedX003EKBackingField;

    /**
     * Gets the value of the directConnectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectConnectionType() {
        return directConnectionType;
    }

    /**
     * Sets the value of the directConnectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectConnectionType(String value) {
        this.directConnectionType = value;
    }

    /**
     * Gets the value of the directEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectEmail() {
        return directEmail;
    }

    /**
     * Sets the value of the directEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectEmail(String value) {
        this.directEmail = value;
    }

    /**
     * Gets the value of the directPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectPassword() {
        return directPassword;
    }

    /**
     * Sets the value of the directPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectPassword(String value) {
        this.directPassword = value;
    }

    /**
     * Gets the value of the directServerPort property.
     * 
     */
    public int getDirectServerPort() {
        return directServerPort;
    }

    /**
     * Sets the value of the directServerPort property.
     * 
     */
    public void setDirectServerPort(int value) {
        this.directServerPort = value;
    }

    /**
     * Gets the value of the directServerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectServerURL() {
        return directServerURL;
    }

    /**
     * Sets the value of the directServerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectServerURL(String value) {
        this.directServerURL = value;
    }

    /**
     * Gets the value of the inboundFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundFax() {
        return inboundFax;
    }

    /**
     * Sets the value of the inboundFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundFax(String value) {
        this.inboundFax = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isAutoDownload property.
     * 
     */
    public boolean isIsAutoDownload() {
        return isAutoDownload;
    }

    /**
     * Sets the value of the isAutoDownload property.
     * 
     */
    public void setIsAutoDownload(boolean value) {
        this.isAutoDownload = value;
    }

    /**
     * Gets the value of the isAutoSort property.
     * 
     */
    public boolean isIsAutoSort() {
        return isAutoSort;
    }

    /**
     * Sets the value of the isAutoSort property.
     * 
     */
    public void setIsAutoSort(boolean value) {
        this.isAutoSort = value;
    }

    /**
     * Gets the value of the isDirectActive property.
     * 
     */
    public boolean isIsDirectActive() {
        return isDirectActive;
    }

    /**
     * Sets the value of the isDirectActive property.
     * 
     */
    public void setIsDirectActive(boolean value) {
        this.isDirectActive = value;
    }

    /**
     * Gets the value of the isExclusive property.
     * 
     */
    public boolean isIsExclusive() {
        return isExclusive;
    }

    /**
     * Sets the value of the isExclusive property.
     * 
     */
    public void setIsExclusive(boolean value) {
        this.isExclusive = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     */
    public void setIsHidden(boolean value) {
        this.isHidden = value;
    }

    /**
     * Gets the value of the isNoCoverPage property.
     * 
     */
    public boolean isIsNoCoverPage() {
        return isNoCoverPage;
    }

    /**
     * Sets the value of the isNoCoverPage property.
     * 
     */
    public void setIsNoCoverPage(boolean value) {
        this.isNoCoverPage = value;
    }

    /**
     * Gets the value of the isNonMemberUpload property.
     * 
     */
    public boolean isIsNonMemberUpload() {
        return isNonMemberUpload;
    }

    /**
     * Sets the value of the isNonMemberUpload property.
     * 
     */
    public void setIsNonMemberUpload(boolean value) {
        this.isNonMemberUpload = value;
    }

    /**
     * Gets the value of the isPatientRequest property.
     * 
     */
    public boolean isIsPatientRequest() {
        return isPatientRequest;
    }

    /**
     * Sets the value of the isPatientRequest property.
     * 
     */
    public void setIsPatientRequest(boolean value) {
        this.isPatientRequest = value;
    }

    /**
     * Gets the value of the isPatientRequestFile property.
     * 
     */
    public boolean isIsPatientRequestFile() {
        return isPatientRequestFile;
    }

    /**
     * Sets the value of the isPatientRequestFile property.
     * 
     */
    public void setIsPatientRequestFile(boolean value) {
        this.isPatientRequestFile = value;
    }

    /**
     * Gets the value of the isPrivate property.
     * 
     */
    public boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     * 
     */
    public void setIsPrivate(boolean value) {
        this.isPrivate = value;
    }

    /**
     * Gets the value of the isRHIOMember property.
     * 
     */
    public boolean isIsRHIOMember() {
        return isRHIOMember;
    }

    /**
     * Sets the value of the isRHIOMember property.
     * 
     */
    public void setIsRHIOMember(boolean value) {
        this.isRHIOMember = value;
    }

    /**
     * Gets the value of the isUnlimitedInboundFax property.
     * 
     */
    public boolean isIsUnlimitedInboundFax() {
        return isUnlimitedInboundFax;
    }

    /**
     * Sets the value of the isUnlimitedInboundFax property.
     * 
     */
    public void setIsUnlimitedInboundFax(boolean value) {
        this.isUnlimitedInboundFax = value;
    }

    /**
     * Gets the value of the isUserMasked property.
     * 
     */
    public boolean isIsUserMasked() {
        return isUserMasked;
    }

    /**
     * Sets the value of the isUserMasked property.
     * 
     */
    public void setIsUserMasked(boolean value) {
        this.isUserMasked = value;
    }

    /**
     * Gets the value of the noArchive property.
     * 
     */
    public boolean isNoArchive() {
        return noArchive;
    }

    /**
     * Sets the value of the noArchive property.
     * 
     */
    public void setNoArchive(boolean value) {
        this.noArchive = value;
    }

    /**
     * Gets the value of the organizationDBA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationDBA() {
        return organizationDBA;
    }

    /**
     * Sets the value of the organizationDBA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationDBA(String value) {
        this.organizationDBA = value;
    }

    /**
     * Gets the value of the organizationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationDescription() {
        return organizationDescription;
    }

    /**
     * Sets the value of the organizationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationDescription(String value) {
        this.organizationDescription = value;
    }

    /**
     * Gets the value of the organizationID property.
     * 
     */
    public int getOrganizationID() {
        return organizationID;
    }

    /**
     * Sets the value of the organizationID property.
     * 
     */
    public void setOrganizationID(int value) {
        this.organizationID = value;
    }

    /**
     * Gets the value of the organizationNameAbbreviated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationNameAbbreviated() {
        return organizationNameAbbreviated;
    }

    /**
     * Sets the value of the organizationNameAbbreviated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationNameAbbreviated(String value) {
        this.organizationNameAbbreviated = value;
    }

    /**
     * Gets the value of the organizationNameLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationNameLegal() {
        return organizationNameLegal;
    }

    /**
     * Sets the value of the organizationNameLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationNameLegal(String value) {
        this.organizationNameLegal = value;
    }

    /**
     * Gets the value of the organizationTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationTaxID() {
        return organizationTaxID;
    }

    /**
     * Sets the value of the organizationTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationTaxID(String value) {
        this.organizationTaxID = value;
    }

    /**
     * Gets the value of the organizationTypeID property.
     * 
     */
    public int getOrganizationTypeID() {
        return organizationTypeID;
    }

    /**
     * Sets the value of the organizationTypeID property.
     * 
     */
    public void setOrganizationTypeID(int value) {
        this.organizationTypeID = value;
    }

    /**
     * Gets the value of the participantID property.
     * 
     */
    public int getParticipantID() {
        return participantID;
    }

    /**
     * Sets the value of the participantID property.
     * 
     */
    public void setParticipantID(int value) {
        this.participantID = value;
    }

    /**
     * Gets the value of the participantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantName() {
        return participantName;
    }

    /**
     * Sets the value of the participantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantName(String value) {
        this.participantName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the physicalAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalAddress1() {
        return physicalAddress1;
    }

    /**
     * Sets the value of the physicalAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddress1(String value) {
        this.physicalAddress1 = value;
    }

    /**
     * Gets the value of the physicalAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalAddress2() {
        return physicalAddress2;
    }

    /**
     * Sets the value of the physicalAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddress2(String value) {
        this.physicalAddress2 = value;
    }

    /**
     * Gets the value of the physicalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalCity() {
        return physicalCity;
    }

    /**
     * Sets the value of the physicalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalCity(String value) {
        this.physicalCity = value;
    }

    /**
     * Gets the value of the physicalPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalPostalCode() {
        return physicalPostalCode;
    }

    /**
     * Sets the value of the physicalPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalPostalCode(String value) {
        this.physicalPostalCode = value;
    }

    /**
     * Gets the value of the physicalStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalStateCode() {
        return physicalStateCode;
    }

    /**
     * Sets the value of the physicalStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalStateCode(String value) {
        this.physicalStateCode = value;
    }

    /**
     * Gets the value of the processErrorFax property.
     * 
     */
    public boolean isProcessErrorFax() {
        return processErrorFax;
    }

    /**
     * Sets the value of the processErrorFax property.
     * 
     */
    public void setProcessErrorFax(boolean value) {
        this.processErrorFax = value;
    }

    /**
     * Gets the value of the referralFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralFax() {
        return referralFax;
    }

    /**
     * Sets the value of the referralFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralFax(String value) {
        this.referralFax = value;
    }

    /**
     * Gets the value of the sendingFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingFax() {
        return sendingFax;
    }

    /**
     * Sets the value of the sendingFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingFax(String value) {
        this.sendingFax = value;
    }

    /**
     * Gets the value of the x003CLastUpdateDateTimeX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getX003CLastUpdateDateTimeX003EKBackingField() {
        return x003CLastUpdateDateTimeX003EKBackingField;
    }

    /**
     * Sets the value of the x003CLastUpdateDateTimeX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setX003CLastUpdateDateTimeX003EKBackingField(XMLGregorianCalendar value) {
        this.x003CLastUpdateDateTimeX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CUserUpdatedX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CUserUpdatedX003EKBackingField() {
        return x003CUserUpdatedX003EKBackingField;
    }

    /**
     * Sets the value of the x003CUserUpdatedX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CUserUpdatedX003EKBackingField(String value) {
        this.x003CUserUpdatedX003EKBackingField = value;
    }

}
