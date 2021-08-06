
package org.datacontract.schemas._2004._07.hielibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUserDesktopActionEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUserDesktopActionEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserDesktopActionEntity" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}UserDesktopActionEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserDesktopActionEntity", propOrder = {
    "userDesktopActionEntity"
})
public class ArrayOfUserDesktopActionEntity {

    @XmlElement(name = "UserDesktopActionEntity", nillable = true)
    protected List<UserDesktopActionEntity> userDesktopActionEntity;

    /**
     * Gets the value of the userDesktopActionEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDesktopActionEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDesktopActionEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDesktopActionEntity }
     * 
     * 
     */
    public List<UserDesktopActionEntity> getUserDesktopActionEntity() {
        if (userDesktopActionEntity == null) {
            userDesktopActionEntity = new ArrayList<UserDesktopActionEntity>();
        }
        return this.userDesktopActionEntity;
    }

}
