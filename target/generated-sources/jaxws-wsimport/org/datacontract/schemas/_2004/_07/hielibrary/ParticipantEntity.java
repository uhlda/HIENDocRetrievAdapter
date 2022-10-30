
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ParticipantEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BillingAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingPostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingStateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DefaultOutboundFaxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DefaultRepositoryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Discription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentRootFolderHeader" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExtenderCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FaxSecureLinkPageTrigger" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HealthSystemID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InvoiceDuration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowSaveLogin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsBaseReportsIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsFaxRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsIncludeHealthcareAddressBook" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsNoCoverPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPatientSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsRepositoryRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsSecureLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsWorkQueueAppointments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsWorkQueueAssignments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsWorkQueuePatientLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsWorkQueuePatientName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LoginBannerFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LoginDisclaimerText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MonthlyFaxPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MonthlyFee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutboundFaxPageLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParticipantID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParticipantName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParticipantNameLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParticipantTaxID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParticipantTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhysicianCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegistrationAgreementLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WebsiteURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ParticipantEntity", propOrder = {
    "address",
    "bedCount",
    "billingAddress",
    "billingCity",
    "billingPostalCode",
    "billingStateCode",
    "city",
    "contractDate",
    "defaultOutboundFaxNumber",
    "defaultRepositoryID",
    "discription",
    "documentRootFolderHeader",
    "extenderCount",
    "faxSecureLinkPageTrigger",
    "healthSystemID",
    "invoiceDuration",
    "isActive",
    "isAllowSaveLogin",
    "isBaseReportsIncluded",
    "isFaxRestricted",
    "isIncludeHealthcareAddressBook",
    "isNoCoverPage",
    "isPatientSearch",
    "isRepositoryRestricted",
    "isSecureLink",
    "isWorkQueueAppointments",
    "isWorkQueueAssignments",
    "isWorkQueuePatientLink",
    "isWorkQueuePatientName",
    "loginBannerFileName",
    "loginDisclaimerText",
    "monthlyFaxPages",
    "monthlyFee",
    "outboundFaxPageLimit",
    "participantID",
    "participantName",
    "participantNameLegal",
    "participantTaxID",
    "participantTypeID",
    "phoneNumber",
    "physicianCount",
    "postalCode",
    "registrationAgreementLink",
    "stateCode",
    "websiteURL",
    "x003CLastUpdateDateTimeX003EKBackingField",
    "x003CUserUpdatedX003EKBackingField"
})
public class ParticipantEntity
    extends Entity
{

    @XmlElement(name = "Address", required = true, nillable = true)
    protected String address;
    @XmlElement(name = "BedCount")
    protected int bedCount;
    @XmlElement(name = "BillingAddress", required = true, nillable = true)
    protected String billingAddress;
    @XmlElement(name = "BillingCity", required = true, nillable = true)
    protected String billingCity;
    @XmlElement(name = "BillingPostalCode", required = true, nillable = true)
    protected String billingPostalCode;
    @XmlElement(name = "BillingStateCode", required = true, nillable = true)
    protected String billingStateCode;
    @XmlElement(name = "City", required = true, nillable = true)
    protected String city;
    @XmlElement(name = "ContractDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractDate;
    @XmlElement(name = "DefaultOutboundFaxNumber", required = true, nillable = true)
    protected String defaultOutboundFaxNumber;
    @XmlElement(name = "DefaultRepositoryID")
    protected int defaultRepositoryID;
    @XmlElement(name = "Discription", required = true, nillable = true)
    protected String discription;
    @XmlElement(name = "DocumentRootFolderHeader", required = true, nillable = true)
    protected String documentRootFolderHeader;
    @XmlElement(name = "ExtenderCount")
    protected int extenderCount;
    @XmlElement(name = "FaxSecureLinkPageTrigger")
    protected int faxSecureLinkPageTrigger;
    @XmlElement(name = "HealthSystemID")
    protected int healthSystemID;
    @XmlElement(name = "InvoiceDuration", required = true, nillable = true)
    protected String invoiceDuration;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "IsAllowSaveLogin")
    protected boolean isAllowSaveLogin;
    @XmlElement(name = "IsBaseReportsIncluded")
    protected boolean isBaseReportsIncluded;
    @XmlElement(name = "IsFaxRestricted")
    protected boolean isFaxRestricted;
    @XmlElement(name = "IsIncludeHealthcareAddressBook")
    protected boolean isIncludeHealthcareAddressBook;
    @XmlElement(name = "IsNoCoverPage")
    protected boolean isNoCoverPage;
    @XmlElement(name = "IsPatientSearch")
    protected boolean isPatientSearch;
    @XmlElement(name = "IsRepositoryRestricted")
    protected boolean isRepositoryRestricted;
    @XmlElement(name = "IsSecureLink")
    protected boolean isSecureLink;
    @XmlElement(name = "IsWorkQueueAppointments")
    protected boolean isWorkQueueAppointments;
    @XmlElement(name = "IsWorkQueueAssignments")
    protected boolean isWorkQueueAssignments;
    @XmlElement(name = "IsWorkQueuePatientLink")
    protected boolean isWorkQueuePatientLink;
    @XmlElement(name = "IsWorkQueuePatientName")
    protected boolean isWorkQueuePatientName;
    @XmlElement(name = "LoginBannerFileName", required = true, nillable = true)
    protected String loginBannerFileName;
    @XmlElement(name = "LoginDisclaimerText", required = true, nillable = true)
    protected String loginDisclaimerText;
    @XmlElement(name = "MonthlyFaxPages")
    protected int monthlyFaxPages;
    @XmlElement(name = "MonthlyFee")
    protected int monthlyFee;
    @XmlElement(name = "OutboundFaxPageLimit")
    protected int outboundFaxPageLimit;
    @XmlElement(name = "ParticipantID")
    protected int participantID;
    @XmlElement(name = "ParticipantName", required = true, nillable = true)
    protected String participantName;
    @XmlElement(name = "ParticipantNameLegal", required = true, nillable = true)
    protected String participantNameLegal;
    @XmlElement(name = "ParticipantTaxID", required = true, nillable = true)
    protected String participantTaxID;
    @XmlElement(name = "ParticipantTypeID")
    protected int participantTypeID;
    @XmlElement(name = "PhoneNumber", required = true, nillable = true)
    protected String phoneNumber;
    @XmlElement(name = "PhysicianCount")
    protected int physicianCount;
    @XmlElement(name = "PostalCode", required = true, nillable = true)
    protected String postalCode;
    @XmlElement(name = "RegistrationAgreementLink", required = true, nillable = true)
    protected String registrationAgreementLink;
    @XmlElement(name = "StateCode", required = true, nillable = true)
    protected String stateCode;
    @XmlElement(name = "WebsiteURL", required = true, nillable = true)
    protected String websiteURL;
    @XmlElement(name = "_x003C_LastUpdateDateTime_x003E_k__BackingField", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar x003CLastUpdateDateTimeX003EKBackingField;
    @XmlElement(name = "_x003C_UserUpdated_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CUserUpdatedX003EKBackingField;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the bedCount property.
     * 
     */
    public int getBedCount() {
        return bedCount;
    }

    /**
     * Sets the value of the bedCount property.
     * 
     */
    public void setBedCount(int value) {
        this.bedCount = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress(String value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the billingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Sets the value of the billingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCity(String value) {
        this.billingCity = value;
    }

    /**
     * Gets the value of the billingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    /**
     * Sets the value of the billingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingPostalCode(String value) {
        this.billingPostalCode = value;
    }

    /**
     * Gets the value of the billingStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingStateCode() {
        return billingStateCode;
    }

    /**
     * Sets the value of the billingStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingStateCode(String value) {
        this.billingStateCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the contractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDate() {
        return contractDate;
    }

    /**
     * Sets the value of the contractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDate(XMLGregorianCalendar value) {
        this.contractDate = value;
    }

    /**
     * Gets the value of the defaultOutboundFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultOutboundFaxNumber() {
        return defaultOutboundFaxNumber;
    }

    /**
     * Sets the value of the defaultOutboundFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultOutboundFaxNumber(String value) {
        this.defaultOutboundFaxNumber = value;
    }

    /**
     * Gets the value of the defaultRepositoryID property.
     * 
     */
    public int getDefaultRepositoryID() {
        return defaultRepositoryID;
    }

    /**
     * Sets the value of the defaultRepositoryID property.
     * 
     */
    public void setDefaultRepositoryID(int value) {
        this.defaultRepositoryID = value;
    }

    /**
     * Gets the value of the discription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * Sets the value of the discription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscription(String value) {
        this.discription = value;
    }

    /**
     * Gets the value of the documentRootFolderHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentRootFolderHeader() {
        return documentRootFolderHeader;
    }

    /**
     * Sets the value of the documentRootFolderHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentRootFolderHeader(String value) {
        this.documentRootFolderHeader = value;
    }

    /**
     * Gets the value of the extenderCount property.
     * 
     */
    public int getExtenderCount() {
        return extenderCount;
    }

    /**
     * Sets the value of the extenderCount property.
     * 
     */
    public void setExtenderCount(int value) {
        this.extenderCount = value;
    }

    /**
     * Gets the value of the faxSecureLinkPageTrigger property.
     * 
     */
    public int getFaxSecureLinkPageTrigger() {
        return faxSecureLinkPageTrigger;
    }

    /**
     * Sets the value of the faxSecureLinkPageTrigger property.
     * 
     */
    public void setFaxSecureLinkPageTrigger(int value) {
        this.faxSecureLinkPageTrigger = value;
    }

    /**
     * Gets the value of the healthSystemID property.
     * 
     */
    public int getHealthSystemID() {
        return healthSystemID;
    }

    /**
     * Sets the value of the healthSystemID property.
     * 
     */
    public void setHealthSystemID(int value) {
        this.healthSystemID = value;
    }

    /**
     * Gets the value of the invoiceDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDuration() {
        return invoiceDuration;
    }

    /**
     * Sets the value of the invoiceDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDuration(String value) {
        this.invoiceDuration = value;
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
     * Gets the value of the isAllowSaveLogin property.
     * 
     */
    public boolean isIsAllowSaveLogin() {
        return isAllowSaveLogin;
    }

    /**
     * Sets the value of the isAllowSaveLogin property.
     * 
     */
    public void setIsAllowSaveLogin(boolean value) {
        this.isAllowSaveLogin = value;
    }

    /**
     * Gets the value of the isBaseReportsIncluded property.
     * 
     */
    public boolean isIsBaseReportsIncluded() {
        return isBaseReportsIncluded;
    }

    /**
     * Sets the value of the isBaseReportsIncluded property.
     * 
     */
    public void setIsBaseReportsIncluded(boolean value) {
        this.isBaseReportsIncluded = value;
    }

    /**
     * Gets the value of the isFaxRestricted property.
     * 
     */
    public boolean isIsFaxRestricted() {
        return isFaxRestricted;
    }

    /**
     * Sets the value of the isFaxRestricted property.
     * 
     */
    public void setIsFaxRestricted(boolean value) {
        this.isFaxRestricted = value;
    }

    /**
     * Gets the value of the isIncludeHealthcareAddressBook property.
     * 
     */
    public boolean isIsIncludeHealthcareAddressBook() {
        return isIncludeHealthcareAddressBook;
    }

    /**
     * Sets the value of the isIncludeHealthcareAddressBook property.
     * 
     */
    public void setIsIncludeHealthcareAddressBook(boolean value) {
        this.isIncludeHealthcareAddressBook = value;
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
     * Gets the value of the isPatientSearch property.
     * 
     */
    public boolean isIsPatientSearch() {
        return isPatientSearch;
    }

    /**
     * Sets the value of the isPatientSearch property.
     * 
     */
    public void setIsPatientSearch(boolean value) {
        this.isPatientSearch = value;
    }

    /**
     * Gets the value of the isRepositoryRestricted property.
     * 
     */
    public boolean isIsRepositoryRestricted() {
        return isRepositoryRestricted;
    }

    /**
     * Sets the value of the isRepositoryRestricted property.
     * 
     */
    public void setIsRepositoryRestricted(boolean value) {
        this.isRepositoryRestricted = value;
    }

    /**
     * Gets the value of the isSecureLink property.
     * 
     */
    public boolean isIsSecureLink() {
        return isSecureLink;
    }

    /**
     * Sets the value of the isSecureLink property.
     * 
     */
    public void setIsSecureLink(boolean value) {
        this.isSecureLink = value;
    }

    /**
     * Gets the value of the isWorkQueueAppointments property.
     * 
     */
    public boolean isIsWorkQueueAppointments() {
        return isWorkQueueAppointments;
    }

    /**
     * Sets the value of the isWorkQueueAppointments property.
     * 
     */
    public void setIsWorkQueueAppointments(boolean value) {
        this.isWorkQueueAppointments = value;
    }

    /**
     * Gets the value of the isWorkQueueAssignments property.
     * 
     */
    public boolean isIsWorkQueueAssignments() {
        return isWorkQueueAssignments;
    }

    /**
     * Sets the value of the isWorkQueueAssignments property.
     * 
     */
    public void setIsWorkQueueAssignments(boolean value) {
        this.isWorkQueueAssignments = value;
    }

    /**
     * Gets the value of the isWorkQueuePatientLink property.
     * 
     */
    public boolean isIsWorkQueuePatientLink() {
        return isWorkQueuePatientLink;
    }

    /**
     * Sets the value of the isWorkQueuePatientLink property.
     * 
     */
    public void setIsWorkQueuePatientLink(boolean value) {
        this.isWorkQueuePatientLink = value;
    }

    /**
     * Gets the value of the isWorkQueuePatientName property.
     * 
     */
    public boolean isIsWorkQueuePatientName() {
        return isWorkQueuePatientName;
    }

    /**
     * Sets the value of the isWorkQueuePatientName property.
     * 
     */
    public void setIsWorkQueuePatientName(boolean value) {
        this.isWorkQueuePatientName = value;
    }

    /**
     * Gets the value of the loginBannerFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginBannerFileName() {
        return loginBannerFileName;
    }

    /**
     * Sets the value of the loginBannerFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginBannerFileName(String value) {
        this.loginBannerFileName = value;
    }

    /**
     * Gets the value of the loginDisclaimerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginDisclaimerText() {
        return loginDisclaimerText;
    }

    /**
     * Sets the value of the loginDisclaimerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginDisclaimerText(String value) {
        this.loginDisclaimerText = value;
    }

    /**
     * Gets the value of the monthlyFaxPages property.
     * 
     */
    public int getMonthlyFaxPages() {
        return monthlyFaxPages;
    }

    /**
     * Sets the value of the monthlyFaxPages property.
     * 
     */
    public void setMonthlyFaxPages(int value) {
        this.monthlyFaxPages = value;
    }

    /**
     * Gets the value of the monthlyFee property.
     * 
     */
    public int getMonthlyFee() {
        return monthlyFee;
    }

    /**
     * Sets the value of the monthlyFee property.
     * 
     */
    public void setMonthlyFee(int value) {
        this.monthlyFee = value;
    }

    /**
     * Gets the value of the outboundFaxPageLimit property.
     * 
     */
    public int getOutboundFaxPageLimit() {
        return outboundFaxPageLimit;
    }

    /**
     * Sets the value of the outboundFaxPageLimit property.
     * 
     */
    public void setOutboundFaxPageLimit(int value) {
        this.outboundFaxPageLimit = value;
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
     * Gets the value of the participantNameLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantNameLegal() {
        return participantNameLegal;
    }

    /**
     * Sets the value of the participantNameLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantNameLegal(String value) {
        this.participantNameLegal = value;
    }

    /**
     * Gets the value of the participantTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantTaxID() {
        return participantTaxID;
    }

    /**
     * Sets the value of the participantTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantTaxID(String value) {
        this.participantTaxID = value;
    }

    /**
     * Gets the value of the participantTypeID property.
     * 
     */
    public int getParticipantTypeID() {
        return participantTypeID;
    }

    /**
     * Sets the value of the participantTypeID property.
     * 
     */
    public void setParticipantTypeID(int value) {
        this.participantTypeID = value;
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
     * Gets the value of the physicianCount property.
     * 
     */
    public int getPhysicianCount() {
        return physicianCount;
    }

    /**
     * Sets the value of the physicianCount property.
     * 
     */
    public void setPhysicianCount(int value) {
        this.physicianCount = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the registrationAgreementLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationAgreementLink() {
        return registrationAgreementLink;
    }

    /**
     * Sets the value of the registrationAgreementLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationAgreementLink(String value) {
        this.registrationAgreementLink = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the websiteURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsiteURL() {
        return websiteURL;
    }

    /**
     * Sets the value of the websiteURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsiteURL(String value) {
        this.websiteURL = value;
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
