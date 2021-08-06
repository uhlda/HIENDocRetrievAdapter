
package org.datacontract.schemas._2004._07.hielibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRHINUserEntity.UserPermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRHINUserEntity.UserPermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RHINUserEntity.UserPermissions" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}RHINUserEntity.UserPermissions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRHINUserEntity.UserPermissions", propOrder = {
    "rhinUserEntityUserPermissions"
})
public class ArrayOfRHINUserEntityUserPermissions {

    @XmlElement(name = "RHINUserEntity.UserPermissions")
    protected List<RHINUserEntityUserPermissions> rhinUserEntityUserPermissions;

    /**
     * Gets the value of the rhinUserEntityUserPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rhinUserEntityUserPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRHINUserEntityUserPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RHINUserEntityUserPermissions }
     * 
     * 
     */
    public List<RHINUserEntityUserPermissions> getRHINUserEntityUserPermissions() {
        if (rhinUserEntityUserPermissions == null) {
            rhinUserEntityUserPermissions = new ArrayList<RHINUserEntityUserPermissions>();
        }
        return this.rhinUserEntityUserPermissions;
    }

}
