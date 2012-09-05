//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//

package uk.org.siri.siri;

public enum SeverityEnumeration {

	PTI_26_0("pti26_0"),

	/**
	 * TPEG Pti26_0: unknown
	 * 
	 */

	UNKNOWN("unknown"),

	PTI_26_1("pti26_1"),

	/**
	 * TPEG Pti26_1: very slight
	 * 
	 */

	VERY_SLIGHT("verySlight"),

	PTI_26_2("pti26_2"),

	/**
	 * TPEG Pti26_2: slight
	 * 
	 */

	SLIGHT("slight"),

	PTI_26_3("pti26_3"),

	/**
	 * TPEG Pti26_3: normal
	 * 
	 */

	NORMAL("normal"),

	PTI_26_4("pti26_4"),

	/**
	 * TPEG Pti26_4: severe
	 * 
	 */

	SEVERE("severe"),

	PTI_26_5("pti26_5"),

	/**
	 * TPEG Pti26_5: verySevere
	 * 
	 */

	VERY_SEVERE("verySevere"),

	PTI_26_6("pti26_6"),

	/**
	 * TPEG Pti26_6: noImpact
	 * 
	 */

	NO_IMPACT("noImpact"),

	PTI_26_255("pti26_255"),

	/**
	 * TPEG Pti26_255: undefined
	 * 
	 */

	UNDEFINED("undefined");

	private final String value;

	SeverityEnumeration(String v) {
		value = v;
	}
	
	public static SeverityEnumeration fromString(String v) {
		if (v != null) {
			for (SeverityEnumeration c : SeverityEnumeration.values()) {
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
