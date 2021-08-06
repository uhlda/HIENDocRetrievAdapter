
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RHINRepositoryEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RHINRepositoryEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="Participant" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}ParticipantEntity" minOccurs="0"/>
 *         &lt;element name="ReferringOrganization" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}OrganizationEntity" minOccurs="0"/>
 *         &lt;element name="RepositoryDetails" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}RepositoryEntity" minOccurs="0"/>
 *         &lt;element name="Session" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}RepositorySessionEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RHINRepositoryEntity", propOrder = {
    "participant",
    "referringOrganization",
    "repositoryDetails",
    "session"
})
public class RHINRepositoryEntity
    extends Entity
{

    @XmlElementRef(name = "Participant", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ParticipantEntity> participant;
    @XmlElementRef(name = "ReferringOrganization", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganizationEntity> referringOrganization;
    @XmlElementRef(name = "RepositoryDetails", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<RepositoryEntity> repositoryDetails;
    @XmlElementRef(name = "Session", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<RepositorySessionEntity> session;

    /**
     * Gets the value of the participant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParticipantEntity }{@code >}
     *     
     */
    public JAXBElement<ParticipantEntity> getParticipant() {
        return participant;
    }

    /**
     * Sets the value of the participant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParticipantEntity }{@code >}
     *     
     */
    public void setParticipant(JAXBElement<ParticipantEntity> value) {
        this.participant = value;
    }

    /**
     * Gets the value of the referringOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganizationEntity }{@code >}
     *     
     */
    public JAXBElement<OrganizationEntity> getReferringOrganization() {
        return referringOrganization;
    }

    /**
     * Sets the value of the referringOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganizationEntity }{@code >}
     *     
     */
    public void setReferringOrganization(JAXBElement<OrganizationEntity> value) {
        this.referringOrganization = value;
    }

    /**
     * Gets the value of the repositoryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RepositoryEntity }{@code >}
     *     
     */
    public JAXBElement<RepositoryEntity> getRepositoryDetails() {
        return repositoryDetails;
    }

    /**
     * Sets the value of the repositoryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RepositoryEntity }{@code >}
     *     
     */
    public void setRepositoryDetails(JAXBElement<RepositoryEntity> value) {
        this.repositoryDetails = value;
    }

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RepositorySessionEntity }{@code >}
     *     
     */
    public JAXBElement<RepositorySessionEntity> getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RepositorySessionEntity }{@code >}
     *     
     */
    public void setSession(JAXBElement<RepositorySessionEntity> value) {
        this.session = value;
    }

}
