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
import org.fhir.entity.FamilyMemberHistoryConditionModel;
import com.google.gson.GsonBuilder;

/**
* "Significant health events and conditions for a person related to the patient relevant in the context of care for the patient."
*/
public class FamilyMemberHistoryCondition  {
  /**
  * Description: "The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept code;

  /**
  * Description: "Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation."
  */
  private CodeableConcept outcome;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  */
  private Age onsetAge;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  */
  private Range onsetRange;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  */
  private Period onsetPeriod;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  */
  private String onsetString;

  /**
  * Description: "Extensions for onsetString"
  */
  private transient Element _onsetString;

  /**
  * Description: "An area where general notes can be placed about this specific condition."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

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

  public FamilyMemberHistoryCondition() {
  }

  public FamilyMemberHistoryCondition(FamilyMemberHistoryConditionModel o) {
    this.id = o.getId();
      this.code = CodeableConcept.fromJson(o.getCode());
      this.outcome = CodeableConcept.fromJson(o.getOutcome());
      this.onsetAge = Age.fromJson(o.getOnsetAge());
      this.onsetRange = Range.fromJson(o.getOnsetRange());
      this.onsetPeriod = Period.fromJson(o.getOnsetPeriod());
      if (null != o.getOnsetString()) {
        this.onsetString = new String(o.getOnsetString());
      }

      this.note = Annotation.fromArray(o.getNote());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setOutcome( CodeableConcept value) {
    this.outcome = value;
  }
  public CodeableConcept getOutcome() {
    return this.outcome;
  }
  public void setOnsetAge( Age value) {
    this.onsetAge = value;
  }
  public Age getOnsetAge() {
    return this.onsetAge;
  }
  public void setOnsetRange( Range value) {
    this.onsetRange = value;
  }
  public Range getOnsetRange() {
    return this.onsetRange;
  }
  public void setOnsetPeriod( Period value) {
    this.onsetPeriod = value;
  }
  public Period getOnsetPeriod() {
    return this.onsetPeriod;
  }
  public void setOnsetString( String value) {
    this.onsetString = value;
  }
  public String getOnsetString() {
    return this.onsetString;
  }
  public void set_onsetString( Element value) {
    this._onsetString = value;
  }
  public Element get_onsetString() {
    return this._onsetString;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
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
     builder.append("outcome" + "[" + String.valueOf(this.outcome) + "]\n"); 
     builder.append("onsetAge" + "[" + String.valueOf(this.onsetAge) + "]\n"); 
     builder.append("onsetRange" + "[" + String.valueOf(this.onsetRange) + "]\n"); 
     builder.append("onsetPeriod" + "[" + String.valueOf(this.onsetPeriod) + "]\n"); 
     builder.append("onsetString" + "[" + String.valueOf(this.onsetString) + "]\n"); 
     builder.append("_onsetString" + "[" + String.valueOf(this._onsetString) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<FamilyMemberHistoryCondition> fromArray(java.util.List<FamilyMemberHistoryConditionModel> list) {
    return (java.util.List<FamilyMemberHistoryCondition>)list.stream()
      .map(model -> new FamilyMemberHistoryCondition(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<FamilyMemberHistoryConditionModel> toModelArray(java.util.List<FamilyMemberHistoryCondition> list) {
    return (java.util.List<FamilyMemberHistoryConditionModel>)list.stream()
      .map(model -> new FamilyMemberHistoryConditionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static FamilyMemberHistoryCondition fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, FamilyMemberHistoryCondition.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(FamilyMemberHistoryCondition o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<FamilyMemberHistoryCondition> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}