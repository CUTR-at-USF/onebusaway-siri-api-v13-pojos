//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

public enum AirSubmodesOfTransportEnumeration {

    
    PTI_8_0("pti8_0"),
    
    LOC_15_0("loc15_0"),
    
    UNKNOWN("unknown"),
    
    PTI_8_1("pti8_1"),
    
    LOC_15_2("loc15_2"),
    
    INTERNATIONAL_FLIGHT("internationalFlight"),
    
    PTI_8_2("pti8_2"),
    
    DOMESTIC_FLIGHT("domesticFlight"),
    
    PTI_8_3("pti8_3"),
    
    LOC_15_1("loc15_1"),
    
    INTERCONTINENTAL_FLIGHT("intercontinentalFlight"),
    
    PTI_8_4("pti8_4"),
    
    LOC_15_4("loc15_4"),
    
    DOMESTIC_SCHEDULED_FLIGHT("domesticScheduledFlight"),
    
    PTI_8_5("pti8_5"),
    
    LOC_15_9("loc15_9"),
    
    SHUTTLE_FLIGHT("shuttleFlight"),
    
    PTI_8_6("pti8_6"),
    
    LOC_15_5("loc15_5"),
    
    INTERCONTINENTAL_CHARTER_FLIGHT("intercontinentalCharterFlight"),
    
    PTI_8_7("pti8_7"),
    
    LOC_15_6("loc15_6"),
    
    INTERNATIONAL_CHARTER_FLIGHT("internationalCharterFlight"),
    
    PTI_8_8("pti8_8"),
    
    ROUND_TRIP_CHARTER_FLIGHT("roundTripCharterFlight"),
    
    PTI_8_9("pti8_9"),
    
    LOC_15_8("loc15_8"),
    
    SIGHTSEEING_FLIGHT("sightseeingFlight"),
    
    PTI_8_10("pti8_10"),
    
    LOC_15_10("loc15_10"),
    
    HELICOPTER_SERVICE("helicopterService"),
    
    PTI_8_11("pti8_11"),
    
    LOC_15_7("loc15_7"),
    
    DOMESTIC_CHARTER_FLIGHT("domesticCharterFlight"),
    
    PTI_8_12("pti8_12"),
    
    SCHENGEN_AREA_FLIGHT("SchengenAreaFlight"),
    
    PTI_8_13("pti8_13"),
    
    AIRSHIP_SERVICE("airshipService"),
    
    PTI_8_14("pti8_14"),
    
    ALL_AIR_SERVICES("allAirServices"),
    
    LOC_14_3("loc14_3"),
    
    SHORT_HAUL_INTERNATIONAL_FLIGHT("shortHaulInternationalFlight"),
    
    PTI_8_255("pti8_255"),
    
    LOC_15_255("loc15_255"),
    
    UNDEFINED_AIRCRAFT_SERVICE("undefinedAircraftService");
    private final String value;

    AirSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirSubmodesOfTransportEnumeration fromValue(String v) {
        for (AirSubmodesOfTransportEnumeration c: AirSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
