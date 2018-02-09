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
import org.fhir.entity.ExplanationOfBenefitAdjudicationModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
public class ExplanationOfBenefitAdjudication  {
  /**
  * Description: "Code indicating: Co-Pay, deductable, elegible, benefit, tax, etc."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept category;

  /**
  * Description: "Adjudication reason such as limit reached."
  */
  private CodeableConcept reason;

  /**
  * Description: "Monitory amount associated with the code."
  */
  private Money amount;

  /**
  * Description: "A non-monetary value for example a percentage. Mutually exclusive to the amount element above."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float value;

  /**
  * Description: "Extensions for value"
  */
  private transient Element _value;

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

  public ExplanationOfBenefitAdjudication() {
  }

  public ExplanationOfBenefitAdjudication(ExplanationOfBenefitAdjudicationModel o) {
    this.id = o.getId();
      this.category = CodeableConcept.fromJson(o.getCategory());
      this.reason = CodeableConcept.fromJson(o.getReason());
      this.amount = Money.fromJson(o.getAmount());
      if (null != o.getValue()) {
        this.value = new Float(o.getValue());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setReason( CodeableConcept value) {
    this.reason = value;
  }
  public CodeableConcept getReason() {
    return this.reason;
  }
  public void setAmount( Money value) {
    this.amount = value;
  }
  public Money getAmount() {
    return this.amount;
  }
  public void setValue( Float value) {
    this.value = value;
  }
  public Float getValue() {
    return this.value;
  }
  public void set_value( Element value) {
    this._value = value;
  }
  public Element get_value() {
    return this._value;
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
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("amount" + "[" + String.valueOf(this.amount) + "]\n"); 
     builder.append("value" + "[" + String.valueOf(this.value) + "]\n"); 
     builder.append("_value" + "[" + String.valueOf(this._value) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ExplanationOfBenefitAdjudication> fromArray(java.util.List<ExplanationOfBenefitAdjudicationModel> list) {
    return (java.util.List<ExplanationOfBenefitAdjudication>)list.stream()
      .map(model -> new ExplanationOfBenefitAdjudication(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ExplanationOfBenefitAdjudicationModel> toModelArray(java.util.List<ExplanationOfBenefitAdjudication> list) {
    return (java.util.List<ExplanationOfBenefitAdjudicationModel>)list.stream()
      .map(model -> new ExplanationOfBenefitAdjudicationModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ExplanationOfBenefitAdjudication fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ExplanationOfBenefitAdjudication.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ExplanationOfBenefitAdjudication o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ExplanationOfBenefitAdjudication> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}