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
@Table(name="plandefinitiongoal")
public class PlanDefinitionGoalModel  implements Serializable {
	private static final long serialVersionUID = 151857669696996406L;
  /**
  * Description: "Indicates a category the goal falls within."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "Human-readable and/or coded description of a specific desired objective of care, such as \"control blood pressure\" or \"negotiate an obstacle course\" or \"dance with child at wedding\"."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"description\"", length = 16777215)
  private String description;

  /**
  * Description: "Identifies the expected level of importance associated with reaching/sustaining the defined goal."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"priority\"", length = 16777215)
  private String priority;

  /**
  * Description: "The event after which the goal should begin being pursued."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"start\"", length = 16777215)
  private String start;

  /**
  * Description: "Identifies problems, conditions, issues, or concerns the goal is intended to address."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"addresses\"", length = 16777215)
  private String addresses;

  /**
  * Description: "Didactic or other informational resources associated with the goal that provide further supporting information about the goal. Information resources can include inline text commentary and links to web resources."
  */
  @javax.persistence.Basic
  @Column(name="\"documentation_id\"")
  private String documentation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="documentation_id", insertable=false, updatable=false)
  private java.util.List<RelatedArtifactModel> documentation;

  /**
  * Description: "Indicates what should be done and within what timeframe."
  */
  @javax.persistence.Basic
  @Column(name="\"target_id\"")
  private String target_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="target_id", insertable=false, updatable=false)
  private java.util.List<PlanDefinitionTargetModel> target;

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

  public PlanDefinitionGoalModel() {
  }

  public PlanDefinitionGoalModel(PlanDefinitionGoal o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.category = CodeableConceptHelper.toJson(o.getCategory());
    this.description = CodeableConceptHelper.toJson(o.getDescription());
    this.priority = CodeableConceptHelper.toJson(o.getPriority());
    this.start = CodeableConceptHelper.toJson(o.getStart());
    if (null != o.getDocumentation() && !o.getDocumentation().isEmpty()) {
    	this.documentation_id = "documentation" + this.parent_id;
    	this.documentation = RelatedArtifactHelper.toModelFromArray(o.getDocumentation(), this.documentation_id);
    }
    if (null != o.getTarget() && !o.getTarget().isEmpty()) {
    	this.target_id = "target" + this.parent_id;
    	this.target = PlanDefinitionTargetHelper.toModelFromArray(o.getTarget(), this.target_id);
    }
  }

  public String getCategory() {
    return this.category;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getStart() {
    return this.start;
  }
  public void setStart( String value) {
    this.start = value;
  }
  public String getAddresses() {
    return this.addresses;
  }
  public void setAddresses( String value) {
    this.addresses = value;
  }
  public java.util.List<RelatedArtifactModel> getDocumentation() {
    return this.documentation;
  }
  public void setDocumentation( java.util.List<RelatedArtifactModel> value) {
    this.documentation = value;
  }
  public java.util.List<PlanDefinitionTargetModel> getTarget() {
    return this.target;
  }
  public void setTarget( java.util.List<PlanDefinitionTargetModel> value) {
    this.target = value;
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
    builder.append("[PlanDefinitionGoalModel]:" + "\n");
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("start" + "->" + this.start + "\n"); 
     builder.append("addresses" + "->" + this.addresses + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PlanDefinitionGoalModel]:" + "\n");
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("start" + "->" + this.start + "\n"); 
     builder.append("addresses" + "->" + this.addresses + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("target" + "->" + this.target + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}