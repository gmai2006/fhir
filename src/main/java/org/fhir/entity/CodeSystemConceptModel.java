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
* "A code system resource specifies a set of codes drawn from one or more code systems."
*/
@Entity
@Table(name="codesystemconcept")
public class CodeSystemConceptModel  {
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
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<CodeSystemDesignationModel> designation = new java.util.ArrayList<>();

  /**
  * Description: "A property value for this concept."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<CodeSystemProperty1Model> property = new java.util.ArrayList<>();

  /**
  * Description: "Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<CodeSystemConceptModel> concept = new java.util.ArrayList<>();

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

  public CodeSystemConceptModel() {
  }

  public CodeSystemConceptModel(CodeSystemConcept o) {
    this.id = o.getId();
      this.code = o.getCode();

      this.display = o.getDisplay();

      this.definition = o.getDefinition();

      this.designation = CodeSystemDesignation.toModelArray(o.getDesignation());

      this.property = CodeSystemProperty1.toModelArray(o.getProperty());

      this.concept = CodeSystemConcept.toModelArray(o.getConcept());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setDisplay( String value) {
    this.display = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void setDefinition( String value) {
    this.definition = value;
  }
  public String getDefinition() {
    return this.definition;
  }
  public void setDesignation( java.util.List<CodeSystemDesignationModel> value) {
    this.designation = value;
  }
  public java.util.List<CodeSystemDesignationModel> getDesignation() {
    return this.designation;
  }
  public void setProperty( java.util.List<CodeSystemProperty1Model> value) {
    this.property = value;
  }
  public java.util.List<CodeSystemProperty1Model> getProperty() {
    return this.property;
  }
  public void setConcept( java.util.List<CodeSystemConceptModel> value) {
    this.concept = value;
  }
  public java.util.List<CodeSystemConceptModel> getConcept() {
    return this.concept;
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
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("display" + "[" + String.valueOf(this.display) + "]\n"); 
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("designation" + "[" + String.valueOf(this.designation) + "]\n"); 
     builder.append("property" + "[" + String.valueOf(this.property) + "]\n"); 
     builder.append("concept" + "[" + String.valueOf(this.concept) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}