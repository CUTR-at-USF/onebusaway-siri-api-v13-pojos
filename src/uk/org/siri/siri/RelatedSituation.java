
package uk.org.siri.siri;

import java.util.Date;
import uk.org.ifopt.ifopt.CountryRef;


public class RelatedSituation {

    
    protected Date creationTime;
    
    protected CountryRef countryRef;
    
    protected ParticipantRef participantRef;
    
    protected EntryQualifier situationNumber;
    
    protected CountryRef updateCountryRef;
    
    protected ParticipantRef updateParticipantRef;
    
    protected SituationVersion version;
    
    protected String externalReference;
    
    protected RelatedToEnumeration relatedAs;
    
    protected Extensions extensions;

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCreationTime(Date value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the countryRef property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRef }
     *     
     */
    public CountryRef getCountryRef() {
        return countryRef;
    }

    /**
     * Sets the value of the countryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRef }
     *     
     */
    public void setCountryRef(CountryRef value) {
        this.countryRef = value;
    }

    /**
     * Gets the value of the participantRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRef }
     *     
     */
    public ParticipantRef getParticipantRef() {
        return participantRef;
    }

    /**
     * Sets the value of the participantRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRef }
     *     
     */
    public void setParticipantRef(ParticipantRef value) {
        this.participantRef = value;
    }

    /**
     * Unique identifier of  Situation within a Participant. Excludes any version number.
     * 
     * @return
     *     possible object is
     *     {@link EntryQualifier }
     *     
     */
    public EntryQualifier getSituationNumber() {
        return situationNumber;
    }

    /**
     * Sets the value of the situationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryQualifier }
     *     
     */
    public void setSituationNumber(EntryQualifier value) {
        this.situationNumber = value;
    }

    /**
     * Gets the value of the updateCountryRef property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRef }
     *     
     */
    public CountryRef getUpdateCountryRef() {
        return updateCountryRef;
    }

    /**
     * Sets the value of the updateCountryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRef }
     *     
     */
    public void setUpdateCountryRef(CountryRef value) {
        this.updateCountryRef = value;
    }

    /**
     * Gets the value of the updateParticipantRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRef }
     *     
     */
    public ParticipantRef getUpdateParticipantRef() {
        return updateParticipantRef;
    }

    /**
     * Sets the value of the updateParticipantRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRef }
     *     
     */
    public void setUpdateParticipantRef(ParticipantRef value) {
        this.updateParticipantRef = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link SituationVersion }
     *     
     */
    public SituationVersion getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationVersion }
     *     
     */
    public void setVersion(SituationVersion value) {
        this.version = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the relatedAs property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedToEnumeration }
     *     
     */
    public RelatedToEnumeration getRelatedAs() {
        return relatedAs;
    }

    /**
     * Sets the value of the relatedAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedToEnumeration }
     *     
     */
    public void setRelatedAs(RelatedToEnumeration value) {
        this.relatedAs = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}
