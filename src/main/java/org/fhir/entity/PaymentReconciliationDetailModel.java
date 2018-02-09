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
* "This resource provides payment details and claim references supporting a bulk payment."
*/
@Entity
@Table(name="paymentreconciliationdetail")
public class PaymentReconciliationDetailModel  {
  /**
  * Description: "Code to indicate the nature of the payment, adjustment, funds advance, etc."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "The claim or financial resource."
  */
  @javax.persistence.Basic
  @Column(name="\"request_id\"")
  private String request_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`request_id`", insertable=false, updatable=false)
  private ReferenceModel request;

  /**
  * Description: "The claim response resource."
  */
  @javax.persistence.Basic
  @Column(name="\"response_id\"")
  private String response_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`response_id`", insertable=false, updatable=false)
  private ReferenceModel response;

  /**
  * Description: "The Organization which submitted the claim or financial transaction."
  */
  @javax.persistence.Basic
  @Column(name="\"submitter_id\"")
  private String submitter_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`submitter_id`", insertable=false, updatable=false)
  private ReferenceModel submitter;

  /**
  * Description: "The organization which is receiving the payment."
  */
  @javax.persistence.Basic
  @Column(name="\"payee_id\"")
  private String payee_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`payee_id`", insertable=false, updatable=false)
  private ReferenceModel payee;

  /**
  * Description: "The date of the invoice or financial resource."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "Amount paid for this detail."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"amount\"", length = 16777215)
  private String amount;

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

  public PaymentReconciliationDetailModel() {
  }

  public PaymentReconciliationDetailModel(PaymentReconciliationDetail o) {
    this.id = o.getId();
      this.type = CodeableConcept.toJson(o.getType());
      if (null != o.getRequest()) {
      	this.request_id = "request" + this.getId();
        this.request = new ReferenceModel(o.getRequest());
        this.request.setId(this.request_id);
        this.request.parent_id = this.request.getId();
      }

      if (null != o.getResponse()) {
      	this.response_id = "response" + this.getId();
        this.response = new ReferenceModel(o.getResponse());
        this.response.setId(this.response_id);
        this.response.parent_id = this.response.getId();
      }

      if (null != o.getSubmitter()) {
      	this.submitter_id = "submitter" + this.getId();
        this.submitter = new ReferenceModel(o.getSubmitter());
        this.submitter.setId(this.submitter_id);
        this.submitter.parent_id = this.submitter.getId();
      }

      if (null != o.getPayee()) {
      	this.payee_id = "payee" + this.getId();
        this.payee = new ReferenceModel(o.getPayee());
        this.payee.setId(this.payee_id);
        this.payee.parent_id = this.payee.getId();
      }

      this.date = o.getDate();

      this.amount = Money.toJson(o.getAmount());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setRequest( ReferenceModel value) {
    this.request = value;
  }
  public ReferenceModel getRequest() {
    return this.request;
  }
  public void setResponse( ReferenceModel value) {
    this.response = value;
  }
  public ReferenceModel getResponse() {
    return this.response;
  }
  public void setSubmitter( ReferenceModel value) {
    this.submitter = value;
  }
  public ReferenceModel getSubmitter() {
    return this.submitter;
  }
  public void setPayee( ReferenceModel value) {
    this.payee = value;
  }
  public ReferenceModel getPayee() {
    return this.payee;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setAmount( String value) {
    this.amount = value;
  }
  public String getAmount() {
    return this.amount;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("request" + "[" + String.valueOf(this.request) + "]\n"); 
     builder.append("response" + "[" + String.valueOf(this.response) + "]\n"); 
     builder.append("submitter" + "[" + String.valueOf(this.submitter) + "]\n"); 
     builder.append("payee" + "[" + String.valueOf(this.payee) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("amount" + "[" + String.valueOf(this.amount) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}