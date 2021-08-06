
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RHINUserEntity.UserSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RHINUserEntity.UserSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsToggle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Setting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettingID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SettingValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RHINUserEntity.UserSettings", propOrder = {
    "isToggle",
    "setting",
    "settingID",
    "settingValue"
})
public class RHINUserEntityUserSettings {

    @XmlElement(name = "IsToggle")
    protected Boolean isToggle;
    @XmlElementRef(name = "Setting", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> setting;
    @XmlElement(name = "SettingID")
    protected Integer settingID;
    @XmlElementRef(name = "SettingValue", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> settingValue;

    /**
     * Gets the value of the isToggle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsToggle() {
        return isToggle;
    }

    /**
     * Sets the value of the isToggle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsToggle(Boolean value) {
        this.isToggle = value;
    }

    /**
     * Gets the value of the setting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSetting() {
        return setting;
    }

    /**
     * Sets the value of the setting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSetting(JAXBElement<String> value) {
        this.setting = value;
    }

    /**
     * Gets the value of the settingID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettingID() {
        return settingID;
    }

    /**
     * Sets the value of the settingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettingID(Integer value) {
        this.settingID = value;
    }

    /**
     * Gets the value of the settingValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSettingValue() {
        return settingValue;
    }

    /**
     * Sets the value of the settingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSettingValue(JAXBElement<String> value) {
        this.settingValue = value;
    }

}
