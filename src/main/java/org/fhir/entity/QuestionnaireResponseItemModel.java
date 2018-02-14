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
* "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to."
*/
@Entity
@Table(name="questionnaireresponseitem")
public class QuestionnaireResponseItemModel  implements Serializable {
	private static final long serialVersionUID = 151857669678810609L;
  /**
  * Description: "The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource."
  */
  @javax.persistence.Basic
  @Column(name="\"linkId\"")
  private String linkId;

  /**
  * Description: "A reference to an [[[ElementDefinition]]] that provides the details for the item."
  */
  @javax.persistence.Basic
  @Column(name="\"definition\"")
  private String definition;

  /**
  * Description: "Text that is displayed above the contents of the group or as the text of the question being answered."
  */
  @javax.persistence.Basic
  @Column(name="\"text\"")
  private String text;

  /**
  * Description: "More specific subject this section's answers are about, details the subject given in QuestionnaireResponse."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "The respondent's answer(s) to the question."
  */
  @javax.persistence.Basic
  @Column(name="\"answer_id\"")
  private String answer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="answer_id", insertable=false, updatable=false)
  private java.util.List<QuestionnaireResponseAnswerModel> answer;

  /**
  * Description: "Questions or sub-groups nested beneath a question or group."
  */
  @javax.persistence.Basic
  @Column(name="\"item_id\"")
  private String item_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="item_id", insertable=false, updatable=false)
  private java.util.List<QuestionnaireResponseItemModel> item;

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

  public QuestionnaireResponseItemModel() {
  }

  public QuestionnaireResponseItemModel(QuestionnaireResponseItem o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.linkId = o.getLinkId();
    this.definition = o.getDefinition();
    this.text = o.getText();
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.parent_id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    if (null != o.getAnswer() && !o.getAnswer().isEmpty()) {
    	this.answer_id = "answer" + this.parent_id;
    	this.answer = QuestionnaireResponseAnswerHelper.toModelFromArray(o.getAnswer(), this.answer_id);
    }
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item_id = "item" + this.parent_id;
    	this.item = QuestionnaireResponseItemHelper.toModelFromArray(o.getItem(), this.item_id);
    }
  }

  public String getLinkId() {
    return this.linkId;
  }
  public void setLinkId( String value) {
    this.linkId = value;
  }
  public String getDefinition() {
    return this.definition;
  }
  public void setDefinition( String value) {
    this.definition = value;
  }
  public String getText() {
    return this.text;
  }
  public void setText( String value) {
    this.text = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public java.util.List<QuestionnaireResponseAnswerModel> getAnswer() {
    return this.answer;
  }
  public void setAnswer( java.util.List<QuestionnaireResponseAnswerModel> value) {
    this.answer = value;
  }
  public java.util.List<QuestionnaireResponseItemModel> getItem() {
    return this.item;
  }
  public void setItem( java.util.List<QuestionnaireResponseItemModel> value) {
    this.item = value;
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
    builder.append("[QuestionnaireResponseItemModel]:" + "\n");
     builder.append("linkId" + "->" + this.linkId + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[QuestionnaireResponseItemModel]:" + "\n");
     builder.append("linkId" + "->" + this.linkId + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("answer" + "->" + this.answer + "\n"); 
     builder.append("item" + "->" + this.item + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}