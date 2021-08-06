
package org.datacontract.schemas._2004._07.hielibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRHINUserEntity.UserOrganizations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRHINUserEntity.UserOrganizations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RHINUserEntity.UserOrganizations" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}RHINUserEntity.UserOrganizations" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRHINUserEntity.UserOrganizations", propOrder = {
    "rhinUserEntityUserOrganizations"
})
public class ArrayOfRHINUserEntityUserOrganizations {

    @XmlElement(name = "RHINUserEntity.UserOrganizations")
    protected List<RHINUserEntityUserOrganizations> rhinUserEntityUserOrganizations;

    /**
     * Gets the value of the rhinUserEntityUserOrganizations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rhinUserEntityUserOrganizations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRHINUserEntityUserOrganizations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RHINUserEntityUserOrganizations }
     * 
     * 
     */
    public List<RHINUserEntityUserOrganizations> getRHINUserEntityUserOrganizations() {
        if (rhinUserEntityUserOrganizations == null) {
            rhinUserEntityUserOrganizations = new ArrayList<RHINUserEntityUserOrganizations>();
        }
        return this.rhinUserEntityUserOrganizations;
    }

}
