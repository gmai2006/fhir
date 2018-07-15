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
* "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
* generated on 07/14/2018
*/
@Entity
@Table(name="plandefinitiongoal")
public class PlanDefinitionGoalModel  implements Serializable {
	private static final long serialVersionUID = 153159210209453901L;
  /**
  * Description: "Indicates a category the goal falls within."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "Human-readable and/or coded description of a specific desired objective of care, such as \"control blood pressure\" or \"negotiate an obstacle course\" or \"dance with child at wedding\"."
  */
  @javax.persistence.Basic
  @Column(name="\"description_id\"")
  private String description_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="description_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> description;

  /**
  * Description: "Identifies the expected level of importance associated with reaching/sustaining the defined goal."
  */
  @javax.persistence.Basic
  @Column(name="\"priority_id\"")
  private String priority_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="priority_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> priority;

  /**
  * Description: "The event after which the goal should begin being pursued."
  */
  @javax.persistence.Basic
  @Column(name="\"start_id\"")
  private String start_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="start_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> start;

  /**
  * Description: "Identifies problems, conditions, issues, or concerns the goal is intended to address."
  */
  @javax.persistence.Basic
  @Column(name="\"addresses_id\"")
  private String addresses_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="addresses_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> addresses;

  /**
  * Description: "Didactic or other informational resources associated with the goal that provide further supporting information about the goal. Information resources can include inline text commentary and links to web resources."
  */
  @javax.persistence.Basic
  @Column(name="\"documentation_id\"")
  private String documentation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="documentation_id", insertable=false, updatable=false)
  private java.util.List<RelatedArtifactModel> documentation;

  /**
  * Description: "Indicates what should be done and within what timeframe."
  */
  @javax.persistence.Basic
  @Column(name="\"target_id\"")
  private String target_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="target_id", insertable=false, updatable=false)
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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public PlanDefinitionGoalModel() {
  }

  public PlanDefinitionGoalModel(PlanDefinitionGoal o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getCategory() ) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModel(o.getCategory(), this.category_id);
    }
    if (null != o.getDescription() ) {
    	this.description_id = "description" + this.id;
    	this.description = CodeableConceptHelper.toModel(o.getDescription(), this.description_id);
    }
    if (null != o.getPriority() ) {
    	this.priority_id = "priority" + this.id;
    	this.priority = CodeableConceptHelper.toModel(o.getPriority(), this.priority_id);
    }
    if (null != o.getStart() ) {
    	this.start_id = "start" + this.id;
    	this.start = CodeableConceptHelper.toModel(o.getStart(), this.start_id);
    }
    if (null != o.getAddresses() && !o.getAddresses().isEmpty()) {
    	this.addresses_id = "addresses" + this.id;
    	this.addresses = CodeableConceptHelper.toModelFromArray(o.getAddresses(), this.addresses_id);
    }
    if (null != o.getDocumentation() && !o.getDocumentation().isEmpty()) {
    	this.documentation_id = "documentation" + this.id;
    	this.documentation = RelatedArtifactHelper.toModelFromArray(o.getDocumentation(), this.documentation_id);
    }
    if (null != o.getTarget() && !o.getTarget().isEmpty()) {
    	this.target_id = "target" + this.id;
    	this.target = PlanDefinitionTargetHelper.toModelFromArray(o.getTarget(), this.target_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getCategory() {
    return this.category;
  }
  public void setCategory( java.util.List<CodeableConceptModel> value) {
    this.category = value;
  }
  public java.util.List<CodeableConceptModel> getDescription() {
    return this.description;
  }
  public void setDescription( java.util.List<CodeableConceptModel> value) {
    this.description = value;
  }
  public java.util.List<CodeableConceptModel> getPriority() {
    return this.priority;
  }
  public void setPriority( java.util.List<CodeableConceptModel> value) {
    this.priority = value;
  }
  public java.util.List<CodeableConceptModel> getStart() {
    return this.start;
  }
  public void setStart( java.util.List<CodeableConceptModel> value) {
    this.start = value;
  }
  public java.util.List<CodeableConceptModel> getAddresses() {
    return this.addresses;
  }
  public void setAddresses( java.util.List<CodeableConceptModel> value) {
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PlanDefinitionGoalModel]:" + "\n");
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PlanDefinitionGoalModel]:" + "\n");
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}