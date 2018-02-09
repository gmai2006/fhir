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
import org.fhir.entity.ClaimResponsePaymentModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides the adjudication details from the processing of a Claim resource."
*/
public class ClaimResponsePayment  {
  /**
  * Description: "Whether this represents partial or complete payment of the claim."
  */
  private CodeableConcept type;

  /**
  * Description: "Adjustment to the payment of this transaction which is not related to adjudication of this transaction."
  */
  private Money adjustment;

  /**
  * Description: "Reason for the payment adjustment."
  */
  private CodeableConcept adjustmentReason;

  /**
  * Description: "Estimated payment data."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "Payable less any payment adjustment."
  */
  private Money amount;

  /**
  * Description: "Payment identifier."
  */
  private Identifier identifier;

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

  public ClaimResponsePayment() {
  }

  public ClaimResponsePayment(ClaimResponsePaymentModel o) {
    this.id = o.getId();
      this.type = CodeableConcept.fromJson(o.getType());
      this.adjustment = Money.fromJson(o.getAdjustment());
      this.adjustmentReason = CodeableConcept.fromJson(o.getAdjustmentReason());
      if (null != o.getDate()) {
        this.date = new String(o.getDate());
      }

      this.amount = Money.fromJson(o.getAmount());
      this.identifier = Identifier.fromJson(o.getIdentifier());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setAdjustment( Money value) {
    this.adjustment = value;
  }
  public Money getAdjustment() {
    return this.adjustment;
  }
  public void setAdjustmentReason( CodeableConcept value) {
    this.adjustmentReason = value;
  }
  public CodeableConcept getAdjustmentReason() {
    return this.adjustmentReason;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void set_date( Element value) {
    this._date = value;
  }
  public Element get_date() {
    return this._date;
  }
  public void setAmount( Money value) {
    this.amount = value;
  }
  public Money getAmount() {
    return this.amount;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("adjustment" + "[" + String.valueOf(this.adjustment) + "]\n"); 
     builder.append("adjustmentReason" + "[" + String.valueOf(this.adjustmentReason) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("_date" + "[" + String.valueOf(this._date) + "]\n"); 
     builder.append("amount" + "[" + String.valueOf(this.amount) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ClaimResponsePayment> fromArray(java.util.List<ClaimResponsePaymentModel> list) {
    return (java.util.List<ClaimResponsePayment>)list.stream()
      .map(model -> new ClaimResponsePayment(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ClaimResponsePaymentModel> toModelArray(java.util.List<ClaimResponsePayment> list) {
    return (java.util.List<ClaimResponsePaymentModel>)list.stream()
      .map(model -> new ClaimResponsePaymentModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ClaimResponsePayment fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ClaimResponsePayment.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ClaimResponsePayment o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ClaimResponsePayment> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}