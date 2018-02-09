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
@Table(name="questionnaireresponseitem")
public class QuestionnaireResponseItemModel  {
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "The respondent's answer(s) to the question."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<QuestionnaireResponseAnswerModel> answer = new java.util.ArrayList<>();

  /**
  * Description: "Questions or sub-groups nested beneath a question or group."
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

  public QuestionnaireResponseItemModel() {
  }

  public QuestionnaireResponseItemModel(QuestionnaireResponseItem o) {
    this.id = o.getId();
      this.linkId = o.getLinkId();

      this.definition = o.getDefinition();

      this.text = o.getText();

      if (null != o.getSubject()) {
      	this.subject_id = "subject" + this.getId();
        this.subject = new ReferenceModel(o.getSubject());
        this.subject.setId(this.subject_id);
        this.subject.parent_id = this.subject.getId();
      }

      this.answer = QuestionnaireResponseAnswer.toModelArray(o.getAnswer());

      this.item = QuestionnaireResponseItem.toModelArray(o.getItem());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setLinkId( String value) {
    this.linkId = value;
  }
  public String getLinkId() {
    return this.linkId;
  }
  public void setDefinition( String value) {
    this.definition = value;
  }
  public String getDefinition() {
    return this.definition;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }
  public void setSubject( ReferenceModel value) {
    this.subject = value;
  }
  public ReferenceModel getSubject() {
    return this.subject;
  }
  public void setAnswer( java.util.List<QuestionnaireResponseAnswerModel> value) {
    this.answer = value;
  }
  public java.util.List<QuestionnaireResponseAnswerModel> getAnswer() {
    return this.answer;
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
     builder.append("linkId" + "[" + String.valueOf(this.linkId) + "]\n"); 
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("answer" + "[" + String.valueOf(this.answer) + "]\n"); 
     builder.append("item" + "[" + String.valueOf(this.item) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}