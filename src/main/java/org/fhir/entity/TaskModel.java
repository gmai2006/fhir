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
* "A task to be performed."
*/
@Entity
@Table(name="task")
public class TaskModel  implements Serializable {
	private static final long serialVersionUID = 151873631182663991L;
  /**
  * Description: "This is a Task resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The business identifier for this task."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"definitionUri\"")
  private String definitionUri;

  /**
  * Description: "A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"definitionreference_id\"")
  private String definitionreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="definitionreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> definitionReference;

  /**
  * Description: "BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a \"request\" resource such as a ProcedureRequest, MedicationRequest, ProcedureRequest, CarePlan, etc. which is distinct from the \"request\" resource the task is seeking to fulfil.  This latter resource is referenced by FocusOn.  For example, based on a ProcedureRequest (= BasedOn), a task is created to fulfil a procedureRequest ( = FocusOn ) to collect a specimen from a patient."
  */
  @javax.persistence.Basic
  @Column(name="\"basedon_id\"")
  private String basedon_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="basedon_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn;

  /**
  * Description: "An identifier that links together multiple tasks and other requests that were created in the same context."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"groupIdentifier\"", length = 16777215)
  private String groupIdentifier;

  /**
  * Description: "Task that this particular task is part of."
  */
  @javax.persistence.Basic
  @Column(name="\"partof_id\"")
  private String partof_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="partof_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> partOf;

  /**
  * Description: "The current status of the task."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "An explanation as to why this task is held, failed, was refused, etc."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"statusReason\"", length = 16777215)
  private String statusReason;

  /**
  * Description: "Contains business-specific nuances of the business state."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"businessStatus\"", length = 16777215)
  private String businessStatus;

  /**
  * Description: "Indicates the \"level\" of actionability associated with the Task.  I.e. Is this a proposed task, a planned task, an actionable task, etc."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"intent\"")
  private String intent;

  /**
  * Description: "Indicates how quickly the Task should be addressed with respect to other requests."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"priority\"")
  private String priority;

  /**
  * Description: "A name or code (or both) briefly describing what the task involves."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "A free-text description of what is to be performed."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "The request being actioned or the resource being manipulated by this task."
  */
  @javax.persistence.Basic
  @Column(name="\"focus_id\"")
  private String focus_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="focus_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> focus;

  /**
  * Description: "The entity who benefits from the performance of the service specified in the task (e.g., the patient)."
  */
  @javax.persistence.Basic
  @Column(name="\"fhirfor_id\"")
  private String fhirfor_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="fhirfor_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> FHIRfor;

  /**
  * Description: "The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end)."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"executionPeriod\"", length = 16777215)
  private String executionPeriod;

  /**
  * Description: "The date and time this task was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"authoredOn\"")
  private String authoredOn;

  /**
  * Description: "The date and time of last modification to this task."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"lastModified\"")
  private String lastModified;

  /**
  * Description: "The creator of the task."
  */
  @javax.persistence.Basic
  @Column(name="\"requester_id\"")
  private String requester_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="requester_id", insertable=false, updatable=false)
  private java.util.List<TaskRequesterModel> requester;

  /**
  * Description: "The type of participant that can execute the task."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"performerType\"", length = 16777215)
  private String performerType;

  /**
  * Description: "Individual organization or Device currently responsible for task execution."
  */
  @javax.persistence.Basic
  @Column(name="\"owner_id\"")
  private String owner_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="owner_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> owner;

  /**
  * Description: "A description or code indicating why this task needs to be performed."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reason\"", length = 16777215)
  private String reason;

  /**
  * Description: "Free-text information captured about the task as it progresses."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task."
  */
  @javax.persistence.Basic
  @Column(name="\"relevanthistory_id\"")
  private String relevanthistory_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="relevanthistory_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> relevantHistory;

  /**
  * Description: "If the Task.focus is a request resource and the task is seeking fulfillment (i.e is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned."
  */
  @javax.persistence.Basic
  @Column(name="\"restriction_id\"")
  private String restriction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="restriction_id", insertable=false, updatable=false)
  private java.util.List<TaskRestrictionModel> restriction;

  /**
  * Description: "Additional information that may be needed in the execution of the task."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"input\"", length = 16777215)
  private String input;

  /**
  * Description: "Outputs produced by the Task."
  */
  @javax.persistence.Basic
  @Column(name="\"output_id\"")
  private String output_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="output_id", insertable=false, updatable=false)
  private java.util.List<TaskOutputModel> output;

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

  public TaskModel() {
  }

  public TaskModel(Task o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.definitionUri = o.getDefinitionUri();
    if (null != o.getDefinitionReference() ) {
    	this.definitionreference_id = "definitionreference" + this.id;
    	this.definitionReference = ReferenceHelper.toModel(o.getDefinitionReference(), this.definitionreference_id);
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedon_id = "basedon" + this.id;
    	this.basedOn = ReferenceHelper.toModelFromArray(o.getBasedOn(), this.basedon_id);
    }
    this.groupIdentifier = JsonUtils.toJson(o.getGroupIdentifier());
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partof_id = "partof" + this.id;
    	this.partOf = ReferenceHelper.toModelFromArray(o.getPartOf(), this.partof_id);
    }
    this.status = o.getStatus();
    this.statusReason = JsonUtils.toJson(o.getStatusReason());
    this.businessStatus = JsonUtils.toJson(o.getBusinessStatus());
    this.intent = o.getIntent();
    this.priority = o.getPriority();
    this.code = JsonUtils.toJson(o.getCode());
    this.description = o.getDescription();
    if (null != o.getFocus() ) {
    	this.focus_id = "focus" + this.id;
    	this.focus = ReferenceHelper.toModel(o.getFocus(), this.focus_id);
    }
    if (null != o.getFHIRfor() ) {
    	this.fhirfor_id = "fhirfor" + this.id;
    	this.FHIRfor = ReferenceHelper.toModel(o.getFHIRfor(), this.fhirfor_id);
    }
    if (null != o.getContext() ) {
    	this.context_id = "context" + this.id;
    	this.context = ReferenceHelper.toModel(o.getContext(), this.context_id);
    }
    this.executionPeriod = JsonUtils.toJson(o.getExecutionPeriod());
    this.authoredOn = o.getAuthoredOn();
    this.lastModified = o.getLastModified();
    if (null != o.getRequester() ) {
    	this.requester_id = "requester" + this.id;
    	this.requester = TaskRequesterHelper.toModel(o.getRequester(), this.requester_id);
    }
    if (null != o.getOwner() ) {
    	this.owner_id = "owner" + this.id;
    	this.owner = ReferenceHelper.toModel(o.getOwner(), this.owner_id);
    }
    this.reason = JsonUtils.toJson(o.getReason());
    if (null != o.getRelevantHistory() && !o.getRelevantHistory().isEmpty()) {
    	this.relevanthistory_id = "relevanthistory" + this.id;
    	this.relevantHistory = ReferenceHelper.toModelFromArray(o.getRelevantHistory(), this.relevanthistory_id);
    }
    if (null != o.getRestriction() ) {
    	this.restriction_id = "restriction" + this.id;
    	this.restriction = TaskRestrictionHelper.toModel(o.getRestriction(), this.restriction_id);
    }
    if (null != o.getOutput() && !o.getOutput().isEmpty()) {
    	this.output_id = "output" + this.id;
    	this.output = TaskOutputHelper.toModelFromArray(o.getOutput(), this.output_id);
    }
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
  public String getDefinitionUri() {
    return this.definitionUri;
  }
  public void setDefinitionUri( String value) {
    this.definitionUri = value;
  }
  public java.util.List<ReferenceModel> getDefinitionReference() {
    return this.definitionReference;
  }
  public void setDefinitionReference( java.util.List<ReferenceModel> value) {
    this.definitionReference = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public String getGroupIdentifier() {
    return this.groupIdentifier;
  }
  public void setGroupIdentifier( String value) {
    this.groupIdentifier = value;
  }
  public java.util.List<ReferenceModel> getPartOf() {
    return this.partOf;
  }
  public void setPartOf( java.util.List<ReferenceModel> value) {
    this.partOf = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatusReason() {
    return this.statusReason;
  }
  public void setStatusReason( String value) {
    this.statusReason = value;
  }
  public String getBusinessStatus() {
    return this.businessStatus;
  }
  public void setBusinessStatus( String value) {
    this.businessStatus = value;
  }
  public String getIntent() {
    return this.intent;
  }
  public void setIntent( String value) {
    this.intent = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<ReferenceModel> getFocus() {
    return this.focus;
  }
  public void setFocus( java.util.List<ReferenceModel> value) {
    this.focus = value;
  }
  public java.util.List<ReferenceModel> getFHIRfor() {
    return this.FHIRfor;
  }
  public void setFHIRfor( java.util.List<ReferenceModel> value) {
    this.FHIRfor = value;
  }
  public java.util.List<ReferenceModel> getContext() {
    return this.context;
  }
  public void setContext( java.util.List<ReferenceModel> value) {
    this.context = value;
  }
  public String getExecutionPeriod() {
    return this.executionPeriod;
  }
  public void setExecutionPeriod( String value) {
    this.executionPeriod = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public String getLastModified() {
    return this.lastModified;
  }
  public void setLastModified( String value) {
    this.lastModified = value;
  }
  public java.util.List<TaskRequesterModel> getRequester() {
    return this.requester;
  }
  public void setRequester( java.util.List<TaskRequesterModel> value) {
    this.requester = value;
  }
  public String getPerformerType() {
    return this.performerType;
  }
  public void setPerformerType( String value) {
    this.performerType = value;
  }
  public java.util.List<ReferenceModel> getOwner() {
    return this.owner;
  }
  public void setOwner( java.util.List<ReferenceModel> value) {
    this.owner = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public java.util.List<ReferenceModel> getRelevantHistory() {
    return this.relevantHistory;
  }
  public void setRelevantHistory( java.util.List<ReferenceModel> value) {
    this.relevantHistory = value;
  }
  public java.util.List<TaskRestrictionModel> getRestriction() {
    return this.restriction;
  }
  public void setRestriction( java.util.List<TaskRestrictionModel> value) {
    this.restriction = value;
  }
  public String getInput() {
    return this.input;
  }
  public void setInput( String value) {
    this.input = value;
  }
  public java.util.List<TaskOutputModel> getOutput() {
    return this.output;
  }
  public void setOutput( java.util.List<TaskOutputModel> value) {
    this.output = value;
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
    builder.append("[TaskModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("definitionUri" + "->" + this.definitionUri + "\n"); 
     builder.append("groupIdentifier" + "->" + this.groupIdentifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("statusReason" + "->" + this.statusReason + "\n"); 
     builder.append("businessStatus" + "->" + this.businessStatus + "\n"); 
     builder.append("intent" + "->" + this.intent + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("executionPeriod" + "->" + this.executionPeriod + "\n"); 
     builder.append("authoredOn" + "->" + this.authoredOn + "\n"); 
     builder.append("lastModified" + "->" + this.lastModified + "\n"); 
     builder.append("performerType" + "->" + this.performerType + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("input" + "->" + this.input + "\n"); 
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
    builder.append("[TaskModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("definitionUri" + "->" + this.definitionUri + "\n"); 
     builder.append("definitionReference" + "->" + this.definitionReference + "\n"); 
     builder.append("basedOn" + "->" + this.basedOn + "\n"); 
     builder.append("groupIdentifier" + "->" + this.groupIdentifier + "\n"); 
     builder.append("partOf" + "->" + this.partOf + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("statusReason" + "->" + this.statusReason + "\n"); 
     builder.append("businessStatus" + "->" + this.businessStatus + "\n"); 
     builder.append("intent" + "->" + this.intent + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("focus" + "->" + this.focus + "\n"); 
     builder.append("FHIRfor" + "->" + this.FHIRfor + "\n"); 
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("executionPeriod" + "->" + this.executionPeriod + "\n"); 
     builder.append("authoredOn" + "->" + this.authoredOn + "\n"); 
     builder.append("lastModified" + "->" + this.lastModified + "\n"); 
     builder.append("requester" + "->" + this.requester + "\n"); 
     builder.append("performerType" + "->" + this.performerType + "\n"); 
     builder.append("owner" + "->" + this.owner + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("relevantHistory" + "->" + this.relevantHistory + "\n"); 
     builder.append("restriction" + "->" + this.restriction + "\n"); 
     builder.append("input" + "->" + this.input + "\n"); 
     builder.append("output" + "->" + this.output + "\n"); 
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