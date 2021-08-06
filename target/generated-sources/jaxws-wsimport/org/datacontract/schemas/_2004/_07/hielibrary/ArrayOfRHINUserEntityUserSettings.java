
package org.datacontract.schemas._2004._07.hielibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRHINUserEntity.UserSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRHINUserEntity.UserSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RHINUserEntity.UserSettings" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}RHINUserEntity.UserSettings" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRHINUserEntity.UserSettings", propOrder = {
    "rhinUserEntityUserSettings"
})
public class ArrayOfRHINUserEntityUserSettings {

    @XmlElement(name = "RHINUserEntity.UserSettings")
    protected List<RHINUserEntityUserSettings> rhinUserEntityUserSettings;

    /**
     * Gets the value of the rhinUserEntityUserSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rhinUserEntityUserSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRHINUserEntityUserSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RHINUserEntityUserSettings }
     * 
     * 
     */
    public List<RHINUserEntityUserSettings> getRHINUserEntityUserSettings() {
        if (rhinUserEntityUserSettings == null) {
            rhinUserEntityUserSettings = new ArrayList<RHINUserEntityUserSettings>();
        }
        return this.rhinUserEntityUserSettings;
    }

}
