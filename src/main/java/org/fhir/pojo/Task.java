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
public class Task  extends DomainResource  {
  /**
  * Description: "This is a Task resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The business identifier for this task."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc."
  */
  protected String definitionUri;

  /**
  * Description: "Extensions for definitionUri"
  */
  protected transient Element _definitionUri;

  /**
  * Description: "A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc."
  */
  protected Reference definitionReference;

  /**
  * Description: "BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a \"request\" resource such as a ProcedureRequest, MedicationRequest, ProcedureRequest, CarePlan, etc. which is distinct from the \"request\" resource the task is seeking to fulfil.  This latter resource is referenced by FocusOn.  For example, based on a ProcedureRequest (= BasedOn), a task is created to fulfil a procedureRequest ( = FocusOn ) to collect a specimen from a patient."
  */
  protected java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "An identifier that links together multiple tasks and other requests that were created in the same context."
  */
  protected Identifier groupIdentifier;

  /**
  * Description: "Task that this particular task is part of."
  */
  protected java.util.List<Reference> partOf = new java.util.ArrayList<>();

  /**
  * Description: "The current status of the task."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "An explanation as to why this task is held, failed, was refused, etc."
  */
  protected CodeableConcept statusReason;

  /**
  * Description: "Contains business-specific nuances of the business state."
  */
  protected CodeableConcept businessStatus;

  /**
  * Description: "Indicates the \"level\" of actionability associated with the Task.  I.e. Is this a proposed task, a planned task, an actionable task, etc."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String intent;

  /**
  * Description: "Extensions for intent"
  */
  protected transient Element _intent;

  /**
  * Description: "Indicates how quickly the Task should be addressed with respect to other requests."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String priority;

  /**
  * Description: "Extensions for priority"
  */
  protected transient Element _priority;

  /**
  * Description: "A name or code (or both) briefly describing what the task involves."
  */
  protected CodeableConcept code;

  /**
  * Description: "A free-text description of what is to be performed."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "The request being actioned or the resource being manipulated by this task."
  */
  protected Reference focus;

  /**
  * Description: "The entity who benefits from the performance of the service specified in the task (e.g., the patient)."
  */
  protected Reference FHIRfor;

  /**
  * Description: "The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created."
  */
  protected Reference context;

  /**
  * Description: "Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end)."
  */
  protected Period executionPeriod;

  /**
  * Description: "The date and time this task was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String authoredOn;

  /**
  * Description: "Extensions for authoredOn"
  */
  protected transient Element _authoredOn;

  /**
  * Description: "The date and time of last modification to this task."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String lastModified;

  /**
  * Description: "Extensions for lastModified"
  */
  protected transient Element _lastModified;

  /**
  * Description: "The creator of the task."
  */
  protected TaskRequester requester;

  /**
  * Description: "The type of participant that can execute the task."
  */
  protected java.util.List<CodeableConcept> performerType = new java.util.ArrayList<>();

  /**
  * Description: "Individual organization or Device currently responsible for task execution."
  */
  protected Reference owner;

  /**
  * Description: "A description or code indicating why this task needs to be performed."
  */
  protected CodeableConcept reason;

  /**
  * Description: "Free-text information captured about the task as it progresses."
  */
  protected java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task."
  */
  protected java.util.List<Reference> relevantHistory = new java.util.ArrayList<>();

  /**
  * Description: "If the Task.focus is a request resource and the task is seeking fulfillment (i.e is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned."
  */
  protected TaskRestriction restriction;

  /**
  * Description: "Additional information that may be needed in the execution of the task."
  */
  protected java.util.List<TaskInput> input = new java.util.ArrayList<>();

  /**
  * Description: "Outputs produced by the Task."
  */
  protected java.util.List<TaskOutput> output = new java.util.ArrayList<>();

  public Task() {
  }

  public Task(TaskModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getDefinitionUri()) {
      this.definitionUri = o.getDefinitionUri();
    }
    if (null != o.getDefinitionReference() && !o.getDefinitionReference().isEmpty()) {
      this.definitionReference = new Reference(o.getDefinitionReference().get(0));
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedOn = ReferenceHelper.fromArray2Array(o.getBasedOn());
    }
    this.groupIdentifier = IdentifierHelper.fromJson(o.getGroupIdentifier());
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partOf = ReferenceHelper.fromArray2Array(o.getPartOf());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    this.statusReason = CodeableConceptHelper.fromJson(o.getStatusReason());
    this.businessStatus = CodeableConceptHelper.fromJson(o.getBusinessStatus());
    if (null != o.getIntent()) {
      this.intent = o.getIntent();
    }
    if (null != o.getPriority()) {
      this.priority = o.getPriority();
    }
    this.code = CodeableConceptHelper.fromJson(o.getCode());
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getFocus() && !o.getFocus().isEmpty()) {
      this.focus = new Reference(o.getFocus().get(0));
    }
    if (null != o.getFHIRfor() && !o.getFHIRfor().isEmpty()) {
      this.FHIRfor = new Reference(o.getFHIRfor().get(0));
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    this.executionPeriod = PeriodHelper.fromJson(o.getExecutionPeriod());
    if (null != o.getAuthoredOn()) {
      this.authoredOn = o.getAuthoredOn();
    }
    if (null != o.getLastModified()) {
      this.lastModified = o.getLastModified();
    }
    if (null != o.getRequester() && !o.getRequester().isEmpty()) {
      this.requester = new TaskRequester(o.getRequester().get(0));
    }
    if (null != o.getOwner() && !o.getOwner().isEmpty()) {
      this.owner = new Reference(o.getOwner().get(0));
    }
    this.reason = CodeableConceptHelper.fromJson(o.getReason());
    if (null != o.getRelevantHistory() && !o.getRelevantHistory().isEmpty()) {
    	this.relevantHistory = ReferenceHelper.fromArray2Array(o.getRelevantHistory());
    }
    if (null != o.getRestriction() && !o.getRestriction().isEmpty()) {
      this.restriction = new TaskRestriction(o.getRestriction().get(0));
    }
    if (null != o.getOutput() && !o.getOutput().isEmpty()) {
    	this.output = TaskOutputHelper.fromArray2Array(o.getOutput());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Task]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.definitionUri != null) builder.append("definitionUri" + "->" + this.definitionUri.toString() + "\n"); 
     if(this._definitionUri != null) builder.append("_definitionUri" + "->" + this._definitionUri.toString() + "\n"); 
     if(this.definitionReference != null) builder.append("definitionReference" + "->" + this.definitionReference.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.groupIdentifier != null) builder.append("groupIdentifier" + "->" + this.groupIdentifier.toString() + "\n"); 
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.statusReason != null) builder.append("statusReason" + "->" + this.statusReason.toString() + "\n"); 
     if(this.businessStatus != null) builder.append("businessStatus" + "->" + this.businessStatus.toString() + "\n"); 
     if(this.intent != null) builder.append("intent" + "->" + this.intent.toString() + "\n"); 
     if(this._intent != null) builder.append("_intent" + "->" + this._intent.toString() + "\n"); 
     if(this.priority != null) builder.append("priority" + "->" + this.priority.toString() + "\n"); 
     if(this._priority != null) builder.append("_priority" + "->" + this._priority.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.focus != null) builder.append("focus" + "->" + this.focus.toString() + "\n"); 
     if(this.FHIRfor != null) builder.append("FHIRfor" + "->" + this.FHIRfor.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.executionPeriod != null) builder.append("executionPeriod" + "->" + this.executionPeriod.toString() + "\n"); 
     if(this.authoredOn != null) builder.append("authoredOn" + "->" + this.authoredOn.toString() + "\n"); 
     if(this._authoredOn != null) builder.append("_authoredOn" + "->" + this._authoredOn.toString() + "\n"); 
     if(this.lastModified != null) builder.append("lastModified" + "->" + this.lastModified.toString() + "\n"); 
     if(this._lastModified != null) builder.append("_lastModified" + "->" + this._lastModified.toString() + "\n"); 
     if(this.requester != null) builder.append("requester" + "->" + this.requester.toString() + "\n"); 
     if(this.performerType != null) builder.append("performerType" + "->" + this.performerType.toString() + "\n"); 
     if(this.owner != null) builder.append("owner" + "->" + this.owner.toString() + "\n"); 
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.relevantHistory != null) builder.append("relevantHistory" + "->" + this.relevantHistory.toString() + "\n"); 
     if(this.restriction != null) builder.append("restriction" + "->" + this.restriction.toString() + "\n"); 
     if(this.input != null) builder.append("input" + "->" + this.input.toString() + "\n"); 
     if(this.output != null) builder.append("output" + "->" + this.output.toString() + "\n"); ;
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

}