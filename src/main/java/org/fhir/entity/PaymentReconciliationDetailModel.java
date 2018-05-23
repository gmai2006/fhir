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
* "This resource provides payment details and claim references supporting a bulk payment."
*/
@Entity
@Table(name="paymentreconciliationdetail")
public class PaymentReconciliationDetailModel  implements Serializable {
	private static final long serialVersionUID = 151967883225816979L;
  /**
  * Description: "Code to indicate the nature of the payment, adjustment, funds advance, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "The claim or financial resource."
  */
  @javax.persistence.Basic
  @Column(name="\"request_id\"")
  private String request_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="request_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> request;

  /**
  * Description: "The claim response resource."
  */
  @javax.persistence.Basic
  @Column(name="\"response_id\"")
  private String response_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="response_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> response;

  /**
  * Description: "The Organization which submitted the claim or financial transaction."
  */
  @javax.persistence.Basic
  @Column(name="\"submitter_id\"")
  private String submitter_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="submitter_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> submitter;

  /**
  * Description: "The organization which is receiving the payment."
  */
  @javax.persistence.Basic
  @Column(name="\"payee_id\"")
  private String payee_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="payee_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> payee;

  /**
  * Description: "The date of the invoice or financial resource."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "Amount paid for this detail."
  */
  @javax.persistence.Basic
  @Column(name="\"amount_id\"")
  private String amount_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="amount_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> amount;

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

  public PaymentReconciliationDetailModel() {
  }

  public PaymentReconciliationDetailModel(PaymentReconciliationDetail o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getType() ) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModel(o.getType(), this.type_id);
    }
    if (null != o.getRequest() ) {
    	this.request_id = "request" + this.id;
    	this.request = ReferenceHelper.toModel(o.getRequest(), this.request_id);
    }
    if (null != o.getResponse() ) {
    	this.response_id = "response" + this.id;
    	this.response = ReferenceHelper.toModel(o.getResponse(), this.response_id);
    }
    if (null != o.getSubmitter() ) {
    	this.submitter_id = "submitter" + this.id;
    	this.submitter = ReferenceHelper.toModel(o.getSubmitter(), this.submitter_id);
    }
    if (null != o.getPayee() ) {
    	this.payee_id = "payee" + this.id;
    	this.payee = ReferenceHelper.toModel(o.getPayee(), this.payee_id);
    }
    this.date = o.getDate();
    if (null != o.getAmount() ) {
    	this.amount_id = "amount" + this.id;
    	this.amount = MoneyHelper.toModel(o.getAmount(), this.amount_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public java.util.List<ReferenceModel> getRequest() {
    return this.request;
  }
  public void setRequest( java.util.List<ReferenceModel> value) {
    this.request = value;
  }
  public java.util.List<ReferenceModel> getResponse() {
    return this.response;
  }
  public void setResponse( java.util.List<ReferenceModel> value) {
    this.response = value;
  }
  public java.util.List<ReferenceModel> getSubmitter() {
    return this.submitter;
  }
  public void setSubmitter( java.util.List<ReferenceModel> value) {
    this.submitter = value;
  }
  public java.util.List<ReferenceModel> getPayee() {
    return this.payee;
  }
  public void setPayee( java.util.List<ReferenceModel> value) {
    this.payee = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public java.util.List<MoneyModel> getAmount() {
    return this.amount;
  }
  public void setAmount( java.util.List<MoneyModel> value) {
    this.amount = value;
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
    builder.append("[PaymentReconciliationDetailModel]:" + "\n");
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PaymentReconciliationDetailModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("request" + "->" + this.request + "\n"); 
     builder.append("response" + "->" + this.response + "\n"); 
     builder.append("submitter" + "->" + this.submitter + "\n"); 
     builder.append("payee" + "->" + this.payee + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("amount" + "->" + this.amount + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}