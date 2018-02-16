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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
@Entity
@Table(name="explanationofbenefitdetail")
public class ExplanationOfBenefitDetailModel  implements Serializable {
	private static final long serialVersionUID = 151873631120674907L;
  /**
  * Description: "A service line number."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private Float sequence;

  /**
  * Description: "The type of product or service."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "The type of reveneu or cost center providing the product and/or service."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"revenue\"", length = 16777215)
  private String revenue;

  /**
  * Description: "Health Care Service Type Codes  to identify the classification of service or benefits."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"service\"", length = 16777215)
  private String service;

  /**
  * Description: "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifier\"", length = 16777215)
  private String modifier;

  /**
  * Description: "For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"programCode\"", length = 16777215)
  private String programCode;

  /**
  * Description: "The number of repetitions of a service or product."
  */
  @javax.persistence.Basic
  @Column(name="\"quantity_id\"")
  private String quantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="quantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> quantity;

  /**
  * Description: "If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group."
  */
  @javax.persistence.Basic
  @Column(name="\"unitprice_id\"")
  private String unitprice_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="unitprice_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> unitPrice;

  /**
  * Description: "A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"factor\"")
  private Float factor;

  /**
  * Description: "The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
  */
  @javax.persistence.Basic
  @Column(name="\"net_id\"")
  private String net_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="net_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> net;

  /**
  * Description: "List of Unique Device Identifiers associated with this line item."
  */
  @javax.persistence.Basic
  @Column(name="\"udi_id\"")
  private String udi_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="udi_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> udi;

  /**
  * Description: "A list of note references to the notes provided below."
  */
  @javax.persistence.Basic
  @Column(name="\"noteNumber\"")
  private String noteNumber;

  /**
  * Description: "The adjudications results."
  */
  @javax.persistence.Basic
  @Column(name="\"adjudication_id\"")
  private String adjudication_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="adjudication_id", insertable=false, updatable=false)
  private java.util.List<ExplanationOfBenefitAdjudicationModel> adjudication;

  /**
  * Description: "Third tier of goods and services."
  */
  @javax.persistence.Basic
  @Column(name="\"subdetail_id\"")
  private String subdetail_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subdetail_id", insertable=false, updatable=false)
  private java.util.List<ExplanationOfBenefitSubDetailModel> subDetail;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public ExplanationOfBenefitDetailModel() {
  }

  public ExplanationOfBenefitDetailModel(ExplanationOfBenefitDetail o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.sequence = o.getSequence();
    this.type = JsonUtils.toJson(o.getType());
    this.revenue = JsonUtils.toJson(o.getRevenue());
    this.category = JsonUtils.toJson(o.getCategory());
    this.service = JsonUtils.toJson(o.getService());
    if (null != o.getQuantity() ) {
    	this.quantity_id = "quantity" + this.parent_id;
    	this.quantity = QuantityHelper.toModel(o.getQuantity(), this.quantity_id);
    }
    if (null != o.getUnitPrice() ) {
    	this.unitprice_id = "unitprice" + this.parent_id;
    	this.unitPrice = MoneyHelper.toModel(o.getUnitPrice(), this.unitprice_id);
    }
    this.factor = o.getFactor();
    if (null != o.getNet() ) {
    	this.net_id = "net" + this.parent_id;
    	this.net = MoneyHelper.toModel(o.getNet(), this.net_id);
    }
    if (null != o.getUdi() && !o.getUdi().isEmpty()) {
    	this.udi_id = "udi" + this.parent_id;
    	this.udi = ReferenceHelper.toModelFromArray(o.getUdi(), this.udi_id);
    }
    this.noteNumber = org.fhir.utils.JsonUtils.write2String(o.getNoteNumber());
    if (null != o.getAdjudication() && !o.getAdjudication().isEmpty()) {
    	this.adjudication_id = "adjudication" + this.parent_id;
    	this.adjudication = ExplanationOfBenefitAdjudicationHelper.toModelFromArray(o.getAdjudication(), this.adjudication_id);
    }
    if (null != o.getSubDetail() && !o.getSubDetail().isEmpty()) {
    	this.subdetail_id = "subdetail" + this.parent_id;
    	this.subDetail = ExplanationOfBenefitSubDetailHelper.toModelFromArray(o.getSubDetail(), this.subdetail_id);
    }
  }

  public Float getSequence() {
    return this.sequence;
  }
  public void setSequence( Float value) {
    this.sequence = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getRevenue() {
    return this.revenue;
  }
  public void setRevenue( String value) {
    this.revenue = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getService() {
    return this.service;
  }
  public void setService( String value) {
    this.service = value;
  }
  public String getModifier() {
    return this.modifier;
  }
  public void setModifier( String value) {
    this.modifier = value;
  }
  public String getProgramCode() {
    return this.programCode;
  }
  public void setProgramCode( String value) {
    this.programCode = value;
  }
  public java.util.List<QuantityModel> getQuantity() {
    return this.quantity;
  }
  public void setQuantity( java.util.List<QuantityModel> value) {
    this.quantity = value;
  }
  public java.util.List<MoneyModel> getUnitPrice() {
    return this.unitPrice;
  }
  public void setUnitPrice( java.util.List<MoneyModel> value) {
    this.unitPrice = value;
  }
  public Float getFactor() {
    return this.factor;
  }
  public void setFactor( Float value) {
    this.factor = value;
  }
  public java.util.List<MoneyModel> getNet() {
    return this.net;
  }
  public void setNet( java.util.List<MoneyModel> value) {
    this.net = value;
  }
  public java.util.List<ReferenceModel> getUdi() {
    return this.udi;
  }
  public void setUdi( java.util.List<ReferenceModel> value) {
    this.udi = value;
  }
  public String getNoteNumber() {
    return this.noteNumber;
  }
  public void setNoteNumber( String value) {
    this.noteNumber = value;
  }
  public java.util.List<ExplanationOfBenefitAdjudicationModel> getAdjudication() {
    return this.adjudication;
  }
  public void setAdjudication( java.util.List<ExplanationOfBenefitAdjudicationModel> value) {
    this.adjudication = value;
  }
  public java.util.List<ExplanationOfBenefitSubDetailModel> getSubDetail() {
    return this.subDetail;
  }
  public void setSubDetail( java.util.List<ExplanationOfBenefitSubDetailModel> value) {
    this.subDetail = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExplanationOfBenefitDetailModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("revenue" + "->" + this.revenue + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("service" + "->" + this.service + "\n"); 
     builder.append("modifier" + "->" + this.modifier + "\n"); 
     builder.append("programCode" + "->" + this.programCode + "\n"); 
     builder.append("factor" + "->" + this.factor + "\n"); 
     builder.append("noteNumber" + "->" + this.noteNumber + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExplanationOfBenefitDetailModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("revenue" + "->" + this.revenue + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("service" + "->" + this.service + "\n"); 
     builder.append("modifier" + "->" + this.modifier + "\n"); 
     builder.append("programCode" + "->" + this.programCode + "\n"); 
     builder.append("quantity" + "->" + this.quantity + "\n"); 
     builder.append("unitPrice" + "->" + this.unitPrice + "\n"); 
     builder.append("factor" + "->" + this.factor + "\n"); 
     builder.append("net" + "->" + this.net + "\n"); 
     builder.append("udi" + "->" + this.udi + "\n"); 
     builder.append("noteNumber" + "->" + this.noteNumber + "\n"); 
     builder.append("adjudication" + "->" + this.adjudication + "\n"); 
     builder.append("subDetail" + "->" + this.subDetail + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}