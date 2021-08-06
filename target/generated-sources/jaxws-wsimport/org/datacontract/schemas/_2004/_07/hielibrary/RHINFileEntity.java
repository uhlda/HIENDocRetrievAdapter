
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RHINFileEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RHINFileEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="Document" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}DocumentEntity" minOccurs="0"/>
 *         &lt;element name="File" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}FileEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RHINFileEntity", propOrder = {
    "document",
    "file"
})
public class RHINFileEntity
    extends Entity
{

    @XmlElementRef(name = "Document", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentEntity> document;
    @XmlElementRef(name = "File", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<FileEntity> file;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentEntity }{@code >}
     *     
     */
    public JAXBElement<DocumentEntity> getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentEntity }{@code >}
     *     
     */
    public void setDocument(JAXBElement<DocumentEntity> value) {
        this.document = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileEntity }{@code >}
     *     
     */
    public JAXBElement<FileEntity> getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileEntity }{@code >}
     *     
     */
    public void setFile(JAXBElement<FileEntity> value) {
        this.file = value;
    }

}
