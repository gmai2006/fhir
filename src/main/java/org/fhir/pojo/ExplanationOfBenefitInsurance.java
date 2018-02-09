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
import org.fhir.entity.ExplanationOfBenefitInsuranceModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
public class ExplanationOfBenefitInsurance  {
  /**
  * Description: "Reference to the program or plan identification, underwriter or payor."
  */
  private Reference coverage;

  /**
  * Description: "A list of references from the Insurer to which these services pertain."
  */
  private java.util.List<String> preAuthRef = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for preAuthRef"
  */
  private transient java.util.List<Element> _preAuthRef = new java.util.ArrayList<>();

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

  public ExplanationOfBenefitInsurance() {
  }

  public ExplanationOfBenefitInsurance(ExplanationOfBenefitInsuranceModel o) {
    this.id = o.getId();
      if (null != o.getCoverage()) {
        this.coverage = new Reference(o.getCoverage());
        this.coverage.setId(this.getId());
      }

      this.preAuthRef = org.fhir.utils.JsonUtils.json2Array(o.getPreAuthRef());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setCoverage( Reference value) {
    this.coverage = value;
  }
  public Reference getCoverage() {
    return this.coverage;
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
     builder.append("coverage" + "[" + String.valueOf(this.coverage) + "]\n"); 
     builder.append("preAuthRef" + "[" + String.valueOf(this.preAuthRef) + "]\n"); 
     builder.append("_preAuthRef" + "[" + String.valueOf(this._preAuthRef) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ExplanationOfBenefitInsurance> fromArray(java.util.List<ExplanationOfBenefitInsuranceModel> list) {
    return (java.util.List<ExplanationOfBenefitInsurance>)list.stream()
      .map(model -> new ExplanationOfBenefitInsurance(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ExplanationOfBenefitInsuranceModel> toModelArray(java.util.List<ExplanationOfBenefitInsurance> list) {
    return (java.util.List<ExplanationOfBenefitInsuranceModel>)list.stream()
      .map(model -> new ExplanationOfBenefitInsuranceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ExplanationOfBenefitInsurance fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ExplanationOfBenefitInsurance.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ExplanationOfBenefitInsurance o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ExplanationOfBenefitInsurance> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}