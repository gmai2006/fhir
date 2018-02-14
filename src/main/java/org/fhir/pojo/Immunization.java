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
import org.fhir.entity.ImmunizationModel;
import com.google.gson.GsonBuilder;

/**
* "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
*/
public class Immunization  {
  /**
  * Description: "This is a Immunization resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "A unique identifier assigned to this immunization record."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the current status of the vaccination event."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Indicates if the vaccination was or was not given."
  */
  private Boolean notGiven;

  /**
  * Description: "Extensions for notGiven"
  */
  private transient Element _notGiven;

  /**
  * Description: "Vaccine that was administered or was to be administered."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept vaccineCode;

  /**
  * Description: "The patient who either received or did not receive the immunization."
  */
  @javax.validation.constraints.NotNull
  private Reference patient;

  /**
  * Description: "The visit or admission or other contact between patient and health care provider the immunization was performed as part of."
  */
  private Reference encounter;

  /**
  * Description: "Date vaccine administered or was to be administered."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "An indication that the content of the record is based on information from the person who administered the vaccine. This reflects the context under which the data was originally recorded."
  */
  private Boolean primarySource;

  /**
  * Description: "Extensions for primarySource"
  */
  private transient Element _primarySource;

  /**
  * Description: "The source of the data when the report of the immunization event is not based on information from the person who administered the vaccine."
  */
  private CodeableConcept reportOrigin;

  /**
  * Description: "The service delivery location where the vaccine administration occurred."
  */
  private Reference location;

  /**
  * Description: "Name of vaccine manufacturer."
  */
  private Reference manufacturer;

  /**
  * Description: "Lot number of the  vaccine product."
  */
  private String lotNumber;

  /**
  * Description: "Extensions for lotNumber"
  */
  private transient Element _lotNumber;

  /**
  * Description: "Date vaccine batch expires."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String expirationDate;

  /**
  * Description: "Extensions for expirationDate"
  */
  private transient Element _expirationDate;

  /**
  * Description: "Body site where vaccine was administered."
  */
  private CodeableConcept site;

  /**
  * Description: "The path by which the vaccine product is taken into the body."
  */
  private CodeableConcept route;

  /**
  * Description: "The quantity of vaccine product that was administered."
  */
  private Quantity doseQuantity;

  /**
  * Description: "Indicates who or what performed the event."
  */
  private java.util.List<ImmunizationPractitioner> practitioner = new java.util.ArrayList<>();

  /**
  * Description: "Extra information about the immunization that is not conveyed by the other attributes."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Reasons why a vaccine was or was not administered."
  */
  private ImmunizationExplanation explanation;

  /**
  * Description: "Categorical data indicating that an adverse event is associated in time to an immunization."
  */
  private java.util.List<ImmunizationReaction> reaction = new java.util.ArrayList<>();

  /**
  * Description: "Contains information about the protocol(s) under which the vaccine was administered."
  */
  private java.util.List<ImmunizationVaccinationProtocol> vaccinationProtocol = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public Immunization() {
  }

  public Immunization(ImmunizationModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getNotGiven()) {
      this.notGiven = o.getNotGiven();
    }
    this.vaccineCode = CodeableConceptHelper.fromJson(o.getVaccineCode());
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getEncounter() && !o.getEncounter().isEmpty()) {
      this.encounter = new Reference(o.getEncounter().get(0));
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getPrimarySource()) {
      this.primarySource = o.getPrimarySource();
    }
    this.reportOrigin = CodeableConceptHelper.fromJson(o.getReportOrigin());
    if (null != o.getLocation() && !o.getLocation().isEmpty()) {
      this.location = new Reference(o.getLocation().get(0));
    }
    if (null != o.getManufacturer() && !o.getManufacturer().isEmpty()) {
      this.manufacturer = new Reference(o.getManufacturer().get(0));
    }
    if (null != o.getLotNumber()) {
      this.lotNumber = o.getLotNumber();
    }
    if (null != o.getExpirationDate()) {
      this.expirationDate = o.getExpirationDate();
    }
    this.site = CodeableConceptHelper.fromJson(o.getSite());
    this.route = CodeableConceptHelper.fromJson(o.getRoute());
    this.doseQuantity = QuantityHelper.fromJson(o.getDoseQuantity());
    if (null != o.getPractitioner() && !o.getPractitioner().isEmpty()) {
    	this.practitioner = ImmunizationPractitionerHelper.fromArray2Array(o.getPractitioner());
    }
    if (null != o.getExplanation() && !o.getExplanation().isEmpty()) {
      this.explanation = new ImmunizationExplanation(o.getExplanation().get(0));
    }
    if (null != o.getReaction() && !o.getReaction().isEmpty()) {
    	this.reaction = ImmunizationReactionHelper.fromArray2Array(o.getReaction());
    }
    if (null != o.getVaccinationProtocol() && !o.getVaccinationProtocol().isEmpty()) {
    	this.vaccinationProtocol = ImmunizationVaccinationProtocolHelper.fromArray2Array(o.getVaccinationProtocol());
    }
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
    if (null != o.getMeta() && !o.getMeta().isEmpty()) {
      this.meta = new Meta(o.getMeta().get(0));
    }
    if (null != o.getImplicitRules()) {
      this.implicitRules = o.getImplicitRules();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setNotGiven( Boolean value) {
    this.notGiven = value;
  }
  public Boolean getNotGiven() {
    return this.notGiven;
  }
  public void set_notGiven( Element value) {
    this._notGiven = value;
  }
  public Element get_notGiven() {
    return this._notGiven;
  }
  public void setVaccineCode( CodeableConcept value) {
    this.vaccineCode = value;
  }
  public CodeableConcept getVaccineCode() {
    return this.vaccineCode;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setEncounter( Reference value) {
    this.encounter = value;
  }
  public Reference getEncounter() {
    return this.encounter;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void set_date( Element value) {
    this._date = value;
  }
  public Element get_date() {
    return this._date;
  }
  public void setPrimarySource( Boolean value) {
    this.primarySource = value;
  }
  public Boolean getPrimarySource() {
    return this.primarySource;
  }
  public void set_primarySource( Element value) {
    this._primarySource = value;
  }
  public Element get_primarySource() {
    return this._primarySource;
  }
  public void setReportOrigin( CodeableConcept value) {
    this.reportOrigin = value;
  }
  public CodeableConcept getReportOrigin() {
    return this.reportOrigin;
  }
  public void setLocation( Reference value) {
    this.location = value;
  }
  public Reference getLocation() {
    return this.location;
  }
  public void setManufacturer( Reference value) {
    this.manufacturer = value;
  }
  public Reference getManufacturer() {
    return this.manufacturer;
  }
  public void setLotNumber( String value) {
    this.lotNumber = value;
  }
  public String getLotNumber() {
    return this.lotNumber;
  }
  public void set_lotNumber( Element value) {
    this._lotNumber = value;
  }
  public Element get_lotNumber() {
    return this._lotNumber;
  }
  public void setExpirationDate( String value) {
    this.expirationDate = value;
  }
  public String getExpirationDate() {
    return this.expirationDate;
  }
  public void set_expirationDate( Element value) {
    this._expirationDate = value;
  }
  public Element get_expirationDate() {
    return this._expirationDate;
  }
  public void setSite( CodeableConcept value) {
    this.site = value;
  }
  public CodeableConcept getSite() {
    return this.site;
  }
  public void setRoute( CodeableConcept value) {
    this.route = value;
  }
  public CodeableConcept getRoute() {
    return this.route;
  }
  public void setDoseQuantity( Quantity value) {
    this.doseQuantity = value;
  }
  public Quantity getDoseQuantity() {
    return this.doseQuantity;
  }
  public void setPractitioner( java.util.List<ImmunizationPractitioner> value) {
    this.practitioner = value;
  }
  public java.util.List<ImmunizationPractitioner> getPractitioner() {
    return this.practitioner;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setExplanation( ImmunizationExplanation value) {
    this.explanation = value;
  }
  public ImmunizationExplanation getExplanation() {
    return this.explanation;
  }
  public void setReaction( java.util.List<ImmunizationReaction> value) {
    this.reaction = value;
  }
  public java.util.List<ImmunizationReaction> getReaction() {
    return this.reaction;
  }
  public void setVaccinationProtocol( java.util.List<ImmunizationVaccinationProtocol> value) {
    this.vaccinationProtocol = value;
  }
  public java.util.List<ImmunizationVaccinationProtocol> getVaccinationProtocol() {
    return this.vaccinationProtocol;
  }
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Immunization]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.notGiven != null) builder.append("notGiven" + "->" + this.notGiven.toString() + "\n"); 
     if(this._notGiven != null) builder.append("_notGiven" + "->" + this._notGiven.toString() + "\n"); 
     if(this.vaccineCode != null) builder.append("vaccineCode" + "->" + this.vaccineCode.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.encounter != null) builder.append("encounter" + "->" + this.encounter.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.primarySource != null) builder.append("primarySource" + "->" + this.primarySource.toString() + "\n"); 
     if(this._primarySource != null) builder.append("_primarySource" + "->" + this._primarySource.toString() + "\n"); 
     if(this.reportOrigin != null) builder.append("reportOrigin" + "->" + this.reportOrigin.toString() + "\n"); 
     if(this.location != null) builder.append("location" + "->" + this.location.toString() + "\n"); 
     if(this.manufacturer != null) builder.append("manufacturer" + "->" + this.manufacturer.toString() + "\n"); 
     if(this.lotNumber != null) builder.append("lotNumber" + "->" + this.lotNumber.toString() + "\n"); 
     if(this._lotNumber != null) builder.append("_lotNumber" + "->" + this._lotNumber.toString() + "\n"); 
     if(this.expirationDate != null) builder.append("expirationDate" + "->" + this.expirationDate.toString() + "\n"); 
     if(this._expirationDate != null) builder.append("_expirationDate" + "->" + this._expirationDate.toString() + "\n"); 
     if(this.site != null) builder.append("site" + "->" + this.site.toString() + "\n"); 
     if(this.route != null) builder.append("route" + "->" + this.route.toString() + "\n"); 
     if(this.doseQuantity != null) builder.append("doseQuantity" + "->" + this.doseQuantity.toString() + "\n"); 
     if(this.practitioner != null) builder.append("practitioner" + "->" + this.practitioner.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.explanation != null) builder.append("explanation" + "->" + this.explanation.toString() + "\n"); 
     if(this.reaction != null) builder.append("reaction" + "->" + this.reaction.toString() + "\n"); 
     if(this.vaccinationProtocol != null) builder.append("vaccinationProtocol" + "->" + this.vaccinationProtocol.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this.contained != null) builder.append("contained" + "->" + this.contained.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.meta != null) builder.append("meta" + "->" + this.meta.toString() + "\n"); 
     if(this.implicitRules != null) builder.append("implicitRules" + "->" + this.implicitRules.toString() + "\n"); 
     if(this._implicitRules != null) builder.append("_implicitRules" + "->" + this._implicitRules.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Immunization,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Immunization" : { return Immunization.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}