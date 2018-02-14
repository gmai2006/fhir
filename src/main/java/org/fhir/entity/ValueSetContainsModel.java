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
* "A value set specifies a set of codes drawn from one or more code systems."
*/
@Entity
@Table(name="valuesetcontains")
public class ValueSetContainsModel  implements Serializable {
	private static final long serialVersionUID = 151857669700884956L;
  /**
  * Description: "An absolute URI which is the code system in which the code for this item in the expansion is defined."
  */
  @javax.persistence.Basic
  @Column(name="\"system\"")
  private String system;

  /**
  * Description: "If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value."
  */
  @javax.persistence.Basic
  @Column(name="\"FHIRabstract\"")
  private Boolean FHIRabstract;

  /**
  * Description: "If the concept is inactive in the code system that defines it. Inactive codes are those that are no longer to be used, but are maintained by the code system for understanding legacy data."
  */
  @javax.persistence.Basic
  @Column(name="\"inactive\"")
  private Boolean inactive;

  /**
  * Description: "The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence."
  */
  @javax.persistence.Basic
  @Column(name="\"version\"")
  private String version;

  /**
  * Description: "The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"code\"")
  private String code;

  /**
  * Description: "The recommended display for this item in the expansion."
  */
  @javax.persistence.Basic
  @Column(name="\"display\"")
  private String display;

  /**
  * Description: "Additional representations for this item - other languages, aliases, specialized purposes, used for particular purposes, etc. These are relevant when the conditions of the expansion do not fix to a single correct representation."
  */
  @javax.persistence.Basic
  @Column(name="\"designation_id\"")
  private String designation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="designation_id", insertable=false, updatable=false)
  private java.util.List<ValueSetDesignationModel> designation;

  /**
  * Description: "Other codes and entries contained under this entry in the hierarchy."
  */
  @javax.persistence.Basic
  @Column(name="\"contains_id\"")
  private String contains_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="contains_id", insertable=false, updatable=false)
  private java.util.List<ValueSetContainsModel> contains;

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

  public ValueSetContainsModel() {
  }

  public ValueSetContainsModel(ValueSetContains o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.system = o.getSystem();
    this.FHIRabstract = o.getFHIRabstract();
    this.inactive = o.getInactive();
    this.version = o.getVersion();
    this.code = o.getCode();
    this.display = o.getDisplay();
    if (null != o.getDesignation() && !o.getDesignation().isEmpty()) {
    	this.designation_id = "designation" + this.parent_id;
    	this.designation = ValueSetDesignationHelper.toModelFromArray(o.getDesignation(), this.designation_id);
    }
    if (null != o.getContains() && !o.getContains().isEmpty()) {
    	this.contains_id = "contains" + this.parent_id;
    	this.contains = ValueSetContainsHelper.toModelFromArray(o.getContains(), this.contains_id);
    }
  }

  public String getSystem() {
    return this.system;
  }
  public void setSystem( String value) {
    this.system = value;
  }
  public Boolean getFHIRabstract() {
    return this.FHIRabstract;
  }
  public void setFHIRabstract( Boolean value) {
    this.FHIRabstract = value;
  }
  public Boolean getInactive() {
    return this.inactive;
  }
  public void setInactive( Boolean value) {
    this.inactive = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void setDisplay( String value) {
    this.display = value;
  }
  public java.util.List<ValueSetDesignationModel> getDesignation() {
    return this.designation;
  }
  public void setDesignation( java.util.List<ValueSetDesignationModel> value) {
    this.designation = value;
  }
  public java.util.List<ValueSetContainsModel> getContains() {
    return this.contains;
  }
  public void setContains( java.util.List<ValueSetContainsModel> value) {
    this.contains = value;
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
    builder.append("[ValueSetContainsModel]:" + "\n");
     builder.append("system" + "->" + this.system + "\n"); 
     builder.append("FHIRabstract" + "->" + this.FHIRabstract + "\n"); 
     builder.append("inactive" + "->" + this.inactive + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("display" + "->" + this.display + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ValueSetContainsModel]:" + "\n");
     builder.append("system" + "->" + this.system + "\n"); 
     builder.append("FHIRabstract" + "->" + this.FHIRabstract + "\n"); 
     builder.append("inactive" + "->" + this.inactive + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("display" + "->" + this.display + "\n"); 
     builder.append("designation" + "->" + this.designation + "\n"); 
     builder.append("contains" + "->" + this.contains + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}