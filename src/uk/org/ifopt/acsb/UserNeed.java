//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.ifopt.acsb;

import java.math.BigInteger;
public class UserNeed {

    
    protected MobilityEnumeration mobilityNeed;
    
    protected PyschosensoryNeedEnumeration psychosensoryNeed;
    
    protected MedicalNeedEnumeration medicalNeed;
    
    protected EncumbranceEnumeration encumbranceNeed;
    
    protected Boolean excluded;
    
    protected BigInteger needRanking;
    
    protected Object extensions;

    /**
     * Gets the value of the mobilityNeed property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityEnumeration }
     *     
     */
    public MobilityEnumeration getMobilityNeed() {
        return mobilityNeed;
    }

    /**
     * Sets the value of the mobilityNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityEnumeration }
     *     
     */
    public void setMobilityNeed(MobilityEnumeration value) {
        this.mobilityNeed = value;
    }

    /**
     * Gets the value of the psychosensoryNeed property.
     * 
     * @return
     *     possible object is
     *     {@link PyschosensoryNeedEnumeration }
     *     
     */
    public PyschosensoryNeedEnumeration getPsychosensoryNeed() {
        return psychosensoryNeed;
    }

    /**
     * Sets the value of the psychosensoryNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PyschosensoryNeedEnumeration }
     *     
     */
    public void setPsychosensoryNeed(PyschosensoryNeedEnumeration value) {
        this.psychosensoryNeed = value;
    }

    /**
     * Gets the value of the medicalNeed property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalNeedEnumeration }
     *     
     */
    public MedicalNeedEnumeration getMedicalNeed() {
        return medicalNeed;
    }

    /**
     * Sets the value of the medicalNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalNeedEnumeration }
     *     
     */
    public void setMedicalNeed(MedicalNeedEnumeration value) {
        this.medicalNeed = value;
    }

    /**
     * Gets the value of the encumbranceNeed property.
     * 
     * @return
     *     possible object is
     *     {@link EncumbranceEnumeration }
     *     
     */
    public EncumbranceEnumeration getEncumbranceNeed() {
        return encumbranceNeed;
    }

    /**
     * Sets the value of the encumbranceNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncumbranceEnumeration }
     *     
     */
    public void setEncumbranceNeed(EncumbranceEnumeration value) {
        this.encumbranceNeed = value;
    }

    /**
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcluded(Boolean value) {
        this.excluded = value;
    }

    /**
     * Gets the value of the needRanking property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNeedRanking() {
        return needRanking;
    }

    /**
     * Sets the value of the needRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNeedRanking(BigInteger value) {
        this.needRanking = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtensions(Object value) {
        this.extensions = value;
    }

}
