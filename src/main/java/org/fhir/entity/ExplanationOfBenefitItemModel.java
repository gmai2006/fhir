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
@Table(name="explanationofbenefititem")
public class ExplanationOfBenefitItemModel  implements Serializable {
	private static final long serialVersionUID = 151910893738691887L;
  /**
  * Description: "A service line number."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private Float sequence;

  /**
  * Description: "Careteam applicable for this service or product line."
  */
  @javax.persistence.Basic
  @Column(name="\"careTeamLinkId\"")
  private String careTeamLinkId;

  /**
  * Description: "Diagnosis applicable for this service or product line."
  */
  @javax.persistence.Basic
  @Column(name="\"diagnosisLinkId\"")
  private String diagnosisLinkId;

  /**
  * Description: "Procedures applicable for this service or product line."
  */
  @javax.persistence.Basic
  @Column(name="\"procedureLinkId\"")
  private String procedureLinkId;

  /**
  * Description: "Exceptions, special conditions and supporting information pplicable for this service or product line."
  */
  @javax.persistence.Basic
  @Column(name="\"informationLinkId\"")
  private String informationLinkId;

  /**
  * Description: "The type of reveneu or cost center providing the product and/or service."
  */
  @javax.persistence.Basic
  @Column(name="\"revenue_id\"")
  private String revenue_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="revenue_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> revenue;

  /**
  * Description: "Health Care Service Type Codes  to identify the classification of service or benefits."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'."
  */
  @javax.persistence.Basic
  @Column(name="\"service_id\"")
  private String service_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="service_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> service;

  /**
  * Description: "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours."
  */
  @javax.persistence.Basic
  @Column(name="\"modifier_id\"")
  private String modifier_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="modifier_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> modifier;

  /**
  * Description: "For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program."
  */
  @javax.persistence.Basic
  @Column(name="\"programcode_id\"")
  private String programcode_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="programcode_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> programCode;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"servicedDate\"")
  private String servicedDate;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"servicedPeriod\"", length = 16777215)
  private String servicedPeriod;

  /**
  * Description: "Where the service was provided."
  */
  @javax.persistence.Basic
  @Column(name="\"locationcodeableconcept_id\"")
  private String locationcodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="locationcodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> locationCodeableConcept;

  /**
  * Description: "Where the service was provided."
  */
  @javax.persistence.Basic
  @Column(name="\"locationaddress_id\"")
  private String locationaddress_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="locationaddress_id", insertable=false, updatable=false)
  private java.util.List<AddressModel> locationAddress;

  /**
  * Description: "Where the service was provided."
  */
  @javax.persistence.Basic
  @Column(name="\"locationreference_id\"")
  private String locationreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="locationreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> locationReference;

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
  * Description: "Physical service site on the patient (limb, tooth, etc)."
  */
  @javax.persistence.Basic
  @Column(name="\"bodysite_id\"")
  private String bodysite_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="bodysite_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> bodySite;

  /**
  * Description: "A region or surface of the site, eg. limb region or tooth surface(s)."
  */
  @javax.persistence.Basic
  @Column(name="\"subsite_id\"")
  private String subsite_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subsite_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> subSite;

  /**
  * Description: "A billed item may include goods or services provided in multiple encounters."
  */
  @javax.persistence.Basic
  @Column(name="\"encounter_id\"")
  private String encounter_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="encounter_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> encounter;

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
  * Description: "Second tier of goods and services."
  */
  @javax.persistence.Basic
  @Column(name="\"detail_id\"")
  private String detail_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="detail_id", insertable=false, updatable=false)
  private java.util.List<ExplanationOfBenefitDetailModel> detail;

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

  public ExplanationOfBenefitItemModel() {
  }

  public ExplanationOfBenefitItemModel(ExplanationOfBenefitItem o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.sequence = o.getSequence();
    this.careTeamLinkId = org.fhir.utils.JsonUtils.toJson(o.getCareTeamLinkId());
    this.diagnosisLinkId = org.fhir.utils.JsonUtils.toJson(o.getDiagnosisLinkId());
    this.procedureLinkId = org.fhir.utils.JsonUtils.toJson(o.getProcedureLinkId());
    this.informationLinkId = org.fhir.utils.JsonUtils.toJson(o.getInformationLinkId());
    if (null != o.getRevenue() ) {
    	this.revenue_id = "revenue" + this.parent_id;
    	this.revenue = CodeableConceptHelper.toModel(o.getRevenue(), this.revenue_id);
    }
    if (null != o.getCategory() ) {
    	this.category_id = "category" + this.parent_id;
    	this.category = CodeableConceptHelper.toModel(o.getCategory(), this.category_id);
    }
    if (null != o.getService() ) {
    	this.service_id = "service" + this.parent_id;
    	this.service = CodeableConceptHelper.toModel(o.getService(), this.service_id);
    }
    if (null != o.getModifier() && !o.getModifier().isEmpty()) {
    	this.modifier_id = "modifier" + this.parent_id;
    	this.modifier = CodeableConceptHelper.toModelFromArray(o.getModifier(), this.modifier_id);
    }
    if (null != o.getProgramCode() && !o.getProgramCode().isEmpty()) {
    	this.programcode_id = "programcode" + this.parent_id;
    	this.programCode = CodeableConceptHelper.toModelFromArray(o.getProgramCode(), this.programcode_id);
    }
    this.servicedDate = o.getServicedDate();
    if (null != o.getServicedPeriod()) {
    	this.servicedPeriod = JsonUtils.toJson(o.getServicedPeriod());
    }
    if (null != o.getLocationCodeableConcept() ) {
    	this.locationcodeableconcept_id = "locationcodeableconcept" + this.parent_id;
    	this.locationCodeableConcept = CodeableConceptHelper.toModel(o.getLocationCodeableConcept(), this.locationcodeableconcept_id);
    }
    if (null != o.getLocationAddress() ) {
    	this.locationaddress_id = "locationaddress" + this.parent_id;
    	this.locationAddress = AddressHelper.toModel(o.getLocationAddress(), this.locationaddress_id);
    }
    if (null != o.getLocationReference() ) {
    	this.locationreference_id = "locationreference" + this.parent_id;
    	this.locationReference = ReferenceHelper.toModel(o.getLocationReference(), this.locationreference_id);
    }
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
    if (null != o.getBodySite() ) {
    	this.bodysite_id = "bodysite" + this.parent_id;
    	this.bodySite = CodeableConceptHelper.toModel(o.getBodySite(), this.bodysite_id);
    }
    if (null != o.getSubSite() && !o.getSubSite().isEmpty()) {
    	this.subsite_id = "subsite" + this.parent_id;
    	this.subSite = CodeableConceptHelper.toModelFromArray(o.getSubSite(), this.subsite_id);
    }
    if (null != o.getEncounter() && !o.getEncounter().isEmpty()) {
    	this.encounter_id = "encounter" + this.parent_id;
    	this.encounter = ReferenceHelper.toModelFromArray(o.getEncounter(), this.encounter_id);
    }
    this.noteNumber = org.fhir.utils.JsonUtils.toJson(o.getNoteNumber());
    if (null != o.getAdjudication() && !o.getAdjudication().isEmpty()) {
    	this.adjudication_id = "adjudication" + this.parent_id;
    	this.adjudication = ExplanationOfBenefitAdjudicationHelper.toModelFromArray(o.getAdjudication(), this.adjudication_id);
    }
    if (null != o.getDetail() && !o.getDetail().isEmpty()) {
    	this.detail_id = "detail" + this.parent_id;
    	this.detail = ExplanationOfBenefitDetailHelper.toModelFromArray(o.getDetail(), this.detail_id);
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
  public String getCareTeamLinkId() {
    return this.careTeamLinkId;
  }
  public void setCareTeamLinkId( String value) {
    this.careTeamLinkId = value;
  }
  public String getDiagnosisLinkId() {
    return this.diagnosisLinkId;
  }
  public void setDiagnosisLinkId( String value) {
    this.diagnosisLinkId = value;
  }
  public String getProcedureLinkId() {
    return this.procedureLinkId;
  }
  public void setProcedureLinkId( String value) {
    this.procedureLinkId = value;
  }
  public String getInformationLinkId() {
    return this.informationLinkId;
  }
  public void setInformationLinkId( String value) {
    this.informationLinkId = value;
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
  public String getServicedDate() {
    return this.servicedDate;
  }
  public void setServicedDate( String value) {
    this.servicedDate = value;
  }
  public String getServicedPeriod() {
    return this.servicedPeriod;
  }
  public void setServicedPeriod( String value) {
    this.servicedPeriod = value;
  }
  public java.util.List<CodeableConceptModel> getLocationCodeableConcept() {
    return this.locationCodeableConcept;
  }
  public void setLocationCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.locationCodeableConcept = value;
  }
  public java.util.List<AddressModel> getLocationAddress() {
    return this.locationAddress;
  }
  public void setLocationAddress( java.util.List<AddressModel> value) {
    this.locationAddress = value;
  }
  public java.util.List<ReferenceModel> getLocationReference() {
    return this.locationReference;
  }
  public void setLocationReference( java.util.List<ReferenceModel> value) {
    this.locationReference = value;
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
  public java.util.List<CodeableConceptModel> getBodySite() {
    return this.bodySite;
  }
  public void setBodySite( java.util.List<CodeableConceptModel> value) {
    this.bodySite = value;
  }
  public java.util.List<CodeableConceptModel> getSubSite() {
    return this.subSite;
  }
  public void setSubSite( java.util.List<CodeableConceptModel> value) {
    this.subSite = value;
  }
  public java.util.List<ReferenceModel> getEncounter() {
    return this.encounter;
  }
  public void setEncounter( java.util.List<ReferenceModel> value) {
    this.encounter = value;
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
  public java.util.List<ExplanationOfBenefitDetailModel> getDetail() {
    return this.detail;
  }
  public void setDetail( java.util.List<ExplanationOfBenefitDetailModel> value) {
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
    builder.append("[ExplanationOfBenefitItemModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("careTeamLinkId" + "->" + this.careTeamLinkId + "\n"); 
     builder.append("diagnosisLinkId" + "->" + this.diagnosisLinkId + "\n"); 
     builder.append("procedureLinkId" + "->" + this.procedureLinkId + "\n"); 
     builder.append("informationLinkId" + "->" + this.informationLinkId + "\n"); 
     builder.append("servicedDate" + "->" + this.servicedDate + "\n"); 
     builder.append("servicedPeriod" + "->" + this.servicedPeriod + "\n"); 
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
    builder.append("[ExplanationOfBenefitItemModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("careTeamLinkId" + "->" + this.careTeamLinkId + "\n"); 
     builder.append("diagnosisLinkId" + "->" + this.diagnosisLinkId + "\n"); 
     builder.append("procedureLinkId" + "->" + this.procedureLinkId + "\n"); 
     builder.append("informationLinkId" + "->" + this.informationLinkId + "\n"); 
     builder.append("revenue" + "->" + this.revenue + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("service" + "->" + this.service + "\n"); 
     builder.append("modifier" + "->" + this.modifier + "\n"); 
     builder.append("programCode" + "->" + this.programCode + "\n"); 
     builder.append("servicedDate" + "->" + this.servicedDate + "\n"); 
     builder.append("servicedPeriod" + "->" + this.servicedPeriod + "\n"); 
     builder.append("locationCodeableConcept" + "->" + this.locationCodeableConcept + "\n"); 
     builder.append("locationAddress" + "->" + this.locationAddress + "\n"); 
     builder.append("locationReference" + "->" + this.locationReference + "\n"); 
     builder.append("quantity" + "->" + this.quantity + "\n"); 
     builder.append("unitPrice" + "->" + this.unitPrice + "\n"); 
     builder.append("factor" + "->" + this.factor + "\n"); 
     builder.append("net" + "->" + this.net + "\n"); 
     builder.append("udi" + "->" + this.udi + "\n"); 
     builder.append("bodySite" + "->" + this.bodySite + "\n"); 
     builder.append("subSite" + "->" + this.subSite + "\n"); 
     builder.append("encounter" + "->" + this.encounter + "\n"); 
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