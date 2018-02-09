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
import org.fhir.entity.ClaimResponseAddItemModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides the adjudication details from the processing of a Claim resource."
*/
public class ClaimResponseAddItem  {
  /**
  * Description: "List of input service items which this service line is intended to replace."
  */
  private java.util.List<Float> sequenceLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for sequenceLinkId"
  */
  private transient java.util.List<Element> _sequenceLinkId = new java.util.ArrayList<>();

  /**
  * Description: "The type of reveneu or cost center providing the product and/or service."
  */
  private CodeableConcept revenue;

  /**
  * Description: "Health Care Service Type Codes  to identify the classification of service or benefits."
  */
  private CodeableConcept category;

  /**
  * Description: "A code to indicate the Professional Service or Product supplied."
  */
  private CodeableConcept service;

  /**
  * Description: "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours."
  */
  private java.util.List<CodeableConcept> modifier = new java.util.ArrayList<>();

  /**
  * Description: "The fee charged for the professional service or product.."
  */
  private Money fee;

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
  private java.util.List<ClaimResponseAdjudication> adjudication = new java.util.ArrayList<>();

  /**
  * Description: "The second tier service adjudications for payor added services."
  */
  private java.util.List<ClaimResponseDetail1> detail = new java.util.ArrayList<>();

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

  public ClaimResponseAddItem() {
  }

  public ClaimResponseAddItem(ClaimResponseAddItemModel o) {
    this.id = o.getId();
      this.sequenceLinkId = org.fhir.utils.JsonUtils.json2Array(o.getSequenceLinkId());

      this.revenue = CodeableConcept.fromJson(o.getRevenue());
      this.category = CodeableConcept.fromJson(o.getCategory());
      this.service = CodeableConcept.fromJson(o.getService());
      this.modifier = CodeableConcept.fromArray(o.getModifier());
      this.fee = Money.fromJson(o.getFee());
      this.noteNumber = org.fhir.utils.JsonUtils.json2Array(o.getNoteNumber());

      this.adjudication = ClaimResponseAdjudication.fromArray(o.getAdjudication());

      this.detail = ClaimResponseDetail1.fromArray(o.getDetail());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setSequenceLinkId( java.util.List<Float> value) {
    this.sequenceLinkId = value;
  }
  public java.util.List<Float> getSequenceLinkId() {
    return this.sequenceLinkId;
  }
  public void set_sequenceLinkId( java.util.List<Element> value) {
    this._sequenceLinkId = value;
  }
  public java.util.List<Element> get_sequenceLinkId() {
    return this._sequenceLinkId;
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
  public void setFee( Money value) {
    this.fee = value;
  }
  public Money getFee() {
    return this.fee;
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
  public void setAdjudication( java.util.List<ClaimResponseAdjudication> value) {
    this.adjudication = value;
  }
  public java.util.List<ClaimResponseAdjudication> getAdjudication() {
    return this.adjudication;
  }
  public void setDetail( java.util.List<ClaimResponseDetail1> value) {
    this.detail = value;
  }
  public java.util.List<ClaimResponseDetail1> getDetail() {
    return this.detail;
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
     builder.append("sequenceLinkId" + "[" + String.valueOf(this.sequenceLinkId) + "]\n"); 
     builder.append("_sequenceLinkId" + "[" + String.valueOf(this._sequenceLinkId) + "]\n"); 
     builder.append("revenue" + "[" + String.valueOf(this.revenue) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("service" + "[" + String.valueOf(this.service) + "]\n"); 
     builder.append("modifier" + "[" + String.valueOf(this.modifier) + "]\n"); 
     builder.append("fee" + "[" + String.valueOf(this.fee) + "]\n"); 
     builder.append("noteNumber" + "[" + String.valueOf(this.noteNumber) + "]\n"); 
     builder.append("_noteNumber" + "[" + String.valueOf(this._noteNumber) + "]\n"); 
     builder.append("adjudication" + "[" + String.valueOf(this.adjudication) + "]\n"); 
     builder.append("detail" + "[" + String.valueOf(this.detail) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ClaimResponseAddItem> fromArray(java.util.List<ClaimResponseAddItemModel> list) {
    return (java.util.List<ClaimResponseAddItem>)list.stream()
      .map(model -> new ClaimResponseAddItem(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ClaimResponseAddItemModel> toModelArray(java.util.List<ClaimResponseAddItem> list) {
    return (java.util.List<ClaimResponseAddItemModel>)list.stream()
      .map(model -> new ClaimResponseAddItemModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ClaimResponseAddItem fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ClaimResponseAddItem.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ClaimResponseAddItem o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ClaimResponseAddItem> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}