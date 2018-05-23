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
* "A Map of relationships between 2 structures that can be used to transform data."
*/
@Entity
@Table(name="structuremapgroup")
public class StructureMapGroupModel  implements Serializable {
	private static final long serialVersionUID = 151967883202987629L;
  /**
  * Description: "A unique name for the group for the convenience of human readers."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "Another group that this group adds rules to."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"FHIRextends\"")
  private String FHIRextends;

  /**
  * Description: "If this is the default rule set to apply for thie source type, or this combination of types."
  */
  @javax.persistence.Basic
  @Column(name="\"typeMode\"")
  private String typeMode;

  /**
  * Description: "Additional supporting documentation that explains the purpose of the group and the types of mappings within it."
  */
  @javax.persistence.Basic
  @Column(name="\"documentation\"")
  private String documentation;

  /**
  * Description: "A name assigned to an instance of data. The instance must be provided when the mapping is invoked."
  */
  @javax.persistence.Basic
  @Column(name="\"input_id\"")
  private String input_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="input_id", insertable=false, updatable=false)
  private java.util.List<StructureMapInputModel> input;

  /**
  * Description: "Transform Rule from source to target."
  */
  @javax.persistence.Basic
  @Column(name="\"rule_id\"")
  private String rule_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="rule_id", insertable=false, updatable=false)
  private java.util.List<StructureMapRuleModel> rule;

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

  public StructureMapGroupModel() {
  }

  public StructureMapGroupModel(StructureMapGroup o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.name = o.getName();
    this.FHIRextends = o.getFHIRextends();
    this.typeMode = o.getTypeMode();
    this.documentation = o.getDocumentation();
    if (null != o.getInput() && !o.getInput().isEmpty()) {
    	this.input_id = "input" + this.id;
    	this.input = StructureMapInputHelper.toModelFromArray(o.getInput(), this.input_id);
    }
    if (null != o.getRule() && !o.getRule().isEmpty()) {
    	this.rule_id = "rule" + this.id;
    	this.rule = StructureMapRuleHelper.toModelFromArray(o.getRule(), this.rule_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getFHIRextends() {
    return this.FHIRextends;
  }
  public void setFHIRextends( String value) {
    this.FHIRextends = value;
  }
  public String getTypeMode() {
    return this.typeMode;
  }
  public void setTypeMode( String value) {
    this.typeMode = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public java.util.List<StructureMapInputModel> getInput() {
    return this.input;
  }
  public void setInput( java.util.List<StructureMapInputModel> value) {
    this.input = value;
  }
  public java.util.List<StructureMapRuleModel> getRule() {
    return this.rule;
  }
  public void setRule( java.util.List<StructureMapRuleModel> value) {
    this.rule = value;
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
    builder.append("[StructureMapGroupModel]:" + "\n");
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("FHIRextends" + "->" + this.FHIRextends + "\n"); 
     builder.append("typeMode" + "->" + this.typeMode + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[StructureMapGroupModel]:" + "\n");
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("FHIRextends" + "->" + this.FHIRextends + "\n"); 
     builder.append("typeMode" + "->" + this.typeMode + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("input" + "->" + this.input + "\n"); 
     builder.append("rule" + "->" + this.rule + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}