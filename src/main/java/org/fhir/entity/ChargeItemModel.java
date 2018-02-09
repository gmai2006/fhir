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
* "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation."
*/
@Entity
@Table(name="chargeitem")
public class ChargeItemModel  {
  /**
  * Description: "This is a ChargeItem resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this event performer or other systems."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "References the source of pricing information, rules of application for the code this ChargeItem uses."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"definition\"", length = 16777215)
  private String definition;

  /**
  * Description: "The current state of the ChargeItem."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "ChargeItems can be grouped to larger ChargeItems covering the whole set."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> partOf = new java.util.ArrayList<>();

  /**
  * Description: "A code that identifies the charge, like a billing code."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "The individual or set of individuals the action is being or was performed on."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "The encounter or episode of care that establishes the context for this event."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`context_id`", insertable=false, updatable=false)
  private ReferenceModel context;

  /**
  * Description: "Date/time(s) or duration when the charged service was applied."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"occurrenceDateTime\"")
  private String occurrenceDateTime;

  /**
  * Description: "Date/time(s) or duration when the charged service was applied."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrencePeriod\"", length = 16777215)
  private String occurrencePeriod;

  /**
  * Description: "Date/time(s) or duration when the charged service was applied."
  * Actual type: Timing
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrenceTiming\"", length = 16777215)
  private String occurrenceTiming;

  /**
  * Description: "Indicates who or what performed or participated in the charged service."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ChargeItemParticipantModel> participant = new java.util.ArrayList<>();

  /**
  * Description: "The organization requesting the service."
  */
  @javax.persistence.Basic
  @Column(name="\"performingorganization_id\"")
  private String performingorganization_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`performingorganization_id`", insertable=false, updatable=false)
  private ReferenceModel performingOrganization;

  /**
  * Description: "The organization performing the service."
  */
  @javax.persistence.Basic
  @Column(name="\"requestingorganization_id\"")
  private String requestingorganization_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`requestingorganization_id`", insertable=false, updatable=false)
  private ReferenceModel requestingOrganization;

  /**
  * Description: "Quantity of which the charge item has been serviced."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"quantity\"", length = 16777215)
  private String quantity;

  /**
  * Description: "The anatomical location where the related service has been applied."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"bodysite\"", length = 16777215)
  private String bodysite;

  /**
  * Description: "Factor overriding the factor determined by the rules associated with the code."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"factorOverride\"")
  private Float factorOverride;

  /**
  * Description: "Total price of the charge overriding the list price associated with the code."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"priceOverride\"", length = 16777215)
  private String priceOverride;

  /**
  * Description: "If the list price or the rule based factor associated with the code is overridden, this attribute can capture a text to indicate the  reason for this action."
  */
  @javax.persistence.Basic
  @Column(name="\"overrideReason\"")
  private String overrideReason;

  /**
  * Description: "The device, practitioner, etc. who entered the charge item."
  */
  @javax.persistence.Basic
  @Column(name="\"enterer_id\"")
  private String enterer_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`enterer_id`", insertable=false, updatable=false)
  private ReferenceModel enterer;

  /**
  * Description: "Date the charge item was entered."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"enteredDate\"")
  private String enteredDate;

  /**
  * Description: "Describes why the event occurred in coded or textual form."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reason\"", length = 16777215)
  private String reason;

  /**
  * Description: "Indicated the rendered service that caused this charge."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> service = new java.util.ArrayList<>();

  /**
  * Description: "Account into which this ChargeItems belongs."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> account = new java.util.ArrayList<>();

  /**
  * Description: "Comments made about the event by the performer, subject or other participants."
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Further information supporting the this charge."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingInformation = new java.util.ArrayList<>();

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


  public ChargeItemModel() {
  }

  public ChargeItemModel(ChargeItem o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.definition = org.fhir.utils.JsonUtils.write2String(o.getDefinition());

      this.status = o.getStatus();

      this.partOf = Reference.toModelArray(o.getPartOf());

      this.code = CodeableConcept.toJson(o.getCode());
      if (null != o.getSubject()) {
      	this.subject_id = "subject" + this.getId();
        this.subject = new ReferenceModel(o.getSubject());
        this.subject.setId(this.subject_id);
        this.subject.parent_id = this.subject.getId();
      }

      if (null != o.getContext()) {
      	this.context_id = "context" + this.getId();
        this.context = new ReferenceModel(o.getContext());
        this.context.setId(this.context_id);
        this.context.parent_id = this.context.getId();
      }

      this.occurrenceDateTime = o.getOccurrenceDateTime();

      this.occurrencePeriod = Period.toJson(o.getOccurrencePeriod());
      this.occurrenceTiming = Timing.toJson(o.getOccurrenceTiming());
      this.participant = ChargeItemParticipant.toModelArray(o.getParticipant());

      if (null != o.getPerformingOrganization()) {
      	this.performingorganization_id = "performingOrganization" + this.getId();
        this.performingOrganization = new ReferenceModel(o.getPerformingOrganization());
        this.performingOrganization.setId(this.performingorganization_id);
        this.performingOrganization.parent_id = this.performingOrganization.getId();
      }

      if (null != o.getRequestingOrganization()) {
      	this.requestingorganization_id = "requestingOrganization" + this.getId();
        this.requestingOrganization = new ReferenceModel(o.getRequestingOrganization());
        this.requestingOrganization.setId(this.requestingorganization_id);
        this.requestingOrganization.parent_id = this.requestingOrganization.getId();
      }

      this.quantity = Quantity.toJson(o.getQuantity());
      this.bodysite = CodeableConcept.toJson(o.getBodysite());
      this.factorOverride = o.getFactorOverride();

      this.priceOverride = Money.toJson(o.getPriceOverride());
      this.overrideReason = o.getOverrideReason();

      if (null != o.getEnterer()) {
      	this.enterer_id = "enterer" + this.getId();
        this.enterer = new ReferenceModel(o.getEnterer());
        this.enterer.setId(this.enterer_id);
        this.enterer.parent_id = this.enterer.getId();
      }

      this.enteredDate = o.getEnteredDate();

      this.reason = CodeableConcept.toJson(o.getReason());
      this.service = Reference.toModelArray(o.getService());

      this.account = Reference.toModelArray(o.getAccount());

      this.note = Annotation.toJson(o.getNote());
      this.supportingInformation = Reference.toModelArray(o.getSupportingInformation());

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
  public void setDefinition( String value) {
    this.definition = value;
  }
  public String getDefinition() {
    return this.definition;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setPartOf( java.util.List<ReferenceModel> value) {
    this.partOf = value;
  }
  public java.util.List<ReferenceModel> getPartOf() {
    return this.partOf;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setSubject( ReferenceModel value) {
    this.subject = value;
  }
  public ReferenceModel getSubject() {
    return this.subject;
  }
  public void setContext( ReferenceModel value) {
    this.context = value;
  }
  public ReferenceModel getContext() {
    return this.context;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void setOccurrencePeriod( String value) {
    this.occurrencePeriod = value;
  }
  public String getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setOccurrenceTiming( String value) {
    this.occurrenceTiming = value;
  }
  public String getOccurrenceTiming() {
    return this.occurrenceTiming;
  }
  public void setParticipant( java.util.List<ChargeItemParticipantModel> value) {
    this.participant = value;
  }
  public java.util.List<ChargeItemParticipantModel> getParticipant() {
    return this.participant;
  }
  public void setPerformingOrganization( ReferenceModel value) {
    this.performingOrganization = value;
  }
  public ReferenceModel getPerformingOrganization() {
    return this.performingOrganization;
  }
  public void setRequestingOrganization( ReferenceModel value) {
    this.requestingOrganization = value;
  }
  public ReferenceModel getRequestingOrganization() {
    return this.requestingOrganization;
  }
  public void setQuantity( String value) {
    this.quantity = value;
  }
  public String getQuantity() {
    return this.quantity;
  }
  public void setBodysite( String value) {
    this.bodysite = value;
  }
  public String getBodysite() {
    return this.bodysite;
  }
  public void setFactorOverride( Float value) {
    this.factorOverride = value;
  }
  public Float getFactorOverride() {
    return this.factorOverride;
  }
  public void setPriceOverride( String value) {
    this.priceOverride = value;
  }
  public String getPriceOverride() {
    return this.priceOverride;
  }
  public void setOverrideReason( String value) {
    this.overrideReason = value;
  }
  public String getOverrideReason() {
    return this.overrideReason;
  }
  public void setEnterer( ReferenceModel value) {
    this.enterer = value;
  }
  public ReferenceModel getEnterer() {
    return this.enterer;
  }
  public void setEnteredDate( String value) {
    this.enteredDate = value;
  }
  public String getEnteredDate() {
    return this.enteredDate;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setService( java.util.List<ReferenceModel> value) {
    this.service = value;
  }
  public java.util.List<ReferenceModel> getService() {
    return this.service;
  }
  public void setAccount( java.util.List<ReferenceModel> value) {
    this.account = value;
  }
  public java.util.List<ReferenceModel> getAccount() {
    return this.account;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setSupportingInformation( java.util.List<ReferenceModel> value) {
    this.supportingInformation = value;
  }
  public java.util.List<ReferenceModel> getSupportingInformation() {
    return this.supportingInformation;
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
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("partOf" + "[" + String.valueOf(this.partOf) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("occurrenceDateTime" + "[" + String.valueOf(this.occurrenceDateTime) + "]\n"); 
     builder.append("occurrencePeriod" + "[" + String.valueOf(this.occurrencePeriod) + "]\n"); 
     builder.append("occurrenceTiming" + "[" + String.valueOf(this.occurrenceTiming) + "]\n"); 
     builder.append("participant" + "[" + String.valueOf(this.participant) + "]\n"); 
     builder.append("performingOrganization" + "[" + String.valueOf(this.performingOrganization) + "]\n"); 
     builder.append("requestingOrganization" + "[" + String.valueOf(this.requestingOrganization) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("bodysite" + "[" + String.valueOf(this.bodysite) + "]\n"); 
     builder.append("factorOverride" + "[" + String.valueOf(this.factorOverride) + "]\n"); 
     builder.append("priceOverride" + "[" + String.valueOf(this.priceOverride) + "]\n"); 
     builder.append("overrideReason" + "[" + String.valueOf(this.overrideReason) + "]\n"); 
     builder.append("enterer" + "[" + String.valueOf(this.enterer) + "]\n"); 
     builder.append("enteredDate" + "[" + String.valueOf(this.enteredDate) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("service" + "[" + String.valueOf(this.service) + "]\n"); 
     builder.append("account" + "[" + String.valueOf(this.account) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("supportingInformation" + "[" + String.valueOf(this.supportingInformation) + "]\n"); 
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