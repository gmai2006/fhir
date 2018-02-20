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
* "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
*/
@Entity
@Table(name="requestgroupaction")
public class RequestGroupActionModel  implements Serializable {
	private static final long serialVersionUID = 15191089372958538L;
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
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

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
  * Description: "An expression that describes applicability criteria, or start/stop conditions for the action."
  */
  @javax.persistence.Basic
  @Column(name="\"condition_id\"")
  private String condition_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="condition_id", insertable=false, updatable=false)
  private java.util.List<RequestGroupConditionModel> condition;

  /**
  * Description: "A relationship to another action such as \"before\" or \"30-60 minutes after start of\"."
  */
  @javax.persistence.Basic
  @Column(name="\"relatedaction_id\"")
  private String relatedaction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="relatedaction_id", insertable=false, updatable=false)
  private java.util.List<RequestGroupRelatedActionModel> relatedAction;

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
  * Description: "The participant that should perform or be responsible for this action."
  */
  @javax.persistence.Basic
  @Column(name="\"participant_id\"")
  private String participant_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="participant_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> participant;

  /**
  * Description: "The type of action to perform (create, update, remove)."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> type;

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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="resource_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> resource;

  /**
  * Description: "Sub actions."
  */
  @javax.persistence.Basic
  @Column(name="\"action_id\"")
  private String action_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="action_id", insertable=false, updatable=false)
  private java.util.List<RequestGroupActionModel> action;

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

  public RequestGroupActionModel() {
  }

  public RequestGroupActionModel(RequestGroupAction o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.label = o.getLabel();
    this.title = o.getTitle();
    this.description = o.getDescription();
    this.textEquivalent = o.getTextEquivalent();
    if (null != o.getCode() && !o.getCode().isEmpty()) {
    	this.code_id = "code" + this.parent_id;
    	this.code = CodeableConceptHelper.toModelFromArray(o.getCode(), this.code_id);
    }
    if (null != o.getDocumentation() && !o.getDocumentation().isEmpty()) {
    	this.documentation_id = "documentation" + this.parent_id;
    	this.documentation = RelatedArtifactHelper.toModelFromArray(o.getDocumentation(), this.documentation_id);
    }
    if (null != o.getCondition() && !o.getCondition().isEmpty()) {
    	this.condition_id = "condition" + this.parent_id;
    	this.condition = RequestGroupConditionHelper.toModelFromArray(o.getCondition(), this.condition_id);
    }
    if (null != o.getRelatedAction() && !o.getRelatedAction().isEmpty()) {
    	this.relatedaction_id = "relatedaction" + this.parent_id;
    	this.relatedAction = RequestGroupRelatedActionHelper.toModelFromArray(o.getRelatedAction(), this.relatedaction_id);
    }
    this.timingDateTime = o.getTimingDateTime();
    if (null != o.getTimingPeriod()) {
    	this.timingPeriod = JsonUtils.toJson(o.getTimingPeriod());
    }
    if (null != o.getTimingDuration()) {
    	this.timingDuration = JsonUtils.toJson(o.getTimingDuration());
    }
    if (null != o.getTimingRange()) {
    	this.timingRange = JsonUtils.toJson(o.getTimingRange());
    }
    if (null != o.getTimingTiming()) {
    	this.timingTiming = JsonUtils.toJson(o.getTimingTiming());
    }
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant_id = "participant" + this.parent_id;
    	this.participant = ReferenceHelper.toModelFromArray(o.getParticipant(), this.participant_id);
    }
    if (null != o.getType() ) {
    	this.type_id = "type" + this.parent_id;
    	this.type = CodingHelper.toModel(o.getType(), this.type_id);
    }
    this.groupingBehavior = o.getGroupingBehavior();
    this.selectionBehavior = o.getSelectionBehavior();
    this.requiredBehavior = o.getRequiredBehavior();
    this.precheckBehavior = o.getPrecheckBehavior();
    this.cardinalityBehavior = o.getCardinalityBehavior();
    if (null != o.getResource() ) {
    	this.resource_id = "resource" + this.parent_id;
    	this.resource = ReferenceHelper.toModel(o.getResource(), this.resource_id);
    }
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action_id = "action" + this.parent_id;
    	this.action = RequestGroupActionHelper.toModelFromArray(o.getAction(), this.action_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
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
  public java.util.List<CodeableConceptModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodeableConceptModel> value) {
    this.code = value;
  }
  public java.util.List<RelatedArtifactModel> getDocumentation() {
    return this.documentation;
  }
  public void setDocumentation( java.util.List<RelatedArtifactModel> value) {
    this.documentation = value;
  }
  public java.util.List<RequestGroupConditionModel> getCondition() {
    return this.condition;
  }
  public void setCondition( java.util.List<RequestGroupConditionModel> value) {
    this.condition = value;
  }
  public java.util.List<RequestGroupRelatedActionModel> getRelatedAction() {
    return this.relatedAction;
  }
  public void setRelatedAction( java.util.List<RequestGroupRelatedActionModel> value) {
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
  public java.util.List<ReferenceModel> getParticipant() {
    return this.participant;
  }
  public void setParticipant( java.util.List<ReferenceModel> value) {
    this.participant = value;
  }
  public java.util.List<CodingModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodingModel> value) {
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
  public java.util.List<ReferenceModel> getResource() {
    return this.resource;
  }
  public void setResource( java.util.List<ReferenceModel> value) {
    this.resource = value;
  }
  public java.util.List<RequestGroupActionModel> getAction() {
    return this.action;
  }
  public void setAction( java.util.List<RequestGroupActionModel> value) {
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
    builder.append("[RequestGroupActionModel]:" + "\n");
     builder.append("label" + "->" + this.label + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("textEquivalent" + "->" + this.textEquivalent + "\n"); 
     builder.append("timingDateTime" + "->" + this.timingDateTime + "\n"); 
     builder.append("timingPeriod" + "->" + this.timingPeriod + "\n"); 
     builder.append("timingDuration" + "->" + this.timingDuration + "\n"); 
     builder.append("timingRange" + "->" + this.timingRange + "\n"); 
     builder.append("timingTiming" + "->" + this.timingTiming + "\n"); 
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
    builder.append("[RequestGroupActionModel]:" + "\n");
     builder.append("label" + "->" + this.label + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("textEquivalent" + "->" + this.textEquivalent + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("condition" + "->" + this.condition + "\n"); 
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
     builder.append("resource" + "->" + this.resource + "\n"); 
     builder.append("action" + "->" + this.action + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}