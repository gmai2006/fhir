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
import org.fhir.entity.ClaimResponseAdjudicationModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource provides the adjudication details from the processing of a Claim resource."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ClaimResponseAdjudication  extends BackboneElement  {
  /**
  * Description: "Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept category;

  /**
  * Description: "Adjudication reason such as limit reached."
  */
  protected CodeableConcept reason;

  /**
  * Description: "Monetary amount associated with the code."
  */
  protected Money amount;

  /**
  * Description: "A non-monetary value for example a percentage. Mutually exclusive to the amount element above."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float value;

  /**
  * Description: "Extensions for value"
  */
  protected transient Element _value;

  public ClaimResponseAdjudication() {
  }

  public ClaimResponseAdjudication(ClaimResponseAdjudicationModel o) {
    this.id = o.getId();
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
      this.category = new CodeableConcept(o.getCategory().get(0));
    }
    if (null != o.getReason() && !o.getReason().isEmpty()) {
      this.reason = new CodeableConcept(o.getReason().get(0));
    }
    if (null != o.getAmount() && !o.getAmount().isEmpty()) {
      this.amount = new Money(o.getAmount().get(0));
    }
    if (null != o.getValue()) {
      this.value = o.getValue();
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimResponseAdjudication]:" + "\n");
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); 
     if(this.amount != null) builder.append("amount" + "->" + this.amount.toString() + "\n"); 
     if(this.value != null) builder.append("value" + "->" + this.value.toString() + "\n"); 
     if(this._value != null) builder.append("_value" + "->" + this._value.toString() + "\n"); ;
    return builder.toString();
  }


}