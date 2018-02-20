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
import org.fhir.entity.RequestGroupActionModel;
import com.google.gson.GsonBuilder;

/**
* "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
*/
public class RequestGroupAction  extends BackboneElement  {
  /**
  * Description: "A user-visible label for the action."
  */
  protected String label;

  /**
  * Description: "Extensions for label"
  */
  protected transient Element _label;

  /**
  * Description: "The title of the action displayed to a user."
  */
  protected String title;

  /**
  * Description: "Extensions for title"
  */
  protected transient Element _title;

  /**
  * Description: "A short description of the action used to provide a summary to display to the user."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "A text equivalent of the action to be performed. This provides a human-interpretable description of the action when the definition is consumed by a system that may not be capable of interpreting it dynamically."
  */
  protected String textEquivalent;

  /**
  * Description: "Extensions for textEquivalent"
  */
  protected transient Element _textEquivalent;

  /**
  * Description: "A code that provides meaning for the action or action group. For example, a section may have a LOINC code for a the section of a documentation template."
  */
  protected java.util.List<CodeableConcept> code = new java.util.ArrayList<>();

  /**
  * Description: "Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources."
  */
  protected java.util.List<RelatedArtifact> documentation = new java.util.ArrayList<>();

  /**
  * Description: "An expression that describes applicability criteria, or start/stop conditions for the action."
  */
  protected java.util.List<RequestGroupCondition> condition = new java.util.ArrayList<>();

  /**
  * Description: "A relationship to another action such as \"before\" or \"30-60 minutes after start of\"."
  */
  protected java.util.List<RequestGroupRelatedAction> relatedAction = new java.util.ArrayList<>();

  /**
  * Description: "An optional value describing when the action should be performed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String timingDateTime;

  /**
  * Description: "Extensions for timingDateTime"
  */
  protected transient Element _timingDateTime;

  /**
  * Description: "An optional value describing when the action should be performed."
  */
  protected Period timingPeriod;

  /**
  * Description: "An optional value describing when the action should be performed."
  */
  protected Duration timingDuration;

  /**
  * Description: "An optional value describing when the action should be performed."
  */
  protected Range timingRange;

  /**
  * Description: "An optional value describing when the action should be performed."
  */
  protected Timing timingTiming;

  /**
  * Description: "The participant that should perform or be responsible for this action."
  */
  protected java.util.List<Reference> participant = new java.util.ArrayList<>();

  /**
  * Description: "The type of action to perform (create, update, remove)."
  */
  protected Coding type;

  /**
  * Description: "Defines the grouping behavior for the action and its children."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String groupingBehavior;

  /**
  * Description: "Extensions for groupingBehavior"
  */
  protected transient Element _groupingBehavior;

  /**
  * Description: "Defines the selection behavior for the action and its children."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String selectionBehavior;

  /**
  * Description: "Extensions for selectionBehavior"
  */
  protected transient Element _selectionBehavior;

  /**
  * Description: "Defines the requiredness behavior for the action."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String requiredBehavior;

  /**
  * Description: "Extensions for requiredBehavior"
  */
  protected transient Element _requiredBehavior;

  /**
  * Description: "Defines whether the action should usually be preselected."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String precheckBehavior;

  /**
  * Description: "Extensions for precheckBehavior"
  */
  protected transient Element _precheckBehavior;

  /**
  * Description: "Defines whether the action can be selected multiple times."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String cardinalityBehavior;

  /**
  * Description: "Extensions for cardinalityBehavior"
  */
  protected transient Element _cardinalityBehavior;

  /**
  * Description: "The resource that is the target of the action (e.g. CommunicationRequest)."
  */
  protected Reference resource;

  /**
  * Description: "Sub actions."
  */
  protected java.util.List<RequestGroupAction> action = new java.util.ArrayList<>();

  public RequestGroupAction() {
  }

  public RequestGroupAction(RequestGroupActionModel o) {
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
    if (null != o.getCode() && !o.getCode().isEmpty()) {
    	this.code = CodeableConceptHelper.fromArray2Array(o.getCode());
    }
    if (null != o.getDocumentation() && !o.getDocumentation().isEmpty()) {
    	this.documentation = RelatedArtifactHelper.fromArray2Array(o.getDocumentation());
    }
    if (null != o.getCondition() && !o.getCondition().isEmpty()) {
    	this.condition = RequestGroupConditionHelper.fromArray2Array(o.getCondition());
    }
    if (null != o.getRelatedAction() && !o.getRelatedAction().isEmpty()) {
    	this.relatedAction = RequestGroupRelatedActionHelper.fromArray2Array(o.getRelatedAction());
    }
    if (null != o.getTimingDateTime()) {
      this.timingDateTime = o.getTimingDateTime();
    }
    this.timingPeriod = PeriodHelper.fromJson(o.getTimingPeriod());
    this.timingDuration = DurationHelper.fromJson(o.getTimingDuration());
    this.timingRange = RangeHelper.fromJson(o.getTimingRange());
    this.timingTiming = TimingHelper.fromJson(o.getTimingTiming());
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant = ReferenceHelper.fromArray2Array(o.getParticipant());
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new Coding(o.getType().get(0));
    }
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
    if (null != o.getResource() && !o.getResource().isEmpty()) {
      this.resource = new Reference(o.getResource().get(0));
    }
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action = RequestGroupActionHelper.fromArray2Array(o.getAction());
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
  public void setDocumentation( java.util.List<RelatedArtifact> value) {
    this.documentation = value;
  }
  public java.util.List<RelatedArtifact> getDocumentation() {
    return this.documentation;
  }
  public void setCondition( java.util.List<RequestGroupCondition> value) {
    this.condition = value;
  }
  public java.util.List<RequestGroupCondition> getCondition() {
    return this.condition;
  }
  public void setRelatedAction( java.util.List<RequestGroupRelatedAction> value) {
    this.relatedAction = value;
  }
  public java.util.List<RequestGroupRelatedAction> getRelatedAction() {
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
  public void setParticipant( java.util.List<Reference> value) {
    this.participant = value;
  }
  public java.util.List<Reference> getParticipant() {
    return this.participant;
  }
  public void setType( Coding value) {
    this.type = value;
  }
  public Coding getType() {
    return this.type;
  }
  public void setGroupingBehavior( String value) {
    this.groupingBehavior = value;
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
    this.selectionBehavior = value;
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
    this.requiredBehavior = value;
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
    this.precheckBehavior = value;
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
    this.cardinalityBehavior = value;
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
  public void setResource( Reference value) {
    this.resource = value;
  }
  public Reference getResource() {
    return this.resource;
  }
  public void setAction( java.util.List<RequestGroupAction> value) {
    this.action = value;
  }
  public java.util.List<RequestGroupAction> getAction() {
    return this.action;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[RequestGroupAction]:" + "\n");
     if(this.label != null) builder.append("label" + "->" + this.label.toString() + "\n"); 
     if(this._label != null) builder.append("_label" + "->" + this._label.toString() + "\n"); 
     if(this.title != null) builder.append("title" + "->" + this.title.toString() + "\n"); 
     if(this._title != null) builder.append("_title" + "->" + this._title.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.textEquivalent != null) builder.append("textEquivalent" + "->" + this.textEquivalent.toString() + "\n"); 
     if(this._textEquivalent != null) builder.append("_textEquivalent" + "->" + this._textEquivalent.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.documentation != null) builder.append("documentation" + "->" + this.documentation.toString() + "\n"); 
     if(this.condition != null) builder.append("condition" + "->" + this.condition.toString() + "\n"); 
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
     if(this.resource != null) builder.append("resource" + "->" + this.resource.toString() + "\n"); 
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); ;
    return builder.toString();
  }


}