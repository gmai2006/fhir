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
* "This resource provides the adjudication details from the processing of a Claim resource."
*/
@Entity
@Table(name="claimresponsepayment")
public class ClaimResponsePaymentModel  implements Serializable {
	private static final long serialVersionUID = 151967883186453951L;
  /**
  * Description: "Whether this represents partial or complete payment of the claim."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "Adjustment to the payment of this transaction which is not related to adjudication of this transaction."
  */
  @javax.persistence.Basic
  @Column(name="\"adjustment_id\"")
  private String adjustment_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="adjustment_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> adjustment;

  /**
  * Description: "Reason for the payment adjustment."
  */
  @javax.persistence.Basic
  @Column(name="\"adjustmentreason_id\"")
  private String adjustmentreason_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="adjustmentreason_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> adjustmentReason;

  /**
  * Description: "Estimated payment data."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "Payable less any payment adjustment."
  */
  @javax.persistence.Basic
  @Column(name="\"amount_id\"")
  private String amount_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="amount_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> amount;

  /**
  * Description: "Payment identifier."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

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

  public ClaimResponsePaymentModel() {
  }

  public ClaimResponsePaymentModel(ClaimResponsePayment o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getType() ) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModel(o.getType(), this.type_id);
    }
    if (null != o.getAdjustment() ) {
    	this.adjustment_id = "adjustment" + this.id;
    	this.adjustment = MoneyHelper.toModel(o.getAdjustment(), this.adjustment_id);
    }
    if (null != o.getAdjustmentReason() ) {
    	this.adjustmentreason_id = "adjustmentreason" + this.id;
    	this.adjustmentReason = CodeableConceptHelper.toModel(o.getAdjustmentReason(), this.adjustmentreason_id);
    }
    this.date = o.getDate();
    if (null != o.getAmount() ) {
    	this.amount_id = "amount" + this.id;
    	this.amount = MoneyHelper.toModel(o.getAmount(), this.amount_id);
    }
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
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
  public java.util.List<MoneyModel> getAdjustment() {
    return this.adjustment;
  }
  public void setAdjustment( java.util.List<MoneyModel> value) {
    this.adjustment = value;
  }
  public java.util.List<CodeableConceptModel> getAdjustmentReason() {
    return this.adjustmentReason;
  }
  public void setAdjustmentReason( java.util.List<CodeableConceptModel> value) {
    this.adjustmentReason = value;
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
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
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
    builder.append("[ClaimResponsePaymentModel]:" + "\n");
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimResponsePaymentModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("adjustment" + "->" + this.adjustment + "\n"); 
     builder.append("adjustmentReason" + "->" + this.adjustmentReason + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("amount" + "->" + this.amount + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}