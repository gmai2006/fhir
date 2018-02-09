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
import com.google.gson.GsonBuilder;

/**
* "A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification."
*/
public class TestScriptVariable  {
  /**
  * Description: "Descriptive name for this variable."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "A default, hard-coded, or user-defined value for this variable."
  */
  private String defaultValue;

  /**
  * Description: "Extensions for defaultValue"
  */
  private transient Element _defaultValue;

  /**
  * Description: "A free text natural language description of the variable and its purpose."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "The fluentpath expression to evaluate against the fixture body. When variables are defined, only one of either expression, headerField or path must be specified."
  */
  private String expression;

  /**
  * Description: "Extensions for expression"
  */
  private transient Element _expression;

  /**
  * Description: "Will be used to grab the HTTP header field value from the headers that sourceId is pointing to."
  */
  private String headerField;

  /**
  * Description: "Extensions for headerField"
  */
  private transient Element _headerField;

  /**
  * Description: "Displayable text string with hint help information to the user when entering a default value."
  */
  private String hint;

  /**
  * Description: "Extensions for hint"
  */
  private transient Element _hint;

  /**
  * Description: "XPath or JSONPath to evaluate against the fixture body.  When variables are defined, only one of either expression, headerField or path must be specified."
  */
  private String path;

  /**
  * Description: "Extensions for path"
  */
  private transient Element _path;

  /**
  * Description: "Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String sourceId;

  /**
  * Description: "Extensions for sourceId"
  */
  private transient Element _sourceId;

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

  public TestScriptVariable() {}

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
  }
  public void setDefaultValue( String value) {
    this.defaultValue = value;
  }
  public String getDefaultValue() {
    return this.defaultValue;
  }
  public void set_defaultValue( Element value) {
    this._defaultValue = value;
  }
  public Element get_defaultValue() {
    return this._defaultValue;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setExpression( String value) {
    this.expression = value;
  }
  public String getExpression() {
    return this.expression;
  }
  public void set_expression( Element value) {
    this._expression = value;
  }
  public Element get_expression() {
    return this._expression;
  }
  public void setHeaderField( String value) {
    this.headerField = value;
  }
  public String getHeaderField() {
    return this.headerField;
  }
  public void set_headerField( Element value) {
    this._headerField = value;
  }
  public Element get_headerField() {
    return this._headerField;
  }
  public void setHint( String value) {
    this.hint = value;
  }
  public String getHint() {
    return this.hint;
  }
  public void set_hint( Element value) {
    this._hint = value;
  }
  public Element get_hint() {
    return this._hint;
  }
  public void setPath( String value) {
    this.path = value;
  }
  public String getPath() {
    return this.path;
  }
  public void set_path( Element value) {
    this._path = value;
  }
  public Element get_path() {
    return this._path;
  }
  public void setSourceId( String value) {
    this.sourceId = value;
  }
  public String getSourceId() {
    return this.sourceId;
  }
  public void set_sourceId( Element value) {
    this._sourceId = value;
  }
  public Element get_sourceId() {
    return this._sourceId;
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
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("defaultValue" + "[" + String.valueOf(this.defaultValue) + "]\n"); 
     builder.append("_defaultValue" + "[" + String.valueOf(this._defaultValue) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("expression" + "[" + String.valueOf(this.expression) + "]\n"); 
     builder.append("_expression" + "[" + String.valueOf(this._expression) + "]\n"); 
     builder.append("headerField" + "[" + String.valueOf(this.headerField) + "]\n"); 
     builder.append("_headerField" + "[" + String.valueOf(this._headerField) + "]\n"); 
     builder.append("hint" + "[" + String.valueOf(this.hint) + "]\n"); 
     builder.append("_hint" + "[" + String.valueOf(this._hint) + "]\n"); 
     builder.append("path" + "[" + String.valueOf(this.path) + "]\n"); 
     builder.append("_path" + "[" + String.valueOf(this._path) + "]\n"); 
     builder.append("sourceId" + "[" + String.valueOf(this.sourceId) + "]\n"); 
     builder.append("_sourceId" + "[" + String.valueOf(this._sourceId) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static TestScriptVariable fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, TestScriptVariable.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(TestScriptVariable o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<TestScriptVariable> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

}