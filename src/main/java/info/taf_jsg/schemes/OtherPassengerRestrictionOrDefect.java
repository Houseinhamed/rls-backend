//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://taf-jsg.info/schemes}RestrictionOrDefectCode"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}RestrictionOrDefectValue"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}FreeTextField"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "restrictionOrDefectCode",
    "restrictionOrDefectValue",
    "freeTextField"
})
@XmlRootElement(name = "OtherPassengerRestrictionOrDefect")
public class OtherPassengerRestrictionOrDefect {

    @XmlElement(name = "RestrictionOrDefectCode", required = true)
    protected Object restrictionOrDefectCode;
    @XmlElement(name = "RestrictionOrDefectValue", required = true)
    protected String restrictionOrDefectValue;
    @XmlElement(name = "FreeTextField", required = true)
    protected String freeTextField;

    /**
     * Gets the value of the restrictionOrDefectCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRestrictionOrDefectCode() {
        return restrictionOrDefectCode;
    }

    /**
     * Sets the value of the restrictionOrDefectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRestrictionOrDefectCode(Object value) {
        this.restrictionOrDefectCode = value;
    }

    /**
     * Gets the value of the restrictionOrDefectValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionOrDefectValue() {
        return restrictionOrDefectValue;
    }

    /**
     * Sets the value of the restrictionOrDefectValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionOrDefectValue(String value) {
        this.restrictionOrDefectValue = value;
    }

    /**
     * Gets the value of the freeTextField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeTextField() {
        return freeTextField;
    }

    /**
     * Sets the value of the freeTextField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeTextField(String value) {
        this.freeTextField = value;
    }

}