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
        this.linkId = new String(o.getLinkId());
      }

      if (null != o.getDefinition()) {
        this.definition = new String(o.getDefinition());
      }

      this.code = Coding.fromArray(o.getCode());
      if (null != o.getPrefix()) {
        this.prefix = new String(o.getPrefix());
      }

      if (null != o.getText()) {
        this.text = new String(o.getText());
      }

      if (null != o.getType()) {
        this.type = new String(o.getType());
      }

      this.enableWhen = QuestionnaireEnableWhen.fromArray(o.getEnableWhen());

      if (null != o.getRequired()) {
        this.required = new Boolean(o.getRequired());
      }

      if (null != o.getRepeats()) {
        this.repeats = new Boolean(o.getRepeats());
      }

      if (null != o.getReadOnly()) {
        this.readOnly = new Boolean(o.getReadOnly());
      }

      if (null != o.getMaxLength()) {
        this.maxLength = new Float(o.getMaxLength());
      }

      if (null != o.getOptions()) {
        this.options = new Reference(o.getOptions());
        this.options.setId(this.getId());
      }

      this.option = QuestionnaireOption.fromArray(o.getOption());

      if (null != o.getInitialBoolean()) {
        this.initialBoolean = new Boolean(o.getInitialBoolean());
      }

      if (null != o.getInitialDecimal()) {
        this.initialDecimal = new Float(o.getInitialDecimal());
      }

      if (null != o.getInitialInteger()) {
        this.initialInteger = new Float(o.getInitialInteger());
      }

      if (null != o.getInitialDate()) {
        this.initialDate = new String(o.getInitialDate());
      }

      if (null != o.getInitialDateTime()) {
        this.initialDateTime = new String(o.getInitialDateTime());
      }

      if (null != o.getInitialTime()) {
        this.initialTime = new String(o.getInitialTime());
      }

      if (null != o.getInitialString()) {
        this.initialString = new String(o.getInitialString());
      }

      if (null != o.getInitialUri()) {
        this.initialUri = new String(o.getInitialUri());
      }

      this.initialAttachment = Attachment.fromJson(o.getInitialAttachment());
      this.initialCoding = Coding.fromJson(o.getInitialCoding());
      this.initialQuantity = Quantity.fromJson(o.getInitialQuantity());
      if (null != o.getInitialReference()) {
        this.initialReference = new Reference(o.getInitialReference());
        this.initialReference.setId(this.getId());
      }

      this.item = QuestionnaireItem.fromArray(o.getItem());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("linkId" + "[" + String.valueOf(this.linkId) + "]\n"); 
     builder.append("_linkId" + "[" + String.valueOf(this._linkId) + "]\n"); 
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("_definition" + "[" + String.valueOf(this._definition) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("prefix" + "[" + String.valueOf(this.prefix) + "]\n"); 
     builder.append("_prefix" + "[" + String.valueOf(this._prefix) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("_text" + "[" + String.valueOf(this._text) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("enableWhen" + "[" + String.valueOf(this.enableWhen) + "]\n"); 
     builder.append("required" + "[" + String.valueOf(this.required) + "]\n"); 
     builder.append("_required" + "[" + String.valueOf(this._required) + "]\n"); 
     builder.append("repeats" + "[" + String.valueOf(this.repeats) + "]\n"); 
     builder.append("_repeats" + "[" + String.valueOf(this._repeats) + "]\n"); 
     builder.append("readOnly" + "[" + String.valueOf(this.readOnly) + "]\n"); 
     builder.append("_readOnly" + "[" + String.valueOf(this._readOnly) + "]\n"); 
     builder.append("maxLength" + "[" + String.valueOf(this.maxLength) + "]\n"); 
     builder.append("_maxLength" + "[" + String.valueOf(this._maxLength) + "]\n"); 
     builder.append("options" + "[" + String.valueOf(this.options) + "]\n"); 
     builder.append("option" + "[" + String.valueOf(this.option) + "]\n"); 
     builder.append("initialBoolean" + "[" + String.valueOf(this.initialBoolean) + "]\n"); 
     builder.append("_initialBoolean" + "[" + String.valueOf(this._initialBoolean) + "]\n"); 
     builder.append("initialDecimal" + "[" + String.valueOf(this.initialDecimal) + "]\n"); 
     builder.append("_initialDecimal" + "[" + String.valueOf(this._initialDecimal) + "]\n"); 
     builder.append("initialInteger" + "[" + String.valueOf(this.initialInteger) + "]\n"); 
     builder.append("_initialInteger" + "[" + String.valueOf(this._initialInteger) + "]\n"); 
     builder.append("initialDate" + "[" + String.valueOf(this.initialDate) + "]\n"); 
     builder.append("_initialDate" + "[" + String.valueOf(this._initialDate) + "]\n"); 
     builder.append("initialDateTime" + "[" + String.valueOf(this.initialDateTime) + "]\n"); 
     builder.append("_initialDateTime" + "[" + String.valueOf(this._initialDateTime) + "]\n"); 
     builder.append("initialTime" + "[" + String.valueOf(this.initialTime) + "]\n"); 
     builder.append("_initialTime" + "[" + String.valueOf(this._initialTime) + "]\n"); 
     builder.append("initialString" + "[" + String.valueOf(this.initialString) + "]\n"); 
     builder.append("_initialString" + "[" + String.valueOf(this._initialString) + "]\n"); 
     builder.append("initialUri" + "[" + String.valueOf(this.initialUri) + "]\n"); 
     builder.append("_initialUri" + "[" + String.valueOf(this._initialUri) + "]\n"); 
     builder.append("initialAttachment" + "[" + String.valueOf(this.initialAttachment) + "]\n"); 
     builder.append("initialCoding" + "[" + String.valueOf(this.initialCoding) + "]\n"); 
     builder.append("initialQuantity" + "[" + String.valueOf(this.initialQuantity) + "]\n"); 
     builder.append("initialReference" + "[" + String.valueOf(this.initialReference) + "]\n"); 
     builder.append("item" + "[" + String.valueOf(this.item) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
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

  public static java.util.List<QuestionnaireItem> fromArray(java.util.List<QuestionnaireItemModel> list) {
    return (java.util.List<QuestionnaireItem>)list.stream()
      .map(model -> new QuestionnaireItem(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<QuestionnaireItemModel> toModelArray(java.util.List<QuestionnaireItem> list) {
    return (java.util.List<QuestionnaireItemModel>)list.stream()
      .map(model -> new QuestionnaireItemModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static QuestionnaireItem fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, QuestionnaireItem.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(QuestionnaireItem o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<QuestionnaireItem> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}