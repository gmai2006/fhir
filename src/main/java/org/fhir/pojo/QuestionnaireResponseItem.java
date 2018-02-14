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
import org.fhir.entity.QuestionnaireResponseItemModel;
import com.google.gson.GsonBuilder;

/**
* "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to."
*/
public class QuestionnaireResponseItem  {
  /**
  * Description: "The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource."
  */
  private String linkId;

  /**
  * Description: "Extensions for linkId"
  */
  private transient Element _linkId;

  /**
  * Description: "A reference to an [[[ElementDefinition]]] that provides the details for the item."
  */
  private String definition;

  /**
  * Description: "Extensions for definition"
  */
  private transient Element _definition;

  /**
  * Description: "Text that is displayed above the contents of the group or as the text of the question being answered."
  */
  private String text;

  /**
  * Description: "Extensions for text"
  */
  private transient Element _text;

  /**
  * Description: "More specific subject this section's answers are about, details the subject given in QuestionnaireResponse."
  */
  private Reference subject;

  /**
  * Description: "The respondent's answer(s) to the question."
  */
  private java.util.List<QuestionnaireResponseAnswer> answer = new java.util.ArrayList<>();

  /**
  * Description: "Questions or sub-groups nested beneath a question or group."
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

  public QuestionnaireResponseItem() {
  }

  public QuestionnaireResponseItem(QuestionnaireResponseItemModel o) {
    this.id = o.getId();
    if (null != o.getLinkId()) {
      this.linkId = o.getLinkId();
    }
    if (null != o.getDefinition()) {
      this.definition = o.getDefinition();
    }
    if (null != o.getText()) {
      this.text = o.getText();
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getAnswer() && !o.getAnswer().isEmpty()) {
    	this.answer = QuestionnaireResponseAnswerHelper.fromArray2Array(o.getAnswer());
    }
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item = QuestionnaireResponseItemHelper.fromArray2Array(o.getItem());
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setLinkId( String value) {
    this.linkId = value;
  }
  public String getLinkId() {
    return this.linkId;
  }
  public void set_linkId( Element value) {
    this._linkId = value;
  }
  public Element get_linkId() {
    return this._linkId;
  }
  public void setDefinition( String value) {
    this.definition = value;
  }
  public String getDefinition() {
    return this.definition;
  }
  public void set_definition( Element value) {
    this._definition = value;
  }
  public Element get_definition() {
    return this._definition;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }
  public void set_text( Element value) {
    this._text = value;
  }
  public Element get_text() {
    return this._text;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setAnswer( java.util.List<QuestionnaireResponseAnswer> value) {
    this.answer = value;
  }
  public java.util.List<QuestionnaireResponseAnswer> getAnswer() {
    return this.answer;
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
    builder.append("[QuestionnaireResponseItem]:" + "\n");
     if(this.linkId != null) builder.append("linkId" + "->" + this.linkId.toString() + "\n"); 
     if(this._linkId != null) builder.append("_linkId" + "->" + this._linkId.toString() + "\n"); 
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this._definition != null) builder.append("_definition" + "->" + this._definition.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this._text != null) builder.append("_text" + "->" + this._text.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.answer != null) builder.append("answer" + "->" + this.answer.toString() + "\n"); 
     if(this.item != null) builder.append("item" + "->" + this.item.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}