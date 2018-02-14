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
import com.google.gson.GsonBuilder;

/**
* "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities."
*/
public class ImagingStudy  {
  /**
  * Description: "This is a ImagingStudy resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Formal identifier for the study."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  private String uid;

  /**
  * Description: "Extensions for uid"
  */
  private transient Element _uid;

  /**
  * Description: "Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf)."
  */
  private Identifier accession;

  /**
  * Description: "Other identifiers for the study."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Availability of study (online, offline, or nearline)."
  */
  private String availability;

  /**
  * Description: "Extensions for availability"
  */
  private transient Element _availability;

  /**
  * Description: "A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19)."
  */
  private java.util.List<Coding> modalityList = new java.util.ArrayList<>();

  /**
  * Description: "The patient imaged in the study."
  */
  @javax.validation.constraints.NotNull
  private Reference patient;

  /**
  * Description: "The encounter or episode at which the request is initiated."
  */
  private Reference context;

  /**
  * Description: "Date and time the study started."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String started;

  /**
  * Description: "Extensions for started"
  */
  private transient Element _started;

  /**
  * Description: "A list of the diagnostic requests that resulted in this imaging study being performed."
  */
  private java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "The requesting/referring physician."
  */
  private Reference referrer;

  /**
  * Description: "Who read the study and interpreted the images or other content."
  */
  private java.util.List<Reference> interpreter = new java.util.ArrayList<>();

  /**
  * Description: "The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type."
  */
  private java.util.List<Reference> endpoint = new java.util.ArrayList<>();

  /**
  * Description: "Number of Series in the Study. This value given may be larger than the number of series elements this Resource contains due to resource availability, security, or other factors. This element should be present if any series elements are present."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float numberOfSeries;

  /**
  * Description: "Extensions for numberOfSeries"
  */
  private transient Element _numberOfSeries;

  /**
  * Description: "Number of SOP Instances in Study. This value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float numberOfInstances;

  /**
  * Description: "Extensions for numberOfInstances"
  */
  private transient Element _numberOfInstances;

  /**
  * Description: "A reference to the performed Procedure."
  */
  private java.util.List<Reference> procedureReference = new java.util.ArrayList<>();

  /**
  * Description: "The code for the performed procedure type."
  */
  private java.util.List<CodeableConcept> procedureCode = new java.util.ArrayList<>();

  /**
  * Description: "Description of clinical condition indicating why the ImagingStudy was requested."
  */
  private CodeableConcept reason;

  /**
  * Description: "Institution-generated description or classification of the Study performed."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Each study has one or more series of images or other content."
  */
  private java.util.List<ImagingStudySeries> series = new java.util.ArrayList<>();

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
    this.reason = CodeableConceptHelper.fromJson(o.getReason());
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getSeries() && !o.getSeries().isEmpty()) {
    	this.series = ImagingStudySeriesHelper.fromArray2Array(o.getSeries());
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
     if(this.series != null) builder.append("series" + "->" + this.series.toString() + "\n"); 
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