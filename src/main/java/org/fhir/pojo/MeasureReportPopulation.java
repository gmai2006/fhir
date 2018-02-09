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
import org.fhir.entity.MeasureReportPopulationModel;
import com.google.gson.GsonBuilder;

/**
* "The MeasureReport resource contains the results of evaluating a measure."
*/
public class MeasureReportPopulation  {
  /**
  * Description: "The identifier of the population being reported, as defined by the population element of the measure."
  */
  private Identifier identifier;

  /**
  * Description: "The type of the population."
  */
  private CodeableConcept code;

  /**
  * Description: "The number of members of the population."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float count;

  /**
  * Description: "Extensions for count"
  */
  private transient Element _count;

  /**
  * Description: "This element refers to a List of patient level MeasureReport resources, one for each patient in this population."
  */
  private Reference patients;

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

  public MeasureReportPopulation() {
  }

  public MeasureReportPopulation(MeasureReportPopulationModel o) {
    this.id = o.getId();
      this.identifier = Identifier.fromJson(o.getIdentifier());
      this.code = CodeableConcept.fromJson(o.getCode());
      if (null != o.getCount()) {
        this.count = new Float(o.getCount());
      }

      if (null != o.getPatients()) {
        this.patients = new Reference(o.getPatients());
        this.patients.setId(this.getId());
      }

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
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setCount( Float value) {
    this.count = value;
  }
  public Float getCount() {
    return this.count;
  }
  public void set_count( Element value) {
    this._count = value;
  }
  public Element get_count() {
    return this._count;
  }
  public void setPatients( Reference value) {
    this.patients = value;
  }
  public Reference getPatients() {
    return this.patients;
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
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("count" + "[" + String.valueOf(this.count) + "]\n"); 
     builder.append("_count" + "[" + String.valueOf(this._count) + "]\n"); 
     builder.append("patients" + "[" + String.valueOf(this.patients) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<MeasureReportPopulation> fromArray(java.util.List<MeasureReportPopulationModel> list) {
    return (java.util.List<MeasureReportPopulation>)list.stream()
      .map(model -> new MeasureReportPopulation(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MeasureReportPopulationModel> toModelArray(java.util.List<MeasureReportPopulation> list) {
    return (java.util.List<MeasureReportPopulationModel>)list.stream()
      .map(model -> new MeasureReportPopulationModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static MeasureReportPopulation fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MeasureReportPopulation.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MeasureReportPopulation o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MeasureReportPopulation> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}