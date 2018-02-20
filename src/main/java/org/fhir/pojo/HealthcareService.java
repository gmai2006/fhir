/*
 * #%L
 * FHIR Implementation
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
 
/**
 * This code is 100% AUTO generated. Please do not modify it DIRECTLY
 * If you need new features or function or changes please update the templates
 * then submit the template through our web interface.  
 */

package org.fhir.pojo;
import org.fhir.entity.HealthcareServiceModel;
import com.google.gson.GsonBuilder;

/**
* "The details of a healthcare service available at a location."
*/
public class HealthcareService  extends DomainResource  {
  /**
  * Description: "This is a HealthcareService resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "External identifiers for this item."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Whether this healthcareservice record is in active use."
  */
  protected Boolean active;

  /**
  * Description: "Extensions for active"
  */
  protected transient Element _active;

  /**
  * Description: "The organization that provides this healthcare service."
  */
  protected Reference providedBy;

  /**
  * Description: "Identifies the broad category of service being performed or delivered."
  */
  protected CodeableConcept category;

  /**
  * Description: "The specific type of service that may be delivered or performed."
  */
  protected java.util.List<CodeableConcept> type = new java.util.ArrayList<>();

  /**
  * Description: "Collection of specialties handled by the service site. This is more of a medical term."
  */
  protected java.util.List<CodeableConcept> specialty = new java.util.ArrayList<>();

  /**
  * Description: "The location(s) where this healthcare service may be provided."
  */
  protected java.util.List<Reference> location = new java.util.ArrayList<>();

  /**
  * Description: "Further description of the service as it would be presented to a consumer while searching."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName."
  */
  protected String comment;

  /**
  * Description: "Extensions for comment"
  */
  protected transient Element _comment;

  /**
  * Description: "Extra details about the service that can't be placed in the other fields."
  */
  protected String extraDetails;

  /**
  * Description: "Extensions for extraDetails"
  */
  protected transient Element _extraDetails;

  /**
  * Description: "If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list."
  */
  protected Attachment photo;

  /**
  * Description: "List of contacts related to this specific healthcare service."
  */
  protected java.util.List<ContactPoint> telecom = new java.util.ArrayList<>();

  /**
  * Description: "The location(s) that this service is available to (not where the service is provided)."
  */
  protected java.util.List<Reference> coverageArea = new java.util.ArrayList<>();

  /**
  * Description: "The code(s) that detail the conditions under which the healthcare service is available/offered."
  */
  protected java.util.List<CodeableConcept> serviceProvisionCode = new java.util.ArrayList<>();

  /**
  * Description: "Does this service have specific eligibility requirements that need to be met in order to use the service?"
  */
  protected CodeableConcept eligibility;

  /**
  * Description: "Describes the eligibility conditions for the service."
  */
  protected String eligibilityNote;

  /**
  * Description: "Extensions for eligibilityNote"
  */
  protected transient Element _eligibilityNote;

  /**
  * Description: "Program Names that can be used to categorize the service."
  */
  protected java.util.List<String> programName = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for programName"
  */
  protected transient java.util.List<Element> _programName = new java.util.ArrayList<>();

  /**
  * Description: "Collection of characteristics (attributes)."
  */
  protected java.util.List<CodeableConcept> characteristic = new java.util.ArrayList<>();

  /**
  * Description: "Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required."
  */
  protected java.util.List<CodeableConcept> referralMethod = new java.util.ArrayList<>();

  /**
  * Description: "Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service."
  */
  protected Boolean appointmentRequired;

  /**
  * Description: "Extensions for appointmentRequired"
  */
  protected transient Element _appointmentRequired;

  /**
  * Description: "A collection of times that the Service Site is available."
  */
  protected java.util.List<HealthcareServiceAvailableTime> availableTime = new java.util.ArrayList<>();

  /**
  * Description: "The HealthcareService is not available during this period of time due to the provided reason."
  */
  protected java.util.List<HealthcareServiceNotAvailable> notAvailable = new java.util.ArrayList<>();

  /**
  * Description: "A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times."
  */
  protected String availabilityExceptions;

  /**
  * Description: "Extensions for availabilityExceptions"
  */
  protected transient Element _availabilityExceptions;

  /**
  * Description: "Technical endpoints providing access to services operated for the specific healthcare services defined at this resource."
  */
  protected java.util.List<Reference> endpoint = new java.util.ArrayList<>();

  public HealthcareService() {
  }

  public HealthcareService(HealthcareServiceModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getActive()) {
      this.active = o.getActive();
    }
    if (null != o.getProvidedBy() && !o.getProvidedBy().isEmpty()) {
      this.providedBy = new Reference(o.getProvidedBy().get(0));
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
      this.category = new CodeableConcept(o.getCategory().get(0));
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type = CodeableConceptHelper.fromArray2Array(o.getType());
    }
    if (null != o.getSpecialty() && !o.getSpecialty().isEmpty()) {
    	this.specialty = CodeableConceptHelper.fromArray2Array(o.getSpecialty());
    }
    if (null != o.getLocation() && !o.getLocation().isEmpty()) {
    	this.location = ReferenceHelper.fromArray2Array(o.getLocation());
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getComment()) {
      this.comment = o.getComment();
    }
    if (null != o.getExtraDetails()) {
      this.extraDetails = o.getExtraDetails();
    }
    this.photo = AttachmentHelper.fromJson(o.getPhoto());
    if (null != o.getCoverageArea() && !o.getCoverageArea().isEmpty()) {
    	this.coverageArea = ReferenceHelper.fromArray2Array(o.getCoverageArea());
    }
    if (null != o.getServiceProvisionCode() && !o.getServiceProvisionCode().isEmpty()) {
    	this.serviceProvisionCode = CodeableConceptHelper.fromArray2Array(o.getServiceProvisionCode());
    }
    if (null != o.getEligibility() && !o.getEligibility().isEmpty()) {
      this.eligibility = new CodeableConcept(o.getEligibility().get(0));
    }
    if (null != o.getEligibilityNote()) {
      this.eligibilityNote = o.getEligibilityNote();
    }
    if (o.getProgramName() != null) {
    	this.programName = org.fhir.utils.JsonUtils.json2Array(o.getProgramName());
    }
    if (null != o.getCharacteristic() && !o.getCharacteristic().isEmpty()) {
    	this.characteristic = CodeableConceptHelper.fromArray2Array(o.getCharacteristic());
    }
    if (null != o.getReferralMethod() && !o.getReferralMethod().isEmpty()) {
    	this.referralMethod = CodeableConceptHelper.fromArray2Array(o.getReferralMethod());
    }
    if (null != o.getAppointmentRequired()) {
      this.appointmentRequired = o.getAppointmentRequired();
    }
    if (null != o.getAvailableTime() && !o.getAvailableTime().isEmpty()) {
    	this.availableTime = HealthcareServiceAvailableTimeHelper.fromArray2Array(o.getAvailableTime());
    }
    if (null != o.getNotAvailable() && !o.getNotAvailable().isEmpty()) {
    	this.notAvailable = HealthcareServiceNotAvailableHelper.fromArray2Array(o.getNotAvailable());
    }
    if (null != o.getAvailabilityExceptions()) {
      this.availabilityExceptions = o.getAvailabilityExceptions();
    }
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint = ReferenceHelper.fromArray2Array(o.getEndpoint());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setActive( Boolean value) {
    this.active = value;
  }
  public Boolean getActive() {
    return this.active;
  }
  public void set_active( Element value) {
    this._active = value;
  }
  public Element get_active() {
    return this._active;
  }
  public void setProvidedBy( Reference value) {
    this.providedBy = value;
  }
  public Reference getProvidedBy() {
    return this.providedBy;
  }
  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setType( java.util.List<CodeableConcept> value) {
    this.type = value;
  }
  public java.util.List<CodeableConcept> getType() {
    return this.type;
  }
  public void setSpecialty( java.util.List<CodeableConcept> value) {
    this.specialty = value;
  }
  public java.util.List<CodeableConcept> getSpecialty() {
    return this.specialty;
  }
  public void setLocation( java.util.List<Reference> value) {
    this.location = value;
  }
  public java.util.List<Reference> getLocation() {
    return this.location;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void set_comment( Element value) {
    this._comment = value;
  }
  public Element get_comment() {
    return this._comment;
  }
  public void setExtraDetails( String value) {
    this.extraDetails = value;
  }
  public String getExtraDetails() {
    return this.extraDetails;
  }
  public void set_extraDetails( Element value) {
    this._extraDetails = value;
  }
  public Element get_extraDetails() {
    return this._extraDetails;
  }
  public void setPhoto( Attachment value) {
    this.photo = value;
  }
  public Attachment getPhoto() {
    return this.photo;
  }
  public void setTelecom( java.util.List<ContactPoint> value) {
    this.telecom = value;
  }
  public java.util.List<ContactPoint> getTelecom() {
    return this.telecom;
  }
  public void setCoverageArea( java.util.List<Reference> value) {
    this.coverageArea = value;
  }
  public java.util.List<Reference> getCoverageArea() {
    return this.coverageArea;
  }
  public void setServiceProvisionCode( java.util.List<CodeableConcept> value) {
    this.serviceProvisionCode = value;
  }
  public java.util.List<CodeableConcept> getServiceProvisionCode() {
    return this.serviceProvisionCode;
  }
  public void setEligibility( CodeableConcept value) {
    this.eligibility = value;
  }
  public CodeableConcept getEligibility() {
    return this.eligibility;
  }
  public void setEligibilityNote( String value) {
    this.eligibilityNote = value;
  }
  public String getEligibilityNote() {
    return this.eligibilityNote;
  }
  public void set_eligibilityNote( Element value) {
    this._eligibilityNote = value;
  }
  public Element get_eligibilityNote() {
    return this._eligibilityNote;
  }
  public void setProgramName( java.util.List<String> value) {
    this.programName = value;
  }
  public java.util.List<String> getProgramName() {
    return this.programName;
  }
  public void set_programName( java.util.List<Element> value) {
    this._programName = value;
  }
  public java.util.List<Element> get_programName() {
    return this._programName;
  }
  public void setCharacteristic( java.util.List<CodeableConcept> value) {
    this.characteristic = value;
  }
  public java.util.List<CodeableConcept> getCharacteristic() {
    return this.characteristic;
  }
  public void setReferralMethod( java.util.List<CodeableConcept> value) {
    this.referralMethod = value;
  }
  public java.util.List<CodeableConcept> getReferralMethod() {
    return this.referralMethod;
  }
  public void setAppointmentRequired( Boolean value) {
    this.appointmentRequired = value;
  }
  public Boolean getAppointmentRequired() {
    return this.appointmentRequired;
  }
  public void set_appointmentRequired( Element value) {
    this._appointmentRequired = value;
  }
  public Element get_appointmentRequired() {
    return this._appointmentRequired;
  }
  public void setAvailableTime( java.util.List<HealthcareServiceAvailableTime> value) {
    this.availableTime = value;
  }
  public java.util.List<HealthcareServiceAvailableTime> getAvailableTime() {
    return this.availableTime;
  }
  public void setNotAvailable( java.util.List<HealthcareServiceNotAvailable> value) {
    this.notAvailable = value;
  }
  public java.util.List<HealthcareServiceNotAvailable> getNotAvailable() {
    return this.notAvailable;
  }
  public void setAvailabilityExceptions( String value) {
    this.availabilityExceptions = value;
  }
  public String getAvailabilityExceptions() {
    return this.availabilityExceptions;
  }
  public void set_availabilityExceptions( Element value) {
    this._availabilityExceptions = value;
  }
  public Element get_availabilityExceptions() {
    return this._availabilityExceptions;
  }
  public void setEndpoint( java.util.List<Reference> value) {
    this.endpoint = value;
  }
  public java.util.List<Reference> getEndpoint() {
    return this.endpoint;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[HealthcareService]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.active != null) builder.append("active" + "->" + this.active.toString() + "\n"); 
     if(this._active != null) builder.append("_active" + "->" + this._active.toString() + "\n"); 
     if(this.providedBy != null) builder.append("providedBy" + "->" + this.providedBy.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.specialty != null) builder.append("specialty" + "->" + this.specialty.toString() + "\n"); 
     if(this.location != null) builder.append("location" + "->" + this.location.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.comment != null) builder.append("comment" + "->" + this.comment.toString() + "\n"); 
     if(this._comment != null) builder.append("_comment" + "->" + this._comment.toString() + "\n"); 
     if(this.extraDetails != null) builder.append("extraDetails" + "->" + this.extraDetails.toString() + "\n"); 
     if(this._extraDetails != null) builder.append("_extraDetails" + "->" + this._extraDetails.toString() + "\n"); 
     if(this.photo != null) builder.append("photo" + "->" + this.photo.toString() + "\n"); 
     if(this.telecom != null) builder.append("telecom" + "->" + this.telecom.toString() + "\n"); 
     if(this.coverageArea != null) builder.append("coverageArea" + "->" + this.coverageArea.toString() + "\n"); 
     if(this.serviceProvisionCode != null) builder.append("serviceProvisionCode" + "->" + this.serviceProvisionCode.toString() + "\n"); 
     if(this.eligibility != null) builder.append("eligibility" + "->" + this.eligibility.toString() + "\n"); 
     if(this.eligibilityNote != null) builder.append("eligibilityNote" + "->" + this.eligibilityNote.toString() + "\n"); 
     if(this._eligibilityNote != null) builder.append("_eligibilityNote" + "->" + this._eligibilityNote.toString() + "\n"); 
     if(this.programName != null) builder.append("programName" + "->" + this.programName.toString() + "\n"); 
     if(this._programName != null) builder.append("_programName" + "->" + this._programName.toString() + "\n"); 
     if(this.characteristic != null) builder.append("characteristic" + "->" + this.characteristic.toString() + "\n"); 
     if(this.referralMethod != null) builder.append("referralMethod" + "->" + this.referralMethod.toString() + "\n"); 
     if(this.appointmentRequired != null) builder.append("appointmentRequired" + "->" + this.appointmentRequired.toString() + "\n"); 
     if(this._appointmentRequired != null) builder.append("_appointmentRequired" + "->" + this._appointmentRequired.toString() + "\n"); 
     if(this.availableTime != null) builder.append("availableTime" + "->" + this.availableTime.toString() + "\n"); 
     if(this.notAvailable != null) builder.append("notAvailable" + "->" + this.notAvailable.toString() + "\n"); 
     if(this.availabilityExceptions != null) builder.append("availabilityExceptions" + "->" + this.availabilityExceptions.toString() + "\n"); 
     if(this._availabilityExceptions != null) builder.append("_availabilityExceptions" + "->" + this._availabilityExceptions.toString() + "\n"); 
     if(this.endpoint != null) builder.append("endpoint" + "->" + this.endpoint.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	HealthcareService,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "HealthcareService" : { return HealthcareService.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}