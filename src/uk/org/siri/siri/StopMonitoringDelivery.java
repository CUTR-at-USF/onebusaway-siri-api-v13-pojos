
package uk.org.siri.siri;

import java.util.Date;
import java.util.List;

public class StopMonitoringDelivery{
	
   	private List<MonitoredStopVisit> monitoredStopVisit;
   	private Date responseTimestamp;
   	private Date validUntil;
   	   	
 	public List<MonitoredStopVisit> getMonitoredStopVisit(){
		return this.monitoredStopVisit;
	}
   	
	public void setMonitoredStopVisit(List<MonitoredStopVisit> monitoredStopVisit){
		this.monitoredStopVisit = monitoredStopVisit;
	}
   	
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
}
