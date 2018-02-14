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
@Table(name="questionnaireitem")
public class QuestionnaireItemModel  implements Serializable {
	private static final long serialVersionUID = 151857669693065346L;
  /**
  * Description: "An identifier that is unique within the Questionnaire allowing linkage to the equivalent item in a QuestionnaireResponse resource."
  */
  @javax.persistence.Basic
  @Column(name="\"linkId\"")
  private String linkId;

  /**
  * Description: "A reference to an [[[ElementDefinition]]] that provides the details for the item. If a definition is provided, then the following element values can be inferred from the definition: \n\n* code (ElementDefinition.code)\n* type (ElementDefinition.type)\n* required (ElementDefinition.min)\n* repeats (ElementDefinition.max)\n* maxLength (ElementDefinition.maxLength)\n* options (ElementDefinition.binding)\n\nAny information provided in these elements on a Questionnaire Item overrides the information from the definition."
  */
  @javax.persistence.Basic
  @Column(name="\"definition\"")
  private String definition;

  /**
  * Description: "A terminology code that corresponds to this group or question (e.g. a code from LOINC, which defines many questions and answers)."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "A short label for a particular group, question or set of display text within the questionnaire used for reference by the individual completing the questionnaire."
  */
  @javax.persistence.Basic
  @Column(name="\"prefix\"")
  private String prefix;

  /**
  * Description: "The name of a section, the text of a question or text content for a display item."
  */
  @javax.persistence.Basic
  @Column(name="\"text\"")
  private String text;

  /**
  * Description: "The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.)."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true."
  */
  @javax.persistence.Basic
  @Column(name="\"enablewhen_id\"")
  private String enablewhen_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="enablewhen_id", insertable=false, updatable=false)
  private java.util.List<QuestionnaireEnableWhenModel> enableWhen;

  /**
  * Description: "An indication, if true, that the item must be present in a \"completed\" QuestionnaireResponse.  If false, the item may be skipped when answering the questionnaire."
  */
  @javax.persistence.Basic
  @Column(name="\"required\"")
  private Boolean required;

  /**
  * Description: "An indication, if true, that the item may occur multiple times in the response, collecting multiple answers answers for questions or multiple sets of answers for groups."
  */
  @javax.persistence.Basic
  @Column(name="\"repeats\"")
  private Boolean repeats;

  /**
  * Description: "An indication, when true, that the value cannot be changed by a human respondent to the Questionnaire."
  */
  @javax.persistence.Basic
  @Column(name="\"readOnly\"")
  private Boolean readOnly;

  /**
  * Description: "The maximum number of characters that are permitted in the answer to be considered a \"valid\" QuestionnaireResponse."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"maxLength\"")
  private Float maxLength;

  /**
  * Description: "A reference to a value set containing a list of codes representing permitted answers for a \"choice\" or \"open-choice\" question."
  */
  @javax.persistence.Basic
  @Column(name="\"options_id\"")
  private String options_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="options_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> options;

  /**
  * Description: "One of the permitted answers for a \"choice\" or \"open-choice\" question."
  */
  @javax.persistence.Basic
  @Column(name="\"option_id\"")
  private String option_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="option_id", insertable=false, updatable=false)
  private java.util.List<QuestionnaireOptionModel> option;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.persistence.Basic
  @Column(name="\"initialBoolean\"")
  private Boolean initialBoolean;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"initialDecimal\"")
  private Float initialDecimal;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"initialInteger\"")
  private Float initialInteger;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"initialDate\"")
  private String initialDate;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"initialDateTime\"")
  private String initialDateTime;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"initialTime\"")
  private String initialTime;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.persistence.Basic
  @Column(name="\"initialString\"")
  private String initialString;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.persistence.Basic
  @Column(name="\"initialUri\"")
  private String initialUri;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"initialAttachment\"", length = 16777215)
  private String initialAttachment;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"initialCoding\"", length = 16777215)
  private String initialCoding;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"initialQuantity\"", length = 16777215)
  private String initialQuantity;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.persistence.Basic
  @Column(name="\"initialreference_id\"")
  private String initialreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="initialreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> initialReference;

  /**
  * Description: "Text, questions and other groups to be nested beneath a question or group."
  */
  @javax.persistence.Basic
  @Column(name="\"item_id\"")
  private String item_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="item_id", insertable=false, updatable=false)
  private java.util.List<QuestionnaireItemModel> item;

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

  public QuestionnaireItemModel() {
  }

  public QuestionnaireItemModel(QuestionnaireItem o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.linkId = o.getLinkId();
    this.definition = o.getDefinition();
    this.prefix = o.getPrefix();
    this.text = o.getText();
    this.type = o.getType();
    if (null != o.getEnableWhen() && !o.getEnableWhen().isEmpty()) {
    	this.enablewhen_id = "enablewhen" + this.parent_id;
    	this.enableWhen = QuestionnaireEnableWhenHelper.toModelFromArray(o.getEnableWhen(), this.enablewhen_id);
    }
    this.required = o.getRequired();
    this.repeats = o.getRepeats();
    this.readOnly = o.getReadOnly();
    this.maxLength = o.getMaxLength();
    if (null != o.getOptions() ) {
    	this.options_id = "options" + this.parent_id;
    	this.options = ReferenceHelper.toModel(o.getOptions(), this.options_id);
    }
    if (null != o.getOption() && !o.getOption().isEmpty()) {
    	this.option_id = "option" + this.parent_id;
    	this.option = QuestionnaireOptionHelper.toModelFromArray(o.getOption(), this.option_id);
    }
    this.initialBoolean = o.getInitialBoolean();
    this.initialDecimal = o.getInitialDecimal();
    this.initialInteger = o.getInitialInteger();
    this.initialDate = o.getInitialDate();
    this.initialDateTime = o.getInitialDateTime();
    this.initialTime = o.getInitialTime();
    this.initialString = o.getInitialString();
    this.initialUri = o.getInitialUri();
    this.initialAttachment = AttachmentHelper.toJson(o.getInitialAttachment());
    this.initialCoding = CodingHelper.toJson(o.getInitialCoding());
    this.initialQuantity = QuantityHelper.toJson(o.getInitialQuantity());
    if (null != o.getInitialReference() ) {
    	this.initialreference_id = "initialreference" + this.parent_id;
    	this.initialReference = ReferenceHelper.toModel(o.getInitialReference(), this.initialreference_id);
    }
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item_id = "item" + this.parent_id;
    	this.item = QuestionnaireItemHelper.toModelFromArray(o.getItem(), this.item_id);
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
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getPrefix() {
    return this.prefix;
  }
  public void setPrefix( String value) {
    this.prefix = value;
  }
  public String getText() {
    return this.text;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public java.util.List<QuestionnaireEnableWhenModel> getEnableWhen() {
    return this.enableWhen;
  }
  public void setEnableWhen( java.util.List<QuestionnaireEnableWhenModel> value) {
    this.enableWhen = value;
  }
  public Boolean getRequired() {
    return this.required;
  }
  public void setRequired( Boolean value) {
    this.required = value;
  }
  public Boolean getRepeats() {
    return this.repeats;
  }
  public void setRepeats( Boolean value) {
    this.repeats = value;
  }
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  public void setReadOnly( Boolean value) {
    this.readOnly = value;
  }
  public Float getMaxLength() {
    return this.maxLength;
  }
  public void setMaxLength( Float value) {
    this.maxLength = value;
  }
  public java.util.List<ReferenceModel> getOptions() {
    return this.options;
  }
  public void setOptions( java.util.List<ReferenceModel> value) {
    this.options = value;
  }
  public java.util.List<QuestionnaireOptionModel> getOption() {
    return this.option;
  }
  public void setOption( java.util.List<QuestionnaireOptionModel> value) {
    this.option = value;
  }
  public Boolean getInitialBoolean() {
    return this.initialBoolean;
  }
  public void setInitialBoolean( Boolean value) {
    this.initialBoolean = value;
  }
  public Float getInitialDecimal() {
    return this.initialDecimal;
  }
  public void setInitialDecimal( Float value) {
    this.initialDecimal = value;
  }
  public Float getInitialInteger() {
    return this.initialInteger;
  }
  public void setInitialInteger( Float value) {
    this.initialInteger = value;
  }
  public String getInitialDate() {
    return this.initialDate;
  }
  public void setInitialDate( String value) {
    this.initialDate = value;
  }
  public String getInitialDateTime() {
    return this.initialDateTime;
  }
  public void setInitialDateTime( String value) {
    this.initialDateTime = value;
  }
  public String getInitialTime() {
    return this.initialTime;
  }
  public void setInitialTime( String value) {
    this.initialTime = value;
  }
  public String getInitialString() {
    return this.initialString;
  }
  public void setInitialString( String value) {
    this.initialString = value;
  }
  public String getInitialUri() {
    return this.initialUri;
  }
  public void setInitialUri( String value) {
    this.initialUri = value;
  }
  public String getInitialAttachment() {
    return this.initialAttachment;
  }
  public void setInitialAttachment( String value) {
    this.initialAttachment = value;
  }
  public String getInitialCoding() {
    return this.initialCoding;
  }
  public void setInitialCoding( String value) {
    this.initialCoding = value;
  }
  public String getInitialQuantity() {
    return this.initialQuantity;
  }
  public void setInitialQuantity( String value) {
    this.initialQuantity = value;
  }
  public java.util.List<ReferenceModel> getInitialReference() {
    return this.initialReference;
  }
  public void setInitialReference( java.util.List<ReferenceModel> value) {
    this.initialReference = value;
  }
  public java.util.List<QuestionnaireItemModel> getItem() {
    return this.item;
  }
  public void setItem( java.util.List<QuestionnaireItemModel> value) {
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
    builder.append("[QuestionnaireItemModel]:" + "\n");
     builder.append("linkId" + "->" + this.linkId + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("prefix" + "->" + this.prefix + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("required" + "->" + this.required + "\n"); 
     builder.append("repeats" + "->" + this.repeats + "\n"); 
     builder.append("readOnly" + "->" + this.readOnly + "\n"); 
     builder.append("maxLength" + "->" + this.maxLength + "\n"); 
     builder.append("initialBoolean" + "->" + this.initialBoolean + "\n"); 
     builder.append("initialDecimal" + "->" + this.initialDecimal + "\n"); 
     builder.append("initialInteger" + "->" + this.initialInteger + "\n"); 
     builder.append("initialDate" + "->" + this.initialDate + "\n"); 
     builder.append("initialDateTime" + "->" + this.initialDateTime + "\n"); 
     builder.append("initialTime" + "->" + this.initialTime + "\n"); 
     builder.append("initialString" + "->" + this.initialString + "\n"); 
     builder.append("initialUri" + "->" + this.initialUri + "\n"); 
     builder.append("initialAttachment" + "->" + this.initialAttachment + "\n"); 
     builder.append("initialCoding" + "->" + this.initialCoding + "\n"); 
     builder.append("initialQuantity" + "->" + this.initialQuantity + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[QuestionnaireItemModel]:" + "\n");
     builder.append("linkId" + "->" + this.linkId + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("prefix" + "->" + this.prefix + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("enableWhen" + "->" + this.enableWhen + "\n"); 
     builder.append("required" + "->" + this.required + "\n"); 
     builder.append("repeats" + "->" + this.repeats + "\n"); 
     builder.append("readOnly" + "->" + this.readOnly + "\n"); 
     builder.append("maxLength" + "->" + this.maxLength + "\n"); 
     builder.append("options" + "->" + this.options + "\n"); 
     builder.append("option" + "->" + this.option + "\n"); 
     builder.append("initialBoolean" + "->" + this.initialBoolean + "\n"); 
     builder.append("initialDecimal" + "->" + this.initialDecimal + "\n"); 
     builder.append("initialInteger" + "->" + this.initialInteger + "\n"); 
     builder.append("initialDate" + "->" + this.initialDate + "\n"); 
     builder.append("initialDateTime" + "->" + this.initialDateTime + "\n"); 
     builder.append("initialTime" + "->" + this.initialTime + "\n"); 
     builder.append("initialString" + "->" + this.initialString + "\n"); 
     builder.append("initialUri" + "->" + this.initialUri + "\n"); 
     builder.append("initialAttachment" + "->" + this.initialAttachment + "\n"); 
     builder.append("initialCoding" + "->" + this.initialCoding + "\n"); 
     builder.append("initialQuantity" + "->" + this.initialQuantity + "\n"); 
     builder.append("initialReference" + "->" + this.initialReference + "\n"); 
     builder.append("item" + "->" + this.item + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}