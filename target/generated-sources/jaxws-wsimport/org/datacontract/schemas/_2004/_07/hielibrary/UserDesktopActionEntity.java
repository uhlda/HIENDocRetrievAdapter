
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserDesktopActionEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDesktopActionEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DownloadPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LoadPageURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarkReferralDone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NotificationText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrganizationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReferralID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReferralOrganizationStatusID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReloadRHINUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UserDesktopActionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDesktopActionEntity", propOrder = {
    "createDateTime",
    "documentLink",
    "downloadPath",
    "loadPageURL",
    "markReferralDone",
    "notificationText",
    "organizationID",
    "referralID",
    "referralOrganizationStatusID",
    "reloadRHINUser",
    "userDesktopActionID"
})
public class UserDesktopActionEntity
    extends Entity
{

    @XmlElement(name = "CreateDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlElement(name = "DocumentLink", required = true, nillable = true)
    protected String documentLink;
    @XmlElement(name = "DownloadPath", required = true, nillable = true)
    protected String downloadPath;
    @XmlElement(name = "LoadPageURL", required = true, nillable = true)
    protected String loadPageURL;
    @XmlElement(name = "MarkReferralDone")
    protected boolean markReferralDone;
    @XmlElement(name = "NotificationText", required = true, nillable = true)
    protected String notificationText;
    @XmlElement(name = "OrganizationID")
    protected int organizationID;
    @XmlElement(name = "ReferralID")
    protected int referralID;
    @XmlElement(name = "ReferralOrganizationStatusID")
    protected int referralOrganizationStatusID;
    @XmlElement(name = "ReloadRHINUser")
    protected boolean reloadRHINUser;
    @XmlElement(name = "UserDesktopActionID")
    protected int userDesktopActionID;

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the documentLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentLink() {
        return documentLink;
    }

    /**
     * Sets the value of the documentLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentLink(String value) {
        this.documentLink = value;
    }

    /**
     * Gets the value of the downloadPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadPath() {
        return downloadPath;
    }

    /**
     * Sets the value of the downloadPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadPath(String value) {
        this.downloadPath = value;
    }

    /**
     * Gets the value of the loadPageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadPageURL() {
        return loadPageURL;
    }

    /**
     * Sets the value of the loadPageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadPageURL(String value) {
        this.loadPageURL = value;
    }

    /**
     * Gets the value of the markReferralDone property.
     * 
     */
    public boolean isMarkReferralDone() {
        return markReferralDone;
    }

    /**
     * Sets the value of the markReferralDone property.
     * 
     */
    public void setMarkReferralDone(boolean value) {
        this.markReferralDone = value;
    }

    /**
     * Gets the value of the notificationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationText() {
        return notificationText;
    }

    /**
     * Sets the value of the notificationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationText(String value) {
        this.notificationText = value;
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
     * Gets the value of the referralID property.
     * 
     */
    public int getReferralID() {
        return referralID;
    }

    /**
     * Sets the value of the referralID property.
     * 
     */
    public void setReferralID(int value) {
        this.referralID = value;
    }

    /**
     * Gets the value of the referralOrganizationStatusID property.
     * 
     */
    public int getReferralOrganizationStatusID() {
        return referralOrganizationStatusID;
    }

    /**
     * Sets the value of the referralOrganizationStatusID property.
     * 
     */
    public void setReferralOrganizationStatusID(int value) {
        this.referralOrganizationStatusID = value;
    }

    /**
     * Gets the value of the reloadRHINUser property.
     * 
     */
    public boolean isReloadRHINUser() {
        return reloadRHINUser;
    }

    /**
     * Sets the value of the reloadRHINUser property.
     * 
     */
    public void setReloadRHINUser(boolean value) {
        this.reloadRHINUser = value;
    }

    /**
     * Gets the value of the userDesktopActionID property.
     * 
     */
    public int getUserDesktopActionID() {
        return userDesktopActionID;
    }

    /**
     * Sets the value of the userDesktopActionID property.
     * 
     */
    public void setUserDesktopActionID(int value) {
        this.userDesktopActionID = value;
    }

}
