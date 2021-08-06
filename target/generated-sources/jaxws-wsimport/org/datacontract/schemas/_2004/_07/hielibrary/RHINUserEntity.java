
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RHINUserEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RHINUserEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="Acknowledgement" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}RHINUserEntity.UserAcknowledgement"/>
 *         &lt;element name="ActiveWorkQueue" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}OrganizationEntity"/>
 *         &lt;element name="DefaultWorkQueue" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}OrganizationEntity"/>
 *         &lt;element name="Participant" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}ParticipantEntity"/>
 *         &lt;element name="PermissionsList" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}ArrayOfRHINUserEntity.UserPermissions"/>
 *         &lt;element name="Repository" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}RepositoryEntity"/>
 *         &lt;element name="Session" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}UserSessionEntity"/>
 *         &lt;element name="SettingsList" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}ArrayOfRHINUserEntity.UserSettings"/>
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="UserDetails" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}UserEntity"/>
 *         &lt;element name="WorkQueueList" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}ArrayOfRHINUserEntity.UserOrganizations"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RHINUserEntity", propOrder = {
    "acknowledgement",
    "activeWorkQueue",
    "defaultWorkQueue",
    "participant",
    "permissionsList",
    "repository",
    "session",
    "settingsList",
    "signature",
    "userDetails",
    "workQueueList"
})
public class RHINUserEntity
    extends Entity
{

    @XmlElement(name = "Acknowledgement", required = true)
    protected RHINUserEntityUserAcknowledgement acknowledgement;
    @XmlElement(name = "ActiveWorkQueue", required = true, nillable = true)
    protected OrganizationEntity activeWorkQueue;
    @XmlElement(name = "DefaultWorkQueue", required = true, nillable = true)
    protected OrganizationEntity defaultWorkQueue;
    @XmlElement(name = "Participant", required = true, nillable = true)
    protected ParticipantEntity participant;
    @XmlElement(name = "PermissionsList", required = true, nillable = true)
    protected ArrayOfRHINUserEntityUserPermissions permissionsList;
    @XmlElement(name = "Repository", required = true, nillable = true)
    protected RepositoryEntity repository;
    @XmlElement(name = "Session", required = true, nillable = true)
    protected UserSessionEntity session;
    @XmlElement(name = "SettingsList", required = true, nillable = true)
    protected ArrayOfRHINUserEntityUserSettings settingsList;
    @XmlElement(name = "Signature", required = true, nillable = true)
    protected byte[] signature;
    @XmlElement(name = "UserDetails", required = true, nillable = true)
    protected UserEntity userDetails;
    @XmlElement(name = "WorkQueueList", required = true, nillable = true)
    protected ArrayOfRHINUserEntityUserOrganizations workQueueList;

    /**
     * Gets the value of the acknowledgement property.
     * 
     * @return
     *     possible object is
     *     {@link RHINUserEntityUserAcknowledgement }
     *     
     */
    public RHINUserEntityUserAcknowledgement getAcknowledgement() {
        return acknowledgement;
    }

    /**
     * Sets the value of the acknowledgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link RHINUserEntityUserAcknowledgement }
     *     
     */
    public void setAcknowledgement(RHINUserEntityUserAcknowledgement value) {
        this.acknowledgement = value;
    }

    /**
     * Gets the value of the activeWorkQueue property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationEntity }
     *     
     */
    public OrganizationEntity getActiveWorkQueue() {
        return activeWorkQueue;
    }

    /**
     * Sets the value of the activeWorkQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationEntity }
     *     
     */
    public void setActiveWorkQueue(OrganizationEntity value) {
        this.activeWorkQueue = value;
    }

    /**
     * Gets the value of the defaultWorkQueue property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationEntity }
     *     
     */
    public OrganizationEntity getDefaultWorkQueue() {
        return defaultWorkQueue;
    }

    /**
     * Sets the value of the defaultWorkQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationEntity }
     *     
     */
    public void setDefaultWorkQueue(OrganizationEntity value) {
        this.defaultWorkQueue = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantEntity }
     *     
     */
    public ParticipantEntity getParticipant() {
        return participant;
    }

    /**
     * Sets the value of the participant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantEntity }
     *     
     */
    public void setParticipant(ParticipantEntity value) {
        this.participant = value;
    }

    /**
     * Gets the value of the permissionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRHINUserEntityUserPermissions }
     *     
     */
    public ArrayOfRHINUserEntityUserPermissions getPermissionsList() {
        return permissionsList;
    }

    /**
     * Sets the value of the permissionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRHINUserEntityUserPermissions }
     *     
     */
    public void setPermissionsList(ArrayOfRHINUserEntityUserPermissions value) {
        this.permissionsList = value;
    }

    /**
     * Gets the value of the repository property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryEntity }
     *     
     */
    public RepositoryEntity getRepository() {
        return repository;
    }

    /**
     * Sets the value of the repository property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryEntity }
     *     
     */
    public void setRepository(RepositoryEntity value) {
        this.repository = value;
    }

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link UserSessionEntity }
     *     
     */
    public UserSessionEntity getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSessionEntity }
     *     
     */
    public void setSession(UserSessionEntity value) {
        this.session = value;
    }

    /**
     * Gets the value of the settingsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRHINUserEntityUserSettings }
     *     
     */
    public ArrayOfRHINUserEntityUserSettings getSettingsList() {
        return settingsList;
    }

    /**
     * Sets the value of the settingsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRHINUserEntityUserSettings }
     *     
     */
    public void setSettingsList(ArrayOfRHINUserEntityUserSettings value) {
        this.settingsList = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignature(byte[] value) {
        this.signature = value;
    }

    /**
     * Gets the value of the userDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserEntity }
     *     
     */
    public UserEntity getUserDetails() {
        return userDetails;
    }

    /**
     * Sets the value of the userDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserEntity }
     *     
     */
    public void setUserDetails(UserEntity value) {
        this.userDetails = value;
    }

    /**
     * Gets the value of the workQueueList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRHINUserEntityUserOrganizations }
     *     
     */
    public ArrayOfRHINUserEntityUserOrganizations getWorkQueueList() {
        return workQueueList;
    }

    /**
     * Sets the value of the workQueueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRHINUserEntityUserOrganizations }
     *     
     */
    public void setWorkQueueList(ArrayOfRHINUserEntityUserOrganizations value) {
        this.workQueueList = value;
    }

}
