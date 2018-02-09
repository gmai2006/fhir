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
        this.label = new String(o.getLabel());
      }

      if (null != o.getTitle()) {
        this.title = new String(o.getTitle());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      if (null != o.getTextEquivalent()) {
        this.textEquivalent = new String(o.getTextEquivalent());
      }

      this.code = CodeableConcept.fromArray(o.getCode());
      this.reason = CodeableConcept.fromArray(o.getReason());
      this.documentation = RelatedArtifact.fromArray(o.getDocumentation());

      this.goalId = org.fhir.utils.JsonUtils.json2Array(o.getGoalId());

      this.triggerDefinition = TriggerDefinition.fromArray(o.getTriggerDefinition());

      this.condition = PlanDefinitionCondition.fromArray(o.getCondition());

      this.input = DataRequirement.fromArray(o.getInput());

      this.output = DataRequirement.fromArray(o.getOutput());

      this.relatedAction = PlanDefinitionRelatedAction.fromArray(o.getRelatedAction());

      if (null != o.getTimingDateTime()) {
        this.timingDateTime = new String(o.getTimingDateTime());
      }

      this.timingPeriod = Period.fromJson(o.getTimingPeriod());
      this.timingDuration = Duration.fromJson(o.getTimingDuration());
      this.timingRange = Range.fromJson(o.getTimingRange());
      this.timingTiming = Timing.fromJson(o.getTimingTiming());
      this.participant = PlanDefinitionParticipant.fromArray(o.getParticipant());

      this.type = Coding.fromJson(o.getType());
      if (null != o.getGroupingBehavior()) {
        this.groupingBehavior = new String(o.getGroupingBehavior());
      }

      if (null != o.getSelectionBehavior()) {
        this.selectionBehavior = new String(o.getSelectionBehavior());
      }

      if (null != o.getRequiredBehavior()) {
        this.requiredBehavior = new String(o.getRequiredBehavior());
      }

      if (null != o.getPrecheckBehavior()) {
        this.precheckBehavior = new String(o.getPrecheckBehavior());
      }

      if (null != o.getCardinalityBehavior()) {
        this.cardinalityBehavior = new String(o.getCardinalityBehavior());
      }

      if (null != o.getDefinition()) {
        this.definition = new Reference(o.getDefinition());
        this.definition.setId(this.getId());
      }

      if (null != o.getTransform()) {
        this.transform = new Reference(o.getTransform());
        this.transform.setId(this.getId());
      }

      this.dynamicValue = PlanDefinitionDynamicValue.fromArray(o.getDynamicValue());

      this.action = PlanDefinitionAction.fromArray(o.getAction());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("label" + "[" + String.valueOf(this.label) + "]\n"); 
     builder.append("_label" + "[" + String.valueOf(this._label) + "]\n"); 
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("_title" + "[" + String.valueOf(this._title) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("textEquivalent" + "[" + String.valueOf(this.textEquivalent) + "]\n"); 
     builder.append("_textEquivalent" + "[" + String.valueOf(this._textEquivalent) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("documentation" + "[" + String.valueOf(this.documentation) + "]\n"); 
     builder.append("goalId" + "[" + String.valueOf(this.goalId) + "]\n"); 
     builder.append("_goalId" + "[" + String.valueOf(this._goalId) + "]\n"); 
     builder.append("triggerDefinition" + "[" + String.valueOf(this.triggerDefinition) + "]\n"); 
     builder.append("condition" + "[" + String.valueOf(this.condition) + "]\n"); 
     builder.append("input" + "[" + String.valueOf(this.input) + "]\n"); 
     builder.append("output" + "[" + String.valueOf(this.output) + "]\n"); 
     builder.append("relatedAction" + "[" + String.valueOf(this.relatedAction) + "]\n"); 
     builder.append("timingDateTime" + "[" + String.valueOf(this.timingDateTime) + "]\n"); 
     builder.append("_timingDateTime" + "[" + String.valueOf(this._timingDateTime) + "]\n"); 
     builder.append("timingPeriod" + "[" + String.valueOf(this.timingPeriod) + "]\n"); 
     builder.append("timingDuration" + "[" + String.valueOf(this.timingDuration) + "]\n"); 
     builder.append("timingRange" + "[" + String.valueOf(this.timingRange) + "]\n"); 
     builder.append("timingTiming" + "[" + String.valueOf(this.timingTiming) + "]\n"); 
     builder.append("participant" + "[" + String.valueOf(this.participant) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("groupingBehavior" + "[" + String.valueOf(this.groupingBehavior) + "]\n"); 
     builder.append("_groupingBehavior" + "[" + String.valueOf(this._groupingBehavior) + "]\n"); 
     builder.append("selectionBehavior" + "[" + String.valueOf(this.selectionBehavior) + "]\n"); 
     builder.append("_selectionBehavior" + "[" + String.valueOf(this._selectionBehavior) + "]\n"); 
     builder.append("requiredBehavior" + "[" + String.valueOf(this.requiredBehavior) + "]\n"); 
     builder.append("_requiredBehavior" + "[" + String.valueOf(this._requiredBehavior) + "]\n"); 
     builder.append("precheckBehavior" + "[" + String.valueOf(this.precheckBehavior) + "]\n"); 
     builder.append("_precheckBehavior" + "[" + String.valueOf(this._precheckBehavior) + "]\n"); 
     builder.append("cardinalityBehavior" + "[" + String.valueOf(this.cardinalityBehavior) + "]\n"); 
     builder.append("_cardinalityBehavior" + "[" + String.valueOf(this._cardinalityBehavior) + "]\n"); 
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("transform" + "[" + String.valueOf(this.transform) + "]\n"); 
     builder.append("dynamicValue" + "[" + String.valueOf(this.dynamicValue) + "]\n"); 
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
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

  public static java.util.List<PlanDefinitionAction> fromArray(java.util.List<PlanDefinitionActionModel> list) {
    return (java.util.List<PlanDefinitionAction>)list.stream()
      .map(model -> new PlanDefinitionAction(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<PlanDefinitionActionModel> toModelArray(java.util.List<PlanDefinitionAction> list) {
    return (java.util.List<PlanDefinitionActionModel>)list.stream()
      .map(model -> new PlanDefinitionActionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static PlanDefinitionAction fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, PlanDefinitionAction.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(PlanDefinitionAction o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<PlanDefinitionAction> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}