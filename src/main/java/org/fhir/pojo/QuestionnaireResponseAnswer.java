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
import org.fhir.entity.QuestionnaireResponseAnswerModel;
import com.google.gson.GsonBuilder;

/**
* "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to."
*/
public class QuestionnaireResponseAnswer  {
  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  private Boolean valueBoolean;

  /**
  * Description: "Extensions for valueBoolean"
  */
  private transient Element _valueBoolean;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float valueDecimal;

  /**
  * Description: "Extensions for valueDecimal"
  */
  private transient Element _valueDecimal;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float valueInteger;

  /**
  * Description: "Extensions for valueInteger"
  */
  private transient Element _valueInteger;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String valueDate;

  /**
  * Description: "Extensions for valueDate"
  */
  private transient Element _valueDate;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String valueDateTime;

  /**
  * Description: "Extensions for valueDateTime"
  */
  private transient Element _valueDateTime;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  private String valueTime;

  /**
  * Description: "Extensions for valueTime"
  */
  private transient Element _valueTime;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  private String valueString;

  /**
  * Description: "Extensions for valueString"
  */
  private transient Element _valueString;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  private String valueUri;

  /**
  * Description: "Extensions for valueUri"
  */
  private transient Element _valueUri;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  private Attachment valueAttachment;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  private Coding valueCoding;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  private Quantity valueQuantity;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  private Reference valueReference;

  /**
  * Description: "Nested groups and/or questions found within this particular answer."
  */
  private java.util.List<QuestionnaireResponseItem> item = new java.util.ArrayList<>();

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

  public QuestionnaireResponseAnswer() {
  }

  public QuestionnaireResponseAnswer(QuestionnaireResponseAnswerModel o) {
    this.id = o.getId();
      if (null != o.getValueBoolean()) {
        this.valueBoolean = new Boolean(o.getValueBoolean());
      }

      if (null != o.getValueDecimal()) {
        this.valueDecimal = new Float(o.getValueDecimal());
      }

      if (null != o.getValueInteger()) {
        this.valueInteger = new Float(o.getValueInteger());
      }

      if (null != o.getValueDate()) {
        this.valueDate = new String(o.getValueDate());
      }

      if (null != o.getValueDateTime()) {
        this.valueDateTime = new String(o.getValueDateTime());
      }

      if (null != o.getValueTime()) {
        this.valueTime = new String(o.getValueTime());
      }

      if (null != o.getValueString()) {
        this.valueString = new String(o.getValueString());
      }

      if (null != o.getValueUri()) {
        this.valueUri = new String(o.getValueUri());
      }

      this.valueAttachment = Attachment.fromJson(o.getValueAttachment());
      this.valueCoding = Coding.fromJson(o.getValueCoding());
      this.valueQuantity = Quantity.fromJson(o.getValueQuantity());
      if (null != o.getValueReference()) {
        this.valueReference = new Reference(o.getValueReference());
        this.valueReference.setId(this.getId());
      }

      this.item = QuestionnaireResponseItem.fromArray(o.getItem());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setValueBoolean( Boolean value) {
    this.valueBoolean = value;
  }
  public Boolean getValueBoolean() {
    return this.valueBoolean;
  }
  public void set_valueBoolean( Element value) {
    this._valueBoolean = value;
  }
  public Element get_valueBoolean() {
    return this._valueBoolean;
  }
  public void setValueDecimal( Float value) {
    this.valueDecimal = value;
  }
  public Float getValueDecimal() {
    return this.valueDecimal;
  }
  public void set_valueDecimal( Element value) {
    this._valueDecimal = value;
  }
  public Element get_valueDecimal() {
    return this._valueDecimal;
  }
  public void setValueInteger( Float value) {
    this.valueInteger = value;
  }
  public Float getValueInteger() {
    return this.valueInteger;
  }
  public void set_valueInteger( Element value) {
    this._valueInteger = value;
  }
  public Element get_valueInteger() {
    return this._valueInteger;
  }
  public void setValueDate( String value) {
    this.valueDate = value;
  }
  public String getValueDate() {
    return this.valueDate;
  }
  public void set_valueDate( Element value) {
    this._valueDate = value;
  }
  public Element get_valueDate() {
    return this._valueDate;
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
  public void setValueUri( String value) {
    this.valueUri = value;
  }
  public String getValueUri() {
    return this.valueUri;
  }
  public void set_valueUri( Element value) {
    this._valueUri = value;
  }
  public Element get_valueUri() {
    return this._valueUri;
  }
  public void setValueAttachment( Attachment value) {
    this.valueAttachment = value;
  }
  public Attachment getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueCoding( Coding value) {
    this.valueCoding = value;
  }
  public Coding getValueCoding() {
    return this.valueCoding;
  }
  public void setValueQuantity( Quantity value) {
    this.valueQuantity = value;
  }
  public Quantity getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueReference( Reference value) {
    this.valueReference = value;
  }
  public Reference getValueReference() {
    return this.valueReference;
  }
  public void setItem( java.util.List<QuestionnaireResponseItem> value) {
    this.item = value;
  }
  public java.util.List<QuestionnaireResponseItem> getItem() {
    return this.item;
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
     builder.append("valueBoolean" + "[" + String.valueOf(this.valueBoolean) + "]\n"); 
     builder.append("_valueBoolean" + "[" + String.valueOf(this._valueBoolean) + "]\n"); 
     builder.append("valueDecimal" + "[" + String.valueOf(this.valueDecimal) + "]\n"); 
     builder.append("_valueDecimal" + "[" + String.valueOf(this._valueDecimal) + "]\n"); 
     builder.append("valueInteger" + "[" + String.valueOf(this.valueInteger) + "]\n"); 
     builder.append("_valueInteger" + "[" + String.valueOf(this._valueInteger) + "]\n"); 
     builder.append("valueDate" + "[" + String.valueOf(this.valueDate) + "]\n"); 
     builder.append("_valueDate" + "[" + String.valueOf(this._valueDate) + "]\n"); 
     builder.append("valueDateTime" + "[" + String.valueOf(this.valueDateTime) + "]\n"); 
     builder.append("_valueDateTime" + "[" + String.valueOf(this._valueDateTime) + "]\n"); 
     builder.append("valueTime" + "[" + String.valueOf(this.valueTime) + "]\n"); 
     builder.append("_valueTime" + "[" + String.valueOf(this._valueTime) + "]\n"); 
     builder.append("valueString" + "[" + String.valueOf(this.valueString) + "]\n"); 
     builder.append("_valueString" + "[" + String.valueOf(this._valueString) + "]\n"); 
     builder.append("valueUri" + "[" + String.valueOf(this.valueUri) + "]\n"); 
     builder.append("_valueUri" + "[" + String.valueOf(this._valueUri) + "]\n"); 
     builder.append("valueAttachment" + "[" + String.valueOf(this.valueAttachment) + "]\n"); 
     builder.append("valueCoding" + "[" + String.valueOf(this.valueCoding) + "]\n"); 
     builder.append("valueQuantity" + "[" + String.valueOf(this.valueQuantity) + "]\n"); 
     builder.append("valueReference" + "[" + String.valueOf(this.valueReference) + "]\n"); 
     builder.append("item" + "[" + String.valueOf(this.item) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<QuestionnaireResponseAnswer> fromArray(java.util.List<QuestionnaireResponseAnswerModel> list) {
    return (java.util.List<QuestionnaireResponseAnswer>)list.stream()
      .map(model -> new QuestionnaireResponseAnswer(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<QuestionnaireResponseAnswerModel> toModelArray(java.util.List<QuestionnaireResponseAnswer> list) {
    return (java.util.List<QuestionnaireResponseAnswerModel>)list.stream()
      .map(model -> new QuestionnaireResponseAnswerModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static QuestionnaireResponseAnswer fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, QuestionnaireResponseAnswer.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(QuestionnaireResponseAnswer o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<QuestionnaireResponseAnswer> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}