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
public class ClaimResponseAddItem  extends BackboneElement  {
  /**
  * Description: "List of input service items which this service line is intended to replace."
  */
  protected java.util.List<Float> sequenceLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for sequenceLinkId"
  */
  protected transient java.util.List<Element> _sequenceLinkId = new java.util.ArrayList<>();

  /**
  * Description: "The type of reveneu or cost center providing the product and/or service."
  */
  protected CodeableConcept revenue;

  /**
  * Description: "Health Care Service Type Codes  to identify the classification of service or benefits."
  */
  protected CodeableConcept category;

  /**
  * Description: "A code to indicate the Professional Service or Product supplied."
  */
  protected CodeableConcept service;

  /**
  * Description: "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours."
  */
  protected java.util.List<CodeableConcept> modifier = new java.util.ArrayList<>();

  /**
  * Description: "The fee charged for the professional service or product.."
  */
  protected Money fee;

  /**
  * Description: "A list of note references to the notes provided below."
  */
  protected java.util.List<Float> noteNumber = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for noteNumber"
  */
  protected transient java.util.List<Element> _noteNumber = new java.util.ArrayList<>();

  /**
  * Description: "The adjudications results."
  */
  protected java.util.List<ClaimResponseAdjudication> adjudication = new java.util.ArrayList<>();

  /**
  * Description: "The second tier service adjudications for payor added services."
  */
  protected java.util.List<ClaimResponseDetail1> detail = new java.util.ArrayList<>();

  public ClaimResponseAddItem() {
  }

  public ClaimResponseAddItem(ClaimResponseAddItemModel o) {
    this.id = o.getId();
    if (o.getSequenceLinkId() != null) {
    	this.sequenceLinkId = org.fhir.utils.JsonUtils.json2Array(o.getSequenceLinkId());
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
    if (null != o.getFee() && !o.getFee().isEmpty()) {
      this.fee = new Money(o.getFee().get(0));
    }
    if (o.getNoteNumber() != null) {
    	this.noteNumber = org.fhir.utils.JsonUtils.json2Array(o.getNoteNumber());
    }
    if (null != o.getAdjudication() && !o.getAdjudication().isEmpty()) {
    	this.adjudication = ClaimResponseAdjudicationHelper.fromArray2Array(o.getAdjudication());
    }
    if (null != o.getDetail() && !o.getDetail().isEmpty()) {
    	this.detail = ClaimResponseDetail1Helper.fromArray2Array(o.getDetail());
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimResponseAddItem]:" + "\n");
     if(this.sequenceLinkId != null) builder.append("sequenceLinkId" + "->" + this.sequenceLinkId.toString() + "\n"); 
     if(this._sequenceLinkId != null) builder.append("_sequenceLinkId" + "->" + this._sequenceLinkId.toString() + "\n"); 
     if(this.revenue != null) builder.append("revenue" + "->" + this.revenue.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.service != null) builder.append("service" + "->" + this.service.toString() + "\n"); 
     if(this.modifier != null) builder.append("modifier" + "->" + this.modifier.toString() + "\n"); 
     if(this.fee != null) builder.append("fee" + "->" + this.fee.toString() + "\n"); 
     if(this.noteNumber != null) builder.append("noteNumber" + "->" + this.noteNumber.toString() + "\n"); 
     if(this._noteNumber != null) builder.append("_noteNumber" + "->" + this._noteNumber.toString() + "\n"); 
     if(this.adjudication != null) builder.append("adjudication" + "->" + this.adjudication.toString() + "\n"); 
     if(this.detail != null) builder.append("detail" + "->" + this.detail.toString() + "\n"); ;
    return builder.toString();
  }


}