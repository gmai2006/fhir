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
import org.fhir.entity.ExplanationOfBenefitAddItemModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ExplanationOfBenefitAddItem  extends BackboneElement  {
  /**
  * Description: "List of input service items which this service line is intended to replace."
  */
  protected java.util.List<Float> sequenceLinkId;

  /**
  * Description: "Extensions for sequenceLinkId"
  */
  protected transient java.util.List<Element> _sequenceLinkId;

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
  protected java.util.List<CodeableConcept> modifier;

  /**
  * Description: "The fee charged for the professional service or product."
  */
  protected Money fee;

  /**
  * Description: "A list of note references to the notes provided below."
  */
  protected java.util.List<Float> noteNumber;

  /**
  * Description: "Extensions for noteNumber"
  */
  protected transient java.util.List<Element> _noteNumber;

  /**
  * Description: "The adjudications results."
  */
  protected java.util.List<ExplanationOfBenefitAdjudication> adjudication;

  /**
  * Description: "The second tier service adjudications for payor added services."
  */
  protected java.util.List<ExplanationOfBenefitDetail1> detail;

  public ExplanationOfBenefitAddItem() {
  }

  public ExplanationOfBenefitAddItem(ExplanationOfBenefitAddItemModel o) {
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
    	this.adjudication = ExplanationOfBenefitAdjudicationHelper.fromArray2Array(o.getAdjudication());
    }
    if (null != o.getDetail() && !o.getDetail().isEmpty()) {
    	this.detail = ExplanationOfBenefitDetail1Helper.fromArray2Array(o.getDetail());
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
  public void setAdjudication( java.util.List<ExplanationOfBenefitAdjudication> value) {
    this.adjudication = value;
  }
  public java.util.List<ExplanationOfBenefitAdjudication> getAdjudication() {
    return this.adjudication;
  }
  public void setDetail( java.util.List<ExplanationOfBenefitDetail1> value) {
    this.detail = value;
  }
  public java.util.List<ExplanationOfBenefitDetail1> getDetail() {
    return this.detail;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExplanationOfBenefitAddItem]:" + "\n");
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