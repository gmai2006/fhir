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
import org.fhir.entity.SpecimenProcessingModel;
import com.google.gson.GsonBuilder;

/**
* "A sample to be used for analysis."
*/
public class SpecimenProcessing  {
  /**
  * Description: "Textual description of procedure."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "A coded value specifying the procedure used to process the specimen."
  */
  private CodeableConcept procedure;

  /**
  * Description: "Material used in the processing step."
  */
  private java.util.List<Reference> additive = new java.util.ArrayList<>();

  /**
  * Description: "A record of the time or period when the specimen processing occurred.  For example the time of sample fixation or the period of time the sample was in formalin."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String timeDateTime;

  /**
  * Description: "Extensions for timeDateTime"
  */
  private transient Element _timeDateTime;

  /**
  * Description: "A record of the time or period when the specimen processing occurred.  For example the time of sample fixation or the period of time the sample was in formalin."
  */
  private Period timePeriod;

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

  public SpecimenProcessing() {
  }

  public SpecimenProcessing(SpecimenProcessingModel o) {
    this.id = o.getId();
      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.procedure = CodeableConcept.fromJson(o.getProcedure());
      this.additive = Reference.fromArray(o.getAdditive());

      if (null != o.getTimeDateTime()) {
        this.timeDateTime = new String(o.getTimeDateTime());
      }

      this.timePeriod = Period.fromJson(o.getTimePeriod());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
  public void setProcedure( CodeableConcept value) {
    this.procedure = value;
  }
  public CodeableConcept getProcedure() {
    return this.procedure;
  }
  public void setAdditive( java.util.List<Reference> value) {
    this.additive = value;
  }
  public java.util.List<Reference> getAdditive() {
    return this.additive;
  }
  public void setTimeDateTime( String value) {
    this.timeDateTime = value;
  }
  public String getTimeDateTime() {
    return this.timeDateTime;
  }
  public void set_timeDateTime( Element value) {
    this._timeDateTime = value;
  }
  public Element get_timeDateTime() {
    return this._timeDateTime;
  }
  public void setTimePeriod( Period value) {
    this.timePeriod = value;
  }
  public Period getTimePeriod() {
    return this.timePeriod;
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
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("procedure" + "[" + String.valueOf(this.procedure) + "]\n"); 
     builder.append("additive" + "[" + String.valueOf(this.additive) + "]\n"); 
     builder.append("timeDateTime" + "[" + String.valueOf(this.timeDateTime) + "]\n"); 
     builder.append("_timeDateTime" + "[" + String.valueOf(this._timeDateTime) + "]\n"); 
     builder.append("timePeriod" + "[" + String.valueOf(this.timePeriod) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<SpecimenProcessing> fromArray(java.util.List<SpecimenProcessingModel> list) {
    return (java.util.List<SpecimenProcessing>)list.stream()
      .map(model -> new SpecimenProcessing(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<SpecimenProcessingModel> toModelArray(java.util.List<SpecimenProcessing> list) {
    return (java.util.List<SpecimenProcessingModel>)list.stream()
      .map(model -> new SpecimenProcessingModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static SpecimenProcessing fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, SpecimenProcessing.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(SpecimenProcessing o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<SpecimenProcessing> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}