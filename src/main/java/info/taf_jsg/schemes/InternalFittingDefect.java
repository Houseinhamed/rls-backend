//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://taf-jsg.info/schemes}InternalFittingDefectCode"/>
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
    "internalFittingDefectCode",
    "freeTextField"
})
@XmlRootElement(name = "InternalFittingDefect")
public class InternalFittingDefect {

    @XmlElement(name = "InternalFittingDefectCode", required = true)
    protected BigInteger internalFittingDefectCode;
    @XmlElement(name = "FreeTextField", required = true)
    protected String freeTextField;

    /**
     * Gets the value of the internalFittingDefectCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInternalFittingDefectCode() {
        return internalFittingDefectCode;
    }

    /**
     * Sets the value of the internalFittingDefectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInternalFittingDefectCode(BigInteger value) {
        this.internalFittingDefectCode = value;
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
