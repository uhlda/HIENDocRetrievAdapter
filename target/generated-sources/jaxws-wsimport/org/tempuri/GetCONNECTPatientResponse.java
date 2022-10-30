
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.hielibrary.PatientRMPIEntity;


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
 *         &lt;element name="GetCONNECTPatientResult" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}PatientRMPIEntity" minOccurs="0"/>
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
    "getCONNECTPatientResult"
})
@XmlRootElement(name = "GetCONNECTPatientResponse")
public class GetCONNECTPatientResponse {

    @XmlElementRef(name = "GetCONNECTPatientResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PatientRMPIEntity> getCONNECTPatientResult;

    /**
     * Gets the value of the getCONNECTPatientResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PatientRMPIEntity }{@code >}
     *     
     */
    public JAXBElement<PatientRMPIEntity> getGetCONNECTPatientResult() {
        return getCONNECTPatientResult;
    }

    /**
     * Sets the value of the getCONNECTPatientResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PatientRMPIEntity }{@code >}
     *     
     */
    public void setGetCONNECTPatientResult(JAXBElement<PatientRMPIEntity> value) {
        this.getCONNECTPatientResult = value;
    }

}
