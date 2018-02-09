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
import org.fhir.entity.ClaimItemModel;
import com.google.gson.GsonBuilder;

/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
public class ClaimItem  {
  /**
  * Description: "A service line number."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  private transient Element _sequence;

  /**
  * Description: "CareTeam applicable for this service or product line."
  */
  private java.util.List<Float> careTeamLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for careTeamLinkId"
  */
  private transient java.util.List<Element> _careTeamLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Diagnosis applicable for this service or product line."
  */
  private java.util.List<Float> diagnosisLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for diagnosisLinkId"
  */
  private transient java.util.List<Element> _diagnosisLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Procedures applicable for this service or product line."
  */
  private java.util.List<Float> procedureLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for procedureLinkId"
  */
  private transient java.util.List<Element> _procedureLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Exceptions, special conditions and supporting information pplicable for this service or product line."
  */
  private java.util.List<Float> informationLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for informationLinkId"
  */
  private transient java.util.List<Element> _informationLinkId = new java.util.ArrayList<>();

  /**
  * Description: "The type of reveneu or cost center providing the product and/or service."
  */
  private CodeableConcept revenue;

  /**
  * Description: "Health Care Service Type Codes  to identify the classification of service or benefits."
  */
  private CodeableConcept category;

  /**
  * Description: "If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,RXNorm,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'."
  */
  private CodeableConcept service;

  /**
  * Description: "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours."
  */
  private java.util.List<CodeableConcept> modifier = new java.util.ArrayList<>();

  /**
  * Description: "For programs which require reason codes for the inclusion or covering of this billed item under the program or sub-program."
  */
  private java.util.List<CodeableConcept> programCode = new java.util.ArrayList<>();

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String servicedDate;

  /**
  * Description: "Extensions for servicedDate"
  */
  private transient Element _servicedDate;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  */
  private Period servicedPeriod;

  /**
  * Description: "Where the service was provided."
  */
  private CodeableConcept locationCodeableConcept;

  /**
  * Description: "Where the service was provided."
  */
  private Address locationAddress;

  /**
  * Description: "Where the service was provided."
  */
  private Reference locationReference;

  /**
  * Description: "The number of repetitions of a service or product."
  */
  private Quantity quantity;

  /**
  * Description: "If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group."
  */
  private Money unitPrice;

  /**
  * Description: "A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float factor;

  /**
  * Description: "Extensions for factor"
  */
  private transient Element _factor;

  /**
  * Description: "The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
  */
  private Money net;

  /**
  * Description: "List of Unique Device Identifiers associated with this line item."
  */
  private java.util.List<Reference> udi = new java.util.ArrayList<>();

  /**
  * Description: "Physical service site on the patient (limb, tooth, etc)."
  */
  private CodeableConcept bodySite;

  /**
  * Description: "A region or surface of the site, eg. limb region or tooth surface(s)."
  */
  private java.util.List<CodeableConcept> subSite = new java.util.ArrayList<>();

  /**
  * Description: "A billed item may include goods or services provided in multiple encounters."
  */
  private java.util.List<Reference> encounter = new java.util.ArrayList<>();

  /**
  * Description: "Second tier of goods and services."
  */
  private java.util.List<ClaimDetail> detail = new java.util.ArrayList<>();

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

  public ClaimItem() {
  }

  public ClaimItem(ClaimItemModel o) {
    this.id = o.getId();
      if (null != o.getSequence()) {
        this.sequence = new Float(o.getSequence());
      }

      this.careTeamLinkId = org.fhir.utils.JsonUtils.json2Array(o.getCareTeamLinkId());

      this.diagnosisLinkId = org.fhir.utils.JsonUtils.json2Array(o.getDiagnosisLinkId());

      this.procedureLinkId = org.fhir.utils.JsonUtils.json2Array(o.getProcedureLinkId());

      this.informationLinkId = org.fhir.utils.JsonUtils.json2Array(o.getInformationLinkId());

      this.revenue = CodeableConcept.fromJson(o.getRevenue());
      this.category = CodeableConcept.fromJson(o.getCategory());
      this.service = CodeableConcept.fromJson(o.getService());
      this.modifier = CodeableConcept.fromArray(o.getModifier());
      this.programCode = CodeableConcept.fromArray(o.getProgramCode());
      if (null != o.getServicedDate()) {
        this.servicedDate = new String(o.getServicedDate());
      }

      this.servicedPeriod = Period.fromJson(o.getServicedPeriod());
      this.locationCodeableConcept = CodeableConcept.fromJson(o.getLocationCodeableConcept());
      this.locationAddress = Address.fromJson(o.getLocationAddress());
      if (null != o.getLocationReference()) {
        this.locationReference = new Reference(o.getLocationReference());
        this.locationReference.setId(this.getId());
      }

      this.quantity = Quantity.fromJson(o.getQuantity());
      this.unitPrice = Money.fromJson(o.getUnitPrice());
      if (null != o.getFactor()) {
        this.factor = new Float(o.getFactor());
      }

      this.net = Money.fromJson(o.getNet());
      this.udi = Reference.fromArray(o.getUdi());

      this.bodySite = CodeableConcept.fromJson(o.getBodySite());
      this.subSite = CodeableConcept.fromArray(o.getSubSite());
      this.encounter = Reference.fromArray(o.getEncounter());

      this.detail = ClaimDetail.fromArray(o.getDetail());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Float getSequence() {
    return this.sequence;
  }
  public void set_sequence( Element value) {
    this._sequence = value;
  }
  public Element get_sequence() {
    return this._sequence;
  }
  public void setCareTeamLinkId( java.util.List<Float> value) {
    this.careTeamLinkId = value;
  }
  public java.util.List<Float> getCareTeamLinkId() {
    return this.careTeamLinkId;
  }
  public void set_careTeamLinkId( java.util.List<Element> value) {
    this._careTeamLinkId = value;
  }
  public java.util.List<Element> get_careTeamLinkId() {
    return this._careTeamLinkId;
  }
  public void setDiagnosisLinkId( java.util.List<Float> value) {
    this.diagnosisLinkId = value;
  }
  public java.util.List<Float> getDiagnosisLinkId() {
    return this.diagnosisLinkId;
  }
  public void set_diagnosisLinkId( java.util.List<Element> value) {
    this._diagnosisLinkId = value;
  }
  public java.util.List<Element> get_diagnosisLinkId() {
    return this._diagnosisLinkId;
  }
  public void setProcedureLinkId( java.util.List<Float> value) {
    this.procedureLinkId = value;
  }
  public java.util.List<Float> getProcedureLinkId() {
    return this.procedureLinkId;
  }
  public void set_procedureLinkId( java.util.List<Element> value) {
    this._procedureLinkId = value;
  }
  public java.util.List<Element> get_procedureLinkId() {
    return this._procedureLinkId;
  }
  public void setInformationLinkId( java.util.List<Float> value) {
    this.informationLinkId = value;
  }
  public java.util.List<Float> getInformationLinkId() {
    return this.informationLinkId;
  }
  public void set_informationLinkId( java.util.List<Element> value) {
    this._informationLinkId = value;
  }
  public java.util.List<Element> get_informationLinkId() {
    return this._informationLinkId;
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
  public void setProgramCode( java.util.List<CodeableConcept> value) {
    this.programCode = value;
  }
  public java.util.List<CodeableConcept> getProgramCode() {
    return this.programCode;
  }
  public void setServicedDate( String value) {
    this.servicedDate = value;
  }
  public String getServicedDate() {
    return this.servicedDate;
  }
  public void set_servicedDate( Element value) {
    this._servicedDate = value;
  }
  public Element get_servicedDate() {
    return this._servicedDate;
  }
  public void setServicedPeriod( Period value) {
    this.servicedPeriod = value;
  }
  public Period getServicedPeriod() {
    return this.servicedPeriod;
  }
  public void setLocationCodeableConcept( CodeableConcept value) {
    this.locationCodeableConcept = value;
  }
  public CodeableConcept getLocationCodeableConcept() {
    return this.locationCodeableConcept;
  }
  public void setLocationAddress( Address value) {
    this.locationAddress = value;
  }
  public Address getLocationAddress() {
    return this.locationAddress;
  }
  public void setLocationReference( Reference value) {
    this.locationReference = value;
  }
  public Reference getLocationReference() {
    return this.locationReference;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setUnitPrice( Money value) {
    this.unitPrice = value;
  }
  public Money getUnitPrice() {
    return this.unitPrice;
  }
  public void setFactor( Float value) {
    this.factor = value;
  }
  public Float getFactor() {
    return this.factor;
  }
  public void set_factor( Element value) {
    this._factor = value;
  }
  public Element get_factor() {
    return this._factor;
  }
  public void setNet( Money value) {
    this.net = value;
  }
  public Money getNet() {
    return this.net;
  }
  public void setUdi( java.util.List<Reference> value) {
    this.udi = value;
  }
  public java.util.List<Reference> getUdi() {
    return this.udi;
  }
  public void setBodySite( CodeableConcept value) {
    this.bodySite = value;
  }
  public CodeableConcept getBodySite() {
    return this.bodySite;
  }
  public void setSubSite( java.util.List<CodeableConcept> value) {
    this.subSite = value;
  }
  public java.util.List<CodeableConcept> getSubSite() {
    return this.subSite;
  }
  public void setEncounter( java.util.List<Reference> value) {
    this.encounter = value;
  }
  public java.util.List<Reference> getEncounter() {
    return this.encounter;
  }
  public void setDetail( java.util.List<ClaimDetail> value) {
    this.detail = value;
  }
  public java.util.List<ClaimDetail> getDetail() {
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
     builder.append("sequence" + "[" + String.valueOf(this.sequence) + "]\n"); 
     builder.append("_sequence" + "[" + String.valueOf(this._sequence) + "]\n"); 
     builder.append("careTeamLinkId" + "[" + String.valueOf(this.careTeamLinkId) + "]\n"); 
     builder.append("_careTeamLinkId" + "[" + String.valueOf(this._careTeamLinkId) + "]\n"); 
     builder.append("diagnosisLinkId" + "[" + String.valueOf(this.diagnosisLinkId) + "]\n"); 
     builder.append("_diagnosisLinkId" + "[" + String.valueOf(this._diagnosisLinkId) + "]\n"); 
     builder.append("procedureLinkId" + "[" + String.valueOf(this.procedureLinkId) + "]\n"); 
     builder.append("_procedureLinkId" + "[" + String.valueOf(this._procedureLinkId) + "]\n"); 
     builder.append("informationLinkId" + "[" + String.valueOf(this.informationLinkId) + "]\n"); 
     builder.append("_informationLinkId" + "[" + String.valueOf(this._informationLinkId) + "]\n"); 
     builder.append("revenue" + "[" + String.valueOf(this.revenue) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("service" + "[" + String.valueOf(this.service) + "]\n"); 
     builder.append("modifier" + "[" + String.valueOf(this.modifier) + "]\n"); 
     builder.append("programCode" + "[" + String.valueOf(this.programCode) + "]\n"); 
     builder.append("servicedDate" + "[" + String.valueOf(this.servicedDate) + "]\n"); 
     builder.append("_servicedDate" + "[" + String.valueOf(this._servicedDate) + "]\n"); 
     builder.append("servicedPeriod" + "[" + String.valueOf(this.servicedPeriod) + "]\n"); 
     builder.append("locationCodeableConcept" + "[" + String.valueOf(this.locationCodeableConcept) + "]\n"); 
     builder.append("locationAddress" + "[" + String.valueOf(this.locationAddress) + "]\n"); 
     builder.append("locationReference" + "[" + String.valueOf(this.locationReference) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("unitPrice" + "[" + String.valueOf(this.unitPrice) + "]\n"); 
     builder.append("factor" + "[" + String.valueOf(this.factor) + "]\n"); 
     builder.append("_factor" + "[" + String.valueOf(this._factor) + "]\n"); 
     builder.append("net" + "[" + String.valueOf(this.net) + "]\n"); 
     builder.append("udi" + "[" + String.valueOf(this.udi) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
     builder.append("subSite" + "[" + String.valueOf(this.subSite) + "]\n"); 
     builder.append("encounter" + "[" + String.valueOf(this.encounter) + "]\n"); 
     builder.append("detail" + "[" + String.valueOf(this.detail) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ClaimItem> fromArray(java.util.List<ClaimItemModel> list) {
    return (java.util.List<ClaimItem>)list.stream()
      .map(model -> new ClaimItem(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ClaimItemModel> toModelArray(java.util.List<ClaimItem> list) {
    return (java.util.List<ClaimItemModel>)list.stream()
      .map(model -> new ClaimItemModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ClaimItem fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ClaimItem.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ClaimItem o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ClaimItem> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}