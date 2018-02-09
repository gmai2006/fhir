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
import org.fhir.entity.ProcedureRequestModel;
import com.google.gson.GsonBuilder;

/**
* "A record of a request for diagnostic investigations, treatments, or operations to be performed."
*/
public class ProcedureRequest  {
  /**
  * Description: "This is a ProcedureRequest resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this order instance by the orderer and/or the receiver and/or order fulfiller."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Protocol or definition followed by this request."
  */
  private java.util.List<Reference> definition = new java.util.ArrayList<>();

  /**
  * Description: "Plan/proposal/order fulfilled by this request."
  */
  private java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "The request takes the place of the referenced completed or terminated request(s)."
  */
  private java.util.List<Reference> replaces = new java.util.ArrayList<>();

  /**
  * Description: "A shared identifier common to all procedure or diagnostic requests that were authorized more or less simultaneously by a single author, representing the composite or group identifier."
  */
  private Identifier requisition;

  /**
  * Description: "The status of the order."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Whether the request is a proposal, plan, an original order or a reflex order."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String intent;

  /**
  * Description: "Extensions for intent"
  */
  private transient Element _intent;

  /**
  * Description: "Indicates how quickly the ProcedureRequest should be addressed with respect to other requests."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String priority;

  /**
  * Description: "Extensions for priority"
  */
  private transient Element _priority;

  /**
  * Description: "Set this to true if the record is saying that the procedure should NOT be performed."
  */
  private Boolean doNotPerform;

  /**
  * Description: "Extensions for doNotPerform"
  */
  private transient Element _doNotPerform;

  /**
  * Description: "A code that classifies the procedure for searching, sorting and display purposes (e.g. \"Surgical Procedure\")."
  */
  private java.util.List<CodeableConcept> category = new java.util.ArrayList<>();

  /**
  * Description: "A code that identifies a particular procedure, diagnostic investigation, or panel of investigations, that have been requested."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept code;

  /**
  * Description: "On whom or what the procedure or diagnostic is to be performed. This is usually a human patient, but can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans)."
  */
  @javax.validation.constraints.NotNull
  private Reference subject;

  /**
  * Description: "An encounter or episode of care that provides additional information about the healthcare context in which this request is made."
  */
  private Reference context;

  /**
  * Description: "The date/time at which the diagnostic testing should occur."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  private transient Element _occurrenceDateTime;

  /**
  * Description: "The date/time at which the diagnostic testing should occur."
  */
  private Period occurrencePeriod;

  /**
  * Description: "The date/time at which the diagnostic testing should occur."
  */
  private Timing occurrenceTiming;

  /**
  * Description: "If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.  For example \"pain\", \"on flare-up\", etc."
  */
  private Boolean asNeededBoolean;

  /**
  * Description: "Extensions for asNeededBoolean"
  */
  private transient Element _asNeededBoolean;

  /**
  * Description: "If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.  For example \"pain\", \"on flare-up\", etc."
  */
  private CodeableConcept asNeededCodeableConcept;

  /**
  * Description: "When the request transitioned to being actionable."
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
  private ProcedureRequestRequester requester;

  /**
  * Description: "Desired type of performer for doing the diagnostic testing."
  */
  private CodeableConcept performerType;

  /**
  * Description: "The desired perfomer for doing the diagnostic testing.  For example, the surgeon, dermatopathologist, endoscopist, etc."
  */
  private Reference performer;

  /**
  * Description: "An explanation or justification for why this diagnostic investigation is being requested in coded or textual form.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation."
  */
  private java.util.List<CodeableConcept> reasonCode = new java.util.ArrayList<>();

  /**
  * Description: "Indicates another resource that provides a justification for why this diagnostic investigation is being requested.   May relate to the resources referred to in supportingInformation."
  */
  private java.util.List<Reference> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "Additional clinical information about the patient or specimen that may influence the procedure or diagnostics or their interpretations.     This information includes diagnosis, clinical findings and other observations.  In laboratory ordering these are typically referred to as \"ask at order entry questions (AOEs)\".  This includes observations explicitly requested by the producer (filler) to provide context or supporting information needed to complete the order. For example,  reporting the amount of inspired oxygen for blood gas measurements."
  */
  private java.util.List<Reference> supportingInfo = new java.util.ArrayList<>();

  /**
  * Description: "One or more specimens that the laboratory procedure will use."
  */
  private java.util.List<Reference> specimen = new java.util.ArrayList<>();

  /**
  * Description: "Anatomic location where the procedure should be performed. This is the target site."
  */
  private java.util.List<CodeableConcept> bodySite = new java.util.ArrayList<>();

  /**
  * Description: "Any other notes and comments made about the service request. For example, letting provider know that \"patient hates needles\" or other provider instructions."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Key events in the history of the request."
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

  public ProcedureRequest() {
  }

  public ProcedureRequest(ProcedureRequestModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      this.definition = Reference.fromArray(o.getDefinition());

      this.basedOn = Reference.fromArray(o.getBasedOn());

      this.replaces = Reference.fromArray(o.getReplaces());

      this.requisition = Identifier.fromJson(o.getRequisition());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getIntent()) {
        this.intent = new String(o.getIntent());
      }

      if (null != o.getPriority()) {
        this.priority = new String(o.getPriority());
      }

      if (null != o.getDoNotPerform()) {
        this.doNotPerform = new Boolean(o.getDoNotPerform());
      }

      this.category = CodeableConcept.fromArray(o.getCategory());
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
      if (null != o.getAsNeededBoolean()) {
        this.asNeededBoolean = new Boolean(o.getAsNeededBoolean());
      }

      this.asNeededCodeableConcept = CodeableConcept.fromJson(o.getAsNeededCodeableConcept());
      if (null != o.getAuthoredOn()) {
        this.authoredOn = new String(o.getAuthoredOn());
      }

      if (null != o.getRequester()) {
        this.requester = new ProcedureRequestRequester(o.getRequester());
        this.requester.setId(this.getId());
      }

      this.performerType = CodeableConcept.fromJson(o.getPerformerType());
      if (null != o.getPerformer()) {
        this.performer = new Reference(o.getPerformer());
        this.performer.setId(this.getId());
      }

      this.reasonCode = CodeableConcept.fromArray(o.getReasonCode());
      this.reasonReference = Reference.fromArray(o.getReasonReference());

      this.supportingInfo = Reference.fromArray(o.getSupportingInfo());

      this.specimen = Reference.fromArray(o.getSpecimen());

      this.bodySite = CodeableConcept.fromArray(o.getBodySite());
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
  public void setRequisition( Identifier value) {
    this.requisition = value;
  }
  public Identifier getRequisition() {
    return this.requisition;
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
  public void setDoNotPerform( Boolean value) {
    this.doNotPerform = value;
  }
  public Boolean getDoNotPerform() {
    return this.doNotPerform;
  }
  public void set_doNotPerform( Element value) {
    this._doNotPerform = value;
  }
  public Element get_doNotPerform() {
    return this._doNotPerform;
  }
  public void setCategory( java.util.List<CodeableConcept> value) {
    this.category = value;
  }
  public java.util.List<CodeableConcept> getCategory() {
    return this.category;
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
  public void setAsNeededBoolean( Boolean value) {
    this.asNeededBoolean = value;
  }
  public Boolean getAsNeededBoolean() {
    return this.asNeededBoolean;
  }
  public void set_asNeededBoolean( Element value) {
    this._asNeededBoolean = value;
  }
  public Element get_asNeededBoolean() {
    return this._asNeededBoolean;
  }
  public void setAsNeededCodeableConcept( CodeableConcept value) {
    this.asNeededCodeableConcept = value;
  }
  public CodeableConcept getAsNeededCodeableConcept() {
    return this.asNeededCodeableConcept;
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
  public void setRequester( ProcedureRequestRequester value) {
    this.requester = value;
  }
  public ProcedureRequestRequester getRequester() {
    return this.requester;
  }
  public void setPerformerType( CodeableConcept value) {
    this.performerType = value;
  }
  public CodeableConcept getPerformerType() {
    return this.performerType;
  }
  public void setPerformer( Reference value) {
    this.performer = value;
  }
  public Reference getPerformer() {
    return this.performer;
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
  public void setSupportingInfo( java.util.List<Reference> value) {
    this.supportingInfo = value;
  }
  public java.util.List<Reference> getSupportingInfo() {
    return this.supportingInfo;
  }
  public void setSpecimen( java.util.List<Reference> value) {
    this.specimen = value;
  }
  public java.util.List<Reference> getSpecimen() {
    return this.specimen;
  }
  public void setBodySite( java.util.List<CodeableConcept> value) {
    this.bodySite = value;
  }
  public java.util.List<CodeableConcept> getBodySite() {
    return this.bodySite;
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
     builder.append("requisition" + "[" + String.valueOf(this.requisition) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("intent" + "[" + String.valueOf(this.intent) + "]\n"); 
     builder.append("_intent" + "[" + String.valueOf(this._intent) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("_priority" + "[" + String.valueOf(this._priority) + "]\n"); 
     builder.append("doNotPerform" + "[" + String.valueOf(this.doNotPerform) + "]\n"); 
     builder.append("_doNotPerform" + "[" + String.valueOf(this._doNotPerform) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("occurrenceDateTime" + "[" + String.valueOf(this.occurrenceDateTime) + "]\n"); 
     builder.append("_occurrenceDateTime" + "[" + String.valueOf(this._occurrenceDateTime) + "]\n"); 
     builder.append("occurrencePeriod" + "[" + String.valueOf(this.occurrencePeriod) + "]\n"); 
     builder.append("occurrenceTiming" + "[" + String.valueOf(this.occurrenceTiming) + "]\n"); 
     builder.append("asNeededBoolean" + "[" + String.valueOf(this.asNeededBoolean) + "]\n"); 
     builder.append("_asNeededBoolean" + "[" + String.valueOf(this._asNeededBoolean) + "]\n"); 
     builder.append("asNeededCodeableConcept" + "[" + String.valueOf(this.asNeededCodeableConcept) + "]\n"); 
     builder.append("authoredOn" + "[" + String.valueOf(this.authoredOn) + "]\n"); 
     builder.append("_authoredOn" + "[" + String.valueOf(this._authoredOn) + "]\n"); 
     builder.append("requester" + "[" + String.valueOf(this.requester) + "]\n"); 
     builder.append("performerType" + "[" + String.valueOf(this.performerType) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("reasonCode" + "[" + String.valueOf(this.reasonCode) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("supportingInfo" + "[" + String.valueOf(this.supportingInfo) + "]\n"); 
     builder.append("specimen" + "[" + String.valueOf(this.specimen) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
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
  	ProcedureRequest,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ProcedureRequest" : { return ProcedureRequest.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<ProcedureRequest> fromArray(java.util.List<ProcedureRequestModel> list) {
    return (java.util.List<ProcedureRequest>)list.stream()
      .map(model -> new ProcedureRequest(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ProcedureRequestModel> toModelArray(java.util.List<ProcedureRequest> list) {
    return (java.util.List<ProcedureRequestModel>)list.stream()
      .map(model -> new ProcedureRequestModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ProcedureRequest fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ProcedureRequest.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ProcedureRequest o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ProcedureRequest> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}