package uk.org.ifopt.ifopt;

public class CountryRef {
	
	protected IanaCountryTldEnumeration value;

	/**
	 * Type for Country Identifier.
	 * 
	 * @return possible object is {@link IanaCountryTldEnumeration }
	 * 
	 */
	public IanaCountryTldEnumeration getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link IanaCountryTldEnumeration }
	 * 
	 */
	public void setValue(IanaCountryTldEnumeration value) {
		this.value = value;
	}

}
