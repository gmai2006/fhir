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
import org.fhir.entity.RequestGroupConditionModel;
import com.google.gson.GsonBuilder;

/**
* "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
*/
public class RequestGroupCondition  {
  /**
  * Description: "The kind of condition."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String kind;

  /**
  * Description: "Extensions for kind"
  */
  private transient Element _kind;

  /**
  * Description: "A brief, natural language description of the condition that effectively communicates the intended semantics."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "The media type of the language for the expression."
  */
  private String language;

  /**
  * Description: "Extensions for language"
  */
  private transient Element _language;

  /**
  * Description: "An expression that returns true or false, indicating whether or not the condition is satisfied."
  */
  private String expression;

  /**
  * Description: "Extensions for expression"
  */
  private transient Element _expression;

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

  public RequestGroupCondition() {
  }

  public RequestGroupCondition(RequestGroupConditionModel o) {
    this.id = o.getId();
      if (null != o.getKind()) {
        this.kind = new String(o.getKind());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
      }

      if (null != o.getExpression()) {
        this.expression = new String(o.getExpression());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setKind( String value) {
    this.kind = value;
  }
  public String getKind() {
    return this.kind;
  }
  public void set_kind( Element value) {
    this._kind = value;
  }
  public Element get_kind() {
    return this._kind;
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
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
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
     builder.append("kind" + "[" + String.valueOf(this.kind) + "]\n"); 
     builder.append("_kind" + "[" + String.valueOf(this._kind) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); 
     builder.append("expression" + "[" + String.valueOf(this.expression) + "]\n"); 
     builder.append("_expression" + "[" + String.valueOf(this._expression) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<RequestGroupCondition> fromArray(java.util.List<RequestGroupConditionModel> list) {
    return (java.util.List<RequestGroupCondition>)list.stream()
      .map(model -> new RequestGroupCondition(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<RequestGroupConditionModel> toModelArray(java.util.List<RequestGroupCondition> list) {
    return (java.util.List<RequestGroupConditionModel>)list.stream()
      .map(model -> new RequestGroupConditionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static RequestGroupCondition fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, RequestGroupCondition.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(RequestGroupCondition o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<RequestGroupCondition> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}