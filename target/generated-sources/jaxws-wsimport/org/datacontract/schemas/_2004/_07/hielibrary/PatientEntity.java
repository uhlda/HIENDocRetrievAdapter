
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PatientEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatientEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="_x003C_Address1_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_Address2_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_City_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_DateOfBirth_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="_x003C_FirstName_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_Gender_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_IsOptOut_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="_x003C_LastName_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_MaritalStatus_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_MiddleName_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_PostalCode_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_PrimaryRMPINumber_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_PrimaryTelephoneNumber_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_RMPINumber_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_RaceCode_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_SSN_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_StateCode_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatientEntity", propOrder = {
    "x003CAddress1X003EKBackingField",
    "x003CAddress2X003EKBackingField",
    "x003CCityX003EKBackingField",
    "x003CDateOfBirthX003EKBackingField",
    "x003CFirstNameX003EKBackingField",
    "x003CGenderX003EKBackingField",
    "x003CIsOptOutX003EKBackingField",
    "x003CLastNameX003EKBackingField",
    "x003CMaritalStatusX003EKBackingField",
    "x003CMiddleNameX003EKBackingField",
    "x003CPostalCodeX003EKBackingField",
    "x003CPrimaryRMPINumberX003EKBackingField",
    "x003CPrimaryTelephoneNumberX003EKBackingField",
    "x003CRMPINumberX003EKBackingField",
    "x003CRaceCodeX003EKBackingField",
    "x003CSSNX003EKBackingField",
    "x003CStateCodeX003EKBackingField"
})
public class PatientEntity
    extends Entity
{

    @XmlElement(name = "_x003C_Address1_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CAddress1X003EKBackingField;
    @XmlElement(name = "_x003C_Address2_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CAddress2X003EKBackingField;
    @XmlElement(name = "_x003C_City_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CCityX003EKBackingField;
    @XmlElement(name = "_x003C_DateOfBirth_x003E_k__BackingField", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar x003CDateOfBirthX003EKBackingField;
    @XmlElement(name = "_x003C_FirstName_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CFirstNameX003EKBackingField;
    @XmlElement(name = "_x003C_Gender_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CGenderX003EKBackingField;
    @XmlElement(name = "_x003C_IsOptOut_x003E_k__BackingField")
    protected boolean x003CIsOptOutX003EKBackingField;
    @XmlElement(name = "_x003C_LastName_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CLastNameX003EKBackingField;
    @XmlElement(name = "_x003C_MaritalStatus_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CMaritalStatusX003EKBackingField;
    @XmlElement(name = "_x003C_MiddleName_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CMiddleNameX003EKBackingField;
    @XmlElement(name = "_x003C_PostalCode_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CPostalCodeX003EKBackingField;
    @XmlElement(name = "_x003C_PrimaryRMPINumber_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CPrimaryRMPINumberX003EKBackingField;
    @XmlElement(name = "_x003C_PrimaryTelephoneNumber_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CPrimaryTelephoneNumberX003EKBackingField;
    @XmlElement(name = "_x003C_RMPINumber_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CRMPINumberX003EKBackingField;
    @XmlElement(name = "_x003C_RaceCode_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CRaceCodeX003EKBackingField;
    @XmlElement(name = "_x003C_SSN_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CSSNX003EKBackingField;
    @XmlElement(name = "_x003C_StateCode_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CStateCodeX003EKBackingField;

    /**
     * Gets the value of the x003CAddress1X003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CAddress1X003EKBackingField() {
        return x003CAddress1X003EKBackingField;
    }

    /**
     * Sets the value of the x003CAddress1X003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CAddress1X003EKBackingField(String value) {
        this.x003CAddress1X003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CAddress2X003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CAddress2X003EKBackingField() {
        return x003CAddress2X003EKBackingField;
    }

    /**
     * Sets the value of the x003CAddress2X003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CAddress2X003EKBackingField(String value) {
        this.x003CAddress2X003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CCityX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CCityX003EKBackingField() {
        return x003CCityX003EKBackingField;
    }

    /**
     * Sets the value of the x003CCityX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CCityX003EKBackingField(String value) {
        this.x003CCityX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CDateOfBirthX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getX003CDateOfBirthX003EKBackingField() {
        return x003CDateOfBirthX003EKBackingField;
    }

    /**
     * Sets the value of the x003CDateOfBirthX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setX003CDateOfBirthX003EKBackingField(XMLGregorianCalendar value) {
        this.x003CDateOfBirthX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CFirstNameX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CFirstNameX003EKBackingField() {
        return x003CFirstNameX003EKBackingField;
    }

    /**
     * Sets the value of the x003CFirstNameX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CFirstNameX003EKBackingField(String value) {
        this.x003CFirstNameX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CGenderX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CGenderX003EKBackingField() {
        return x003CGenderX003EKBackingField;
    }

    /**
     * Sets the value of the x003CGenderX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CGenderX003EKBackingField(String value) {
        this.x003CGenderX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CIsOptOutX003EKBackingField property.
     * 
     */
    public boolean isX003CIsOptOutX003EKBackingField() {
        return x003CIsOptOutX003EKBackingField;
    }

    /**
     * Sets the value of the x003CIsOptOutX003EKBackingField property.
     * 
     */
    public void setX003CIsOptOutX003EKBackingField(boolean value) {
        this.x003CIsOptOutX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CLastNameX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CLastNameX003EKBackingField() {
        return x003CLastNameX003EKBackingField;
    }

    /**
     * Sets the value of the x003CLastNameX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CLastNameX003EKBackingField(String value) {
        this.x003CLastNameX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CMaritalStatusX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CMaritalStatusX003EKBackingField() {
        return x003CMaritalStatusX003EKBackingField;
    }

    /**
     * Sets the value of the x003CMaritalStatusX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CMaritalStatusX003EKBackingField(String value) {
        this.x003CMaritalStatusX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CMiddleNameX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CMiddleNameX003EKBackingField() {
        return x003CMiddleNameX003EKBackingField;
    }

    /**
     * Sets the value of the x003CMiddleNameX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CMiddleNameX003EKBackingField(String value) {
        this.x003CMiddleNameX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CPostalCodeX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CPostalCodeX003EKBackingField() {
        return x003CPostalCodeX003EKBackingField;
    }

    /**
     * Sets the value of the x003CPostalCodeX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CPostalCodeX003EKBackingField(String value) {
        this.x003CPostalCodeX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CPrimaryRMPINumberX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CPrimaryRMPINumberX003EKBackingField() {
        return x003CPrimaryRMPINumberX003EKBackingField;
    }

    /**
     * Sets the value of the x003CPrimaryRMPINumberX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CPrimaryRMPINumberX003EKBackingField(String value) {
        this.x003CPrimaryRMPINumberX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CPrimaryTelephoneNumberX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CPrimaryTelephoneNumberX003EKBackingField() {
        return x003CPrimaryTelephoneNumberX003EKBackingField;
    }

    /**
     * Sets the value of the x003CPrimaryTelephoneNumberX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CPrimaryTelephoneNumberX003EKBackingField(String value) {
        this.x003CPrimaryTelephoneNumberX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CRMPINumberX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CRMPINumberX003EKBackingField() {
        return x003CRMPINumberX003EKBackingField;
    }

    /**
     * Sets the value of the x003CRMPINumberX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CRMPINumberX003EKBackingField(String value) {
        this.x003CRMPINumberX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CRaceCodeX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CRaceCodeX003EKBackingField() {
        return x003CRaceCodeX003EKBackingField;
    }

    /**
     * Sets the value of the x003CRaceCodeX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CRaceCodeX003EKBackingField(String value) {
        this.x003CRaceCodeX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CSSNX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CSSNX003EKBackingField() {
        return x003CSSNX003EKBackingField;
    }

    /**
     * Sets the value of the x003CSSNX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CSSNX003EKBackingField(String value) {
        this.x003CSSNX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CStateCodeX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CStateCodeX003EKBackingField() {
        return x003CStateCodeX003EKBackingField;
    }

    /**
     * Sets the value of the x003CStateCodeX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CStateCodeX003EKBackingField(String value) {
        this.x003CStateCodeX003EKBackingField = value;
    }

}
