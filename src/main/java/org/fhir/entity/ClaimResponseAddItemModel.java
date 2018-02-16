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
* "This resource provides the adjudication details from the processing of a Claim resource."
*/
@Entity
@Table(name="claimresponseadditem")
public class ClaimResponseAddItemModel  implements Serializable {
	private static final long serialVersionUID = 151873631176361351L;
  /**
  * Description: "List of input service items which this service line is intended to replace."
  */
  @javax.persistence.Basic
  @Column(name="\"sequenceLinkId\"")
  private String sequenceLinkId;

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
  * Description: "A code to indicate the Professional Service or Product supplied."
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
  * Description: "The fee charged for the professional service or product.."
  */
  @javax.persistence.Basic
  @Column(name="\"fee_id\"")
  private String fee_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="fee_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> fee;

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
  private java.util.List<ClaimResponseAdjudicationModel> adjudication;

  /**
  * Description: "The second tier service adjudications for payor added services."
  */
  @javax.persistence.Basic
  @Column(name="\"detail_id\"")
  private String detail_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="detail_id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseDetail1Model> detail;

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

  public ClaimResponseAddItemModel() {
  }

  public ClaimResponseAddItemModel(ClaimResponseAddItem o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.sequenceLinkId = org.fhir.utils.JsonUtils.write2String(o.getSequenceLinkId());
    this.revenue = JsonUtils.toJson(o.getRevenue());
    this.category = JsonUtils.toJson(o.getCategory());
    this.service = JsonUtils.toJson(o.getService());
    if (null != o.getFee() ) {
    	this.fee_id = "fee" + this.parent_id;
    	this.fee = MoneyHelper.toModel(o.getFee(), this.fee_id);
    }
    this.noteNumber = org.fhir.utils.JsonUtils.write2String(o.getNoteNumber());
    if (null != o.getAdjudication() && !o.getAdjudication().isEmpty()) {
    	this.adjudication_id = "adjudication" + this.parent_id;
    	this.adjudication = ClaimResponseAdjudicationHelper.toModelFromArray(o.getAdjudication(), this.adjudication_id);
    }
    if (null != o.getDetail() && !o.getDetail().isEmpty()) {
    	this.detail_id = "detail" + this.parent_id;
    	this.detail = ClaimResponseDetail1Helper.toModelFromArray(o.getDetail(), this.detail_id);
    }
  }

  public String getSequenceLinkId() {
    return this.sequenceLinkId;
  }
  public void setSequenceLinkId( String value) {
    this.sequenceLinkId = value;
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
  public java.util.List<MoneyModel> getFee() {
    return this.fee;
  }
  public void setFee( java.util.List<MoneyModel> value) {
    this.fee = value;
  }
  public String getNoteNumber() {
    return this.noteNumber;
  }
  public void setNoteNumber( String value) {
    this.noteNumber = value;
  }
  public java.util.List<ClaimResponseAdjudicationModel> getAdjudication() {
    return this.adjudication;
  }
  public void setAdjudication( java.util.List<ClaimResponseAdjudicationModel> value) {
    this.adjudication = value;
  }
  public java.util.List<ClaimResponseDetail1Model> getDetail() {
    return this.detail;
  }
  public void setDetail( java.util.List<ClaimResponseDetail1Model> value) {
    this.detail = value;
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
    builder.append("[ClaimResponseAddItemModel]:" + "\n");
     builder.append("sequenceLinkId" + "->" + this.sequenceLinkId + "\n"); 
     builder.append("revenue" + "->" + this.revenue + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("service" + "->" + this.service + "\n"); 
     builder.append("modifier" + "->" + this.modifier + "\n"); 
     builder.append("noteNumber" + "->" + this.noteNumber + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimResponseAddItemModel]:" + "\n");
     builder.append("sequenceLinkId" + "->" + this.sequenceLinkId + "\n"); 
     builder.append("revenue" + "->" + this.revenue + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("service" + "->" + this.service + "\n"); 
     builder.append("modifier" + "->" + this.modifier + "\n"); 
     builder.append("fee" + "->" + this.fee + "\n"); 
     builder.append("noteNumber" + "->" + this.noteNumber + "\n"); 
     builder.append("adjudication" + "->" + this.adjudication + "\n"); 
     builder.append("detail" + "->" + this.detail + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}