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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
*/
@Entity
@Table(name="encounterhospitalization")
public class EncounterHospitalizationModel  implements Serializable {
	private static final long serialVersionUID = 151873631175036206L;
  /**
  * Description: "Pre-admission identifier."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="origin_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> origin;

  /**
  * Description: "From where patient was admitted (physician referral, transfer)."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"admitSource\"", length = 16777215)
  private String admitSource;

  /**
  * Description: "Whether this hospitalization is a readmission and why if known."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reAdmission\"", length = 16777215)
  private String reAdmission;

  /**
  * Description: "Diet preferences reported by the patient."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dietPreference\"", length = 16777215)
  private String dietPreference;

  /**
  * Description: "Special courtesies (VIP, board member)."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"specialCourtesy\"", length = 16777215)
  private String specialCourtesy;

  /**
  * Description: "Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things."
  * Actual type: List<String>;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="destination_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> destination;

  /**
  * Description: "Category or kind of location after discharge."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dischargeDisposition\"", length = 16777215)
  private String dischargeDisposition;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public EncounterHospitalizationModel() {
  }

  public EncounterHospitalizationModel(EncounterHospitalization o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.preAdmissionIdentifier = JsonUtils.toJson(o.getPreAdmissionIdentifier());
    if (null != o.getOrigin() ) {
    	this.origin_id = "origin" + this.parent_id;
    	this.origin = ReferenceHelper.toModel(o.getOrigin(), this.origin_id);
    }
    this.admitSource = JsonUtils.toJson(o.getAdmitSource());
    this.reAdmission = JsonUtils.toJson(o.getReAdmission());
    if (null != o.getDestination() ) {
    	this.destination_id = "destination" + this.parent_id;
    	this.destination = ReferenceHelper.toModel(o.getDestination(), this.destination_id);
    }
    this.dischargeDisposition = JsonUtils.toJson(o.getDischargeDisposition());
  }

  public String getPreAdmissionIdentifier() {
    return this.preAdmissionIdentifier;
  }
  public void setPreAdmissionIdentifier( String value) {
    this.preAdmissionIdentifier = value;
  }
  public java.util.List<ReferenceModel> getOrigin() {
    return this.origin;
  }
  public void setOrigin( java.util.List<ReferenceModel> value) {
    this.origin = value;
  }
  public String getAdmitSource() {
    return this.admitSource;
  }
  public void setAdmitSource( String value) {
    this.admitSource = value;
  }
  public String getReAdmission() {
    return this.reAdmission;
  }
  public void setReAdmission( String value) {
    this.reAdmission = value;
  }
  public String getDietPreference() {
    return this.dietPreference;
  }
  public void setDietPreference( String value) {
    this.dietPreference = value;
  }
  public String getSpecialCourtesy() {
    return this.specialCourtesy;
  }
  public void setSpecialCourtesy( String value) {
    this.specialCourtesy = value;
  }
  public String getSpecialArrangement() {
    return this.specialArrangement;
  }
  public void setSpecialArrangement( String value) {
    this.specialArrangement = value;
  }
  public java.util.List<ReferenceModel> getDestination() {
    return this.destination;
  }
  public void setDestination( java.util.List<ReferenceModel> value) {
    this.destination = value;
  }
  public String getDischargeDisposition() {
    return this.dischargeDisposition;
  }
  public void setDischargeDisposition( String value) {
    this.dischargeDisposition = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EncounterHospitalizationModel]:" + "\n");
     builder.append("preAdmissionIdentifier" + "->" + this.preAdmissionIdentifier + "\n"); 
     builder.append("admitSource" + "->" + this.admitSource + "\n"); 
     builder.append("reAdmission" + "->" + this.reAdmission + "\n"); 
     builder.append("dietPreference" + "->" + this.dietPreference + "\n"); 
     builder.append("specialCourtesy" + "->" + this.specialCourtesy + "\n"); 
     builder.append("specialArrangement" + "->" + this.specialArrangement + "\n"); 
     builder.append("dischargeDisposition" + "->" + this.dischargeDisposition + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EncounterHospitalizationModel]:" + "\n");
     builder.append("preAdmissionIdentifier" + "->" + this.preAdmissionIdentifier + "\n"); 
     builder.append("origin" + "->" + this.origin + "\n"); 
     builder.append("admitSource" + "->" + this.admitSource + "\n"); 
     builder.append("reAdmission" + "->" + this.reAdmission + "\n"); 
     builder.append("dietPreference" + "->" + this.dietPreference + "\n"); 
     builder.append("specialCourtesy" + "->" + this.specialCourtesy + "\n"); 
     builder.append("specialArrangement" + "->" + this.specialArrangement + "\n"); 
     builder.append("destination" + "->" + this.destination + "\n"); 
     builder.append("dischargeDisposition" + "->" + this.dischargeDisposition + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}