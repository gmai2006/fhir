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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ChargeItem  extends DomainResource  {
  /**
  * Description: "This is a ChargeItem resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifiers assigned to this event performer or other systems."
  */
  protected Identifier identifier;

  /**
  * Description: "References the source of pricing information, rules of application for the code this ChargeItem uses."
  */
  protected java.util.List<String> definition;

  /**
  * Description: "Extensions for definition"
  */
  protected transient java.util.List<Element> _definition;

  /**
  * Description: "The current state of the ChargeItem."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "ChargeItems can be grouped to larger ChargeItems covering the whole set."
  */
  protected java.util.List<Reference> partOf;

  /**
  * Description: "A code that identifies the charge, like a billing code."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept code;

  /**
  * Description: "The individual or set of individuals the action is being or was performed on."
  */
  @javax.validation.constraints.NotNull
  protected Reference subject;

  /**
  * Description: "The encounter or episode of care that establishes the context for this event."
  */
  protected Reference context;

  /**
  * Description: "Date/time(s) or duration when the charged service was applied."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  protected transient Element _occurrenceDateTime;

  /**
  * Description: "Date/time(s) or duration when the charged service was applied."
  */
  protected Period occurrencePeriod;

  /**
  * Description: "Date/time(s) or duration when the charged service was applied."
  */
  protected Timing occurrenceTiming;

  /**
  * Description: "Indicates who or what performed or participated in the charged service."
  */
  protected java.util.List<ChargeItemParticipant> participant;

  /**
  * Description: "The organization requesting the service."
  */
  protected Reference performingOrganization;

  /**
  * Description: "The organization performing the service."
  */
  protected Reference requestingOrganization;

  /**
  * Description: "Quantity of which the charge item has been serviced."
  */
  protected Quantity quantity;

  /**
  * Description: "The anatomical location where the related service has been applied."
  */
  protected java.util.List<CodeableConcept> bodysite;

  /**
  * Description: "Factor overriding the factor determined by the rules associated with the code."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float factorOverride;

  /**
  * Description: "Extensions for factorOverride"
  */
  protected transient Element _factorOverride;

  /**
  * Description: "Total price of the charge overriding the list price associated with the code."
  */
  protected Money priceOverride;

  /**
  * Description: "If the list price or the rule based factor associated with the code is overridden, this attribute can capture a text to indicate the  reason for this action."
  */
  protected String overrideReason;

  /**
  * Description: "Extensions for overrideReason"
  */
  protected transient Element _overrideReason;

  /**
  * Description: "The device, practitioner, etc. who entered the charge item."
  */
  protected Reference enterer;

  /**
  * Description: "Date the charge item was entered."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String enteredDate;

  /**
  * Description: "Extensions for enteredDate"
  */
  protected transient Element _enteredDate;

  /**
  * Description: "Describes why the event occurred in coded or textual form."
  */
  protected java.util.List<CodeableConcept> reason;

  /**
  * Description: "Indicated the rendered service that caused this charge."
  */
  protected java.util.List<Reference> service;

  /**
  * Description: "Account into which this ChargeItems belongs."
  */
  protected java.util.List<Reference> account;

  /**
  * Description: "Comments made about the event by the performer, subject or other participants."
  */
  protected java.util.List<Annotation> note;

  /**
  * Description: "Further information supporting the this charge."
  */
  protected java.util.List<Reference> supportingInformation;

  public ChargeItem() {
  }

  public ChargeItem(ChargeItemModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (o.getDefinition() != null) {
    	this.definition = org.fhir.utils.JsonUtils.json2Array(o.getDefinition());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partOf = ReferenceHelper.fromArray2Array(o.getPartOf());
    }
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    if (null != o.getOccurrenceDateTime()) {
      this.occurrenceDateTime = o.getOccurrenceDateTime();
    }
    this.occurrencePeriod = PeriodHelper.fromJson(o.getOccurrencePeriod());
    this.occurrenceTiming = TimingHelper.fromJson(o.getOccurrenceTiming());
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant = ChargeItemParticipantHelper.fromArray2Array(o.getParticipant());
    }
    if (null != o.getPerformingOrganization() && !o.getPerformingOrganization().isEmpty()) {
      this.performingOrganization = new Reference(o.getPerformingOrganization().get(0));
    }
    if (null != o.getRequestingOrganization() && !o.getRequestingOrganization().isEmpty()) {
      this.requestingOrganization = new Reference(o.getRequestingOrganization().get(0));
    }
    if (null != o.getQuantity() && !o.getQuantity().isEmpty()) {
      this.quantity = new Quantity(o.getQuantity().get(0));
    }
    if (null != o.getBodysite() && !o.getBodysite().isEmpty()) {
    	this.bodysite = CodeableConceptHelper.fromArray2Array(o.getBodysite());
    }
    if (null != o.getFactorOverride()) {
      this.factorOverride = o.getFactorOverride();
    }
    if (null != o.getPriceOverride() && !o.getPriceOverride().isEmpty()) {
      this.priceOverride = new Money(o.getPriceOverride().get(0));
    }
    if (null != o.getOverrideReason()) {
      this.overrideReason = o.getOverrideReason();
    }
    if (null != o.getEnterer() && !o.getEnterer().isEmpty()) {
      this.enterer = new Reference(o.getEnterer().get(0));
    }
    if (null != o.getEnteredDate()) {
      this.enteredDate = o.getEnteredDate();
    }
    if (null != o.getReason() && !o.getReason().isEmpty()) {
    	this.reason = CodeableConceptHelper.fromArray2Array(o.getReason());
    }
    if (null != o.getService() && !o.getService().isEmpty()) {
    	this.service = ReferenceHelper.fromArray2Array(o.getService());
    }
    if (null != o.getAccount() && !o.getAccount().isEmpty()) {
    	this.account = ReferenceHelper.fromArray2Array(o.getAccount());
    }
    if (null != o.getSupportingInformation() && !o.getSupportingInformation().isEmpty()) {
    	this.supportingInformation = ReferenceHelper.fromArray2Array(o.getSupportingInformation());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ChargeItem]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this._definition != null) builder.append("_definition" + "->" + this._definition.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.occurrenceDateTime != null) builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime.toString() + "\n"); 
     if(this._occurrenceDateTime != null) builder.append("_occurrenceDateTime" + "->" + this._occurrenceDateTime.toString() + "\n"); 
     if(this.occurrencePeriod != null) builder.append("occurrencePeriod" + "->" + this.occurrencePeriod.toString() + "\n"); 
     if(this.occurrenceTiming != null) builder.append("occurrenceTiming" + "->" + this.occurrenceTiming.toString() + "\n"); 
     if(this.participant != null) builder.append("participant" + "->" + this.participant.toString() + "\n"); 
     if(this.performingOrganization != null) builder.append("performingOrganization" + "->" + this.performingOrganization.toString() + "\n"); 
     if(this.requestingOrganization != null) builder.append("requestingOrganization" + "->" + this.requestingOrganization.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.bodysite != null) builder.append("bodysite" + "->" + this.bodysite.toString() + "\n"); 
     if(this.factorOverride != null) builder.append("factorOverride" + "->" + this.factorOverride.toString() + "\n"); 
     if(this._factorOverride != null) builder.append("_factorOverride" + "->" + this._factorOverride.toString() + "\n"); 
     if(this.priceOverride != null) builder.append("priceOverride" + "->" + this.priceOverride.toString() + "\n"); 
     if(this.overrideReason != null) builder.append("overrideReason" + "->" + this.overrideReason.toString() + "\n"); 
     if(this._overrideReason != null) builder.append("_overrideReason" + "->" + this._overrideReason.toString() + "\n"); 
     if(this.enterer != null) builder.append("enterer" + "->" + this.enterer.toString() + "\n"); 
     if(this.enteredDate != null) builder.append("enteredDate" + "->" + this.enteredDate.toString() + "\n"); 
     if(this._enteredDate != null) builder.append("_enteredDate" + "->" + this._enteredDate.toString() + "\n"); 
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); 
     if(this.service != null) builder.append("service" + "->" + this.service.toString() + "\n"); 
     if(this.account != null) builder.append("account" + "->" + this.account.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.supportingInformation != null) builder.append("supportingInformation" + "->" + this.supportingInformation.toString() + "\n"); ;
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

}