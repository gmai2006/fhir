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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;

/**
* "The details of a healthcare service available at a location."
*/
@Entity
@Table(name="healthcareservice")
public class HealthcareServiceModel  {
  /**
  * Description: "This is a HealthcareService resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "External identifiers for this item."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Whether this healthcareservice record is in active use."
  */
  @javax.persistence.Basic
  @Column(name="\"active\"")
  private Boolean active;

  /**
  * Description: "The organization that provides this healthcare service."
  */
  @javax.persistence.Basic
  @Column(name="\"providedby_id\"")
  private String providedby_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`providedby_id`", insertable=false, updatable=false)
  private ReferenceModel providedBy;

  /**
  * Description: "Identifies the broad category of service being performed or delivered."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "The specific type of service that may be delivered or performed."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "Collection of specialties handled by the service site. This is more of a medical term."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"specialty\"", length = 16777215)
  private String specialty;

  /**
  * Description: "The location(s) where this healthcare service may be provided."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> location = new java.util.ArrayList<>();

  /**
  * Description: "Further description of the service as it would be presented to a consumer while searching."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName."
  */
  @javax.persistence.Basic
  @Column(name="\"comment\"")
  private String comment;

  /**
  * Description: "Extra details about the service that can't be placed in the other fields."
  */
  @javax.persistence.Basic
  @Column(name="\"extraDetails\"")
  private String extraDetails;

  /**
  * Description: "If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list."
  * Actual type: Attachment
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"photo\"", length = 16777215)
  private String photo;

  /**
  * Description: "List of contacts related to this specific healthcare service."
  * Actual type: Array of ContactPoint-> List<ContactPoint>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"telecom\"", length = 16777215)
  private String telecom;

  /**
  * Description: "The location(s) that this service is available to (not where the service is provided)."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> coverageArea = new java.util.ArrayList<>();

  /**
  * Description: "The code(s) that detail the conditions under which the healthcare service is available/offered."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"serviceProvisionCode\"", length = 16777215)
  private String serviceProvisionCode;

  /**
  * Description: "Does this service have specific eligibility requirements that need to be met in order to use the service?"
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"eligibility\"", length = 16777215)
  private String eligibility;

  /**
  * Description: "Describes the eligibility conditions for the service."
  */
  @javax.persistence.Basic
  @Column(name="\"eligibilityNote\"")
  private String eligibilityNote;

  /**
  * Description: "Program Names that can be used to categorize the service."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"programName\"", length = 16777215)
  private String programName;

  /**
  * Description: "Collection of characteristics (attributes)."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"characteristic\"", length = 16777215)
  private String characteristic;

  /**
  * Description: "Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"referralMethod\"", length = 16777215)
  private String referralMethod;

  /**
  * Description: "Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service."
  */
  @javax.persistence.Basic
  @Column(name="\"appointmentRequired\"")
  private Boolean appointmentRequired;

  /**
  * Description: "A collection of times that the Service Site is available."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<HealthcareServiceAvailableTimeModel> availableTime = new java.util.ArrayList<>();

  /**
  * Description: "The HealthcareService is not available during this period of time due to the provided reason."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<HealthcareServiceNotAvailableModel> notAvailable = new java.util.ArrayList<>();

  /**
  * Description: "A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times."
  */
  @javax.persistence.Basic
  @Column(name="\"availabilityExceptions\"")
  private String availabilityExceptions;

  /**
  * Description: "Technical endpoints providing access to services operated for the specific healthcare services defined at this resource."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> endpoint = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;


  public HealthcareServiceModel() {
  }

  public HealthcareServiceModel(HealthcareService o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.active = o.getActive();

      if (null != o.getProvidedBy()) {
      	this.providedby_id = "providedBy" + this.getId();
        this.providedBy = new ReferenceModel(o.getProvidedBy());
        this.providedBy.setId(this.providedby_id);
        this.providedBy.parent_id = this.providedBy.getId();
      }

      this.category = CodeableConcept.toJson(o.getCategory());
      this.type = CodeableConcept.toJson(o.getType());
      this.specialty = CodeableConcept.toJson(o.getSpecialty());
      this.location = Reference.toModelArray(o.getLocation());

      this.name = o.getName();

      this.comment = o.getComment();

      this.extraDetails = o.getExtraDetails();

      this.photo = Attachment.toJson(o.getPhoto());
      this.telecom = ContactPoint.toJson(o.getTelecom());
      this.coverageArea = Reference.toModelArray(o.getCoverageArea());

      this.serviceProvisionCode = CodeableConcept.toJson(o.getServiceProvisionCode());
      this.eligibility = CodeableConcept.toJson(o.getEligibility());
      this.eligibilityNote = o.getEligibilityNote();

      this.programName = org.fhir.utils.JsonUtils.write2String(o.getProgramName());

      this.characteristic = CodeableConcept.toJson(o.getCharacteristic());
      this.referralMethod = CodeableConcept.toJson(o.getReferralMethod());
      this.appointmentRequired = o.getAppointmentRequired();

      this.availableTime = HealthcareServiceAvailableTime.toModelArray(o.getAvailableTime());

      this.notAvailable = HealthcareServiceNotAvailable.toModelArray(o.getNotAvailable());

      this.availabilityExceptions = o.getAvailabilityExceptions();

      this.endpoint = Reference.toModelArray(o.getEndpoint());

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setActive( Boolean value) {
    this.active = value;
  }
  public Boolean getActive() {
    return this.active;
  }
  public void setProvidedBy( ReferenceModel value) {
    this.providedBy = value;
  }
  public ReferenceModel getProvidedBy() {
    return this.providedBy;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setSpecialty( String value) {
    this.specialty = value;
  }
  public String getSpecialty() {
    return this.specialty;
  }
  public void setLocation( java.util.List<ReferenceModel> value) {
    this.location = value;
  }
  public java.util.List<ReferenceModel> getLocation() {
    return this.location;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setExtraDetails( String value) {
    this.extraDetails = value;
  }
  public String getExtraDetails() {
    return this.extraDetails;
  }
  public void setPhoto( String value) {
    this.photo = value;
  }
  public String getPhoto() {
    return this.photo;
  }
  public void setTelecom( String value) {
    this.telecom = value;
  }
  public String getTelecom() {
    return this.telecom;
  }
  public void setCoverageArea( java.util.List<ReferenceModel> value) {
    this.coverageArea = value;
  }
  public java.util.List<ReferenceModel> getCoverageArea() {
    return this.coverageArea;
  }
  public void setServiceProvisionCode( String value) {
    this.serviceProvisionCode = value;
  }
  public String getServiceProvisionCode() {
    return this.serviceProvisionCode;
  }
  public void setEligibility( String value) {
    this.eligibility = value;
  }
  public String getEligibility() {
    return this.eligibility;
  }
  public void setEligibilityNote( String value) {
    this.eligibilityNote = value;
  }
  public String getEligibilityNote() {
    return this.eligibilityNote;
  }
  public void setProgramName( String value) {
    this.programName = value;
  }
  public String getProgramName() {
    return this.programName;
  }
  public void setCharacteristic( String value) {
    this.characteristic = value;
  }
  public String getCharacteristic() {
    return this.characteristic;
  }
  public void setReferralMethod( String value) {
    this.referralMethod = value;
  }
  public String getReferralMethod() {
    return this.referralMethod;
  }
  public void setAppointmentRequired( Boolean value) {
    this.appointmentRequired = value;
  }
  public Boolean getAppointmentRequired() {
    return this.appointmentRequired;
  }
  public void setAvailableTime( java.util.List<HealthcareServiceAvailableTimeModel> value) {
    this.availableTime = value;
  }
  public java.util.List<HealthcareServiceAvailableTimeModel> getAvailableTime() {
    return this.availableTime;
  }
  public void setNotAvailable( java.util.List<HealthcareServiceNotAvailableModel> value) {
    this.notAvailable = value;
  }
  public java.util.List<HealthcareServiceNotAvailableModel> getNotAvailable() {
    return this.notAvailable;
  }
  public void setAvailabilityExceptions( String value) {
    this.availabilityExceptions = value;
  }
  public String getAvailabilityExceptions() {
    return this.availabilityExceptions;
  }
  public void setEndpoint( java.util.List<ReferenceModel> value) {
    this.endpoint = value;
  }
  public java.util.List<ReferenceModel> getEndpoint() {
    return this.endpoint;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("active" + "[" + String.valueOf(this.active) + "]\n"); 
     builder.append("providedBy" + "[" + String.valueOf(this.providedBy) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("specialty" + "[" + String.valueOf(this.specialty) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("comment" + "[" + String.valueOf(this.comment) + "]\n"); 
     builder.append("extraDetails" + "[" + String.valueOf(this.extraDetails) + "]\n"); 
     builder.append("photo" + "[" + String.valueOf(this.photo) + "]\n"); 
     builder.append("telecom" + "[" + String.valueOf(this.telecom) + "]\n"); 
     builder.append("coverageArea" + "[" + String.valueOf(this.coverageArea) + "]\n"); 
     builder.append("serviceProvisionCode" + "[" + String.valueOf(this.serviceProvisionCode) + "]\n"); 
     builder.append("eligibility" + "[" + String.valueOf(this.eligibility) + "]\n"); 
     builder.append("eligibilityNote" + "[" + String.valueOf(this.eligibilityNote) + "]\n"); 
     builder.append("programName" + "[" + String.valueOf(this.programName) + "]\n"); 
     builder.append("characteristic" + "[" + String.valueOf(this.characteristic) + "]\n"); 
     builder.append("referralMethod" + "[" + String.valueOf(this.referralMethod) + "]\n"); 
     builder.append("appointmentRequired" + "[" + String.valueOf(this.appointmentRequired) + "]\n"); 
     builder.append("availableTime" + "[" + String.valueOf(this.availableTime) + "]\n"); 
     builder.append("notAvailable" + "[" + String.valueOf(this.notAvailable) + "]\n"); 
     builder.append("availabilityExceptions" + "[" + String.valueOf(this.availabilityExceptions) + "]\n"); 
     builder.append("endpoint" + "[" + String.valueOf(this.endpoint) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}