
package uk.org.siri.siri;

import java.util.Date;
import java.util.List;

public class VehicleMonitoringDelivery{
   	
	private Date responseTimestamp;
   	private Date validUntil;
   	private List<VehicleActivity> vehicleActivity;
   	   	
 	public Date getResponseTimestamp(){
		return this.responseTimestamp;
	}
   	
	public void setResponseTimestamp(Date responseTimestamp){
		this.responseTimestamp = responseTimestamp;
	}
   	
 	public Date getValidUntil(){
		return this.validUntil;
	}
   	
	public void setValidUntil(Date validUntil){
		this.validUntil = validUntil;
	}
   	
 	public List<VehicleActivity> getVehicleActivity(){
		return this.vehicleActivity;
	}
   	
	public void setVehicleActivity(List<VehicleActivity> vehicleActivity){
		this.vehicleActivity = vehicleActivity;
	}
}
