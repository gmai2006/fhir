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
* "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection."
*/
@Entity
@Table(name="questionnaireenablewhen")
public class QuestionnaireEnableWhenModel  {
  /**
  * Description: "The linkId for the question whose answer (or lack of answer) governs whether this item is enabled."
  */
  @javax.persistence.Basic
  @Column(name="\"question\"")
  private String question;

  /**
  * Description: "An indication that this item should be enabled only if the specified question is answered (hasAnswer=true) or not answered (hasAnswer=false)."
  */
  @javax.persistence.Basic
  @Column(name="\"hasAnswer\"")
  private Boolean hasAnswer;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.persistence.Basic
  @Column(name="\"answerBoolean\"")
  private Boolean answerBoolean;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"answerDecimal\"")
  private Float answerDecimal;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"answerInteger\"")
  private Float answerInteger;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"answerDate\"")
  private String answerDate;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"answerDateTime\"")
  private String answerDateTime;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"answerTime\"")
  private String answerTime;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.persistence.Basic
  @Column(name="\"answerString\"")
  private String answerString;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.persistence.Basic
  @Column(name="\"answerUri\"")
  private String answerUri;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  * Actual type: Attachment
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"answerAttachment\"", length = 16777215)
  private String answerAttachment;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  * Actual type: Coding
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"answerCoding\"", length = 16777215)
  private String answerCoding;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"answerQuantity\"", length = 16777215)
  private String answerQuantity;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.persistence.Basic
  @Column(name="\"answerreference_id\"")
  private String answerreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`answerreference_id`", insertable=false, updatable=false)
  private ReferenceModel answerReference;

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

  public QuestionnaireEnableWhenModel() {
  }

  public QuestionnaireEnableWhenModel(QuestionnaireEnableWhen o) {
    this.id = o.getId();
      this.question = o.getQuestion();

      this.hasAnswer = o.getHasAnswer();

      this.answerBoolean = o.getAnswerBoolean();

      this.answerDecimal = o.getAnswerDecimal();

      this.answerInteger = o.getAnswerInteger();

      this.answerDate = o.getAnswerDate();

      this.answerDateTime = o.getAnswerDateTime();

      this.answerTime = o.getAnswerTime();

      this.answerString = o.getAnswerString();

      this.answerUri = o.getAnswerUri();

      this.answerAttachment = Attachment.toJson(o.getAnswerAttachment());
      this.answerCoding = Coding.toJson(o.getAnswerCoding());
      this.answerQuantity = Quantity.toJson(o.getAnswerQuantity());
      if (null != o.getAnswerReference()) {
      	this.answerreference_id = "answerReference" + this.getId();
        this.answerReference = new ReferenceModel(o.getAnswerReference());
        this.answerReference.setId(this.answerreference_id);
        this.answerReference.parent_id = this.answerReference.getId();
      }

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setQuestion( String value) {
    this.question = value;
  }
  public String getQuestion() {
    return this.question;
  }
  public void setHasAnswer( Boolean value) {
    this.hasAnswer = value;
  }
  public Boolean getHasAnswer() {
    return this.hasAnswer;
  }
  public void setAnswerBoolean( Boolean value) {
    this.answerBoolean = value;
  }
  public Boolean getAnswerBoolean() {
    return this.answerBoolean;
  }
  public void setAnswerDecimal( Float value) {
    this.answerDecimal = value;
  }
  public Float getAnswerDecimal() {
    return this.answerDecimal;
  }
  public void setAnswerInteger( Float value) {
    this.answerInteger = value;
  }
  public Float getAnswerInteger() {
    return this.answerInteger;
  }
  public void setAnswerDate( String value) {
    this.answerDate = value;
  }
  public String getAnswerDate() {
    return this.answerDate;
  }
  public void setAnswerDateTime( String value) {
    this.answerDateTime = value;
  }
  public String getAnswerDateTime() {
    return this.answerDateTime;
  }
  public void setAnswerTime( String value) {
    this.answerTime = value;
  }
  public String getAnswerTime() {
    return this.answerTime;
  }
  public void setAnswerString( String value) {
    this.answerString = value;
  }
  public String getAnswerString() {
    return this.answerString;
  }
  public void setAnswerUri( String value) {
    this.answerUri = value;
  }
  public String getAnswerUri() {
    return this.answerUri;
  }
  public void setAnswerAttachment( String value) {
    this.answerAttachment = value;
  }
  public String getAnswerAttachment() {
    return this.answerAttachment;
  }
  public void setAnswerCoding( String value) {
    this.answerCoding = value;
  }
  public String getAnswerCoding() {
    return this.answerCoding;
  }
  public void setAnswerQuantity( String value) {
    this.answerQuantity = value;
  }
  public String getAnswerQuantity() {
    return this.answerQuantity;
  }
  public void setAnswerReference( ReferenceModel value) {
    this.answerReference = value;
  }
  public ReferenceModel getAnswerReference() {
    return this.answerReference;
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
     builder.append("question" + "[" + String.valueOf(this.question) + "]\n"); 
     builder.append("hasAnswer" + "[" + String.valueOf(this.hasAnswer) + "]\n"); 
     builder.append("answerBoolean" + "[" + String.valueOf(this.answerBoolean) + "]\n"); 
     builder.append("answerDecimal" + "[" + String.valueOf(this.answerDecimal) + "]\n"); 
     builder.append("answerInteger" + "[" + String.valueOf(this.answerInteger) + "]\n"); 
     builder.append("answerDate" + "[" + String.valueOf(this.answerDate) + "]\n"); 
     builder.append("answerDateTime" + "[" + String.valueOf(this.answerDateTime) + "]\n"); 
     builder.append("answerTime" + "[" + String.valueOf(this.answerTime) + "]\n"); 
     builder.append("answerString" + "[" + String.valueOf(this.answerString) + "]\n"); 
     builder.append("answerUri" + "[" + String.valueOf(this.answerUri) + "]\n"); 
     builder.append("answerAttachment" + "[" + String.valueOf(this.answerAttachment) + "]\n"); 
     builder.append("answerCoding" + "[" + String.valueOf(this.answerCoding) + "]\n"); 
     builder.append("answerQuantity" + "[" + String.valueOf(this.answerQuantity) + "]\n"); 
     builder.append("answerReference" + "[" + String.valueOf(this.answerReference) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}