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
import org.fhir.entity.ObservationComponentModel;
import com.google.gson.GsonBuilder;

/**
* "Measurements and simple assertions made about a patient, device or other subject."
*/
public class ObservationComponent  {
  /**
  * Description: "Describes what was observed. Sometimes this is called the observation \"code\"."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept code;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private Quantity valueQuantity;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private CodeableConcept valueCodeableConcept;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private String valueString;

  /**
  * Description: "Extensions for valueString"
  */
  private transient Element _valueString;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private Range valueRange;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private Ratio valueRatio;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private SampledData valueSampledData;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private Attachment valueAttachment;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  private String valueTime;

  /**
  * Description: "Extensions for valueTime"
  */
  private transient Element _valueTime;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String valueDateTime;

  /**
  * Description: "Extensions for valueDateTime"
  */
  private transient Element _valueDateTime;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private Period valuePeriod;

  /**
  * Description: "Provides a reason why the expected value in the element Observation.value[x] is missing."
  */
  private CodeableConcept dataAbsentReason;

  /**
  * Description: "The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag."
  */
  private CodeableConcept interpretation;

  /**
  * Description: "Guidance on how to interpret the value by comparison to a normal or recommended range."
  */
  private java.util.List<ObservationReferenceRange> referenceRange = new java.util.ArrayList<>();

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

  public ObservationComponent() {
  }

  public ObservationComponent(ObservationComponentModel o) {
    this.id = o.getId();
      this.code = CodeableConcept.fromJson(o.getCode());
      this.valueQuantity = Quantity.fromJson(o.getValueQuantity());
      this.valueCodeableConcept = CodeableConcept.fromJson(o.getValueCodeableConcept());
      if (null != o.getValueString()) {
        this.valueString = new String(o.getValueString());
      }

      this.valueRange = Range.fromJson(o.getValueRange());
      this.valueRatio = Ratio.fromJson(o.getValueRatio());
      this.valueSampledData = SampledData.fromJson(o.getValueSampledData());
      this.valueAttachment = Attachment.fromJson(o.getValueAttachment());
      if (null != o.getValueTime()) {
        this.valueTime = new String(o.getValueTime());
      }

      if (null != o.getValueDateTime()) {
        this.valueDateTime = new String(o.getValueDateTime());
      }

      this.valuePeriod = Period.fromJson(o.getValuePeriod());
      this.dataAbsentReason = CodeableConcept.fromJson(o.getDataAbsentReason());
      this.interpretation = CodeableConcept.fromJson(o.getInterpretation());
      this.referenceRange = ObservationReferenceRange.fromArray(o.getReferenceRange());

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
  public void setValueQuantity( Quantity value) {
    this.valueQuantity = value;
  }
  public Quantity getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueCodeableConcept( CodeableConcept value) {
    this.valueCodeableConcept = value;
  }
  public CodeableConcept getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void set_valueString( Element value) {
    this._valueString = value;
  }
  public Element get_valueString() {
    return this._valueString;
  }
  public void setValueRange( Range value) {
    this.valueRange = value;
  }
  public Range getValueRange() {
    return this.valueRange;
  }
  public void setValueRatio( Ratio value) {
    this.valueRatio = value;
  }
  public Ratio getValueRatio() {
    return this.valueRatio;
  }
  public void setValueSampledData( SampledData value) {
    this.valueSampledData = value;
  }
  public SampledData getValueSampledData() {
    return this.valueSampledData;
  }
  public void setValueAttachment( Attachment value) {
    this.valueAttachment = value;
  }
  public Attachment getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueTime( String value) {
    this.valueTime = value;
  }
  public String getValueTime() {
    return this.valueTime;
  }
  public void set_valueTime( Element value) {
    this._valueTime = value;
  }
  public Element get_valueTime() {
    return this._valueTime;
  }
  public void setValueDateTime( String value) {
    this.valueDateTime = value;
  }
  public String getValueDateTime() {
    return this.valueDateTime;
  }
  public void set_valueDateTime( Element value) {
    this._valueDateTime = value;
  }
  public Element get_valueDateTime() {
    return this._valueDateTime;
  }
  public void setValuePeriod( Period value) {
    this.valuePeriod = value;
  }
  public Period getValuePeriod() {
    return this.valuePeriod;
  }
  public void setDataAbsentReason( CodeableConcept value) {
    this.dataAbsentReason = value;
  }
  public CodeableConcept getDataAbsentReason() {
    return this.dataAbsentReason;
  }
  public void setInterpretation( CodeableConcept value) {
    this.interpretation = value;
  }
  public CodeableConcept getInterpretation() {
    return this.interpretation;
  }
  public void setReferenceRange( java.util.List<ObservationReferenceRange> value) {
    this.referenceRange = value;
  }
  public java.util.List<ObservationReferenceRange> getReferenceRange() {
    return this.referenceRange;
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
     builder.append("valueQuantity" + "[" + String.valueOf(this.valueQuantity) + "]\n"); 
     builder.append("valueCodeableConcept" + "[" + String.valueOf(this.valueCodeableConcept) + "]\n"); 
     builder.append("valueString" + "[" + String.valueOf(this.valueString) + "]\n"); 
     builder.append("_valueString" + "[" + String.valueOf(this._valueString) + "]\n"); 
     builder.append("valueRange" + "[" + String.valueOf(this.valueRange) + "]\n"); 
     builder.append("valueRatio" + "[" + String.valueOf(this.valueRatio) + "]\n"); 
     builder.append("valueSampledData" + "[" + String.valueOf(this.valueSampledData) + "]\n"); 
     builder.append("valueAttachment" + "[" + String.valueOf(this.valueAttachment) + "]\n"); 
     builder.append("valueTime" + "[" + String.valueOf(this.valueTime) + "]\n"); 
     builder.append("_valueTime" + "[" + String.valueOf(this._valueTime) + "]\n"); 
     builder.append("valueDateTime" + "[" + String.valueOf(this.valueDateTime) + "]\n"); 
     builder.append("_valueDateTime" + "[" + String.valueOf(this._valueDateTime) + "]\n"); 
     builder.append("valuePeriod" + "[" + String.valueOf(this.valuePeriod) + "]\n"); 
     builder.append("dataAbsentReason" + "[" + String.valueOf(this.dataAbsentReason) + "]\n"); 
     builder.append("interpretation" + "[" + String.valueOf(this.interpretation) + "]\n"); 
     builder.append("referenceRange" + "[" + String.valueOf(this.referenceRange) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ObservationComponent> fromArray(java.util.List<ObservationComponentModel> list) {
    return (java.util.List<ObservationComponent>)list.stream()
      .map(model -> new ObservationComponent(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ObservationComponentModel> toModelArray(java.util.List<ObservationComponent> list) {
    return (java.util.List<ObservationComponentModel>)list.stream()
      .map(model -> new ObservationComponentModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ObservationComponent fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ObservationComponent.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ObservationComponent o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ObservationComponent> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}