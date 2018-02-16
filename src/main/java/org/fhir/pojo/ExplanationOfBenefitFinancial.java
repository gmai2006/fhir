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
import org.fhir.entity.ExplanationOfBenefitFinancialModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
public class ExplanationOfBenefitFinancial  extends BackboneElement  {
  /**
  * Description: "Deductable, visits, benefit amount."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept type;

  /**
  * Description: "Benefits allowed."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float allowedUnsignedInt;

  /**
  * Description: "Extensions for allowedUnsignedInt"
  */
  protected transient Element _allowedUnsignedInt;

  /**
  * Description: "Benefits allowed."
  */
  protected String allowedString;

  /**
  * Description: "Extensions for allowedString"
  */
  protected transient Element _allowedString;

  /**
  * Description: "Benefits allowed."
  */
  protected Money allowedMoney;

  /**
  * Description: "Benefits used."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float usedUnsignedInt;

  /**
  * Description: "Extensions for usedUnsignedInt"
  */
  protected transient Element _usedUnsignedInt;

  /**
  * Description: "Benefits used."
  */
  protected Money usedMoney;

  public ExplanationOfBenefitFinancial() {
  }

  public ExplanationOfBenefitFinancial(ExplanationOfBenefitFinancialModel o) {
    this.id = o.getId();
    this.type = CodeableConceptHelper.fromJson(o.getType());
    if (null != o.getAllowedUnsignedInt()) {
      this.allowedUnsignedInt = o.getAllowedUnsignedInt();
    }
    if (null != o.getAllowedString()) {
      this.allowedString = o.getAllowedString();
    }
    if (null != o.getAllowedMoney() && !o.getAllowedMoney().isEmpty()) {
      this.allowedMoney = new Money(o.getAllowedMoney().get(0));
    }
    if (null != o.getUsedUnsignedInt()) {
      this.usedUnsignedInt = o.getUsedUnsignedInt();
    }
    if (null != o.getUsedMoney() && !o.getUsedMoney().isEmpty()) {
      this.usedMoney = new Money(o.getUsedMoney().get(0));
    }
  }

  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setAllowedUnsignedInt( Float value) {
    this.allowedUnsignedInt = value;
  }
  public Float getAllowedUnsignedInt() {
    return this.allowedUnsignedInt;
  }
  public void set_allowedUnsignedInt( Element value) {
    this._allowedUnsignedInt = value;
  }
  public Element get_allowedUnsignedInt() {
    return this._allowedUnsignedInt;
  }
  public void setAllowedString( String value) {
    this.allowedString = value;
  }
  public String getAllowedString() {
    return this.allowedString;
  }
  public void set_allowedString( Element value) {
    this._allowedString = value;
  }
  public Element get_allowedString() {
    return this._allowedString;
  }
  public void setAllowedMoney( Money value) {
    this.allowedMoney = value;
  }
  public Money getAllowedMoney() {
    return this.allowedMoney;
  }
  public void setUsedUnsignedInt( Float value) {
    this.usedUnsignedInt = value;
  }
  public Float getUsedUnsignedInt() {
    return this.usedUnsignedInt;
  }
  public void set_usedUnsignedInt( Element value) {
    this._usedUnsignedInt = value;
  }
  public Element get_usedUnsignedInt() {
    return this._usedUnsignedInt;
  }
  public void setUsedMoney( Money value) {
    this.usedMoney = value;
  }
  public Money getUsedMoney() {
    return this.usedMoney;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExplanationOfBenefitFinancial]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.allowedUnsignedInt != null) builder.append("allowedUnsignedInt" + "->" + this.allowedUnsignedInt.toString() + "\n"); 
     if(this._allowedUnsignedInt != null) builder.append("_allowedUnsignedInt" + "->" + this._allowedUnsignedInt.toString() + "\n"); 
     if(this.allowedString != null) builder.append("allowedString" + "->" + this.allowedString.toString() + "\n"); 
     if(this._allowedString != null) builder.append("_allowedString" + "->" + this._allowedString.toString() + "\n"); 
     if(this.allowedMoney != null) builder.append("allowedMoney" + "->" + this.allowedMoney.toString() + "\n"); 
     if(this.usedUnsignedInt != null) builder.append("usedUnsignedInt" + "->" + this.usedUnsignedInt.toString() + "\n"); 
     if(this._usedUnsignedInt != null) builder.append("_usedUnsignedInt" + "->" + this._usedUnsignedInt.toString() + "\n"); 
     if(this.usedMoney != null) builder.append("usedMoney" + "->" + this.usedMoney.toString() + "\n"); ;
    return builder.toString();
  }


}