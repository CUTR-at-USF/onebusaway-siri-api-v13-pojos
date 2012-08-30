//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.ifopt.acsb;

import uk.org.ifopt.ifopt.Extensions;
import uk.org.ifopt.ifopt.ValidityCondition;


public class AccessibilityLimitation {

    protected String limitationId;
    
    protected ValidityCondition validityCondition;
    
    protected Accessibility wheelchairAccess;
    
    protected Accessibility stepFreeAccess;
    
    protected Accessibility escalatorFreeAccess;
    
    protected Accessibility liftFreeAccess;
    
    protected Accessibility audibleSignalsAvailable;
    
    protected Accessibility visualSignsAvailable;
    
    protected Extensions extensions;

    /**
     * Gets the value of the limitationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitationId() {
        return limitationId;
    }

    /**
     * Sets the value of the limitationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitationId(String value) {
        this.limitationId = value;
    }

    /**
     * Gets the value of the validityCondition property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityCondition }
     *     
     */
    public ValidityCondition getValidityCondition() {
        return validityCondition;
    }

    /**
     * Sets the value of the validityCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityCondition }
     *     
     */
    public void setValidityCondition(ValidityCondition value) {
        this.validityCondition = value;
    }

    /**
     * Gets the value of the wheelchairAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Accessibility }
     *     
     */
    public Accessibility getWheelchairAccess() {
        return wheelchairAccess;
    }

    /**
     * Sets the value of the wheelchairAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accessibility }
     *     
     */
    public void setWheelchairAccess(Accessibility value) {
        this.wheelchairAccess = value;
    }

    /**
     * Gets the value of the stepFreeAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Accessibility }
     *     
     */
    public Accessibility getStepFreeAccess() {
        return stepFreeAccess;
    }

    /**
     * Sets the value of the stepFreeAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accessibility }
     *     
     */
    public void setStepFreeAccess(Accessibility value) {
        this.stepFreeAccess = value;
    }

    /**
     * Gets the value of the escalatorFreeAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Accessibility }
     *     
     */
    public Accessibility getEscalatorFreeAccess() {
        return escalatorFreeAccess;
    }

    /**
     * Sets the value of the escalatorFreeAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accessibility }
     *     
     */
    public void setEscalatorFreeAccess(Accessibility value) {
        this.escalatorFreeAccess = value;
    }

    /**
     * Gets the value of the liftFreeAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Accessibility }
     *     
     */
    public Accessibility getLiftFreeAccess() {
        return liftFreeAccess;
    }

    /**
     * Sets the value of the liftFreeAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accessibility }
     *     
     */
    public void setLiftFreeAccess(Accessibility value) {
        this.liftFreeAccess = value;
    }

    /**
     * Whether a Place has Audible signals for the viusally impaired.
     * 
     * @return
     *     possible object is
     *     {@link Accessibility }
     *     
     */
    public Accessibility getAudibleSignalsAvailable() {
        return audibleSignalsAvailable;
    }

    /**
     * Sets the value of the audibleSignalsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accessibility }
     *     
     */
    public void setAudibleSignalsAvailable(Accessibility value) {
        this.audibleSignalsAvailable = value;
    }

    /**
     * Whether a Place hasVisual signals for the hearing impaired.
     * 
     * @return
     *     possible object is
     *     {@link Accessibility }
     *     
     */
    public Accessibility getVisualSignsAvailable() {
        return visualSignsAvailable;
    }

    /**
     * Sets the value of the visualSignsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accessibility }
     *     
     */
    public void setVisualSignsAvailable(Accessibility value) {
        this.visualSignsAvailable = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}
