package uk.org.siri.siri;

public class Distances {
	private String presentableDistance;
	private float distanceFromCall;
	private float stopsFromCall;
	private float callDistanceAlongRoute;
	
	
	public float getCallDistanceAlongRoute() {
		return callDistanceAlongRoute;
	}
	
	public float getDistanceFromCall() {
		return distanceFromCall;
	}
	
	public String getPresentableDistance() {
		return presentableDistance;
	}
	
	public float getStopsFromCall() {
		return stopsFromCall;
	}
	
	public void setCallDistanceAlongRoute(float callDistanceAlongRoute) {
		this.callDistanceAlongRoute = callDistanceAlongRoute;
	}
	
	public void setDistanceFromCall(float distanceFromCall) {
		this.distanceFromCall = distanceFromCall;
	}
	
	public void setPresentableDistance(String presentableDistance) {
		this.presentableDistance = presentableDistance;
	}
	
	public void setStopsFromCall(float stopsFromCall) {
		this.stopsFromCall = stopsFromCall;
	}
}
