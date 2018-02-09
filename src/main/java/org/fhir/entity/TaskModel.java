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
* "A task to be performed."
*/
@Entity
@Table(name="task")
public class TaskModel  {
  /**
  * Description: "This is a Task resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The business identifier for this task."
  * Actual type: Array of Identifier-> List<Identifier>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`definitionreference_id`", insertable=false, updatable=false)
  private ReferenceModel definitionReference;

  /**
  * Description: "BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a \"request\" resource such as a ProcedureRequest, MedicationRequest, ProcedureRequest, CarePlan, etc. which is distinct from the \"request\" resource the task is seeking to fulfil.  This latter resource is referenced by FocusOn.  For example, based on a ProcedureRequest (= BasedOn), a task is created to fulfil a procedureRequest ( = FocusOn ) to collect a specimen from a patient."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "An identifier that links together multiple tasks and other requests that were created in the same context."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"groupIdentifier\"", length = 16777215)
  private String groupIdentifier;

  /**
  * Description: "Task that this particular task is part of."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> partOf = new java.util.ArrayList<>();

  /**
  * Description: "The current status of the task."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "An explanation as to why this task is held, failed, was refused, etc."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"statusReason\"", length = 16777215)
  private String statusReason;

  /**
  * Description: "Contains business-specific nuances of the business state."
  * Actual type: CodeableConcept
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
  * Actual type: CodeableConcept
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`focus_id`", insertable=false, updatable=false)
  private ReferenceModel focus;

  /**
  * Description: "The entity who benefits from the performance of the service specified in the task (e.g., the patient)."
  */
  @javax.persistence.Basic
  @Column(name="\"fhirfor_id\"")
  private String fhirfor_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`fhirfor_id`", insertable=false, updatable=false)
  private ReferenceModel FHIRfor;

  /**
  * Description: "The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`context_id`", insertable=false, updatable=false)
  private ReferenceModel context;

  /**
  * Description: "Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end)."
  * Actual type: Period
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`requester_id`", insertable=false, updatable=false)
  private TaskRequesterModel requester;

  /**
  * Description: "The type of participant that can execute the task."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`owner_id`", insertable=false, updatable=false)
  private ReferenceModel owner;

  /**
  * Description: "A description or code indicating why this task needs to be performed."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reason\"", length = 16777215)
  private String reason;

  /**
  * Description: "Free-text information captured about the task as it progresses."
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> relevantHistory = new java.util.ArrayList<>();

  /**
  * Description: "If the Task.focus is a request resource and the task is seeking fulfillment (i.e is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned."
  */
  @javax.persistence.Basic
  @Column(name="\"restriction_id\"")
  private String restriction_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`restriction_id`", insertable=false, updatable=false)
  private TaskRestrictionModel restriction;

  /**
  * Description: "Additional information that may be needed in the execution of the task."
  * Actual type: Array of TaskInput-> List<TaskInput>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"input\"", length = 16777215)
  private String input;

  /**
  * Description: "Outputs produced by the Task."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<TaskOutputModel> output = new java.util.ArrayList<>();

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


  public TaskModel() {
  }

  public TaskModel(Task o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.definitionUri = o.getDefinitionUri();

      if (null != o.getDefinitionReference()) {
      	this.definitionreference_id = "definitionReference" + this.getId();
        this.definitionReference = new ReferenceModel(o.getDefinitionReference());
        this.definitionReference.setId(this.definitionreference_id);
        this.definitionReference.parent_id = this.definitionReference.getId();
      }

      this.basedOn = Reference.toModelArray(o.getBasedOn());

      this.groupIdentifier = Identifier.toJson(o.getGroupIdentifier());
      this.partOf = Reference.toModelArray(o.getPartOf());

      this.status = o.getStatus();

      this.statusReason = CodeableConcept.toJson(o.getStatusReason());
      this.businessStatus = CodeableConcept.toJson(o.getBusinessStatus());
      this.intent = o.getIntent();

      this.priority = o.getPriority();

      this.code = CodeableConcept.toJson(o.getCode());
      this.description = o.getDescription();

      if (null != o.getFocus()) {
      	this.focus_id = "focus" + this.getId();
        this.focus = new ReferenceModel(o.getFocus());
        this.focus.setId(this.focus_id);
        this.focus.parent_id = this.focus.getId();
      }

      if (null != o.getFHIRfor()) {
      	this.fhirfor_id = "FHIRfor" + this.getId();
        this.FHIRfor = new ReferenceModel(o.getFHIRfor());
        this.FHIRfor.setId(this.fhirfor_id);
        this.FHIRfor.parent_id = this.FHIRfor.getId();
      }

      if (null != o.getContext()) {
      	this.context_id = "context" + this.getId();
        this.context = new ReferenceModel(o.getContext());
        this.context.setId(this.context_id);
        this.context.parent_id = this.context.getId();
      }

      this.executionPeriod = Period.toJson(o.getExecutionPeriod());
      this.authoredOn = o.getAuthoredOn();

      this.lastModified = o.getLastModified();

      if (null != o.getRequester()) {
      	this.requester_id = "requester" + this.getId();
        this.requester = new TaskRequesterModel(o.getRequester());
        this.requester.setId(this.requester_id);
        this.requester.parent_id = this.requester.getId();
      }

      this.performerType = CodeableConcept.toJson(o.getPerformerType());
      if (null != o.getOwner()) {
      	this.owner_id = "owner" + this.getId();
        this.owner = new ReferenceModel(o.getOwner());
        this.owner.setId(this.owner_id);
        this.owner.parent_id = this.owner.getId();
      }

      this.reason = CodeableConcept.toJson(o.getReason());
      this.note = Annotation.toJson(o.getNote());
      this.relevantHistory = Reference.toModelArray(o.getRelevantHistory());

      if (null != o.getRestriction()) {
      	this.restriction_id = "restriction" + this.getId();
        this.restriction = new TaskRestrictionModel(o.getRestriction());
        this.restriction.setId(this.restriction_id);
        this.restriction.parent_id = this.restriction.getId();
      }

      this.input = TaskInput.toJson(o.getInput());
      this.output = TaskOutput.toModelArray(o.getOutput());

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
  public void setDefinitionUri( String value) {
    this.definitionUri = value;
  }
  public String getDefinitionUri() {
    return this.definitionUri;
  }
  public void setDefinitionReference( ReferenceModel value) {
    this.definitionReference = value;
  }
  public ReferenceModel getDefinitionReference() {
    return this.definitionReference;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setGroupIdentifier( String value) {
    this.groupIdentifier = value;
  }
  public String getGroupIdentifier() {
    return this.groupIdentifier;
  }
  public void setPartOf( java.util.List<ReferenceModel> value) {
    this.partOf = value;
  }
  public java.util.List<ReferenceModel> getPartOf() {
    return this.partOf;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatusReason( String value) {
    this.statusReason = value;
  }
  public String getStatusReason() {
    return this.statusReason;
  }
  public void setBusinessStatus( String value) {
    this.businessStatus = value;
  }
  public String getBusinessStatus() {
    return this.businessStatus;
  }
  public void setIntent( String value) {
    this.intent = value;
  }
  public String getIntent() {
    return this.intent;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setFocus( ReferenceModel value) {
    this.focus = value;
  }
  public ReferenceModel getFocus() {
    return this.focus;
  }
  public void setFHIRfor( ReferenceModel value) {
    this.FHIRfor = value;
  }
  public ReferenceModel getFHIRfor() {
    return this.FHIRfor;
  }
  public void setContext( ReferenceModel value) {
    this.context = value;
  }
  public ReferenceModel getContext() {
    return this.context;
  }
  public void setExecutionPeriod( String value) {
    this.executionPeriod = value;
  }
  public String getExecutionPeriod() {
    return this.executionPeriod;
  }
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void setLastModified( String value) {
    this.lastModified = value;
  }
  public String getLastModified() {
    return this.lastModified;
  }
  public void setRequester( TaskRequesterModel value) {
    this.requester = value;
  }
  public TaskRequesterModel getRequester() {
    return this.requester;
  }
  public void setPerformerType( String value) {
    this.performerType = value;
  }
  public String getPerformerType() {
    return this.performerType;
  }
  public void setOwner( ReferenceModel value) {
    this.owner = value;
  }
  public ReferenceModel getOwner() {
    return this.owner;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setRelevantHistory( java.util.List<ReferenceModel> value) {
    this.relevantHistory = value;
  }
  public java.util.List<ReferenceModel> getRelevantHistory() {
    return this.relevantHistory;
  }
  public void setRestriction( TaskRestrictionModel value) {
    this.restriction = value;
  }
  public TaskRestrictionModel getRestriction() {
    return this.restriction;
  }
  public void setInput( String value) {
    this.input = value;
  }
  public String getInput() {
    return this.input;
  }
  public void setOutput( java.util.List<TaskOutputModel> value) {
    this.output = value;
  }
  public java.util.List<TaskOutputModel> getOutput() {
    return this.output;
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
     builder.append("definitionUri" + "[" + String.valueOf(this.definitionUri) + "]\n"); 
     builder.append("definitionReference" + "[" + String.valueOf(this.definitionReference) + "]\n"); 
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("groupIdentifier" + "[" + String.valueOf(this.groupIdentifier) + "]\n"); 
     builder.append("partOf" + "[" + String.valueOf(this.partOf) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("statusReason" + "[" + String.valueOf(this.statusReason) + "]\n"); 
     builder.append("businessStatus" + "[" + String.valueOf(this.businessStatus) + "]\n"); 
     builder.append("intent" + "[" + String.valueOf(this.intent) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("focus" + "[" + String.valueOf(this.focus) + "]\n"); 
     builder.append("FHIRfor" + "[" + String.valueOf(this.FHIRfor) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("executionPeriod" + "[" + String.valueOf(this.executionPeriod) + "]\n"); 
     builder.append("authoredOn" + "[" + String.valueOf(this.authoredOn) + "]\n"); 
     builder.append("lastModified" + "[" + String.valueOf(this.lastModified) + "]\n"); 
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
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}