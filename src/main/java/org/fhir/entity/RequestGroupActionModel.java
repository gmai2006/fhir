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
* "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
*/
@Entity
@Table(name="requestgroupaction")
public class RequestGroupActionModel  {
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
  * Description: "Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<RelatedArtifactModel> documentation = new java.util.ArrayList<>();

  /**
  * Description: "An expression that describes applicability criteria, or start/stop conditions for the action."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<RequestGroupConditionModel> condition = new java.util.ArrayList<>();

  /**
  * Description: "A relationship to another action such as \"before\" or \"30-60 minutes after start of\"."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<RequestGroupRelatedActionModel> relatedAction = new java.util.ArrayList<>();

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
  * Description: "The participant that should perform or be responsible for this action."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> participant = new java.util.ArrayList<>();

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
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"groupingBehavior\"")
  private String groupingBehavior;

  /**
  * Description: "Defines the selection behavior for the action and its children."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"selectionBehavior\"")
  private String selectionBehavior;

  /**
  * Description: "Defines the requiredness behavior for the action."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"requiredBehavior\"")
  private String requiredBehavior;

  /**
  * Description: "Defines whether the action should usually be preselected."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"precheckBehavior\"")
  private String precheckBehavior;

  /**
  * Description: "Defines whether the action can be selected multiple times."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"cardinalityBehavior\"")
  private String cardinalityBehavior;

  /**
  * Description: "The resource that is the target of the action (e.g. CommunicationRequest)."
  */
  @javax.persistence.Basic
  @Column(name="\"resource_id\"")
  private String resource_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`resource_id`", insertable=false, updatable=false)
  private ReferenceModel resource;

  /**
  * Description: "Sub actions."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<RequestGroupActionModel> action = new java.util.ArrayList<>();

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

  public RequestGroupActionModel() {
  }

  public RequestGroupActionModel(RequestGroupAction o) {
    this.id = o.getId();
      this.label = o.getLabel();

      this.title = o.getTitle();

      this.description = o.getDescription();

      this.textEquivalent = o.getTextEquivalent();

      this.code = CodeableConcept.toJson(o.getCode());
      this.documentation = RelatedArtifact.toModelArray(o.getDocumentation());

      this.condition = RequestGroupCondition.toModelArray(o.getCondition());

      this.relatedAction = RequestGroupRelatedAction.toModelArray(o.getRelatedAction());

      this.timingDateTime = o.getTimingDateTime();

      this.timingPeriod = Period.toJson(o.getTimingPeriod());
      this.timingDuration = Duration.toJson(o.getTimingDuration());
      this.timingRange = Range.toJson(o.getTimingRange());
      this.timingTiming = Timing.toJson(o.getTimingTiming());
      this.participant = Reference.toModelArray(o.getParticipant());

      this.type = Coding.toJson(o.getType());
      this.groupingBehavior = o.getGroupingBehavior();

      this.selectionBehavior = o.getSelectionBehavior();

      this.requiredBehavior = o.getRequiredBehavior();

      this.precheckBehavior = o.getPrecheckBehavior();

      this.cardinalityBehavior = o.getCardinalityBehavior();

      if (null != o.getResource()) {
      	this.resource_id = "resource" + this.getId();
        this.resource = new ReferenceModel(o.getResource());
        this.resource.setId(this.resource_id);
        this.resource.parent_id = this.resource.getId();
      }

      this.action = RequestGroupAction.toModelArray(o.getAction());

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
  public void setDocumentation( java.util.List<RelatedArtifactModel> value) {
    this.documentation = value;
  }
  public java.util.List<RelatedArtifactModel> getDocumentation() {
    return this.documentation;
  }
  public void setCondition( java.util.List<RequestGroupConditionModel> value) {
    this.condition = value;
  }
  public java.util.List<RequestGroupConditionModel> getCondition() {
    return this.condition;
  }
  public void setRelatedAction( java.util.List<RequestGroupRelatedActionModel> value) {
    this.relatedAction = value;
  }
  public java.util.List<RequestGroupRelatedActionModel> getRelatedAction() {
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
  public void setParticipant( java.util.List<ReferenceModel> value) {
    this.participant = value;
  }
  public java.util.List<ReferenceModel> getParticipant() {
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
  public void setResource( ReferenceModel value) {
    this.resource = value;
  }
  public ReferenceModel getResource() {
    return this.resource;
  }
  public void setAction( java.util.List<RequestGroupActionModel> value) {
    this.action = value;
  }
  public java.util.List<RequestGroupActionModel> getAction() {
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
     builder.append("documentation" + "[" + String.valueOf(this.documentation) + "]\n"); 
     builder.append("condition" + "[" + String.valueOf(this.condition) + "]\n"); 
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
     builder.append("resource" + "[" + String.valueOf(this.resource) + "]\n"); 
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}