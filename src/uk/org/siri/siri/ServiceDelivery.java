package uk.org.siri.siri;

import java.util.Date;
import java.util.List;

public class ServiceDelivery {
	private Date responseTimestamp;
	private List<VehicleMonitoringDelivery> vehicleMonitoringDelivery;
	private List<StopMonitoringDelivery> stopMonitoringDelivery;
	private List<SituationExchangeDelivery> situationExchangeDelivery;

	
	public Date getResponseTimestamp() {
		return this.responseTimestamp;
	}

	
	public void setResponseTimestamp(Date responseTimestamp) {
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
