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
 *         &lt;element ref="{http://taf-jsg.info/schemes}ResponsibleRU"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}ResponsibleIM"/>
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
    "responsibleRU",
    "responsibleIM"
})
@XmlRootElement(name = "ResponsibilityActualSection")
public class ResponsibilityActualSection {

    @XmlElement(name = "ResponsibleRU")
    protected int responsibleRU;
    @XmlElement(name = "ResponsibleIM")
    protected int responsibleIM;

    /**
     * Gets the value of the responsibleRU property.
     * 
     */
    public int getResponsibleRU() {
        return responsibleRU;
    }

    /**
     * Sets the value of the responsibleRU property.
     * 
     */
    public void setResponsibleRU(int value) {
        this.responsibleRU = value;
    }

    /**
     * Gets the value of the responsibleIM property.
     * 
     */
    public int getResponsibleIM() {
        return responsibleIM;
    }

    /**
     * Sets the value of the responsibleIM property.
     * 
     */
    public void setResponsibleIM(int value) {
        this.responsibleIM = value;
    }

}
