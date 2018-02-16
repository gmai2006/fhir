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
* "A code system resource specifies a set of codes drawn from one or more code systems."
*/
@Entity
@Table(name="codesystemconcept")
public class CodeSystemConceptModel  implements Serializable {
	private static final long serialVersionUID = 151873631173988802L;
  /**
  * Description: "A code - a text symbol - that uniquely identifies the concept within the code system."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"code\"")
  private String code;

  /**
  * Description: "A human readable string that is the recommended default way to present this concept to a user."
  */
  @javax.persistence.Basic
  @Column(name="\"display\"")
  private String display;

  /**
  * Description: "The formal definition of the concept. The code system resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept."
  */
  @javax.persistence.Basic
  @Column(name="\"definition\"")
  private String definition;

  /**
  * Description: "Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"designation_id\"")
  private String designation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="designation_id", insertable=false, updatable=false)
  private java.util.List<CodeSystemDesignationModel> designation;

  /**
  * Description: "A property value for this concept."
  */
  @javax.persistence.Basic
  @Column(name="\"property_id\"")
  private String property_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="property_id", insertable=false, updatable=false)
  private java.util.List<CodeSystemProperty1Model> property;

  /**
  * Description: "Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning."
  */
  @javax.persistence.Basic
  @Column(name="\"concept_id\"")
  private String concept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="concept_id", insertable=false, updatable=false)
  private java.util.List<CodeSystemConceptModel> concept;

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

  public CodeSystemConceptModel() {
  }

  public CodeSystemConceptModel(CodeSystemConcept o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.code = o.getCode();
    this.display = o.getDisplay();
    this.definition = o.getDefinition();
    if (null != o.getDesignation() && !o.getDesignation().isEmpty()) {
    	this.designation_id = "designation" + this.parent_id;
    	this.designation = CodeSystemDesignationHelper.toModelFromArray(o.getDesignation(), this.designation_id);
    }
    if (null != o.getProperty() && !o.getProperty().isEmpty()) {
    	this.property_id = "property" + this.parent_id;
    	this.property = CodeSystemProperty1Helper.toModelFromArray(o.getProperty(), this.property_id);
    }
    if (null != o.getConcept() && !o.getConcept().isEmpty()) {
    	this.concept_id = "concept" + this.parent_id;
    	this.concept = CodeSystemConceptHelper.toModelFromArray(o.getConcept(), this.concept_id);
    }
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
  public String getDefinition() {
    return this.definition;
  }
  public void setDefinition( String value) {
    this.definition = value;
  }
  public java.util.List<CodeSystemDesignationModel> getDesignation() {
    return this.designation;
  }
  public void setDesignation( java.util.List<CodeSystemDesignationModel> value) {
    this.designation = value;
  }
  public java.util.List<CodeSystemProperty1Model> getProperty() {
    return this.property;
  }
  public void setProperty( java.util.List<CodeSystemProperty1Model> value) {
    this.property = value;
  }
  public java.util.List<CodeSystemConceptModel> getConcept() {
    return this.concept;
  }
  public void setConcept( java.util.List<CodeSystemConceptModel> value) {
    this.concept = value;
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
    builder.append("[CodeSystemConceptModel]:" + "\n");
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("display" + "->" + this.display + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CodeSystemConceptModel]:" + "\n");
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("display" + "->" + this.display + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("designation" + "->" + this.designation + "\n"); 
     builder.append("property" + "->" + this.property + "\n"); 
     builder.append("concept" + "->" + this.concept + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}