//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

public enum RefreshmentFacilityEnumeration {

    
    UNKNOWN("unknown"),
    
    PTI_23_1("pti23_1"),
    
    RESTAURANT_SERVICE("restaurantService"),
    
    PTI_23_2("pti23_2"),
    
    SNACKS_SERVICE("snacksService"),
    
    PTI_23("pti23"),
    
    TROLLEY("trolley"),
    
    PTI_23_18("pti23_18"),
    
    BAR("bar"),
    
    PTI_23_19("pti23_19"),
    
    FOOD_NOT_AVAILABLE("foodNotAvailable"),
    
    PTI_23_20("pti23_20"),
    
    BEVERAGES_NOT_AVAILABLE("beveragesNotAvailable"),
    
    PTI_23_26("pti23_26"),
    
    BISTRO("bistro"),
    
    FOOD_VENDING_MACHINE("foodVendingMachine"),
    
    BEVERAGE_VENDING_MACHINE("beverageVendingMachine");
    private final String value;

    RefreshmentFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefreshmentFacilityEnumeration fromValue(String v) {
        for (RefreshmentFacilityEnumeration c: RefreshmentFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
