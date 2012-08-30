
package uk.org.siri.siri;

public class PublishToMobileAction extends ParameterisedAction {

	protected Boolean incidents;

	protected Boolean homePage;

	/**
	 * Gets the value of the incidents property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIncidents() {
		return incidents;
	}

	/**
	 * Sets the value of the incidents property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIncidents(Boolean value) {
		this.incidents = value;
	}

	/**
	 * Gets the value of the homePage property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHomePage() {
		return homePage;
	}

	/**
	 * Sets the value of the homePage property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHomePage(Boolean value) {
		this.homePage = value;
	}

}
