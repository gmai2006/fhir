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
import org.fhir.entity.PractitionerRoleModel;
import com.google.gson.GsonBuilder;

/**
* "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time."
*/
public class PractitionerRole  {
  /**
  * Description: "This is a PractitionerRole resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Business Identifiers that are specific to a role/location."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Whether this practitioner's record is in active use."
  */
  private Boolean active;

  /**
  * Description: "Extensions for active"
  */
  private transient Element _active;

  /**
  * Description: "The period during which the person is authorized to act as a practitioner in these role(s) for the organization."
  */
  private Period period;

  /**
  * Description: "Practitioner that is able to provide the defined services for the organation."
  */
  private Reference practitioner;

  /**
  * Description: "The organization where the Practitioner performs the roles associated."
  */
  private Reference organization;

  /**
  * Description: "Roles which this practitioner is authorized to perform for the organization."
  */
  private java.util.List<CodeableConcept> code = new java.util.ArrayList<>();

  /**
  * Description: "Specific specialty of the practitioner."
  */
  private java.util.List<CodeableConcept> specialty = new java.util.ArrayList<>();

  /**
  * Description: "The location(s) at which this practitioner provides care."
  */
  private java.util.List<Reference> location = new java.util.ArrayList<>();

  /**
  * Description: "The list of healthcare services that this worker provides for this role's Organization/Location(s)."
  */
  private java.util.List<Reference> healthcareService = new java.util.ArrayList<>();

  /**
  * Description: "Contact details that are specific to the role/location/service."
  */
  private java.util.List<ContactPoint> telecom = new java.util.ArrayList<>();

  /**
  * Description: "A collection of times that the Service Site is available."
  */
  private java.util.List<PractitionerRoleAvailableTime> availableTime = new java.util.ArrayList<>();

  /**
  * Description: "The HealthcareService is not available during this period of time due to the provided reason."
  */
  private java.util.List<PractitionerRoleNotAvailable> notAvailable = new java.util.ArrayList<>();

  /**
  * Description: "A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times."
  */
  private String availabilityExceptions;

  /**
  * Description: "Extensions for availabilityExceptions"
  */
  private transient Element _availabilityExceptions;

  /**
  * Description: "Technical endpoints providing access to services operated for the practitioner with this role."
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

  public PractitionerRole() {
  }

  public PractitionerRole(PractitionerRoleModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getActive()) {
        this.active = new Boolean(o.getActive());
      }

      this.period = Period.fromJson(o.getPeriod());
      if (null != o.getPractitioner()) {
        this.practitioner = new Reference(o.getPractitioner());
        this.practitioner.setId(this.getId());
      }

      if (null != o.getOrganization()) {
        this.organization = new Reference(o.getOrganization());
        this.organization.setId(this.getId());
      }

      this.code = CodeableConcept.fromArray(o.getCode());
      this.specialty = CodeableConcept.fromArray(o.getSpecialty());
      this.location = Reference.fromArray(o.getLocation());

      this.healthcareService = Reference.fromArray(o.getHealthcareService());

      this.telecom = ContactPoint.fromArray(o.getTelecom());
      this.availableTime = PractitionerRoleAvailableTime.fromArray(o.getAvailableTime());

      this.notAvailable = PractitionerRoleNotAvailable.fromArray(o.getNotAvailable());

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
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setPractitioner( Reference value) {
    this.practitioner = value;
  }
  public Reference getPractitioner() {
    return this.practitioner;
  }
  public void setOrganization( Reference value) {
    this.organization = value;
  }
  public Reference getOrganization() {
    return this.organization;
  }
  public void setCode( java.util.List<CodeableConcept> value) {
    this.code = value;
  }
  public java.util.List<CodeableConcept> getCode() {
    return this.code;
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
  public void setHealthcareService( java.util.List<Reference> value) {
    this.healthcareService = value;
  }
  public java.util.List<Reference> getHealthcareService() {
    return this.healthcareService;
  }
  public void setTelecom( java.util.List<ContactPoint> value) {
    this.telecom = value;
  }
  public java.util.List<ContactPoint> getTelecom() {
    return this.telecom;
  }
  public void setAvailableTime( java.util.List<PractitionerRoleAvailableTime> value) {
    this.availableTime = value;
  }
  public java.util.List<PractitionerRoleAvailableTime> getAvailableTime() {
    return this.availableTime;
  }
  public void setNotAvailable( java.util.List<PractitionerRoleNotAvailable> value) {
    this.notAvailable = value;
  }
  public java.util.List<PractitionerRoleNotAvailable> getNotAvailable() {
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
  	PractitionerRole,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "PractitionerRole" : { return PractitionerRole.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<PractitionerRole> fromArray(java.util.List<PractitionerRoleModel> list) {
    return (java.util.List<PractitionerRole>)list.stream()
      .map(model -> new PractitionerRole(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<PractitionerRoleModel> toModelArray(java.util.List<PractitionerRole> list) {
    return (java.util.List<PractitionerRoleModel>)list.stream()
      .map(model -> new PractitionerRoleModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static PractitionerRole fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, PractitionerRole.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(PractitionerRole o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<PractitionerRole> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}