
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserSessionEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserSessionEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="IsPasswordSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RHINUserID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SessionEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserSessionEntity", propOrder = {
    "isPasswordSet",
    "rhinUserID",
    "sessionEndDate",
    "sessionToken"
})
public class UserSessionEntity
    extends Entity
{

    @XmlElement(name = "IsPasswordSet")
    protected boolean isPasswordSet;
    @XmlElement(name = "RHINUserID")
    protected int rhinUserID;
    @XmlElement(name = "SessionEndDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sessionEndDate;
    @XmlElement(name = "SessionToken", required = true, nillable = true)
    protected String sessionToken;

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
     * Gets the value of the sessionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionEndDate() {
        return sessionEndDate;
    }

    /**
     * Sets the value of the sessionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionEndDate(XMLGregorianCalendar value) {
        this.sessionEndDate = value;
    }

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionToken(String value) {
        this.sessionToken = value;
    }

}
