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
import org.fhir.entity.EncounterHospitalizationModel;
import com.google.gson.GsonBuilder;

/**
* "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
*/
public class EncounterHospitalization  {
  /**
  * Description: "Pre-admission identifier."
  */
  private Identifier preAdmissionIdentifier;

  /**
  * Description: "The location from which the patient came before admission."
  */
  private Reference origin;

  /**
  * Description: "From where patient was admitted (physician referral, transfer)."
  */
  private CodeableConcept admitSource;

  /**
  * Description: "Whether this hospitalization is a readmission and why if known."
  */
  private CodeableConcept reAdmission;

  /**
  * Description: "Diet preferences reported by the patient."
  */
  private java.util.List<CodeableConcept> dietPreference = new java.util.ArrayList<>();

  /**
  * Description: "Special courtesies (VIP, board member)."
  */
  private java.util.List<CodeableConcept> specialCourtesy = new java.util.ArrayList<>();

  /**
  * Description: "Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things."
  */
  private java.util.List<CodeableConcept> specialArrangement = new java.util.ArrayList<>();

  /**
  * Description: "Location to which the patient is discharged."
  */
  private Reference destination;

  /**
  * Description: "Category or kind of location after discharge."
  */
  private CodeableConcept dischargeDisposition;

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

  public EncounterHospitalization() {
  }

  public EncounterHospitalization(EncounterHospitalizationModel o) {
    this.id = o.getId();
      this.preAdmissionIdentifier = Identifier.fromJson(o.getPreAdmissionIdentifier());
      if (null != o.getOrigin()) {
        this.origin = new Reference(o.getOrigin());
        this.origin.setId(this.getId());
      }

      this.admitSource = CodeableConcept.fromJson(o.getAdmitSource());
      this.reAdmission = CodeableConcept.fromJson(o.getReAdmission());
      this.dietPreference = CodeableConcept.fromArray(o.getDietPreference());
      this.specialCourtesy = CodeableConcept.fromArray(o.getSpecialCourtesy());
      this.specialArrangement = CodeableConcept.fromArray(o.getSpecialArrangement());
      if (null != o.getDestination()) {
        this.destination = new Reference(o.getDestination());
        this.destination.setId(this.getId());
      }

      this.dischargeDisposition = CodeableConcept.fromJson(o.getDischargeDisposition());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setPreAdmissionIdentifier( Identifier value) {
    this.preAdmissionIdentifier = value;
  }
  public Identifier getPreAdmissionIdentifier() {
    return this.preAdmissionIdentifier;
  }
  public void setOrigin( Reference value) {
    this.origin = value;
  }
  public Reference getOrigin() {
    return this.origin;
  }
  public void setAdmitSource( CodeableConcept value) {
    this.admitSource = value;
  }
  public CodeableConcept getAdmitSource() {
    return this.admitSource;
  }
  public void setReAdmission( CodeableConcept value) {
    this.reAdmission = value;
  }
  public CodeableConcept getReAdmission() {
    return this.reAdmission;
  }
  public void setDietPreference( java.util.List<CodeableConcept> value) {
    this.dietPreference = value;
  }
  public java.util.List<CodeableConcept> getDietPreference() {
    return this.dietPreference;
  }
  public void setSpecialCourtesy( java.util.List<CodeableConcept> value) {
    this.specialCourtesy = value;
  }
  public java.util.List<CodeableConcept> getSpecialCourtesy() {
    return this.specialCourtesy;
  }
  public void setSpecialArrangement( java.util.List<CodeableConcept> value) {
    this.specialArrangement = value;
  }
  public java.util.List<CodeableConcept> getSpecialArrangement() {
    return this.specialArrangement;
  }
  public void setDestination( Reference value) {
    this.destination = value;
  }
  public Reference getDestination() {
    return this.destination;
  }
  public void setDischargeDisposition( CodeableConcept value) {
    this.dischargeDisposition = value;
  }
  public CodeableConcept getDischargeDisposition() {
    return this.dischargeDisposition;
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
     builder.append("preAdmissionIdentifier" + "[" + String.valueOf(this.preAdmissionIdentifier) + "]\n"); 
     builder.append("origin" + "[" + String.valueOf(this.origin) + "]\n"); 
     builder.append("admitSource" + "[" + String.valueOf(this.admitSource) + "]\n"); 
     builder.append("reAdmission" + "[" + String.valueOf(this.reAdmission) + "]\n"); 
     builder.append("dietPreference" + "[" + String.valueOf(this.dietPreference) + "]\n"); 
     builder.append("specialCourtesy" + "[" + String.valueOf(this.specialCourtesy) + "]\n"); 
     builder.append("specialArrangement" + "[" + String.valueOf(this.specialArrangement) + "]\n"); 
     builder.append("destination" + "[" + String.valueOf(this.destination) + "]\n"); 
     builder.append("dischargeDisposition" + "[" + String.valueOf(this.dischargeDisposition) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<EncounterHospitalization> fromArray(java.util.List<EncounterHospitalizationModel> list) {
    return (java.util.List<EncounterHospitalization>)list.stream()
      .map(model -> new EncounterHospitalization(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<EncounterHospitalizationModel> toModelArray(java.util.List<EncounterHospitalization> list) {
    return (java.util.List<EncounterHospitalizationModel>)list.stream()
      .map(model -> new EncounterHospitalizationModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static EncounterHospitalization fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, EncounterHospitalization.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(EncounterHospitalization o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<EncounterHospitalization> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}