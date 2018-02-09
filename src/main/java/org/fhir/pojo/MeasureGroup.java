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
import org.fhir.entity.MeasureGroupModel;
import com.google.gson.GsonBuilder;

/**
* "The Measure resource provides the definition of a quality measure."
*/
public class MeasureGroup  {
  /**
  * Description: "A unique identifier for the group. This identifier will used to report data for the group in the measure report."
  */
  @javax.validation.constraints.NotNull
  private Identifier identifier;

  /**
  * Description: "Optional name or short description of this group."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "The human readable description of this population group."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "A population criteria for the measure."
  */
  private java.util.List<MeasurePopulation> population = new java.util.ArrayList<>();

  /**
  * Description: "The stratifier criteria for the measure report, specified as either the name of a valid CQL expression defined within a referenced library, or a valid FHIR Resource Path."
  */
  private java.util.List<MeasureStratifier> stratifier = new java.util.ArrayList<>();

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

  public MeasureGroup() {
  }

  public MeasureGroup(MeasureGroupModel o) {
    this.id = o.getId();
      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.population = MeasurePopulation.fromArray(o.getPopulation());

      this.stratifier = MeasureStratifier.fromArray(o.getStratifier());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
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
  public void setPopulation( java.util.List<MeasurePopulation> value) {
    this.population = value;
  }
  public java.util.List<MeasurePopulation> getPopulation() {
    return this.population;
  }
  public void setStratifier( java.util.List<MeasureStratifier> value) {
    this.stratifier = value;
  }
  public java.util.List<MeasureStratifier> getStratifier() {
    return this.stratifier;
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
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("population" + "[" + String.valueOf(this.population) + "]\n"); 
     builder.append("stratifier" + "[" + String.valueOf(this.stratifier) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<MeasureGroup> fromArray(java.util.List<MeasureGroupModel> list) {
    return (java.util.List<MeasureGroup>)list.stream()
      .map(model -> new MeasureGroup(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MeasureGroupModel> toModelArray(java.util.List<MeasureGroup> list) {
    return (java.util.List<MeasureGroupModel>)list.stream()
      .map(model -> new MeasureGroupModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static MeasureGroup fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MeasureGroup.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MeasureGroup o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MeasureGroup> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}