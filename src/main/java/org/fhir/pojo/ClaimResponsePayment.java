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
public class ClaimResponsePayment  extends BackboneElement  {
  /**
  * Description: "Whether this represents partial or complete payment of the claim."
  */
  protected CodeableConcept type;

  /**
  * Description: "Adjustment to the payment of this transaction which is not related to adjudication of this transaction."
  */
  protected Money adjustment;

  /**
  * Description: "Reason for the payment adjustment."
  */
  protected CodeableConcept adjustmentReason;

  /**
  * Description: "Estimated payment data."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "Payable less any payment adjustment."
  */
  protected Money amount;

  /**
  * Description: "Payment identifier."
  */
  protected Identifier identifier;

  public ClaimResponsePayment() {
  }

  public ClaimResponsePayment(ClaimResponsePaymentModel o) {
    this.id = o.getId();
    this.type = CodeableConceptHelper.fromJson(o.getType());
    if (null != o.getAdjustment() && !o.getAdjustment().isEmpty()) {
      this.adjustment = new Money(o.getAdjustment().get(0));
    }
    this.adjustmentReason = CodeableConceptHelper.fromJson(o.getAdjustmentReason());
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getAmount() && !o.getAmount().isEmpty()) {
      this.amount = new Money(o.getAmount().get(0));
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimResponsePayment]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.adjustment != null) builder.append("adjustment" + "->" + this.adjustment.toString() + "\n"); 
     if(this.adjustmentReason != null) builder.append("adjustmentReason" + "->" + this.adjustmentReason.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.amount != null) builder.append("amount" + "->" + this.amount.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); ;
    return builder.toString();
  }


}