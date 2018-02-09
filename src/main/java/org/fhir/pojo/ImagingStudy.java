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
        this.resourceType = new String(o.getResourceType());
      }

      if (null != o.getUid()) {
        this.uid = new String(o.getUid());
      }

      this.accession = Identifier.fromJson(o.getAccession());
      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getAvailability()) {
        this.availability = new String(o.getAvailability());
      }

      this.modalityList = Coding.fromArray(o.getModalityList());
      if (null != o.getPatient()) {
        this.patient = new Reference(o.getPatient());
        this.patient.setId(this.getId());
      }

      if (null != o.getContext()) {
        this.context = new Reference(o.getContext());
        this.context.setId(this.getId());
      }

      if (null != o.getStarted()) {
        this.started = new String(o.getStarted());
      }

      this.basedOn = Reference.fromArray(o.getBasedOn());

      if (null != o.getReferrer()) {
        this.referrer = new Reference(o.getReferrer());
        this.referrer.setId(this.getId());
      }

      this.interpreter = Reference.fromArray(o.getInterpreter());

      this.endpoint = Reference.fromArray(o.getEndpoint());

      if (null != o.getNumberOfSeries()) {
        this.numberOfSeries = new Float(o.getNumberOfSeries());
      }

      if (null != o.getNumberOfInstances()) {
        this.numberOfInstances = new Float(o.getNumberOfInstances());
      }

      this.procedureReference = Reference.fromArray(o.getProcedureReference());

      this.procedureCode = CodeableConcept.fromArray(o.getProcedureCode());
      this.reason = CodeableConcept.fromJson(o.getReason());
      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.series = ImagingStudySeries.fromArray(o.getSeries());

      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
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
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("uid" + "[" + String.valueOf(this.uid) + "]\n"); 
     builder.append("_uid" + "[" + String.valueOf(this._uid) + "]\n"); 
     builder.append("accession" + "[" + String.valueOf(this.accession) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("availability" + "[" + String.valueOf(this.availability) + "]\n"); 
     builder.append("_availability" + "[" + String.valueOf(this._availability) + "]\n"); 
     builder.append("modalityList" + "[" + String.valueOf(this.modalityList) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("started" + "[" + String.valueOf(this.started) + "]\n"); 
     builder.append("_started" + "[" + String.valueOf(this._started) + "]\n"); 
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("referrer" + "[" + String.valueOf(this.referrer) + "]\n"); 
     builder.append("interpreter" + "[" + String.valueOf(this.interpreter) + "]\n"); 
     builder.append("endpoint" + "[" + String.valueOf(this.endpoint) + "]\n"); 
     builder.append("numberOfSeries" + "[" + String.valueOf(this.numberOfSeries) + "]\n"); 
     builder.append("_numberOfSeries" + "[" + String.valueOf(this._numberOfSeries) + "]\n"); 
     builder.append("numberOfInstances" + "[" + String.valueOf(this.numberOfInstances) + "]\n"); 
     builder.append("_numberOfInstances" + "[" + String.valueOf(this._numberOfInstances) + "]\n"); 
     builder.append("procedureReference" + "[" + String.valueOf(this.procedureReference) + "]\n"); 
     builder.append("procedureCode" + "[" + String.valueOf(this.procedureCode) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("series" + "[" + String.valueOf(this.series) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
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

  public static java.util.List<ImagingStudy> fromArray(java.util.List<ImagingStudyModel> list) {
    return (java.util.List<ImagingStudy>)list.stream()
      .map(model -> new ImagingStudy(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ImagingStudyModel> toModelArray(java.util.List<ImagingStudy> list) {
    return (java.util.List<ImagingStudyModel>)list.stream()
      .map(model -> new ImagingStudyModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ImagingStudy fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ImagingStudy.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ImagingStudy o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ImagingStudy> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}