//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identification of the Cargo and the nomiclature
 * 				used
 * 			
 * 
 * <p>Java class for CargoCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CargoCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://taf-jsg.info/schemes>FreeText">
 *       &lt;attribute name="CargoCodingType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;length value="3"/>
 *             &lt;enumeration value="NHM"/>
 *             &lt;enumeration value="CN"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargoCodeType", propOrder = {
    "value"
})
public class CargoCodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "CargoCodingType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cargoCodingType;

    /**
     * Clear Text in ISO Unicode character set
     * 			
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the cargoCodingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoCodingType() {
        return cargoCodingType;
    }

    /**
     * Sets the value of the cargoCodingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoCodingType(String value) {
        this.cargoCodingType = value;
    }

}