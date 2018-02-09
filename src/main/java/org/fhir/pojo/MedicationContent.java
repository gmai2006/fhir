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
import org.fhir.entity.MedicationContentModel;
import com.google.gson.GsonBuilder;

/**
* "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
*/
public class MedicationContent  {
  /**
  * Description: "Identifies one of the items in the package."
  */
  private CodeableConcept itemCodeableConcept;

  /**
  * Description: "Identifies one of the items in the package."
  */
  private Reference itemReference;

  /**
  * Description: "The amount of the product that is in the package."
  */
  private Quantity amount;

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

  public MedicationContent() {
  }

  public MedicationContent(MedicationContentModel o) {
    this.id = o.getId();
      this.itemCodeableConcept = CodeableConcept.fromJson(o.getItemCodeableConcept());
      if (null != o.getItemReference()) {
        this.itemReference = new Reference(o.getItemReference());
        this.itemReference.setId(this.getId());
      }

      this.amount = Quantity.fromJson(o.getAmount());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setItemCodeableConcept( CodeableConcept value) {
    this.itemCodeableConcept = value;
  }
  public CodeableConcept getItemCodeableConcept() {
    return this.itemCodeableConcept;
  }
  public void setItemReference( Reference value) {
    this.itemReference = value;
  }
  public Reference getItemReference() {
    return this.itemReference;
  }
  public void setAmount( Quantity value) {
    this.amount = value;
  }
  public Quantity getAmount() {
    return this.amount;
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
     builder.append("itemCodeableConcept" + "[" + String.valueOf(this.itemCodeableConcept) + "]\n"); 
     builder.append("itemReference" + "[" + String.valueOf(this.itemReference) + "]\n"); 
     builder.append("amount" + "[" + String.valueOf(this.amount) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<MedicationContent> fromArray(java.util.List<MedicationContentModel> list) {
    return (java.util.List<MedicationContent>)list.stream()
      .map(model -> new MedicationContent(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MedicationContentModel> toModelArray(java.util.List<MedicationContent> list) {
    return (java.util.List<MedicationContentModel>)list.stream()
      .map(model -> new MedicationContentModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static MedicationContent fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MedicationContent.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MedicationContent o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MedicationContent> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}