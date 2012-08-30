//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package eu.datex2.schema._1_0._1_0;

public enum CauseTypeEnum {


    /**
     * Accident.
     * 
     */
    
    ACCIDENT("accident"),

    /**
     * Traffic congestion.
     * 
     */
    
    CONGESTION("congestion"),

    /**
     * Failure of roadside equipment.
     * 
     */
    
    EQUIPMENT_FAILURE("equipmentFailure"),

    /**
     * Failure of road infrastructure.
     * 
     */
    
    INFRASTRUCTURE_FAILURE("infrastructureFailure"),

    /**
     * Obstruction (of unspecified type) on the roadway.
     * 
     */
    
    OBSTRUCTION("obstruction"),

    /**
     * Poor weather conditions.
     * 
     */
    
    POOR_WEATHER("poorWeather"),

    /**
     * Problems at the border crossing.
     * 
     */
    
    PROBLEMS_AT_BORDER_POST("problemsAtBorderPost"),

    /**
     * Problems at the customs post on the border.
     * 
     */
    
    PROBLEMS_AT_CUSTOM_POST("problemsAtCustomPost"),

    /**
     * Problems (of an unspecified nature) on the local roads.
     * 
     */
    
    PROBLEMS_ON_LOCAL_ROADS("problemsOnLocalRoads"),

    /**
     * A roadside event (of unspecified nature) whether planned or not.
     * 
     */
    
    ROADSIDE_EVENT("roadsideEvent"),

    /**
     * A security incident.
     * 
     */
    
    SECURITY_INCIDENT("securityIncident"),

    /**
     * A terrorist incident.
     * 
     */
    
    TERRORISM("terrorism"),

    /**
     * A vandalism incident.
     * 
     */
    
    VANDALISM("vandalism");
    private final String value;

    CauseTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CauseTypeEnum fromValue(String v) {
        for (CauseTypeEnum c: CauseTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
