//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import uk.org.ifopt.acsb.AccessibilityAssessment;


public class AffectedVehicleJourney {


    protected List<String> vehicleJourneyRef;

    protected List<DatedVehicleJourneyRef> datedVehicleJourneyRef;

    protected NaturalLanguageString journeyName;

    protected AffectedOperator operator;

    protected String lineRef;

    protected NaturalLanguageString publishedLineName;

    protected String directionRef;

    protected List<AffectedStopPoint> origins;

    protected List<AffectedStopPoint> destinations;

    protected List<AffectedRoute> route;
    protected Date originAimedDepartureTime;
    protected Date destinationAimedArrivalTime;

    protected AccessibilityAssessment accessibilityAssessment;

    protected AffectedVehicleJourney.Calls calls;

    protected Extensions extensions;

    /**
     * Gets the value of the vehicleJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleJourneyRef }
     * 
     * 
     */
    public List<String> getVehicleJourneyRef() {
        if (vehicleJourneyRef == null) {
            vehicleJourneyRef = new ArrayList<String>();
        }
        return this.vehicleJourneyRef;
    }

    /**
     * Gets the value of the datedVehicleJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datedVehicleJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatedVehicleJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatedVehicleJourneyRef }
     * 
     * 
     */
    public List<DatedVehicleJourneyRef> getDatedVehicleJourneyRef() {
        if (datedVehicleJourneyRef == null) {
            datedVehicleJourneyRef = new ArrayList<DatedVehicleJourneyRef>();
        }
        return this.datedVehicleJourneyRef;
    }

    /**
     * Gets the value of the journeyName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getJourneyName() {
        return journeyName;
    }

    /**
     * Sets the value of the journeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public void setJourneyName(NaturalLanguageString value) {
        this.journeyName = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedOperator }
     *     
     */
    public AffectedOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedOperator }
     *     
     */
    public void setOperator(AffectedOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRef }
     *     
     */
    public String getLineRef() {
        return lineRef;
    }

    /**
     * Sets the value of the lineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRef }
     *     
     */
    public void setLineRef(String value) {
        this.lineRef = value;
    }

    /**
     * Gets the value of the publishedLineName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getPublishedLineName() {
        return publishedLineName;
    }

    /**
     * Sets the value of the publishedLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public void setPublishedLineName(NaturalLanguageString value) {
        this.publishedLineName = value;
    }

    /**
     * Gets the value of the directionRef property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRef }
     *     
     */
    public String getDirectionRef() {
        return directionRef;
    }

    /**
     * Sets the value of the directionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRef }
     *     
     */
    public void setDirectionRef(String value) {
        this.directionRef = value;
    }

    /**
     * Gets the value of the origins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedStopPoint }
     * 
     * 
     */
    public List<AffectedStopPoint> getOrigins() {
        if (origins == null) {
            origins = new ArrayList<AffectedStopPoint>();
        }
        return this.origins;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedStopPoint }
     * 
     * 
     */
    public List<AffectedStopPoint> getDestinations() {
        if (destinations == null) {
            destinations = new ArrayList<AffectedStopPoint>();
        }
        return this.destinations;
    }

    /**
     * Gets the value of the route property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the route property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedRoute }
     * 
     * 
     */
    public List<AffectedRoute> getRoute() {
        if (route == null) {
            route = new ArrayList<AffectedRoute>();
        }
        return this.route;
    }

    /**
     * Gets the value of the originAimedDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getOriginAimedDepartureTime() {
        return originAimedDepartureTime;
    }

    /**
     * Sets the value of the originAimedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setOriginAimedDepartureTime(Date value) {
        this.originAimedDepartureTime = value;
    }

    /**
     * Gets the value of the destinationAimedArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDestinationAimedArrivalTime() {
        return destinationAimedArrivalTime;
    }

    /**
     * Sets the value of the destinationAimedArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDestinationAimedArrivalTime(Date value) {
        this.destinationAimedArrivalTime = value;
    }

    /**
     * Gets the value of the accessibilityAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public AccessibilityAssessment getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Sets the value of the accessibilityAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessment value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Gets the value of the calls property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedVehicleJourney.Calls }
     *     
     */
    public AffectedVehicleJourney.Calls getCalls() {
        return calls;
    }

    /**
     * Sets the value of the calls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedVehicleJourney.Calls }
     *     
     */
    public void setCalls(AffectedVehicleJourney.Calls value) {
        this.calls = value;
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


  
    public static class Calls {
  
        protected List<AffectedCall> call;

        /**
         * Gets the value of the call property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the call property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCall().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedCall }
         * 
         * 
         */
        public List<AffectedCall> getCall() {
            if (call == null) {
                call = new ArrayList<AffectedCall>();
            }
            return this.call;
        }

    }

}
