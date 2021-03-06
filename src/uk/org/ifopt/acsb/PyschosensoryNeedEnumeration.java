//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.ifopt.acsb;

public enum PyschosensoryNeedEnumeration {

    
    VISUAL_IMPAIRMENT("visualImpairment"),
    
    AUDITORY_IMPAIRMENT("auditoryImpairment"),
    
    COGNITIVE_INPUT_IMPAIRMENT("cognitiveInputImpairment"),
    
    AVERSE_TO_LIFTS("averseToLifts"),
    
    AVERSE_TO_ESCALATORS("averseToEscalators"),
    
    AVERSE_TO_CONFINED_SPACES("averseToConfinedSpaces"),
    
    AVERSE_TO_CROWDS("averseToCrowds"),
    
    OTHER_PSYCHOSENSORY_NEED("otherPsychosensoryNeed");
    private final String value;

    PyschosensoryNeedEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PyschosensoryNeedEnumeration fromValue(String v) {
        for (PyschosensoryNeedEnumeration c: PyschosensoryNeedEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
