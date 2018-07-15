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
* "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
* generated on 07/14/2018
*/
@Entity
@Table(name="immunization")
public class ImmunizationModel  implements Serializable {
	private static final long serialVersionUID = 153159210200777967L;
  /**
  * Description: "This is a Immunization resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "A unique identifier assigned to this immunization record."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Indicates the current status of the vaccination event."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Indicates if the vaccination was or was not given."
  */
  @javax.persistence.Basic
  @Column(name="\"notGiven\"")
  private Boolean notGiven;

  /**
  * Description: "Vaccine that was administered or was to be administered."
  */
  @javax.persistence.Basic
  @Column(name="\"vaccinecode_id\"")
  private String vaccinecode_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="vaccinecode_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> vaccineCode;

  /**
  * Description: "The patient who either received or did not receive the immunization."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="patient_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> patient;

  /**
  * Description: "The visit or admission or other contact between patient and health care provider the immunization was performed as part of."
  */
  @javax.persistence.Basic
  @Column(name="\"encounter_id\"")
  private String encounter_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="encounter_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> encounter;

  /**
  * Description: "Date vaccine administered or was to be administered."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "An indication that the content of the record is based on information from the person who administered the vaccine. This reflects the context under which the data was originally recorded."
  */
  @javax.persistence.Basic
  @Column(name="\"primarySource\"")
  private Boolean primarySource;

  /**
  * Description: "The source of the data when the report of the immunization event is not based on information from the person who administered the vaccine."
  */
  @javax.persistence.Basic
  @Column(name="\"reportorigin_id\"")
  private String reportorigin_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reportorigin_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> reportOrigin;

  /**
  * Description: "The service delivery location where the vaccine administration occurred."
  */
  @javax.persistence.Basic
  @Column(name="\"location_id\"")
  private String location_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="location_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> location;

  /**
  * Description: "Name of vaccine manufacturer."
  */
  @javax.persistence.Basic
  @Column(name="\"manufacturer_id\"")
  private String manufacturer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="manufacturer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> manufacturer;

  /**
  * Description: "Lot number of the  vaccine product."
  */
  @javax.persistence.Basic
  @Column(name="\"lotNumber\"")
  private String lotNumber;

  /**
  * Description: "Date vaccine batch expires."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"expirationDate\"")
  private String expirationDate;

  /**
  * Description: "Body site where vaccine was administered."
  */
  @javax.persistence.Basic
  @Column(name="\"site_id\"")
  private String site_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="site_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> site;

  /**
  * Description: "The path by which the vaccine product is taken into the body."
  */
  @javax.persistence.Basic
  @Column(name="\"route_id\"")
  private String route_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="route_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> route;

  /**
  * Description: "The quantity of vaccine product that was administered."
  */
  @javax.persistence.Basic
  @Column(name="\"dosequantity_id\"")
  private String dosequantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="dosequantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> doseQuantity;

  /**
  * Description: "Indicates who or what performed the event."
  */
  @javax.persistence.Basic
  @Column(name="\"practitioner_id\"")
  private String practitioner_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="practitioner_id", insertable=false, updatable=false)
  private java.util.List<ImmunizationPractitionerModel> practitioner;

  /**
  * Description: "Extra information about the immunization that is not conveyed by the other attributes."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Reasons why a vaccine was or was not administered."
  */
  @javax.persistence.Basic
  @Column(name="\"explanation_id\"")
  private String explanation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="explanation_id", insertable=false, updatable=false)
  private java.util.List<ImmunizationExplanationModel> explanation;

  /**
  * Description: "Categorical data indicating that an adverse event is associated in time to an immunization."
  */
  @javax.persistence.Basic
  @Column(name="\"reaction_id\"")
  private String reaction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reaction_id", insertable=false, updatable=false)
  private java.util.List<ImmunizationReactionModel> reaction;

  /**
  * Description: "Contains information about the protocol(s) under which the vaccine was administered."
  */
  @javax.persistence.Basic
  @Column(name="\"vaccinationprotocol_id\"")
  private String vaccinationprotocol_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="vaccinationprotocol_id", insertable=false, updatable=false)
  private java.util.List<ImmunizationVaccinationProtocolModel> vaccinationProtocol;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;

  public ImmunizationModel() {
  }

  public ImmunizationModel(Immunization o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.status = o.getStatus();
    this.notGiven = o.getNotGiven();
    if (null != o.getVaccineCode() ) {
    	this.vaccinecode_id = "vaccinecode" + this.id;
    	this.vaccineCode = CodeableConceptHelper.toModel(o.getVaccineCode(), this.vaccinecode_id);
    }
    if (null != o.getPatient() ) {
    	this.patient_id = "patient" + this.id;
    	this.patient = ReferenceHelper.toModel(o.getPatient(), this.patient_id);
    }
    if (null != o.getEncounter() ) {
    	this.encounter_id = "encounter" + this.id;
    	this.encounter = ReferenceHelper.toModel(o.getEncounter(), this.encounter_id);
    }
    this.date = o.getDate();
    this.primarySource = o.getPrimarySource();
    if (null != o.getReportOrigin() ) {
    	this.reportorigin_id = "reportorigin" + this.id;
    	this.reportOrigin = CodeableConceptHelper.toModel(o.getReportOrigin(), this.reportorigin_id);
    }
    if (null != o.getLocation() ) {
    	this.location_id = "location" + this.id;
    	this.location = ReferenceHelper.toModel(o.getLocation(), this.location_id);
    }
    if (null != o.getManufacturer() ) {
    	this.manufacturer_id = "manufacturer" + this.id;
    	this.manufacturer = ReferenceHelper.toModel(o.getManufacturer(), this.manufacturer_id);
    }
    this.lotNumber = o.getLotNumber();
    this.expirationDate = o.getExpirationDate();
    if (null != o.getSite() ) {
    	this.site_id = "site" + this.id;
    	this.site = CodeableConceptHelper.toModel(o.getSite(), this.site_id);
    }
    if (null != o.getRoute() ) {
    	this.route_id = "route" + this.id;
    	this.route = CodeableConceptHelper.toModel(o.getRoute(), this.route_id);
    }
    if (null != o.getDoseQuantity() ) {
    	this.dosequantity_id = "dosequantity" + this.id;
    	this.doseQuantity = QuantityHelper.toModel(o.getDoseQuantity(), this.dosequantity_id);
    }
    if (null != o.getPractitioner() && !o.getPractitioner().isEmpty()) {
    	this.practitioner_id = "practitioner" + this.id;
    	this.practitioner = ImmunizationPractitionerHelper.toModelFromArray(o.getPractitioner(), this.practitioner_id);
    }
    if (null != o.getNote()) {
    	this.note = JsonUtils.toJson(o.getNote());
    }
    if (null != o.getExplanation() ) {
    	this.explanation_id = "explanation" + this.id;
    	this.explanation = ImmunizationExplanationHelper.toModel(o.getExplanation(), this.explanation_id);
    }
    if (null != o.getReaction() && !o.getReaction().isEmpty()) {
    	this.reaction_id = "reaction" + this.id;
    	this.reaction = ImmunizationReactionHelper.toModelFromArray(o.getReaction(), this.reaction_id);
    }
    if (null != o.getVaccinationProtocol() && !o.getVaccinationProtocol().isEmpty()) {
    	this.vaccinationprotocol_id = "vaccinationprotocol" + this.id;
    	this.vaccinationProtocol = ImmunizationVaccinationProtocolHelper.toModelFromArray(o.getVaccinationProtocol(), this.vaccinationprotocol_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public Boolean getNotGiven() {
    return this.notGiven;
  }
  public void setNotGiven( Boolean value) {
    this.notGiven = value;
  }
  public java.util.List<CodeableConceptModel> getVaccineCode() {
    return this.vaccineCode;
  }
  public void setVaccineCode( java.util.List<CodeableConceptModel> value) {
    this.vaccineCode = value;
  }
  public java.util.List<ReferenceModel> getPatient() {
    return this.patient;
  }
  public void setPatient( java.util.List<ReferenceModel> value) {
    this.patient = value;
  }
  public java.util.List<ReferenceModel> getEncounter() {
    return this.encounter;
  }
  public void setEncounter( java.util.List<ReferenceModel> value) {
    this.encounter = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public Boolean getPrimarySource() {
    return this.primarySource;
  }
  public void setPrimarySource( Boolean value) {
    this.primarySource = value;
  }
  public java.util.List<CodeableConceptModel> getReportOrigin() {
    return this.reportOrigin;
  }
  public void setReportOrigin( java.util.List<CodeableConceptModel> value) {
    this.reportOrigin = value;
  }
  public java.util.List<ReferenceModel> getLocation() {
    return this.location;
  }
  public void setLocation( java.util.List<ReferenceModel> value) {
    this.location = value;
  }
  public java.util.List<ReferenceModel> getManufacturer() {
    return this.manufacturer;
  }
  public void setManufacturer( java.util.List<ReferenceModel> value) {
    this.manufacturer = value;
  }
  public String getLotNumber() {
    return this.lotNumber;
  }
  public void setLotNumber( String value) {
    this.lotNumber = value;
  }
  public String getExpirationDate() {
    return this.expirationDate;
  }
  public void setExpirationDate( String value) {
    this.expirationDate = value;
  }
  public java.util.List<CodeableConceptModel> getSite() {
    return this.site;
  }
  public void setSite( java.util.List<CodeableConceptModel> value) {
    this.site = value;
  }
  public java.util.List<CodeableConceptModel> getRoute() {
    return this.route;
  }
  public void setRoute( java.util.List<CodeableConceptModel> value) {
    this.route = value;
  }
  public java.util.List<QuantityModel> getDoseQuantity() {
    return this.doseQuantity;
  }
  public void setDoseQuantity( java.util.List<QuantityModel> value) {
    this.doseQuantity = value;
  }
  public java.util.List<ImmunizationPractitionerModel> getPractitioner() {
    return this.practitioner;
  }
  public void setPractitioner( java.util.List<ImmunizationPractitionerModel> value) {
    this.practitioner = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public java.util.List<ImmunizationExplanationModel> getExplanation() {
    return this.explanation;
  }
  public void setExplanation( java.util.List<ImmunizationExplanationModel> value) {
    this.explanation = value;
  }
  public java.util.List<ImmunizationReactionModel> getReaction() {
    return this.reaction;
  }
  public void setReaction( java.util.List<ImmunizationReactionModel> value) {
    this.reaction = value;
  }
  public java.util.List<ImmunizationVaccinationProtocolModel> getVaccinationProtocol() {
    return this.vaccinationProtocol;
  }
  public void setVaccinationProtocol( java.util.List<ImmunizationVaccinationProtocolModel> value) {
    this.vaccinationProtocol = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
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
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImmunizationModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("notGiven" + "->" + this.notGiven + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("primarySource" + "->" + this.primarySource + "\n"); 
     builder.append("lotNumber" + "->" + this.lotNumber + "\n"); 
     builder.append("expirationDate" + "->" + this.expirationDate + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImmunizationModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("notGiven" + "->" + this.notGiven + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("primarySource" + "->" + this.primarySource + "\n"); 
     builder.append("lotNumber" + "->" + this.lotNumber + "\n"); 
     builder.append("expirationDate" + "->" + this.expirationDate + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}