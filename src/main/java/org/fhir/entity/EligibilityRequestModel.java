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
/**
* "The EligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an EligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy."
*/
@Entity
@Table(name="eligibilityrequest")
public class EligibilityRequestModel  implements Serializable {
	private static final long serialVersionUID = 151857669712188564L;
  /**
  * Description: "This is a EligibilityRequest resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The Response business identifier."
  * Actual type: List<String>;
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
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="patient_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> patient;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"servicedDate\"")
  private String servicedDate;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="enterer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> enterer;

  /**
  * Description: "The practitioner who is responsible for the services rendered to the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"provider_id\"")
  private String provider_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="provider_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> provider;

  /**
  * Description: "The organization which is responsible for the services rendered to the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"organization_id\"")
  private String organization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="organization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> organization;

  /**
  * Description: "The Insurer who is target  of the request."
  */
  @javax.persistence.Basic
  @Column(name="\"insurer_id\"")
  private String insurer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="insurer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> insurer;

  /**
  * Description: "Facility where the services were provided."
  */
  @javax.persistence.Basic
  @Column(name="\"facility_id\"")
  private String facility_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="facility_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> facility;

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  @javax.persistence.Basic
  @Column(name="\"coverage_id\"")
  private String coverage_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="coverage_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> coverage;

  /**
  * Description: "The contract number of a business agreement which describes the terms and conditions."
  */
  @javax.persistence.Basic
  @Column(name="\"businessArrangement\"")
  private String businessArrangement;

  /**
  * Description: "Dental, Vision, Medical, Pharmacy, Rehab etc."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"benefitCategory\"", length = 16777215)
  private String benefitCategory;

  /**
  * Description: "Dental: basic, major, ortho; Vision exam, glasses, contacts; etc."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
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

  public EligibilityRequestModel() {
  }

  public EligibilityRequestModel(EligibilityRequest o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.status = o.getStatus();
    this.priority = CodeableConceptHelper.toJson(o.getPriority());
    if (null != o.getPatient() ) {
    	this.patient_id = "patient" + this.id;
    	this.patient = ReferenceHelper.toModel(o.getPatient(), this.patient_id);
    }
    this.servicedDate = o.getServicedDate();
    this.servicedPeriod = PeriodHelper.toJson(o.getServicedPeriod());
    this.created = o.getCreated();
    if (null != o.getEnterer() ) {
    	this.enterer_id = "enterer" + this.id;
    	this.enterer = ReferenceHelper.toModel(o.getEnterer(), this.enterer_id);
    }
    if (null != o.getProvider() ) {
    	this.provider_id = "provider" + this.id;
    	this.provider = ReferenceHelper.toModel(o.getProvider(), this.provider_id);
    }
    if (null != o.getOrganization() ) {
    	this.organization_id = "organization" + this.id;
    	this.organization = ReferenceHelper.toModel(o.getOrganization(), this.organization_id);
    }
    if (null != o.getInsurer() ) {
    	this.insurer_id = "insurer" + this.id;
    	this.insurer = ReferenceHelper.toModel(o.getInsurer(), this.insurer_id);
    }
    if (null != o.getFacility() ) {
    	this.facility_id = "facility" + this.id;
    	this.facility = ReferenceHelper.toModel(o.getFacility(), this.facility_id);
    }
    if (null != o.getCoverage() ) {
    	this.coverage_id = "coverage" + this.id;
    	this.coverage = ReferenceHelper.toModel(o.getCoverage(), this.coverage_id);
    }
    this.businessArrangement = o.getBusinessArrangement();
    this.benefitCategory = CodeableConceptHelper.toJson(o.getBenefitCategory());
    this.benefitSubCategory = CodeableConceptHelper.toJson(o.getBenefitSubCategory());
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
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
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public java.util.List<ReferenceModel> getPatient() {
    return this.patient;
  }
  public void setPatient( java.util.List<ReferenceModel> value) {
    this.patient = value;
  }
  public String getServicedDate() {
    return this.servicedDate;
  }
  public void setServicedDate( String value) {
    this.servicedDate = value;
  }
  public String getServicedPeriod() {
    return this.servicedPeriod;
  }
  public void setServicedPeriod( String value) {
    this.servicedPeriod = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public java.util.List<ReferenceModel> getEnterer() {
    return this.enterer;
  }
  public void setEnterer( java.util.List<ReferenceModel> value) {
    this.enterer = value;
  }
  public java.util.List<ReferenceModel> getProvider() {
    return this.provider;
  }
  public void setProvider( java.util.List<ReferenceModel> value) {
    this.provider = value;
  }
  public java.util.List<ReferenceModel> getOrganization() {
    return this.organization;
  }
  public void setOrganization( java.util.List<ReferenceModel> value) {
    this.organization = value;
  }
  public java.util.List<ReferenceModel> getInsurer() {
    return this.insurer;
  }
  public void setInsurer( java.util.List<ReferenceModel> value) {
    this.insurer = value;
  }
  public java.util.List<ReferenceModel> getFacility() {
    return this.facility;
  }
  public void setFacility( java.util.List<ReferenceModel> value) {
    this.facility = value;
  }
  public java.util.List<ReferenceModel> getCoverage() {
    return this.coverage;
  }
  public void setCoverage( java.util.List<ReferenceModel> value) {
    this.coverage = value;
  }
  public String getBusinessArrangement() {
    return this.businessArrangement;
  }
  public void setBusinessArrangement( String value) {
    this.businessArrangement = value;
  }
  public String getBenefitCategory() {
    return this.benefitCategory;
  }
  public void setBenefitCategory( String value) {
    this.benefitCategory = value;
  }
  public String getBenefitSubCategory() {
    return this.benefitSubCategory;
  }
  public void setBenefitSubCategory( String value) {
    this.benefitSubCategory = value;
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
    builder.append("[EligibilityRequestModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("servicedDate" + "->" + this.servicedDate + "\n"); 
     builder.append("servicedPeriod" + "->" + this.servicedPeriod + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("businessArrangement" + "->" + this.businessArrangement + "\n"); 
     builder.append("benefitCategory" + "->" + this.benefitCategory + "\n"); 
     builder.append("benefitSubCategory" + "->" + this.benefitSubCategory + "\n"); 
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
    builder.append("[EligibilityRequestModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("patient" + "->" + this.patient + "\n"); 
     builder.append("servicedDate" + "->" + this.servicedDate + "\n"); 
     builder.append("servicedPeriod" + "->" + this.servicedPeriod + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("enterer" + "->" + this.enterer + "\n"); 
     builder.append("provider" + "->" + this.provider + "\n"); 
     builder.append("organization" + "->" + this.organization + "\n"); 
     builder.append("insurer" + "->" + this.insurer + "\n"); 
     builder.append("facility" + "->" + this.facility + "\n"); 
     builder.append("coverage" + "->" + this.coverage + "\n"); 
     builder.append("businessArrangement" + "->" + this.businessArrangement + "\n"); 
     builder.append("benefitCategory" + "->" + this.benefitCategory + "\n"); 
     builder.append("benefitSubCategory" + "->" + this.benefitSubCategory + "\n"); 
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