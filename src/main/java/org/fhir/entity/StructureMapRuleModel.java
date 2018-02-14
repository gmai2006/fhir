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
* "A Map of relationships between 2 structures that can be used to transform data."
*/
@Entity
@Table(name="structuremaprule")
public class StructureMapRuleModel  implements Serializable {
	private static final long serialVersionUID = 151857669692432201L;
  /**
  * Description: "Name of the rule for internal references."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "Source inputs to the mapping."
  */
  @javax.persistence.Basic
  @Column(name="\"source_id\"")
  private String source_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="source_id", insertable=false, updatable=false)
  private java.util.List<StructureMapSourceModel> source;

  /**
  * Description: "Content to create because of this mapping rule."
  */
  @javax.persistence.Basic
  @Column(name="\"target_id\"")
  private String target_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="target_id", insertable=false, updatable=false)
  private java.util.List<StructureMapTargetModel> target;

  /**
  * Description: "Rules contained in this rule."
  */
  @javax.persistence.Basic
  @Column(name="\"rule_id\"")
  private String rule_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="rule_id", insertable=false, updatable=false)
  private java.util.List<StructureMapRuleModel> rule;

  /**
  * Description: "Which other rules to apply in the context of this rule."
  */
  @javax.persistence.Basic
  @Column(name="\"dependent_id\"")
  private String dependent_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="dependent_id", insertable=false, updatable=false)
  private java.util.List<StructureMapDependentModel> dependent;

  /**
  * Description: "Documentation for this instance of data."
  */
  @javax.persistence.Basic
  @Column(name="\"documentation\"")
  private String documentation;

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

  public StructureMapRuleModel() {
  }

  public StructureMapRuleModel(StructureMapRule o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.name = o.getName();
    if (null != o.getSource() && !o.getSource().isEmpty()) {
    	this.source_id = "source" + this.parent_id;
    	this.source = StructureMapSourceHelper.toModelFromArray(o.getSource(), this.source_id);
    }
    if (null != o.getTarget() && !o.getTarget().isEmpty()) {
    	this.target_id = "target" + this.parent_id;
    	this.target = StructureMapTargetHelper.toModelFromArray(o.getTarget(), this.target_id);
    }
    if (null != o.getRule() && !o.getRule().isEmpty()) {
    	this.rule_id = "rule" + this.parent_id;
    	this.rule = StructureMapRuleHelper.toModelFromArray(o.getRule(), this.rule_id);
    }
    if (null != o.getDependent() && !o.getDependent().isEmpty()) {
    	this.dependent_id = "dependent" + this.parent_id;
    	this.dependent = StructureMapDependentHelper.toModelFromArray(o.getDependent(), this.dependent_id);
    }
    this.documentation = o.getDocumentation();
  }

  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public java.util.List<StructureMapSourceModel> getSource() {
    return this.source;
  }
  public void setSource( java.util.List<StructureMapSourceModel> value) {
    this.source = value;
  }
  public java.util.List<StructureMapTargetModel> getTarget() {
    return this.target;
  }
  public void setTarget( java.util.List<StructureMapTargetModel> value) {
    this.target = value;
  }
  public java.util.List<StructureMapRuleModel> getRule() {
    return this.rule;
  }
  public void setRule( java.util.List<StructureMapRuleModel> value) {
    this.rule = value;
  }
  public java.util.List<StructureMapDependentModel> getDependent() {
    return this.dependent;
  }
  public void setDependent( java.util.List<StructureMapDependentModel> value) {
    this.dependent = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
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
    builder.append("[StructureMapRuleModel]:" + "\n");
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[StructureMapRuleModel]:" + "\n");
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("source" + "->" + this.source + "\n"); 
     builder.append("target" + "->" + this.target + "\n"); 
     builder.append("rule" + "->" + this.rule + "\n"); 
     builder.append("dependent" + "->" + this.dependent + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}