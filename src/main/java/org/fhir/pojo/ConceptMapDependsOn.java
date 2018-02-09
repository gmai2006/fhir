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
import org.fhir.entity.ConceptMapDependsOnModel;
import com.google.gson.GsonBuilder;

/**
* "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
*/
public class ConceptMapDependsOn  {
  /**
  * Description: "A reference to an element that holds a coded value that corresponds to a code system property. The idea is that the information model carries an element somwhere that is labeled to correspond with a code system property."
  */
  private String property;

  /**
  * Description: "Extensions for property"
  */
  private transient Element _property;

  /**
  * Description: "An absolute URI that identifies the code system of the dependency code (if the source/dependency is a value set that crosses code systems)."
  */
  private String system;

  /**
  * Description: "Extensions for system"
  */
  private transient Element _system;

  /**
  * Description: "Identity (code or path) or the element/item/ValueSet that the map depends on / refers to."
  */
  private String code;

  /**
  * Description: "Extensions for code"
  */
  private transient Element _code;

  /**
  * Description: "The display for the code. The display is only provided to help editors when editing the concept map."
  */
  private String display;

  /**
  * Description: "Extensions for display"
  */
  private transient Element _display;

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

  public ConceptMapDependsOn() {
  }

  public ConceptMapDependsOn(ConceptMapDependsOnModel o) {
    this.id = o.getId();
      if (null != o.getProperty()) {
        this.property = new String(o.getProperty());
      }

      if (null != o.getSystem()) {
        this.system = new String(o.getSystem());
      }

      if (null != o.getCode()) {
        this.code = new String(o.getCode());
      }

      if (null != o.getDisplay()) {
        this.display = new String(o.getDisplay());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setProperty( String value) {
    this.property = value;
  }
  public String getProperty() {
    return this.property;
  }
  public void set_property( Element value) {
    this._property = value;
  }
  public Element get_property() {
    return this._property;
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
     builder.append("property" + "[" + String.valueOf(this.property) + "]\n"); 
     builder.append("_property" + "[" + String.valueOf(this._property) + "]\n"); 
     builder.append("system" + "[" + String.valueOf(this.system) + "]\n"); 
     builder.append("_system" + "[" + String.valueOf(this._system) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("_code" + "[" + String.valueOf(this._code) + "]\n"); 
     builder.append("display" + "[" + String.valueOf(this.display) + "]\n"); 
     builder.append("_display" + "[" + String.valueOf(this._display) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ConceptMapDependsOn> fromArray(java.util.List<ConceptMapDependsOnModel> list) {
    return (java.util.List<ConceptMapDependsOn>)list.stream()
      .map(model -> new ConceptMapDependsOn(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ConceptMapDependsOnModel> toModelArray(java.util.List<ConceptMapDependsOn> list) {
    return (java.util.List<ConceptMapDependsOnModel>)list.stream()
      .map(model -> new ConceptMapDependsOnModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ConceptMapDependsOn fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ConceptMapDependsOn.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ConceptMapDependsOn o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ConceptMapDependsOn> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}