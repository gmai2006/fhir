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
public class EncounterHospitalization  extends BackboneElement  {
  /**
  * Description: "Pre-admission identifier."
  */
  protected Identifier preAdmissionIdentifier;

  /**
  * Description: "The location from which the patient came before admission."
  */
  protected Reference origin;

  /**
  * Description: "From where patient was admitted (physician referral, transfer)."
  */
  protected CodeableConcept admitSource;

  /**
  * Description: "Whether this hospitalization is a readmission and why if known."
  */
  protected CodeableConcept reAdmission;

  /**
  * Description: "Diet preferences reported by the patient."
  */
  protected java.util.List<CodeableConcept> dietPreference = new java.util.ArrayList<>();

  /**
  * Description: "Special courtesies (VIP, board member)."
  */
  protected java.util.List<CodeableConcept> specialCourtesy = new java.util.ArrayList<>();

  /**
  * Description: "Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things."
  */
  protected java.util.List<CodeableConcept> specialArrangement = new java.util.ArrayList<>();

  /**
  * Description: "Location to which the patient is discharged."
  */
  protected Reference destination;

  /**
  * Description: "Category or kind of location after discharge."
  */
  protected CodeableConcept dischargeDisposition;

  public EncounterHospitalization() {
  }

  public EncounterHospitalization(EncounterHospitalizationModel o) {
    this.id = o.getId();
    this.preAdmissionIdentifier = IdentifierHelper.fromJson(o.getPreAdmissionIdentifier());
    if (null != o.getOrigin() && !o.getOrigin().isEmpty()) {
      this.origin = new Reference(o.getOrigin().get(0));
    }
    this.admitSource = CodeableConceptHelper.fromJson(o.getAdmitSource());
    this.reAdmission = CodeableConceptHelper.fromJson(o.getReAdmission());
    if (null != o.getDestination() && !o.getDestination().isEmpty()) {
      this.destination = new Reference(o.getDestination().get(0));
    }
    this.dischargeDisposition = CodeableConceptHelper.fromJson(o.getDischargeDisposition());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EncounterHospitalization]:" + "\n");
     if(this.preAdmissionIdentifier != null) builder.append("preAdmissionIdentifier" + "->" + this.preAdmissionIdentifier.toString() + "\n"); 
     if(this.origin != null) builder.append("origin" + "->" + this.origin.toString() + "\n"); 
     if(this.admitSource != null) builder.append("admitSource" + "->" + this.admitSource.toString() + "\n"); 
     if(this.reAdmission != null) builder.append("reAdmission" + "->" + this.reAdmission.toString() + "\n"); 
     if(this.dietPreference != null) builder.append("dietPreference" + "->" + this.dietPreference.toString() + "\n"); 
     if(this.specialCourtesy != null) builder.append("specialCourtesy" + "->" + this.specialCourtesy.toString() + "\n"); 
     if(this.specialArrangement != null) builder.append("specialArrangement" + "->" + this.specialArrangement.toString() + "\n"); 
     if(this.destination != null) builder.append("destination" + "->" + this.destination.toString() + "\n"); 
     if(this.dischargeDisposition != null) builder.append("dischargeDisposition" + "->" + this.dischargeDisposition.toString() + "\n"); ;
    return builder.toString();
  }


}