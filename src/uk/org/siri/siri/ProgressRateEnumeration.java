//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

public enum ProgressRateEnumeration {


    /**
     * Vehicle is stationary.
     * 
     */
    
    NO_PROGRESS("noProgress"),

    /**
     * Vehicle is proceeding slower than normal.
     * 
     */
    
    SLOW_PROGRESS("slowProgress"),

    /**
     * Vehicle is proceeding at a normal rate.
     * 
     */
    
    NORMAL_PROGRESS("normalProgress"),

    /**
     * Vehicle is proceeding faster than normal.
     * 
     */
    
    FAST_PROGRESS("fastProgress"),

    /**
     * There is no data
     * 
     */
    
    UNKNOWN("unknown");
    
    private final String value;

    ProgressRateEnumeration(String v) {
		value = v;
	}
	
	public static ProgressRateEnumeration fromString(String v) {
		if (v != null) {
			for (ProgressRateEnumeration c : ProgressRateEnumeration.values()) {
				if (v.equalsIgnoreCase(c.toString())) {
			          return c;
			    }				
			}
		}
		throw new IllegalArgumentException(v);
	}

	@Override
	public String toString() {
		return value;
	}

}
