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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "The details of a healthcare service available at a location."
*/
@Entity
@Table(name="healthcareservice")
public class HealthcareServiceModel  implements Serializable {
	private static final long serialVersionUID = 151967883152266517L;
  /**
  * Description: "This is a HealthcareService resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "External identifiers for this item."
  * Actual type: List<String>;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="providedby_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> providedBy;

  /**
  * Description: "Identifies the broad category of service being performed or delivered."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "The specific type of service that may be delivered or performed."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "Collection of specialties handled by the service site. This is more of a medical term."
  */
  @javax.persistence.Basic
  @Column(name="\"specialty_id\"")
  private String specialty_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="specialty_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> specialty;

  /**
  * Description: "The location(s) where this healthcare service may be provided."
  */
  @javax.persistence.Basic
  @Column(name="\"location_id\"")
  private String location_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="location_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> location;

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
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"photo\"", length = 16777215)
  private String photo;

  /**
  * Description: "List of contacts related to this specific healthcare service."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"telecom\"", length = 16777215)
  private String telecom;

  /**
  * Description: "The location(s) that this service is available to (not where the service is provided)."
  */
  @javax.persistence.Basic
  @Column(name="\"coveragearea_id\"")
  private String coveragearea_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="coveragearea_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> coverageArea;

  /**
  * Description: "The code(s) that detail the conditions under which the healthcare service is available/offered."
  */
  @javax.persistence.Basic
  @Column(name="\"serviceprovisioncode_id\"")
  private String serviceprovisioncode_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="serviceprovisioncode_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> serviceProvisionCode;

  /**
  * Description: "Does this service have specific eligibility requirements that need to be met in order to use the service?"
  */
  @javax.persistence.Basic
  @Column(name="\"eligibility_id\"")
  private String eligibility_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="eligibility_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> eligibility;

  /**
  * Description: "Describes the eligibility conditions for the service."
  */
  @javax.persistence.Basic
  @Column(name="\"eligibilityNote\"")
  private String eligibilityNote;

  /**
  * Description: "Program Names that can be used to categorize the service."
  */
  @javax.persistence.Basic
  @Column(name="\"programName\"")
  private String programName;

  /**
  * Description: "Collection of characteristics (attributes)."
  */
  @javax.persistence.Basic
  @Column(name="\"characteristic_id\"")
  private String characteristic_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="characteristic_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> characteristic;

  /**
  * Description: "Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required."
  */
  @javax.persistence.Basic
  @Column(name="\"referralmethod_id\"")
  private String referralmethod_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="referralmethod_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> referralMethod;

  /**
  * Description: "Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service."
  */
  @javax.persistence.Basic
  @Column(name="\"appointmentRequired\"")
  private Boolean appointmentRequired;

  /**
  * Description: "A collection of times that the Service Site is available."
  */
  @javax.persistence.Basic
  @Column(name="\"availabletime_id\"")
  private String availabletime_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="availabletime_id", insertable=false, updatable=false)
  private java.util.List<HealthcareServiceAvailableTimeModel> availableTime;

  /**
  * Description: "The HealthcareService is not available during this period of time due to the provided reason."
  */
  @javax.persistence.Basic
  @Column(name="\"notavailable_id\"")
  private String notavailable_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="notavailable_id", insertable=false, updatable=false)
  private java.util.List<HealthcareServiceNotAvailableModel> notAvailable;

  /**
  * Description: "A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times."
  */
  @javax.persistence.Basic
  @Column(name="\"availabilityExceptions\"")
  private String availabilityExceptions;

  /**
  * Description: "Technical endpoints providing access to services operated for the specific healthcare services defined at this resource."
  */
  @javax.persistence.Basic
  @Column(name="\"endpoint_id\"")
  private String endpoint_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="endpoint_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> endpoint;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

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
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.active = o.getActive();
    if (null != o.getProvidedBy() ) {
    	this.providedby_id = "providedby" + this.id;
    	this.providedBy = ReferenceHelper.toModel(o.getProvidedBy(), this.providedby_id);
    }
    if (null != o.getCategory() ) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModel(o.getCategory(), this.category_id);
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModelFromArray(o.getType(), this.type_id);
    }
    if (null != o.getSpecialty() && !o.getSpecialty().isEmpty()) {
    	this.specialty_id = "specialty" + this.id;
    	this.specialty = CodeableConceptHelper.toModelFromArray(o.getSpecialty(), this.specialty_id);
    }
    if (null != o.getLocation() && !o.getLocation().isEmpty()) {
    	this.location_id = "location" + this.id;
    	this.location = ReferenceHelper.toModelFromArray(o.getLocation(), this.location_id);
    }
    this.name = o.getName();
    this.comment = o.getComment();
    this.extraDetails = o.getExtraDetails();
    if (null != o.getPhoto()) {
    	this.photo = JsonUtils.toJson(o.getPhoto());
    }
    if (null != o.getTelecom()) {
    	this.telecom = JsonUtils.toJson(o.getTelecom());
    }
    if (null != o.getCoverageArea() && !o.getCoverageArea().isEmpty()) {
    	this.coveragearea_id = "coveragearea" + this.id;
    	this.coverageArea = ReferenceHelper.toModelFromArray(o.getCoverageArea(), this.coveragearea_id);
    }
    if (null != o.getServiceProvisionCode() && !o.getServiceProvisionCode().isEmpty()) {
    	this.serviceprovisioncode_id = "serviceprovisioncode" + this.id;
    	this.serviceProvisionCode = CodeableConceptHelper.toModelFromArray(o.getServiceProvisionCode(), this.serviceprovisioncode_id);
    }
    if (null != o.getEligibility() ) {
    	this.eligibility_id = "eligibility" + this.id;
    	this.eligibility = CodeableConceptHelper.toModel(o.getEligibility(), this.eligibility_id);
    }
    this.eligibilityNote = o.getEligibilityNote();
    this.programName = org.fhir.utils.JsonUtils.toJson(o.getProgramName());
    if (null != o.getCharacteristic() && !o.getCharacteristic().isEmpty()) {
    	this.characteristic_id = "characteristic" + this.id;
    	this.characteristic = CodeableConceptHelper.toModelFromArray(o.getCharacteristic(), this.characteristic_id);
    }
    if (null != o.getReferralMethod() && !o.getReferralMethod().isEmpty()) {
    	this.referralmethod_id = "referralmethod" + this.id;
    	this.referralMethod = CodeableConceptHelper.toModelFromArray(o.getReferralMethod(), this.referralmethod_id);
    }
    this.appointmentRequired = o.getAppointmentRequired();
    if (null != o.getAvailableTime() && !o.getAvailableTime().isEmpty()) {
    	this.availabletime_id = "availabletime" + this.id;
    	this.availableTime = HealthcareServiceAvailableTimeHelper.toModelFromArray(o.getAvailableTime(), this.availabletime_id);
    }
    if (null != o.getNotAvailable() && !o.getNotAvailable().isEmpty()) {
    	this.notavailable_id = "notavailable" + this.id;
    	this.notAvailable = HealthcareServiceNotAvailableHelper.toModelFromArray(o.getNotAvailable(), this.notavailable_id);
    }
    this.availabilityExceptions = o.getAvailabilityExceptions();
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint_id = "endpoint" + this.id;
    	this.endpoint = ReferenceHelper.toModelFromArray(o.getEndpoint(), this.endpoint_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public Boolean getActive() {
    return this.active;
  }
  public void setActive( Boolean value) {
    this.active = value;
  }
  public java.util.List<ReferenceModel> getProvidedBy() {
    return this.providedBy;
  }
  public void setProvidedBy( java.util.List<ReferenceModel> value) {
    this.providedBy = value;
  }
  public java.util.List<CodeableConceptModel> getCategory() {
    return this.category;
  }
  public void setCategory( java.util.List<CodeableConceptModel> value) {
    this.category = value;
  }
  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public java.util.List<CodeableConceptModel> getSpecialty() {
    return this.specialty;
  }
  public void setSpecialty( java.util.List<CodeableConceptModel> value) {
    this.specialty = value;
  }
  public java.util.List<ReferenceModel> getLocation() {
    return this.location;
  }
  public void setLocation( java.util.List<ReferenceModel> value) {
    this.location = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getExtraDetails() {
    return this.extraDetails;
  }
  public void setExtraDetails( String value) {
    this.extraDetails = value;
  }
  public String getPhoto() {
    return this.photo;
  }
  public void setPhoto( String value) {
    this.photo = value;
  }
  public String getTelecom() {
    return this.telecom;
  }
  public void setTelecom( String value) {
    this.telecom = value;
  }
  public java.util.List<ReferenceModel> getCoverageArea() {
    return this.coverageArea;
  }
  public void setCoverageArea( java.util.List<ReferenceModel> value) {
    this.coverageArea = value;
  }
  public java.util.List<CodeableConceptModel> getServiceProvisionCode() {
    return this.serviceProvisionCode;
  }
  public void setServiceProvisionCode( java.util.List<CodeableConceptModel> value) {
    this.serviceProvisionCode = value;
  }
  public java.util.List<CodeableConceptModel> getEligibility() {
    return this.eligibility;
  }
  public void setEligibility( java.util.List<CodeableConceptModel> value) {
    this.eligibility = value;
  }
  public String getEligibilityNote() {
    return this.eligibilityNote;
  }
  public void setEligibilityNote( String value) {
    this.eligibilityNote = value;
  }
  public String getProgramName() {
    return this.programName;
  }
  public void setProgramName( String value) {
    this.programName = value;
  }
  public java.util.List<CodeableConceptModel> getCharacteristic() {
    return this.characteristic;
  }
  public void setCharacteristic( java.util.List<CodeableConceptModel> value) {
    this.characteristic = value;
  }
  public java.util.List<CodeableConceptModel> getReferralMethod() {
    return this.referralMethod;
  }
  public void setReferralMethod( java.util.List<CodeableConceptModel> value) {
    this.referralMethod = value;
  }
  public Boolean getAppointmentRequired() {
    return this.appointmentRequired;
  }
  public void setAppointmentRequired( Boolean value) {
    this.appointmentRequired = value;
  }
  public java.util.List<HealthcareServiceAvailableTimeModel> getAvailableTime() {
    return this.availableTime;
  }
  public void setAvailableTime( java.util.List<HealthcareServiceAvailableTimeModel> value) {
    this.availableTime = value;
  }
  public java.util.List<HealthcareServiceNotAvailableModel> getNotAvailable() {
    return this.notAvailable;
  }
  public void setNotAvailable( java.util.List<HealthcareServiceNotAvailableModel> value) {
    this.notAvailable = value;
  }
  public String getAvailabilityExceptions() {
    return this.availabilityExceptions;
  }
  public void setAvailabilityExceptions( String value) {
    this.availabilityExceptions = value;
  }
  public java.util.List<ReferenceModel> getEndpoint() {
    return this.endpoint;
  }
  public void setEndpoint( java.util.List<ReferenceModel> value) {
    this.endpoint = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[HealthcareServiceModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("active" + "->" + this.active + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("extraDetails" + "->" + this.extraDetails + "\n"); 
     builder.append("photo" + "->" + this.photo + "\n"); 
     builder.append("telecom" + "->" + this.telecom + "\n"); 
     builder.append("eligibilityNote" + "->" + this.eligibilityNote + "\n"); 
     builder.append("programName" + "->" + this.programName + "\n"); 
     builder.append("appointmentRequired" + "->" + this.appointmentRequired + "\n"); 
     builder.append("availabilityExceptions" + "->" + this.availabilityExceptions + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[HealthcareServiceModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("active" + "->" + this.active + "\n"); 
     builder.append("providedBy" + "->" + this.providedBy + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("specialty" + "->" + this.specialty + "\n"); 
     builder.append("location" + "->" + this.location + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("extraDetails" + "->" + this.extraDetails + "\n"); 
     builder.append("photo" + "->" + this.photo + "\n"); 
     builder.append("telecom" + "->" + this.telecom + "\n"); 
     builder.append("coverageArea" + "->" + this.coverageArea + "\n"); 
     builder.append("serviceProvisionCode" + "->" + this.serviceProvisionCode + "\n"); 
     builder.append("eligibility" + "->" + this.eligibility + "\n"); 
     builder.append("eligibilityNote" + "->" + this.eligibilityNote + "\n"); 
     builder.append("programName" + "->" + this.programName + "\n"); 
     builder.append("characteristic" + "->" + this.characteristic + "\n"); 
     builder.append("referralMethod" + "->" + this.referralMethod + "\n"); 
     builder.append("appointmentRequired" + "->" + this.appointmentRequired + "\n"); 
     builder.append("availableTime" + "->" + this.availableTime + "\n"); 
     builder.append("notAvailable" + "->" + this.notAvailable + "\n"); 
     builder.append("availabilityExceptions" + "->" + this.availabilityExceptions + "\n"); 
     builder.append("endpoint" + "->" + this.endpoint + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}