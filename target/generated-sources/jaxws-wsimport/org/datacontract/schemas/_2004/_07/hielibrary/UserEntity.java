
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="AllowEmailNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DefaultOrganizationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsDesktopEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPasswordSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrganizationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParticipantAuthorizedRHINUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParticipantAuthorizedRHINUserID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParticipantID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PasswordResetRequestDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PasswordValidUntilDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Picture" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="RHINUserID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RHINUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecurityQuestionAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecurityQuestionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TelephoneExtension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "UserEntity", propOrder = {
    "allowEmailNotifications",
    "defaultOrganizationID",
    "displayName",
    "email",
    "firstName",
    "isActive",
    "isDesktopEnabled",
    "isPasswordSet",
    "lastName",
    "middleName",
    "notes",
    "organizationID",
    "participantAuthorizedRHINUser",
    "participantAuthorizedRHINUserID",
    "participantID",
    "passwordResetRequestDateTime",
    "passwordValidUntilDateTime",
    "picture",
    "rhinUserID",
    "rhinUserName",
    "securityQuestionAnswer",
    "securityQuestionID",
    "telephoneExtension",
    "telephoneNumber",
    "userTypeID",
    "x003CLastUpdateDateTimeX003EKBackingField",
    "x003CUserUpdatedX003EKBackingField"
})
public class UserEntity
    extends Entity
{

    @XmlElement(name = "AllowEmailNotifications")
    protected boolean allowEmailNotifications;
    @XmlElement(name = "DefaultOrganizationID")
    protected int defaultOrganizationID;
    @XmlElement(name = "DisplayName", required = true, nillable = true)
    protected String displayName;
    @XmlElement(name = "Email", required = true, nillable = true)
    protected String email;
    @XmlElement(name = "FirstName", required = true, nillable = true)
    protected String firstName;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "IsDesktopEnabled")
    protected boolean isDesktopEnabled;
    @XmlElement(name = "IsPasswordSet")
    protected boolean isPasswordSet;
    @XmlElement(name = "LastName", required = true, nillable = true)
    protected String lastName;
    @XmlElement(name = "MiddleName", required = true, nillable = true)
    protected String middleName;
    @XmlElement(name = "Notes", required = true, nillable = true)
    protected String notes;
    @XmlElement(name = "OrganizationID")
    protected int organizationID;
    @XmlElement(name = "ParticipantAuthorizedRHINUser", required = true, nillable = true)
    protected String participantAuthorizedRHINUser;
    @XmlElement(name = "ParticipantAuthorizedRHINUserID")
    protected int participantAuthorizedRHINUserID;
    @XmlElement(name = "ParticipantID")
    protected int participantID;
    @XmlElement(name = "PasswordResetRequestDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passwordResetRequestDateTime;
    @XmlElement(name = "PasswordValidUntilDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passwordValidUntilDateTime;
    @XmlElement(name = "Picture", required = true, nillable = true)
    protected byte[] picture;
    @XmlElement(name = "RHINUserID")
    protected int rhinUserID;
    @XmlElement(name = "RHINUserName", required = true, nillable = true)
    protected String rhinUserName;
    @XmlElement(name = "SecurityQuestionAnswer", required = true, nillable = true)
    protected String securityQuestionAnswer;
    @XmlElement(name = "SecurityQuestionID")
    protected int securityQuestionID;
    @XmlElement(name = "TelephoneExtension", required = true, nillable = true)
    protected String telephoneExtension;
    @XmlElement(name = "TelephoneNumber", required = true, nillable = true)
    protected String telephoneNumber;
    @XmlElement(name = "UserTypeID")
    protected int userTypeID;
    @XmlElement(name = "_x003C_LastUpdateDateTime_x003E_k__BackingField", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar x003CLastUpdateDateTimeX003EKBackingField;
    @XmlElement(name = "_x003C_UserUpdated_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CUserUpdatedX003EKBackingField;

    /**
     * Gets the value of the allowEmailNotifications property.
     * 
     */
    public boolean isAllowEmailNotifications() {
        return allowEmailNotifications;
    }

    /**
     * Sets the value of the allowEmailNotifications property.
     * 
     */
    public void setAllowEmailNotifications(boolean value) {
        this.allowEmailNotifications = value;
    }

    /**
     * Gets the value of the defaultOrganizationID property.
     * 
     */
    public int getDefaultOrganizationID() {
        return defaultOrganizationID;
    }

    /**
     * Sets the value of the defaultOrganizationID property.
     * 
     */
    public void setDefaultOrganizationID(int value) {
        this.defaultOrganizationID = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
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
     * Gets the value of the isDesktopEnabled property.
     * 
     */
    public boolean isIsDesktopEnabled() {
        return isDesktopEnabled;
    }

    /**
     * Sets the value of the isDesktopEnabled property.
     * 
     */
    public void setIsDesktopEnabled(boolean value) {
        this.isDesktopEnabled = value;
    }

    /**
     * Gets the value of the isPasswordSet property.
     * 
     */
    public boolean isIsPasswordSet() {
        return isPasswordSet;
    }

    /**
     * Sets the value of the isPasswordSet property.
     * 
     */
    public void setIsPasswordSet(boolean value) {
        this.isPasswordSet = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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
     * Gets the value of the participantAuthorizedRHINUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantAuthorizedRHINUser() {
        return participantAuthorizedRHINUser;
    }

    /**
     * Sets the value of the participantAuthorizedRHINUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantAuthorizedRHINUser(String value) {
        this.participantAuthorizedRHINUser = value;
    }

    /**
     * Gets the value of the participantAuthorizedRHINUserID property.
     * 
     */
    public int getParticipantAuthorizedRHINUserID() {
        return participantAuthorizedRHINUserID;
    }

    /**
     * Sets the value of the participantAuthorizedRHINUserID property.
     * 
     */
    public void setParticipantAuthorizedRHINUserID(int value) {
        this.participantAuthorizedRHINUserID = value;
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
     * Gets the value of the passwordResetRequestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPasswordResetRequestDateTime() {
        return passwordResetRequestDateTime;
    }

    /**
     * Sets the value of the passwordResetRequestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPasswordResetRequestDateTime(XMLGregorianCalendar value) {
        this.passwordResetRequestDateTime = value;
    }

    /**
     * Gets the value of the passwordValidUntilDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPasswordValidUntilDateTime() {
        return passwordValidUntilDateTime;
    }

    /**
     * Sets the value of the passwordValidUntilDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPasswordValidUntilDateTime(XMLGregorianCalendar value) {
        this.passwordValidUntilDateTime = value;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPicture(byte[] value) {
        this.picture = value;
    }

    /**
     * Gets the value of the rhinUserID property.
     * 
     */
    public int getRHINUserID() {
        return rhinUserID;
    }

    /**
     * Sets the value of the rhinUserID property.
     * 
     */
    public void setRHINUserID(int value) {
        this.rhinUserID = value;
    }

    /**
     * Gets the value of the rhinUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRHINUserName() {
        return rhinUserName;
    }

    /**
     * Sets the value of the rhinUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRHINUserName(String value) {
        this.rhinUserName = value;
    }

    /**
     * Gets the value of the securityQuestionAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityQuestionAnswer() {
        return securityQuestionAnswer;
    }

    /**
     * Sets the value of the securityQuestionAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityQuestionAnswer(String value) {
        this.securityQuestionAnswer = value;
    }

    /**
     * Gets the value of the securityQuestionID property.
     * 
     */
    public int getSecurityQuestionID() {
        return securityQuestionID;
    }

    /**
     * Sets the value of the securityQuestionID property.
     * 
     */
    public void setSecurityQuestionID(int value) {
        this.securityQuestionID = value;
    }

    /**
     * Gets the value of the telephoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneExtension() {
        return telephoneExtension;
    }

    /**
     * Sets the value of the telephoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneExtension(String value) {
        this.telephoneExtension = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the userTypeID property.
     * 
     */
    public int getUserTypeID() {
        return userTypeID;
    }

    /**
     * Sets the value of the userTypeID property.
     * 
     */
    public void setUserTypeID(int value) {
        this.userTypeID = value;
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
