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
@Table(name="structuremaptarget")
public class StructureMapTargetModel  implements Serializable {
	private static final long serialVersionUID = 151873631137992220L;
  /**
  * Description: "Type or variable this rule applies to."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"context\"")
  private String context;

  /**
  * Description: "How to interpret the context."
  */
  @javax.persistence.Basic
  @Column(name="\"contextType\"")
  private String contextType;

  /**
  * Description: "Field to create in the context."
  */
  @javax.persistence.Basic
  @Column(name="\"element\"")
  private String element;

  /**
  * Description: "Named context for field, if desired, and a field is specified."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"variable\"")
  private String variable;

  /**
  * Description: "If field is a list, how to manage the list."
  */
  @javax.persistence.Basic
  @Column(name="\"listMode\"")
  private String listMode;

  /**
  * Description: "Internal rule reference for shared list items."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"listRuleId\"")
  private String listRuleId;

  /**
  * Description: "How the data is copied / created."
  */
  @javax.persistence.Basic
  @Column(name="\"transform\"")
  private String transform;

  /**
  * Description: "Parameters to the transform."
  */
  @javax.persistence.Basic
  @Column(name="\"parameter_id\"")
  private String parameter_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="parameter_id", insertable=false, updatable=false)
  private java.util.List<StructureMapParameterModel> parameter;

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

  public StructureMapTargetModel() {
  }

  public StructureMapTargetModel(StructureMapTarget o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.context = o.getContext();
    this.contextType = o.getContextType();
    this.element = o.getElement();
    this.variable = o.getVariable();
    this.listMode = org.fhir.utils.JsonUtils.write2String(o.getListMode());
    this.listRuleId = o.getListRuleId();
    this.transform = o.getTransform();
    if (null != o.getParameter() && !o.getParameter().isEmpty()) {
    	this.parameter_id = "parameter" + this.parent_id;
    	this.parameter = StructureMapParameterHelper.toModelFromArray(o.getParameter(), this.parameter_id);
    }
  }

  public String getContext() {
    return this.context;
  }
  public void setContext( String value) {
    this.context = value;
  }
  public String getContextType() {
    return this.contextType;
  }
  public void setContextType( String value) {
    this.contextType = value;
  }
  public String getElement() {
    return this.element;
  }
  public void setElement( String value) {
    this.element = value;
  }
  public String getVariable() {
    return this.variable;
  }
  public void setVariable( String value) {
    this.variable = value;
  }
  public String getListMode() {
    return this.listMode;
  }
  public void setListMode( String value) {
    this.listMode = value;
  }
  public String getListRuleId() {
    return this.listRuleId;
  }
  public void setListRuleId( String value) {
    this.listRuleId = value;
  }
  public String getTransform() {
    return this.transform;
  }
  public void setTransform( String value) {
    this.transform = value;
  }
  public java.util.List<StructureMapParameterModel> getParameter() {
    return this.parameter;
  }
  public void setParameter( java.util.List<StructureMapParameterModel> value) {
    this.parameter = value;
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
    builder.append("[StructureMapTargetModel]:" + "\n");
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("contextType" + "->" + this.contextType + "\n"); 
     builder.append("element" + "->" + this.element + "\n"); 
     builder.append("variable" + "->" + this.variable + "\n"); 
     builder.append("listMode" + "->" + this.listMode + "\n"); 
     builder.append("listRuleId" + "->" + this.listRuleId + "\n"); 
     builder.append("transform" + "->" + this.transform + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[StructureMapTargetModel]:" + "\n");
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("contextType" + "->" + this.contextType + "\n"); 
     builder.append("element" + "->" + this.element + "\n"); 
     builder.append("variable" + "->" + this.variable + "\n"); 
     builder.append("listMode" + "->" + this.listMode + "\n"); 
     builder.append("listRuleId" + "->" + this.listRuleId + "\n"); 
     builder.append("transform" + "->" + this.transform + "\n"); 
     builder.append("parameter" + "->" + this.parameter + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}