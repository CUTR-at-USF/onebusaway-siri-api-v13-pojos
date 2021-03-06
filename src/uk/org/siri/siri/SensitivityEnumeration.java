//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

public enum SensitivityEnumeration {

    
    VERY_HIGH("veryHigh"),
    
    HIGH("high"),
    
    MEDIUM("medium"),
    
    LOW("low"),
    
    VERY_LOW("veryLow");
    private final String value;

    SensitivityEnumeration(String v) {
        value = v;
    }

    public static SensitivityEnumeration fromString(String v) {
		if (v != null) {
			for (SensitivityEnumeration c : SensitivityEnumeration.values()) {
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
