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
@Table(name="explanationofbenefitdetail")
public class ExplanationOfBenefitDetailModel  {
  /**
  * Description: "A service line number."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private Float sequence;

  /**
  * Description: "The type of product or service."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "The type of reveneu or cost center providing the product and/or service."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"revenue\"", length = 16777215)
  private String revenue;

  /**
  * Description: "Health Care Service Type Codes  to identify the classification of service or benefits."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"service\"", length = 16777215)
  private String service;

  /**
  * Description: "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifier\"", length = 16777215)
  private String modifier;

  /**
  * Description: "For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"programCode\"", length = 16777215)
  private String programCode;

  /**
  * Description: "The number of repetitions of a service or product."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"quantity\"", length = 16777215)
  private String quantity;

  /**
  * Description: "If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"unitPrice\"", length = 16777215)
  private String unitPrice;

  /**
  * Description: "A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"factor\"")
  private Float factor;

  /**
  * Description: "The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"net\"", length = 16777215)
  private String net;

  /**
  * Description: "List of Unique Device Identifiers associated with this line item."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> udi = new java.util.ArrayList<>();

  /**
  * Description: "A list of note references to the notes provided below."
  * Actual type: Array of number-> List<number>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"noteNumber\"", length = 16777215)
  private String noteNumber;

  /**
  * Description: "The adjudications results."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ExplanationOfBenefitAdjudicationModel> adjudication = new java.util.ArrayList<>();

  /**
  * Description: "Third tier of goods and services."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ExplanationOfBenefitSubDetailModel> subDetail = new java.util.ArrayList<>();

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

  public ExplanationOfBenefitDetailModel() {
  }

  public ExplanationOfBenefitDetailModel(ExplanationOfBenefitDetail o) {
    this.id = o.getId();
      this.sequence = o.getSequence();

      this.type = CodeableConcept.toJson(o.getType());
      this.revenue = CodeableConcept.toJson(o.getRevenue());
      this.category = CodeableConcept.toJson(o.getCategory());
      this.service = CodeableConcept.toJson(o.getService());
      this.modifier = CodeableConcept.toJson(o.getModifier());
      this.programCode = CodeableConcept.toJson(o.getProgramCode());
      this.quantity = Quantity.toJson(o.getQuantity());
      this.unitPrice = Money.toJson(o.getUnitPrice());
      this.factor = o.getFactor();

      this.net = Money.toJson(o.getNet());
      this.udi = Reference.toModelArray(o.getUdi());

      this.noteNumber = org.fhir.utils.JsonUtils.write2String(o.getNoteNumber());

      this.adjudication = ExplanationOfBenefitAdjudication.toModelArray(o.getAdjudication());

      this.subDetail = ExplanationOfBenefitSubDetail.toModelArray(o.getSubDetail());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Float getSequence() {
    return this.sequence;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setRevenue( String value) {
    this.revenue = value;
  }
  public String getRevenue() {
    return this.revenue;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setService( String value) {
    this.service = value;
  }
  public String getService() {
    return this.service;
  }
  public void setModifier( String value) {
    this.modifier = value;
  }
  public String getModifier() {
    return this.modifier;
  }
  public void setProgramCode( String value) {
    this.programCode = value;
  }
  public String getProgramCode() {
    return this.programCode;
  }
  public void setQuantity( String value) {
    this.quantity = value;
  }
  public String getQuantity() {
    return this.quantity;
  }
  public void setUnitPrice( String value) {
    this.unitPrice = value;
  }
  public String getUnitPrice() {
    return this.unitPrice;
  }
  public void setFactor( Float value) {
    this.factor = value;
  }
  public Float getFactor() {
    return this.factor;
  }
  public void setNet( String value) {
    this.net = value;
  }
  public String getNet() {
    return this.net;
  }
  public void setUdi( java.util.List<ReferenceModel> value) {
    this.udi = value;
  }
  public java.util.List<ReferenceModel> getUdi() {
    return this.udi;
  }
  public void setNoteNumber( String value) {
    this.noteNumber = value;
  }
  public String getNoteNumber() {
    return this.noteNumber;
  }
  public void setAdjudication( java.util.List<ExplanationOfBenefitAdjudicationModel> value) {
    this.adjudication = value;
  }
  public java.util.List<ExplanationOfBenefitAdjudicationModel> getAdjudication() {
    return this.adjudication;
  }
  public void setSubDetail( java.util.List<ExplanationOfBenefitSubDetailModel> value) {
    this.subDetail = value;
  }
  public java.util.List<ExplanationOfBenefitSubDetailModel> getSubDetail() {
    return this.subDetail;
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
     builder.append("sequence" + "[" + String.valueOf(this.sequence) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("revenue" + "[" + String.valueOf(this.revenue) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("service" + "[" + String.valueOf(this.service) + "]\n"); 
     builder.append("modifier" + "[" + String.valueOf(this.modifier) + "]\n"); 
     builder.append("programCode" + "[" + String.valueOf(this.programCode) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("unitPrice" + "[" + String.valueOf(this.unitPrice) + "]\n"); 
     builder.append("factor" + "[" + String.valueOf(this.factor) + "]\n"); 
     builder.append("net" + "[" + String.valueOf(this.net) + "]\n"); 
     builder.append("udi" + "[" + String.valueOf(this.udi) + "]\n"); 
     builder.append("noteNumber" + "[" + String.valueOf(this.noteNumber) + "]\n"); 
     builder.append("adjudication" + "[" + String.valueOf(this.adjudication) + "]\n"); 
     builder.append("subDetail" + "[" + String.valueOf(this.subDetail) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}