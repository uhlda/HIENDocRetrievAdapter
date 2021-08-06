
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClinicalDocumentEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClinicalDocumentEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="_x003C_Confidentiality_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_CreateDateTime_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="_x003C_DocumentFormat_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_DocumentType_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_HealthcareFacilityType_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_PatientID_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_ProviderName_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_ProviderOrganization_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_ProviderType_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_RepositoryID_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_ServiceStartTime_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="_x003C_ServiceStopTime_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="_x003C_UniqueID_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClinicalDocumentEntity", propOrder = {
    "x003CConfidentialityX003EKBackingField",
    "x003CCreateDateTimeX003EKBackingField",
    "x003CDocumentFormatX003EKBackingField",
    "x003CDocumentTypeX003EKBackingField",
    "x003CHealthcareFacilityTypeX003EKBackingField",
    "x003CPatientIDX003EKBackingField",
    "x003CProviderNameX003EKBackingField",
    "x003CProviderOrganizationX003EKBackingField",
    "x003CProviderTypeX003EKBackingField",
    "x003CRepositoryIDX003EKBackingField",
    "x003CServiceStartTimeX003EKBackingField",
    "x003CServiceStopTimeX003EKBackingField",
    "x003CUniqueIDX003EKBackingField"
})
public class ClinicalDocumentEntity
    extends Entity
{

    @XmlElement(name = "_x003C_Confidentiality_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CConfidentialityX003EKBackingField;
    @XmlElement(name = "_x003C_CreateDateTime_x003E_k__BackingField", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar x003CCreateDateTimeX003EKBackingField;
    @XmlElement(name = "_x003C_DocumentFormat_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CDocumentFormatX003EKBackingField;
    @XmlElement(name = "_x003C_DocumentType_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CDocumentTypeX003EKBackingField;
    @XmlElement(name = "_x003C_HealthcareFacilityType_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CHealthcareFacilityTypeX003EKBackingField;
    @XmlElement(name = "_x003C_PatientID_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CPatientIDX003EKBackingField;
    @XmlElement(name = "_x003C_ProviderName_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CProviderNameX003EKBackingField;
    @XmlElement(name = "_x003C_ProviderOrganization_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CProviderOrganizationX003EKBackingField;
    @XmlElement(name = "_x003C_ProviderType_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CProviderTypeX003EKBackingField;
    @XmlElement(name = "_x003C_RepositoryID_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CRepositoryIDX003EKBackingField;
    @XmlElement(name = "_x003C_ServiceStartTime_x003E_k__BackingField", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar x003CServiceStartTimeX003EKBackingField;
    @XmlElement(name = "_x003C_ServiceStopTime_x003E_k__BackingField", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar x003CServiceStopTimeX003EKBackingField;
    @XmlElement(name = "_x003C_UniqueID_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CUniqueIDX003EKBackingField;

    /**
     * Gets the value of the x003CConfidentialityX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CConfidentialityX003EKBackingField() {
        return x003CConfidentialityX003EKBackingField;
    }

    /**
     * Sets the value of the x003CConfidentialityX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CConfidentialityX003EKBackingField(String value) {
        this.x003CConfidentialityX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CCreateDateTimeX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getX003CCreateDateTimeX003EKBackingField() {
        return x003CCreateDateTimeX003EKBackingField;
    }

    /**
     * Sets the value of the x003CCreateDateTimeX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setX003CCreateDateTimeX003EKBackingField(XMLGregorianCalendar value) {
        this.x003CCreateDateTimeX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CDocumentFormatX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CDocumentFormatX003EKBackingField() {
        return x003CDocumentFormatX003EKBackingField;
    }

    /**
     * Sets the value of the x003CDocumentFormatX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CDocumentFormatX003EKBackingField(String value) {
        this.x003CDocumentFormatX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CDocumentTypeX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CDocumentTypeX003EKBackingField() {
        return x003CDocumentTypeX003EKBackingField;
    }

    /**
     * Sets the value of the x003CDocumentTypeX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CDocumentTypeX003EKBackingField(String value) {
        this.x003CDocumentTypeX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CHealthcareFacilityTypeX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CHealthcareFacilityTypeX003EKBackingField() {
        return x003CHealthcareFacilityTypeX003EKBackingField;
    }

    /**
     * Sets the value of the x003CHealthcareFacilityTypeX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CHealthcareFacilityTypeX003EKBackingField(String value) {
        this.x003CHealthcareFacilityTypeX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CPatientIDX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CPatientIDX003EKBackingField() {
        return x003CPatientIDX003EKBackingField;
    }

    /**
     * Sets the value of the x003CPatientIDX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CPatientIDX003EKBackingField(String value) {
        this.x003CPatientIDX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CProviderNameX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CProviderNameX003EKBackingField() {
        return x003CProviderNameX003EKBackingField;
    }

    /**
     * Sets the value of the x003CProviderNameX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CProviderNameX003EKBackingField(String value) {
        this.x003CProviderNameX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CProviderOrganizationX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CProviderOrganizationX003EKBackingField() {
        return x003CProviderOrganizationX003EKBackingField;
    }

    /**
     * Sets the value of the x003CProviderOrganizationX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CProviderOrganizationX003EKBackingField(String value) {
        this.x003CProviderOrganizationX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CProviderTypeX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CProviderTypeX003EKBackingField() {
        return x003CProviderTypeX003EKBackingField;
    }

    /**
     * Sets the value of the x003CProviderTypeX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CProviderTypeX003EKBackingField(String value) {
        this.x003CProviderTypeX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CRepositoryIDX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CRepositoryIDX003EKBackingField() {
        return x003CRepositoryIDX003EKBackingField;
    }

    /**
     * Sets the value of the x003CRepositoryIDX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CRepositoryIDX003EKBackingField(String value) {
        this.x003CRepositoryIDX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CServiceStartTimeX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getX003CServiceStartTimeX003EKBackingField() {
        return x003CServiceStartTimeX003EKBackingField;
    }

    /**
     * Sets the value of the x003CServiceStartTimeX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setX003CServiceStartTimeX003EKBackingField(XMLGregorianCalendar value) {
        this.x003CServiceStartTimeX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CServiceStopTimeX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getX003CServiceStopTimeX003EKBackingField() {
        return x003CServiceStopTimeX003EKBackingField;
    }

    /**
     * Sets the value of the x003CServiceStopTimeX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setX003CServiceStopTimeX003EKBackingField(XMLGregorianCalendar value) {
        this.x003CServiceStopTimeX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CUniqueIDX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CUniqueIDX003EKBackingField() {
        return x003CUniqueIDX003EKBackingField;
    }

    /**
     * Sets the value of the x003CUniqueIDX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CUniqueIDX003EKBackingField(String value) {
        this.x003CUniqueIDX003EKBackingField = value;
    }

}
