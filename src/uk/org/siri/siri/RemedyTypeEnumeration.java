//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

public enum RemedyTypeEnumeration {

    
    UNKNOWN("unknown"),
    
    REPLACE("replace"),
    
    REPAIR("repair"),
    
    REMOVE("remove"),
    
    OTHER_ROUTE("otherRoute"),
    
    OTHER_LOCATION("otherLocation");
    private final String value;

    RemedyTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemedyTypeEnumeration fromValue(String v) {
        for (RemedyTypeEnumeration c: RemedyTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
