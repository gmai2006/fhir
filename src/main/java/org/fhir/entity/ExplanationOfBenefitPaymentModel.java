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
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
@Entity
@Table(name="explanationofbenefitpayment")
public class ExplanationOfBenefitPaymentModel  {
  /**
  * Description: "Whether this represents partial or complete payment of the claim."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "Adjustment to the payment of this transaction which is not related to adjudication of this transaction."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"adjustment\"", length = 16777215)
  private String adjustment;

  /**
  * Description: "Reason for the payment adjustment."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"adjustmentReason\"", length = 16777215)
  private String adjustmentReason;

  /**
  * Description: "Estimated payment date."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "Payable less any payment adjustment."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"amount\"", length = 16777215)
  private String amount;

  /**
  * Description: "Payment identifer."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

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

  public ExplanationOfBenefitPaymentModel() {
  }

  public ExplanationOfBenefitPaymentModel(ExplanationOfBenefitPayment o) {
    this.id = o.getId();
      this.type = CodeableConcept.toJson(o.getType());
      this.adjustment = Money.toJson(o.getAdjustment());
      this.adjustmentReason = CodeableConcept.toJson(o.getAdjustmentReason());
      this.date = o.getDate();

      this.amount = Money.toJson(o.getAmount());
      this.identifier = Identifier.toJson(o.getIdentifier());
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
  public void setAdjustment( String value) {
    this.adjustment = value;
  }
  public String getAdjustment() {
    return this.adjustment;
  }
  public void setAdjustmentReason( String value) {
    this.adjustmentReason = value;
  }
  public String getAdjustmentReason() {
    return this.adjustmentReason;
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
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
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
     builder.append("adjustment" + "[" + String.valueOf(this.adjustment) + "]\n"); 
     builder.append("adjustmentReason" + "[" + String.valueOf(this.adjustmentReason) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("amount" + "[" + String.valueOf(this.amount) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}