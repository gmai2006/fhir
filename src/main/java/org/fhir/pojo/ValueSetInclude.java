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
import org.fhir.entity.ValueSetIncludeModel;
import com.google.gson.GsonBuilder;

/**
* "A value set specifies a set of codes drawn from one or more code systems."
*/
public class ValueSetInclude  {
  /**
  * Description: "An absolute URI which is the code system from which the selected codes come from."
  */
  private String system;

  /**
  * Description: "Extensions for system"
  */
  private transient Element _system;

  /**
  * Description: "The version of the code system that the codes are selected from."
  */
  private String version;

  /**
  * Description: "Extensions for version"
  */
  private transient Element _version;

  /**
  * Description: "Specifies a concept to be included or excluded."
  */
  private java.util.List<ValueSetConcept> concept = new java.util.ArrayList<>();

  /**
  * Description: "Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true."
  */
  private java.util.List<ValueSetFilter> filter = new java.util.ArrayList<>();

  /**
  * Description: "Selects concepts found in this value set. This is an absolute URI that is a reference to ValueSet.url."
  */
  private java.util.List<String> valueSet = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for valueSet"
  */
  private transient java.util.List<Element> _valueSet = new java.util.ArrayList<>();

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

  public ValueSetInclude() {
  }

  public ValueSetInclude(ValueSetIncludeModel o) {
    this.id = o.getId();
      if (null != o.getSystem()) {
        this.system = new String(o.getSystem());
      }

      if (null != o.getVersion()) {
        this.version = new String(o.getVersion());
      }

      this.concept = ValueSetConcept.fromArray(o.getConcept());

      this.filter = ValueSetFilter.fromArray(o.getFilter());

      this.valueSet = org.fhir.utils.JsonUtils.json2Array(o.getValueSet());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setSystem( String value) {
    this.system = value;
  }
  public String getSystem() {
    return this.system;
  }
  public void set_system( Element value) {
    this._system = value;
  }
  public Element get_system() {
    return this._system;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void set_version( Element value) {
    this._version = value;
  }
  public Element get_version() {
    return this._version;
  }
  public void setConcept( java.util.List<ValueSetConcept> value) {
    this.concept = value;
  }
  public java.util.List<ValueSetConcept> getConcept() {
    return this.concept;
  }
  public void setFilter( java.util.List<ValueSetFilter> value) {
    this.filter = value;
  }
  public java.util.List<ValueSetFilter> getFilter() {
    return this.filter;
  }
  public void setValueSet( java.util.List<String> value) {
    this.valueSet = value;
  }
  public java.util.List<String> getValueSet() {
    return this.valueSet;
  }
  public void set_valueSet( java.util.List<Element> value) {
    this._valueSet = value;
  }
  public java.util.List<Element> get_valueSet() {
    return this._valueSet;
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
     builder.append("system" + "[" + String.valueOf(this.system) + "]\n"); 
     builder.append("_system" + "[" + String.valueOf(this._system) + "]\n"); 
     builder.append("version" + "[" + String.valueOf(this.version) + "]\n"); 
     builder.append("_version" + "[" + String.valueOf(this._version) + "]\n"); 
     builder.append("concept" + "[" + String.valueOf(this.concept) + "]\n"); 
     builder.append("filter" + "[" + String.valueOf(this.filter) + "]\n"); 
     builder.append("valueSet" + "[" + String.valueOf(this.valueSet) + "]\n"); 
     builder.append("_valueSet" + "[" + String.valueOf(this._valueSet) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ValueSetInclude> fromArray(java.util.List<ValueSetIncludeModel> list) {
    return (java.util.List<ValueSetInclude>)list.stream()
      .map(model -> new ValueSetInclude(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ValueSetIncludeModel> toModelArray(java.util.List<ValueSetInclude> list) {
    return (java.util.List<ValueSetIncludeModel>)list.stream()
      .map(model -> new ValueSetIncludeModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ValueSetInclude fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ValueSetInclude.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ValueSetInclude o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ValueSetInclude> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}