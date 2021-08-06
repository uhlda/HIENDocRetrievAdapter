
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.hielibrary.RHINFilesEntity;


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
 *         &lt;element name="GatewayDownloadRHINFileResult" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}RHINFilesEntity" minOccurs="0"/>
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
    "gatewayDownloadRHINFileResult"
})
@XmlRootElement(name = "GatewayDownloadRHINFileResponse")
public class GatewayDownloadRHINFileResponse {

    @XmlElementRef(name = "GatewayDownloadRHINFileResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RHINFilesEntity> gatewayDownloadRHINFileResult;

    /**
     * Gets the value of the gatewayDownloadRHINFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RHINFilesEntity }{@code >}
     *     
     */
    public JAXBElement<RHINFilesEntity> getGatewayDownloadRHINFileResult() {
        return gatewayDownloadRHINFileResult;
    }

    /**
     * Sets the value of the gatewayDownloadRHINFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RHINFilesEntity }{@code >}
     *     
     */
    public void setGatewayDownloadRHINFileResult(JAXBElement<RHINFilesEntity> value) {
        this.gatewayDownloadRHINFileResult = value;
    }

}
