//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

import java.util.List;

public class Actions {

    
    protected List<PublishToWebAction> publishToWebAction;
    
    protected List<PublishToMobileAction> publishToMobileAction;
    
    protected PublishToTvAction publishToTvAction;
    
    protected List<PublishToAlertsAction> publishToAlertsAction;
    
    protected List<ManualAction> manualAction;
    
    protected List<NotifyByEmailAction> notifyByEmailAction;
    
    protected NotifyBySmsAction notifyBySmsAction;
    
    protected List<NotifyByPagerAction> notifyByPagerAction;
    
    protected List<NotifyUserAction> notifyUserAction;
    
    protected Object extensions;

    public List<ManualAction> getManualAction() {
		return manualAction;
	}
    
    public List<NotifyByEmailAction> getNotifyByEmailAction() {
		return notifyByEmailAction;
	}
    
    public List<NotifyByPagerAction> getNotifyByPagerAction() {
		return notifyByPagerAction;
	}
    
    public NotifyBySmsAction getNotifyBySmsAction() {
		return notifyBySmsAction;
	}
    
    public List<NotifyUserAction> getNotifyUserAction() {
		return notifyUserAction;
	}
    
    public List<PublishToAlertsAction> getPublishToAlertsAction() {
		return publishToAlertsAction;
	}
    
    public List<PublishToMobileAction> getPublishToMobileAction() {
		return publishToMobileAction;
	}
    
    public PublishToTvAction getPublishToTvAction() {
		return publishToTvAction;
	}
    
    public void setManualAction(List<ManualAction> manualAction) {
		this.manualAction = manualAction;
	}
    
    public List<PublishToWebAction> getPublishToWebAction() {
		return publishToWebAction;
	}
    
    public void setNotifyByEmailAction(
			List<NotifyByEmailAction> notifyByEmailAction) {
		this.notifyByEmailAction = notifyByEmailAction;
	}
    
    public void setNotifyByPagerAction(
			List<NotifyByPagerAction> notifyByPagerAction) {
		this.notifyByPagerAction = notifyByPagerAction;
	}
    
    public void setNotifyBySmsAction(NotifyBySmsAction notifyBySmsAction) {
		this.notifyBySmsAction = notifyBySmsAction;
	}
    
    public void setNotifyUserAction(List<NotifyUserAction> notifyUserAction) {
		this.notifyUserAction = notifyUserAction;
	}
    
    public void setPublishToAlertsAction(
			List<PublishToAlertsAction> publishToAlertsAction) {
		this.publishToAlertsAction = publishToAlertsAction;
	}
    
    public void setPublishToMobileAction(
			List<PublishToMobileAction> publishToMobileAction) {
		this.publishToMobileAction = publishToMobileAction;
	}
    
    public void setPublishToTvAction(PublishToTvAction publishToTvAction) {
		this.publishToTvAction = publishToTvAction;
	}
    
    public void setPublishToWebAction(
			List<PublishToWebAction> publishToWebAction) {
		this.publishToWebAction = publishToWebAction;
	}
    
    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtensions(Object value) {
        this.extensions = value;
    }

}
