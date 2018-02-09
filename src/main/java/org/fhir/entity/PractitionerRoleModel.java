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
* "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time."
*/
@Entity
@Table(name="practitionerrole")
public class PractitionerRoleModel  {
  /**
  * Description: "This is a PractitionerRole resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Business Identifiers that are specific to a role/location."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Whether this practitioner's record is in active use."
  */
  @javax.persistence.Basic
  @Column(name="\"active\"")
  private Boolean active;

  /**
  * Description: "The period during which the person is authorized to act as a practitioner in these role(s) for the organization."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "Practitioner that is able to provide the defined services for the organation."
  */
  @javax.persistence.Basic
  @Column(name="\"practitioner_id\"")
  private String practitioner_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`practitioner_id`", insertable=false, updatable=false)
  private ReferenceModel practitioner;

  /**
  * Description: "The organization where the Practitioner performs the roles associated."
  */
  @javax.persistence.Basic
  @Column(name="\"organization_id\"")
  private String organization_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`organization_id`", insertable=false, updatable=false)
  private ReferenceModel organization;

  /**
  * Description: "Roles which this practitioner is authorized to perform for the organization."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "Specific specialty of the practitioner."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"specialty\"", length = 16777215)
  private String specialty;

  /**
  * Description: "The location(s) at which this practitioner provides care."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> location = new java.util.ArrayList<>();

  /**
  * Description: "The list of healthcare services that this worker provides for this role's Organization/Location(s)."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> healthcareService = new java.util.ArrayList<>();

  /**
  * Description: "Contact details that are specific to the role/location/service."
  * Actual type: Array of ContactPoint-> List<ContactPoint>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"telecom\"", length = 16777215)
  private String telecom;

  /**
  * Description: "A collection of times that the Service Site is available."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<PractitionerRoleAvailableTimeModel> availableTime = new java.util.ArrayList<>();

  /**
  * Description: "The HealthcareService is not available during this period of time due to the provided reason."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<PractitionerRoleNotAvailableModel> notAvailable = new java.util.ArrayList<>();

  /**
  * Description: "A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times."
  */
  @javax.persistence.Basic
  @Column(name="\"availabilityExceptions\"")
  private String availabilityExceptions;

  /**
  * Description: "Technical endpoints providing access to services operated for the practitioner with this role."
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


  public PractitionerRoleModel() {
  }

  public PractitionerRoleModel(PractitionerRole o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.active = o.getActive();

      this.period = Period.toJson(o.getPeriod());
      if (null != o.getPractitioner()) {
      	this.practitioner_id = "practitioner" + this.getId();
        this.practitioner = new ReferenceModel(o.getPractitioner());
        this.practitioner.setId(this.practitioner_id);
        this.practitioner.parent_id = this.practitioner.getId();
      }

      if (null != o.getOrganization()) {
      	this.organization_id = "organization" + this.getId();
        this.organization = new ReferenceModel(o.getOrganization());
        this.organization.setId(this.organization_id);
        this.organization.parent_id = this.organization.getId();
      }

      this.code = CodeableConcept.toJson(o.getCode());
      this.specialty = CodeableConcept.toJson(o.getSpecialty());
      this.location = Reference.toModelArray(o.getLocation());

      this.healthcareService = Reference.toModelArray(o.getHealthcareService());

      this.telecom = ContactPoint.toJson(o.getTelecom());
      this.availableTime = PractitionerRoleAvailableTime.toModelArray(o.getAvailableTime());

      this.notAvailable = PractitionerRoleNotAvailable.toModelArray(o.getNotAvailable());

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
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPractitioner( ReferenceModel value) {
    this.practitioner = value;
  }
  public ReferenceModel getPractitioner() {
    return this.practitioner;
  }
  public void setOrganization( ReferenceModel value) {
    this.organization = value;
  }
  public ReferenceModel getOrganization() {
    return this.organization;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
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
  public void setHealthcareService( java.util.List<ReferenceModel> value) {
    this.healthcareService = value;
  }
  public java.util.List<ReferenceModel> getHealthcareService() {
    return this.healthcareService;
  }
  public void setTelecom( String value) {
    this.telecom = value;
  }
  public String getTelecom() {
    return this.telecom;
  }
  public void setAvailableTime( java.util.List<PractitionerRoleAvailableTimeModel> value) {
    this.availableTime = value;
  }
  public java.util.List<PractitionerRoleAvailableTimeModel> getAvailableTime() {
    return this.availableTime;
  }
  public void setNotAvailable( java.util.List<PractitionerRoleNotAvailableModel> value) {
    this.notAvailable = value;
  }
  public java.util.List<PractitionerRoleNotAvailableModel> getNotAvailable() {
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
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("practitioner" + "[" + String.valueOf(this.practitioner) + "]\n"); 
     builder.append("organization" + "[" + String.valueOf(this.organization) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("specialty" + "[" + String.valueOf(this.specialty) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("healthcareService" + "[" + String.valueOf(this.healthcareService) + "]\n"); 
     builder.append("telecom" + "[" + String.valueOf(this.telecom) + "]\n"); 
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