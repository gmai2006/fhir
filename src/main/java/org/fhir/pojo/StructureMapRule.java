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
* "A Map of relationships between 2 structures that can be used to transform data."
*/
public class StructureMapRule  {
  /**
  * Description: "Name of the rule for internal references."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "Source inputs to the mapping."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<StructureMapSource> source = new java.util.ArrayList<>();

  /**
  * Description: "Content to create because of this mapping rule."
  */
  private java.util.List<StructureMapTarget> target = new java.util.ArrayList<>();

  /**
  * Description: "Rules contained in this rule."
  */
  private java.util.List<StructureMapRule> rule = new java.util.ArrayList<>();

  /**
  * Description: "Which other rules to apply in the context of this rule."
  */
  private java.util.List<StructureMapDependent> dependent = new java.util.ArrayList<>();

  /**
  * Description: "Documentation for this instance of data."
  */
  private String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  private transient Element _documentation;

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

  public StructureMapRule() {}

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
  public void setSource( java.util.List<StructureMapSource> value) {
    this.source = value;
  }
  public java.util.List<StructureMapSource> getSource() {
    return this.source;
  }
  public void setTarget( java.util.List<StructureMapTarget> value) {
    this.target = value;
  }
  public java.util.List<StructureMapTarget> getTarget() {
    return this.target;
  }
  public void setRule( java.util.List<StructureMapRule> value) {
    this.rule = value;
  }
  public java.util.List<StructureMapRule> getRule() {
    return this.rule;
  }
  public void setDependent( java.util.List<StructureMapDependent> value) {
    this.dependent = value;
  }
  public java.util.List<StructureMapDependent> getDependent() {
    return this.dependent;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void set_documentation( Element value) {
    this._documentation = value;
  }
  public Element get_documentation() {
    return this._documentation;
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
     builder.append("source" + "[" + String.valueOf(this.source) + "]\n"); 
     builder.append("target" + "[" + String.valueOf(this.target) + "]\n"); 
     builder.append("rule" + "[" + String.valueOf(this.rule) + "]\n"); 
     builder.append("dependent" + "[" + String.valueOf(this.dependent) + "]\n"); 
     builder.append("documentation" + "[" + String.valueOf(this.documentation) + "]\n"); 
     builder.append("_documentation" + "[" + String.valueOf(this._documentation) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static StructureMapRule fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, StructureMapRule.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(StructureMapRule o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<StructureMapRule> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

}