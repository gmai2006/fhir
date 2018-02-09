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
import org.fhir.entity.ChargeItemModel;
import com.google.gson.GsonBuilder;

/**
* "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation."
*/
public class ChargeItem  {
  /**
  * Description: "This is a ChargeItem resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this event performer or other systems."
  */
  private Identifier identifier;

  /**
  * Description: "References the source of pricing information, rules of application for the code this ChargeItem uses."
  */
  private java.util.List<String> definition = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for definition"
  */
  private transient java.util.List<Element> _definition = new java.util.ArrayList<>();

  /**
  * Description: "The current state of the ChargeItem."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "ChargeItems can be grouped to larger ChargeItems covering the whole set."
  */
  private java.util.List<Reference> partOf = new java.util.ArrayList<>();

  /**
  * Description: "A code that identifies the charge, like a billing code."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept code;

  /**
  * Description: "The individual or set of individuals the action is being or was performed on."
  */
  @javax.validation.constraints.NotNull
  private Reference subject;

  /**
  * Description: "The encounter or episode of care that establishes the context for this event."
  */
  private Reference context;

  /**
  * Description: "Date/time(s) or duration when the charged service was applied."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  private transient Element _occurrenceDateTime;

  /**
  * Description: "Date/time(s) or duration when the charged service was applied."
  */
  private Period occurrencePeriod;

  /**
  * Description: "Date/time(s) or duration when the charged service was applied."
  */
  private Timing occurrenceTiming;

  /**
  * Description: "Indicates who or what performed or participated in the charged service."
  */
  private java.util.List<ChargeItemParticipant> participant = new java.util.ArrayList<>();

  /**
  * Description: "The organization requesting the service."
  */
  private Reference performingOrganization;

  /**
  * Description: "The organization performing the service."
  */
  private Reference requestingOrganization;

  /**
  * Description: "Quantity of which the charge item has been serviced."
  */
  private Quantity quantity;

  /**
  * Description: "The anatomical location where the related service has been applied."
  */
  private java.util.List<CodeableConcept> bodysite = new java.util.ArrayList<>();

  /**
  * Description: "Factor overriding the factor determined by the rules associated with the code."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float factorOverride;

  /**
  * Description: "Extensions for factorOverride"
  */
  private transient Element _factorOverride;

  /**
  * Description: "Total price of the charge overriding the list price associated with the code."
  */
  private Money priceOverride;

  /**
  * Description: "If the list price or the rule based factor associated with the code is overridden, this attribute can capture a text to indicate the  reason for this action."
  */
  private String overrideReason;

  /**
  * Description: "Extensions for overrideReason"
  */
  private transient Element _overrideReason;

  /**
  * Description: "The device, practitioner, etc. who entered the charge item."
  */
  private Reference enterer;

  /**
  * Description: "Date the charge item was entered."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String enteredDate;

  /**
  * Description: "Extensions for enteredDate"
  */
  private transient Element _enteredDate;

  /**
  * Description: "Describes why the event occurred in coded or textual form."
  */
  private java.util.List<CodeableConcept> reason = new java.util.ArrayList<>();

  /**
  * Description: "Indicated the rendered service that caused this charge."
  */
  private java.util.List<Reference> service = new java.util.ArrayList<>();

  /**
  * Description: "Account into which this ChargeItems belongs."
  */
  private java.util.List<Reference> account = new java.util.ArrayList<>();

  /**
  * Description: "Comments made about the event by the performer, subject or other participants."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Further information supporting the this charge."
  */
  private java.util.List<Reference> supportingInformation = new java.util.ArrayList<>();

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

  public ChargeItem() {
  }

  public ChargeItem(ChargeItemModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      this.definition = org.fhir.utils.JsonUtils.json2Array(o.getDefinition());

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.partOf = Reference.fromArray(o.getPartOf());

      this.code = CodeableConcept.fromJson(o.getCode());
      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      if (null != o.getContext()) {
        this.context = new Reference(o.getContext());
        this.context.setId(this.getId());
      }

      if (null != o.getOccurrenceDateTime()) {
        this.occurrenceDateTime = new String(o.getOccurrenceDateTime());
      }

      this.occurrencePeriod = Period.fromJson(o.getOccurrencePeriod());
      this.occurrenceTiming = Timing.fromJson(o.getOccurrenceTiming());
      this.participant = ChargeItemParticipant.fromArray(o.getParticipant());

      if (null != o.getPerformingOrganization()) {
        this.performingOrganization = new Reference(o.getPerformingOrganization());
        this.performingOrganization.setId(this.getId());
      }

      if (null != o.getRequestingOrganization()) {
        this.requestingOrganization = new Reference(o.getRequestingOrganization());
        this.requestingOrganization.setId(this.getId());
      }

      this.quantity = Quantity.fromJson(o.getQuantity());
      this.bodysite = CodeableConcept.fromArray(o.getBodysite());
      if (null != o.getFactorOverride()) {
        this.factorOverride = new Float(o.getFactorOverride());
      }

      this.priceOverride = Money.fromJson(o.getPriceOverride());
      if (null != o.getOverrideReason()) {
        this.overrideReason = new String(o.getOverrideReason());
      }

      if (null != o.getEnterer()) {
        this.enterer = new Reference(o.getEnterer());
        this.enterer.setId(this.getId());
      }

      if (null != o.getEnteredDate()) {
        this.enteredDate = new String(o.getEnteredDate());
      }

      this.reason = CodeableConcept.fromArray(o.getReason());
      this.service = Reference.fromArray(o.getService());

      this.account = Reference.fromArray(o.getAccount());

      this.note = Annotation.fromArray(o.getNote());
      this.supportingInformation = Reference.fromArray(o.getSupportingInformation());

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
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setDefinition( java.util.List<String> value) {
    this.definition = value;
  }
  public java.util.List<String> getDefinition() {
    return this.definition;
  }
  public void set_definition( java.util.List<Element> value) {
    this._definition = value;
  }
  public java.util.List<Element> get_definition() {
    return this._definition;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
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
  public void setPartOf( java.util.List<Reference> value) {
    this.partOf = value;
  }
  public java.util.List<Reference> getPartOf() {
    return this.partOf;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void set_occurrenceDateTime( Element value) {
    this._occurrenceDateTime = value;
  }
  public Element get_occurrenceDateTime() {
    return this._occurrenceDateTime;
  }
  public void setOccurrencePeriod( Period value) {
    this.occurrencePeriod = value;
  }
  public Period getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setOccurrenceTiming( Timing value) {
    this.occurrenceTiming = value;
  }
  public Timing getOccurrenceTiming() {
    return this.occurrenceTiming;
  }
  public void setParticipant( java.util.List<ChargeItemParticipant> value) {
    this.participant = value;
  }
  public java.util.List<ChargeItemParticipant> getParticipant() {
    return this.participant;
  }
  public void setPerformingOrganization( Reference value) {
    this.performingOrganization = value;
  }
  public Reference getPerformingOrganization() {
    return this.performingOrganization;
  }
  public void setRequestingOrganization( Reference value) {
    this.requestingOrganization = value;
  }
  public Reference getRequestingOrganization() {
    return this.requestingOrganization;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setBodysite( java.util.List<CodeableConcept> value) {
    this.bodysite = value;
  }
  public java.util.List<CodeableConcept> getBodysite() {
    return this.bodysite;
  }
  public void setFactorOverride( Float value) {
    this.factorOverride = value;
  }
  public Float getFactorOverride() {
    return this.factorOverride;
  }
  public void set_factorOverride( Element value) {
    this._factorOverride = value;
  }
  public Element get_factorOverride() {
    return this._factorOverride;
  }
  public void setPriceOverride( Money value) {
    this.priceOverride = value;
  }
  public Money getPriceOverride() {
    return this.priceOverride;
  }
  public void setOverrideReason( String value) {
    this.overrideReason = value;
  }
  public String getOverrideReason() {
    return this.overrideReason;
  }
  public void set_overrideReason( Element value) {
    this._overrideReason = value;
  }
  public Element get_overrideReason() {
    return this._overrideReason;
  }
  public void setEnterer( Reference value) {
    this.enterer = value;
  }
  public Reference getEnterer() {
    return this.enterer;
  }
  public void setEnteredDate( String value) {
    this.enteredDate = value;
  }
  public String getEnteredDate() {
    return this.enteredDate;
  }
  public void set_enteredDate( Element value) {
    this._enteredDate = value;
  }
  public Element get_enteredDate() {
    return this._enteredDate;
  }
  public void setReason( java.util.List<CodeableConcept> value) {
    this.reason = value;
  }
  public java.util.List<CodeableConcept> getReason() {
    return this.reason;
  }
  public void setService( java.util.List<Reference> value) {
    this.service = value;
  }
  public java.util.List<Reference> getService() {
    return this.service;
  }
  public void setAccount( java.util.List<Reference> value) {
    this.account = value;
  }
  public java.util.List<Reference> getAccount() {
    return this.account;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setSupportingInformation( java.util.List<Reference> value) {
    this.supportingInformation = value;
  }
  public java.util.List<Reference> getSupportingInformation() {
    return this.supportingInformation;
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
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("_definition" + "[" + String.valueOf(this._definition) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("partOf" + "[" + String.valueOf(this.partOf) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("occurrenceDateTime" + "[" + String.valueOf(this.occurrenceDateTime) + "]\n"); 
     builder.append("_occurrenceDateTime" + "[" + String.valueOf(this._occurrenceDateTime) + "]\n"); 
     builder.append("occurrencePeriod" + "[" + String.valueOf(this.occurrencePeriod) + "]\n"); 
     builder.append("occurrenceTiming" + "[" + String.valueOf(this.occurrenceTiming) + "]\n"); 
     builder.append("participant" + "[" + String.valueOf(this.participant) + "]\n"); 
     builder.append("performingOrganization" + "[" + String.valueOf(this.performingOrganization) + "]\n"); 
     builder.append("requestingOrganization" + "[" + String.valueOf(this.requestingOrganization) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("bodysite" + "[" + String.valueOf(this.bodysite) + "]\n"); 
     builder.append("factorOverride" + "[" + String.valueOf(this.factorOverride) + "]\n"); 
     builder.append("_factorOverride" + "[" + String.valueOf(this._factorOverride) + "]\n"); 
     builder.append("priceOverride" + "[" + String.valueOf(this.priceOverride) + "]\n"); 
     builder.append("overrideReason" + "[" + String.valueOf(this.overrideReason) + "]\n"); 
     builder.append("_overrideReason" + "[" + String.valueOf(this._overrideReason) + "]\n"); 
     builder.append("enterer" + "[" + String.valueOf(this.enterer) + "]\n"); 
     builder.append("enteredDate" + "[" + String.valueOf(this.enteredDate) + "]\n"); 
     builder.append("_enteredDate" + "[" + String.valueOf(this._enteredDate) + "]\n"); 
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
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	ChargeItem,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ChargeItem" : { return ChargeItem.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	planned,
  	billable,
  	notbillable,
  	aborted,
  	billed,
  	enteredinerror,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "planned" : { return planned.toString(); }
  			case "billable" : { return billable.toString(); }
  			case "notbillable" : { return notbillable.toString(); }
  			case "aborted" : { return aborted.toString(); }
  			case "billed" : { return billed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<ChargeItem> fromArray(java.util.List<ChargeItemModel> list) {
    return (java.util.List<ChargeItem>)list.stream()
      .map(model -> new ChargeItem(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ChargeItemModel> toModelArray(java.util.List<ChargeItem> list) {
    return (java.util.List<ChargeItemModel>)list.stream()
      .map(model -> new ChargeItemModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ChargeItem fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ChargeItem.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ChargeItem o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ChargeItem> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}