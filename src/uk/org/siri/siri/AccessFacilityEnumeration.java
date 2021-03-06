//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

public enum AccessFacilityEnumeration {


    UNKNOWN("unknown"),
    
    LIFT("lift"),
    
    ESCALATOR("escalator"),
    
    TRAVELATOR("travelator"),
    
    RAMP("ramp"),
    
    STAIRS("stairs"),
    
    SHUTTLE("shuttle"),
    
    NARROW_ENTRANCE("narrowEntrance"),
    
    BARRIER("barrier"),
    
    PALLET_ACCESS_LOW_FLOOR("palletAccess_lowFloor"),
    
    VALIDATOR("validator");
    private final String value;

    AccessFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessFacilityEnumeration fromValue(String v) {
        for (AccessFacilityEnumeration c: AccessFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
