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
* generated on 07/14/2018
*/
@Entity
@Table(name="explanationofbenefitdetail")
public class ExplanationOfBenefitDetailModel  implements Serializable {
	private static final long serialVersionUID = 153159210151431148L;
  /**
  * Description: "A service line number."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private Float sequence;

  /**
  * Description: "The type of product or service."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "The type of reveneu or cost center providing the product and/or service."
  */
  @javax.persistence.Basic
  @Column(name="\"revenue_id\"")
  private String revenue_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="revenue_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> revenue;

  /**
  * Description: "Health Care Service Type Codes  to identify the classification of service or benefits."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'."
  */
  @javax.persistence.Basic
  @Column(name="\"service_id\"")
  private String service_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="service_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> service;

  /**
  * Description: "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours."
  */
  @javax.persistence.Basic
  @Column(name="\"modifier_id\"")
  private String modifier_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="modifier_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> modifier;

  /**
  * Description: "For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program."
  */
  @javax.persistence.Basic
  @Column(name="\"programcode_id\"")
  private String programcode_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="programcode_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> programCode;

  /**
  * Description: "The number of repetitions of a service or product."
  */
  @javax.persistence.Basic
  @Column(name="\"quantity_id\"")
  private String quantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="quantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> quantity;

  /**
  * Description: "If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group."
  */
  @javax.persistence.Basic
  @Column(name="\"unitprice_id\"")
  private String unitprice_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="unitprice_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="net_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> net;

  /**
  * Description: "List of Unique Device Identifiers associated with this line item."
  */
  @javax.persistence.Basic
  @Column(name="\"udi_id\"")
  private String udi_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="udi_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="adjudication_id", insertable=false, updatable=false)
  private java.util.List<ExplanationOfBenefitAdjudicationModel> adjudication;

  /**
  * Description: "Third tier of goods and services."
  */
  @javax.persistence.Basic
  @Column(name="\"subdetail_id\"")
  private String subdetail_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="subdetail_id", insertable=false, updatable=false)
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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public ExplanationOfBenefitDetailModel() {
  }

  public ExplanationOfBenefitDetailModel(ExplanationOfBenefitDetail o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.sequence = o.getSequence();
    if (null != o.getType() ) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModel(o.getType(), this.type_id);
    }
    if (null != o.getRevenue() ) {
    	this.revenue_id = "revenue" + this.id;
    	this.revenue = CodeableConceptHelper.toModel(o.getRevenue(), this.revenue_id);
    }
    if (null != o.getCategory() ) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModel(o.getCategory(), this.category_id);
    }
    if (null != o.getService() ) {
    	this.service_id = "service" + this.id;
    	this.service = CodeableConceptHelper.toModel(o.getService(), this.service_id);
    }
    if (null != o.getModifier() && !o.getModifier().isEmpty()) {
    	this.modifier_id = "modifier" + this.id;
    	this.modifier = CodeableConceptHelper.toModelFromArray(o.getModifier(), this.modifier_id);
    }
    if (null != o.getProgramCode() && !o.getProgramCode().isEmpty()) {
    	this.programcode_id = "programcode" + this.id;
    	this.programCode = CodeableConceptHelper.toModelFromArray(o.getProgramCode(), this.programcode_id);
    }
    if (null != o.getQuantity() ) {
    	this.quantity_id = "quantity" + this.id;
    	this.quantity = QuantityHelper.toModel(o.getQuantity(), this.quantity_id);
    }
    if (null != o.getUnitPrice() ) {
    	this.unitprice_id = "unitprice" + this.id;
    	this.unitPrice = MoneyHelper.toModel(o.getUnitPrice(), this.unitprice_id);
    }
    this.factor = o.getFactor();
    if (null != o.getNet() ) {
    	this.net_id = "net" + this.id;
    	this.net = MoneyHelper.toModel(o.getNet(), this.net_id);
    }
    if (null != o.getUdi() && !o.getUdi().isEmpty()) {
    	this.udi_id = "udi" + this.id;
    	this.udi = ReferenceHelper.toModelFromArray(o.getUdi(), this.udi_id);
    }
    this.noteNumber = org.fhir.utils.JsonUtils.toJson(o.getNoteNumber());
    if (null != o.getAdjudication() && !o.getAdjudication().isEmpty()) {
    	this.adjudication_id = "adjudication" + this.id;
    	this.adjudication = ExplanationOfBenefitAdjudicationHelper.toModelFromArray(o.getAdjudication(), this.adjudication_id);
    }
    if (null != o.getSubDetail() && !o.getSubDetail().isEmpty()) {
    	this.subdetail_id = "subdetail" + this.id;
    	this.subDetail = ExplanationOfBenefitSubDetailHelper.toModelFromArray(o.getSubDetail(), this.subdetail_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public Float getSequence() {
    return this.sequence;
  }
  public void setSequence( Float value) {
    this.sequence = value;
  }
  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public java.util.List<CodeableConceptModel> getRevenue() {
    return this.revenue;
  }
  public void setRevenue( java.util.List<CodeableConceptModel> value) {
    this.revenue = value;
  }
  public java.util.List<CodeableConceptModel> getCategory() {
    return this.category;
  }
  public void setCategory( java.util.List<CodeableConceptModel> value) {
    this.category = value;
  }
  public java.util.List<CodeableConceptModel> getService() {
    return this.service;
  }
  public void setService( java.util.List<CodeableConceptModel> value) {
    this.service = value;
  }
  public java.util.List<CodeableConceptModel> getModifier() {
    return this.modifier;
  }
  public void setModifier( java.util.List<CodeableConceptModel> value) {
    this.modifier = value;
  }
  public java.util.List<CodeableConceptModel> getProgramCode() {
    return this.programCode;
  }
  public void setProgramCode( java.util.List<CodeableConceptModel> value) {
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExplanationOfBenefitDetailModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("factor" + "->" + this.factor + "\n"); 
     builder.append("noteNumber" + "->" + this.noteNumber + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExplanationOfBenefitDetailModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("factor" + "->" + this.factor + "\n"); 
     builder.append("noteNumber" + "->" + this.noteNumber + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}