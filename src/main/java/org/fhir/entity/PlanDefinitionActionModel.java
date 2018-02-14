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
/**
* "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
*/
@Entity
@Table(name="plandefinitionaction")
public class PlanDefinitionActionModel  implements Serializable {
	private static final long serialVersionUID = 151857669645525114L;
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
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "A description of why this action is necessary or appropriate."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reason\"", length = 16777215)
  private String reason;

  /**
  * Description: "Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources."
  */
  @javax.persistence.Basic
  @Column(name="\"documentation_id\"")
  private String documentation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="documentation_id", insertable=false, updatable=false)
  private java.util.List<RelatedArtifactModel> documentation;

  /**
  * Description: "Identifies goals that this action supports. The reference must be to a goal element defined within this plan definition."
  */
  @javax.persistence.Basic
  @Column(name="\"goalId\"")
  private String goalId;

  /**
  * Description: "A description of when the action should be triggered."
  */
  @javax.persistence.Basic
  @Column(name="\"triggerdefinition_id\"")
  private String triggerdefinition_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="triggerdefinition_id", insertable=false, updatable=false)
  private java.util.List<TriggerDefinitionModel> triggerDefinition;

  /**
  * Description: "An expression that describes applicability criteria, or start/stop conditions for the action."
  */
  @javax.persistence.Basic
  @Column(name="\"condition_id\"")
  private String condition_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="condition_id", insertable=false, updatable=false)
  private java.util.List<PlanDefinitionConditionModel> condition;

  /**
  * Description: "Defines input data requirements for the action."
  */
  @javax.persistence.Basic
  @Column(name="\"input_id\"")
  private String input_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="input_id", insertable=false, updatable=false)
  private java.util.List<DataRequirementModel> input;

  /**
  * Description: "Defines the outputs of the action, if any."
  */
  @javax.persistence.Basic
  @Column(name="\"output_id\"")
  private String output_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="output_id", insertable=false, updatable=false)
  private java.util.List<DataRequirementModel> output;

  /**
  * Description: "A relationship to another action such as \"before\" or \"30-60 minutes after start of\"."
  */
  @javax.persistence.Basic
  @Column(name="\"relatedaction_id\"")
  private String relatedaction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="relatedaction_id", insertable=false, updatable=false)
  private java.util.List<PlanDefinitionRelatedActionModel> relatedAction;

  /**
  * Description: "An optional value describing when the action should be performed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"timingDateTime\"")
  private String timingDateTime;

  /**
  * Description: "An optional value describing when the action should be performed."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingPeriod\"", length = 16777215)
  private String timingPeriod;

  /**
  * Description: "An optional value describing when the action should be performed."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingDuration\"", length = 16777215)
  private String timingDuration;

  /**
  * Description: "An optional value describing when the action should be performed."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingRange\"", length = 16777215)
  private String timingRange;

  /**
  * Description: "An optional value describing when the action should be performed."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingTiming\"", length = 16777215)
  private String timingTiming;

  /**
  * Description: "Indicates who should participate in performing the action described."
  */
  @javax.persistence.Basic
  @Column(name="\"participant_id\"")
  private String participant_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="participant_id", insertable=false, updatable=false)
  private java.util.List<PlanDefinitionParticipantModel> participant;

  /**
  * Description: "The type of action to perform (create, update, remove)."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="definition_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> definition;

  /**
  * Description: "A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input."
  */
  @javax.persistence.Basic
  @Column(name="\"transform_id\"")
  private String transform_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="transform_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> transform;

  /**
  * Description: "Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result."
  */
  @javax.persistence.Basic
  @Column(name="\"dynamicvalue_id\"")
  private String dynamicvalue_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="dynamicvalue_id", insertable=false, updatable=false)
  private java.util.List<PlanDefinitionDynamicValueModel> dynamicValue;

  /**
  * Description: "Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition."
  */
  @javax.persistence.Basic
  @Column(name="\"action_id\"")
  private String action_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="action_id", insertable=false, updatable=false)
  private java.util.List<PlanDefinitionActionModel> action;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public PlanDefinitionActionModel() {
  }

  public PlanDefinitionActionModel(PlanDefinitionAction o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.label = o.getLabel();
    this.title = o.getTitle();
    this.description = o.getDescription();
    this.textEquivalent = o.getTextEquivalent();
    if (null != o.getDocumentation() && !o.getDocumentation().isEmpty()) {
    	this.documentation_id = "documentation" + this.parent_id;
    	this.documentation = RelatedArtifactHelper.toModelFromArray(o.getDocumentation(), this.documentation_id);
    }
    this.goalId = org.fhir.utils.JsonUtils.write2String(o.getGoalId());
    if (null != o.getTriggerDefinition() && !o.getTriggerDefinition().isEmpty()) {
    	this.triggerdefinition_id = "triggerdefinition" + this.parent_id;
    	this.triggerDefinition = TriggerDefinitionHelper.toModelFromArray(o.getTriggerDefinition(), this.triggerdefinition_id);
    }
    if (null != o.getCondition() && !o.getCondition().isEmpty()) {
    	this.condition_id = "condition" + this.parent_id;
    	this.condition = PlanDefinitionConditionHelper.toModelFromArray(o.getCondition(), this.condition_id);
    }
    if (null != o.getInput() && !o.getInput().isEmpty()) {
    	this.input_id = "input" + this.parent_id;
    	this.input = DataRequirementHelper.toModelFromArray(o.getInput(), this.input_id);
    }
    if (null != o.getOutput() && !o.getOutput().isEmpty()) {
    	this.output_id = "output" + this.parent_id;
    	this.output = DataRequirementHelper.toModelFromArray(o.getOutput(), this.output_id);
    }
    if (null != o.getRelatedAction() && !o.getRelatedAction().isEmpty()) {
    	this.relatedaction_id = "relatedaction" + this.parent_id;
    	this.relatedAction = PlanDefinitionRelatedActionHelper.toModelFromArray(o.getRelatedAction(), this.relatedaction_id);
    }
    this.timingDateTime = o.getTimingDateTime();
    this.timingPeriod = PeriodHelper.toJson(o.getTimingPeriod());
    this.timingDuration = DurationHelper.toJson(o.getTimingDuration());
    this.timingRange = RangeHelper.toJson(o.getTimingRange());
    this.timingTiming = TimingHelper.toJson(o.getTimingTiming());
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant_id = "participant" + this.parent_id;
    	this.participant = PlanDefinitionParticipantHelper.toModelFromArray(o.getParticipant(), this.participant_id);
    }
    this.type = CodingHelper.toJson(o.getType());
    this.groupingBehavior = o.getGroupingBehavior();
    this.selectionBehavior = o.getSelectionBehavior();
    this.requiredBehavior = o.getRequiredBehavior();
    this.precheckBehavior = o.getPrecheckBehavior();
    this.cardinalityBehavior = o.getCardinalityBehavior();
    if (null != o.getDefinition() ) {
    	this.definition_id = "definition" + this.parent_id;
    	this.definition = ReferenceHelper.toModel(o.getDefinition(), this.definition_id);
    }
    if (null != o.getTransform() ) {
    	this.transform_id = "transform" + this.parent_id;
    	this.transform = ReferenceHelper.toModel(o.getTransform(), this.transform_id);
    }
    if (null != o.getDynamicValue() && !o.getDynamicValue().isEmpty()) {
    	this.dynamicvalue_id = "dynamicvalue" + this.parent_id;
    	this.dynamicValue = PlanDefinitionDynamicValueHelper.toModelFromArray(o.getDynamicValue(), this.dynamicvalue_id);
    }
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action_id = "action" + this.parent_id;
    	this.action = PlanDefinitionActionHelper.toModelFromArray(o.getAction(), this.action_id);
    }
  }

  public String getLabel() {
    return this.label;
  }
  public void setLabel( String value) {
    this.label = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getTextEquivalent() {
    return this.textEquivalent;
  }
  public void setTextEquivalent( String value) {
    this.textEquivalent = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public java.util.List<RelatedArtifactModel> getDocumentation() {
    return this.documentation;
  }
  public void setDocumentation( java.util.List<RelatedArtifactModel> value) {
    this.documentation = value;
  }
  public String getGoalId() {
    return this.goalId;
  }
  public void setGoalId( String value) {
    this.goalId = value;
  }
  public java.util.List<TriggerDefinitionModel> getTriggerDefinition() {
    return this.triggerDefinition;
  }
  public void setTriggerDefinition( java.util.List<TriggerDefinitionModel> value) {
    this.triggerDefinition = value;
  }
  public java.util.List<PlanDefinitionConditionModel> getCondition() {
    return this.condition;
  }
  public void setCondition( java.util.List<PlanDefinitionConditionModel> value) {
    this.condition = value;
  }
  public java.util.List<DataRequirementModel> getInput() {
    return this.input;
  }
  public void setInput( java.util.List<DataRequirementModel> value) {
    this.input = value;
  }
  public java.util.List<DataRequirementModel> getOutput() {
    return this.output;
  }
  public void setOutput( java.util.List<DataRequirementModel> value) {
    this.output = value;
  }
  public java.util.List<PlanDefinitionRelatedActionModel> getRelatedAction() {
    return this.relatedAction;
  }
  public void setRelatedAction( java.util.List<PlanDefinitionRelatedActionModel> value) {
    this.relatedAction = value;
  }
  public String getTimingDateTime() {
    return this.timingDateTime;
  }
  public void setTimingDateTime( String value) {
    this.timingDateTime = value;
  }
  public String getTimingPeriod() {
    return this.timingPeriod;
  }
  public void setTimingPeriod( String value) {
    this.timingPeriod = value;
  }
  public String getTimingDuration() {
    return this.timingDuration;
  }
  public void setTimingDuration( String value) {
    this.timingDuration = value;
  }
  public String getTimingRange() {
    return this.timingRange;
  }
  public void setTimingRange( String value) {
    this.timingRange = value;
  }
  public String getTimingTiming() {
    return this.timingTiming;
  }
  public void setTimingTiming( String value) {
    this.timingTiming = value;
  }
  public java.util.List<PlanDefinitionParticipantModel> getParticipant() {
    return this.participant;
  }
  public void setParticipant( java.util.List<PlanDefinitionParticipantModel> value) {
    this.participant = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getGroupingBehavior() {
    return this.groupingBehavior;
  }
  public void setGroupingBehavior( String value) {
    this.groupingBehavior = value;
  }
  public String getSelectionBehavior() {
    return this.selectionBehavior;
  }
  public void setSelectionBehavior( String value) {
    this.selectionBehavior = value;
  }
  public String getRequiredBehavior() {
    return this.requiredBehavior;
  }
  public void setRequiredBehavior( String value) {
    this.requiredBehavior = value;
  }
  public String getPrecheckBehavior() {
    return this.precheckBehavior;
  }
  public void setPrecheckBehavior( String value) {
    this.precheckBehavior = value;
  }
  public String getCardinalityBehavior() {
    return this.cardinalityBehavior;
  }
  public void setCardinalityBehavior( String value) {
    this.cardinalityBehavior = value;
  }
  public java.util.List<ReferenceModel> getDefinition() {
    return this.definition;
  }
  public void setDefinition( java.util.List<ReferenceModel> value) {
    this.definition = value;
  }
  public java.util.List<ReferenceModel> getTransform() {
    return this.transform;
  }
  public void setTransform( java.util.List<ReferenceModel> value) {
    this.transform = value;
  }
  public java.util.List<PlanDefinitionDynamicValueModel> getDynamicValue() {
    return this.dynamicValue;
  }
  public void setDynamicValue( java.util.List<PlanDefinitionDynamicValueModel> value) {
    this.dynamicValue = value;
  }
  public java.util.List<PlanDefinitionActionModel> getAction() {
    return this.action;
  }
  public void setAction( java.util.List<PlanDefinitionActionModel> value) {
    this.action = value;
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
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PlanDefinitionActionModel]:" + "\n");
     builder.append("label" + "->" + this.label + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("textEquivalent" + "->" + this.textEquivalent + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("goalId" + "->" + this.goalId + "\n"); 
     builder.append("timingDateTime" + "->" + this.timingDateTime + "\n"); 
     builder.append("timingPeriod" + "->" + this.timingPeriod + "\n"); 
     builder.append("timingDuration" + "->" + this.timingDuration + "\n"); 
     builder.append("timingRange" + "->" + this.timingRange + "\n"); 
     builder.append("timingTiming" + "->" + this.timingTiming + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("groupingBehavior" + "->" + this.groupingBehavior + "\n"); 
     builder.append("selectionBehavior" + "->" + this.selectionBehavior + "\n"); 
     builder.append("requiredBehavior" + "->" + this.requiredBehavior + "\n"); 
     builder.append("precheckBehavior" + "->" + this.precheckBehavior + "\n"); 
     builder.append("cardinalityBehavior" + "->" + this.cardinalityBehavior + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PlanDefinitionActionModel]:" + "\n");
     builder.append("label" + "->" + this.label + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("textEquivalent" + "->" + this.textEquivalent + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("goalId" + "->" + this.goalId + "\n"); 
     builder.append("triggerDefinition" + "->" + this.triggerDefinition + "\n"); 
     builder.append("condition" + "->" + this.condition + "\n"); 
     builder.append("input" + "->" + this.input + "\n"); 
     builder.append("output" + "->" + this.output + "\n"); 
     builder.append("relatedAction" + "->" + this.relatedAction + "\n"); 
     builder.append("timingDateTime" + "->" + this.timingDateTime + "\n"); 
     builder.append("timingPeriod" + "->" + this.timingPeriod + "\n"); 
     builder.append("timingDuration" + "->" + this.timingDuration + "\n"); 
     builder.append("timingRange" + "->" + this.timingRange + "\n"); 
     builder.append("timingTiming" + "->" + this.timingTiming + "\n"); 
     builder.append("participant" + "->" + this.participant + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("groupingBehavior" + "->" + this.groupingBehavior + "\n"); 
     builder.append("selectionBehavior" + "->" + this.selectionBehavior + "\n"); 
     builder.append("requiredBehavior" + "->" + this.requiredBehavior + "\n"); 
     builder.append("precheckBehavior" + "->" + this.precheckBehavior + "\n"); 
     builder.append("cardinalityBehavior" + "->" + this.cardinalityBehavior + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("transform" + "->" + this.transform + "\n"); 
     builder.append("dynamicValue" + "->" + this.dynamicValue + "\n"); 
     builder.append("action" + "->" + this.action + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}