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
* "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
*/
@Entity
@Table(name="plandefinitionaction")
public class PlanDefinitionActionModel  {
  /**
  * Description: "A user-visible label for the action."
  */
  @javax.persistence.Basic
  @Column(name="\"label\"")
  private String label;

  /**
  * Description: "The title of the action displayed to a user."
  */
  @javax.persistence.Basic
  @Column(name="\"title\"")
  private String title;

  /**
  * Description: "A short description of the action used to provide a summary to display to the user."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "A text equivalent of the action to be performed. This provides a human-interpretable description of the action when the definition is consumed by a system that may not be capable of interpreting it dynamically."
  */
  @javax.persistence.Basic
  @Column(name="\"textEquivalent\"")
  private String textEquivalent;

  /**
  * Description: "A code that provides meaning for the action or action group. For example, a section may have a LOINC code for a the section of a documentation template."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "A description of why this action is necessary or appropriate."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reason\"", length = 16777215)
  private String reason;

  /**
  * Description: "Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<RelatedArtifactModel> documentation = new java.util.ArrayList<>();

  /**
  * Description: "Identifies goals that this action supports. The reference must be to a goal element defined within this plan definition."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"goalId\"", length = 16777215)
  private String goalId;

  /**
  * Description: "A description of when the action should be triggered."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<TriggerDefinitionModel> triggerDefinition = new java.util.ArrayList<>();

  /**
  * Description: "An expression that describes applicability criteria, or start/stop conditions for the action."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<PlanDefinitionConditionModel> condition = new java.util.ArrayList<>();

  /**
  * Description: "Defines input data requirements for the action."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<DataRequirementModel> input = new java.util.ArrayList<>();

  /**
  * Description: "Defines the outputs of the action, if any."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<DataRequirementModel> output = new java.util.ArrayList<>();

  /**
  * Description: "A relationship to another action such as \"before\" or \"30-60 minutes after start of\"."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<PlanDefinitionRelatedActionModel> relatedAction = new java.util.ArrayList<>();

  /**
  * Description: "An optional value describing when the action should be performed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"timingDateTime\"")
  private String timingDateTime;

  /**
  * Description: "An optional value describing when the action should be performed."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingPeriod\"", length = 16777215)
  private String timingPeriod;

  /**
  * Description: "An optional value describing when the action should be performed."
  * Actual type: Duration
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingDuration\"", length = 16777215)
  private String timingDuration;

  /**
  * Description: "An optional value describing when the action should be performed."
  * Actual type: Range
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingRange\"", length = 16777215)
  private String timingRange;

  /**
  * Description: "An optional value describing when the action should be performed."
  * Actual type: Timing
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingTiming\"", length = 16777215)
  private String timingTiming;

  /**
  * Description: "Indicates who should participate in performing the action described."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<PlanDefinitionParticipantModel> participant = new java.util.ArrayList<>();

  /**
  * Description: "The type of action to perform (create, update, remove)."
  * Actual type: Coding
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "Defines the grouping behavior for the action and its children."
  */
  @javax.persistence.Basic
  @Column(name="\"groupingBehavior\"")
  private String groupingBehavior;

  /**
  * Description: "Defines the selection behavior for the action and its children."
  */
  @javax.persistence.Basic
  @Column(name="\"selectionBehavior\"")
  private String selectionBehavior;

  /**
  * Description: "Defines the requiredness behavior for the action."
  */
  @javax.persistence.Basic
  @Column(name="\"requiredBehavior\"")
  private String requiredBehavior;

  /**
  * Description: "Defines whether the action should usually be preselected."
  */
  @javax.persistence.Basic
  @Column(name="\"precheckBehavior\"")
  private String precheckBehavior;

  /**
  * Description: "Defines whether the action can be selected multiple times."
  */
  @javax.persistence.Basic
  @Column(name="\"cardinalityBehavior\"")
  private String cardinalityBehavior;

  /**
  * Description: "A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken."
  */
  @javax.persistence.Basic
  @Column(name="\"definition_id\"")
  private String definition_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`definition_id`", insertable=false, updatable=false)
  private ReferenceModel definition;

  /**
  * Description: "A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input."
  */
  @javax.persistence.Basic
  @Column(name="\"transform_id\"")
  private String transform_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`transform_id`", insertable=false, updatable=false)
  private ReferenceModel transform;

  /**
  * Description: "Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<PlanDefinitionDynamicValueModel> dynamicValue = new java.util.ArrayList<>();

  /**
  * Description: "Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<PlanDefinitionActionModel> action = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public PlanDefinitionActionModel() {
  }

  public PlanDefinitionActionModel(PlanDefinitionAction o) {
    this.id = o.getId();
      this.label = o.getLabel();

      this.title = o.getTitle();

      this.description = o.getDescription();

      this.textEquivalent = o.getTextEquivalent();

      this.code = CodeableConcept.toJson(o.getCode());
      this.reason = CodeableConcept.toJson(o.getReason());
      this.documentation = RelatedArtifact.toModelArray(o.getDocumentation());

      this.goalId = org.fhir.utils.JsonUtils.write2String(o.getGoalId());

      this.triggerDefinition = TriggerDefinition.toModelArray(o.getTriggerDefinition());

      this.condition = PlanDefinitionCondition.toModelArray(o.getCondition());

      this.input = DataRequirement.toModelArray(o.getInput());

      this.output = DataRequirement.toModelArray(o.getOutput());

      this.relatedAction = PlanDefinitionRelatedAction.toModelArray(o.getRelatedAction());

      this.timingDateTime = o.getTimingDateTime();

      this.timingPeriod = Period.toJson(o.getTimingPeriod());
      this.timingDuration = Duration.toJson(o.getTimingDuration());
      this.timingRange = Range.toJson(o.getTimingRange());
      this.timingTiming = Timing.toJson(o.getTimingTiming());
      this.participant = PlanDefinitionParticipant.toModelArray(o.getParticipant());

      this.type = Coding.toJson(o.getType());
      this.groupingBehavior = o.getGroupingBehavior();

      this.selectionBehavior = o.getSelectionBehavior();

      this.requiredBehavior = o.getRequiredBehavior();

      this.precheckBehavior = o.getPrecheckBehavior();

      this.cardinalityBehavior = o.getCardinalityBehavior();

      if (null != o.getDefinition()) {
      	this.definition_id = "definition" + this.getId();
        this.definition = new ReferenceModel(o.getDefinition());
        this.definition.setId(this.definition_id);
        this.definition.parent_id = this.definition.getId();
      }

      if (null != o.getTransform()) {
      	this.transform_id = "transform" + this.getId();
        this.transform = new ReferenceModel(o.getTransform());
        this.transform.setId(this.transform_id);
        this.transform.parent_id = this.transform.getId();
      }

      this.dynamicValue = PlanDefinitionDynamicValue.toModelArray(o.getDynamicValue());

      this.action = PlanDefinitionAction.toModelArray(o.getAction());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setLabel( String value) {
    this.label = value;
  }
  public String getLabel() {
    return this.label;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setTextEquivalent( String value) {
    this.textEquivalent = value;
  }
  public String getTextEquivalent() {
    return this.textEquivalent;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setDocumentation( java.util.List<RelatedArtifactModel> value) {
    this.documentation = value;
  }
  public java.util.List<RelatedArtifactModel> getDocumentation() {
    return this.documentation;
  }
  public void setGoalId( String value) {
    this.goalId = value;
  }
  public String getGoalId() {
    return this.goalId;
  }
  public void setTriggerDefinition( java.util.List<TriggerDefinitionModel> value) {
    this.triggerDefinition = value;
  }
  public java.util.List<TriggerDefinitionModel> getTriggerDefinition() {
    return this.triggerDefinition;
  }
  public void setCondition( java.util.List<PlanDefinitionConditionModel> value) {
    this.condition = value;
  }
  public java.util.List<PlanDefinitionConditionModel> getCondition() {
    return this.condition;
  }
  public void setInput( java.util.List<DataRequirementModel> value) {
    this.input = value;
  }
  public java.util.List<DataRequirementModel> getInput() {
    return this.input;
  }
  public void setOutput( java.util.List<DataRequirementModel> value) {
    this.output = value;
  }
  public java.util.List<DataRequirementModel> getOutput() {
    return this.output;
  }
  public void setRelatedAction( java.util.List<PlanDefinitionRelatedActionModel> value) {
    this.relatedAction = value;
  }
  public java.util.List<PlanDefinitionRelatedActionModel> getRelatedAction() {
    return this.relatedAction;
  }
  public void setTimingDateTime( String value) {
    this.timingDateTime = value;
  }
  public String getTimingDateTime() {
    return this.timingDateTime;
  }
  public void setTimingPeriod( String value) {
    this.timingPeriod = value;
  }
  public String getTimingPeriod() {
    return this.timingPeriod;
  }
  public void setTimingDuration( String value) {
    this.timingDuration = value;
  }
  public String getTimingDuration() {
    return this.timingDuration;
  }
  public void setTimingRange( String value) {
    this.timingRange = value;
  }
  public String getTimingRange() {
    return this.timingRange;
  }
  public void setTimingTiming( String value) {
    this.timingTiming = value;
  }
  public String getTimingTiming() {
    return this.timingTiming;
  }
  public void setParticipant( java.util.List<PlanDefinitionParticipantModel> value) {
    this.participant = value;
  }
  public java.util.List<PlanDefinitionParticipantModel> getParticipant() {
    return this.participant;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setGroupingBehavior( String value) {
    this.groupingBehavior = value;
  }
  public String getGroupingBehavior() {
    return this.groupingBehavior;
  }
  public void setSelectionBehavior( String value) {
    this.selectionBehavior = value;
  }
  public String getSelectionBehavior() {
    return this.selectionBehavior;
  }
  public void setRequiredBehavior( String value) {
    this.requiredBehavior = value;
  }
  public String getRequiredBehavior() {
    return this.requiredBehavior;
  }
  public void setPrecheckBehavior( String value) {
    this.precheckBehavior = value;
  }
  public String getPrecheckBehavior() {
    return this.precheckBehavior;
  }
  public void setCardinalityBehavior( String value) {
    this.cardinalityBehavior = value;
  }
  public String getCardinalityBehavior() {
    return this.cardinalityBehavior;
  }
  public void setDefinition( ReferenceModel value) {
    this.definition = value;
  }
  public ReferenceModel getDefinition() {
    return this.definition;
  }
  public void setTransform( ReferenceModel value) {
    this.transform = value;
  }
  public ReferenceModel getTransform() {
    return this.transform;
  }
  public void setDynamicValue( java.util.List<PlanDefinitionDynamicValueModel> value) {
    this.dynamicValue = value;
  }
  public java.util.List<PlanDefinitionDynamicValueModel> getDynamicValue() {
    return this.dynamicValue;
  }
  public void setAction( java.util.List<PlanDefinitionActionModel> value) {
    this.action = value;
  }
  public java.util.List<PlanDefinitionActionModel> getAction() {
    return this.action;
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
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("label" + "[" + String.valueOf(this.label) + "]\n"); 
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("textEquivalent" + "[" + String.valueOf(this.textEquivalent) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("documentation" + "[" + String.valueOf(this.documentation) + "]\n"); 
     builder.append("goalId" + "[" + String.valueOf(this.goalId) + "]\n"); 
     builder.append("triggerDefinition" + "[" + String.valueOf(this.triggerDefinition) + "]\n"); 
     builder.append("condition" + "[" + String.valueOf(this.condition) + "]\n"); 
     builder.append("input" + "[" + String.valueOf(this.input) + "]\n"); 
     builder.append("output" + "[" + String.valueOf(this.output) + "]\n"); 
     builder.append("relatedAction" + "[" + String.valueOf(this.relatedAction) + "]\n"); 
     builder.append("timingDateTime" + "[" + String.valueOf(this.timingDateTime) + "]\n"); 
     builder.append("timingPeriod" + "[" + String.valueOf(this.timingPeriod) + "]\n"); 
     builder.append("timingDuration" + "[" + String.valueOf(this.timingDuration) + "]\n"); 
     builder.append("timingRange" + "[" + String.valueOf(this.timingRange) + "]\n"); 
     builder.append("timingTiming" + "[" + String.valueOf(this.timingTiming) + "]\n"); 
     builder.append("participant" + "[" + String.valueOf(this.participant) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("groupingBehavior" + "[" + String.valueOf(this.groupingBehavior) + "]\n"); 
     builder.append("selectionBehavior" + "[" + String.valueOf(this.selectionBehavior) + "]\n"); 
     builder.append("requiredBehavior" + "[" + String.valueOf(this.requiredBehavior) + "]\n"); 
     builder.append("precheckBehavior" + "[" + String.valueOf(this.precheckBehavior) + "]\n"); 
     builder.append("cardinalityBehavior" + "[" + String.valueOf(this.cardinalityBehavior) + "]\n"); 
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("transform" + "[" + String.valueOf(this.transform) + "]\n"); 
     builder.append("dynamicValue" + "[" + String.valueOf(this.dynamicValue) + "]\n"); 
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}