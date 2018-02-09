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
import org.fhir.entity.ClaimResponseInsuranceModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides the adjudication details from the processing of a Claim resource."
*/
public class ClaimResponseInsurance  {
  /**
  * Description: "A service line item."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  private transient Element _sequence;

  /**
  * Description: "The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated."
  */
  private Boolean focal;

  /**
  * Description: "Extensions for focal"
  */
  private transient Element _focal;

  /**
  * Description: "Reference to the program or plan identification, underwriter or payor."
  */
  @javax.validation.constraints.NotNull
  private Reference coverage;

  /**
  * Description: "The contract number of a business agreement which describes the terms and conditions."
  */
  private String businessArrangement;

  /**
  * Description: "Extensions for businessArrangement"
  */
  private transient Element _businessArrangement;

  /**
  * Description: "A list of references from the Insurer to which these services pertain."
  */
  private java.util.List<String> preAuthRef = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for preAuthRef"
  */
  private transient java.util.List<Element> _preAuthRef = new java.util.ArrayList<>();

  /**
  * Description: "The Coverages adjudication details."
  */
  private Reference claimResponse;

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

  public ClaimResponseInsurance() {
  }

  public ClaimResponseInsurance(ClaimResponseInsuranceModel o) {
    this.id = o.getId();
      if (null != o.getSequence()) {
        this.sequence = new Float(o.getSequence());
      }

      if (null != o.getFocal()) {
        this.focal = new Boolean(o.getFocal());
      }

      if (null != o.getCoverage()) {
        this.coverage = new Reference(o.getCoverage());
        this.coverage.setId(this.getId());
      }

      if (null != o.getBusinessArrangement()) {
        this.businessArrangement = new String(o.getBusinessArrangement());
      }

      this.preAuthRef = org.fhir.utils.JsonUtils.json2Array(o.getPreAuthRef());

      if (null != o.getClaimResponse()) {
        this.claimResponse = new Reference(o.getClaimResponse());
        this.claimResponse.setId(this.getId());
      }

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
  public void setFocal( Boolean value) {
    this.focal = value;
  }
  public Boolean getFocal() {
    return this.focal;
  }
  public void set_focal( Element value) {
    this._focal = value;
  }
  public Element get_focal() {
    return this._focal;
  }
  public void setCoverage( Reference value) {
    this.coverage = value;
  }
  public Reference getCoverage() {
    return this.coverage;
  }
  public void setBusinessArrangement( String value) {
    this.businessArrangement = value;
  }
  public String getBusinessArrangement() {
    return this.businessArrangement;
  }
  public void set_businessArrangement( Element value) {
    this._businessArrangement = value;
  }
  public Element get_businessArrangement() {
    return this._businessArrangement;
  }
  public void setPreAuthRef( java.util.List<String> value) {
    this.preAuthRef = value;
  }
  public java.util.List<String> getPreAuthRef() {
    return this.preAuthRef;
  }
  public void set_preAuthRef( java.util.List<Element> value) {
    this._preAuthRef = value;
  }
  public java.util.List<Element> get_preAuthRef() {
    return this._preAuthRef;
  }
  public void setClaimResponse( Reference value) {
    this.claimResponse = value;
  }
  public Reference getClaimResponse() {
    return this.claimResponse;
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
     builder.append("focal" + "[" + String.valueOf(this.focal) + "]\n"); 
     builder.append("_focal" + "[" + String.valueOf(this._focal) + "]\n"); 
     builder.append("coverage" + "[" + String.valueOf(this.coverage) + "]\n"); 
     builder.append("businessArrangement" + "[" + String.valueOf(this.businessArrangement) + "]\n"); 
     builder.append("_businessArrangement" + "[" + String.valueOf(this._businessArrangement) + "]\n"); 
     builder.append("preAuthRef" + "[" + String.valueOf(this.preAuthRef) + "]\n"); 
     builder.append("_preAuthRef" + "[" + String.valueOf(this._preAuthRef) + "]\n"); 
     builder.append("claimResponse" + "[" + String.valueOf(this.claimResponse) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ClaimResponseInsurance> fromArray(java.util.List<ClaimResponseInsuranceModel> list) {
    return (java.util.List<ClaimResponseInsurance>)list.stream()
      .map(model -> new ClaimResponseInsurance(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ClaimResponseInsuranceModel> toModelArray(java.util.List<ClaimResponseInsurance> list) {
    return (java.util.List<ClaimResponseInsuranceModel>)list.stream()
      .map(model -> new ClaimResponseInsuranceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ClaimResponseInsurance fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ClaimResponseInsurance.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ClaimResponseInsurance o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ClaimResponseInsurance> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}