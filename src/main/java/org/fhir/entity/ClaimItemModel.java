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
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
@Entity
@Table(name="claimitem")
public class ClaimItemModel  {
  /**
  * Description: "A service line number."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private Float sequence;

  /**
  * Description: "CareTeam applicable for this service or product line."
  * Actual type: Array of number-> List<number>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"careTeamLinkId\"", length = 16777215)
  private String careTeamLinkId;

  /**
  * Description: "Diagnosis applicable for this service or product line."
  * Actual type: Array of number-> List<number>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"diagnosisLinkId\"", length = 16777215)
  private String diagnosisLinkId;

  /**
  * Description: "Procedures applicable for this service or product line."
  * Actual type: Array of number-> List<number>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"procedureLinkId\"", length = 16777215)
  private String procedureLinkId;

  /**
  * Description: "Exceptions, special conditions and supporting information pplicable for this service or product line."
  * Actual type: Array of number-> List<number>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"informationLinkId\"", length = 16777215)
  private String informationLinkId;

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
  * Description: "If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,RXNorm,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'."
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
  * Description: "For programs which require reason codes for the inclusion or covering of this billed item under the program or sub-program."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"programCode\"", length = 16777215)
  private String programCode;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"servicedDate\"")
  private String servicedDate;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"servicedPeriod\"", length = 16777215)
  private String servicedPeriod;

  /**
  * Description: "Where the service was provided."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"locationCodeableConcept\"", length = 16777215)
  private String locationCodeableConcept;

  /**
  * Description: "Where the service was provided."
  * Actual type: Address
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"locationAddress\"", length = 16777215)
  private String locationAddress;

  /**
  * Description: "Where the service was provided."
  */
  @javax.persistence.Basic
  @Column(name="\"locationreference_id\"")
  private String locationreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`locationreference_id`", insertable=false, updatable=false)
  private ReferenceModel locationReference;

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
  * Description: "Physical service site on the patient (limb, tooth, etc)."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"bodySite\"", length = 16777215)
  private String bodySite;

  /**
  * Description: "A region or surface of the site, eg. limb region or tooth surface(s)."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"subSite\"", length = 16777215)
  private String subSite;

  /**
  * Description: "A billed item may include goods or services provided in multiple encounters."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> encounter = new java.util.ArrayList<>();

  /**
  * Description: "Second tier of goods and services."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimDetailModel> detail = new java.util.ArrayList<>();

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

  public ClaimItemModel() {
  }

  public ClaimItemModel(ClaimItem o) {
    this.id = o.getId();
      this.sequence = o.getSequence();

      this.careTeamLinkId = org.fhir.utils.JsonUtils.write2String(o.getCareTeamLinkId());

      this.diagnosisLinkId = org.fhir.utils.JsonUtils.write2String(o.getDiagnosisLinkId());

      this.procedureLinkId = org.fhir.utils.JsonUtils.write2String(o.getProcedureLinkId());

      this.informationLinkId = org.fhir.utils.JsonUtils.write2String(o.getInformationLinkId());

      this.revenue = CodeableConcept.toJson(o.getRevenue());
      this.category = CodeableConcept.toJson(o.getCategory());
      this.service = CodeableConcept.toJson(o.getService());
      this.modifier = CodeableConcept.toJson(o.getModifier());
      this.programCode = CodeableConcept.toJson(o.getProgramCode());
      this.servicedDate = o.getServicedDate();

      this.servicedPeriod = Period.toJson(o.getServicedPeriod());
      this.locationCodeableConcept = CodeableConcept.toJson(o.getLocationCodeableConcept());
      this.locationAddress = Address.toJson(o.getLocationAddress());
      if (null != o.getLocationReference()) {
      	this.locationreference_id = "locationReference" + this.getId();
        this.locationReference = new ReferenceModel(o.getLocationReference());
        this.locationReference.setId(this.locationreference_id);
        this.locationReference.parent_id = this.locationReference.getId();
      }

      this.quantity = Quantity.toJson(o.getQuantity());
      this.unitPrice = Money.toJson(o.getUnitPrice());
      this.factor = o.getFactor();

      this.net = Money.toJson(o.getNet());
      this.udi = Reference.toModelArray(o.getUdi());

      this.bodySite = CodeableConcept.toJson(o.getBodySite());
      this.subSite = CodeableConcept.toJson(o.getSubSite());
      this.encounter = Reference.toModelArray(o.getEncounter());

      this.detail = ClaimDetail.toModelArray(o.getDetail());

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
  public void setCareTeamLinkId( String value) {
    this.careTeamLinkId = value;
  }
  public String getCareTeamLinkId() {
    return this.careTeamLinkId;
  }
  public void setDiagnosisLinkId( String value) {
    this.diagnosisLinkId = value;
  }
  public String getDiagnosisLinkId() {
    return this.diagnosisLinkId;
  }
  public void setProcedureLinkId( String value) {
    this.procedureLinkId = value;
  }
  public String getProcedureLinkId() {
    return this.procedureLinkId;
  }
  public void setInformationLinkId( String value) {
    this.informationLinkId = value;
  }
  public String getInformationLinkId() {
    return this.informationLinkId;
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
  public void setServicedDate( String value) {
    this.servicedDate = value;
  }
  public String getServicedDate() {
    return this.servicedDate;
  }
  public void setServicedPeriod( String value) {
    this.servicedPeriod = value;
  }
  public String getServicedPeriod() {
    return this.servicedPeriod;
  }
  public void setLocationCodeableConcept( String value) {
    this.locationCodeableConcept = value;
  }
  public String getLocationCodeableConcept() {
    return this.locationCodeableConcept;
  }
  public void setLocationAddress( String value) {
    this.locationAddress = value;
  }
  public String getLocationAddress() {
    return this.locationAddress;
  }
  public void setLocationReference( ReferenceModel value) {
    this.locationReference = value;
  }
  public ReferenceModel getLocationReference() {
    return this.locationReference;
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
  public void setBodySite( String value) {
    this.bodySite = value;
  }
  public String getBodySite() {
    return this.bodySite;
  }
  public void setSubSite( String value) {
    this.subSite = value;
  }
  public String getSubSite() {
    return this.subSite;
  }
  public void setEncounter( java.util.List<ReferenceModel> value) {
    this.encounter = value;
  }
  public java.util.List<ReferenceModel> getEncounter() {
    return this.encounter;
  }
  public void setDetail( java.util.List<ClaimDetailModel> value) {
    this.detail = value;
  }
  public java.util.List<ClaimDetailModel> getDetail() {
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
     builder.append("sequence" + "[" + String.valueOf(this.sequence) + "]\n"); 
     builder.append("careTeamLinkId" + "[" + String.valueOf(this.careTeamLinkId) + "]\n"); 
     builder.append("diagnosisLinkId" + "[" + String.valueOf(this.diagnosisLinkId) + "]\n"); 
     builder.append("procedureLinkId" + "[" + String.valueOf(this.procedureLinkId) + "]\n"); 
     builder.append("informationLinkId" + "[" + String.valueOf(this.informationLinkId) + "]\n"); 
     builder.append("revenue" + "[" + String.valueOf(this.revenue) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("service" + "[" + String.valueOf(this.service) + "]\n"); 
     builder.append("modifier" + "[" + String.valueOf(this.modifier) + "]\n"); 
     builder.append("programCode" + "[" + String.valueOf(this.programCode) + "]\n"); 
     builder.append("servicedDate" + "[" + String.valueOf(this.servicedDate) + "]\n"); 
     builder.append("servicedPeriod" + "[" + String.valueOf(this.servicedPeriod) + "]\n"); 
     builder.append("locationCodeableConcept" + "[" + String.valueOf(this.locationCodeableConcept) + "]\n"); 
     builder.append("locationAddress" + "[" + String.valueOf(this.locationAddress) + "]\n"); 
     builder.append("locationReference" + "[" + String.valueOf(this.locationReference) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("unitPrice" + "[" + String.valueOf(this.unitPrice) + "]\n"); 
     builder.append("factor" + "[" + String.valueOf(this.factor) + "]\n"); 
     builder.append("net" + "[" + String.valueOf(this.net) + "]\n"); 
     builder.append("udi" + "[" + String.valueOf(this.udi) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
     builder.append("subSite" + "[" + String.valueOf(this.subSite) + "]\n"); 
     builder.append("encounter" + "[" + String.valueOf(this.encounter) + "]\n"); 
     builder.append("detail" + "[" + String.valueOf(this.detail) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}