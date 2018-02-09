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
import org.fhir.entity.ExplanationOfBenefitAccidentModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
public class ExplanationOfBenefitAccident  {
  /**
  * Description: "Date of an accident which these services are addressing."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "Type of accident: work, auto, etc."
  */
  private CodeableConcept type;

  /**
  * Description: "Where the accident occurred."
  */
  private Address locationAddress;

  /**
  * Description: "Where the accident occurred."
  */
  private Reference locationReference;

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

  public ExplanationOfBenefitAccident() {
  }

  public ExplanationOfBenefitAccident(ExplanationOfBenefitAccidentModel o) {
    this.id = o.getId();
      if (null != o.getDate()) {
        this.date = new String(o.getDate());
      }

      this.type = CodeableConcept.fromJson(o.getType());
      this.locationAddress = Address.fromJson(o.getLocationAddress());
      if (null != o.getLocationReference()) {
        this.locationReference = new Reference(o.getLocationReference());
        this.locationReference.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void set_date( Element value) {
    this._date = value;
  }
  public Element get_date() {
    return this._date;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
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
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("_date" + "[" + String.valueOf(this._date) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("locationAddress" + "[" + String.valueOf(this.locationAddress) + "]\n"); 
     builder.append("locationReference" + "[" + String.valueOf(this.locationReference) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ExplanationOfBenefitAccident> fromArray(java.util.List<ExplanationOfBenefitAccidentModel> list) {
    return (java.util.List<ExplanationOfBenefitAccident>)list.stream()
      .map(model -> new ExplanationOfBenefitAccident(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ExplanationOfBenefitAccidentModel> toModelArray(java.util.List<ExplanationOfBenefitAccident> list) {
    return (java.util.List<ExplanationOfBenefitAccidentModel>)list.stream()
      .map(model -> new ExplanationOfBenefitAccidentModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ExplanationOfBenefitAccident fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ExplanationOfBenefitAccident.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ExplanationOfBenefitAccident o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ExplanationOfBenefitAccident> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}