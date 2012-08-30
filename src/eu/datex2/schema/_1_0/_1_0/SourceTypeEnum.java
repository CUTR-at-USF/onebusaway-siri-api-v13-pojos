package eu.datex2.schema._1_0._1_0;

public enum SourceTypeEnum {


    /**
     * A patrol of an automobile club.
     * 
     */
    
    AUTOMOBILE_CLUB_PATROL("automobileClubPatrol"),

    /**
     * A camera observation (either still or video camera).
     * 
     */
    
    CAMERA_OBSERVATION("cameraObservation"),

    /**
     * An operator of freight vehicles.
     * 
     */
    
    FREIGHT_VEHICLE_OPERATOR("freightVehicleOperator"),

    /**
     * A station dedicated to the monitoring of the road network by processing inductive loop information.
     * 
     */
    
    INDUCTION_LOOP_MONITORING_STATION("inductionLoopMonitoringStation"),

    /**
     * A station dedicated to the monitoring of the road network by processing infrared image information.
     * 
     */
    
    INFRARED_MONITORING_STATION("infraredMonitoringStation"),

    /**
     * A station dedicated to the monitoring of the road network by processing microwave information.
     * 
     */
    
    MICROWAVE_MONITORING_STATION("microwaveMonitoringStation"),

    /**
     * A caller using a mobile telephone (who may or may not be on the road network).
     * 
     */
    
    MOBILE_TELEPHONE_CALLER("mobileTelephoneCaller"),

    /**
     * Emergency service patrols other than police.
     * 
     */
    
    NON_POLICE_EMERGENCY_SERVICE_PATROL("nonPoliceEmergencyServicePatrol"),

    /**
     * Other sources of information.
     * 
     */
    
    OTHER_INFORMATION("otherInformation"),

    /**
     * Personnel from a vehicle belonging to the road operator or authority or any emergency service, including authorised breakdown service organisations.
     * 
     */
    
    OTHER_OFFICIAL_VEHICLE("otherOfficialVehicle"),

    /**
     * A police patrol.
     * 
     */
    
    POLICE_PATROL("policePatrol"),

    /**
     * A private breakdown service.
     * 
     */
    
    PRIVATE_BREAKDOWN_SERVICE("privateBreakdownService"),

    /**
     * A utility organisation, either public or private.
     * 
     */
   
    PUBLIC_AND_PRIVATE_UTILITIES("publicAndPrivateUtilities"),

    /**
     * A motorist who is an officially registered observer.
     * 
     */
   
    REGISTERED_MOTORIST_OBSERVER("registeredMotoristObserver"),

    /**
     * A road authority.
     * 
     */
   
    ROAD_AUTHORITIES("roadAuthorities"),

    /**
     * A patrol of the road operator or authority.
     * 
     */
   
    ROAD_OPERATOR_PATROL("roadOperatorPatrol"),

    /**
     * A caller who is using an emergency roadside telephone.
     * 
     */
   
    ROADSIDE_TELEPHONE_CALLER("roadsideTelephoneCaller"),

    /**
     * A spotter aircraft of an organisation specifically assigned to the monitoring of the traffic network.
     * 
     */
   
    SPOTTER_AIRCRAFT("spotterAircraft"),

    /**
     * A station, usually automatic, dedicated to the monitoring of the road network.
     * 
     */
  
    TRAFFIC_MONITORING_STATION("trafficMonitoringStation"),

    /**
     * An operator of a transit service, e.g. bus link operator.
     * 
     */
  
    TRANSIT_OPERATOR("transitOperator"),

    /**
     * A specially equipped vehicle used to provide measurements.
     * 
     */
  
    VEHICLE_PROBE_MEASUREMENT("vehicleProbeMeasurement"),

    /**
     * A station dedicated to the monitoring of the road network by processing video image information.
     * 
     */
  
    VIDEO_PROCESSING_MONITORING_STATION("videoProcessingMonitoringStation");
    private final String value;

    SourceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SourceTypeEnum fromValue(String v) {
        for (SourceTypeEnum c: SourceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

