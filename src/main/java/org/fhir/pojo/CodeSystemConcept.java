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

package org.fhir.pojo;
import org.fhir.entity.CodeSystemConceptModel;
import com.google.gson.GsonBuilder;

/**
* "A code system resource specifies a set of codes drawn from one or more code systems."
*/
public class CodeSystemConcept  {
  /**
  * Description: "A code - a text symbol - that uniquely identifies the concept within the code system."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String code;

  /**
  * Description: "Extensions for code"
  */
  private transient Element _code;

  /**
  * Description: "A human readable string that is the recommended default way to present this concept to a user."
  */
  private String display;

  /**
  * Description: "Extensions for display"
  */
  private transient Element _display;

  /**
  * Description: "The formal definition of the concept. The code system resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept."
  */
  private String definition;

  /**
  * Description: "Extensions for definition"
  */
  private transient Element _definition;

  /**
  * Description: "Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc."
  */
  private java.util.List<CodeSystemDesignation> designation = new java.util.ArrayList<>();

  /**
  * Description: "A property value for this concept."
  */
  private java.util.List<CodeSystemProperty1> property = new java.util.ArrayList<>();

  /**
  * Description: "Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning."
  */
  private java.util.List<CodeSystemConcept> concept = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public CodeSystemConcept() {
  }

  public CodeSystemConcept(CodeSystemConceptModel o) {
    this.id = o.getId();
      if (null != o.getCode()) {
        this.code = new String(o.getCode());
      }

      if (null != o.getDisplay()) {
        this.display = new String(o.getDisplay());
      }

      if (null != o.getDefinition()) {
        this.definition = new String(o.getDefinition());
      }

      this.designation = CodeSystemDesignation.fromArray(o.getDesignation());

      this.property = CodeSystemProperty1.fromArray(o.getProperty());

      this.concept = CodeSystemConcept.fromArray(o.getConcept());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void set_code( Element value) {
    this._code = value;
  }
  public Element get_code() {
    return this._code;
  }
  public void setDisplay( String value) {
    this.display = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void set_display( Element value) {
    this._display = value;
  }
  public Element get_display() {
    return this._display;
  }
  public void setDefinition( String value) {
    this.definition = value;
  }
  public String getDefinition() {
    return this.definition;
  }
  public void set_definition( Element value) {
    this._definition = value;
  }
  public Element get_definition() {
    return this._definition;
  }
  public void setDesignation( java.util.List<CodeSystemDesignation> value) {
    this.designation = value;
  }
  public java.util.List<CodeSystemDesignation> getDesignation() {
    return this.designation;
  }
  public void setProperty( java.util.List<CodeSystemProperty1> value) {
    this.property = value;
  }
  public java.util.List<CodeSystemProperty1> getProperty() {
    return this.property;
  }
  public void setConcept( java.util.List<CodeSystemConcept> value) {
    this.concept = value;
  }
  public java.util.List<CodeSystemConcept> getConcept() {
    return this.concept;
  }
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("_code" + "[" + String.valueOf(this._code) + "]\n"); 
     builder.append("display" + "[" + String.valueOf(this.display) + "]\n"); 
     builder.append("_display" + "[" + String.valueOf(this._display) + "]\n"); 
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("_definition" + "[" + String.valueOf(this._definition) + "]\n"); 
     builder.append("designation" + "[" + String.valueOf(this.designation) + "]\n"); 
     builder.append("property" + "[" + String.valueOf(this.property) + "]\n"); 
     builder.append("concept" + "[" + String.valueOf(this.concept) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<CodeSystemConcept> fromArray(java.util.List<CodeSystemConceptModel> list) {
    return (java.util.List<CodeSystemConcept>)list.stream()
      .map(model -> new CodeSystemConcept(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CodeSystemConceptModel> toModelArray(java.util.List<CodeSystemConcept> list) {
    return (java.util.List<CodeSystemConceptModel>)list.stream()
      .map(model -> new CodeSystemConceptModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CodeSystemConcept fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CodeSystemConcept.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CodeSystemConcept o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CodeSystemConcept> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}