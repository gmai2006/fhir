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
public class ReferralRequest  {
  /**
  * Description: "This is a ReferralRequest resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Business identifier that uniquely identifies the referral/care transfer request instance."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request."
  */
  private java.util.List<Reference> definition = new java.util.ArrayList<>();

  /**
  * Description: "Indicates any plans, proposals or orders that this request is intended to satisfy - in whole or in part."
  */
  private java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "Completed or terminated request(s) whose function is taken by this new request."
  */
  private java.util.List<Reference> replaces = new java.util.ArrayList<>();

  /**
  * Description: "The business identifier of the logical \"grouping\" request/order that this referral is a part of."
  */
  private Identifier groupIdentifier;

  /**
  * Description: "The status of the authorization/intention reflected by the referral request record."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Distinguishes the \"level\" of authorization/demand implicit in this request."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String intent;

  /**
  * Description: "Extensions for intent"
  */
  private transient Element _intent;

  /**
  * Description: "An indication of the type of referral (or where applicable the type of transfer of care) request."
  */
  private CodeableConcept type;

  /**
  * Description: "An indication of the urgency of referral (or where applicable the type of transfer of care) request."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String priority;

  /**
  * Description: "Extensions for priority"
  */
  private transient Element _priority;

  /**
  * Description: "The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion."
  */
  private java.util.List<CodeableConcept> serviceRequested = new java.util.ArrayList<>();

  /**
  * Description: "The patient who is the subject of a referral or transfer of care request."
  */
  @javax.validation.constraints.NotNull
  private Reference subject;

  /**
  * Description: "The encounter at which the request for referral or transfer of care is initiated."
  */
  private Reference context;

  /**
  * Description: "The period of time within which the services identified in the referral/transfer of care is specified or required to occur."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  private transient Element _occurrenceDateTime;

  /**
  * Description: "The period of time within which the services identified in the referral/transfer of care is specified or required to occur."
  */
  private Period occurrencePeriod;

  /**
  * Description: "Date/DateTime of creation for draft requests and date of activation for active requests."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String authoredOn;

  /**
  * Description: "Extensions for authoredOn"
  */
  private transient Element _authoredOn;

  /**
  * Description: "The individual who initiated the request and has responsibility for its activation."
  */
  private ReferralRequestRequester requester;

  /**
  * Description: "Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology."
  */
  private CodeableConcept specialty;

  /**
  * Description: "The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request."
  */
  private java.util.List<Reference> recipient = new java.util.ArrayList<>();

  /**
  * Description: "Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management."
  */
  private java.util.List<CodeableConcept> reasonCode = new java.util.ArrayList<>();

  /**
  * Description: "Indicates another resource whose existence justifies this request."
  */
  private java.util.List<Reference> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan."
  */
  private java.util.List<Reference> supportingInfo = new java.util.ArrayList<>();

  /**
  * Description: "Comments made about the referral request by any of the participants."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource."
  */
  private java.util.List<Reference> relevantHistory = new java.util.ArrayList<>();

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

  public ReferralRequest() {
  }

  public ReferralRequest(ReferralRequestModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      this.definition = Reference.fromArray(o.getDefinition());

      this.basedOn = Reference.fromArray(o.getBasedOn());

      this.replaces = Reference.fromArray(o.getReplaces());

      this.groupIdentifier = Identifier.fromJson(o.getGroupIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getIntent()) {
        this.intent = new String(o.getIntent());
      }

      this.type = CodeableConcept.fromJson(o.getType());
      if (null != o.getPriority()) {
        this.priority = new String(o.getPriority());
      }

      this.serviceRequested = CodeableConcept.fromArray(o.getServiceRequested());
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
      if (null != o.getAuthoredOn()) {
        this.authoredOn = new String(o.getAuthoredOn());
      }

      if (null != o.getRequester()) {
        this.requester = new ReferralRequestRequester(o.getRequester());
        this.requester.setId(this.getId());
      }

      this.specialty = CodeableConcept.fromJson(o.getSpecialty());
      this.recipient = Reference.fromArray(o.getRecipient());

      this.reasonCode = CodeableConcept.fromArray(o.getReasonCode());
      this.reasonReference = Reference.fromArray(o.getReasonReference());

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.supportingInfo = Reference.fromArray(o.getSupportingInfo());

      this.note = Annotation.fromArray(o.getNote());
      this.relevantHistory = Reference.fromArray(o.getRelevantHistory());

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
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("replaces" + "[" + String.valueOf(this.replaces) + "]\n"); 
     builder.append("groupIdentifier" + "[" + String.valueOf(this.groupIdentifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("intent" + "[" + String.valueOf(this.intent) + "]\n"); 
     builder.append("_intent" + "[" + String.valueOf(this._intent) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("_priority" + "[" + String.valueOf(this._priority) + "]\n"); 
     builder.append("serviceRequested" + "[" + String.valueOf(this.serviceRequested) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("occurrenceDateTime" + "[" + String.valueOf(this.occurrenceDateTime) + "]\n"); 
     builder.append("_occurrenceDateTime" + "[" + String.valueOf(this._occurrenceDateTime) + "]\n"); 
     builder.append("occurrencePeriod" + "[" + String.valueOf(this.occurrencePeriod) + "]\n"); 
     builder.append("authoredOn" + "[" + String.valueOf(this.authoredOn) + "]\n"); 
     builder.append("_authoredOn" + "[" + String.valueOf(this._authoredOn) + "]\n"); 
     builder.append("requester" + "[" + String.valueOf(this.requester) + "]\n"); 
     builder.append("specialty" + "[" + String.valueOf(this.specialty) + "]\n"); 
     builder.append("recipient" + "[" + String.valueOf(this.recipient) + "]\n"); 
     builder.append("reasonCode" + "[" + String.valueOf(this.reasonCode) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("supportingInfo" + "[" + String.valueOf(this.supportingInfo) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("relevantHistory" + "[" + String.valueOf(this.relevantHistory) + "]\n"); 
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

  public static java.util.List<ReferralRequest> fromArray(java.util.List<ReferralRequestModel> list) {
    return (java.util.List<ReferralRequest>)list.stream()
      .map(model -> new ReferralRequest(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ReferralRequestModel> toModelArray(java.util.List<ReferralRequest> list) {
    return (java.util.List<ReferralRequestModel>)list.stream()
      .map(model -> new ReferralRequestModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ReferralRequest fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ReferralRequest.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ReferralRequest o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ReferralRequest> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}