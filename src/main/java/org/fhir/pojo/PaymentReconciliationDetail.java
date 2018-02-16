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
public class PaymentReconciliationDetail  extends BackboneElement  {
  /**
  * Description: "Code to indicate the nature of the payment, adjustment, funds advance, etc."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept type;

  /**
  * Description: "The claim or financial resource."
  */
  protected Reference request;

  /**
  * Description: "The claim response resource."
  */
  protected Reference response;

  /**
  * Description: "The Organization which submitted the claim or financial transaction."
  */
  protected Reference submitter;

  /**
  * Description: "The organization which is receiving the payment."
  */
  protected Reference payee;

  /**
  * Description: "The date of the invoice or financial resource."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "Amount paid for this detail."
  */
  protected Money amount;

  public PaymentReconciliationDetail() {
  }

  public PaymentReconciliationDetail(PaymentReconciliationDetailModel o) {
    this.id = o.getId();
    this.type = CodeableConceptHelper.fromJson(o.getType());
    if (null != o.getRequest() && !o.getRequest().isEmpty()) {
      this.request = new Reference(o.getRequest().get(0));
    }
    if (null != o.getResponse() && !o.getResponse().isEmpty()) {
      this.response = new Reference(o.getResponse().get(0));
    }
    if (null != o.getSubmitter() && !o.getSubmitter().isEmpty()) {
      this.submitter = new Reference(o.getSubmitter().get(0));
    }
    if (null != o.getPayee() && !o.getPayee().isEmpty()) {
      this.payee = new Reference(o.getPayee().get(0));
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getAmount() && !o.getAmount().isEmpty()) {
      this.amount = new Money(o.getAmount().get(0));
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PaymentReconciliationDetail]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.request != null) builder.append("request" + "->" + this.request.toString() + "\n"); 
     if(this.response != null) builder.append("response" + "->" + this.response.toString() + "\n"); 
     if(this.submitter != null) builder.append("submitter" + "->" + this.submitter.toString() + "\n"); 
     if(this.payee != null) builder.append("payee" + "->" + this.payee.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.amount != null) builder.append("amount" + "->" + this.amount.toString() + "\n"); ;
    return builder.toString();
  }


}