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
* "The EligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an EligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy."
*/
@Entity
@Table(name="eligibilityrequest")
public class EligibilityRequestModel  {
  /**
  * Description: "This is a EligibilityRequest resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The Response business identifier."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The status of the resource instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Immediate (STAT), best effort (NORMAL), deferred (DEFER)."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"priority\"", length = 16777215)
  private String priority;

  /**
  * Description: "Patient Resource."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`patient_id`", insertable=false, updatable=false)
  private ReferenceModel patient;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"servicedDate\"")
  private String servicedDate;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"servicedPeriod\"", length = 16777215)
  private String servicedPeriod;

  /**
  * Description: "The date when this resource was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"created\"")
  private String created;

  /**
  * Description: "Person who created the invoice/claim/pre-determination or pre-authorization."
  */
  @javax.persistence.Basic
  @Column(name="\"enterer_id\"")
  private String enterer_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`enterer_id`", insertable=false, updatable=false)
  private ReferenceModel enterer;

  /**
  * Description: "The practitioner who is responsible for the services rendered to the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"provider_id\"")
  private String provider_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`provider_id`", insertable=false, updatable=false)
  private ReferenceModel provider;

  /**
  * Description: "The organization which is responsible for the services rendered to the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"organization_id\"")
  private String organization_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`organization_id`", insertable=false, updatable=false)
  private ReferenceModel organization;

  /**
  * Description: "The Insurer who is target  of the request."
  */
  @javax.persistence.Basic
  @Column(name="\"insurer_id\"")
  private String insurer_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`insurer_id`", insertable=false, updatable=false)
  private ReferenceModel insurer;

  /**
  * Description: "Facility where the services were provided."
  */
  @javax.persistence.Basic
  @Column(name="\"facility_id\"")
  private String facility_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`facility_id`", insertable=false, updatable=false)
  private ReferenceModel facility;

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  @javax.persistence.Basic
  @Column(name="\"coverage_id\"")
  private String coverage_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`coverage_id`", insertable=false, updatable=false)
  private ReferenceModel coverage;

  /**
  * Description: "The contract number of a business agreement which describes the terms and conditions."
  */
  @javax.persistence.Basic
  @Column(name="\"businessArrangement\"")
  private String businessArrangement;

  /**
  * Description: "Dental, Vision, Medical, Pharmacy, Rehab etc."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"benefitCategory\"", length = 16777215)
  private String benefitCategory;

  /**
  * Description: "Dental: basic, major, ortho; Vision exam, glasses, contacts; etc."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"benefitSubCategory\"", length = 16777215)
  private String benefitSubCategory;

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


  public EligibilityRequestModel() {
  }

  public EligibilityRequestModel(EligibilityRequest o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      this.priority = CodeableConcept.toJson(o.getPriority());
      if (null != o.getPatient()) {
      	this.patient_id = "patient" + this.getId();
        this.patient = new ReferenceModel(o.getPatient());
        this.patient.setId(this.patient_id);
        this.patient.parent_id = this.patient.getId();
      }

      this.servicedDate = o.getServicedDate();

      this.servicedPeriod = Period.toJson(o.getServicedPeriod());
      this.created = o.getCreated();

      if (null != o.getEnterer()) {
      	this.enterer_id = "enterer" + this.getId();
        this.enterer = new ReferenceModel(o.getEnterer());
        this.enterer.setId(this.enterer_id);
        this.enterer.parent_id = this.enterer.getId();
      }

      if (null != o.getProvider()) {
      	this.provider_id = "provider" + this.getId();
        this.provider = new ReferenceModel(o.getProvider());
        this.provider.setId(this.provider_id);
        this.provider.parent_id = this.provider.getId();
      }

      if (null != o.getOrganization()) {
      	this.organization_id = "organization" + this.getId();
        this.organization = new ReferenceModel(o.getOrganization());
        this.organization.setId(this.organization_id);
        this.organization.parent_id = this.organization.getId();
      }

      if (null != o.getInsurer()) {
      	this.insurer_id = "insurer" + this.getId();
        this.insurer = new ReferenceModel(o.getInsurer());
        this.insurer.setId(this.insurer_id);
        this.insurer.parent_id = this.insurer.getId();
      }

      if (null != o.getFacility()) {
      	this.facility_id = "facility" + this.getId();
        this.facility = new ReferenceModel(o.getFacility());
        this.facility.setId(this.facility_id);
        this.facility.parent_id = this.facility.getId();
      }

      if (null != o.getCoverage()) {
      	this.coverage_id = "coverage" + this.getId();
        this.coverage = new ReferenceModel(o.getCoverage());
        this.coverage.setId(this.coverage_id);
        this.coverage.parent_id = this.coverage.getId();
      }

      this.businessArrangement = o.getBusinessArrangement();

      this.benefitCategory = CodeableConcept.toJson(o.getBenefitCategory());
      this.benefitSubCategory = CodeableConcept.toJson(o.getBenefitSubCategory());
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
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setPatient( ReferenceModel value) {
    this.patient = value;
  }
  public ReferenceModel getPatient() {
    return this.patient;
  }
  public void setServicedDate( String value) {
    this.servicedDate = value;
  }
  public String getServicedDate() {
    return this.servicedDate;
  }
  public void setServicedPeriod( String value) {
    this.servicedPeriod = value;
  }
  public String getServicedPeriod() {
    return this.servicedPeriod;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void setEnterer( ReferenceModel value) {
    this.enterer = value;
  }
  public ReferenceModel getEnterer() {
    return this.enterer;
  }
  public void setProvider( ReferenceModel value) {
    this.provider = value;
  }
  public ReferenceModel getProvider() {
    return this.provider;
  }
  public void setOrganization( ReferenceModel value) {
    this.organization = value;
  }
  public ReferenceModel getOrganization() {
    return this.organization;
  }
  public void setInsurer( ReferenceModel value) {
    this.insurer = value;
  }
  public ReferenceModel getInsurer() {
    return this.insurer;
  }
  public void setFacility( ReferenceModel value) {
    this.facility = value;
  }
  public ReferenceModel getFacility() {
    return this.facility;
  }
  public void setCoverage( ReferenceModel value) {
    this.coverage = value;
  }
  public ReferenceModel getCoverage() {
    return this.coverage;
  }
  public void setBusinessArrangement( String value) {
    this.businessArrangement = value;
  }
  public String getBusinessArrangement() {
    return this.businessArrangement;
  }
  public void setBenefitCategory( String value) {
    this.benefitCategory = value;
  }
  public String getBenefitCategory() {
    return this.benefitCategory;
  }
  public void setBenefitSubCategory( String value) {
    this.benefitSubCategory = value;
  }
  public String getBenefitSubCategory() {
    return this.benefitSubCategory;
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
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("servicedDate" + "[" + String.valueOf(this.servicedDate) + "]\n"); 
     builder.append("servicedPeriod" + "[" + String.valueOf(this.servicedPeriod) + "]\n"); 
     builder.append("created" + "[" + String.valueOf(this.created) + "]\n"); 
     builder.append("enterer" + "[" + String.valueOf(this.enterer) + "]\n"); 
     builder.append("provider" + "[" + String.valueOf(this.provider) + "]\n"); 
     builder.append("organization" + "[" + String.valueOf(this.organization) + "]\n"); 
     builder.append("insurer" + "[" + String.valueOf(this.insurer) + "]\n"); 
     builder.append("facility" + "[" + String.valueOf(this.facility) + "]\n"); 
     builder.append("coverage" + "[" + String.valueOf(this.coverage) + "]\n"); 
     builder.append("businessArrangement" + "[" + String.valueOf(this.businessArrangement) + "]\n"); 
     builder.append("benefitCategory" + "[" + String.valueOf(this.benefitCategory) + "]\n"); 
     builder.append("benefitSubCategory" + "[" + String.valueOf(this.benefitSubCategory) + "]\n"); 
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