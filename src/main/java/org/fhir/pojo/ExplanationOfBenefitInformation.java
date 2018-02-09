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
import org.fhir.entity.ExplanationOfBenefitInformationModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
public class ExplanationOfBenefitInformation  {
  /**
  * Description: "Sequence of the information element which serves to provide a link."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  private transient Element _sequence;

  /**
  * Description: "The general class of the information supplied: information; exception; accident, employment; onset, etc."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept category;

  /**
  * Description: "System and code pertaining to the specific information regarding special conditions relating to the setting, treatment or patient  for which care is sought which may influence the adjudication."
  */
  private CodeableConcept code;

  /**
  * Description: "The date when or period to which this information refers."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String timingDate;

  /**
  * Description: "Extensions for timingDate"
  */
  private transient Element _timingDate;

  /**
  * Description: "The date when or period to which this information refers."
  */
  private Period timingPeriod;

  /**
  * Description: "Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data."
  */
  private String valueString;

  /**
  * Description: "Extensions for valueString"
  */
  private transient Element _valueString;

  /**
  * Description: "Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data."
  */
  private Quantity valueQuantity;

  /**
  * Description: "Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data."
  */
  private Attachment valueAttachment;

  /**
  * Description: "Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data."
  */
  private Reference valueReference;

  /**
  * Description: "For example, provides the reason for: the additional stay, or missing tooth or any other situation where a reason code is required in addition to the content."
  */
  private Coding reason;

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

  public ExplanationOfBenefitInformation() {
  }

  public ExplanationOfBenefitInformation(ExplanationOfBenefitInformationModel o) {
    this.id = o.getId();
      if (null != o.getSequence()) {
        this.sequence = new Float(o.getSequence());
      }

      this.category = CodeableConcept.fromJson(o.getCategory());
      this.code = CodeableConcept.fromJson(o.getCode());
      if (null != o.getTimingDate()) {
        this.timingDate = new String(o.getTimingDate());
      }

      this.timingPeriod = Period.fromJson(o.getTimingPeriod());
      if (null != o.getValueString()) {
        this.valueString = new String(o.getValueString());
      }

      this.valueQuantity = Quantity.fromJson(o.getValueQuantity());
      this.valueAttachment = Attachment.fromJson(o.getValueAttachment());
      if (null != o.getValueReference()) {
        this.valueReference = new Reference(o.getValueReference());
        this.valueReference.setId(this.getId());
      }

      this.reason = Coding.fromJson(o.getReason());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Float getSequence() {
    return this.sequence;
  }
  public void set_sequence( Element value) {
    this._sequence = value;
  }
  public Element get_sequence() {
    return this._sequence;
  }
  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setTimingDate( String value) {
    this.timingDate = value;
  }
  public String getTimingDate() {
    return this.timingDate;
  }
  public void set_timingDate( Element value) {
    this._timingDate = value;
  }
  public Element get_timingDate() {
    return this._timingDate;
  }
  public void setTimingPeriod( Period value) {
    this.timingPeriod = value;
  }
  public Period getTimingPeriod() {
    return this.timingPeriod;
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
  public void setValueQuantity( Quantity value) {
    this.valueQuantity = value;
  }
  public Quantity getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueAttachment( Attachment value) {
    this.valueAttachment = value;
  }
  public Attachment getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueReference( Reference value) {
    this.valueReference = value;
  }
  public Reference getValueReference() {
    return this.valueReference;
  }
  public void setReason( Coding value) {
    this.reason = value;
  }
  public Coding getReason() {
    return this.reason;
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
     builder.append("sequence" + "[" + String.valueOf(this.sequence) + "]\n"); 
     builder.append("_sequence" + "[" + String.valueOf(this._sequence) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("timingDate" + "[" + String.valueOf(this.timingDate) + "]\n"); 
     builder.append("_timingDate" + "[" + String.valueOf(this._timingDate) + "]\n"); 
     builder.append("timingPeriod" + "[" + String.valueOf(this.timingPeriod) + "]\n"); 
     builder.append("valueString" + "[" + String.valueOf(this.valueString) + "]\n"); 
     builder.append("_valueString" + "[" + String.valueOf(this._valueString) + "]\n"); 
     builder.append("valueQuantity" + "[" + String.valueOf(this.valueQuantity) + "]\n"); 
     builder.append("valueAttachment" + "[" + String.valueOf(this.valueAttachment) + "]\n"); 
     builder.append("valueReference" + "[" + String.valueOf(this.valueReference) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ExplanationOfBenefitInformation> fromArray(java.util.List<ExplanationOfBenefitInformationModel> list) {
    return (java.util.List<ExplanationOfBenefitInformation>)list.stream()
      .map(model -> new ExplanationOfBenefitInformation(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ExplanationOfBenefitInformationModel> toModelArray(java.util.List<ExplanationOfBenefitInformation> list) {
    return (java.util.List<ExplanationOfBenefitInformationModel>)list.stream()
      .map(model -> new ExplanationOfBenefitInformationModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ExplanationOfBenefitInformation fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ExplanationOfBenefitInformation.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ExplanationOfBenefitInformation o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ExplanationOfBenefitInformation> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}