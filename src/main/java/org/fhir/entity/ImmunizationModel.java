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
* "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
*/
@Entity
@Table(name="immunization")
public class ImmunizationModel  {
  /**
  * Description: "This is a Immunization resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "A unique identifier assigned to this immunization record."
  * Actual type: Array of Identifier-> List<Identifier>
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
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"vaccineCode\"", length = 16777215)
  private String vaccineCode;

  /**
  * Description: "The patient who either received or did not receive the immunization."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`patient_id`", insertable=false, updatable=false)
  private ReferenceModel patient;

  /**
  * Description: "The visit or admission or other contact between patient and health care provider the immunization was performed as part of."
  */
  @javax.persistence.Basic
  @Column(name="\"encounter_id\"")
  private String encounter_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`encounter_id`", insertable=false, updatable=false)
  private ReferenceModel encounter;

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
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reportOrigin\"", length = 16777215)
  private String reportOrigin;

  /**
  * Description: "The service delivery location where the vaccine administration occurred."
  */
  @javax.persistence.Basic
  @Column(name="\"location_id\"")
  private String location_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`location_id`", insertable=false, updatable=false)
  private ReferenceModel location;

  /**
  * Description: "Name of vaccine manufacturer."
  */
  @javax.persistence.Basic
  @Column(name="\"manufacturer_id\"")
  private String manufacturer_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`manufacturer_id`", insertable=false, updatable=false)
  private ReferenceModel manufacturer;

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
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"site\"", length = 16777215)
  private String site;

  /**
  * Description: "The path by which the vaccine product is taken into the body."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"route\"", length = 16777215)
  private String route;

  /**
  * Description: "The quantity of vaccine product that was administered."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"doseQuantity\"", length = 16777215)
  private String doseQuantity;

  /**
  * Description: "Indicates who or what performed the event."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ImmunizationPractitionerModel> practitioner = new java.util.ArrayList<>();

  /**
  * Description: "Extra information about the immunization that is not conveyed by the other attributes."
  * Actual type: Array of Annotation-> List<Annotation>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`explanation_id`", insertable=false, updatable=false)
  private ImmunizationExplanationModel explanation;

  /**
  * Description: "Categorical data indicating that an adverse event is associated in time to an immunization."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ImmunizationReactionModel> reaction = new java.util.ArrayList<>();

  /**
  * Description: "Contains information about the protocol(s) under which the vaccine was administered."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ImmunizationVaccinationProtocolModel> vaccinationProtocol = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      this.notGiven = o.getNotGiven();

      this.vaccineCode = CodeableConcept.toJson(o.getVaccineCode());
      if (null != o.getPatient()) {
      	this.patient_id = "patient" + this.getId();
        this.patient = new ReferenceModel(o.getPatient());
        this.patient.setId(this.patient_id);
        this.patient.parent_id = this.patient.getId();
      }

      if (null != o.getEncounter()) {
      	this.encounter_id = "encounter" + this.getId();
        this.encounter = new ReferenceModel(o.getEncounter());
        this.encounter.setId(this.encounter_id);
        this.encounter.parent_id = this.encounter.getId();
      }

      this.date = o.getDate();

      this.primarySource = o.getPrimarySource();

      this.reportOrigin = CodeableConcept.toJson(o.getReportOrigin());
      if (null != o.getLocation()) {
      	this.location_id = "location" + this.getId();
        this.location = new ReferenceModel(o.getLocation());
        this.location.setId(this.location_id);
        this.location.parent_id = this.location.getId();
      }

      if (null != o.getManufacturer()) {
      	this.manufacturer_id = "manufacturer" + this.getId();
        this.manufacturer = new ReferenceModel(o.getManufacturer());
        this.manufacturer.setId(this.manufacturer_id);
        this.manufacturer.parent_id = this.manufacturer.getId();
      }

      this.lotNumber = o.getLotNumber();

      this.expirationDate = o.getExpirationDate();

      this.site = CodeableConcept.toJson(o.getSite());
      this.route = CodeableConcept.toJson(o.getRoute());
      this.doseQuantity = Quantity.toJson(o.getDoseQuantity());
      this.practitioner = ImmunizationPractitioner.toModelArray(o.getPractitioner());

      this.note = Annotation.toJson(o.getNote());
      if (null != o.getExplanation()) {
      	this.explanation_id = "explanation" + this.getId();
        this.explanation = new ImmunizationExplanationModel(o.getExplanation());
        this.explanation.setId(this.explanation_id);
        this.explanation.parent_id = this.explanation.getId();
      }

      this.reaction = ImmunizationReaction.toModelArray(o.getReaction());

      this.vaccinationProtocol = ImmunizationVaccinationProtocol.toModelArray(o.getVaccinationProtocol());

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setNotGiven( Boolean value) {
    this.notGiven = value;
  }
  public Boolean getNotGiven() {
    return this.notGiven;
  }
  public void setVaccineCode( String value) {
    this.vaccineCode = value;
  }
  public String getVaccineCode() {
    return this.vaccineCode;
  }
  public void setPatient( ReferenceModel value) {
    this.patient = value;
  }
  public ReferenceModel getPatient() {
    return this.patient;
  }
  public void setEncounter( ReferenceModel value) {
    this.encounter = value;
  }
  public ReferenceModel getEncounter() {
    return this.encounter;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setPrimarySource( Boolean value) {
    this.primarySource = value;
  }
  public Boolean getPrimarySource() {
    return this.primarySource;
  }
  public void setReportOrigin( String value) {
    this.reportOrigin = value;
  }
  public String getReportOrigin() {
    return this.reportOrigin;
  }
  public void setLocation( ReferenceModel value) {
    this.location = value;
  }
  public ReferenceModel getLocation() {
    return this.location;
  }
  public void setManufacturer( ReferenceModel value) {
    this.manufacturer = value;
  }
  public ReferenceModel getManufacturer() {
    return this.manufacturer;
  }
  public void setLotNumber( String value) {
    this.lotNumber = value;
  }
  public String getLotNumber() {
    return this.lotNumber;
  }
  public void setExpirationDate( String value) {
    this.expirationDate = value;
  }
  public String getExpirationDate() {
    return this.expirationDate;
  }
  public void setSite( String value) {
    this.site = value;
  }
  public String getSite() {
    return this.site;
  }
  public void setRoute( String value) {
    this.route = value;
  }
  public String getRoute() {
    return this.route;
  }
  public void setDoseQuantity( String value) {
    this.doseQuantity = value;
  }
  public String getDoseQuantity() {
    return this.doseQuantity;
  }
  public void setPractitioner( java.util.List<ImmunizationPractitionerModel> value) {
    this.practitioner = value;
  }
  public java.util.List<ImmunizationPractitionerModel> getPractitioner() {
    return this.practitioner;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setExplanation( ImmunizationExplanationModel value) {
    this.explanation = value;
  }
  public ImmunizationExplanationModel getExplanation() {
    return this.explanation;
  }
  public void setReaction( java.util.List<ImmunizationReactionModel> value) {
    this.reaction = value;
  }
  public java.util.List<ImmunizationReactionModel> getReaction() {
    return this.reaction;
  }
  public void setVaccinationProtocol( java.util.List<ImmunizationVaccinationProtocolModel> value) {
    this.vaccinationProtocol = value;
  }
  public java.util.List<ImmunizationVaccinationProtocolModel> getVaccinationProtocol() {
    return this.vaccinationProtocol;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
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
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("notGiven" + "[" + String.valueOf(this.notGiven) + "]\n"); 
     builder.append("vaccineCode" + "[" + String.valueOf(this.vaccineCode) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("encounter" + "[" + String.valueOf(this.encounter) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("primarySource" + "[" + String.valueOf(this.primarySource) + "]\n"); 
     builder.append("reportOrigin" + "[" + String.valueOf(this.reportOrigin) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("manufacturer" + "[" + String.valueOf(this.manufacturer) + "]\n"); 
     builder.append("lotNumber" + "[" + String.valueOf(this.lotNumber) + "]\n"); 
     builder.append("expirationDate" + "[" + String.valueOf(this.expirationDate) + "]\n"); 
     builder.append("site" + "[" + String.valueOf(this.site) + "]\n"); 
     builder.append("route" + "[" + String.valueOf(this.route) + "]\n"); 
     builder.append("doseQuantity" + "[" + String.valueOf(this.doseQuantity) + "]\n"); 
     builder.append("practitioner" + "[" + String.valueOf(this.practitioner) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("explanation" + "[" + String.valueOf(this.explanation) + "]\n"); 
     builder.append("reaction" + "[" + String.valueOf(this.reaction) + "]\n"); 
     builder.append("vaccinationProtocol" + "[" + String.valueOf(this.vaccinationProtocol) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}