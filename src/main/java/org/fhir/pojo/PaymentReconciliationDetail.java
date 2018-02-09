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
import org.fhir.entity.PaymentReconciliationDetailModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides payment details and claim references supporting a bulk payment."
*/
public class PaymentReconciliationDetail  {
  /**
  * Description: "Code to indicate the nature of the payment, adjustment, funds advance, etc."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept type;

  /**
  * Description: "The claim or financial resource."
  */
  private Reference request;

  /**
  * Description: "The claim response resource."
  */
  private Reference response;

  /**
  * Description: "The Organization which submitted the claim or financial transaction."
  */
  private Reference submitter;

  /**
  * Description: "The organization which is receiving the payment."
  */
  private Reference payee;

  /**
  * Description: "The date of the invoice or financial resource."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "Amount paid for this detail."
  */
  private Money amount;

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

  public PaymentReconciliationDetail() {
  }

  public PaymentReconciliationDetail(PaymentReconciliationDetailModel o) {
    this.id = o.getId();
      this.type = CodeableConcept.fromJson(o.getType());
      if (null != o.getRequest()) {
        this.request = new Reference(o.getRequest());
        this.request.setId(this.getId());
      }

      if (null != o.getResponse()) {
        this.response = new Reference(o.getResponse());
        this.response.setId(this.getId());
      }

      if (null != o.getSubmitter()) {
        this.submitter = new Reference(o.getSubmitter());
        this.submitter.setId(this.getId());
      }

      if (null != o.getPayee()) {
        this.payee = new Reference(o.getPayee());
        this.payee.setId(this.getId());
      }

      if (null != o.getDate()) {
        this.date = new String(o.getDate());
      }

      this.amount = Money.fromJson(o.getAmount());
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
  public void setRequest( Reference value) {
    this.request = value;
  }
  public Reference getRequest() {
    return this.request;
  }
  public void setResponse( Reference value) {
    this.response = value;
  }
  public Reference getResponse() {
    return this.response;
  }
  public void setSubmitter( Reference value) {
    this.submitter = value;
  }
  public Reference getSubmitter() {
    return this.submitter;
  }
  public void setPayee( Reference value) {
    this.payee = value;
  }
  public Reference getPayee() {
    return this.payee;
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
     builder.append("request" + "[" + String.valueOf(this.request) + "]\n"); 
     builder.append("response" + "[" + String.valueOf(this.response) + "]\n"); 
     builder.append("submitter" + "[" + String.valueOf(this.submitter) + "]\n"); 
     builder.append("payee" + "[" + String.valueOf(this.payee) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("_date" + "[" + String.valueOf(this._date) + "]\n"); 
     builder.append("amount" + "[" + String.valueOf(this.amount) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<PaymentReconciliationDetail> fromArray(java.util.List<PaymentReconciliationDetailModel> list) {
    return (java.util.List<PaymentReconciliationDetail>)list.stream()
      .map(model -> new PaymentReconciliationDetail(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<PaymentReconciliationDetailModel> toModelArray(java.util.List<PaymentReconciliationDetail> list) {
    return (java.util.List<PaymentReconciliationDetailModel>)list.stream()
      .map(model -> new PaymentReconciliationDetailModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static PaymentReconciliationDetail fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, PaymentReconciliationDetail.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(PaymentReconciliationDetail o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<PaymentReconciliationDetail> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}