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
import org.fhir.utils.JsonUtils;
/**
* "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to."
* generated on 07/14/2018
*/
@Entity
@Table(name="questionnaireresponseanswer")
public class QuestionnaireResponseAnswerModel  implements Serializable {
	private static final long serialVersionUID = 153159210203947419L;
  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.persistence.Basic
  @Column(name="\"valueBoolean\"")
  private Boolean valueBoolean;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"valueDecimal\"")
  private Float valueDecimal;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"valueInteger\"")
  private Float valueInteger;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"valueDate\"")
  private String valueDate;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"valueDateTime\"")
  private String valueDateTime;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"valueTime\"")
  private String valueTime;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.persistence.Basic
  @Column(name="\"valueString\"")
  private String valueString;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.persistence.Basic
  @Column(name="\"valueUri\"")
  private String valueUri;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueAttachment\"", length = 16777215)
  private String valueAttachment;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.persistence.Basic
  @Column(name="\"valuecoding_id\"")
  private String valuecoding_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="valuecoding_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> valueCoding;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.persistence.Basic
  @Column(name="\"valuequantity_id\"")
  private String valuequantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="valuequantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> valueQuantity;

  /**
  * Description: "The answer (or one of the answers) provided by the respondent to the question."
  */
  @javax.persistence.Basic
  @Column(name="\"valuereference_id\"")
  private String valuereference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="valuereference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> valueReference;

  /**
  * Description: "Nested groups and/or questions found within this particular answer."
  */
  @javax.persistence.Basic
  @Column(name="\"item_id\"")
  private String item_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="item_id", insertable=false, updatable=false)
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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public QuestionnaireResponseAnswerModel() {
  }

  public QuestionnaireResponseAnswerModel(QuestionnaireResponseAnswer o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.valueBoolean = o.getValueBoolean();
    this.valueDecimal = o.getValueDecimal();
    this.valueInteger = o.getValueInteger();
    this.valueDate = o.getValueDate();
    this.valueDateTime = o.getValueDateTime();
    this.valueTime = o.getValueTime();
    this.valueString = o.getValueString();
    this.valueUri = o.getValueUri();
    if (null != o.getValueAttachment()) {
    	this.valueAttachment = JsonUtils.toJson(o.getValueAttachment());
    }
    if (null != o.getValueCoding() ) {
    	this.valuecoding_id = "valuecoding" + this.id;
    	this.valueCoding = CodingHelper.toModel(o.getValueCoding(), this.valuecoding_id);
    }
    if (null != o.getValueQuantity() ) {
    	this.valuequantity_id = "valuequantity" + this.id;
    	this.valueQuantity = QuantityHelper.toModel(o.getValueQuantity(), this.valuequantity_id);
    }
    if (null != o.getValueReference() ) {
    	this.valuereference_id = "valuereference" + this.id;
    	this.valueReference = ReferenceHelper.toModel(o.getValueReference(), this.valuereference_id);
    }
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item_id = "item" + this.id;
    	this.item = QuestionnaireResponseItemHelper.toModelFromArray(o.getItem(), this.item_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public Boolean getValueBoolean() {
    return this.valueBoolean;
  }
  public void setValueBoolean( Boolean value) {
    this.valueBoolean = value;
  }
  public Float getValueDecimal() {
    return this.valueDecimal;
  }
  public void setValueDecimal( Float value) {
    this.valueDecimal = value;
  }
  public Float getValueInteger() {
    return this.valueInteger;
  }
  public void setValueInteger( Float value) {
    this.valueInteger = value;
  }
  public String getValueDate() {
    return this.valueDate;
  }
  public void setValueDate( String value) {
    this.valueDate = value;
  }
  public String getValueDateTime() {
    return this.valueDateTime;
  }
  public void setValueDateTime( String value) {
    this.valueDateTime = value;
  }
  public String getValueTime() {
    return this.valueTime;
  }
  public void setValueTime( String value) {
    this.valueTime = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public String getValueUri() {
    return this.valueUri;
  }
  public void setValueUri( String value) {
    this.valueUri = value;
  }
  public String getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueAttachment( String value) {
    this.valueAttachment = value;
  }
  public java.util.List<CodingModel> getValueCoding() {
    return this.valueCoding;
  }
  public void setValueCoding( java.util.List<CodingModel> value) {
    this.valueCoding = value;
  }
  public java.util.List<QuantityModel> getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueQuantity( java.util.List<QuantityModel> value) {
    this.valueQuantity = value;
  }
  public java.util.List<ReferenceModel> getValueReference() {
    return this.valueReference;
  }
  public void setValueReference( java.util.List<ReferenceModel> value) {
    this.valueReference = value;
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[QuestionnaireResponseAnswerModel]:" + "\n");
     builder.append("valueBoolean" + "->" + this.valueBoolean + "\n"); 
     builder.append("valueDecimal" + "->" + this.valueDecimal + "\n"); 
     builder.append("valueInteger" + "->" + this.valueInteger + "\n"); 
     builder.append("valueDate" + "->" + this.valueDate + "\n"); 
     builder.append("valueDateTime" + "->" + this.valueDateTime + "\n"); 
     builder.append("valueTime" + "->" + this.valueTime + "\n"); 
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueUri" + "->" + this.valueUri + "\n"); 
     builder.append("valueAttachment" + "->" + this.valueAttachment + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[QuestionnaireResponseAnswerModel]:" + "\n");
     builder.append("valueBoolean" + "->" + this.valueBoolean + "\n"); 
     builder.append("valueDecimal" + "->" + this.valueDecimal + "\n"); 
     builder.append("valueInteger" + "->" + this.valueInteger + "\n"); 
     builder.append("valueDate" + "->" + this.valueDate + "\n"); 
     builder.append("valueDateTime" + "->" + this.valueDateTime + "\n"); 
     builder.append("valueTime" + "->" + this.valueTime + "\n"); 
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueUri" + "->" + this.valueUri + "\n"); 
     builder.append("valueAttachment" + "->" + this.valueAttachment + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}