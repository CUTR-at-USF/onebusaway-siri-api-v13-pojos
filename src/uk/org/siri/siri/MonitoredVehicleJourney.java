package uk.org.siri.siri;

import java.util.List;

public class MonitoredVehicleJourney {
	
	private String lineRef;	
	private String directionRef;
	private FramedVehicleJourneyRef framedVehicleJourneyRef;
	private String journeyPatternRef;
	private String publishedLineName;
	private String operatorRef;
	private String originRef;
	private String destinationRef;
	private String destinationName;
		
	private List<SituationRef> situationRef;
	
	private boolean monitored;
	private VehicleLocation vehicleLocation;
	private float bearing;
	private String progressRate;
	private String vehicleRef;
	private MonitoredCall monitoredCall;	
	private String blockRef;
	
	private OnwardCalls onwardCalls;
	
	public OnwardCalls getOnwardCalls() {
		return onwardCalls;
	}
	
	public void setOnwardCalls(OnwardCalls onwardCalls) {
		this.onwardCalls = onwardCalls;
	}
	
	public String getBlockRef() {
		return blockRef;
	}
	
	public void setBlockRef(String blockRef) {
		this.blockRef = blockRef;
	}
	
	
	public float getBearing() {
		return bearing;
	}
	
	public String getDestinationName() {
		return destinationName;
	}
	
	public String getDestinationRef() {
		return destinationRef;
	}
	
	public String getDirectionRef() {
		return directionRef;
	}
	
	public FramedVehicleJourneyRef getFramedVehicleJourneyRef() {
		return framedVehicleJourneyRef;
	}
	
	public String getJourneyPatternRef() {
		return journeyPatternRef;
	}
	
	public String getLineRef() {
		return lineRef;
	}
	
	public MonitoredCall getMonitoredCall() {
		return monitoredCall;
	}
	
	public String getOperatorRef() {
		return operatorRef;
	}
	
	public String getOriginRef() {
		return originRef;
	}
	
	public String getProgressRate() {
		return progressRate;
	}
	
	public String getPublishedLineName() {
		return publishedLineName;
	}
	
	public List<SituationRef> getSituationRef() {
		return situationRef;
	}
	
	public VehicleLocation getVehicleLocation() {
		return vehicleLocation;
	}
	
	public String getVehicleRef() {
		return vehicleRef;
	}
	
	public boolean isMonitored() {
		return monitored;
	}
	
	public void setBearing(float bearing) {
		this.bearing = bearing;
	}
	
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	
	public void setDestinationRef(String destinationRef) {
		this.destinationRef = destinationRef;
	}
	
	public void setDirectionRef(String directionRef) {
		this.directionRef = directionRef;
	}
	
	public void setFramedVehicleJourneyRef(
			FramedVehicleJourneyRef framedVehicleJourneyRef) {
		this.framedVehicleJourneyRef = framedVehicleJourneyRef;
	}
	
	public void setJourneyPatternRef(String journeyPatternRef) {
		this.journeyPatternRef = journeyPatternRef;
	}
	
	public void setLineRef(String lineRef) {
		this.lineRef = lineRef;
	}
	
	public void setMonitored(boolean monitored) {
		this.monitored = monitored;
	}
	
	public void setMonitoredCall(MonitoredCall monitoredCall) {
		this.monitoredCall = monitoredCall;
	}
	
	public void setOperatorRef(String operatorRef) {
		this.operatorRef = operatorRef;
	}
	
	public void setOriginRef(String originRef) {
		this.originRef = originRef;
	}
	
	public void setProgressRate(String progressRate) {
		this.progressRate = progressRate;
	}
	
	public void setPublishedLineName(String publishedLineName) {
		this.publishedLineName = publishedLineName;
	}
	
	public void setSituationRef(List<SituationRef> situationRef) {
		this.situationRef = situationRef;
	}
	
	public void setVehicleLocation(VehicleLocation vehicleLocation) {
		this.vehicleLocation = vehicleLocation;
	}
	
	public void setVehicleRef(String vehicleRef) {
		this.vehicleRef = vehicleRef;
	}
	
	
}
