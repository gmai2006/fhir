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
import org.fhir.entity.QuestionnaireEnableWhenModel;
import com.google.gson.GsonBuilder;

/**
* "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection."
*/
public class QuestionnaireEnableWhen  {
  /**
  * Description: "The linkId for the question whose answer (or lack of answer) governs whether this item is enabled."
  */
  private String question;

  /**
  * Description: "Extensions for question"
  */
  private transient Element _question;

  /**
  * Description: "An indication that this item should be enabled only if the specified question is answered (hasAnswer=true) or not answered (hasAnswer=false)."
  */
  private Boolean hasAnswer;

  /**
  * Description: "Extensions for hasAnswer"
  */
  private transient Element _hasAnswer;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  private Boolean answerBoolean;

  /**
  * Description: "Extensions for answerBoolean"
  */
  private transient Element _answerBoolean;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float answerDecimal;

  /**
  * Description: "Extensions for answerDecimal"
  */
  private transient Element _answerDecimal;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float answerInteger;

  /**
  * Description: "Extensions for answerInteger"
  */
  private transient Element _answerInteger;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String answerDate;

  /**
  * Description: "Extensions for answerDate"
  */
  private transient Element _answerDate;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String answerDateTime;

  /**
  * Description: "Extensions for answerDateTime"
  */
  private transient Element _answerDateTime;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  private String answerTime;

  /**
  * Description: "Extensions for answerTime"
  */
  private transient Element _answerTime;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  private String answerString;

  /**
  * Description: "Extensions for answerString"
  */
  private transient Element _answerString;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  private String answerUri;

  /**
  * Description: "Extensions for answerUri"
  */
  private transient Element _answerUri;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  private Attachment answerAttachment;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  private Coding answerCoding;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  private Quantity answerQuantity;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  */
  private Reference answerReference;

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
  @javax.validation.constraints.NotNull
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

  public QuestionnaireEnableWhen() {
  }

  public QuestionnaireEnableWhen(QuestionnaireEnableWhenModel o) {
    this.id = o.getId();
    if (null != o.getQuestion()) {
      this.question = o.getQuestion();
    }
    if (null != o.getHasAnswer()) {
      this.hasAnswer = o.getHasAnswer();
    }
    if (null != o.getAnswerBoolean()) {
      this.answerBoolean = o.getAnswerBoolean();
    }
    if (null != o.getAnswerDecimal()) {
      this.answerDecimal = o.getAnswerDecimal();
    }
    if (null != o.getAnswerInteger()) {
      this.answerInteger = o.getAnswerInteger();
    }
    if (null != o.getAnswerDate()) {
      this.answerDate = o.getAnswerDate();
    }
    if (null != o.getAnswerDateTime()) {
      this.answerDateTime = o.getAnswerDateTime();
    }
    if (null != o.getAnswerTime()) {
      this.answerTime = o.getAnswerTime();
    }
    if (null != o.getAnswerString()) {
      this.answerString = o.getAnswerString();
    }
    if (null != o.getAnswerUri()) {
      this.answerUri = o.getAnswerUri();
    }
    this.answerAttachment = AttachmentHelper.fromJson(o.getAnswerAttachment());
    this.answerCoding = CodingHelper.fromJson(o.getAnswerCoding());
    this.answerQuantity = QuantityHelper.fromJson(o.getAnswerQuantity());
    if (null != o.getAnswerReference() && !o.getAnswerReference().isEmpty()) {
      this.answerReference = new Reference(o.getAnswerReference().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setQuestion( String value) {
    this.question = value;
  }
  public String getQuestion() {
    return this.question;
  }
  public void set_question( Element value) {
    this._question = value;
  }
  public Element get_question() {
    return this._question;
  }
  public void setHasAnswer( Boolean value) {
    this.hasAnswer = value;
  }
  public Boolean getHasAnswer() {
    return this.hasAnswer;
  }
  public void set_hasAnswer( Element value) {
    this._hasAnswer = value;
  }
  public Element get_hasAnswer() {
    return this._hasAnswer;
  }
  public void setAnswerBoolean( Boolean value) {
    this.answerBoolean = value;
  }
  public Boolean getAnswerBoolean() {
    return this.answerBoolean;
  }
  public void set_answerBoolean( Element value) {
    this._answerBoolean = value;
  }
  public Element get_answerBoolean() {
    return this._answerBoolean;
  }
  public void setAnswerDecimal( Float value) {
    this.answerDecimal = value;
  }
  public Float getAnswerDecimal() {
    return this.answerDecimal;
  }
  public void set_answerDecimal( Element value) {
    this._answerDecimal = value;
  }
  public Element get_answerDecimal() {
    return this._answerDecimal;
  }
  public void setAnswerInteger( Float value) {
    this.answerInteger = value;
  }
  public Float getAnswerInteger() {
    return this.answerInteger;
  }
  public void set_answerInteger( Element value) {
    this._answerInteger = value;
  }
  public Element get_answerInteger() {
    return this._answerInteger;
  }
  public void setAnswerDate( String value) {
    this.answerDate = value;
  }
  public String getAnswerDate() {
    return this.answerDate;
  }
  public void set_answerDate( Element value) {
    this._answerDate = value;
  }
  public Element get_answerDate() {
    return this._answerDate;
  }
  public void setAnswerDateTime( String value) {
    this.answerDateTime = value;
  }
  public String getAnswerDateTime() {
    return this.answerDateTime;
  }
  public void set_answerDateTime( Element value) {
    this._answerDateTime = value;
  }
  public Element get_answerDateTime() {
    return this._answerDateTime;
  }
  public void setAnswerTime( String value) {
    this.answerTime = value;
  }
  public String getAnswerTime() {
    return this.answerTime;
  }
  public void set_answerTime( Element value) {
    this._answerTime = value;
  }
  public Element get_answerTime() {
    return this._answerTime;
  }
  public void setAnswerString( String value) {
    this.answerString = value;
  }
  public String getAnswerString() {
    return this.answerString;
  }
  public void set_answerString( Element value) {
    this._answerString = value;
  }
  public Element get_answerString() {
    return this._answerString;
  }
  public void setAnswerUri( String value) {
    this.answerUri = value;
  }
  public String getAnswerUri() {
    return this.answerUri;
  }
  public void set_answerUri( Element value) {
    this._answerUri = value;
  }
  public Element get_answerUri() {
    return this._answerUri;
  }
  public void setAnswerAttachment( Attachment value) {
    this.answerAttachment = value;
  }
  public Attachment getAnswerAttachment() {
    return this.answerAttachment;
  }
  public void setAnswerCoding( Coding value) {
    this.answerCoding = value;
  }
  public Coding getAnswerCoding() {
    return this.answerCoding;
  }
  public void setAnswerQuantity( Quantity value) {
    this.answerQuantity = value;
  }
  public Quantity getAnswerQuantity() {
    return this.answerQuantity;
  }
  public void setAnswerReference( Reference value) {
    this.answerReference = value;
  }
  public Reference getAnswerReference() {
    return this.answerReference;
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
    builder.append("[QuestionnaireEnableWhen]:" + "\n");
     if(this.question != null) builder.append("question" + "->" + this.question.toString() + "\n"); 
     if(this._question != null) builder.append("_question" + "->" + this._question.toString() + "\n"); 
     if(this.hasAnswer != null) builder.append("hasAnswer" + "->" + this.hasAnswer.toString() + "\n"); 
     if(this._hasAnswer != null) builder.append("_hasAnswer" + "->" + this._hasAnswer.toString() + "\n"); 
     if(this.answerBoolean != null) builder.append("answerBoolean" + "->" + this.answerBoolean.toString() + "\n"); 
     if(this._answerBoolean != null) builder.append("_answerBoolean" + "->" + this._answerBoolean.toString() + "\n"); 
     if(this.answerDecimal != null) builder.append("answerDecimal" + "->" + this.answerDecimal.toString() + "\n"); 
     if(this._answerDecimal != null) builder.append("_answerDecimal" + "->" + this._answerDecimal.toString() + "\n"); 
     if(this.answerInteger != null) builder.append("answerInteger" + "->" + this.answerInteger.toString() + "\n"); 
     if(this._answerInteger != null) builder.append("_answerInteger" + "->" + this._answerInteger.toString() + "\n"); 
     if(this.answerDate != null) builder.append("answerDate" + "->" + this.answerDate.toString() + "\n"); 
     if(this._answerDate != null) builder.append("_answerDate" + "->" + this._answerDate.toString() + "\n"); 
     if(this.answerDateTime != null) builder.append("answerDateTime" + "->" + this.answerDateTime.toString() + "\n"); 
     if(this._answerDateTime != null) builder.append("_answerDateTime" + "->" + this._answerDateTime.toString() + "\n"); 
     if(this.answerTime != null) builder.append("answerTime" + "->" + this.answerTime.toString() + "\n"); 
     if(this._answerTime != null) builder.append("_answerTime" + "->" + this._answerTime.toString() + "\n"); 
     if(this.answerString != null) builder.append("answerString" + "->" + this.answerString.toString() + "\n"); 
     if(this._answerString != null) builder.append("_answerString" + "->" + this._answerString.toString() + "\n"); 
     if(this.answerUri != null) builder.append("answerUri" + "->" + this.answerUri.toString() + "\n"); 
     if(this._answerUri != null) builder.append("_answerUri" + "->" + this._answerUri.toString() + "\n"); 
     if(this.answerAttachment != null) builder.append("answerAttachment" + "->" + this.answerAttachment.toString() + "\n"); 
     if(this.answerCoding != null) builder.append("answerCoding" + "->" + this.answerCoding.toString() + "\n"); 
     if(this.answerQuantity != null) builder.append("answerQuantity" + "->" + this.answerQuantity.toString() + "\n"); 
     if(this.answerReference != null) builder.append("answerReference" + "->" + this.answerReference.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}