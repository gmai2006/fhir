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
        this.question = new String(o.getQuestion());
      }

      if (null != o.getHasAnswer()) {
        this.hasAnswer = new Boolean(o.getHasAnswer());
      }

      if (null != o.getAnswerBoolean()) {
        this.answerBoolean = new Boolean(o.getAnswerBoolean());
      }

      if (null != o.getAnswerDecimal()) {
        this.answerDecimal = new Float(o.getAnswerDecimal());
      }

      if (null != o.getAnswerInteger()) {
        this.answerInteger = new Float(o.getAnswerInteger());
      }

      if (null != o.getAnswerDate()) {
        this.answerDate = new String(o.getAnswerDate());
      }

      if (null != o.getAnswerDateTime()) {
        this.answerDateTime = new String(o.getAnswerDateTime());
      }

      if (null != o.getAnswerTime()) {
        this.answerTime = new String(o.getAnswerTime());
      }

      if (null != o.getAnswerString()) {
        this.answerString = new String(o.getAnswerString());
      }

      if (null != o.getAnswerUri()) {
        this.answerUri = new String(o.getAnswerUri());
      }

      this.answerAttachment = Attachment.fromJson(o.getAnswerAttachment());
      this.answerCoding = Coding.fromJson(o.getAnswerCoding());
      this.answerQuantity = Quantity.fromJson(o.getAnswerQuantity());
      if (null != o.getAnswerReference()) {
        this.answerReference = new Reference(o.getAnswerReference());
        this.answerReference.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("question" + "[" + String.valueOf(this.question) + "]\n"); 
     builder.append("_question" + "[" + String.valueOf(this._question) + "]\n"); 
     builder.append("hasAnswer" + "[" + String.valueOf(this.hasAnswer) + "]\n"); 
     builder.append("_hasAnswer" + "[" + String.valueOf(this._hasAnswer) + "]\n"); 
     builder.append("answerBoolean" + "[" + String.valueOf(this.answerBoolean) + "]\n"); 
     builder.append("_answerBoolean" + "[" + String.valueOf(this._answerBoolean) + "]\n"); 
     builder.append("answerDecimal" + "[" + String.valueOf(this.answerDecimal) + "]\n"); 
     builder.append("_answerDecimal" + "[" + String.valueOf(this._answerDecimal) + "]\n"); 
     builder.append("answerInteger" + "[" + String.valueOf(this.answerInteger) + "]\n"); 
     builder.append("_answerInteger" + "[" + String.valueOf(this._answerInteger) + "]\n"); 
     builder.append("answerDate" + "[" + String.valueOf(this.answerDate) + "]\n"); 
     builder.append("_answerDate" + "[" + String.valueOf(this._answerDate) + "]\n"); 
     builder.append("answerDateTime" + "[" + String.valueOf(this.answerDateTime) + "]\n"); 
     builder.append("_answerDateTime" + "[" + String.valueOf(this._answerDateTime) + "]\n"); 
     builder.append("answerTime" + "[" + String.valueOf(this.answerTime) + "]\n"); 
     builder.append("_answerTime" + "[" + String.valueOf(this._answerTime) + "]\n"); 
     builder.append("answerString" + "[" + String.valueOf(this.answerString) + "]\n"); 
     builder.append("_answerString" + "[" + String.valueOf(this._answerString) + "]\n"); 
     builder.append("answerUri" + "[" + String.valueOf(this.answerUri) + "]\n"); 
     builder.append("_answerUri" + "[" + String.valueOf(this._answerUri) + "]\n"); 
     builder.append("answerAttachment" + "[" + String.valueOf(this.answerAttachment) + "]\n"); 
     builder.append("answerCoding" + "[" + String.valueOf(this.answerCoding) + "]\n"); 
     builder.append("answerQuantity" + "[" + String.valueOf(this.answerQuantity) + "]\n"); 
     builder.append("answerReference" + "[" + String.valueOf(this.answerReference) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<QuestionnaireEnableWhen> fromArray(java.util.List<QuestionnaireEnableWhenModel> list) {
    return (java.util.List<QuestionnaireEnableWhen>)list.stream()
      .map(model -> new QuestionnaireEnableWhen(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<QuestionnaireEnableWhenModel> toModelArray(java.util.List<QuestionnaireEnableWhen> list) {
    return (java.util.List<QuestionnaireEnableWhenModel>)list.stream()
      .map(model -> new QuestionnaireEnableWhenModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static QuestionnaireEnableWhen fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, QuestionnaireEnableWhen.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(QuestionnaireEnableWhen o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<QuestionnaireEnableWhen> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}