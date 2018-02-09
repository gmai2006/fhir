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
import org.fhir.entity.CodeSystemFilterModel;
import com.google.gson.GsonBuilder;

/**
* "A code system resource specifies a set of codes drawn from one or more code systems."
*/
public class CodeSystemFilter  {
  /**
  * Description: "The code that identifies this filter when it is used in the instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String code;

  /**
  * Description: "Extensions for code"
  */
  private transient Element _code;

  /**
  * Description: "A description of how or why the filter is used."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "A list of operators that can be used with the filter."
  */
  private java.util.List<String> operator = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for operator"
  */
  private transient java.util.List<Element> _operator = new java.util.ArrayList<>();

  /**
  * Description: "A description of what the value for the filter should be."
  */
  private String value;

  /**
  * Description: "Extensions for value"
  */
  private transient Element _value;

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

  public CodeSystemFilter() {
  }

  public CodeSystemFilter(CodeSystemFilterModel o) {
    this.id = o.getId();
      if (null != o.getCode()) {
        this.code = new String(o.getCode());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.operator = org.fhir.utils.JsonUtils.json2Array(o.getOperator());

      if (null != o.getValue()) {
        this.value = new String(o.getValue());
      }

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
  public void setOperator( java.util.List<String> value) {
    this.operator = value;
  }
  public java.util.List<String> getOperator() {
    return this.operator;
  }
  public void set_operator( java.util.List<Element> value) {
    this._operator = value;
  }
  public java.util.List<Element> get_operator() {
    return this._operator;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void set_value( Element value) {
    this._value = value;
  }
  public Element get_value() {
    return this._value;
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
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("operator" + "[" + String.valueOf(this.operator) + "]\n"); 
     builder.append("_operator" + "[" + String.valueOf(this._operator) + "]\n"); 
     builder.append("value" + "[" + String.valueOf(this.value) + "]\n"); 
     builder.append("_value" + "[" + String.valueOf(this._value) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<CodeSystemFilter> fromArray(java.util.List<CodeSystemFilterModel> list) {
    return (java.util.List<CodeSystemFilter>)list.stream()
      .map(model -> new CodeSystemFilter(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CodeSystemFilterModel> toModelArray(java.util.List<CodeSystemFilter> list) {
    return (java.util.List<CodeSystemFilterModel>)list.stream()
      .map(model -> new CodeSystemFilterModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CodeSystemFilter fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CodeSystemFilter.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CodeSystemFilter o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CodeSystemFilter> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}