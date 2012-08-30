//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
public class AffectedInterchange {

    
    protected InterchangeRef interchangeRef;
    
    protected StopPointRef interchangeStopPointRef;
    
    protected NaturalLanguageString interchangeStopPointName;
    
    protected DatedVehicleJourneyRef connectingVehicleJourneyRef;
    
    protected InterchangeStatusEnumeration interchangeStatusType;
    
    protected List<AffectedConnectionLink> connectionLink;
    
    protected Extensions extensions;

    /**
     * Gets the value of the interchangeRef property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRef }
     *     
     */
    public InterchangeRef getInterchangeRef() {
        return interchangeRef;
    }

    /**
     * Sets the value of the interchangeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRef }
     *     
     */
    public void setInterchangeRef(InterchangeRef value) {
        this.interchangeRef = value;
    }

    /**
     * Gets the value of the interchangeStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRef }
     *     
     */
    public StopPointRef getInterchangeStopPointRef() {
        return interchangeStopPointRef;
    }

    /**
     * Sets the value of the interchangeStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRef }
     *     
     */
    public void setInterchangeStopPointRef(StopPointRef value) {
        this.interchangeStopPointRef = value;
    }

    /**
     * Gets the value of the interchangeStopPointName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getInterchangeStopPointName() {
        return interchangeStopPointName;
    }

    /**
     * Sets the value of the interchangeStopPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public void setInterchangeStopPointName(NaturalLanguageString value) {
        this.interchangeStopPointName = value;
    }

    /**
     * Gets the value of the connectingVehicleJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link DatedVehicleJourneyRef }
     *     
     */
    public DatedVehicleJourneyRef getConnectingVehicleJourneyRef() {
        return connectingVehicleJourneyRef;
    }

    /**
     * Sets the value of the connectingVehicleJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedVehicleJourneyRef }
     *     
     */
    public void setConnectingVehicleJourneyRef(DatedVehicleJourneyRef value) {
        this.connectingVehicleJourneyRef = value;
    }

    /**
     * Gets the value of the interchangeStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeStatusEnumeration }
     *     
     */
    public InterchangeStatusEnumeration getInterchangeStatusType() {
        return interchangeStatusType;
    }

    /**
     * Sets the value of the interchangeStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeStatusEnumeration }
     *     
     */
    public void setInterchangeStatusType(InterchangeStatusEnumeration value) {
        this.interchangeStatusType = value;
    }

    /**
     * Gets the value of the connectionLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedConnectionLink }
     * 
     * 
     */
    public List<AffectedConnectionLink> getConnectionLink() {
        if (connectionLink == null) {
            connectionLink = new ArrayList<AffectedConnectionLink>();
        }
        return this.connectionLink;
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
