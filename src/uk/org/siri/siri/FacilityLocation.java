//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import uk.org.ifopt.ifopt.StopPlaceComponentRef;
import uk.org.ifopt.ifopt.StopPlaceRef;


public class FacilityLocation {


    protected LineRef lineRef;

    protected StopPointRef stopPointRef;

    protected String vehicleRef;

    protected DatedVehicleJourneyRef datedVehicleJourneyRef;

    protected ConnectionLinkRef connectionLinkRef;

    protected InterchangeRef interchangeRef;

    protected StopPlaceRef stopPlaceRef;

    protected StopPlaceComponentRef stopPlaceComponentId;

    protected OperatorRef operatorRef;

    protected String productCategoryRef;

    protected List<String> serviceFeatureRef;
    
    protected List<String> vehicleFeatureRef;

    /**
     * Gets the value of the lineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRef }
     *     
     */
    public LineRef getLineRef() {
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
    public void setLineRef(LineRef value) {
        this.lineRef = value;
    }

    /**
     * Gets the value of the stopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRef }
     *     
     */
    public StopPointRef getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Sets the value of the stopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRef }
     *     
     */
    public void setStopPointRef(StopPointRef value) {
        this.stopPointRef = value;
    }

    /**
     * Gets the value of the vehicleRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRef }
     *     
     */
    public String getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Sets the value of the vehicleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRef }
     *     
     */
    public void setVehicleRef(String value) {
        this.vehicleRef = value;
    }

    /**
     * Gets the value of the datedVehicleJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link DatedVehicleJourneyRef }
     *     
     */
    public DatedVehicleJourneyRef getDatedVehicleJourneyRef() {
        return datedVehicleJourneyRef;
    }

    /**
     * Sets the value of the datedVehicleJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedVehicleJourneyRef }
     *     
     */
    public void setDatedVehicleJourneyRef(DatedVehicleJourneyRef value) {
        this.datedVehicleJourneyRef = value;
    }

    /**
     * Gets the value of the connectionLinkRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinkRef }
     *     
     */
    public ConnectionLinkRef getConnectionLinkRef() {
        return connectionLinkRef;
    }

    /**
     * Sets the value of the connectionLinkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinkRef }
     *     
     */
    public void setConnectionLinkRef(ConnectionLinkRef value) {
        this.connectionLinkRef = value;
    }

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
     * Gets the value of the stopPlaceRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRef }
     *     
     */
    public StopPlaceRef getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Sets the value of the stopPlaceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRef }
     *     
     */
    public void setStopPlaceRef(StopPlaceRef value) {
        this.stopPlaceRef = value;
    }

    /**
     * Gets the value of the stopPlaceComponentId property.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceComponentRef }
     *     
     */
    public StopPlaceComponentRef getStopPlaceComponentId() {
        return stopPlaceComponentId;
    }

    /**
     * Sets the value of the stopPlaceComponentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceComponentRef }
     *     
     */
    public void setStopPlaceComponentId(StopPlaceComponentRef value) {
        this.stopPlaceComponentId = value;
    }

    /**
     * Gets the value of the operatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRef }
     *     
     */
    public OperatorRef getOperatorRef() {
        return operatorRef;
    }

    /**
     * Sets the value of the operatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRef }
     *     
     */
    public void setOperatorRef(OperatorRef value) {
        this.operatorRef = value;
    }

    /**
     * Gets the value of the productCategoryRef property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryRef }
     *     
     */
    public String getProductCategoryRef() {
        return productCategoryRef;
    }

    /**
     * Sets the value of the productCategoryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryRef }
     *     
     */
    public void setProductCategoryRef(String value) {
        this.productCategoryRef = value;
    }

    /**
     * Classification of service into arbitrary Service categories, e.g. school bus. Recommended SIRI values based on TPEG are given in SIRI documentation and enumerated in the siri_facilities package.Gets the value of the serviceFeatureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeatureRef }
     * 
     * 
     */
    public List<String> getServiceFeatureRef() {
        if (serviceFeatureRef == null) {
            serviceFeatureRef = new ArrayList<String>();
        }
        return this.serviceFeatureRef;
    }

    /**
     * Gets the value of the vehicleFeatureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleFeatureRef }
     * 
     * 
     */
    public List<String> getVehicleFeatureRef() {
        if (vehicleFeatureRef == null) {
            vehicleFeatureRef = new ArrayList<String>();
        }
        return this.vehicleFeatureRef;
    }

}
