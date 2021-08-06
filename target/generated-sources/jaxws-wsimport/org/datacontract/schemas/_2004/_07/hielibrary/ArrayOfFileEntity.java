
package org.datacontract.schemas._2004._07.hielibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFileEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFileEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileEntity" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}FileEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFileEntity", propOrder = {
    "fileEntity"
})
public class ArrayOfFileEntity {

    @XmlElement(name = "FileEntity", nillable = true)
    protected List<FileEntity> fileEntity;

    /**
     * Gets the value of the fileEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileEntity }
     * 
     * 
     */
    public List<FileEntity> getFileEntity() {
        if (fileEntity == null) {
            fileEntity = new ArrayList<FileEntity>();
        }
        return this.fileEntity;
    }

}
