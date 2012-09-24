//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

public enum EnvironmentReasonEnumeration {

    
    PTI_22_0("pti22_0"),

    /**
     * TPEG Pti22_0   unknown
     * 
     */
    
    UNKNOWN("unknown"),
    
    PTI_22_1("pti22_1"),

    /**
     * TPEG Pti22_1   fog
     * 
     */
    
    FOG("fog"),
    
    PTI_22_2("pti22_2"),

    /**
     * TPEG Pti22_2   rough sea
     * 
     */
    
    ROUGH_SEA("roughSea"),
    
    PTI_22_3("pti22_3"),

    /**
     * TPEG Pti22_3   heavy snow fall
     * 
     */
    
    HEAVY_SNOW_FALL("heavySnowFall"),
    
    PTI_22_3_ALIAS_1("pti22_3_Alias_1"),

    /**
     * drifting snow - Alias to TPEG Pti22_3   heavySnowFall
     * 
     */
    
    DRIFTING_SNOW("driftingSnow"),
    
    PTI_22_3_ALIAS_2("pti22_3_Alias_2"),

    /**
     * Blizzard Conditions - Alias to TPEG Pti22_3   heavySnowFall
     * 
     */
    
    BLIZZARD_CONDITIONS("blizzardConditions"),
    
    PTI_22_4("pti22_4"),

    /**
     * TPEG Pti22_4   heavy rain
     * 
     */
    
    HEAVY_RAIN("heavyRain"),
    
    PTI_22_5("pti22_5"),

    /**
     * TPEG Pti22_5   strong winds
     * 
     */
    
    STRONG_WINDS("strongWinds"),
    
    PTI_22_5_ALIAS_1("pti22_5_Alias_1"),

    /**
     * stormConditions alias to TPEG Pti22_5   strong winds
     * 
     */
    
    STORM_CONDITIONS("stormConditions"),
    
    PTI_22_5_ALIAS_2("pti22_5_Alias_2"),

    /**
     * storm damage alias to TPEG Pti22_5   strong winds
     * 
     */
    
    STORM_DAMAGE("stormDamage"),
    
    PTI_22_6("pti22_6"),

    /**
     * TPEG Pti22_6   tidal restrictions
     * 
     */
    
    TIDAL_RESTRICTIONS("tidalRestrictions"),
    
    PTI_22_7("pti22_7"),

    /**
     * TPEG Pti22_7   high tide
     * 
     */
    
    HIGH_TIDE("highTide"),
    
    PTI_22_8("pti22_8"),

    /**
     * TPEG Pti22_8   low tide
     * 
     */
    
    LOW_TIDE("lowTide"),
    
    PTI_22_9("pti22_9"),

    /**
     * TPEG Pti22_9   ice
     * 
     */
    
    ICE("ice"),
    
    PTI_22_10("pti22_10"),

    /**
     * TPEG Pti22_10  frozen
     * 
     */
    
    FROZEN("frozen"),
    
    PTI_22_11("pti22_11"),

    /**
     * TPEG Pti22_11  hail
     * 
     */
    
    HAIL("hail"),
    
    PTI_22_11_ALIAS_1("pti22_11_Alias_1"),

    /**
     * Sleet Alias to  TPEG Pti22_11  hail
     * 
     */
    
    SLEET("sleet"),
    
    PTI_22_12("pti22_12"),

    /**
     * TPEG Pti22_12  high temperatures
     * 
     */
    
    HIGH_TEMPERATURES("highTemperatures"),
    
    PTI_22_13("pti22_13"),

    /**
     * TPEG Pti22_13  flooding
     * 
     */
    
    FLOODING("flooding"),
    
    PTI_22_14("pti22_14"),

    /**
     * TPEG Pti22_14  waterlogged
     * 
     */
    
    WATERLOGGED("waterlogged"),
    
    PTI_22_15("pti22_15"),

    /**
     * TPEG Pti22_15  low water level
     * 
     */
    
    LOW_WATER_LEVEL("lowWaterLevel"),
    
    PTI_22_16("pti22_16"),

    /**
     * TPEG Pti22_16  high water level
     * 
     */
    
    HIGH_WATER_LEVEL("highWaterLevel"),
    
    PTI_22_17("pti22_17"),

    /**
     * TPEG Pti22_17  fallen leaves
     * 
     */
    
    FALLEN_LEAVES("fallenLeaves"),
    
    PTI_22_18("pti22_18"),

    /**
     * TPEG Pti22_18  fallen tree
     * 
     */
    
    FALLEN_TREE("fallenTree"),
    
    PTI_22_19("pti22_19"),

    /**
     * TPEG Pti22_19  landslide
     * 
     */
    
    LANDSLIDE("landslide"),
    
    PTI_22_255("pti22_255"),

    /**
     * TPEG Pti22_255 undefined environmental problem
     * 
     */
    
    UNDEFINED_ENVIRONMENTAL_PROBLEM("undefinedEnvironmentalProblem"),
    
    PTI_22_255_ALIAS_1("pti22_255_Alias_1"),

    /**
     * lightningStrike alias to TPEG Pti22_255 undefined environmental problem
     * 
     */
    
    LIGHTNING_STRIKE("lightningStrike"),
    
    PTI_22_255_ALIAS_2("pti22_255_Alias_2"),
    
    SEWER_OVERFLOW("sewerOverflow"),
    
    PTI_22_255_ALIAS_3("pti22_255_Alias_3"),
    
    GRASS_FIRE("grassFire");
    private final String value;

    EnvironmentReasonEnumeration(String v) {
        value = v;
    }

    public static EnvironmentReasonEnumeration fromString(String v) {
		if (v != null) {
			for (EnvironmentReasonEnumeration c : EnvironmentReasonEnumeration.values()) {
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
