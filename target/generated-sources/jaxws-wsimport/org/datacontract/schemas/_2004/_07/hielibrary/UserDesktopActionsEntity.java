
package org.datacontract.schemas._2004._07.hielibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDesktopActionsEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDesktopActionsEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}Entity">
 *       &lt;sequence>
 *         &lt;element name="UserDesktopActionList" type="{http://schemas.datacontract.org/2004/07/HIELibrary.Entities}ArrayOfUserDesktopActionEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDesktopActionsEntity", propOrder = {
    "userDesktopActionList"
})
public class UserDesktopActionsEntity
    extends Entity
{

    @XmlElementRef(name = "UserDesktopActionList", namespace = "http://schemas.datacontract.org/2004/07/HIELibrary.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUserDesktopActionEntity> userDesktopActionList;

    /**
     * Gets the value of the userDesktopActionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserDesktopActionEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUserDesktopActionEntity> getUserDesktopActionList() {
        return userDesktopActionList;
    }

    /**
     * Sets the value of the userDesktopActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserDesktopActionEntity }{@code >}
     *     
     */
    public void setUserDesktopActionList(JAXBElement<ArrayOfUserDesktopActionEntity> value) {
        this.userDesktopActionList = value;
    }

}
