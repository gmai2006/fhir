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
import org.fhir.entity.MedicationDispenseSubstitutionModel;
import com.google.gson.GsonBuilder;

/**
* "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
*/
public class MedicationDispenseSubstitution  {
  /**
  * Description: "True if the dispenser dispensed a different drug or product from what was prescribed."
  */
  private Boolean wasSubstituted;

  /**
  * Description: "Extensions for wasSubstituted"
  */
  private transient Element _wasSubstituted;

  /**
  * Description: "A code signifying whether a different drug was dispensed from what was prescribed."
  */
  private CodeableConcept type;

  /**
  * Description: "Indicates the reason for the substitution of (or lack of substitution) from what was prescribed."
  */
  private java.util.List<CodeableConcept> reason = new java.util.ArrayList<>();

  /**
  * Description: "The person or organization that has primary responsibility for the substitution."
  */
  private java.util.List<Reference> responsibleParty = new java.util.ArrayList<>();

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

  public MedicationDispenseSubstitution() {
  }

  public MedicationDispenseSubstitution(MedicationDispenseSubstitutionModel o) {
    this.id = o.getId();
      if (null != o.getWasSubstituted()) {
        this.wasSubstituted = new Boolean(o.getWasSubstituted());
      }

      this.type = CodeableConcept.fromJson(o.getType());
      this.reason = CodeableConcept.fromArray(o.getReason());
      this.responsibleParty = Reference.fromArray(o.getResponsibleParty());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setWasSubstituted( Boolean value) {
    this.wasSubstituted = value;
  }
  public Boolean getWasSubstituted() {
    return this.wasSubstituted;
  }
  public void set_wasSubstituted( Element value) {
    this._wasSubstituted = value;
  }
  public Element get_wasSubstituted() {
    return this._wasSubstituted;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setReason( java.util.List<CodeableConcept> value) {
    this.reason = value;
  }
  public java.util.List<CodeableConcept> getReason() {
    return this.reason;
  }
  public void setResponsibleParty( java.util.List<Reference> value) {
    this.responsibleParty = value;
  }
  public java.util.List<Reference> getResponsibleParty() {
    return this.responsibleParty;
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
     builder.append("wasSubstituted" + "[" + String.valueOf(this.wasSubstituted) + "]\n"); 
     builder.append("_wasSubstituted" + "[" + String.valueOf(this._wasSubstituted) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("responsibleParty" + "[" + String.valueOf(this.responsibleParty) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<MedicationDispenseSubstitution> fromArray(java.util.List<MedicationDispenseSubstitutionModel> list) {
    return (java.util.List<MedicationDispenseSubstitution>)list.stream()
      .map(model -> new MedicationDispenseSubstitution(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MedicationDispenseSubstitutionModel> toModelArray(java.util.List<MedicationDispenseSubstitution> list) {
    return (java.util.List<MedicationDispenseSubstitutionModel>)list.stream()
      .map(model -> new MedicationDispenseSubstitutionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static MedicationDispenseSubstitution fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MedicationDispenseSubstitution.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MedicationDispenseSubstitution o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MedicationDispenseSubstitution> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}