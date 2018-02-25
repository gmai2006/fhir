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
import org.fhir.entity.ImagingStudyModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ImagingStudy  extends DomainResource  {
  /**
  * Description: "This is a ImagingStudy resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Formal identifier for the study."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  protected String uid;

  /**
  * Description: "Extensions for uid"
  */
  protected transient Element _uid;

  /**
  * Description: "Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf)."
  */
  protected Identifier accession;

  /**
  * Description: "Other identifiers for the study."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Availability of study (online, offline, or nearline)."
  */
  protected String availability;

  /**
  * Description: "Extensions for availability"
  */
  protected transient Element _availability;

  /**
  * Description: "A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19)."
  */
  protected java.util.List<Coding> modalityList;

  /**
  * Description: "The patient imaged in the study."
  */
  @javax.validation.constraints.NotNull
  protected Reference patient;

  /**
  * Description: "The encounter or episode at which the request is initiated."
  */
  protected Reference context;

  /**
  * Description: "Date and time the study started."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String started;

  /**
  * Description: "Extensions for started"
  */
  protected transient Element _started;

  /**
  * Description: "A list of the diagnostic requests that resulted in this imaging study being performed."
  */
  protected java.util.List<Reference> basedOn;

  /**
  * Description: "The requesting/referring physician."
  */
  protected Reference referrer;

  /**
  * Description: "Who read the study and interpreted the images or other content."
  */
  protected java.util.List<Reference> interpreter;

  /**
  * Description: "The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type."
  */
  protected java.util.List<Reference> endpoint;

  /**
  * Description: "Number of Series in the Study. This value given may be larger than the number of series elements this Resource contains due to resource availability, security, or other factors. This element should be present if any series elements are present."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float numberOfSeries;

  /**
  * Description: "Extensions for numberOfSeries"
  */
  protected transient Element _numberOfSeries;

  /**
  * Description: "Number of SOP Instances in Study. This value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float numberOfInstances;

  /**
  * Description: "Extensions for numberOfInstances"
  */
  protected transient Element _numberOfInstances;

  /**
  * Description: "A reference to the performed Procedure."
  */
  protected java.util.List<Reference> procedureReference;

  /**
  * Description: "The code for the performed procedure type."
  */
  protected java.util.List<CodeableConcept> procedureCode;

  /**
  * Description: "Description of clinical condition indicating why the ImagingStudy was requested."
  */
  protected CodeableConcept reason;

  /**
  * Description: "Institution-generated description or classification of the Study performed."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Each study has one or more series of images or other content."
  */
  protected java.util.List<ImagingStudySeries> series;

  public ImagingStudy() {
  }

  public ImagingStudy(ImagingStudyModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getUid()) {
      this.uid = o.getUid();
    }
    this.accession = IdentifierHelper.fromJson(o.getAccession());
    if (null != o.getAvailability()) {
      this.availability = o.getAvailability();
    }
    if (null != o.getModalityList() && !o.getModalityList().isEmpty()) {
    	this.modalityList = CodingHelper.fromArray2Array(o.getModalityList());
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    if (null != o.getStarted()) {
      this.started = o.getStarted();
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedOn = ReferenceHelper.fromArray2Array(o.getBasedOn());
    }
    if (null != o.getReferrer() && !o.getReferrer().isEmpty()) {
      this.referrer = new Reference(o.getReferrer().get(0));
    }
    if (null != o.getInterpreter() && !o.getInterpreter().isEmpty()) {
    	this.interpreter = ReferenceHelper.fromArray2Array(o.getInterpreter());
    }
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint = ReferenceHelper.fromArray2Array(o.getEndpoint());
    }
    if (null != o.getNumberOfSeries()) {
      this.numberOfSeries = o.getNumberOfSeries();
    }
    if (null != o.getNumberOfInstances()) {
      this.numberOfInstances = o.getNumberOfInstances();
    }
    if (null != o.getProcedureReference() && !o.getProcedureReference().isEmpty()) {
    	this.procedureReference = ReferenceHelper.fromArray2Array(o.getProcedureReference());
    }
    if (null != o.getProcedureCode() && !o.getProcedureCode().isEmpty()) {
    	this.procedureCode = CodeableConceptHelper.fromArray2Array(o.getProcedureCode());
    }
    if (null != o.getReason() && !o.getReason().isEmpty()) {
      this.reason = new CodeableConcept(o.getReason().get(0));
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getSeries() && !o.getSeries().isEmpty()) {
    	this.series = ImagingStudySeriesHelper.fromArray2Array(o.getSeries());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setUid( String value) {
    this.uid = value;
  }
  public String getUid() {
    return this.uid;
  }
  public void set_uid( Element value) {
    this._uid = value;
  }
  public Element get_uid() {
    return this._uid;
  }
  public void setAccession( Identifier value) {
    this.accession = value;
  }
  public Identifier getAccession() {
    return this.accession;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setAvailability( String value) {
    this.availability = AvailabilityEnum.fromCode(value);
  }
  public String getAvailability() {
    return this.availability;
  }
  public void set_availability( Element value) {
    this._availability = value;
  }
  public Element get_availability() {
    return this._availability;
  }
  public void setModalityList( java.util.List<Coding> value) {
    this.modalityList = value;
  }
  public java.util.List<Coding> getModalityList() {
    return this.modalityList;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setStarted( String value) {
    this.started = value;
  }
  public String getStarted() {
    return this.started;
  }
  public void set_started( Element value) {
    this._started = value;
  }
  public Element get_started() {
    return this._started;
  }
  public void setBasedOn( java.util.List<Reference> value) {
    this.basedOn = value;
  }
  public java.util.List<Reference> getBasedOn() {
    return this.basedOn;
  }
  public void setReferrer( Reference value) {
    this.referrer = value;
  }
  public Reference getReferrer() {
    return this.referrer;
  }
  public void setInterpreter( java.util.List<Reference> value) {
    this.interpreter = value;
  }
  public java.util.List<Reference> getInterpreter() {
    return this.interpreter;
  }
  public void setEndpoint( java.util.List<Reference> value) {
    this.endpoint = value;
  }
  public java.util.List<Reference> getEndpoint() {
    return this.endpoint;
  }
  public void setNumberOfSeries( Float value) {
    this.numberOfSeries = value;
  }
  public Float getNumberOfSeries() {
    return this.numberOfSeries;
  }
  public void set_numberOfSeries( Element value) {
    this._numberOfSeries = value;
  }
  public Element get_numberOfSeries() {
    return this._numberOfSeries;
  }
  public void setNumberOfInstances( Float value) {
    this.numberOfInstances = value;
  }
  public Float getNumberOfInstances() {
    return this.numberOfInstances;
  }
  public void set_numberOfInstances( Element value) {
    this._numberOfInstances = value;
  }
  public Element get_numberOfInstances() {
    return this._numberOfInstances;
  }
  public void setProcedureReference( java.util.List<Reference> value) {
    this.procedureReference = value;
  }
  public java.util.List<Reference> getProcedureReference() {
    return this.procedureReference;
  }
  public void setProcedureCode( java.util.List<CodeableConcept> value) {
    this.procedureCode = value;
  }
  public java.util.List<CodeableConcept> getProcedureCode() {
    return this.procedureCode;
  }
  public void setReason( CodeableConcept value) {
    this.reason = value;
  }
  public CodeableConcept getReason() {
    return this.reason;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setSeries( java.util.List<ImagingStudySeries> value) {
    this.series = value;
  }
  public java.util.List<ImagingStudySeries> getSeries() {
    return this.series;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImagingStudy]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.uid != null) builder.append("uid" + "->" + this.uid.toString() + "\n"); 
     if(this._uid != null) builder.append("_uid" + "->" + this._uid.toString() + "\n"); 
     if(this.accession != null) builder.append("accession" + "->" + this.accession.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.availability != null) builder.append("availability" + "->" + this.availability.toString() + "\n"); 
     if(this._availability != null) builder.append("_availability" + "->" + this._availability.toString() + "\n"); 
     if(this.modalityList != null) builder.append("modalityList" + "->" + this.modalityList.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.started != null) builder.append("started" + "->" + this.started.toString() + "\n"); 
     if(this._started != null) builder.append("_started" + "->" + this._started.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.referrer != null) builder.append("referrer" + "->" + this.referrer.toString() + "\n"); 
     if(this.interpreter != null) builder.append("interpreter" + "->" + this.interpreter.toString() + "\n"); 
     if(this.endpoint != null) builder.append("endpoint" + "->" + this.endpoint.toString() + "\n"); 
     if(this.numberOfSeries != null) builder.append("numberOfSeries" + "->" + this.numberOfSeries.toString() + "\n"); 
     if(this._numberOfSeries != null) builder.append("_numberOfSeries" + "->" + this._numberOfSeries.toString() + "\n"); 
     if(this.numberOfInstances != null) builder.append("numberOfInstances" + "->" + this.numberOfInstances.toString() + "\n"); 
     if(this._numberOfInstances != null) builder.append("_numberOfInstances" + "->" + this._numberOfInstances.toString() + "\n"); 
     if(this.procedureReference != null) builder.append("procedureReference" + "->" + this.procedureReference.toString() + "\n"); 
     if(this.procedureCode != null) builder.append("procedureCode" + "->" + this.procedureCode.toString() + "\n"); 
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.series != null) builder.append("series" + "->" + this.series.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	ImagingStudy,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ImagingStudy" : { return ImagingStudy.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum AvailabilityEnum {
  	ONLINE,
  	OFFLINE,
  	NEARLINE,
  	UNAVAILABLE,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ONLINE" : { return ONLINE.toString(); }
  			case "OFFLINE" : { return OFFLINE.toString(); }
  			case "NEARLINE" : { return NEARLINE.toString(); }
  			case "UNAVAILABLE" : { return UNAVAILABLE.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}