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
* "A technical identifier - identifies some entity uniquely and unambiguously."
*/
public class Identifier  {
  /**
  * Description: "The purpose of this identifier."
  */
  private String use;

  /**
  * Description: "Extensions for use"
  */
  private transient Element _use;

  /**
  * Description: "A coded type for the identifier that can be used to determine which identifier to use for a specific purpose."
  */
  private CodeableConcept type;

  /**
  * Description: "Establishes the namespace for the value - that is, a URL that describes a set values that are unique."
  */
  private String system;

  /**
  * Description: "Extensions for system"
  */
  private transient Element _system;

  /**
  * Description: "The portion of the identifier typically relevant to the user and which is unique within the context of the system."
  */
  private String value;

  /**
  * Description: "Extensions for value"
  */
  private transient Element _value;

  /**
  * Description: "Time period during which identifier is/was valid for use."
  */
  private Period period;

  /**
  * Description: "Organization that issued/manages the identifier."
  */
  private Reference assigner;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public Identifier() {}

  public void setUse( String value) {
    this.use = UseEnum.fromCode(value);
  }
  public String getUse() {
    return this.use;
  }
  public void set_use( Element value) {
    this._use = value;
  }
  public Element get_use() {
    return this._use;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
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
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setAssigner( Reference value) {
    this.assigner = value;
  }
  public Reference getAssigner() {
    return this.assigner;
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
     builder.append("use" + "[" + String.valueOf(this.use) + "]\n"); 
     builder.append("_use" + "[" + String.valueOf(this._use) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("system" + "[" + String.valueOf(this.system) + "]\n"); 
     builder.append("_system" + "[" + String.valueOf(this._system) + "]\n"); 
     builder.append("value" + "[" + String.valueOf(this.value) + "]\n"); 
     builder.append("_value" + "[" + String.valueOf(this._value) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("assigner" + "[" + String.valueOf(this.assigner) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static Identifier fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Identifier.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Identifier o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Identifier> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public enum UseEnum {
  	usual,
  	official,
  	temp,
  	secondary,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "usual" : { return usual.toString(); }
  			case "official" : { return official.toString(); }
  			case "temp" : { return temp.toString(); }
  			case "secondary" : { return secondary.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}