
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.hielibrary.RHINUserEntity;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticateUserResult" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}RHINUserEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authenticateUserResult"
})
@XmlRootElement(name = "AuthenticateUserResponse")
public class AuthenticateUserResponse {

    @XmlElementRef(name = "AuthenticateUserResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RHINUserEntity> authenticateUserResult;

    /**
     * Gets the value of the authenticateUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RHINUserEntity }{@code >}
     *     
     */
    public JAXBElement<RHINUserEntity> getAuthenticateUserResult() {
        return authenticateUserResult;
    }

    /**
     * Sets the value of the authenticateUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RHINUserEntity }{@code >}
     *     
     */
    public void setAuthenticateUserResult(JAXBElement<RHINUserEntity> value) {
        this.authenticateUserResult = value;
    }

}
