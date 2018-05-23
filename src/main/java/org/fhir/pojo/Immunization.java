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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Immunization  extends DomainResource  {
  /**
  * Description: "This is a Immunization resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "A unique identifier assigned to this immunization record."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Indicates the current status of the vaccination event."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Indicates if the vaccination was or was not given."
  */
  protected Boolean notGiven;

  /**
  * Description: "Extensions for notGiven"
  */
  protected transient Element _notGiven;

  /**
  * Description: "Vaccine that was administered or was to be administered."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept vaccineCode;

  /**
  * Description: "The patient who either received or did not receive the immunization."
  */
  @javax.validation.constraints.NotNull
  protected Reference patient;

  /**
  * Description: "The visit or admission or other contact between patient and health care provider the immunization was performed as part of."
  */
  protected Reference encounter;

  /**
  * Description: "Date vaccine administered or was to be administered."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "An indication that the content of the record is based on information from the person who administered the vaccine. This reflects the context under which the data was originally recorded."
  */
  protected Boolean primarySource;

  /**
  * Description: "Extensions for primarySource"
  */
  protected transient Element _primarySource;

  /**
  * Description: "The source of the data when the report of the immunization event is not based on information from the person who administered the vaccine."
  */
  protected CodeableConcept reportOrigin;

  /**
  * Description: "The service delivery location where the vaccine administration occurred."
  */
  protected Reference location;

  /**
  * Description: "Name of vaccine manufacturer."
  */
  protected Reference manufacturer;

  /**
  * Description: "Lot number of the  vaccine product."
  */
  protected String lotNumber;

  /**
  * Description: "Extensions for lotNumber"
  */
  protected transient Element _lotNumber;

  /**
  * Description: "Date vaccine batch expires."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String expirationDate;

  /**
  * Description: "Extensions for expirationDate"
  */
  protected transient Element _expirationDate;

  /**
  * Description: "Body site where vaccine was administered."
  */
  protected CodeableConcept site;

  /**
  * Description: "The path by which the vaccine product is taken into the body."
  */
  protected CodeableConcept route;

  /**
  * Description: "The quantity of vaccine product that was administered."
  */
  protected Quantity doseQuantity;

  /**
  * Description: "Indicates who or what performed the event."
  */
  protected java.util.List<ImmunizationPractitioner> practitioner;

  /**
  * Description: "Extra information about the immunization that is not conveyed by the other attributes."
  */
  protected java.util.List<Annotation> note;

  /**
  * Description: "Reasons why a vaccine was or was not administered."
  */
  protected ImmunizationExplanation explanation;

  /**
  * Description: "Categorical data indicating that an adverse event is associated in time to an immunization."
  */
  protected java.util.List<ImmunizationReaction> reaction;

  /**
  * Description: "Contains information about the protocol(s) under which the vaccine was administered."
  */
  protected java.util.List<ImmunizationVaccinationProtocol> vaccinationProtocol;

  public Immunization() {
  }

  public Immunization(ImmunizationModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getNotGiven()) {
      this.notGiven = o.getNotGiven();
    }
    if (null != o.getVaccineCode() && !o.getVaccineCode().isEmpty()) {
      this.vaccineCode = new CodeableConcept(o.getVaccineCode().get(0));
    }
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
    if (null != o.getReportOrigin() && !o.getReportOrigin().isEmpty()) {
      this.reportOrigin = new CodeableConcept(o.getReportOrigin().get(0));
    }
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
    if (null != o.getSite() && !o.getSite().isEmpty()) {
      this.site = new CodeableConcept(o.getSite().get(0));
    }
    if (null != o.getRoute() && !o.getRoute().isEmpty()) {
      this.route = new CodeableConcept(o.getRoute().get(0));
    }
    if (null != o.getDoseQuantity() && !o.getDoseQuantity().isEmpty()) {
      this.doseQuantity = new Quantity(o.getDoseQuantity().get(0));
    }
    if (null != o.getPractitioner() && !o.getPractitioner().isEmpty()) {
    	this.practitioner = ImmunizationPractitionerHelper.fromArray2Array(o.getPractitioner());
    }
    if (o.getNote() != null) {
    	this.note = org.fhir.utils.JsonUtils.json2Array(o.getNote());
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
     if(this.vaccinationProtocol != null) builder.append("vaccinationProtocol" + "->" + this.vaccinationProtocol.toString() + "\n"); ;
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