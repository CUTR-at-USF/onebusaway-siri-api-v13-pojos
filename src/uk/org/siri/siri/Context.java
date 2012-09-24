package uk.org.siri.siri;

import uk.org.ifopt.ifopt.CountryRef;

public class Context {

	protected CountryRef countryRef;

	protected String participantRef;
	protected String topographicPlaceRef;

	protected NaturalLanguageString topographicPlaceName;

	protected String defaultLanguage;

	protected NetworkContext networkContext;

	protected Actions actions;

	protected Extensions extensions;

	/**
	 * Gets the value of the countryRef property.
	 * 
	 * @return possible object is {@link CountryRef }
	 * 
	 */
	public CountryRef getCountryRef() {
		return countryRef;
	}

	/**
	 * Sets the value of the countryRef property.
	 * 
	 * @param value
	 *            allowed object is {@link CountryRef }
	 * 
	 */
	public void setCountryRef(CountryRef value) {
		this.countryRef = value;
	}

	/**
	 * Gets the value of the participantRef property.
	 * 
	 * @return possible object is {@link ParticipantRef }
	 * 
	 */
	public String getParticipantRef() {
		return participantRef;
	}

	/**
	 * Sets the value of the participantRef property.
	 * 
	 * @param value
	 *            allowed object is {@link ParticipantRef }
	 * 
	 */
	public void setParticipantRef(String value) {
		this.participantRef = value;
	}

	/**
	 * Gets the value of the topographicPlaceRef property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTopographicPlaceRef() {
		return topographicPlaceRef;
	}

	/**
	 * Sets the value of the topographicPlaceRef property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTopographicPlaceRef(String value) {
		this.topographicPlaceRef = value;
	}

	/**
	 * Gets the value of the topographicPlaceName property.
	 * 
	 * @return possible object is {@link NaturalLanguageString }
	 * 
	 */
	public NaturalLanguageString getTopographicPlaceName() {
		return topographicPlaceName;
	}

	/**
	 * Sets the value of the topographicPlaceName property.
	 * 
	 * @param value
	 *            allowed object is {@link NaturalLanguageString }
	 * 
	 */
	public void setTopographicPlaceName(NaturalLanguageString value) {
		this.topographicPlaceName = value;
	}

	/**
	 * Gets the value of the defaultLanguage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	/**
	 * Sets the value of the defaultLanguage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDefaultLanguage(String value) {
		this.defaultLanguage = value;
	}

	/**
	 * Gets the value of the networkContext property.
	 * 
	 * @return possible object is {@link NetworkContext }
	 * 
	 */
	public NetworkContext getNetworkContext() {
		return networkContext;
	}

	/**
	 * Sets the value of the networkContext property.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkContext }
	 * 
	 */
	public void setNetworkContext(NetworkContext value) {
		this.networkContext = value;
	}

	/**
	 * Gets the value of the actions property.
	 * 
	 * @return possible object is {@link Actions }
	 * 
	 */
	public Actions getActions() {
		return actions;
	}

	/**
	 * Sets the value of the actions property.
	 * 
	 * @param value
	 *            allowed object is {@link Actions }
	 * 
	 */
	public void setActions(Actions value) {
		this.actions = value;
	}

	/**
	 * Gets the value of the extensions property.
	 * 
	 * @return possible object is {@link Extensions }
	 * 
	 */
	public Extensions getExtensions() {
		return extensions;
	}

	/**
	 * Sets the value of the extensions property.
	 * 
	 * @param value
	 *            allowed object is {@link Extensions }
	 * 
	 */
	public void setExtensions(Extensions value) {
		this.extensions = value;
	}
}
