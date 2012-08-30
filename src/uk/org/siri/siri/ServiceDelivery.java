package uk.org.siri.siri;

import java.util.List;

public class ServiceDelivery {
	private String responseTimestamp;
	private List<VehicleMonitoringDelivery> vehicleMonitoringDelivery;
	private List<StopMonitoringDelivery> stopMonitoringDelivery;
	private List<SituationExchangeDelivery> situationExchangeDelivery;

	
	public String getResponseTimestamp() {
		return this.responseTimestamp;
	}

	
	public void setResponseTimestamp(String responseTimestamp) {
		this.responseTimestamp = responseTimestamp;
	}

	
	public List<VehicleMonitoringDelivery> getVehicleMonitoringDelivery() {
		return this.vehicleMonitoringDelivery;
	}

	
	public void setVehicleMonitoringDelivery(
			List<VehicleMonitoringDelivery> vehicleMonitoringDelivery) {
		this.vehicleMonitoringDelivery = vehicleMonitoringDelivery;
	}

	
	public List<StopMonitoringDelivery> getStopMonitoringDelivery() {
		return this.stopMonitoringDelivery;
	}

	
	public void setStopMonitoringDelivery(
			List<StopMonitoringDelivery> stopMonitoringDelivery) {
		this.stopMonitoringDelivery = stopMonitoringDelivery;
	}
	
	public List<SituationExchangeDelivery> getSituationExchangeDelivery() {
		return situationExchangeDelivery;
	}
	
	public void setSituationExchangeDelivery(
			List<SituationExchangeDelivery> situationExchangeDelivery) {
		this.situationExchangeDelivery = situationExchangeDelivery;
	}
}
