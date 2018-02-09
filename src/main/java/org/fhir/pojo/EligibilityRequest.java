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
import org.fhir.entity.EligibilityRequestModel;
import com.google.gson.GsonBuilder;

/**
* "The EligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an EligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy."
*/
public class EligibilityRequest  {
  /**
  * Description: "This is a EligibilityRequest resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The Response business identifier."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The status of the resource instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Immediate (STAT), best effort (NORMAL), deferred (DEFER)."
  */
  private CodeableConcept priority;

  /**
  * Description: "Patient Resource."
  */
  private Reference patient;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String servicedDate;

  /**
  * Description: "Extensions for servicedDate"
  */
  private transient Element _servicedDate;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  */
  private Period servicedPeriod;

  /**
  * Description: "The date when this resource was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String created;

  /**
  * Description: "Extensions for created"
  */
  private transient Element _created;

  /**
  * Description: "Person who created the invoice/claim/pre-determination or pre-authorization."
  */
  private Reference enterer;

  /**
  * Description: "The practitioner who is responsible for the services rendered to the patient."
  */
  private Reference provider;

  /**
  * Description: "The organization which is responsible for the services rendered to the patient."
  */
  private Reference organization;

  /**
  * Description: "The Insurer who is target  of the request."
  */
  private Reference insurer;

  /**
  * Description: "Facility where the services were provided."
  */
  private Reference facility;

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  private Reference coverage;

  /**
  * Description: "The contract number of a business agreement which describes the terms and conditions."
  */
  private String businessArrangement;

  /**
  * Description: "Extensions for businessArrangement"
  */
  private transient Element _businessArrangement;

  /**
  * Description: "Dental, Vision, Medical, Pharmacy, Rehab etc."
  */
  private CodeableConcept benefitCategory;

  /**
  * Description: "Dental: basic, major, ortho; Vision exam, glasses, contacts; etc."
  */
  private CodeableConcept benefitSubCategory;

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

  public EligibilityRequest() {
  }

  public EligibilityRequest(EligibilityRequestModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.priority = CodeableConcept.fromJson(o.getPriority());
      if (null != o.getPatient()) {
        this.patient = new Reference(o.getPatient());
        this.patient.setId(this.getId());
      }

      if (null != o.getServicedDate()) {
        this.servicedDate = new String(o.getServicedDate());
      }

      this.servicedPeriod = Period.fromJson(o.getServicedPeriod());
      if (null != o.getCreated()) {
        this.created = new String(o.getCreated());
      }

      if (null != o.getEnterer()) {
        this.enterer = new Reference(o.getEnterer());
        this.enterer.setId(this.getId());
      }

      if (null != o.getProvider()) {
        this.provider = new Reference(o.getProvider());
        this.provider.setId(this.getId());
      }

      if (null != o.getOrganization()) {
        this.organization = new Reference(o.getOrganization());
        this.organization.setId(this.getId());
      }

      if (null != o.getInsurer()) {
        this.insurer = new Reference(o.getInsurer());
        this.insurer.setId(this.getId());
      }

      if (null != o.getFacility()) {
        this.facility = new Reference(o.getFacility());
        this.facility.setId(this.getId());
      }

      if (null != o.getCoverage()) {
        this.coverage = new Reference(o.getCoverage());
        this.coverage.setId(this.getId());
      }

      if (null != o.getBusinessArrangement()) {
        this.businessArrangement = new String(o.getBusinessArrangement());
      }

      this.benefitCategory = CodeableConcept.fromJson(o.getBenefitCategory());
      this.benefitSubCategory = CodeableConcept.fromJson(o.getBenefitSubCategory());
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
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setPriority( CodeableConcept value) {
    this.priority = value;
  }
  public CodeableConcept getPriority() {
    return this.priority;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setServicedDate( String value) {
    this.servicedDate = value;
  }
  public String getServicedDate() {
    return this.servicedDate;
  }
  public void set_servicedDate( Element value) {
    this._servicedDate = value;
  }
  public Element get_servicedDate() {
    return this._servicedDate;
  }
  public void setServicedPeriod( Period value) {
    this.servicedPeriod = value;
  }
  public Period getServicedPeriod() {
    return this.servicedPeriod;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void set_created( Element value) {
    this._created = value;
  }
  public Element get_created() {
    return this._created;
  }
  public void setEnterer( Reference value) {
    this.enterer = value;
  }
  public Reference getEnterer() {
    return this.enterer;
  }
  public void setProvider( Reference value) {
    this.provider = value;
  }
  public Reference getProvider() {
    return this.provider;
  }
  public void setOrganization( Reference value) {
    this.organization = value;
  }
  public Reference getOrganization() {
    return this.organization;
  }
  public void setInsurer( Reference value) {
    this.insurer = value;
  }
  public Reference getInsurer() {
    return this.insurer;
  }
  public void setFacility( Reference value) {
    this.facility = value;
  }
  public Reference getFacility() {
    return this.facility;
  }
  public void setCoverage( Reference value) {
    this.coverage = value;
  }
  public Reference getCoverage() {
    return this.coverage;
  }
  public void setBusinessArrangement( String value) {
    this.businessArrangement = value;
  }
  public String getBusinessArrangement() {
    return this.businessArrangement;
  }
  public void set_businessArrangement( Element value) {
    this._businessArrangement = value;
  }
  public Element get_businessArrangement() {
    return this._businessArrangement;
  }
  public void setBenefitCategory( CodeableConcept value) {
    this.benefitCategory = value;
  }
  public CodeableConcept getBenefitCategory() {
    return this.benefitCategory;
  }
  public void setBenefitSubCategory( CodeableConcept value) {
    this.benefitSubCategory = value;
  }
  public CodeableConcept getBenefitSubCategory() {
    return this.benefitSubCategory;
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
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("servicedDate" + "[" + String.valueOf(this.servicedDate) + "]\n"); 
     builder.append("_servicedDate" + "[" + String.valueOf(this._servicedDate) + "]\n"); 
     builder.append("servicedPeriod" + "[" + String.valueOf(this.servicedPeriod) + "]\n"); 
     builder.append("created" + "[" + String.valueOf(this.created) + "]\n"); 
     builder.append("_created" + "[" + String.valueOf(this._created) + "]\n"); 
     builder.append("enterer" + "[" + String.valueOf(this.enterer) + "]\n"); 
     builder.append("provider" + "[" + String.valueOf(this.provider) + "]\n"); 
     builder.append("organization" + "[" + String.valueOf(this.organization) + "]\n"); 
     builder.append("insurer" + "[" + String.valueOf(this.insurer) + "]\n"); 
     builder.append("facility" + "[" + String.valueOf(this.facility) + "]\n"); 
     builder.append("coverage" + "[" + String.valueOf(this.coverage) + "]\n"); 
     builder.append("businessArrangement" + "[" + String.valueOf(this.businessArrangement) + "]\n"); 
     builder.append("_businessArrangement" + "[" + String.valueOf(this._businessArrangement) + "]\n"); 
     builder.append("benefitCategory" + "[" + String.valueOf(this.benefitCategory) + "]\n"); 
     builder.append("benefitSubCategory" + "[" + String.valueOf(this.benefitSubCategory) + "]\n"); 
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
  	EligibilityRequest,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "EligibilityRequest" : { return EligibilityRequest.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<EligibilityRequest> fromArray(java.util.List<EligibilityRequestModel> list) {
    return (java.util.List<EligibilityRequest>)list.stream()
      .map(model -> new EligibilityRequest(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<EligibilityRequestModel> toModelArray(java.util.List<EligibilityRequest> list) {
    return (java.util.List<EligibilityRequestModel>)list.stream()
      .map(model -> new EligibilityRequestModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static EligibilityRequest fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, EligibilityRequest.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(EligibilityRequest o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<EligibilityRequest> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}