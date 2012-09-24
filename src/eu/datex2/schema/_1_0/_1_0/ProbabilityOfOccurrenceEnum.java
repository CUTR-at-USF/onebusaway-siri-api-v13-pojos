//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package eu.datex2.schema._1_0._1_0;

import uk.org.siri.siri.ServiceConditionEnumeration;

public enum ProbabilityOfOccurrenceEnum {


    /**
     * The source is compeltely certain of the occurrence of the situation record version content.
     * 
     */
    
    CERTAIN("certain"),

    /**
     * The source has a reasonably high level of confidence of the occurrence of the situation record version content.
     * 
     */
    
    PROBABLE("probable"),

    /**
     * The source has a moderate level of confidence of the occurrence of the situation record version content.
     * 
     */
    
    RISK_OF("riskOf"),

    /**
     * The source has a low level of confidence of the occurrence of the situation record version content.
     * 
     */
    
    IMPROBABLE("improbable");
    private final String value;

    ProbabilityOfOccurrenceEnum(String v) {
        value = v;
    }

    public static ProbabilityOfOccurrenceEnum fromString(String v) {
		if (v != null) {
			for (ProbabilityOfOccurrenceEnum c : ProbabilityOfOccurrenceEnum.values()) {
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
