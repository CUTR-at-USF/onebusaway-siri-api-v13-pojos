//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

/**
 * <p>Java class for QualityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="certain"/>
 *     &lt;enumeration value="veryReliable"/>
 *     &lt;enumeration value="reliable"/>
 *     &lt;enumeration value="probablyReliable"/>
 *     &lt;enumeration value="unconfirmed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */

public enum QualityEnumeration {

  
    CERTAIN("certain"),
  
    VERY_RELIABLE("veryReliable"),
  
    RELIABLE("reliable"),
  
    PROBABLY_RELIABLE("probablyReliable"),
  
    UNCONFIRMED("unconfirmed");
    private final String value;

    QualityEnumeration(String v) {
        value = v;
    }

    public static QualityEnumeration fromString(String v) {
		if (v != null) {
			for (QualityEnumeration c : QualityEnumeration.values()) {
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
