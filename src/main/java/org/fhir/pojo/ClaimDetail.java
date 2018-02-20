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
import org.fhir.entity.ClaimDetailModel;
import com.google.gson.GsonBuilder;

/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
public class ClaimDetail  extends BackboneElement  {
  /**
  * Description: "A service line number."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  protected transient Element _sequence;

  /**
  * Description: "The type of reveneu or cost center providing the product and/or service."
  */
  protected CodeableConcept revenue;

  /**
  * Description: "Health Care Service Type Codes  to identify the classification of service or benefits."
  */
  protected CodeableConcept category;

  /**
  * Description: "If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'."
  */
  protected CodeableConcept service;

  /**
  * Description: "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours."
  */
  protected java.util.List<CodeableConcept> modifier = new java.util.ArrayList<>();

  /**
  * Description: "For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program."
  */
  protected java.util.List<CodeableConcept> programCode = new java.util.ArrayList<>();

  /**
  * Description: "The number of repetitions of a service or product."
  */
  protected Quantity quantity;

  /**
  * Description: "If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group."
  */
  protected Money unitPrice;

  /**
  * Description: "A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float factor;

  /**
  * Description: "Extensions for factor"
  */
  protected transient Element _factor;

  /**
  * Description: "The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
  */
  protected Money net;

  /**
  * Description: "List of Unique Device Identifiers associated with this line item."
  */
  protected java.util.List<Reference> udi = new java.util.ArrayList<>();

  /**
  * Description: "Third tier of goods and services."
  */
  protected java.util.List<ClaimSubDetail> subDetail = new java.util.ArrayList<>();

  public ClaimDetail() {
  }

  public ClaimDetail(ClaimDetailModel o) {
    this.id = o.getId();
    if (null != o.getSequence()) {
      this.sequence = o.getSequence();
    }
    if (null != o.getRevenue() && !o.getRevenue().isEmpty()) {
      this.revenue = new CodeableConcept(o.getRevenue().get(0));
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
      this.category = new CodeableConcept(o.getCategory().get(0));
    }
    if (null != o.getService() && !o.getService().isEmpty()) {
      this.service = new CodeableConcept(o.getService().get(0));
    }
    if (null != o.getModifier() && !o.getModifier().isEmpty()) {
    	this.modifier = CodeableConceptHelper.fromArray2Array(o.getModifier());
    }
    if (null != o.getProgramCode() && !o.getProgramCode().isEmpty()) {
    	this.programCode = CodeableConceptHelper.fromArray2Array(o.getProgramCode());
    }
    if (null != o.getQuantity() && !o.getQuantity().isEmpty()) {
      this.quantity = new Quantity(o.getQuantity().get(0));
    }
    if (null != o.getUnitPrice() && !o.getUnitPrice().isEmpty()) {
      this.unitPrice = new Money(o.getUnitPrice().get(0));
    }
    if (null != o.getFactor()) {
      this.factor = o.getFactor();
    }
    if (null != o.getNet() && !o.getNet().isEmpty()) {
      this.net = new Money(o.getNet().get(0));
    }
    if (null != o.getUdi() && !o.getUdi().isEmpty()) {
    	this.udi = ReferenceHelper.fromArray2Array(o.getUdi());
    }
    if (null != o.getSubDetail() && !o.getSubDetail().isEmpty()) {
    	this.subDetail = ClaimSubDetailHelper.fromArray2Array(o.getSubDetail());
    }
  }

  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Float getSequence() {
    return this.sequence;
  }
  public void set_sequence( Element value) {
    this._sequence = value;
  }
  public Element get_sequence() {
    return this._sequence;
  }
  public void setRevenue( CodeableConcept value) {
    this.revenue = value;
  }
  public CodeableConcept getRevenue() {
    return this.revenue;
  }
  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setService( CodeableConcept value) {
    this.service = value;
  }
  public CodeableConcept getService() {
    return this.service;
  }
  public void setModifier( java.util.List<CodeableConcept> value) {
    this.modifier = value;
  }
  public java.util.List<CodeableConcept> getModifier() {
    return this.modifier;
  }
  public void setProgramCode( java.util.List<CodeableConcept> value) {
    this.programCode = value;
  }
  public java.util.List<CodeableConcept> getProgramCode() {
    return this.programCode;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setUnitPrice( Money value) {
    this.unitPrice = value;
  }
  public Money getUnitPrice() {
    return this.unitPrice;
  }
  public void setFactor( Float value) {
    this.factor = value;
  }
  public Float getFactor() {
    return this.factor;
  }
  public void set_factor( Element value) {
    this._factor = value;
  }
  public Element get_factor() {
    return this._factor;
  }
  public void setNet( Money value) {
    this.net = value;
  }
  public Money getNet() {
    return this.net;
  }
  public void setUdi( java.util.List<Reference> value) {
    this.udi = value;
  }
  public java.util.List<Reference> getUdi() {
    return this.udi;
  }
  public void setSubDetail( java.util.List<ClaimSubDetail> value) {
    this.subDetail = value;
  }
  public java.util.List<ClaimSubDetail> getSubDetail() {
    return this.subDetail;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimDetail]:" + "\n");
     if(this.sequence != null) builder.append("sequence" + "->" + this.sequence.toString() + "\n"); 
     if(this._sequence != null) builder.append("_sequence" + "->" + this._sequence.toString() + "\n"); 
     if(this.revenue != null) builder.append("revenue" + "->" + this.revenue.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.service != null) builder.append("service" + "->" + this.service.toString() + "\n"); 
     if(this.modifier != null) builder.append("modifier" + "->" + this.modifier.toString() + "\n"); 
     if(this.programCode != null) builder.append("programCode" + "->" + this.programCode.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.unitPrice != null) builder.append("unitPrice" + "->" + this.unitPrice.toString() + "\n"); 
     if(this.factor != null) builder.append("factor" + "->" + this.factor.toString() + "\n"); 
     if(this._factor != null) builder.append("_factor" + "->" + this._factor.toString() + "\n"); 
     if(this.net != null) builder.append("net" + "->" + this.net.toString() + "\n"); 
     if(this.udi != null) builder.append("udi" + "->" + this.udi.toString() + "\n"); 
     if(this.subDetail != null) builder.append("subDetail" + "->" + this.subDetail.toString() + "\n"); ;
    return builder.toString();
  }


}