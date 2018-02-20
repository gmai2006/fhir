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
import org.fhir.entity.ReferralRequestModel;
import com.google.gson.GsonBuilder;

/**
* "Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization."
*/
public class ReferralRequest  extends DomainResource  {
  /**
  * Description: "This is a ReferralRequest resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Business identifier that uniquely identifies the referral/care transfer request instance."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request."
  */
  protected java.util.List<Reference> definition = new java.util.ArrayList<>();

  /**
  * Description: "Indicates any plans, proposals or orders that this request is intended to satisfy - in whole or in part."
  */
  protected java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "Completed or terminated request(s) whose function is taken by this new request."
  */
  protected java.util.List<Reference> replaces = new java.util.ArrayList<>();

  /**
  * Description: "The business identifier of the logical \"grouping\" request/order that this referral is a part of."
  */
  protected Identifier groupIdentifier;

  /**
  * Description: "The status of the authorization/intention reflected by the referral request record."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Distinguishes the \"level\" of authorization/demand implicit in this request."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String intent;

  /**
  * Description: "Extensions for intent"
  */
  protected transient Element _intent;

  /**
  * Description: "An indication of the type of referral (or where applicable the type of transfer of care) request."
  */
  protected CodeableConcept type;

  /**
  * Description: "An indication of the urgency of referral (or where applicable the type of transfer of care) request."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String priority;

  /**
  * Description: "Extensions for priority"
  */
  protected transient Element _priority;

  /**
  * Description: "The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion."
  */
  protected java.util.List<CodeableConcept> serviceRequested = new java.util.ArrayList<>();

  /**
  * Description: "The patient who is the subject of a referral or transfer of care request."
  */
  @javax.validation.constraints.NotNull
  protected Reference subject;

  /**
  * Description: "The encounter at which the request for referral or transfer of care is initiated."
  */
  protected Reference context;

  /**
  * Description: "The period of time within which the services identified in the referral/transfer of care is specified or required to occur."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  protected transient Element _occurrenceDateTime;

  /**
  * Description: "The period of time within which the services identified in the referral/transfer of care is specified or required to occur."
  */
  protected Period occurrencePeriod;

  /**
  * Description: "Date/DateTime of creation for draft requests and date of activation for active requests."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String authoredOn;

  /**
  * Description: "Extensions for authoredOn"
  */
  protected transient Element _authoredOn;

  /**
  * Description: "The individual who initiated the request and has responsibility for its activation."
  */
  protected ReferralRequestRequester requester;

  /**
  * Description: "Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology."
  */
  protected CodeableConcept specialty;

  /**
  * Description: "The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request."
  */
  protected java.util.List<Reference> recipient = new java.util.ArrayList<>();

  /**
  * Description: "Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management."
  */
  protected java.util.List<CodeableConcept> reasonCode = new java.util.ArrayList<>();

  /**
  * Description: "Indicates another resource whose existence justifies this request."
  */
  protected java.util.List<Reference> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan."
  */
  protected java.util.List<Reference> supportingInfo = new java.util.ArrayList<>();

  /**
  * Description: "Comments made about the referral request by any of the participants."
  */
  protected java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource."
  */
  protected java.util.List<Reference> relevantHistory = new java.util.ArrayList<>();

  public ReferralRequest() {
  }

  public ReferralRequest(ReferralRequestModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
    	this.definition = ReferenceHelper.fromArray2Array(o.getDefinition());
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedOn = ReferenceHelper.fromArray2Array(o.getBasedOn());
    }
    if (null != o.getReplaces() && !o.getReplaces().isEmpty()) {
    	this.replaces = ReferenceHelper.fromArray2Array(o.getReplaces());
    }
    this.groupIdentifier = IdentifierHelper.fromJson(o.getGroupIdentifier());
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getIntent()) {
      this.intent = o.getIntent();
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getPriority()) {
      this.priority = o.getPriority();
    }
    if (null != o.getServiceRequested() && !o.getServiceRequested().isEmpty()) {
    	this.serviceRequested = CodeableConceptHelper.fromArray2Array(o.getServiceRequested());
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
    if (null != o.getAuthoredOn()) {
      this.authoredOn = o.getAuthoredOn();
    }
    if (null != o.getRequester() && !o.getRequester().isEmpty()) {
      this.requester = new ReferralRequestRequester(o.getRequester().get(0));
    }
    if (null != o.getSpecialty() && !o.getSpecialty().isEmpty()) {
      this.specialty = new CodeableConcept(o.getSpecialty().get(0));
    }
    if (null != o.getRecipient() && !o.getRecipient().isEmpty()) {
    	this.recipient = ReferenceHelper.fromArray2Array(o.getRecipient());
    }
    if (null != o.getReasonCode() && !o.getReasonCode().isEmpty()) {
    	this.reasonCode = CodeableConceptHelper.fromArray2Array(o.getReasonCode());
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonReference = ReferenceHelper.fromArray2Array(o.getReasonReference());
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getSupportingInfo() && !o.getSupportingInfo().isEmpty()) {
    	this.supportingInfo = ReferenceHelper.fromArray2Array(o.getSupportingInfo());
    }
    if (null != o.getRelevantHistory() && !o.getRelevantHistory().isEmpty()) {
    	this.relevantHistory = ReferenceHelper.fromArray2Array(o.getRelevantHistory());
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
  public void setDefinition( java.util.List<Reference> value) {
    this.definition = value;
  }
  public java.util.List<Reference> getDefinition() {
    return this.definition;
  }
  public void setBasedOn( java.util.List<Reference> value) {
    this.basedOn = value;
  }
  public java.util.List<Reference> getBasedOn() {
    return this.basedOn;
  }
  public void setReplaces( java.util.List<Reference> value) {
    this.replaces = value;
  }
  public java.util.List<Reference> getReplaces() {
    return this.replaces;
  }
  public void setGroupIdentifier( Identifier value) {
    this.groupIdentifier = value;
  }
  public Identifier getGroupIdentifier() {
    return this.groupIdentifier;
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
  public void setIntent( String value) {
    this.intent = value;
  }
  public String getIntent() {
    return this.intent;
  }
  public void set_intent( Element value) {
    this._intent = value;
  }
  public Element get_intent() {
    return this._intent;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void set_priority( Element value) {
    this._priority = value;
  }
  public Element get_priority() {
    return this._priority;
  }
  public void setServiceRequested( java.util.List<CodeableConcept> value) {
    this.serviceRequested = value;
  }
  public java.util.List<CodeableConcept> getServiceRequested() {
    return this.serviceRequested;
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
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void set_authoredOn( Element value) {
    this._authoredOn = value;
  }
  public Element get_authoredOn() {
    return this._authoredOn;
  }
  public void setRequester( ReferralRequestRequester value) {
    this.requester = value;
  }
  public ReferralRequestRequester getRequester() {
    return this.requester;
  }
  public void setSpecialty( CodeableConcept value) {
    this.specialty = value;
  }
  public CodeableConcept getSpecialty() {
    return this.specialty;
  }
  public void setRecipient( java.util.List<Reference> value) {
    this.recipient = value;
  }
  public java.util.List<Reference> getRecipient() {
    return this.recipient;
  }
  public void setReasonCode( java.util.List<CodeableConcept> value) {
    this.reasonCode = value;
  }
  public java.util.List<CodeableConcept> getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonReference( java.util.List<Reference> value) {
    this.reasonReference = value;
  }
  public java.util.List<Reference> getReasonReference() {
    return this.reasonReference;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setSupportingInfo( java.util.List<Reference> value) {
    this.supportingInfo = value;
  }
  public java.util.List<Reference> getSupportingInfo() {
    return this.supportingInfo;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setRelevantHistory( java.util.List<Reference> value) {
    this.relevantHistory = value;
  }
  public java.util.List<Reference> getRelevantHistory() {
    return this.relevantHistory;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ReferralRequest]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.replaces != null) builder.append("replaces" + "->" + this.replaces.toString() + "\n"); 
     if(this.groupIdentifier != null) builder.append("groupIdentifier" + "->" + this.groupIdentifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.intent != null) builder.append("intent" + "->" + this.intent.toString() + "\n"); 
     if(this._intent != null) builder.append("_intent" + "->" + this._intent.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.priority != null) builder.append("priority" + "->" + this.priority.toString() + "\n"); 
     if(this._priority != null) builder.append("_priority" + "->" + this._priority.toString() + "\n"); 
     if(this.serviceRequested != null) builder.append("serviceRequested" + "->" + this.serviceRequested.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.occurrenceDateTime != null) builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime.toString() + "\n"); 
     if(this._occurrenceDateTime != null) builder.append("_occurrenceDateTime" + "->" + this._occurrenceDateTime.toString() + "\n"); 
     if(this.occurrencePeriod != null) builder.append("occurrencePeriod" + "->" + this.occurrencePeriod.toString() + "\n"); 
     if(this.authoredOn != null) builder.append("authoredOn" + "->" + this.authoredOn.toString() + "\n"); 
     if(this._authoredOn != null) builder.append("_authoredOn" + "->" + this._authoredOn.toString() + "\n"); 
     if(this.requester != null) builder.append("requester" + "->" + this.requester.toString() + "\n"); 
     if(this.specialty != null) builder.append("specialty" + "->" + this.specialty.toString() + "\n"); 
     if(this.recipient != null) builder.append("recipient" + "->" + this.recipient.toString() + "\n"); 
     if(this.reasonCode != null) builder.append("reasonCode" + "->" + this.reasonCode.toString() + "\n"); 
     if(this.reasonReference != null) builder.append("reasonReference" + "->" + this.reasonReference.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.supportingInfo != null) builder.append("supportingInfo" + "->" + this.supportingInfo.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.relevantHistory != null) builder.append("relevantHistory" + "->" + this.relevantHistory.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	ReferralRequest,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ReferralRequest" : { return ReferralRequest.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}