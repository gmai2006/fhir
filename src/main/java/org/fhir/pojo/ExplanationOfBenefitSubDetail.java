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
import org.fhir.entity.ExplanationOfBenefitSubDetailModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
public class ExplanationOfBenefitSubDetail  {
  /**
  * Description: "A service line number."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  private transient Element _sequence;

  /**
  * Description: "The type of product or service."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept type;

  /**
  * Description: "The type of reveneu or cost center providing the product and/or service."
  */
  private CodeableConcept revenue;

  /**
  * Description: "Health Care Service Type Codes  to identify the classification of service or benefits."
  */
  private CodeableConcept category;

  /**
  * Description: "A code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI)."
  */
  private CodeableConcept service;

  /**
  * Description: "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours."
  */
  private java.util.List<CodeableConcept> modifier = new java.util.ArrayList<>();

  /**
  * Description: "For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program."
  */
  private java.util.List<CodeableConcept> programCode = new java.util.ArrayList<>();

  /**
  * Description: "The number of repetitions of a service or product."
  */
  private Quantity quantity;

  /**
  * Description: "The fee for an addittional service or product or charge."
  */
  private Money unitPrice;

  /**
  * Description: "A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float factor;

  /**
  * Description: "Extensions for factor"
  */
  private transient Element _factor;

  /**
  * Description: "The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
  */
  private Money net;

  /**
  * Description: "List of Unique Device Identifiers associated with this line item."
  */
  private java.util.List<Reference> udi = new java.util.ArrayList<>();

  /**
  * Description: "A list of note references to the notes provided below."
  */
  private java.util.List<Float> noteNumber = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for noteNumber"
  */
  private transient java.util.List<Element> _noteNumber = new java.util.ArrayList<>();

  /**
  * Description: "The adjudications results."
  */
  private java.util.List<ExplanationOfBenefitAdjudication> adjudication = new java.util.ArrayList<>();

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
  @javax.validation.constraints.NotNull
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

  public ExplanationOfBenefitSubDetail() {
  }

  public ExplanationOfBenefitSubDetail(ExplanationOfBenefitSubDetailModel o) {
    this.id = o.getId();
    if (null != o.getSequence()) {
      this.sequence = o.getSequence();
    }
    this.type = CodeableConceptHelper.fromJson(o.getType());
    this.revenue = CodeableConceptHelper.fromJson(o.getRevenue());
    this.category = CodeableConceptHelper.fromJson(o.getCategory());
    this.service = CodeableConceptHelper.fromJson(o.getService());
    this.quantity = QuantityHelper.fromJson(o.getQuantity());
    this.unitPrice = MoneyHelper.fromJson(o.getUnitPrice());
    if (null != o.getFactor()) {
      this.factor = o.getFactor();
    }
    this.net = MoneyHelper.fromJson(o.getNet());
    if (null != o.getUdi() && !o.getUdi().isEmpty()) {
    	this.udi = ReferenceHelper.fromArray2Array(o.getUdi());
    }
    if (o.getNoteNumber() != null) {
    	this.noteNumber = org.fhir.utils.JsonUtils.json2Array(o.getNoteNumber());
    }
    if (null != o.getAdjudication() && !o.getAdjudication().isEmpty()) {
    	this.adjudication = ExplanationOfBenefitAdjudicationHelper.fromArray2Array(o.getAdjudication());
    }
    if (null != o.getId()) {
      this.id = o.getId();
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
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
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
  public void setNoteNumber( java.util.List<Float> value) {
    this.noteNumber = value;
  }
  public java.util.List<Float> getNoteNumber() {
    return this.noteNumber;
  }
  public void set_noteNumber( java.util.List<Element> value) {
    this._noteNumber = value;
  }
  public java.util.List<Element> get_noteNumber() {
    return this._noteNumber;
  }
  public void setAdjudication( java.util.List<ExplanationOfBenefitAdjudication> value) {
    this.adjudication = value;
  }
  public java.util.List<ExplanationOfBenefitAdjudication> getAdjudication() {
    return this.adjudication;
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
    builder.append("[ExplanationOfBenefitSubDetail]:" + "\n");
     if(this.sequence != null) builder.append("sequence" + "->" + this.sequence.toString() + "\n"); 
     if(this._sequence != null) builder.append("_sequence" + "->" + this._sequence.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
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
     if(this.noteNumber != null) builder.append("noteNumber" + "->" + this.noteNumber.toString() + "\n"); 
     if(this._noteNumber != null) builder.append("_noteNumber" + "->" + this._noteNumber.toString() + "\n"); 
     if(this.adjudication != null) builder.append("adjudication" + "->" + this.adjudication.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}