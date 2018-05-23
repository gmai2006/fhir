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
* "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation."
*/
@Entity
@Table(name="chargeitem")
public class ChargeItemModel  implements Serializable {
	private static final long serialVersionUID = 151967883219681329L;
  /**
  * Description: "This is a ChargeItem resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this event performer or other systems."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "References the source of pricing information, rules of application for the code this ChargeItem uses."
  */
  @javax.persistence.Basic
  @Column(name="\"definition\"")
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
  @javax.persistence.Basic
  @Column(name="\"partof_id\"")
  private String partof_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="partof_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> partOf;

  /**
  * Description: "A code that identifies the charge, like a billing code."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

  /**
  * Description: "The individual or set of individuals the action is being or was performed on."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "The encounter or episode of care that establishes the context for this event."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "Date/time(s) or duration when the charged service was applied."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"occurrenceDateTime\"")
  private String occurrenceDateTime;

  /**
  * Description: "Date/time(s) or duration when the charged service was applied."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrencePeriod\"", length = 16777215)
  private String occurrencePeriod;

  /**
  * Description: "Date/time(s) or duration when the charged service was applied."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrenceTiming\"", length = 16777215)
  private String occurrenceTiming;

  /**
  * Description: "Indicates who or what performed or participated in the charged service."
  */
  @javax.persistence.Basic
  @Column(name="\"participant_id\"")
  private String participant_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="participant_id", insertable=false, updatable=false)
  private java.util.List<ChargeItemParticipantModel> participant;

  /**
  * Description: "The organization requesting the service."
  */
  @javax.persistence.Basic
  @Column(name="\"performingorganization_id\"")
  private String performingorganization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="performingorganization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> performingOrganization;

  /**
  * Description: "The organization performing the service."
  */
  @javax.persistence.Basic
  @Column(name="\"requestingorganization_id\"")
  private String requestingorganization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="requestingorganization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> requestingOrganization;

  /**
  * Description: "Quantity of which the charge item has been serviced."
  */
  @javax.persistence.Basic
  @Column(name="\"quantity_id\"")
  private String quantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="quantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> quantity;

  /**
  * Description: "The anatomical location where the related service has been applied."
  */
  @javax.persistence.Basic
  @Column(name="\"bodysite_id\"")
  private String bodysite_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="bodysite_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> bodysite;

  /**
  * Description: "Factor overriding the factor determined by the rules associated with the code."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"factorOverride\"")
  private Float factorOverride;

  /**
  * Description: "Total price of the charge overriding the list price associated with the code."
  */
  @javax.persistence.Basic
  @Column(name="\"priceoverride_id\"")
  private String priceoverride_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="priceoverride_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> priceOverride;

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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="enterer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> enterer;

  /**
  * Description: "Date the charge item was entered."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"enteredDate\"")
  private String enteredDate;

  /**
  * Description: "Describes why the event occurred in coded or textual form."
  */
  @javax.persistence.Basic
  @Column(name="\"reason_id\"")
  private String reason_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reason_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> reason;

  /**
  * Description: "Indicated the rendered service that caused this charge."
  */
  @javax.persistence.Basic
  @Column(name="\"service_id\"")
  private String service_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="service_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> service;

  /**
  * Description: "Account into which this ChargeItems belongs."
  */
  @javax.persistence.Basic
  @Column(name="\"account_id\"")
  private String account_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="account_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> account;

  /**
  * Description: "Comments made about the event by the performer, subject or other participants."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Further information supporting the this charge."
  */
  @javax.persistence.Basic
  @Column(name="\"supportinginformation_id\"")
  private String supportinginformation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="supportinginformation_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingInformation;

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

  public ChargeItemModel() {
  }

  public ChargeItemModel(ChargeItem o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.definition = org.fhir.utils.JsonUtils.toJson(o.getDefinition());
    this.status = o.getStatus();
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partof_id = "partof" + this.id;
    	this.partOf = ReferenceHelper.toModelFromArray(o.getPartOf(), this.partof_id);
    }
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.id;
    	this.code = CodeableConceptHelper.toModel(o.getCode(), this.code_id);
    }
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    if (null != o.getContext() ) {
    	this.context_id = "context" + this.id;
    	this.context = ReferenceHelper.toModel(o.getContext(), this.context_id);
    }
    this.occurrenceDateTime = o.getOccurrenceDateTime();
    if (null != o.getOccurrencePeriod()) {
    	this.occurrencePeriod = JsonUtils.toJson(o.getOccurrencePeriod());
    }
    if (null != o.getOccurrenceTiming()) {
    	this.occurrenceTiming = JsonUtils.toJson(o.getOccurrenceTiming());
    }
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant_id = "participant" + this.id;
    	this.participant = ChargeItemParticipantHelper.toModelFromArray(o.getParticipant(), this.participant_id);
    }
    if (null != o.getPerformingOrganization() ) {
    	this.performingorganization_id = "performingorganization" + this.id;
    	this.performingOrganization = ReferenceHelper.toModel(o.getPerformingOrganization(), this.performingorganization_id);
    }
    if (null != o.getRequestingOrganization() ) {
    	this.requestingorganization_id = "requestingorganization" + this.id;
    	this.requestingOrganization = ReferenceHelper.toModel(o.getRequestingOrganization(), this.requestingorganization_id);
    }
    if (null != o.getQuantity() ) {
    	this.quantity_id = "quantity" + this.id;
    	this.quantity = QuantityHelper.toModel(o.getQuantity(), this.quantity_id);
    }
    if (null != o.getBodysite() && !o.getBodysite().isEmpty()) {
    	this.bodysite_id = "bodysite" + this.id;
    	this.bodysite = CodeableConceptHelper.toModelFromArray(o.getBodysite(), this.bodysite_id);
    }
    this.factorOverride = o.getFactorOverride();
    if (null != o.getPriceOverride() ) {
    	this.priceoverride_id = "priceoverride" + this.id;
    	this.priceOverride = MoneyHelper.toModel(o.getPriceOverride(), this.priceoverride_id);
    }
    this.overrideReason = o.getOverrideReason();
    if (null != o.getEnterer() ) {
    	this.enterer_id = "enterer" + this.id;
    	this.enterer = ReferenceHelper.toModel(o.getEnterer(), this.enterer_id);
    }
    this.enteredDate = o.getEnteredDate();
    if (null != o.getReason() && !o.getReason().isEmpty()) {
    	this.reason_id = "reason" + this.id;
    	this.reason = CodeableConceptHelper.toModelFromArray(o.getReason(), this.reason_id);
    }
    if (null != o.getService() && !o.getService().isEmpty()) {
    	this.service_id = "service" + this.id;
    	this.service = ReferenceHelper.toModelFromArray(o.getService(), this.service_id);
    }
    if (null != o.getAccount() && !o.getAccount().isEmpty()) {
    	this.account_id = "account" + this.id;
    	this.account = ReferenceHelper.toModelFromArray(o.getAccount(), this.account_id);
    }
    if (null != o.getNote()) {
    	this.note = JsonUtils.toJson(o.getNote());
    }
    if (null != o.getSupportingInformation() && !o.getSupportingInformation().isEmpty()) {
    	this.supportinginformation_id = "supportinginformation" + this.id;
    	this.supportingInformation = ReferenceHelper.toModelFromArray(o.getSupportingInformation(), this.supportinginformation_id);
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
  public String getDefinition() {
    return this.definition;
  }
  public void setDefinition( String value) {
    this.definition = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public java.util.List<ReferenceModel> getPartOf() {
    return this.partOf;
  }
  public void setPartOf( java.util.List<ReferenceModel> value) {
    this.partOf = value;
  }
  public java.util.List<CodeableConceptModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodeableConceptModel> value) {
    this.code = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public java.util.List<ReferenceModel> getContext() {
    return this.context;
  }
  public void setContext( java.util.List<ReferenceModel> value) {
    this.context = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setOccurrencePeriod( String value) {
    this.occurrencePeriod = value;
  }
  public String getOccurrenceTiming() {
    return this.occurrenceTiming;
  }
  public void setOccurrenceTiming( String value) {
    this.occurrenceTiming = value;
  }
  public java.util.List<ChargeItemParticipantModel> getParticipant() {
    return this.participant;
  }
  public void setParticipant( java.util.List<ChargeItemParticipantModel> value) {
    this.participant = value;
  }
  public java.util.List<ReferenceModel> getPerformingOrganization() {
    return this.performingOrganization;
  }
  public void setPerformingOrganization( java.util.List<ReferenceModel> value) {
    this.performingOrganization = value;
  }
  public java.util.List<ReferenceModel> getRequestingOrganization() {
    return this.requestingOrganization;
  }
  public void setRequestingOrganization( java.util.List<ReferenceModel> value) {
    this.requestingOrganization = value;
  }
  public java.util.List<QuantityModel> getQuantity() {
    return this.quantity;
  }
  public void setQuantity( java.util.List<QuantityModel> value) {
    this.quantity = value;
  }
  public java.util.List<CodeableConceptModel> getBodysite() {
    return this.bodysite;
  }
  public void setBodysite( java.util.List<CodeableConceptModel> value) {
    this.bodysite = value;
  }
  public Float getFactorOverride() {
    return this.factorOverride;
  }
  public void setFactorOverride( Float value) {
    this.factorOverride = value;
  }
  public java.util.List<MoneyModel> getPriceOverride() {
    return this.priceOverride;
  }
  public void setPriceOverride( java.util.List<MoneyModel> value) {
    this.priceOverride = value;
  }
  public String getOverrideReason() {
    return this.overrideReason;
  }
  public void setOverrideReason( String value) {
    this.overrideReason = value;
  }
  public java.util.List<ReferenceModel> getEnterer() {
    return this.enterer;
  }
  public void setEnterer( java.util.List<ReferenceModel> value) {
    this.enterer = value;
  }
  public String getEnteredDate() {
    return this.enteredDate;
  }
  public void setEnteredDate( String value) {
    this.enteredDate = value;
  }
  public java.util.List<CodeableConceptModel> getReason() {
    return this.reason;
  }
  public void setReason( java.util.List<CodeableConceptModel> value) {
    this.reason = value;
  }
  public java.util.List<ReferenceModel> getService() {
    return this.service;
  }
  public void setService( java.util.List<ReferenceModel> value) {
    this.service = value;
  }
  public java.util.List<ReferenceModel> getAccount() {
    return this.account;
  }
  public void setAccount( java.util.List<ReferenceModel> value) {
    this.account = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public java.util.List<ReferenceModel> getSupportingInformation() {
    return this.supportingInformation;
  }
  public void setSupportingInformation( java.util.List<ReferenceModel> value) {
    this.supportingInformation = value;
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
    builder.append("[ChargeItemModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime + "\n"); 
     builder.append("occurrencePeriod" + "->" + this.occurrencePeriod + "\n"); 
     builder.append("occurrenceTiming" + "->" + this.occurrenceTiming + "\n"); 
     builder.append("factorOverride" + "->" + this.factorOverride + "\n"); 
     builder.append("overrideReason" + "->" + this.overrideReason + "\n"); 
     builder.append("enteredDate" + "->" + this.enteredDate + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
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
    builder.append("[ChargeItemModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("partOf" + "->" + this.partOf + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime + "\n"); 
     builder.append("occurrencePeriod" + "->" + this.occurrencePeriod + "\n"); 
     builder.append("occurrenceTiming" + "->" + this.occurrenceTiming + "\n"); 
     builder.append("participant" + "->" + this.participant + "\n"); 
     builder.append("performingOrganization" + "->" + this.performingOrganization + "\n"); 
     builder.append("requestingOrganization" + "->" + this.requestingOrganization + "\n"); 
     builder.append("quantity" + "->" + this.quantity + "\n"); 
     builder.append("bodysite" + "->" + this.bodysite + "\n"); 
     builder.append("factorOverride" + "->" + this.factorOverride + "\n"); 
     builder.append("priceOverride" + "->" + this.priceOverride + "\n"); 
     builder.append("overrideReason" + "->" + this.overrideReason + "\n"); 
     builder.append("enterer" + "->" + this.enterer + "\n"); 
     builder.append("enteredDate" + "->" + this.enteredDate + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("service" + "->" + this.service + "\n"); 
     builder.append("account" + "->" + this.account + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("supportingInformation" + "->" + this.supportingInformation + "\n"); 
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