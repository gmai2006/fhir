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
import org.fhir.entity.ExplanationOfBenefitDetailModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
public class ExplanationOfBenefitDetail  {
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
  * Description: "If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'."
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
  * Description: "If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group."
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
  * Description: "Third tier of goods and services."
  */
  private java.util.List<ExplanationOfBenefitSubDetail> subDetail = new java.util.ArrayList<>();

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

  public ExplanationOfBenefitDetail() {
  }

  public ExplanationOfBenefitDetail(ExplanationOfBenefitDetailModel o) {
    this.id = o.getId();
      if (null != o.getSequence()) {
        this.sequence = new Float(o.getSequence());
      }

      this.type = CodeableConcept.fromJson(o.getType());
      this.revenue = CodeableConcept.fromJson(o.getRevenue());
      this.category = CodeableConcept.fromJson(o.getCategory());
      this.service = CodeableConcept.fromJson(o.getService());
      this.modifier = CodeableConcept.fromArray(o.getModifier());
      this.programCode = CodeableConcept.fromArray(o.getProgramCode());
      this.quantity = Quantity.fromJson(o.getQuantity());
      this.unitPrice = Money.fromJson(o.getUnitPrice());
      if (null != o.getFactor()) {
        this.factor = new Float(o.getFactor());
      }

      this.net = Money.fromJson(o.getNet());
      this.udi = Reference.fromArray(o.getUdi());

      this.noteNumber = org.fhir.utils.JsonUtils.json2Array(o.getNoteNumber());

      this.adjudication = ExplanationOfBenefitAdjudication.fromArray(o.getAdjudication());

      this.subDetail = ExplanationOfBenefitSubDetail.fromArray(o.getSubDetail());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
  public void setSubDetail( java.util.List<ExplanationOfBenefitSubDetail> value) {
    this.subDetail = value;
  }
  public java.util.List<ExplanationOfBenefitSubDetail> getSubDetail() {
    return this.subDetail;
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
     builder.append("sequence" + "[" + String.valueOf(this.sequence) + "]\n"); 
     builder.append("_sequence" + "[" + String.valueOf(this._sequence) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("revenue" + "[" + String.valueOf(this.revenue) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("service" + "[" + String.valueOf(this.service) + "]\n"); 
     builder.append("modifier" + "[" + String.valueOf(this.modifier) + "]\n"); 
     builder.append("programCode" + "[" + String.valueOf(this.programCode) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("unitPrice" + "[" + String.valueOf(this.unitPrice) + "]\n"); 
     builder.append("factor" + "[" + String.valueOf(this.factor) + "]\n"); 
     builder.append("_factor" + "[" + String.valueOf(this._factor) + "]\n"); 
     builder.append("net" + "[" + String.valueOf(this.net) + "]\n"); 
     builder.append("udi" + "[" + String.valueOf(this.udi) + "]\n"); 
     builder.append("noteNumber" + "[" + String.valueOf(this.noteNumber) + "]\n"); 
     builder.append("_noteNumber" + "[" + String.valueOf(this._noteNumber) + "]\n"); 
     builder.append("adjudication" + "[" + String.valueOf(this.adjudication) + "]\n"); 
     builder.append("subDetail" + "[" + String.valueOf(this.subDetail) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ExplanationOfBenefitDetail> fromArray(java.util.List<ExplanationOfBenefitDetailModel> list) {
    return (java.util.List<ExplanationOfBenefitDetail>)list.stream()
      .map(model -> new ExplanationOfBenefitDetail(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ExplanationOfBenefitDetailModel> toModelArray(java.util.List<ExplanationOfBenefitDetail> list) {
    return (java.util.List<ExplanationOfBenefitDetailModel>)list.stream()
      .map(model -> new ExplanationOfBenefitDetailModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ExplanationOfBenefitDetail fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ExplanationOfBenefitDetail.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ExplanationOfBenefitDetail o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ExplanationOfBenefitDetail> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}