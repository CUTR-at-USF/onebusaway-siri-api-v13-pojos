//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

import java.math.BigInteger;
public class Casualties {

    protected BigInteger numberOfDeaths;
    
    protected BigInteger numberOfInjured;

    /**
     * Gets the value of the numberOfDeaths property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDeaths() {
        return numberOfDeaths;
    }

    /**
     * Sets the value of the numberOfDeaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDeaths(BigInteger value) {
        this.numberOfDeaths = value;
    }

    /**
     * Gets the value of the numberOfInjured property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInjured() {
        return numberOfInjured;
    }

    /**
     * Sets the value of the numberOfInjured property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInjured(BigInteger value) {
        this.numberOfInjured = value;
    }

}
