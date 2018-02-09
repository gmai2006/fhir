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
import org.fhir.entity.ValueSetContainsModel;
import com.google.gson.GsonBuilder;

/**
* "A value set specifies a set of codes drawn from one or more code systems."
*/
public class ValueSetContains  {
  /**
  * Description: "An absolute URI which is the code system in which the code for this item in the expansion is defined."
  */
  private String system;

  /**
  * Description: "Extensions for system"
  */
  private transient Element _system;

  /**
  * Description: "If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value."
  */
  private Boolean FHIRabstract;

  /**
  * Description: "Extensions for abstract"
  */
  private transient Element _abstract;

  /**
  * Description: "If the concept is inactive in the code system that defines it. Inactive codes are those that are no longer to be used, but are maintained by the code system for understanding legacy data."
  */
  private Boolean inactive;

  /**
  * Description: "Extensions for inactive"
  */
  private transient Element _inactive;

  /**
  * Description: "The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence."
  */
  private String version;

  /**
  * Description: "Extensions for version"
  */
  private transient Element _version;

  /**
  * Description: "The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String code;

  /**
  * Description: "Extensions for code"
  */
  private transient Element _code;

  /**
  * Description: "The recommended display for this item in the expansion."
  */
  private String display;

  /**
  * Description: "Extensions for display"
  */
  private transient Element _display;

  /**
  * Description: "Additional representations for this item - other languages, aliases, specialized purposes, used for particular purposes, etc. These are relevant when the conditions of the expansion do not fix to a single correct representation."
  */
  private java.util.List<ValueSetDesignation> designation = new java.util.ArrayList<>();

  /**
  * Description: "Other codes and entries contained under this entry in the hierarchy."
  */
  private java.util.List<ValueSetContains> contains = new java.util.ArrayList<>();

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

  public ValueSetContains() {
  }

  public ValueSetContains(ValueSetContainsModel o) {
    this.id = o.getId();
      if (null != o.getSystem()) {
        this.system = new String(o.getSystem());
      }

      if (null != o.getFHIRabstract()) {
        this.FHIRabstract = new Boolean(o.getFHIRabstract());
      }

      if (null != o.getInactive()) {
        this.inactive = new Boolean(o.getInactive());
      }

      if (null != o.getVersion()) {
        this.version = new String(o.getVersion());
      }

      if (null != o.getCode()) {
        this.code = new String(o.getCode());
      }

      if (null != o.getDisplay()) {
        this.display = new String(o.getDisplay());
      }

      this.designation = ValueSetDesignation.fromArray(o.getDesignation());

      this.contains = ValueSetContains.fromArray(o.getContains());

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
  public void setFHIRabstract( Boolean value) {
    this.FHIRabstract = value;
  }
  public Boolean getFHIRabstract() {
    return this.FHIRabstract;
  }
  public void set_abstract( Element value) {
    this._abstract = value;
  }
  public Element get_abstract() {
    return this._abstract;
  }
  public void setInactive( Boolean value) {
    this.inactive = value;
  }
  public Boolean getInactive() {
    return this.inactive;
  }
  public void set_inactive( Element value) {
    this._inactive = value;
  }
  public Element get_inactive() {
    return this._inactive;
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
  public void setDesignation( java.util.List<ValueSetDesignation> value) {
    this.designation = value;
  }
  public java.util.List<ValueSetDesignation> getDesignation() {
    return this.designation;
  }
  public void setContains( java.util.List<ValueSetContains> value) {
    this.contains = value;
  }
  public java.util.List<ValueSetContains> getContains() {
    return this.contains;
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
     builder.append("FHIRabstract" + "[" + String.valueOf(this.FHIRabstract) + "]\n"); 
     builder.append("_abstract" + "[" + String.valueOf(this._abstract) + "]\n"); 
     builder.append("inactive" + "[" + String.valueOf(this.inactive) + "]\n"); 
     builder.append("_inactive" + "[" + String.valueOf(this._inactive) + "]\n"); 
     builder.append("version" + "[" + String.valueOf(this.version) + "]\n"); 
     builder.append("_version" + "[" + String.valueOf(this._version) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("_code" + "[" + String.valueOf(this._code) + "]\n"); 
     builder.append("display" + "[" + String.valueOf(this.display) + "]\n"); 
     builder.append("_display" + "[" + String.valueOf(this._display) + "]\n"); 
     builder.append("designation" + "[" + String.valueOf(this.designation) + "]\n"); 
     builder.append("contains" + "[" + String.valueOf(this.contains) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ValueSetContains> fromArray(java.util.List<ValueSetContainsModel> list) {
    return (java.util.List<ValueSetContains>)list.stream()
      .map(model -> new ValueSetContains(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ValueSetContainsModel> toModelArray(java.util.List<ValueSetContains> list) {
    return (java.util.List<ValueSetContainsModel>)list.stream()
      .map(model -> new ValueSetContainsModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ValueSetContains fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ValueSetContains.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ValueSetContains o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ValueSetContains> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}