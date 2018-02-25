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
import com.fasterxml.jackson.annotation.JsonInclude;
/**
* "A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestScriptVariable  extends BackboneElement  {
  /**
  * Description: "Descriptive name for this variable."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "A default, hard-coded, or user-defined value for this variable."
  */
  protected String defaultValue;

  /**
  * Description: "Extensions for defaultValue"
  */
  protected transient Element _defaultValue;

  /**
  * Description: "A free text natural language description of the variable and its purpose."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "The fluentpath expression to evaluate against the fixture body. When variables are defined, only one of either expression, headerField or path must be specified."
  */
  protected String expression;

  /**
  * Description: "Extensions for expression"
  */
  protected transient Element _expression;

  /**
  * Description: "Will be used to grab the HTTP header field value from the headers that sourceId is pointing to."
  */
  protected String headerField;

  /**
  * Description: "Extensions for headerField"
  */
  protected transient Element _headerField;

  /**
  * Description: "Displayable text string with hint help information to the user when entering a default value."
  */
  protected String hint;

  /**
  * Description: "Extensions for hint"
  */
  protected transient Element _hint;

  /**
  * Description: "XPath or JSONPath to evaluate against the fixture body.  When variables are defined, only one of either expression, headerField or path must be specified."
  */
  protected String path;

  /**
  * Description: "Extensions for path"
  */
  protected transient Element _path;

  /**
  * Description: "Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String sourceId;

  /**
  * Description: "Extensions for sourceId"
  */
  protected transient Element _sourceId;

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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestScriptVariable]:" + "\n");
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.defaultValue != null) builder.append("defaultValue" + "->" + this.defaultValue.toString() + "\n"); 
     if(this._defaultValue != null) builder.append("_defaultValue" + "->" + this._defaultValue.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.expression != null) builder.append("expression" + "->" + this.expression.toString() + "\n"); 
     if(this._expression != null) builder.append("_expression" + "->" + this._expression.toString() + "\n"); 
     if(this.headerField != null) builder.append("headerField" + "->" + this.headerField.toString() + "\n"); 
     if(this._headerField != null) builder.append("_headerField" + "->" + this._headerField.toString() + "\n"); 
     if(this.hint != null) builder.append("hint" + "->" + this.hint.toString() + "\n"); 
     if(this._hint != null) builder.append("_hint" + "->" + this._hint.toString() + "\n"); 
     if(this.path != null) builder.append("path" + "->" + this.path.toString() + "\n"); 
     if(this._path != null) builder.append("_path" + "->" + this._path.toString() + "\n"); 
     if(this.sourceId != null) builder.append("sourceId" + "->" + this.sourceId.toString() + "\n"); 
     if(this._sourceId != null) builder.append("_sourceId" + "->" + this._sourceId.toString() + "\n"); ;
    return builder.toString();
  }

}