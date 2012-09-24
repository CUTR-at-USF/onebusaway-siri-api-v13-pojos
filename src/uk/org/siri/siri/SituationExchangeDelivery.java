//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;


public class SituationExchangeDelivery {

    protected Context ptSituationContext;    
    protected SituationExchangeDelivery.Situations situations;    
    protected Extensions extensions;    
    protected String version;

    /**
     * Gets the value of the ptSituationContext property.
     * 
     * @return
     *     possible object is
     *     {@link Context }
     *     
     */
    public Context getPtSituationContext() {
        return ptSituationContext;
    }

    /**
     * Sets the value of the ptSituationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context }
     *     
     */
    public void setPtSituationContext(Context value) {
        this.ptSituationContext = value;
    }

    /**
     * Gets the value of the situations property.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeDelivery.Situations }
     *     
     */
    public SituationExchangeDelivery.Situations getSituations() {
        return situations;
    }

    /**
     * Sets the value of the situations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeDelivery.Situations }
     *     
     */
    public void setSituations(SituationExchangeDelivery.Situations value) {
        this.situations = value;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.3";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public static class Situations {
        
        protected List<PtSituationElement> ptSituationElement;        
        //protected List<RoadSituationElement> roadSituationElement;

        /**
         * Gets the value of the ptSituationElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptSituationElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPtSituationElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PtSituationElement }
         * 
         * 
         */
        public List<PtSituationElement> getPtSituationElement() {
            if (ptSituationElement == null) {
                ptSituationElement = new ArrayList<PtSituationElement>();
            }
            return this.ptSituationElement;
        }        

    }

}
