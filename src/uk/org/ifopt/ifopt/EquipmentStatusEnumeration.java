//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.ifopt.ifopt;

public enum EquipmentStatusEnumeration {

    
    UNKNOWN("unknown"),
    
    AVAILABLE("available"),
    
    NOT_AVAILABLE("notAvailable");
    private final String value;

    EquipmentStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentStatusEnumeration fromValue(String v) {
        for (EquipmentStatusEnumeration c: EquipmentStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
