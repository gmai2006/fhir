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
import org.fhir.entity.QuestionnaireOptionModel;
import com.google.gson.GsonBuilder;

/**
* "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection."
*/
public class QuestionnaireOption  {
  /**
  * Description: "A potential answer that's allowed as the answer to this question."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float valueInteger;

  /**
  * Description: "Extensions for valueInteger"
  */
  private transient Element _valueInteger;

  /**
  * Description: "A potential answer that's allowed as the answer to this question."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String valueDate;

  /**
  * Description: "Extensions for valueDate"
  */
  private transient Element _valueDate;

  /**
  * Description: "A potential answer that's allowed as the answer to this question."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  private String valueTime;

  /**
  * Description: "Extensions for valueTime"
  */
  private transient Element _valueTime;

  /**
  * Description: "A potential answer that's allowed as the answer to this question."
  */
  private String valueString;

  /**
  * Description: "Extensions for valueString"
  */
  private transient Element _valueString;

  /**
  * Description: "A potential answer that's allowed as the answer to this question."
  */
  private Coding valueCoding;

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

  public QuestionnaireOption() {
  }

  public QuestionnaireOption(QuestionnaireOptionModel o) {
    this.id = o.getId();
      if (null != o.getValueInteger()) {
        this.valueInteger = new Float(o.getValueInteger());
      }

      if (null != o.getValueDate()) {
        this.valueDate = new String(o.getValueDate());
      }

      if (null != o.getValueTime()) {
        this.valueTime = new String(o.getValueTime());
      }

      if (null != o.getValueString()) {
        this.valueString = new String(o.getValueString());
      }

      this.valueCoding = Coding.fromJson(o.getValueCoding());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
  public void setValueCoding( Coding value) {
    this.valueCoding = value;
  }
  public Coding getValueCoding() {
    return this.valueCoding;
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
     builder.append("valueInteger" + "[" + String.valueOf(this.valueInteger) + "]\n"); 
     builder.append("_valueInteger" + "[" + String.valueOf(this._valueInteger) + "]\n"); 
     builder.append("valueDate" + "[" + String.valueOf(this.valueDate) + "]\n"); 
     builder.append("_valueDate" + "[" + String.valueOf(this._valueDate) + "]\n"); 
     builder.append("valueTime" + "[" + String.valueOf(this.valueTime) + "]\n"); 
     builder.append("_valueTime" + "[" + String.valueOf(this._valueTime) + "]\n"); 
     builder.append("valueString" + "[" + String.valueOf(this.valueString) + "]\n"); 
     builder.append("_valueString" + "[" + String.valueOf(this._valueString) + "]\n"); 
     builder.append("valueCoding" + "[" + String.valueOf(this.valueCoding) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<QuestionnaireOption> fromArray(java.util.List<QuestionnaireOptionModel> list) {
    return (java.util.List<QuestionnaireOption>)list.stream()
      .map(model -> new QuestionnaireOption(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<QuestionnaireOptionModel> toModelArray(java.util.List<QuestionnaireOption> list) {
    return (java.util.List<QuestionnaireOptionModel>)list.stream()
      .map(model -> new QuestionnaireOptionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static QuestionnaireOption fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, QuestionnaireOption.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(QuestionnaireOption o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<QuestionnaireOption> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}