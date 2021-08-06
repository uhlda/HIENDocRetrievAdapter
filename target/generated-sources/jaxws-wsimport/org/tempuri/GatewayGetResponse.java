
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.hielibrary.RHINRepositoryEntity;


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
 *         &lt;element name="GatewayGetResult" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}RHINRepositoryEntity" minOccurs="0"/>
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
    "gatewayGetResult"
})
@XmlRootElement(name = "GatewayGetResponse")
public class GatewayGetResponse {

    @XmlElementRef(name = "GatewayGetResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RHINRepositoryEntity> gatewayGetResult;

    /**
     * Gets the value of the gatewayGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RHINRepositoryEntity }{@code >}
     *     
     */
    public JAXBElement<RHINRepositoryEntity> getGatewayGetResult() {
        return gatewayGetResult;
    }

    /**
     * Sets the value of the gatewayGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RHINRepositoryEntity }{@code >}
     *     
     */
    public void setGatewayGetResult(JAXBElement<RHINRepositoryEntity> value) {
        this.gatewayGetResult = value;
    }

}
