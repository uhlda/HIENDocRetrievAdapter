
package org.datacontract.schemas._2004._07.hielibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClinicalDocumentEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClinicalDocumentEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClinicalDocumentEntity" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}ClinicalDocumentEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClinicalDocumentEntity", propOrder = {
    "clinicalDocumentEntity"
})
public class ArrayOfClinicalDocumentEntity {

    @XmlElement(name = "ClinicalDocumentEntity", nillable = true)
    protected List<ClinicalDocumentEntity> clinicalDocumentEntity;

    /**
     * Gets the value of the clinicalDocumentEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clinicalDocumentEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClinicalDocumentEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClinicalDocumentEntity }
     * 
     * 
     */
    public List<ClinicalDocumentEntity> getClinicalDocumentEntity() {
        if (clinicalDocumentEntity == null) {
            clinicalDocumentEntity = new ArrayList<ClinicalDocumentEntity>();
        }
        return this.clinicalDocumentEntity;
    }

}
