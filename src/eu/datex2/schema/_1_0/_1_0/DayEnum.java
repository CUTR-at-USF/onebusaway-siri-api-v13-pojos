//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package eu.datex2.schema._1_0._1_0;

public enum DayEnum {


    /**
     * Monday.
     * 
     */
    
    MONDAY("monday"),

    /**
     * Tuesday.
     * 
     */
    
    TUESDAY("tuesday"),

    /**
     * Wednesday.
     * 
     */
    
    WEDNESDAY("wednesday"),

    /**
     * Thursday.
     * 
     */
    
    THURSDAY("thursday"),

    /**
     * Friday.
     * 
     */
    
    FRIDAY("friday"),

    /**
     * Saturday.
     * 
     */
    
    SATURDAY("saturday"),

    /**
     * Sunday.
     * 
     */
    
    SUNDAY("sunday");
    private final String value;

    DayEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayEnum fromValue(String v) {
        for (DayEnum c: DayEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
