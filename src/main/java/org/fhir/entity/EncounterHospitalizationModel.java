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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;

/**
* "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
*/
@Entity
@Table(name="encounterhospitalization")
public class EncounterHospitalizationModel  {
  /**
  * Description: "Pre-admission identifier."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"preAdmissionIdentifier\"", length = 16777215)
  private String preAdmissionIdentifier;

  /**
  * Description: "The location from which the patient came before admission."
  */
  @javax.persistence.Basic
  @Column(name="\"origin_id\"")
  private String origin_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`origin_id`", insertable=false, updatable=false)
  private ReferenceModel origin;

  /**
  * Description: "From where patient was admitted (physician referral, transfer)."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"admitSource\"", length = 16777215)
  private String admitSource;

  /**
  * Description: "Whether this hospitalization is a readmission and why if known."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reAdmission\"", length = 16777215)
  private String reAdmission;

  /**
  * Description: "Diet preferences reported by the patient."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dietPreference\"", length = 16777215)
  private String dietPreference;

  /**
  * Description: "Special courtesies (VIP, board member)."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"specialCourtesy\"", length = 16777215)
  private String specialCourtesy;

  /**
  * Description: "Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"specialArrangement\"", length = 16777215)
  private String specialArrangement;

  /**
  * Description: "Location to which the patient is discharged."
  */
  @javax.persistence.Basic
  @Column(name="\"destination_id\"")
  private String destination_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`destination_id`", insertable=false, updatable=false)
  private ReferenceModel destination;

  /**
  * Description: "Category or kind of location after discharge."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dischargeDisposition\"", length = 16777215)
  private String dischargeDisposition;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public EncounterHospitalizationModel() {
  }

  public EncounterHospitalizationModel(EncounterHospitalization o) {
    this.id = o.getId();
      this.preAdmissionIdentifier = Identifier.toJson(o.getPreAdmissionIdentifier());
      if (null != o.getOrigin()) {
      	this.origin_id = "origin" + this.getId();
        this.origin = new ReferenceModel(o.getOrigin());
        this.origin.setId(this.origin_id);
        this.origin.parent_id = this.origin.getId();
      }

      this.admitSource = CodeableConcept.toJson(o.getAdmitSource());
      this.reAdmission = CodeableConcept.toJson(o.getReAdmission());
      this.dietPreference = CodeableConcept.toJson(o.getDietPreference());
      this.specialCourtesy = CodeableConcept.toJson(o.getSpecialCourtesy());
      this.specialArrangement = CodeableConcept.toJson(o.getSpecialArrangement());
      if (null != o.getDestination()) {
      	this.destination_id = "destination" + this.getId();
        this.destination = new ReferenceModel(o.getDestination());
        this.destination.setId(this.destination_id);
        this.destination.parent_id = this.destination.getId();
      }

      this.dischargeDisposition = CodeableConcept.toJson(o.getDischargeDisposition());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setPreAdmissionIdentifier( String value) {
    this.preAdmissionIdentifier = value;
  }
  public String getPreAdmissionIdentifier() {
    return this.preAdmissionIdentifier;
  }
  public void setOrigin( ReferenceModel value) {
    this.origin = value;
  }
  public ReferenceModel getOrigin() {
    return this.origin;
  }
  public void setAdmitSource( String value) {
    this.admitSource = value;
  }
  public String getAdmitSource() {
    return this.admitSource;
  }
  public void setReAdmission( String value) {
    this.reAdmission = value;
  }
  public String getReAdmission() {
    return this.reAdmission;
  }
  public void setDietPreference( String value) {
    this.dietPreference = value;
  }
  public String getDietPreference() {
    return this.dietPreference;
  }
  public void setSpecialCourtesy( String value) {
    this.specialCourtesy = value;
  }
  public String getSpecialCourtesy() {
    return this.specialCourtesy;
  }
  public void setSpecialArrangement( String value) {
    this.specialArrangement = value;
  }
  public String getSpecialArrangement() {
    return this.specialArrangement;
  }
  public void setDestination( ReferenceModel value) {
    this.destination = value;
  }
  public ReferenceModel getDestination() {
    return this.destination;
  }
  public void setDischargeDisposition( String value) {
    this.dischargeDisposition = value;
  }
  public String getDischargeDisposition() {
    return this.dischargeDisposition;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
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
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}