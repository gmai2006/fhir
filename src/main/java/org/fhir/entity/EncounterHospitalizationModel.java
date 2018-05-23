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
	private static final long serialVersionUID = 151967883205919222L;
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
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="origin_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> origin;

  /**
  * Description: "From where patient was admitted (physician referral, transfer)."
  */
  @javax.persistence.Basic
  @Column(name="\"admitsource_id\"")
  private String admitsource_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="admitsource_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> admitSource;

  /**
  * Description: "Whether this hospitalization is a readmission and why if known."
  */
  @javax.persistence.Basic
  @Column(name="\"readmission_id\"")
  private String readmission_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="readmission_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> reAdmission;

  /**
  * Description: "Diet preferences reported by the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"dietpreference_id\"")
  private String dietpreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="dietpreference_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> dietPreference;

  /**
  * Description: "Special courtesies (VIP, board member)."
  */
  @javax.persistence.Basic
  @Column(name="\"specialcourtesy_id\"")
  private String specialcourtesy_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="specialcourtesy_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> specialCourtesy;

  /**
  * Description: "Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things."
  */
  @javax.persistence.Basic
  @Column(name="\"specialarrangement_id\"")
  private String specialarrangement_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="specialarrangement_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> specialArrangement;

  /**
  * Description: "Location to which the patient is discharged."
  */
  @javax.persistence.Basic
  @Column(name="\"destination_id\"")
  private String destination_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="destination_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> destination;

  /**
  * Description: "Category or kind of location after discharge."
  */
  @javax.persistence.Basic
  @Column(name="\"dischargedisposition_id\"")
  private String dischargedisposition_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="dischargedisposition_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> dischargeDisposition;

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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public EncounterHospitalizationModel() {
  }

  public EncounterHospitalizationModel(EncounterHospitalization o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getPreAdmissionIdentifier()) {
    	this.preAdmissionIdentifier = JsonUtils.toJson(o.getPreAdmissionIdentifier());
    }
    if (null != o.getOrigin() ) {
    	this.origin_id = "origin" + this.id;
    	this.origin = ReferenceHelper.toModel(o.getOrigin(), this.origin_id);
    }
    if (null != o.getAdmitSource() ) {
    	this.admitsource_id = "admitsource" + this.id;
    	this.admitSource = CodeableConceptHelper.toModel(o.getAdmitSource(), this.admitsource_id);
    }
    if (null != o.getReAdmission() ) {
    	this.readmission_id = "readmission" + this.id;
    	this.reAdmission = CodeableConceptHelper.toModel(o.getReAdmission(), this.readmission_id);
    }
    if (null != o.getDietPreference() && !o.getDietPreference().isEmpty()) {
    	this.dietpreference_id = "dietpreference" + this.id;
    	this.dietPreference = CodeableConceptHelper.toModelFromArray(o.getDietPreference(), this.dietpreference_id);
    }
    if (null != o.getSpecialCourtesy() && !o.getSpecialCourtesy().isEmpty()) {
    	this.specialcourtesy_id = "specialcourtesy" + this.id;
    	this.specialCourtesy = CodeableConceptHelper.toModelFromArray(o.getSpecialCourtesy(), this.specialcourtesy_id);
    }
    if (null != o.getSpecialArrangement() && !o.getSpecialArrangement().isEmpty()) {
    	this.specialarrangement_id = "specialarrangement" + this.id;
    	this.specialArrangement = CodeableConceptHelper.toModelFromArray(o.getSpecialArrangement(), this.specialarrangement_id);
    }
    if (null != o.getDestination() ) {
    	this.destination_id = "destination" + this.id;
    	this.destination = ReferenceHelper.toModel(o.getDestination(), this.destination_id);
    }
    if (null != o.getDischargeDisposition() ) {
    	this.dischargedisposition_id = "dischargedisposition" + this.id;
    	this.dischargeDisposition = CodeableConceptHelper.toModel(o.getDischargeDisposition(), this.dischargedisposition_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
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
  public java.util.List<CodeableConceptModel> getAdmitSource() {
    return this.admitSource;
  }
  public void setAdmitSource( java.util.List<CodeableConceptModel> value) {
    this.admitSource = value;
  }
  public java.util.List<CodeableConceptModel> getReAdmission() {
    return this.reAdmission;
  }
  public void setReAdmission( java.util.List<CodeableConceptModel> value) {
    this.reAdmission = value;
  }
  public java.util.List<CodeableConceptModel> getDietPreference() {
    return this.dietPreference;
  }
  public void setDietPreference( java.util.List<CodeableConceptModel> value) {
    this.dietPreference = value;
  }
  public java.util.List<CodeableConceptModel> getSpecialCourtesy() {
    return this.specialCourtesy;
  }
  public void setSpecialCourtesy( java.util.List<CodeableConceptModel> value) {
    this.specialCourtesy = value;
  }
  public java.util.List<CodeableConceptModel> getSpecialArrangement() {
    return this.specialArrangement;
  }
  public void setSpecialArrangement( java.util.List<CodeableConceptModel> value) {
    this.specialArrangement = value;
  }
  public java.util.List<ReferenceModel> getDestination() {
    return this.destination;
  }
  public void setDestination( java.util.List<ReferenceModel> value) {
    this.destination = value;
  }
  public java.util.List<CodeableConceptModel> getDischargeDisposition() {
    return this.dischargeDisposition;
  }
  public void setDischargeDisposition( java.util.List<CodeableConceptModel> value) {
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EncounterHospitalizationModel]:" + "\n");
     builder.append("preAdmissionIdentifier" + "->" + this.preAdmissionIdentifier + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
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
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}