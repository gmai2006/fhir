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
import org.fhir.entity.CarePlanActivityModel;
import com.google.gson.GsonBuilder;

/**
* "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
*/
public class CarePlanActivity  {
  /**
  * Description: "Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not)."
  */
  private java.util.List<CodeableConcept> outcomeCodeableConcept = new java.util.ArrayList<>();

  /**
  * Description: "Details of the outcome or action resulting from the activity.  The reference to an \"event\" resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a “request” resource)."
  */
  private java.util.List<Reference> outcomeReference = new java.util.ArrayList<>();

  /**
  * Description: "Notes about the adherence/status/progress of the activity."
  */
  private java.util.List<Annotation> progress = new java.util.ArrayList<>();

  /**
  * Description: "The details of the proposed activity represented in a specific resource."
  */
  private Reference reference;

  /**
  * Description: "A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc."
  */
  private CarePlanDetail detail;

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

  public CarePlanActivity() {
  }

  public CarePlanActivity(CarePlanActivityModel o) {
    this.id = o.getId();
      this.outcomeCodeableConcept = CodeableConcept.fromArray(o.getOutcomeCodeableConcept());
      this.outcomeReference = Reference.fromArray(o.getOutcomeReference());

      this.progress = Annotation.fromArray(o.getProgress());
      if (null != o.getReference()) {
        this.reference = new Reference(o.getReference());
        this.reference.setId(this.getId());
      }

      if (null != o.getDetail()) {
        this.detail = new CarePlanDetail(o.getDetail());
        this.detail.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setOutcomeCodeableConcept( java.util.List<CodeableConcept> value) {
    this.outcomeCodeableConcept = value;
  }
  public java.util.List<CodeableConcept> getOutcomeCodeableConcept() {
    return this.outcomeCodeableConcept;
  }
  public void setOutcomeReference( java.util.List<Reference> value) {
    this.outcomeReference = value;
  }
  public java.util.List<Reference> getOutcomeReference() {
    return this.outcomeReference;
  }
  public void setProgress( java.util.List<Annotation> value) {
    this.progress = value;
  }
  public java.util.List<Annotation> getProgress() {
    return this.progress;
  }
  public void setReference( Reference value) {
    this.reference = value;
  }
  public Reference getReference() {
    return this.reference;
  }
  public void setDetail( CarePlanDetail value) {
    this.detail = value;
  }
  public CarePlanDetail getDetail() {
    return this.detail;
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
     builder.append("outcomeCodeableConcept" + "[" + String.valueOf(this.outcomeCodeableConcept) + "]\n"); 
     builder.append("outcomeReference" + "[" + String.valueOf(this.outcomeReference) + "]\n"); 
     builder.append("progress" + "[" + String.valueOf(this.progress) + "]\n"); 
     builder.append("reference" + "[" + String.valueOf(this.reference) + "]\n"); 
     builder.append("detail" + "[" + String.valueOf(this.detail) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<CarePlanActivity> fromArray(java.util.List<CarePlanActivityModel> list) {
    return (java.util.List<CarePlanActivity>)list.stream()
      .map(model -> new CarePlanActivity(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CarePlanActivityModel> toModelArray(java.util.List<CarePlanActivity> list) {
    return (java.util.List<CarePlanActivityModel>)list.stream()
      .map(model -> new CarePlanActivityModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CarePlanActivity fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CarePlanActivity.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CarePlanActivity o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CarePlanActivity> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}