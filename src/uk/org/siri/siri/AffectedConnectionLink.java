//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
public class AffectedConnectionLink {

    
    protected List<ConnectionLinkRef> connectionLinkRef;
    
    protected NaturalLanguageString connectionName;
    
    protected Object allLines;
    
    protected List<LineRef> lineRef;
    
    protected StopPointRef connectingStopPointRef;
    
    protected NaturalLanguageString connectingStopPointName;
    
    protected ZoneRef connectingZoneRef;
    
    protected ConnectionDirectionEnumeration connectionDirection;
    
    protected List<AffectedPathLink> affectedPathLink;
    
    protected Extensions extensions;

    /**
     * Gets the value of the connectionLinkRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLinkRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLinkRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionLinkRef }
     * 
     * 
     */
    public List<ConnectionLinkRef> getConnectionLinkRef() {
        if (connectionLinkRef == null) {
            connectionLinkRef = new ArrayList<ConnectionLinkRef>();
        }
        return this.connectionLinkRef;
    }

    /**
     * Gets the value of the connectionName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getConnectionName() {
        return connectionName;
    }

    /**
     * Sets the value of the connectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public void setConnectionName(NaturalLanguageString value) {
        this.connectionName = value;
    }

    /**
     * Gets the value of the allLines property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAllLines() {
        return allLines;
    }

    /**
     * Sets the value of the allLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAllLines(Object value) {
        this.allLines = value;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineRef }
     * 
     * 
     */
    public List<LineRef> getLineRef() {
        if (lineRef == null) {
            lineRef = new ArrayList<LineRef>();
        }
        return this.lineRef;
    }

    /**
     * Gets the value of the connectingStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRef }
     *     
     */
    public StopPointRef getConnectingStopPointRef() {
        return connectingStopPointRef;
    }

    /**
     * Sets the value of the connectingStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRef }
     *     
     */
    public void setConnectingStopPointRef(StopPointRef value) {
        this.connectingStopPointRef = value;
    }

    /**
     * Gets the value of the connectingStopPointName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getConnectingStopPointName() {
        return connectingStopPointName;
    }

    /**
     * Sets the value of the connectingStopPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public void setConnectingStopPointName(NaturalLanguageString value) {
        this.connectingStopPointName = value;
    }

    /**
     * Gets the value of the connectingZoneRef property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRef }
     *     
     */
    public ZoneRef getConnectingZoneRef() {
        return connectingZoneRef;
    }

    /**
     * Sets the value of the connectingZoneRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRef }
     *     
     */
    public void setConnectingZoneRef(ZoneRef value) {
        this.connectingZoneRef = value;
    }

    /**
     * Gets the value of the connectionDirection property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDirectionEnumeration }
     *     
     */
    public ConnectionDirectionEnumeration getConnectionDirection() {
        return connectionDirection;
    }

    /**
     * Sets the value of the connectionDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDirectionEnumeration }
     *     
     */
    public void setConnectionDirection(ConnectionDirectionEnumeration value) {
        this.connectionDirection = value;
    }

    /**
     * Gets the value of the affectedPathLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedPathLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedPathLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedPathLink }
     * 
     * 
     */
    public List<AffectedPathLink> getAffectedPathLink() {
        if (affectedPathLink == null) {
            affectedPathLink = new ArrayList<AffectedPathLink>();
        }
        return this.affectedPathLink;
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
