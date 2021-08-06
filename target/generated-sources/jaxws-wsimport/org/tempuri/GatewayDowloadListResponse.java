
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.hielibrary.GenericEntity;


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
 *         &lt;element name="GatewayDowloadListResult" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}GenericEntity" minOccurs="0"/>
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
    "gatewayDowloadListResult"
})
@XmlRootElement(name = "GatewayDowloadListResponse")
public class GatewayDowloadListResponse {

    @XmlElementRef(name = "GatewayDowloadListResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<GenericEntity> gatewayDowloadListResult;

    /**
     * Gets the value of the gatewayDowloadListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GenericEntity }{@code >}
     *     
     */
    public JAXBElement<GenericEntity> getGatewayDowloadListResult() {
        return gatewayDowloadListResult;
    }

    /**
     * Sets the value of the gatewayDowloadListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GenericEntity }{@code >}
     *     
     */
    public void setGatewayDowloadListResult(JAXBElement<GenericEntity> value) {
        this.gatewayDowloadListResult = value;
    }

}
