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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;

/**
* "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to."
*/
@Entity
@Table(name="questionnaireresponseanswer")
public class QuestionnaireResponseAnswerModel  {
  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.persistence.Basic
  @Column(name="\"valueBoolean\"")
  private Boolean valueBoolean;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"valueDecimal\"")
  private Float valueDecimal;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"valueInteger\"")
  private Float valueInteger;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"valueDate\"")
  private String valueDate;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"valueDateTime\"")
  private String valueDateTime;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"valueTime\"")
  private String valueTime;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.persistence.Basic
  @Column(name="\"valueString\"")
  private String valueString;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.persistence.Basic
  @Column(name="\"valueUri\"")
  private String valueUri;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  * Actual type: Attachment
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueAttachment\"", length = 16777215)
  private String valueAttachment;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  * Actual type: Coding
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueCoding\"", length = 16777215)
  private String valueCoding;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueQuantity\"", length = 16777215)
  private String valueQuantity;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.persistence.Basic
  @Column(name="\"valuereference_id\"")
  private String valuereference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuereference_id`", insertable=false, updatable=false)
  private ReferenceModel valueReference;

  /**
  * Description: "Nested groups and/or questions found within this particular answer."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<QuestionnaireResponseItemModel> item = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public QuestionnaireResponseAnswerModel() {
  }

  public QuestionnaireResponseAnswerModel(QuestionnaireResponseAnswer o) {
    this.id = o.getId();
      this.valueBoolean = o.getValueBoolean();

      this.valueDecimal = o.getValueDecimal();

      this.valueInteger = o.getValueInteger();

      this.valueDate = o.getValueDate();

      this.valueDateTime = o.getValueDateTime();

      this.valueTime = o.getValueTime();

      this.valueString = o.getValueString();

      this.valueUri = o.getValueUri();

      this.valueAttachment = Attachment.toJson(o.getValueAttachment());
      this.valueCoding = Coding.toJson(o.getValueCoding());
      this.valueQuantity = Quantity.toJson(o.getValueQuantity());
      if (null != o.getValueReference()) {
      	this.valuereference_id = "valueReference" + this.getId();
        this.valueReference = new ReferenceModel(o.getValueReference());
        this.valueReference.setId(this.valuereference_id);
        this.valueReference.parent_id = this.valueReference.getId();
      }

      this.item = QuestionnaireResponseItem.toModelArray(o.getItem());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setValueBoolean( Boolean value) {
    this.valueBoolean = value;
  }
  public Boolean getValueBoolean() {
    return this.valueBoolean;
  }
  public void setValueDecimal( Float value) {
    this.valueDecimal = value;
  }
  public Float getValueDecimal() {
    return this.valueDecimal;
  }
  public void setValueInteger( Float value) {
    this.valueInteger = value;
  }
  public Float getValueInteger() {
    return this.valueInteger;
  }
  public void setValueDate( String value) {
    this.valueDate = value;
  }
  public String getValueDate() {
    return this.valueDate;
  }
  public void setValueDateTime( String value) {
    this.valueDateTime = value;
  }
  public String getValueDateTime() {
    return this.valueDateTime;
  }
  public void setValueTime( String value) {
    this.valueTime = value;
  }
  public String getValueTime() {
    return this.valueTime;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void setValueUri( String value) {
    this.valueUri = value;
  }
  public String getValueUri() {
    return this.valueUri;
  }
  public void setValueAttachment( String value) {
    this.valueAttachment = value;
  }
  public String getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueCoding( String value) {
    this.valueCoding = value;
  }
  public String getValueCoding() {
    return this.valueCoding;
  }
  public void setValueQuantity( String value) {
    this.valueQuantity = value;
  }
  public String getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueReference( ReferenceModel value) {
    this.valueReference = value;
  }
  public ReferenceModel getValueReference() {
    return this.valueReference;
  }
  public void setItem( java.util.List<QuestionnaireResponseItemModel> value) {
    this.item = value;
  }
  public java.util.List<QuestionnaireResponseItemModel> getItem() {
    return this.item;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("valueBoolean" + "[" + String.valueOf(this.valueBoolean) + "]\n"); 
     builder.append("valueDecimal" + "[" + String.valueOf(this.valueDecimal) + "]\n"); 
     builder.append("valueInteger" + "[" + String.valueOf(this.valueInteger) + "]\n"); 
     builder.append("valueDate" + "[" + String.valueOf(this.valueDate) + "]\n"); 
     builder.append("valueDateTime" + "[" + String.valueOf(this.valueDateTime) + "]\n"); 
     builder.append("valueTime" + "[" + String.valueOf(this.valueTime) + "]\n"); 
     builder.append("valueString" + "[" + String.valueOf(this.valueString) + "]\n"); 
     builder.append("valueUri" + "[" + String.valueOf(this.valueUri) + "]\n"); 
     builder.append("valueAttachment" + "[" + String.valueOf(this.valueAttachment) + "]\n"); 
     builder.append("valueCoding" + "[" + String.valueOf(this.valueCoding) + "]\n"); 
     builder.append("valueQuantity" + "[" + String.valueOf(this.valueQuantity) + "]\n"); 
     builder.append("valueReference" + "[" + String.valueOf(this.valueReference) + "]\n"); 
     builder.append("item" + "[" + String.valueOf(this.item) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}