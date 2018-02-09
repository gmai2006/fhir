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
import org.fhir.entity.TaskModel;
import com.google.gson.GsonBuilder;

/**
* "A task to be performed."
*/
public class Task  {
  /**
  * Description: "This is a Task resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The business identifier for this task."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc."
  */
  private String definitionUri;

  /**
  * Description: "Extensions for definitionUri"
  */
  private transient Element _definitionUri;

  /**
  * Description: "A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc."
  */
  private Reference definitionReference;

  /**
  * Description: "BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a \"request\" resource such as a ProcedureRequest, MedicationRequest, ProcedureRequest, CarePlan, etc. which is distinct from the \"request\" resource the task is seeking to fulfil.  This latter resource is referenced by FocusOn.  For example, based on a ProcedureRequest (= BasedOn), a task is created to fulfil a procedureRequest ( = FocusOn ) to collect a specimen from a patient."
  */
  private java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "An identifier that links together multiple tasks and other requests that were created in the same context."
  */
  private Identifier groupIdentifier;

  /**
  * Description: "Task that this particular task is part of."
  */
  private java.util.List<Reference> partOf = new java.util.ArrayList<>();

  /**
  * Description: "The current status of the task."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "An explanation as to why this task is held, failed, was refused, etc."
  */
  private CodeableConcept statusReason;

  /**
  * Description: "Contains business-specific nuances of the business state."
  */
  private CodeableConcept businessStatus;

  /**
  * Description: "Indicates the \"level\" of actionability associated with the Task.  I.e. Is this a proposed task, a planned task, an actionable task, etc."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String intent;

  /**
  * Description: "Extensions for intent"
  */
  private transient Element _intent;

  /**
  * Description: "Indicates how quickly the Task should be addressed with respect to other requests."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String priority;

  /**
  * Description: "Extensions for priority"
  */
  private transient Element _priority;

  /**
  * Description: "A name or code (or both) briefly describing what the task involves."
  */
  private CodeableConcept code;

  /**
  * Description: "A free-text description of what is to be performed."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "The request being actioned or the resource being manipulated by this task."
  */
  private Reference focus;

  /**
  * Description: "The entity who benefits from the performance of the service specified in the task (e.g., the patient)."
  */
  private Reference FHIRfor;

  /**
  * Description: "The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created."
  */
  private Reference context;

  /**
  * Description: "Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end)."
  */
  private Period executionPeriod;

  /**
  * Description: "The date and time this task was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String authoredOn;

  /**
  * Description: "Extensions for authoredOn"
  */
  private transient Element _authoredOn;

  /**
  * Description: "The date and time of last modification to this task."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String lastModified;

  /**
  * Description: "Extensions for lastModified"
  */
  private transient Element _lastModified;

  /**
  * Description: "The creator of the task."
  */
  private TaskRequester requester;

  /**
  * Description: "The type of participant that can execute the task."
  */
  private java.util.List<CodeableConcept> performerType = new java.util.ArrayList<>();

  /**
  * Description: "Individual organization or Device currently responsible for task execution."
  */
  private Reference owner;

  /**
  * Description: "A description or code indicating why this task needs to be performed."
  */
  private CodeableConcept reason;

  /**
  * Description: "Free-text information captured about the task as it progresses."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task."
  */
  private java.util.List<Reference> relevantHistory = new java.util.ArrayList<>();

  /**
  * Description: "If the Task.focus is a request resource and the task is seeking fulfillment (i.e is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned."
  */
  private TaskRestriction restriction;

  /**
  * Description: "Additional information that may be needed in the execution of the task."
  */
  private java.util.List<TaskInput> input = new java.util.ArrayList<>();

  /**
  * Description: "Outputs produced by the Task."
  */
  private java.util.List<TaskOutput> output = new java.util.ArrayList<>();

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

  public Task() {
  }

  public Task(TaskModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getDefinitionUri()) {
        this.definitionUri = new String(o.getDefinitionUri());
      }

      if (null != o.getDefinitionReference()) {
        this.definitionReference = new Reference(o.getDefinitionReference());
        this.definitionReference.setId(this.getId());
      }

      this.basedOn = Reference.fromArray(o.getBasedOn());

      this.groupIdentifier = Identifier.fromJson(o.getGroupIdentifier());
      this.partOf = Reference.fromArray(o.getPartOf());

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.statusReason = CodeableConcept.fromJson(o.getStatusReason());
      this.businessStatus = CodeableConcept.fromJson(o.getBusinessStatus());
      if (null != o.getIntent()) {
        this.intent = new String(o.getIntent());
      }

      if (null != o.getPriority()) {
        this.priority = new String(o.getPriority());
      }

      this.code = CodeableConcept.fromJson(o.getCode());
      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      if (null != o.getFocus()) {
        this.focus = new Reference(o.getFocus());
        this.focus.setId(this.getId());
      }

      if (null != o.getFHIRfor()) {
        this.FHIRfor = new Reference(o.getFHIRfor());
        this.FHIRfor.setId(this.getId());
      }

      if (null != o.getContext()) {
        this.context = new Reference(o.getContext());
        this.context.setId(this.getId());
      }

      this.executionPeriod = Period.fromJson(o.getExecutionPeriod());
      if (null != o.getAuthoredOn()) {
        this.authoredOn = new String(o.getAuthoredOn());
      }

      if (null != o.getLastModified()) {
        this.lastModified = new String(o.getLastModified());
      }

      if (null != o.getRequester()) {
        this.requester = new TaskRequester(o.getRequester());
        this.requester.setId(this.getId());
      }

      this.performerType = CodeableConcept.fromArray(o.getPerformerType());
      if (null != o.getOwner()) {
        this.owner = new Reference(o.getOwner());
        this.owner.setId(this.getId());
      }

      this.reason = CodeableConcept.fromJson(o.getReason());
      this.note = Annotation.fromArray(o.getNote());
      this.relevantHistory = Reference.fromArray(o.getRelevantHistory());

      if (null != o.getRestriction()) {
        this.restriction = new TaskRestriction(o.getRestriction());
        this.restriction.setId(this.getId());
      }

      this.input = TaskInput.fromArray(o.getInput());
      this.output = TaskOutput.fromArray(o.getOutput());

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
  public void setDefinitionUri( String value) {
    this.definitionUri = value;
  }
  public String getDefinitionUri() {
    return this.definitionUri;
  }
  public void set_definitionUri( Element value) {
    this._definitionUri = value;
  }
  public Element get_definitionUri() {
    return this._definitionUri;
  }
  public void setDefinitionReference( Reference value) {
    this.definitionReference = value;
  }
  public Reference getDefinitionReference() {
    return this.definitionReference;
  }
  public void setBasedOn( java.util.List<Reference> value) {
    this.basedOn = value;
  }
  public java.util.List<Reference> getBasedOn() {
    return this.basedOn;
  }
  public void setGroupIdentifier( Identifier value) {
    this.groupIdentifier = value;
  }
  public Identifier getGroupIdentifier() {
    return this.groupIdentifier;
  }
  public void setPartOf( java.util.List<Reference> value) {
    this.partOf = value;
  }
  public java.util.List<Reference> getPartOf() {
    return this.partOf;
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
  public void setStatusReason( CodeableConcept value) {
    this.statusReason = value;
  }
  public CodeableConcept getStatusReason() {
    return this.statusReason;
  }
  public void setBusinessStatus( CodeableConcept value) {
    this.businessStatus = value;
  }
  public CodeableConcept getBusinessStatus() {
    return this.businessStatus;
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
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
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
  public void setFocus( Reference value) {
    this.focus = value;
  }
  public Reference getFocus() {
    return this.focus;
  }
  public void setFHIRfor( Reference value) {
    this.FHIRfor = value;
  }
  public Reference getFHIRfor() {
    return this.FHIRfor;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setExecutionPeriod( Period value) {
    this.executionPeriod = value;
  }
  public Period getExecutionPeriod() {
    return this.executionPeriod;
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
  public void setLastModified( String value) {
    this.lastModified = value;
  }
  public String getLastModified() {
    return this.lastModified;
  }
  public void set_lastModified( Element value) {
    this._lastModified = value;
  }
  public Element get_lastModified() {
    return this._lastModified;
  }
  public void setRequester( TaskRequester value) {
    this.requester = value;
  }
  public TaskRequester getRequester() {
    return this.requester;
  }
  public void setPerformerType( java.util.List<CodeableConcept> value) {
    this.performerType = value;
  }
  public java.util.List<CodeableConcept> getPerformerType() {
    return this.performerType;
  }
  public void setOwner( Reference value) {
    this.owner = value;
  }
  public Reference getOwner() {
    return this.owner;
  }
  public void setReason( CodeableConcept value) {
    this.reason = value;
  }
  public CodeableConcept getReason() {
    return this.reason;
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
  public void setRestriction( TaskRestriction value) {
    this.restriction = value;
  }
  public TaskRestriction getRestriction() {
    return this.restriction;
  }
  public void setInput( java.util.List<TaskInput> value) {
    this.input = value;
  }
  public java.util.List<TaskInput> getInput() {
    return this.input;
  }
  public void setOutput( java.util.List<TaskOutput> value) {
    this.output = value;
  }
  public java.util.List<TaskOutput> getOutput() {
    return this.output;
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
     builder.append("definitionUri" + "[" + String.valueOf(this.definitionUri) + "]\n"); 
     builder.append("_definitionUri" + "[" + String.valueOf(this._definitionUri) + "]\n"); 
     builder.append("definitionReference" + "[" + String.valueOf(this.definitionReference) + "]\n"); 
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("groupIdentifier" + "[" + String.valueOf(this.groupIdentifier) + "]\n"); 
     builder.append("partOf" + "[" + String.valueOf(this.partOf) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("statusReason" + "[" + String.valueOf(this.statusReason) + "]\n"); 
     builder.append("businessStatus" + "[" + String.valueOf(this.businessStatus) + "]\n"); 
     builder.append("intent" + "[" + String.valueOf(this.intent) + "]\n"); 
     builder.append("_intent" + "[" + String.valueOf(this._intent) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("_priority" + "[" + String.valueOf(this._priority) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("focus" + "[" + String.valueOf(this.focus) + "]\n"); 
     builder.append("FHIRfor" + "[" + String.valueOf(this.FHIRfor) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("executionPeriod" + "[" + String.valueOf(this.executionPeriod) + "]\n"); 
     builder.append("authoredOn" + "[" + String.valueOf(this.authoredOn) + "]\n"); 
     builder.append("_authoredOn" + "[" + String.valueOf(this._authoredOn) + "]\n"); 
     builder.append("lastModified" + "[" + String.valueOf(this.lastModified) + "]\n"); 
     builder.append("_lastModified" + "[" + String.valueOf(this._lastModified) + "]\n"); 
     builder.append("requester" + "[" + String.valueOf(this.requester) + "]\n"); 
     builder.append("performerType" + "[" + String.valueOf(this.performerType) + "]\n"); 
     builder.append("owner" + "[" + String.valueOf(this.owner) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("relevantHistory" + "[" + String.valueOf(this.relevantHistory) + "]\n"); 
     builder.append("restriction" + "[" + String.valueOf(this.restriction) + "]\n"); 
     builder.append("input" + "[" + String.valueOf(this.input) + "]\n"); 
     builder.append("output" + "[" + String.valueOf(this.output) + "]\n"); 
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
  	Task,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Task" : { return Task.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	draft,
  	requested,
  	received,
  	accepted,
  	rejected,
  	ready,
  	cancelled,
  	inprogress,
  	onhold,
  	failed,
  	completed,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "draft" : { return draft.toString(); }
  			case "requested" : { return requested.toString(); }
  			case "received" : { return received.toString(); }
  			case "accepted" : { return accepted.toString(); }
  			case "rejected" : { return rejected.toString(); }
  			case "ready" : { return ready.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "inprogress" : { return inprogress.toString(); }
  			case "onhold" : { return onhold.toString(); }
  			case "failed" : { return failed.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Task> fromArray(java.util.List<TaskModel> list) {
    return (java.util.List<Task>)list.stream()
      .map(model -> new Task(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<TaskModel> toModelArray(java.util.List<Task> list) {
    return (java.util.List<TaskModel>)list.stream()
      .map(model -> new TaskModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Task fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Task.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Task o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Task> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}