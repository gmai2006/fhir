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
public class HealthcareService  {
  /**
  * Description: "This is a HealthcareService resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "External identifiers for this item."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Whether this healthcareservice record is in active use."
  */
  private Boolean active;

  /**
  * Description: "Extensions for active"
  */
  private transient Element _active;

  /**
  * Description: "The organization that provides this healthcare service."
  */
  private Reference providedBy;

  /**
  * Description: "Identifies the broad category of service being performed or delivered."
  */
  private CodeableConcept category;

  /**
  * Description: "The specific type of service that may be delivered or performed."
  */
  private java.util.List<CodeableConcept> type = new java.util.ArrayList<>();

  /**
  * Description: "Collection of specialties handled by the service site. This is more of a medical term."
  */
  private java.util.List<CodeableConcept> specialty = new java.util.ArrayList<>();

  /**
  * Description: "The location(s) where this healthcare service may be provided."
  */
  private java.util.List<Reference> location = new java.util.ArrayList<>();

  /**
  * Description: "Further description of the service as it would be presented to a consumer while searching."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName."
  */
  private String comment;

  /**
  * Description: "Extensions for comment"
  */
  private transient Element _comment;

  /**
  * Description: "Extra details about the service that can't be placed in the other fields."
  */
  private String extraDetails;

  /**
  * Description: "Extensions for extraDetails"
  */
  private transient Element _extraDetails;

  /**
  * Description: "If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list."
  */
  private Attachment photo;

  /**
  * Description: "List of contacts related to this specific healthcare service."
  */
  private java.util.List<ContactPoint> telecom = new java.util.ArrayList<>();

  /**
  * Description: "The location(s) that this service is available to (not where the service is provided)."
  */
  private java.util.List<Reference> coverageArea = new java.util.ArrayList<>();

  /**
  * Description: "The code(s) that detail the conditions under which the healthcare service is available/offered."
  */
  private java.util.List<CodeableConcept> serviceProvisionCode = new java.util.ArrayList<>();

  /**
  * Description: "Does this service have specific eligibility requirements that need to be met in order to use the service?"
  */
  private CodeableConcept eligibility;

  /**
  * Description: "Describes the eligibility conditions for the service."
  */
  private String eligibilityNote;

  /**
  * Description: "Extensions for eligibilityNote"
  */
  private transient Element _eligibilityNote;

  /**
  * Description: "Program Names that can be used to categorize the service."
  */
  private java.util.List<String> programName = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for programName"
  */
  private transient java.util.List<Element> _programName = new java.util.ArrayList<>();

  /**
  * Description: "Collection of characteristics (attributes)."
  */
  private java.util.List<CodeableConcept> characteristic = new java.util.ArrayList<>();

  /**
  * Description: "Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required."
  */
  private java.util.List<CodeableConcept> referralMethod = new java.util.ArrayList<>();

  /**
  * Description: "Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service."
  */
  private Boolean appointmentRequired;

  /**
  * Description: "Extensions for appointmentRequired"
  */
  private transient Element _appointmentRequired;

  /**
  * Description: "A collection of times that the Service Site is available."
  */
  private java.util.List<HealthcareServiceAvailableTime> availableTime = new java.util.ArrayList<>();

  /**
  * Description: "The HealthcareService is not available during this period of time due to the provided reason."
  */
  private java.util.List<HealthcareServiceNotAvailable> notAvailable = new java.util.ArrayList<>();

  /**
  * Description: "A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times."
  */
  private String availabilityExceptions;

  /**
  * Description: "Extensions for availabilityExceptions"
  */
  private transient Element _availabilityExceptions;

  /**
  * Description: "Technical endpoints providing access to services operated for the specific healthcare services defined at this resource."
  */
  private java.util.List<Reference> endpoint = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public HealthcareService() {
  }

  public HealthcareService(HealthcareServiceModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getActive()) {
        this.active = new Boolean(o.getActive());
      }

      if (null != o.getProvidedBy()) {
        this.providedBy = new Reference(o.getProvidedBy());
        this.providedBy.setId(this.getId());
      }

      this.category = CodeableConcept.fromJson(o.getCategory());
      this.type = CodeableConcept.fromArray(o.getType());
      this.specialty = CodeableConcept.fromArray(o.getSpecialty());
      this.location = Reference.fromArray(o.getLocation());

      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getComment()) {
        this.comment = new String(o.getComment());
      }

      if (null != o.getExtraDetails()) {
        this.extraDetails = new String(o.getExtraDetails());
      }

      this.photo = Attachment.fromJson(o.getPhoto());
      this.telecom = ContactPoint.fromArray(o.getTelecom());
      this.coverageArea = Reference.fromArray(o.getCoverageArea());

      this.serviceProvisionCode = CodeableConcept.fromArray(o.getServiceProvisionCode());
      this.eligibility = CodeableConcept.fromJson(o.getEligibility());
      if (null != o.getEligibilityNote()) {
        this.eligibilityNote = new String(o.getEligibilityNote());
      }

      this.programName = org.fhir.utils.JsonUtils.json2Array(o.getProgramName());

      this.characteristic = CodeableConcept.fromArray(o.getCharacteristic());
      this.referralMethod = CodeableConcept.fromArray(o.getReferralMethod());
      if (null != o.getAppointmentRequired()) {
        this.appointmentRequired = new Boolean(o.getAppointmentRequired());
      }

      this.availableTime = HealthcareServiceAvailableTime.fromArray(o.getAvailableTime());

      this.notAvailable = HealthcareServiceNotAvailable.fromArray(o.getNotAvailable());

      if (null != o.getAvailabilityExceptions()) {
        this.availabilityExceptions = new String(o.getAvailabilityExceptions());
      }

      this.endpoint = Reference.fromArray(o.getEndpoint());

      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
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
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("active" + "[" + String.valueOf(this.active) + "]\n"); 
     builder.append("_active" + "[" + String.valueOf(this._active) + "]\n"); 
     builder.append("providedBy" + "[" + String.valueOf(this.providedBy) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("specialty" + "[" + String.valueOf(this.specialty) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("comment" + "[" + String.valueOf(this.comment) + "]\n"); 
     builder.append("_comment" + "[" + String.valueOf(this._comment) + "]\n"); 
     builder.append("extraDetails" + "[" + String.valueOf(this.extraDetails) + "]\n"); 
     builder.append("_extraDetails" + "[" + String.valueOf(this._extraDetails) + "]\n"); 
     builder.append("photo" + "[" + String.valueOf(this.photo) + "]\n"); 
     builder.append("telecom" + "[" + String.valueOf(this.telecom) + "]\n"); 
     builder.append("coverageArea" + "[" + String.valueOf(this.coverageArea) + "]\n"); 
     builder.append("serviceProvisionCode" + "[" + String.valueOf(this.serviceProvisionCode) + "]\n"); 
     builder.append("eligibility" + "[" + String.valueOf(this.eligibility) + "]\n"); 
     builder.append("eligibilityNote" + "[" + String.valueOf(this.eligibilityNote) + "]\n"); 
     builder.append("_eligibilityNote" + "[" + String.valueOf(this._eligibilityNote) + "]\n"); 
     builder.append("programName" + "[" + String.valueOf(this.programName) + "]\n"); 
     builder.append("_programName" + "[" + String.valueOf(this._programName) + "]\n"); 
     builder.append("characteristic" + "[" + String.valueOf(this.characteristic) + "]\n"); 
     builder.append("referralMethod" + "[" + String.valueOf(this.referralMethod) + "]\n"); 
     builder.append("appointmentRequired" + "[" + String.valueOf(this.appointmentRequired) + "]\n"); 
     builder.append("_appointmentRequired" + "[" + String.valueOf(this._appointmentRequired) + "]\n"); 
     builder.append("availableTime" + "[" + String.valueOf(this.availableTime) + "]\n"); 
     builder.append("notAvailable" + "[" + String.valueOf(this.notAvailable) + "]\n"); 
     builder.append("availabilityExceptions" + "[" + String.valueOf(this.availabilityExceptions) + "]\n"); 
     builder.append("_availabilityExceptions" + "[" + String.valueOf(this._availabilityExceptions) + "]\n"); 
     builder.append("endpoint" + "[" + String.valueOf(this.endpoint) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
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

  public static java.util.List<HealthcareService> fromArray(java.util.List<HealthcareServiceModel> list) {
    return (java.util.List<HealthcareService>)list.stream()
      .map(model -> new HealthcareService(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<HealthcareServiceModel> toModelArray(java.util.List<HealthcareService> list) {
    return (java.util.List<HealthcareServiceModel>)list.stream()
      .map(model -> new HealthcareServiceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static HealthcareService fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, HealthcareService.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(HealthcareService o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<HealthcareService> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}