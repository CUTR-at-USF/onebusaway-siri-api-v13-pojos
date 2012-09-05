package uk.org.siri.siri;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import eu.datex2.schema._1_0._1_0.InformationStatusEnum;
import eu.datex2.schema._1_0._1_0.ProbabilityOfOccurrenceEnum;
import eu.datex2.schema._1_0._1_0.PublicEventTypeEnum;

public class PtSituationElement extends SituationElement {

	protected VerificationStatusEnumeration verification;

	protected WorkflowStatusEnumeration progress;

	protected QualityEnumeration qualityIndex;

	protected InformationStatusEnum reality;

	protected ProbabilityOfOccurrenceEnum likelihood;

	protected List<String> publication;

	protected List<uk.org.siri.siri.RoadSituationElement.ValidityPeriod> validityPeriod;

	protected uk.org.siri.siri.RoadSituationElement.Repetitions repetitions;

	protected HalfOpenTimestampRange publicationWindow;

	protected String unknownReason;

	protected MiscellaneousReasonEnumeration miscellaneousReason;

	protected PersonnelReasonEnumeration personnelReason;

	protected EquipmentReasonEnumeration equipmentReason;

	protected EnvironmentReasonEnumeration environmentReason;

	protected String undefinedReason;

	protected PublicEventTypeEnum publicEventReason;

	protected String reasonName;

	protected SeverityEnumeration severity;

	protected BigInteger priority;

	protected SensitivityEnumeration sensitivity;

	protected AudienceEnumeration audience;

	protected ScopeTypeEnumeration scopeType;

	protected String reportType;

	protected Boolean planned;

	protected List<String> keywords;

	protected uk.org.siri.siri.RoadSituationElement.SecondaryReasons secondaryReasons;

	protected String language;

	protected String summary;

	protected String description;

	protected String detail;

	protected String advice;

	protected String internal;

	protected uk.org.siri.siri.RoadSituationElement.Images images;

	protected uk.org.siri.siri.RoadSituationElement.InfoLinks infoLinks;

	protected AffectsScope affects;

	protected PtConsequences consequences;

	protected Actions publishingActions;

	protected Extensions extensions;

	/**
	 * Gets the value of the verification property.
	 * 
	 * @return possible object is {@link VerificationStatusEnumeration }
	 * 
	 */
	public VerificationStatusEnumeration getVerification() {
		return verification;
	}

	/**
	 * Sets the value of the verification property.
	 * 
	 * @param value
	 *            allowed object is {@link VerificationStatusEnumeration }
	 * 
	 */
	public void setVerification(VerificationStatusEnumeration value) {
		this.verification = value;
	}

	/**
	 * Gets the value of the progress property.
	 * 
	 * @return possible object is {@link WorkflowStatusEnumeration }
	 * 
	 */
	public WorkflowStatusEnumeration getProgress() {
		return progress;
	}

	/**
	 * Sets the value of the progress property.
	 * 
	 * @param value
	 *            allowed object is {@link WorkflowStatusEnumeration }
	 * 
	 */
	public void setProgress(WorkflowStatusEnumeration value) {
		this.progress = value;
	}

	/**
	 * Gets the value of the qualityIndex property.
	 * 
	 * @return possible object is {@link QualityEnumeration }
	 * 
	 */
	public QualityEnumeration getQualityIndex() {
		return qualityIndex;
	}

	/**
	 * Sets the value of the qualityIndex property.
	 * 
	 * @param value
	 *            allowed object is {@link QualityEnumeration }
	 * 
	 */
	public void setQualityIndex(QualityEnumeration value) {
		this.qualityIndex = value;
	}

	/**
	 * Gets the value of the reality property.
	 * 
	 * @return possible object is {@link InformationStatusEnum }
	 * 
	 */
	public InformationStatusEnum getReality() {
		return reality;
	}

	/**
	 * Sets the value of the reality property.
	 * 
	 * @param value
	 *            allowed object is {@link InformationStatusEnum }
	 * 
	 */
	public void setReality(InformationStatusEnum value) {
		this.reality = value;
	}

	/**
	 * Gets the value of the likelihood property.
	 * 
	 * @return possible object is {@link ProbabilityOfOccurrenceEnum }
	 * 
	 */
	public ProbabilityOfOccurrenceEnum getLikelihood() {
		return likelihood;
	}

	/**
	 * Sets the value of the likelihood property.
	 * 
	 * @param value
	 *            allowed object is {@link ProbabilityOfOccurrenceEnum }
	 * 
	 */
	public void setLikelihood(ProbabilityOfOccurrenceEnum value) {
		this.likelihood = value;
	}

	/**
	 * Gets the value of the publication property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the publication property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPublication().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getPublication() {
		if (publication == null) {
			publication = new ArrayList<String>();
		}
		return this.publication;
	}

	/**
	 * Gets the value of the validityPeriod property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the validityPeriod property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getValidityPeriod().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link uk.org.siri.siri.RoadSituationElement.ValidityPeriod }
	 * 
	 * 
	 */
	public List<uk.org.siri.siri.RoadSituationElement.ValidityPeriod> getValidityPeriod() {
		if (validityPeriod == null) {
			validityPeriod = new ArrayList<uk.org.siri.siri.RoadSituationElement.ValidityPeriod>();
		}
		return this.validityPeriod;
	}

	/**
	 * Gets the value of the repetitions property.
	 * 
	 * @return possible object is
	 *         {@link uk.org.siri.siri.RoadSituationElement.Repetitions }
	 * 
	 */
	public uk.org.siri.siri.RoadSituationElement.Repetitions getRepetitions() {
		return repetitions;
	}

	/**
	 * Sets the value of the repetitions property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link uk.org.siri.siri.RoadSituationElement.Repetitions }
	 * 
	 */
	public void setRepetitions(
			uk.org.siri.siri.RoadSituationElement.Repetitions value) {
		this.repetitions = value;
	}

	/**
	 * Gets the value of the publicationWindow property.
	 * 
	 * @return possible object is {@link HalfOpenTimestampRange }
	 * 
	 */
	public HalfOpenTimestampRange getPublicationWindow() {
		return publicationWindow;
	}

	/**
	 * Sets the value of the publicationWindow property.
	 * 
	 * @param value
	 *            allowed object is {@link HalfOpenTimestampRange }
	 * 
	 */
	public void setPublicationWindow(HalfOpenTimestampRange value) {
		this.publicationWindow = value;
	}

	/**
	 * Gets the value of the unknownReason property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUnknownReason() {
		return unknownReason;
	}

	/**
	 * Sets the value of the unknownReason property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUnknownReason(String value) {
		this.unknownReason = value;
	}

	/**
	 * Gets the value of the miscellaneousReason property.
	 * 
	 * @return possible object is {@link MiscellaneousReasonEnumeration }
	 * 
	 */
	public MiscellaneousReasonEnumeration getMiscellaneousReason() {
		return miscellaneousReason;
	}

	/**
	 * Sets the value of the miscellaneousReason property.
	 * 
	 * @param value
	 *            allowed object is {@link MiscellaneousReasonEnumeration }
	 * 
	 */
	public void setMiscellaneousReason(MiscellaneousReasonEnumeration value) {
		this.miscellaneousReason = value;
	}

	/**
	 * Personnel reason.
	 * 
	 * @return possible object is {@link PersonnelReasonEnumeration }
	 * 
	 */
	public PersonnelReasonEnumeration getPersonnelReason() {
		return personnelReason;
	}

	/**
	 * Sets the value of the personnelReason property.
	 * 
	 * @param value
	 *            allowed object is {@link PersonnelReasonEnumeration }
	 * 
	 */
	public void setPersonnelReason(PersonnelReasonEnumeration value) {
		this.personnelReason = value;
	}

	/**
	 * Gets the value of the equipmentReason property.
	 * 
	 * @return possible object is {@link EquipmentReasonEnumeration }
	 * 
	 */
	public EquipmentReasonEnumeration getEquipmentReason() {
		return equipmentReason;
	}

	/**
	 * Sets the value of the equipmentReason property.
	 * 
	 * @param value
	 *            allowed object is {@link EquipmentReasonEnumeration }
	 * 
	 */
	public void setEquipmentReason(EquipmentReasonEnumeration value) {
		this.equipmentReason = value;
	}

	/**
	 * Environment reason.
	 * 
	 * @return possible object is {@link EnvironmentReasonEnumeration }
	 * 
	 */
	public EnvironmentReasonEnumeration getEnvironmentReason() {
		return environmentReason;
	}

	/**
	 * Sets the value of the environmentReason property.
	 * 
	 * @param value
	 *            allowed object is {@link EnvironmentReasonEnumeration }
	 * 
	 */
	public void setEnvironmentReason(EnvironmentReasonEnumeration value) {
		this.environmentReason = value;
	}

	/**
	 * Gets the value of the undefinedReason property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUndefinedReason() {
		return undefinedReason;
	}

	/**
	 * Sets the value of the undefinedReason property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUndefinedReason(String value) {
		this.undefinedReason = value;
	}

	/**
	 * Gets the value of the publicEventReason property.
	 * 
	 * @return possible object is {@link PublicEventTypeEnum }
	 * 
	 */
	public PublicEventTypeEnum getPublicEventReason() {
		return publicEventReason;
	}

	/**
	 * Sets the value of the publicEventReason property.
	 * 
	 * @param value
	 *            allowed object is {@link PublicEventTypeEnum }
	 * 
	 */
	public void setPublicEventReason(PublicEventTypeEnum value) {
		this.publicEventReason = value;
	}

	/**
	 * Gets the value of the reasonName property.
	 * 
	 * @return possible object is {@link NaturalLanguageString }
	 * 
	 */
	public String getReasonName() {
		return reasonName;
	}

	/**
	 * Sets the value of the reasonName property.
	 * 
	 * @param value
	 *            allowed object is {@link NaturalLanguageString }
	 * 
	 */
	public void setReasonName(String value) {
		this.reasonName = value;
	}

	/**
	 * Gets the value of the severity property.
	 * 
	 * @return possible object is {@link SeverityEnumeration }
	 * 
	 */
	public SeverityEnumeration getSeverity() {
		return severity;
	}

	/**
	 * Sets the value of the severity property.
	 * 
	 * @param value
	 *            allowed object is {@link SeverityEnumeration }
	 * 
	 */
	public void setSeverity(SeverityEnumeration value) {
		this.severity = value;
	}

	/**
	 * Gets the value of the priority property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getPriority() {
		return priority;
	}

	/**
	 * Sets the value of the priority property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setPriority(BigInteger value) {
		this.priority = value;
	}

	/**
	 * Gets the value of the sensitivity property.
	 * 
	 * @return possible object is {@link SensitivityEnumeration }
	 * 
	 */
	public SensitivityEnumeration getSensitivity() {
		return sensitivity;
	}

	/**
	 * Sets the value of the sensitivity property.
	 * 
	 * @param value
	 *            allowed object is {@link SensitivityEnumeration }
	 * 
	 */
	public void setSensitivity(SensitivityEnumeration value) {
		this.sensitivity = value;
	}

	/**
	 * Gets the value of the audience property.
	 * 
	 * @return possible object is {@link AudienceEnumeration }
	 * 
	 */
	public AudienceEnumeration getAudience() {
		return audience;
	}

	/**
	 * Sets the value of the audience property.
	 * 
	 * @param value
	 *            allowed object is {@link AudienceEnumeration }
	 * 
	 */
	public void setAudience(AudienceEnumeration value) {
		this.audience = value;
	}

	/**
	 * Gets the value of the scopeType property.
	 * 
	 * @return possible object is {@link ScopeTypeEnumeration }
	 * 
	 */
	public ScopeTypeEnumeration getScopeType() {
		return scopeType;
	}

	/**
	 * Sets the value of the scopeType property.
	 * 
	 * @param value
	 *            allowed object is {@link ScopeTypeEnumeration }
	 * 
	 */
	public void setScopeType(ScopeTypeEnumeration value) {
		this.scopeType = value;
	}

	/**
	 * Gets the value of the reportType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReportType() {
		return reportType;
	}

	/**
	 * Sets the value of the reportType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReportType(String value) {
		this.reportType = value;
	}

	/**
	 * Gets the value of the planned property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isPlanned() {
		return planned;
	}

	/**
	 * Sets the value of the planned property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setPlanned(Boolean value) {
		this.planned = value;
	}

	/**
	 * Gets the value of the keywords property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the keywords property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getKeywords().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getKeywords() {
		if (keywords == null) {
			keywords = new ArrayList<String>();
		}
		return this.keywords;
	}

	/**
	 * Gets the value of the secondaryReasons property.
	 * 
	 * @return possible object is
	 *         {@link uk.org.siri.siri.RoadSituationElement.SecondaryReasons }
	 * 
	 */
	public uk.org.siri.siri.RoadSituationElement.SecondaryReasons getSecondaryReasons() {
		return secondaryReasons;
	}

	/**
	 * Sets the value of the secondaryReasons property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link uk.org.siri.siri.RoadSituationElement.SecondaryReasons }
	 * 
	 */
	public void setSecondaryReasons(
			uk.org.siri.siri.RoadSituationElement.SecondaryReasons value) {
		this.secondaryReasons = value;
	}

	/**
	 * Gets the value of the language property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the value of the language property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLanguage(String value) {
		this.language = value;
	}

	/**
	 * Gets the value of the summary property.
	 * 
	 * @return possible object is {@link DefaultedText }
	 * 
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * Sets the value of the summary property.
	 * 
	 * @param value
	 *            allowed object is {@link DefaultedText }
	 * 
	 */
	public void setSummary(String value) {
		this.summary = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link DefaultedText }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link DefaultedText }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the detail property.
	 * 
	 * @return possible object is {@link DefaultedText }
	 * 
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * Sets the value of the detail property.
	 * 
	 * @param value
	 *            allowed object is {@link DefaultedText }
	 * 
	 */
	public void setDetail(String value) {
		this.detail = value;
	}

	/**
	 * Gets the value of the advice property.
	 * 
	 * @return possible object is {@link DefaultedText }
	 * 
	 */
	public String getAdvice() {
		return advice;
	}

	/**
	 * Sets the value of the advice property.
	 * 
	 * @param value
	 *            allowed object is {@link DefaultedText }
	 * 
	 */
	public void setAdvice(String value) {
		this.advice = value;
	}

	/**
	 * Gets the value of the internal property.
	 * 
	 * @return possible object is {@link DefaultedText }
	 * 
	 */
	public String getInternal() {
		return internal;
	}

	/**
	 * Sets the value of the internal property.
	 * 
	 * @param value
	 *            allowed object is {@link DefaultedText }
	 * 
	 */
	public void setInternal(String value) {
		this.internal = value;
	}

	/**
	 * Gets the value of the images property.
	 * 
	 * @return possible object is
	 *         {@link uk.org.siri.siri.RoadSituationElement.Images }
	 * 
	 */
	public uk.org.siri.siri.RoadSituationElement.Images getImages() {
		return images;
	}

	/**
	 * Sets the value of the images property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link uk.org.siri.siri.RoadSituationElement.Images }
	 * 
	 */
	public void setImages(uk.org.siri.siri.RoadSituationElement.Images value) {
		this.images = value;
	}

	/**
	 * Gets the value of the infoLinks property.
	 * 
	 * @return possible object is
	 *         {@link uk.org.siri.siri.RoadSituationElement.InfoLinks }
	 * 
	 */
	public uk.org.siri.siri.RoadSituationElement.InfoLinks getInfoLinks() {
		return infoLinks;
	}

	/**
	 * Sets the value of the infoLinks property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link uk.org.siri.siri.RoadSituationElement.InfoLinks }
	 * 
	 */
	public void setInfoLinks(
			uk.org.siri.siri.RoadSituationElement.InfoLinks value) {
		this.infoLinks = value;
	}

	/**
	 * Gets the value of the affects property.
	 * 
	 * @return possible object is {@link AffectsScope }
	 * 
	 */
	public AffectsScope getAffects() {
		return affects;
	}

	/**
	 * Sets the value of the affects property.
	 * 
	 * @param value
	 *            allowed object is {@link AffectsScope }
	 * 
	 */
	public void setAffects(AffectsScope value) {
		this.affects = value;
	}

	/**
	 * Gets the value of the consequences property.
	 * 
	 * @return possible object is {@link PtConsequences }
	 * 
	 */
	public PtConsequences getConsequences() {
		return consequences;
	}

	/**
	 * Sets the value of the consequences property.
	 * 
	 * @param value
	 *            allowed object is {@link PtConsequences }
	 * 
	 */
	public void setConsequences(PtConsequences value) {
		this.consequences = value;
	}

	/**
	 * Gets the value of the publishingActions property.
	 * 
	 * @return possible object is {@link Actions }
	 * 
	 */
	public Actions getPublishingActions() {
		return publishingActions;
	}

	/**
	 * Sets the value of the publishingActions property.
	 * 
	 * @param value
	 *            allowed object is {@link Actions }
	 * 
	 */
	public void setPublishingActions(Actions value) {
		this.publishingActions = value;
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
