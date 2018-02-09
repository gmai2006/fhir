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
* "This resource provides the adjudication details from the processing of a Claim resource."
*/
@Entity
@Table(name="claimresponseadditem")
public class ClaimResponseAddItemModel  {
  /**
  * Description: "List of input service items which this service line is intended to replace."
  * Actual type: Array of number-> List<number>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"sequenceLinkId\"", length = 16777215)
  private String sequenceLinkId;

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
  * Description: "A code to indicate the Professional Service or Product supplied."
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
  * Description: "The fee charged for the professional service or product.."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"fee\"", length = 16777215)
  private String fee;

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
  private java.util.List<ClaimResponseAdjudicationModel> adjudication = new java.util.ArrayList<>();

  /**
  * Description: "The second tier service adjudications for payor added services."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseDetail1Model> detail = new java.util.ArrayList<>();

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

  public ClaimResponseAddItemModel() {
  }

  public ClaimResponseAddItemModel(ClaimResponseAddItem o) {
    this.id = o.getId();
      this.sequenceLinkId = org.fhir.utils.JsonUtils.write2String(o.getSequenceLinkId());

      this.revenue = CodeableConcept.toJson(o.getRevenue());
      this.category = CodeableConcept.toJson(o.getCategory());
      this.service = CodeableConcept.toJson(o.getService());
      this.modifier = CodeableConcept.toJson(o.getModifier());
      this.fee = Money.toJson(o.getFee());
      this.noteNumber = org.fhir.utils.JsonUtils.write2String(o.getNoteNumber());

      this.adjudication = ClaimResponseAdjudication.toModelArray(o.getAdjudication());

      this.detail = ClaimResponseDetail1.toModelArray(o.getDetail());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setSequenceLinkId( String value) {
    this.sequenceLinkId = value;
  }
  public String getSequenceLinkId() {
    return this.sequenceLinkId;
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
  public void setFee( String value) {
    this.fee = value;
  }
  public String getFee() {
    return this.fee;
  }
  public void setNoteNumber( String value) {
    this.noteNumber = value;
  }
  public String getNoteNumber() {
    return this.noteNumber;
  }
  public void setAdjudication( java.util.List<ClaimResponseAdjudicationModel> value) {
    this.adjudication = value;
  }
  public java.util.List<ClaimResponseAdjudicationModel> getAdjudication() {
    return this.adjudication;
  }
  public void setDetail( java.util.List<ClaimResponseDetail1Model> value) {
    this.detail = value;
  }
  public java.util.List<ClaimResponseDetail1Model> getDetail() {
    return this.detail;
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
     builder.append("sequenceLinkId" + "[" + String.valueOf(this.sequenceLinkId) + "]\n"); 
     builder.append("revenue" + "[" + String.valueOf(this.revenue) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("service" + "[" + String.valueOf(this.service) + "]\n"); 
     builder.append("modifier" + "[" + String.valueOf(this.modifier) + "]\n"); 
     builder.append("fee" + "[" + String.valueOf(this.fee) + "]\n"); 
     builder.append("noteNumber" + "[" + String.valueOf(this.noteNumber) + "]\n"); 
     builder.append("adjudication" + "[" + String.valueOf(this.adjudication) + "]\n"); 
     builder.append("detail" + "[" + String.valueOf(this.detail) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}