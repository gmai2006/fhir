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
import org.fhir.entity.EligibilityResponseFinancialModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides eligibility and plan details from the processing of an Eligibility resource."
*/
public class EligibilityResponseFinancial  {
  /**
  * Description: "Deductable, visits, benefit amount."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept type;

  /**
  * Description: "Benefits allowed."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float allowedUnsignedInt;

  /**
  * Description: "Extensions for allowedUnsignedInt"
  */
  private transient Element _allowedUnsignedInt;

  /**
  * Description: "Benefits allowed."
  */
  private String allowedString;

  /**
  * Description: "Extensions for allowedString"
  */
  private transient Element _allowedString;

  /**
  * Description: "Benefits allowed."
  */
  private Money allowedMoney;

  /**
  * Description: "Benefits used."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float usedUnsignedInt;

  /**
  * Description: "Extensions for usedUnsignedInt"
  */
  private transient Element _usedUnsignedInt;

  /**
  * Description: "Benefits used."
  */
  private Money usedMoney;

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

  public EligibilityResponseFinancial() {
  }

  public EligibilityResponseFinancial(EligibilityResponseFinancialModel o) {
    this.id = o.getId();
      this.type = CodeableConcept.fromJson(o.getType());
      if (null != o.getAllowedUnsignedInt()) {
        this.allowedUnsignedInt = new Float(o.getAllowedUnsignedInt());
      }

      if (null != o.getAllowedString()) {
        this.allowedString = new String(o.getAllowedString());
      }

      this.allowedMoney = Money.fromJson(o.getAllowedMoney());
      if (null != o.getUsedUnsignedInt()) {
        this.usedUnsignedInt = new Float(o.getUsedUnsignedInt());
      }

      this.usedMoney = Money.fromJson(o.getUsedMoney());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setAllowedUnsignedInt( Float value) {
    this.allowedUnsignedInt = value;
  }
  public Float getAllowedUnsignedInt() {
    return this.allowedUnsignedInt;
  }
  public void set_allowedUnsignedInt( Element value) {
    this._allowedUnsignedInt = value;
  }
  public Element get_allowedUnsignedInt() {
    return this._allowedUnsignedInt;
  }
  public void setAllowedString( String value) {
    this.allowedString = value;
  }
  public String getAllowedString() {
    return this.allowedString;
  }
  public void set_allowedString( Element value) {
    this._allowedString = value;
  }
  public Element get_allowedString() {
    return this._allowedString;
  }
  public void setAllowedMoney( Money value) {
    this.allowedMoney = value;
  }
  public Money getAllowedMoney() {
    return this.allowedMoney;
  }
  public void setUsedUnsignedInt( Float value) {
    this.usedUnsignedInt = value;
  }
  public Float getUsedUnsignedInt() {
    return this.usedUnsignedInt;
  }
  public void set_usedUnsignedInt( Element value) {
    this._usedUnsignedInt = value;
  }
  public Element get_usedUnsignedInt() {
    return this._usedUnsignedInt;
  }
  public void setUsedMoney( Money value) {
    this.usedMoney = value;
  }
  public Money getUsedMoney() {
    return this.usedMoney;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("allowedUnsignedInt" + "[" + String.valueOf(this.allowedUnsignedInt) + "]\n"); 
     builder.append("_allowedUnsignedInt" + "[" + String.valueOf(this._allowedUnsignedInt) + "]\n"); 
     builder.append("allowedString" + "[" + String.valueOf(this.allowedString) + "]\n"); 
     builder.append("_allowedString" + "[" + String.valueOf(this._allowedString) + "]\n"); 
     builder.append("allowedMoney" + "[" + String.valueOf(this.allowedMoney) + "]\n"); 
     builder.append("usedUnsignedInt" + "[" + String.valueOf(this.usedUnsignedInt) + "]\n"); 
     builder.append("_usedUnsignedInt" + "[" + String.valueOf(this._usedUnsignedInt) + "]\n"); 
     builder.append("usedMoney" + "[" + String.valueOf(this.usedMoney) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<EligibilityResponseFinancial> fromArray(java.util.List<EligibilityResponseFinancialModel> list) {
    return (java.util.List<EligibilityResponseFinancial>)list.stream()
      .map(model -> new EligibilityResponseFinancial(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<EligibilityResponseFinancialModel> toModelArray(java.util.List<EligibilityResponseFinancial> list) {
    return (java.util.List<EligibilityResponseFinancialModel>)list.stream()
      .map(model -> new EligibilityResponseFinancialModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static EligibilityResponseFinancial fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, EligibilityResponseFinancial.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(EligibilityResponseFinancial o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<EligibilityResponseFinancial> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}