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
import org.fhir.entity.QuestionnaireItemModel;
import com.google.gson.GsonBuilder;

/**
* "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection."
*/
public class QuestionnaireItem  {
  /**
  * Description: "An identifier that is unique within the Questionnaire allowing linkage to the equivalent item in a QuestionnaireResponse resource."
  */
  private String linkId;

  /**
  * Description: "Extensions for linkId"
  */
  private transient Element _linkId;

  /**
  * Description: "A reference to an [[[ElementDefinition]]] that provides the details for the item. If a definition is provided, then the following element values can be inferred from the definition: \n\n* code (ElementDefinition.code)\n* type (ElementDefinition.type)\n* required (ElementDefinition.min)\n* repeats (ElementDefinition.max)\n* maxLength (ElementDefinition.maxLength)\n* options (ElementDefinition.binding)\n\nAny information provided in these elements on a Questionnaire Item overrides the information from the definition."
  */
  private String definition;

  /**
  * Description: "Extensions for definition"
  */
  private transient Element _definition;

  /**
  * Description: "A terminology code that corresponds to this group or question (e.g. a code from LOINC, which defines many questions and answers)."
  */
  private java.util.List<Coding> code = new java.util.ArrayList<>();

  /**
  * Description: "A short label for a particular group, question or set of display text within the questionnaire used for reference by the individual completing the questionnaire."
  */
  private String prefix;

  /**
  * Description: "Extensions for prefix"
  */
  private transient Element _prefix;

  /**
  * Description: "The name of a section, the text of a question or text content for a display item."
  */
  private String text;

  /**
  * Description: "Extensions for text"
  */
  private transient Element _text;

  /**
  * Description: "The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.)."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true."
  */
  private java.util.List<QuestionnaireEnableWhen> enableWhen = new java.util.ArrayList<>();

  /**
  * Description: "An indication, if true, that the item must be present in a \"completed\" QuestionnaireResponse.  If false, the item may be skipped when answering the questionnaire."
  */
  private Boolean required;

  /**
  * Description: "Extensions for required"
  */
  private transient Element _required;

  /**
  * Description: "An indication, if true, that the item may occur multiple times in the response, collecting multiple answers answers for questions or multiple sets of answers for groups."
  */
  private Boolean repeats;

  /**
  * Description: "Extensions for repeats"
  */
  private transient Element _repeats;

  /**
  * Description: "An indication, when true, that the value cannot be changed by a human respondent to the Questionnaire."
  */
  private Boolean readOnly;

  /**
  * Description: "Extensions for readOnly"
  */
  private transient Element _readOnly;

  /**
  * Description: "The maximum number of characters that are permitted in the answer to be considered a \"valid\" QuestionnaireResponse."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float maxLength;

  /**
  * Description: "Extensions for maxLength"
  */
  private transient Element _maxLength;

  /**
  * Description: "A reference to a value set containing a list of codes representing permitted answers for a \"choice\" or \"open-choice\" question."
  */
  private Reference options;

  /**
  * Description: "One of the permitted answers for a \"choice\" or \"open-choice\" question."
  */
  private java.util.List<QuestionnaireOption> option = new java.util.ArrayList<>();

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  private Boolean initialBoolean;

  /**
  * Description: "Extensions for initialBoolean"
  */
  private transient Element _initialBoolean;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float initialDecimal;

  /**
  * Description: "Extensions for initialDecimal"
  */
  private transient Element _initialDecimal;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float initialInteger;

  /**
  * Description: "Extensions for initialInteger"
  */
  private transient Element _initialInteger;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String initialDate;

  /**
  * Description: "Extensions for initialDate"
  */
  private transient Element _initialDate;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String initialDateTime;

  /**
  * Description: "Extensions for initialDateTime"
  */
  private transient Element _initialDateTime;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  private String initialTime;

  /**
  * Description: "Extensions for initialTime"
  */
  private transient Element _initialTime;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  private String initialString;

  /**
  * Description: "Extensions for initialString"
  */
  private transient Element _initialString;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  private String initialUri;

  /**
  * Description: "Extensions for initialUri"
  */
  private transient Element _initialUri;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  private Attachment initialAttachment;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  private Coding initialCoding;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  private Quantity initialQuantity;

  /**
  * Description: "The value that should be defaulted when initially rendering the questionnaire for user input."
  */
  private Reference initialReference;

  /**
  * Description: "Text, questions and other groups to be nested beneath a question or group."
  */
  private java.util.List<QuestionnaireItem> item = new java.util.ArrayList<>();

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

  public QuestionnaireItem() {
  }

  public QuestionnaireItem(QuestionnaireItemModel o) {
    this.id = o.getId();
    if (null != o.getLinkId()) {
      this.linkId = o.getLinkId();
    }
    if (null != o.getDefinition()) {
      this.definition = o.getDefinition();
    }
    if (null != o.getPrefix()) {
      this.prefix = o.getPrefix();
    }
    if (null != o.getText()) {
      this.text = o.getText();
    }
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getEnableWhen() && !o.getEnableWhen().isEmpty()) {
    	this.enableWhen = QuestionnaireEnableWhenHelper.fromArray2Array(o.getEnableWhen());
    }
    if (null != o.getRequired()) {
      this.required = o.getRequired();
    }
    if (null != o.getRepeats()) {
      this.repeats = o.getRepeats();
    }
    if (null != o.getReadOnly()) {
      this.readOnly = o.getReadOnly();
    }
    if (null != o.getMaxLength()) {
      this.maxLength = o.getMaxLength();
    }
    if (null != o.getOptions() && !o.getOptions().isEmpty()) {
      this.options = new Reference(o.getOptions().get(0));
    }
    if (null != o.getOption() && !o.getOption().isEmpty()) {
    	this.option = QuestionnaireOptionHelper.fromArray2Array(o.getOption());
    }
    if (null != o.getInitialBoolean()) {
      this.initialBoolean = o.getInitialBoolean();
    }
    if (null != o.getInitialDecimal()) {
      this.initialDecimal = o.getInitialDecimal();
    }
    if (null != o.getInitialInteger()) {
      this.initialInteger = o.getInitialInteger();
    }
    if (null != o.getInitialDate()) {
      this.initialDate = o.getInitialDate();
    }
    if (null != o.getInitialDateTime()) {
      this.initialDateTime = o.getInitialDateTime();
    }
    if (null != o.getInitialTime()) {
      this.initialTime = o.getInitialTime();
    }
    if (null != o.getInitialString()) {
      this.initialString = o.getInitialString();
    }
    if (null != o.getInitialUri()) {
      this.initialUri = o.getInitialUri();
    }
    this.initialAttachment = AttachmentHelper.fromJson(o.getInitialAttachment());
    this.initialCoding = CodingHelper.fromJson(o.getInitialCoding());
    this.initialQuantity = QuantityHelper.fromJson(o.getInitialQuantity());
    if (null != o.getInitialReference() && !o.getInitialReference().isEmpty()) {
      this.initialReference = new Reference(o.getInitialReference().get(0));
    }
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item = QuestionnaireItemHelper.fromArray2Array(o.getItem());
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
  public void setCode( java.util.List<Coding> value) {
    this.code = value;
  }
  public java.util.List<Coding> getCode() {
    return this.code;
  }
  public void setPrefix( String value) {
    this.prefix = value;
  }
  public String getPrefix() {
    return this.prefix;
  }
  public void set_prefix( Element value) {
    this._prefix = value;
  }
  public Element get_prefix() {
    return this._prefix;
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
  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setEnableWhen( java.util.List<QuestionnaireEnableWhen> value) {
    this.enableWhen = value;
  }
  public java.util.List<QuestionnaireEnableWhen> getEnableWhen() {
    return this.enableWhen;
  }
  public void setRequired( Boolean value) {
    this.required = value;
  }
  public Boolean getRequired() {
    return this.required;
  }
  public void set_required( Element value) {
    this._required = value;
  }
  public Element get_required() {
    return this._required;
  }
  public void setRepeats( Boolean value) {
    this.repeats = value;
  }
  public Boolean getRepeats() {
    return this.repeats;
  }
  public void set_repeats( Element value) {
    this._repeats = value;
  }
  public Element get_repeats() {
    return this._repeats;
  }
  public void setReadOnly( Boolean value) {
    this.readOnly = value;
  }
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  public void set_readOnly( Element value) {
    this._readOnly = value;
  }
  public Element get_readOnly() {
    return this._readOnly;
  }
  public void setMaxLength( Float value) {
    this.maxLength = value;
  }
  public Float getMaxLength() {
    return this.maxLength;
  }
  public void set_maxLength( Element value) {
    this._maxLength = value;
  }
  public Element get_maxLength() {
    return this._maxLength;
  }
  public void setOptions( Reference value) {
    this.options = value;
  }
  public Reference getOptions() {
    return this.options;
  }
  public void setOption( java.util.List<QuestionnaireOption> value) {
    this.option = value;
  }
  public java.util.List<QuestionnaireOption> getOption() {
    return this.option;
  }
  public void setInitialBoolean( Boolean value) {
    this.initialBoolean = value;
  }
  public Boolean getInitialBoolean() {
    return this.initialBoolean;
  }
  public void set_initialBoolean( Element value) {
    this._initialBoolean = value;
  }
  public Element get_initialBoolean() {
    return this._initialBoolean;
  }
  public void setInitialDecimal( Float value) {
    this.initialDecimal = value;
  }
  public Float getInitialDecimal() {
    return this.initialDecimal;
  }
  public void set_initialDecimal( Element value) {
    this._initialDecimal = value;
  }
  public Element get_initialDecimal() {
    return this._initialDecimal;
  }
  public void setInitialInteger( Float value) {
    this.initialInteger = value;
  }
  public Float getInitialInteger() {
    return this.initialInteger;
  }
  public void set_initialInteger( Element value) {
    this._initialInteger = value;
  }
  public Element get_initialInteger() {
    return this._initialInteger;
  }
  public void setInitialDate( String value) {
    this.initialDate = value;
  }
  public String getInitialDate() {
    return this.initialDate;
  }
  public void set_initialDate( Element value) {
    this._initialDate = value;
  }
  public Element get_initialDate() {
    return this._initialDate;
  }
  public void setInitialDateTime( String value) {
    this.initialDateTime = value;
  }
  public String getInitialDateTime() {
    return this.initialDateTime;
  }
  public void set_initialDateTime( Element value) {
    this._initialDateTime = value;
  }
  public Element get_initialDateTime() {
    return this._initialDateTime;
  }
  public void setInitialTime( String value) {
    this.initialTime = value;
  }
  public String getInitialTime() {
    return this.initialTime;
  }
  public void set_initialTime( Element value) {
    this._initialTime = value;
  }
  public Element get_initialTime() {
    return this._initialTime;
  }
  public void setInitialString( String value) {
    this.initialString = value;
  }
  public String getInitialString() {
    return this.initialString;
  }
  public void set_initialString( Element value) {
    this._initialString = value;
  }
  public Element get_initialString() {
    return this._initialString;
  }
  public void setInitialUri( String value) {
    this.initialUri = value;
  }
  public String getInitialUri() {
    return this.initialUri;
  }
  public void set_initialUri( Element value) {
    this._initialUri = value;
  }
  public Element get_initialUri() {
    return this._initialUri;
  }
  public void setInitialAttachment( Attachment value) {
    this.initialAttachment = value;
  }
  public Attachment getInitialAttachment() {
    return this.initialAttachment;
  }
  public void setInitialCoding( Coding value) {
    this.initialCoding = value;
  }
  public Coding getInitialCoding() {
    return this.initialCoding;
  }
  public void setInitialQuantity( Quantity value) {
    this.initialQuantity = value;
  }
  public Quantity getInitialQuantity() {
    return this.initialQuantity;
  }
  public void setInitialReference( Reference value) {
    this.initialReference = value;
  }
  public Reference getInitialReference() {
    return this.initialReference;
  }
  public void setItem( java.util.List<QuestionnaireItem> value) {
    this.item = value;
  }
  public java.util.List<QuestionnaireItem> getItem() {
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
    builder.append("[QuestionnaireItem]:" + "\n");
     if(this.linkId != null) builder.append("linkId" + "->" + this.linkId.toString() + "\n"); 
     if(this._linkId != null) builder.append("_linkId" + "->" + this._linkId.toString() + "\n"); 
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this._definition != null) builder.append("_definition" + "->" + this._definition.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.prefix != null) builder.append("prefix" + "->" + this.prefix.toString() + "\n"); 
     if(this._prefix != null) builder.append("_prefix" + "->" + this._prefix.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this._text != null) builder.append("_text" + "->" + this._text.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.enableWhen != null) builder.append("enableWhen" + "->" + this.enableWhen.toString() + "\n"); 
     if(this.required != null) builder.append("required" + "->" + this.required.toString() + "\n"); 
     if(this._required != null) builder.append("_required" + "->" + this._required.toString() + "\n"); 
     if(this.repeats != null) builder.append("repeats" + "->" + this.repeats.toString() + "\n"); 
     if(this._repeats != null) builder.append("_repeats" + "->" + this._repeats.toString() + "\n"); 
     if(this.readOnly != null) builder.append("readOnly" + "->" + this.readOnly.toString() + "\n"); 
     if(this._readOnly != null) builder.append("_readOnly" + "->" + this._readOnly.toString() + "\n"); 
     if(this.maxLength != null) builder.append("maxLength" + "->" + this.maxLength.toString() + "\n"); 
     if(this._maxLength != null) builder.append("_maxLength" + "->" + this._maxLength.toString() + "\n"); 
     if(this.options != null) builder.append("options" + "->" + this.options.toString() + "\n"); 
     if(this.option != null) builder.append("option" + "->" + this.option.toString() + "\n"); 
     if(this.initialBoolean != null) builder.append("initialBoolean" + "->" + this.initialBoolean.toString() + "\n"); 
     if(this._initialBoolean != null) builder.append("_initialBoolean" + "->" + this._initialBoolean.toString() + "\n"); 
     if(this.initialDecimal != null) builder.append("initialDecimal" + "->" + this.initialDecimal.toString() + "\n"); 
     if(this._initialDecimal != null) builder.append("_initialDecimal" + "->" + this._initialDecimal.toString() + "\n"); 
     if(this.initialInteger != null) builder.append("initialInteger" + "->" + this.initialInteger.toString() + "\n"); 
     if(this._initialInteger != null) builder.append("_initialInteger" + "->" + this._initialInteger.toString() + "\n"); 
     if(this.initialDate != null) builder.append("initialDate" + "->" + this.initialDate.toString() + "\n"); 
     if(this._initialDate != null) builder.append("_initialDate" + "->" + this._initialDate.toString() + "\n"); 
     if(this.initialDateTime != null) builder.append("initialDateTime" + "->" + this.initialDateTime.toString() + "\n"); 
     if(this._initialDateTime != null) builder.append("_initialDateTime" + "->" + this._initialDateTime.toString() + "\n"); 
     if(this.initialTime != null) builder.append("initialTime" + "->" + this.initialTime.toString() + "\n"); 
     if(this._initialTime != null) builder.append("_initialTime" + "->" + this._initialTime.toString() + "\n"); 
     if(this.initialString != null) builder.append("initialString" + "->" + this.initialString.toString() + "\n"); 
     if(this._initialString != null) builder.append("_initialString" + "->" + this._initialString.toString() + "\n"); 
     if(this.initialUri != null) builder.append("initialUri" + "->" + this.initialUri.toString() + "\n"); 
     if(this._initialUri != null) builder.append("_initialUri" + "->" + this._initialUri.toString() + "\n"); 
     if(this.initialAttachment != null) builder.append("initialAttachment" + "->" + this.initialAttachment.toString() + "\n"); 
     if(this.initialCoding != null) builder.append("initialCoding" + "->" + this.initialCoding.toString() + "\n"); 
     if(this.initialQuantity != null) builder.append("initialQuantity" + "->" + this.initialQuantity.toString() + "\n"); 
     if(this.initialReference != null) builder.append("initialReference" + "->" + this.initialReference.toString() + "\n"); 
     if(this.item != null) builder.append("item" + "->" + this.item.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }

  public enum TypeEnum {
  	group,
  	display,
  	FHIRboolean,
  	decimal,
  	integer,
  	date,
  	dateTime,
  	time,
  	string,
  	text,
  	url,
  	choice,
  	openchoice,
  	attachment,
  	reference,
  	quantity,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "group" : { return group.toString(); }
  			case "display" : { return display.toString(); }
  			case "boolean" : { return FHIRboolean.toString(); }
  			case "decimal" : { return decimal.toString(); }
  			case "integer" : { return integer.toString(); }
  			case "date" : { return date.toString(); }
  			case "dateTime" : { return dateTime.toString(); }
  			case "time" : { return time.toString(); }
  			case "string" : { return string.toString(); }
  			case "text" : { return text.toString(); }
  			case "url" : { return url.toString(); }
  			case "choice" : { return choice.toString(); }
  			case "openchoice" : { return openchoice.toString(); }
  			case "attachment" : { return attachment.toString(); }
  			case "reference" : { return reference.toString(); }
  			case "quantity" : { return quantity.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}