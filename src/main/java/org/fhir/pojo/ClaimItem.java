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
public class ClaimItem  extends BackboneElement  {
  /**
  * Description: "A service line number."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  protected transient Element _sequence;

  /**
  * Description: "CareTeam applicable for this service or product line."
  */
  protected java.util.List<Float> careTeamLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for careTeamLinkId"
  */
  protected transient java.util.List<Element> _careTeamLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Diagnosis applicable for this service or product line."
  */
  protected java.util.List<Float> diagnosisLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for diagnosisLinkId"
  */
  protected transient java.util.List<Element> _diagnosisLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Procedures applicable for this service or product line."
  */
  protected java.util.List<Float> procedureLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for procedureLinkId"
  */
  protected transient java.util.List<Element> _procedureLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Exceptions, special conditions and supporting information pplicable for this service or product line."
  */
  protected java.util.List<Float> informationLinkId = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for informationLinkId"
  */
  protected transient java.util.List<Element> _informationLinkId = new java.util.ArrayList<>();

  /**
  * Description: "The type of reveneu or cost center providing the product and/or service."
  */
  protected CodeableConcept revenue;

  /**
  * Description: "Health Care Service Type Codes  to identify the classification of service or benefits."
  */
  protected CodeableConcept category;

  /**
  * Description: "If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,RXNorm,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'."
  */
  protected CodeableConcept service;

  /**
  * Description: "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours."
  */
  protected java.util.List<CodeableConcept> modifier = new java.util.ArrayList<>();

  /**
  * Description: "For programs which require reason codes for the inclusion or covering of this billed item under the program or sub-program."
  */
  protected java.util.List<CodeableConcept> programCode = new java.util.ArrayList<>();

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String servicedDate;

  /**
  * Description: "Extensions for servicedDate"
  */
  protected transient Element _servicedDate;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  */
  protected Period servicedPeriod;

  /**
  * Description: "Where the service was provided."
  */
  protected CodeableConcept locationCodeableConcept;

  /**
  * Description: "Where the service was provided."
  */
  protected Address locationAddress;

  /**
  * Description: "Where the service was provided."
  */
  protected Reference locationReference;

  /**
  * Description: "The number of repetitions of a service or product."
  */
  protected Quantity quantity;

  /**
  * Description: "If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group."
  */
  protected Money unitPrice;

  /**
  * Description: "A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float factor;

  /**
  * Description: "Extensions for factor"
  */
  protected transient Element _factor;

  /**
  * Description: "The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
  */
  protected Money net;

  /**
  * Description: "List of Unique Device Identifiers associated with this line item."
  */
  protected java.util.List<Reference> udi = new java.util.ArrayList<>();

  /**
  * Description: "Physical service site on the patient (limb, tooth, etc)."
  */
  protected CodeableConcept bodySite;

  /**
  * Description: "A region or surface of the site, eg. limb region or tooth surface(s)."
  */
  protected java.util.List<CodeableConcept> subSite = new java.util.ArrayList<>();

  /**
  * Description: "A billed item may include goods or services provided in multiple encounters."
  */
  protected java.util.List<Reference> encounter = new java.util.ArrayList<>();

  /**
  * Description: "Second tier of goods and services."
  */
  protected java.util.List<ClaimDetail> detail = new java.util.ArrayList<>();

  public ClaimItem() {
  }

  public ClaimItem(ClaimItemModel o) {
    this.id = o.getId();
    if (null != o.getSequence()) {
      this.sequence = o.getSequence();
    }
    if (o.getCareTeamLinkId() != null) {
    	this.careTeamLinkId = org.fhir.utils.JsonUtils.json2Array(o.getCareTeamLinkId());
    }
    if (o.getDiagnosisLinkId() != null) {
    	this.diagnosisLinkId = org.fhir.utils.JsonUtils.json2Array(o.getDiagnosisLinkId());
    }
    if (o.getProcedureLinkId() != null) {
    	this.procedureLinkId = org.fhir.utils.JsonUtils.json2Array(o.getProcedureLinkId());
    }
    if (o.getInformationLinkId() != null) {
    	this.informationLinkId = org.fhir.utils.JsonUtils.json2Array(o.getInformationLinkId());
    }
    this.revenue = CodeableConceptHelper.fromJson(o.getRevenue());
    this.category = CodeableConceptHelper.fromJson(o.getCategory());
    this.service = CodeableConceptHelper.fromJson(o.getService());
    if (null != o.getServicedDate()) {
      this.servicedDate = o.getServicedDate();
    }
    this.servicedPeriod = PeriodHelper.fromJson(o.getServicedPeriod());
    this.locationCodeableConcept = CodeableConceptHelper.fromJson(o.getLocationCodeableConcept());
    if (null != o.getLocationAddress() && !o.getLocationAddress().isEmpty()) {
      this.locationAddress = new Address(o.getLocationAddress().get(0));
    }
    if (null != o.getLocationReference() && !o.getLocationReference().isEmpty()) {
      this.locationReference = new Reference(o.getLocationReference().get(0));
    }
    if (null != o.getQuantity() && !o.getQuantity().isEmpty()) {
      this.quantity = new Quantity(o.getQuantity().get(0));
    }
    if (null != o.getUnitPrice() && !o.getUnitPrice().isEmpty()) {
      this.unitPrice = new Money(o.getUnitPrice().get(0));
    }
    if (null != o.getFactor()) {
      this.factor = o.getFactor();
    }
    if (null != o.getNet() && !o.getNet().isEmpty()) {
      this.net = new Money(o.getNet().get(0));
    }
    if (null != o.getUdi() && !o.getUdi().isEmpty()) {
    	this.udi = ReferenceHelper.fromArray2Array(o.getUdi());
    }
    this.bodySite = CodeableConceptHelper.fromJson(o.getBodySite());
    if (null != o.getEncounter() && !o.getEncounter().isEmpty()) {
    	this.encounter = ReferenceHelper.fromArray2Array(o.getEncounter());
    }
    if (null != o.getDetail() && !o.getDetail().isEmpty()) {
    	this.detail = ClaimDetailHelper.fromArray2Array(o.getDetail());
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimItem]:" + "\n");
     if(this.sequence != null) builder.append("sequence" + "->" + this.sequence.toString() + "\n"); 
     if(this._sequence != null) builder.append("_sequence" + "->" + this._sequence.toString() + "\n"); 
     if(this.careTeamLinkId != null) builder.append("careTeamLinkId" + "->" + this.careTeamLinkId.toString() + "\n"); 
     if(this._careTeamLinkId != null) builder.append("_careTeamLinkId" + "->" + this._careTeamLinkId.toString() + "\n"); 
     if(this.diagnosisLinkId != null) builder.append("diagnosisLinkId" + "->" + this.diagnosisLinkId.toString() + "\n"); 
     if(this._diagnosisLinkId != null) builder.append("_diagnosisLinkId" + "->" + this._diagnosisLinkId.toString() + "\n"); 
     if(this.procedureLinkId != null) builder.append("procedureLinkId" + "->" + this.procedureLinkId.toString() + "\n"); 
     if(this._procedureLinkId != null) builder.append("_procedureLinkId" + "->" + this._procedureLinkId.toString() + "\n"); 
     if(this.informationLinkId != null) builder.append("informationLinkId" + "->" + this.informationLinkId.toString() + "\n"); 
     if(this._informationLinkId != null) builder.append("_informationLinkId" + "->" + this._informationLinkId.toString() + "\n"); 
     if(this.revenue != null) builder.append("revenue" + "->" + this.revenue.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.service != null) builder.append("service" + "->" + this.service.toString() + "\n"); 
     if(this.modifier != null) builder.append("modifier" + "->" + this.modifier.toString() + "\n"); 
     if(this.programCode != null) builder.append("programCode" + "->" + this.programCode.toString() + "\n"); 
     if(this.servicedDate != null) builder.append("servicedDate" + "->" + this.servicedDate.toString() + "\n"); 
     if(this._servicedDate != null) builder.append("_servicedDate" + "->" + this._servicedDate.toString() + "\n"); 
     if(this.servicedPeriod != null) builder.append("servicedPeriod" + "->" + this.servicedPeriod.toString() + "\n"); 
     if(this.locationCodeableConcept != null) builder.append("locationCodeableConcept" + "->" + this.locationCodeableConcept.toString() + "\n"); 
     if(this.locationAddress != null) builder.append("locationAddress" + "->" + this.locationAddress.toString() + "\n"); 
     if(this.locationReference != null) builder.append("locationReference" + "->" + this.locationReference.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.unitPrice != null) builder.append("unitPrice" + "->" + this.unitPrice.toString() + "\n"); 
     if(this.factor != null) builder.append("factor" + "->" + this.factor.toString() + "\n"); 
     if(this._factor != null) builder.append("_factor" + "->" + this._factor.toString() + "\n"); 
     if(this.net != null) builder.append("net" + "->" + this.net.toString() + "\n"); 
     if(this.udi != null) builder.append("udi" + "->" + this.udi.toString() + "\n"); 
     if(this.bodySite != null) builder.append("bodySite" + "->" + this.bodySite.toString() + "\n"); 
     if(this.subSite != null) builder.append("subSite" + "->" + this.subSite.toString() + "\n"); 
     if(this.encounter != null) builder.append("encounter" + "->" + this.encounter.toString() + "\n"); 
     if(this.detail != null) builder.append("detail" + "->" + this.detail.toString() + "\n"); ;
    return builder.toString();
  }


}