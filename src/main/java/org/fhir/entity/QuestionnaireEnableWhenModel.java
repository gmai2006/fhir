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
import java.io.Serializable;
/**
* "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection."
*/
@Entity
@Table(name="questionnaireenablewhen")
public class QuestionnaireEnableWhenModel  implements Serializable {
	private static final long serialVersionUID = 151857669715978064L;
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
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"answerAttachment\"", length = 16777215)
  private String answerAttachment;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"answerCoding\"", length = 16777215)
  private String answerCoding;

  /**
  * Description: "An answer that the referenced question must match in order for the item to be enabled."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="answerreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> answerReference;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public QuestionnaireEnableWhenModel() {
  }

  public QuestionnaireEnableWhenModel(QuestionnaireEnableWhen o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
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
    this.answerAttachment = AttachmentHelper.toJson(o.getAnswerAttachment());
    this.answerCoding = CodingHelper.toJson(o.getAnswerCoding());
    this.answerQuantity = QuantityHelper.toJson(o.getAnswerQuantity());
    if (null != o.getAnswerReference() ) {
    	this.answerreference_id = "answerreference" + this.parent_id;
    	this.answerReference = ReferenceHelper.toModel(o.getAnswerReference(), this.answerreference_id);
    }
  }

  public String getQuestion() {
    return this.question;
  }
  public void setQuestion( String value) {
    this.question = value;
  }
  public Boolean getHasAnswer() {
    return this.hasAnswer;
  }
  public void setHasAnswer( Boolean value) {
    this.hasAnswer = value;
  }
  public Boolean getAnswerBoolean() {
    return this.answerBoolean;
  }
  public void setAnswerBoolean( Boolean value) {
    this.answerBoolean = value;
  }
  public Float getAnswerDecimal() {
    return this.answerDecimal;
  }
  public void setAnswerDecimal( Float value) {
    this.answerDecimal = value;
  }
  public Float getAnswerInteger() {
    return this.answerInteger;
  }
  public void setAnswerInteger( Float value) {
    this.answerInteger = value;
  }
  public String getAnswerDate() {
    return this.answerDate;
  }
  public void setAnswerDate( String value) {
    this.answerDate = value;
  }
  public String getAnswerDateTime() {
    return this.answerDateTime;
  }
  public void setAnswerDateTime( String value) {
    this.answerDateTime = value;
  }
  public String getAnswerTime() {
    return this.answerTime;
  }
  public void setAnswerTime( String value) {
    this.answerTime = value;
  }
  public String getAnswerString() {
    return this.answerString;
  }
  public void setAnswerString( String value) {
    this.answerString = value;
  }
  public String getAnswerUri() {
    return this.answerUri;
  }
  public void setAnswerUri( String value) {
    this.answerUri = value;
  }
  public String getAnswerAttachment() {
    return this.answerAttachment;
  }
  public void setAnswerAttachment( String value) {
    this.answerAttachment = value;
  }
  public String getAnswerCoding() {
    return this.answerCoding;
  }
  public void setAnswerCoding( String value) {
    this.answerCoding = value;
  }
  public String getAnswerQuantity() {
    return this.answerQuantity;
  }
  public void setAnswerQuantity( String value) {
    this.answerQuantity = value;
  }
  public java.util.List<ReferenceModel> getAnswerReference() {
    return this.answerReference;
  }
  public void setAnswerReference( java.util.List<ReferenceModel> value) {
    this.answerReference = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[QuestionnaireEnableWhenModel]:" + "\n");
     builder.append("question" + "->" + this.question + "\n"); 
     builder.append("hasAnswer" + "->" + this.hasAnswer + "\n"); 
     builder.append("answerBoolean" + "->" + this.answerBoolean + "\n"); 
     builder.append("answerDecimal" + "->" + this.answerDecimal + "\n"); 
     builder.append("answerInteger" + "->" + this.answerInteger + "\n"); 
     builder.append("answerDate" + "->" + this.answerDate + "\n"); 
     builder.append("answerDateTime" + "->" + this.answerDateTime + "\n"); 
     builder.append("answerTime" + "->" + this.answerTime + "\n"); 
     builder.append("answerString" + "->" + this.answerString + "\n"); 
     builder.append("answerUri" + "->" + this.answerUri + "\n"); 
     builder.append("answerAttachment" + "->" + this.answerAttachment + "\n"); 
     builder.append("answerCoding" + "->" + this.answerCoding + "\n"); 
     builder.append("answerQuantity" + "->" + this.answerQuantity + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[QuestionnaireEnableWhenModel]:" + "\n");
     builder.append("question" + "->" + this.question + "\n"); 
     builder.append("hasAnswer" + "->" + this.hasAnswer + "\n"); 
     builder.append("answerBoolean" + "->" + this.answerBoolean + "\n"); 
     builder.append("answerDecimal" + "->" + this.answerDecimal + "\n"); 
     builder.append("answerInteger" + "->" + this.answerInteger + "\n"); 
     builder.append("answerDate" + "->" + this.answerDate + "\n"); 
     builder.append("answerDateTime" + "->" + this.answerDateTime + "\n"); 
     builder.append("answerTime" + "->" + this.answerTime + "\n"); 
     builder.append("answerString" + "->" + this.answerString + "\n"); 
     builder.append("answerUri" + "->" + this.answerUri + "\n"); 
     builder.append("answerAttachment" + "->" + this.answerAttachment + "\n"); 
     builder.append("answerCoding" + "->" + this.answerCoding + "\n"); 
     builder.append("answerQuantity" + "->" + this.answerQuantity + "\n"); 
     builder.append("answerReference" + "->" + this.answerReference + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}