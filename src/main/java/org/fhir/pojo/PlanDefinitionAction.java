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
import org.fhir.entity.PlanDefinitionActionModel;
import com.google.gson.GsonBuilder;

/**
* "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
*/
public class PlanDefinitionAction  {
  /**
  * Description: "A user-visible label for the action."
  */
  private String label;

  /**
  * Description: "Extensions for label"
  */
  private transient Element _label;

  /**
  * Description: "The title of the action displayed to a user."
  */
  private String title;

  /**
  * Description: "Extensions for title"
  */
  private transient Element _title;

  /**
  * Description: "A short description of the action used to provide a summary to display to the user."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "A text equivalent of the action to be performed. This provides a human-interpretable description of the action when the definition is consumed by a system that may not be capable of interpreting it dynamically."
  */
  private String textEquivalent;

  /**
  * Description: "Extensions for textEquivalent"
  */
  private transient Element _textEquivalent;

  /**
  * Description: "A code that provides meaning for the action or action group. For example, a section may have a LOINC code for a the section of a documentation template."
  */
  private java.util.List<CodeableConcept> code = new java.util.ArrayList<>();

  /**
  * Description: "A description of why this action is necessary or appropriate."
  */
  private java.util.List<CodeableConcept> reason = new java.util.ArrayList<>();

  /**
  * Description: "Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources."
  */
  private java.util.List<RelatedArtifact> documentation = new java.util.ArrayList<>();

  /**
  * Description: "Identifies goals that this action supports. The reference must be to a goal element defined within this plan definition."
  */
  private java.util.List<String> goalId = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for goalId"
  */
  private transient java.util.List<Element> _goalId = new java.util.ArrayList<>();

  /**
  * Description: "A description of when the action should be triggered."
  */
  private java.util.List<TriggerDefinition> triggerDefinition = new java.util.ArrayList<>();

  /**
  * Description: "An expression that describes applicability criteria, or start/stop conditions for the action."
  */
  private java.util.List<PlanDefinitionCondition> condition = new java.util.ArrayList<>();

  /**
  * Description: "Defines input data requirements for the action."
  */
  private java.util.List<DataRequirement> input = new java.util.ArrayList<>();

  /**
  * Description: "Defines the outputs of the action, if any."
  */
  private java.util.List<DataRequirement> output = new java.util.ArrayList<>();

  /**
  * Description: "A relationship to another action such as \"before\" or \"30-60 minutes after start of\"."
  */
  private java.util.List<PlanDefinitionRelatedAction> relatedAction = new java.util.ArrayList<>();

  /**
  * Description: "An optional value describing when the action should be performed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String timingDateTime;

  /**
  * Description: "Extensions for timingDateTime"
  */
  private transient Element _timingDateTime;

  /**
  * Description: "An optional value describing when the action should be performed."
  */
  private Period timingPeriod;

  /**
  * Description: "An optional value describing when the action should be performed."
  */
  private Duration timingDuration;

  /**
  * Description: "An optional value describing when the action should be performed."
  */
  private Range timingRange;

  /**
  * Description: "An optional value describing when the action should be performed."
  */
  private Timing timingTiming;

  /**
  * Description: "Indicates who should participate in performing the action described."
  */
  private java.util.List<PlanDefinitionParticipant> participant = new java.util.ArrayList<>();

  /**
  * Description: "The type of action to perform (create, update, remove)."
  */
  private Coding type;

  /**
  * Description: "Defines the grouping behavior for the action and its children."
  */
  private String groupingBehavior;

  /**
  * Description: "Extensions for groupingBehavior"
  */
  private transient Element _groupingBehavior;

  /**
  * Description: "Defines the selection behavior for the action and its children."
  */
  private String selectionBehavior;

  /**
  * Description: "Extensions for selectionBehavior"
  */
  private transient Element _selectionBehavior;

  /**
  * Description: "Defines the requiredness behavior for the action."
  */
  private String requiredBehavior;

  /**
  * Description: "Extensions for requiredBehavior"
  */
  private transient Element _requiredBehavior;

  /**
  * Description: "Defines whether the action should usually be preselected."
  */
  private String precheckBehavior;

  /**
  * Description: "Extensions for precheckBehavior"
  */
  private transient Element _precheckBehavior;

  /**
  * Description: "Defines whether the action can be selected multiple times."
  */
  private String cardinalityBehavior;

  /**
  * Description: "Extensions for cardinalityBehavior"
  */
  private transient Element _cardinalityBehavior;

  /**
  * Description: "A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken."
  */
  private Reference definition;

  /**
  * Description: "A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input."
  */
  private Reference transform;

  /**
  * Description: "Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result."
  */
  private java.util.List<PlanDefinitionDynamicValue> dynamicValue = new java.util.ArrayList<>();

  /**
  * Description: "Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition."
  */
  private java.util.List<PlanDefinitionAction> action = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public PlanDefinitionAction() {
  }

  public PlanDefinitionAction(PlanDefinitionActionModel o) {
    this.id = o.getId();
    if (null != o.getLabel()) {
      this.label = o.getLabel();
    }
    if (null != o.getTitle()) {
      this.title = o.getTitle();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getTextEquivalent()) {
      this.textEquivalent = o.getTextEquivalent();
    }
    if (null != o.getDocumentation() && !o.getDocumentation().isEmpty()) {
    	this.documentation = RelatedArtifactHelper.fromArray2Array(o.getDocumentation());
    }
    if (o.getGoalId() != null) {
    	this.goalId = org.fhir.utils.JsonUtils.json2Array(o.getGoalId());
    }
    if (null != o.getTriggerDefinition() && !o.getTriggerDefinition().isEmpty()) {
    	this.triggerDefinition = TriggerDefinitionHelper.fromArray2Array(o.getTriggerDefinition());
    }
    if (null != o.getCondition() && !o.getCondition().isEmpty()) {
    	this.condition = PlanDefinitionConditionHelper.fromArray2Array(o.getCondition());
    }
    if (null != o.getInput() && !o.getInput().isEmpty()) {
    	this.input = DataRequirementHelper.fromArray2Array(o.getInput());
    }
    if (null != o.getOutput() && !o.getOutput().isEmpty()) {
    	this.output = DataRequirementHelper.fromArray2Array(o.getOutput());
    }
    if (null != o.getRelatedAction() && !o.getRelatedAction().isEmpty()) {
    	this.relatedAction = PlanDefinitionRelatedActionHelper.fromArray2Array(o.getRelatedAction());
    }
    if (null != o.getTimingDateTime()) {
      this.timingDateTime = o.getTimingDateTime();
    }
    this.timingPeriod = PeriodHelper.fromJson(o.getTimingPeriod());
    this.timingDuration = DurationHelper.fromJson(o.getTimingDuration());
    this.timingRange = RangeHelper.fromJson(o.getTimingRange());
    this.timingTiming = TimingHelper.fromJson(o.getTimingTiming());
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant = PlanDefinitionParticipantHelper.fromArray2Array(o.getParticipant());
    }
    this.type = CodingHelper.fromJson(o.getType());
    if (null != o.getGroupingBehavior()) {
      this.groupingBehavior = o.getGroupingBehavior();
    }
    if (null != o.getSelectionBehavior()) {
      this.selectionBehavior = o.getSelectionBehavior();
    }
    if (null != o.getRequiredBehavior()) {
      this.requiredBehavior = o.getRequiredBehavior();
    }
    if (null != o.getPrecheckBehavior()) {
      this.precheckBehavior = o.getPrecheckBehavior();
    }
    if (null != o.getCardinalityBehavior()) {
      this.cardinalityBehavior = o.getCardinalityBehavior();
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
      this.definition = new Reference(o.getDefinition().get(0));
    }
    if (null != o.getTransform() && !o.getTransform().isEmpty()) {
      this.transform = new Reference(o.getTransform().get(0));
    }
    if (null != o.getDynamicValue() && !o.getDynamicValue().isEmpty()) {
    	this.dynamicValue = PlanDefinitionDynamicValueHelper.fromArray2Array(o.getDynamicValue());
    }
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action = PlanDefinitionActionHelper.fromArray2Array(o.getAction());
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setLabel( String value) {
    this.label = value;
  }
  public String getLabel() {
    return this.label;
  }
  public void set_label( Element value) {
    this._label = value;
  }
  public Element get_label() {
    return this._label;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void set_title( Element value) {
    this._title = value;
  }
  public Element get_title() {
    return this._title;
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
  public void setTextEquivalent( String value) {
    this.textEquivalent = value;
  }
  public String getTextEquivalent() {
    return this.textEquivalent;
  }
  public void set_textEquivalent( Element value) {
    this._textEquivalent = value;
  }
  public Element get_textEquivalent() {
    return this._textEquivalent;
  }
  public void setCode( java.util.List<CodeableConcept> value) {
    this.code = value;
  }
  public java.util.List<CodeableConcept> getCode() {
    return this.code;
  }
  public void setReason( java.util.List<CodeableConcept> value) {
    this.reason = value;
  }
  public java.util.List<CodeableConcept> getReason() {
    return this.reason;
  }
  public void setDocumentation( java.util.List<RelatedArtifact> value) {
    this.documentation = value;
  }
  public java.util.List<RelatedArtifact> getDocumentation() {
    return this.documentation;
  }
  public void setGoalId( java.util.List<String> value) {
    this.goalId = value;
  }
  public java.util.List<String> getGoalId() {
    return this.goalId;
  }
  public void set_goalId( java.util.List<Element> value) {
    this._goalId = value;
  }
  public java.util.List<Element> get_goalId() {
    return this._goalId;
  }
  public void setTriggerDefinition( java.util.List<TriggerDefinition> value) {
    this.triggerDefinition = value;
  }
  public java.util.List<TriggerDefinition> getTriggerDefinition() {
    return this.triggerDefinition;
  }
  public void setCondition( java.util.List<PlanDefinitionCondition> value) {
    this.condition = value;
  }
  public java.util.List<PlanDefinitionCondition> getCondition() {
    return this.condition;
  }
  public void setInput( java.util.List<DataRequirement> value) {
    this.input = value;
  }
  public java.util.List<DataRequirement> getInput() {
    return this.input;
  }
  public void setOutput( java.util.List<DataRequirement> value) {
    this.output = value;
  }
  public java.util.List<DataRequirement> getOutput() {
    return this.output;
  }
  public void setRelatedAction( java.util.List<PlanDefinitionRelatedAction> value) {
    this.relatedAction = value;
  }
  public java.util.List<PlanDefinitionRelatedAction> getRelatedAction() {
    return this.relatedAction;
  }
  public void setTimingDateTime( String value) {
    this.timingDateTime = value;
  }
  public String getTimingDateTime() {
    return this.timingDateTime;
  }
  public void set_timingDateTime( Element value) {
    this._timingDateTime = value;
  }
  public Element get_timingDateTime() {
    return this._timingDateTime;
  }
  public void setTimingPeriod( Period value) {
    this.timingPeriod = value;
  }
  public Period getTimingPeriod() {
    return this.timingPeriod;
  }
  public void setTimingDuration( Duration value) {
    this.timingDuration = value;
  }
  public Duration getTimingDuration() {
    return this.timingDuration;
  }
  public void setTimingRange( Range value) {
    this.timingRange = value;
  }
  public Range getTimingRange() {
    return this.timingRange;
  }
  public void setTimingTiming( Timing value) {
    this.timingTiming = value;
  }
  public Timing getTimingTiming() {
    return this.timingTiming;
  }
  public void setParticipant( java.util.List<PlanDefinitionParticipant> value) {
    this.participant = value;
  }
  public java.util.List<PlanDefinitionParticipant> getParticipant() {
    return this.participant;
  }
  public void setType( Coding value) {
    this.type = value;
  }
  public Coding getType() {
    return this.type;
  }
  public void setGroupingBehavior( String value) {
    this.groupingBehavior = GroupingBehaviorEnum.fromCode(value);
  }
  public String getGroupingBehavior() {
    return this.groupingBehavior;
  }
  public void set_groupingBehavior( Element value) {
    this._groupingBehavior = value;
  }
  public Element get_groupingBehavior() {
    return this._groupingBehavior;
  }
  public void setSelectionBehavior( String value) {
    this.selectionBehavior = SelectionBehaviorEnum.fromCode(value);
  }
  public String getSelectionBehavior() {
    return this.selectionBehavior;
  }
  public void set_selectionBehavior( Element value) {
    this._selectionBehavior = value;
  }
  public Element get_selectionBehavior() {
    return this._selectionBehavior;
  }
  public void setRequiredBehavior( String value) {
    this.requiredBehavior = RequiredBehaviorEnum.fromCode(value);
  }
  public String getRequiredBehavior() {
    return this.requiredBehavior;
  }
  public void set_requiredBehavior( Element value) {
    this._requiredBehavior = value;
  }
  public Element get_requiredBehavior() {
    return this._requiredBehavior;
  }
  public void setPrecheckBehavior( String value) {
    this.precheckBehavior = PrecheckBehaviorEnum.fromCode(value);
  }
  public String getPrecheckBehavior() {
    return this.precheckBehavior;
  }
  public void set_precheckBehavior( Element value) {
    this._precheckBehavior = value;
  }
  public Element get_precheckBehavior() {
    return this._precheckBehavior;
  }
  public void setCardinalityBehavior( String value) {
    this.cardinalityBehavior = CardinalityBehaviorEnum.fromCode(value);
  }
  public String getCardinalityBehavior() {
    return this.cardinalityBehavior;
  }
  public void set_cardinalityBehavior( Element value) {
    this._cardinalityBehavior = value;
  }
  public Element get_cardinalityBehavior() {
    return this._cardinalityBehavior;
  }
  public void setDefinition( Reference value) {
    this.definition = value;
  }
  public Reference getDefinition() {
    return this.definition;
  }
  public void setTransform( Reference value) {
    this.transform = value;
  }
  public Reference getTransform() {
    return this.transform;
  }
  public void setDynamicValue( java.util.List<PlanDefinitionDynamicValue> value) {
    this.dynamicValue = value;
  }
  public java.util.List<PlanDefinitionDynamicValue> getDynamicValue() {
    return this.dynamicValue;
  }
  public void setAction( java.util.List<PlanDefinitionAction> value) {
    this.action = value;
  }
  public java.util.List<PlanDefinitionAction> getAction() {
    return this.action;
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
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PlanDefinitionAction]:" + "\n");
     if(this.label != null) builder.append("label" + "->" + this.label.toString() + "\n"); 
     if(this._label != null) builder.append("_label" + "->" + this._label.toString() + "\n"); 
     if(this.title != null) builder.append("title" + "->" + this.title.toString() + "\n"); 
     if(this._title != null) builder.append("_title" + "->" + this._title.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.textEquivalent != null) builder.append("textEquivalent" + "->" + this.textEquivalent.toString() + "\n"); 
     if(this._textEquivalent != null) builder.append("_textEquivalent" + "->" + this._textEquivalent.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); 
     if(this.documentation != null) builder.append("documentation" + "->" + this.documentation.toString() + "\n"); 
     if(this.goalId != null) builder.append("goalId" + "->" + this.goalId.toString() + "\n"); 
     if(this._goalId != null) builder.append("_goalId" + "->" + this._goalId.toString() + "\n"); 
     if(this.triggerDefinition != null) builder.append("triggerDefinition" + "->" + this.triggerDefinition.toString() + "\n"); 
     if(this.condition != null) builder.append("condition" + "->" + this.condition.toString() + "\n"); 
     if(this.input != null) builder.append("input" + "->" + this.input.toString() + "\n"); 
     if(this.output != null) builder.append("output" + "->" + this.output.toString() + "\n"); 
     if(this.relatedAction != null) builder.append("relatedAction" + "->" + this.relatedAction.toString() + "\n"); 
     if(this.timingDateTime != null) builder.append("timingDateTime" + "->" + this.timingDateTime.toString() + "\n"); 
     if(this._timingDateTime != null) builder.append("_timingDateTime" + "->" + this._timingDateTime.toString() + "\n"); 
     if(this.timingPeriod != null) builder.append("timingPeriod" + "->" + this.timingPeriod.toString() + "\n"); 
     if(this.timingDuration != null) builder.append("timingDuration" + "->" + this.timingDuration.toString() + "\n"); 
     if(this.timingRange != null) builder.append("timingRange" + "->" + this.timingRange.toString() + "\n"); 
     if(this.timingTiming != null) builder.append("timingTiming" + "->" + this.timingTiming.toString() + "\n"); 
     if(this.participant != null) builder.append("participant" + "->" + this.participant.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.groupingBehavior != null) builder.append("groupingBehavior" + "->" + this.groupingBehavior.toString() + "\n"); 
     if(this._groupingBehavior != null) builder.append("_groupingBehavior" + "->" + this._groupingBehavior.toString() + "\n"); 
     if(this.selectionBehavior != null) builder.append("selectionBehavior" + "->" + this.selectionBehavior.toString() + "\n"); 
     if(this._selectionBehavior != null) builder.append("_selectionBehavior" + "->" + this._selectionBehavior.toString() + "\n"); 
     if(this.requiredBehavior != null) builder.append("requiredBehavior" + "->" + this.requiredBehavior.toString() + "\n"); 
     if(this._requiredBehavior != null) builder.append("_requiredBehavior" + "->" + this._requiredBehavior.toString() + "\n"); 
     if(this.precheckBehavior != null) builder.append("precheckBehavior" + "->" + this.precheckBehavior.toString() + "\n"); 
     if(this._precheckBehavior != null) builder.append("_precheckBehavior" + "->" + this._precheckBehavior.toString() + "\n"); 
     if(this.cardinalityBehavior != null) builder.append("cardinalityBehavior" + "->" + this.cardinalityBehavior.toString() + "\n"); 
     if(this._cardinalityBehavior != null) builder.append("_cardinalityBehavior" + "->" + this._cardinalityBehavior.toString() + "\n"); 
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this.transform != null) builder.append("transform" + "->" + this.transform.toString() + "\n"); 
     if(this.dynamicValue != null) builder.append("dynamicValue" + "->" + this.dynamicValue.toString() + "\n"); 
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }

  public enum GroupingBehaviorEnum {
  	visualgroup,
  	logicalgroup,
  	sentencegroup,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "visualgroup" : { return visualgroup.toString(); }
  			case "logicalgroup" : { return logicalgroup.toString(); }
  			case "sentencegroup" : { return sentencegroup.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum SelectionBehaviorEnum {
  	any,
  	all,
  	allornone,
  	exactlyone,
  	atmostone,
  	oneormore,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "any" : { return any.toString(); }
  			case "all" : { return all.toString(); }
  			case "allornone" : { return allornone.toString(); }
  			case "exactlyone" : { return exactlyone.toString(); }
  			case "atmostone" : { return atmostone.toString(); }
  			case "oneormore" : { return oneormore.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum RequiredBehaviorEnum {
  	must,
  	could,
  	mustunlessdocumented,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "must" : { return must.toString(); }
  			case "could" : { return could.toString(); }
  			case "mustunlessdocumented" : { return mustunlessdocumented.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum PrecheckBehaviorEnum {
  	yes,
  	no,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "yes" : { return yes.toString(); }
  			case "no" : { return no.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum CardinalityBehaviorEnum {
  	single,
  	multiple,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "single" : { return single.toString(); }
  			case "multiple" : { return multiple.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}