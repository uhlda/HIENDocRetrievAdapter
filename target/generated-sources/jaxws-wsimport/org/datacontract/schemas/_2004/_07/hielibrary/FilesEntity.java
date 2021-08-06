
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilesEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilesEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="Files" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}ArrayOfFileEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilesEntity", propOrder = {
    "files"
})
public class FilesEntity
    extends Entity
{

    @XmlElementRef(name = "Files", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFileEntity> files;

    /**
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFileEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFileEntity> getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFileEntity }{@code >}
     *     
     */
    public void setFiles(JAXBElement<ArrayOfFileEntity> value) {
        this.files = value;
    }

}
