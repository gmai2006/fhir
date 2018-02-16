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
* "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities."
*/
@Entity
@Table(name="imagingstudy")
public class ImagingStudyModel  implements Serializable {
	private static final long serialVersionUID = 151873631146589323L;
  /**
  * Description: "This is a ImagingStudy resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Formal identifier for the study."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  @javax.persistence.Basic
  @Column(name="\"uid\"")
  private String uid;

  /**
  * Description: "Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf)."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"accession\"", length = 16777215)
  private String accession;

  /**
  * Description: "Other identifiers for the study."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Availability of study (online, offline, or nearline)."
  */
  @javax.persistence.Basic
  @Column(name="\"availability\"")
  private String availability;

  /**
  * Description: "A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19)."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modalityList\"", length = 16777215)
  private String modalityList;

  /**
  * Description: "The patient imaged in the study."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="patient_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> patient;

  /**
  * Description: "The encounter or episode at which the request is initiated."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "Date and time the study started."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"started\"")
  private String started;

  /**
  * Description: "A list of the diagnostic requests that resulted in this imaging study being performed."
  */
  @javax.persistence.Basic
  @Column(name="\"basedon_id\"")
  private String basedon_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="basedon_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn;

  /**
  * Description: "The requesting/referring physician."
  */
  @javax.persistence.Basic
  @Column(name="\"referrer_id\"")
  private String referrer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="referrer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> referrer;

  /**
  * Description: "Who read the study and interpreted the images or other content."
  */
  @javax.persistence.Basic
  @Column(name="\"interpreter_id\"")
  private String interpreter_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="interpreter_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> interpreter;

  /**
  * Description: "The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type."
  */
  @javax.persistence.Basic
  @Column(name="\"endpoint_id\"")
  private String endpoint_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="endpoint_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> endpoint;

  /**
  * Description: "Number of Series in the Study. This value given may be larger than the number of series elements this Resource contains due to resource availability, security, or other factors. This element should be present if any series elements are present."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"numberOfSeries\"")
  private Float numberOfSeries;

  /**
  * Description: "Number of SOP Instances in Study. This value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"numberOfInstances\"")
  private Float numberOfInstances;

  /**
  * Description: "A reference to the performed Procedure."
  */
  @javax.persistence.Basic
  @Column(name="\"procedurereference_id\"")
  private String procedurereference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="procedurereference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> procedureReference;

  /**
  * Description: "The code for the performed procedure type."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"procedureCode\"", length = 16777215)
  private String procedureCode;

  /**
  * Description: "Description of clinical condition indicating why the ImagingStudy was requested."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reason\"", length = 16777215)
  private String reason;

  /**
  * Description: "Institution-generated description or classification of the Study performed."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Each study has one or more series of images or other content."
  */
  @javax.persistence.Basic
  @Column(name="\"series_id\"")
  private String series_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="series_id", insertable=false, updatable=false)
  private java.util.List<ImagingStudySeriesModel> series;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
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

  public ImagingStudyModel() {
  }

  public ImagingStudyModel(ImagingStudy o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.uid = o.getUid();
    this.accession = JsonUtils.toJson(o.getAccession());
    this.availability = o.getAvailability();
    if (null != o.getPatient() ) {
    	this.patient_id = "patient" + this.id;
    	this.patient = ReferenceHelper.toModel(o.getPatient(), this.patient_id);
    }
    if (null != o.getContext() ) {
    	this.context_id = "context" + this.id;
    	this.context = ReferenceHelper.toModel(o.getContext(), this.context_id);
    }
    this.started = o.getStarted();
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedon_id = "basedon" + this.id;
    	this.basedOn = ReferenceHelper.toModelFromArray(o.getBasedOn(), this.basedon_id);
    }
    if (null != o.getReferrer() ) {
    	this.referrer_id = "referrer" + this.id;
    	this.referrer = ReferenceHelper.toModel(o.getReferrer(), this.referrer_id);
    }
    if (null != o.getInterpreter() && !o.getInterpreter().isEmpty()) {
    	this.interpreter_id = "interpreter" + this.id;
    	this.interpreter = ReferenceHelper.toModelFromArray(o.getInterpreter(), this.interpreter_id);
    }
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint_id = "endpoint" + this.id;
    	this.endpoint = ReferenceHelper.toModelFromArray(o.getEndpoint(), this.endpoint_id);
    }
    this.numberOfSeries = o.getNumberOfSeries();
    this.numberOfInstances = o.getNumberOfInstances();
    if (null != o.getProcedureReference() && !o.getProcedureReference().isEmpty()) {
    	this.procedurereference_id = "procedurereference" + this.id;
    	this.procedureReference = ReferenceHelper.toModelFromArray(o.getProcedureReference(), this.procedurereference_id);
    }
    this.reason = JsonUtils.toJson(o.getReason());
    this.description = o.getDescription();
    if (null != o.getSeries() && !o.getSeries().isEmpty()) {
    	this.series_id = "series" + this.id;
    	this.series = ImagingStudySeriesHelper.toModelFromArray(o.getSeries(), this.series_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
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
  public String getUid() {
    return this.uid;
  }
  public void setUid( String value) {
    this.uid = value;
  }
  public String getAccession() {
    return this.accession;
  }
  public void setAccession( String value) {
    this.accession = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getAvailability() {
    return this.availability;
  }
  public void setAvailability( String value) {
    this.availability = value;
  }
  public String getModalityList() {
    return this.modalityList;
  }
  public void setModalityList( String value) {
    this.modalityList = value;
  }
  public java.util.List<ReferenceModel> getPatient() {
    return this.patient;
  }
  public void setPatient( java.util.List<ReferenceModel> value) {
    this.patient = value;
  }
  public java.util.List<ReferenceModel> getContext() {
    return this.context;
  }
  public void setContext( java.util.List<ReferenceModel> value) {
    this.context = value;
  }
  public String getStarted() {
    return this.started;
  }
  public void setStarted( String value) {
    this.started = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public java.util.List<ReferenceModel> getReferrer() {
    return this.referrer;
  }
  public void setReferrer( java.util.List<ReferenceModel> value) {
    this.referrer = value;
  }
  public java.util.List<ReferenceModel> getInterpreter() {
    return this.interpreter;
  }
  public void setInterpreter( java.util.List<ReferenceModel> value) {
    this.interpreter = value;
  }
  public java.util.List<ReferenceModel> getEndpoint() {
    return this.endpoint;
  }
  public void setEndpoint( java.util.List<ReferenceModel> value) {
    this.endpoint = value;
  }
  public Float getNumberOfSeries() {
    return this.numberOfSeries;
  }
  public void setNumberOfSeries( Float value) {
    this.numberOfSeries = value;
  }
  public Float getNumberOfInstances() {
    return this.numberOfInstances;
  }
  public void setNumberOfInstances( Float value) {
    this.numberOfInstances = value;
  }
  public java.util.List<ReferenceModel> getProcedureReference() {
    return this.procedureReference;
  }
  public void setProcedureReference( java.util.List<ReferenceModel> value) {
    this.procedureReference = value;
  }
  public String getProcedureCode() {
    return this.procedureCode;
  }
  public void setProcedureCode( String value) {
    this.procedureCode = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<ImagingStudySeriesModel> getSeries() {
    return this.series;
  }
  public void setSeries( java.util.List<ImagingStudySeriesModel> value) {
    this.series = value;
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
    builder.append("[ImagingStudyModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("uid" + "->" + this.uid + "\n"); 
     builder.append("accession" + "->" + this.accession + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("availability" + "->" + this.availability + "\n"); 
     builder.append("modalityList" + "->" + this.modalityList + "\n"); 
     builder.append("started" + "->" + this.started + "\n"); 
     builder.append("numberOfSeries" + "->" + this.numberOfSeries + "\n"); 
     builder.append("numberOfInstances" + "->" + this.numberOfInstances + "\n"); 
     builder.append("procedureCode" + "->" + this.procedureCode + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
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
    builder.append("[ImagingStudyModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("uid" + "->" + this.uid + "\n"); 
     builder.append("accession" + "->" + this.accession + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("availability" + "->" + this.availability + "\n"); 
     builder.append("modalityList" + "->" + this.modalityList + "\n"); 
     builder.append("patient" + "->" + this.patient + "\n"); 
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("started" + "->" + this.started + "\n"); 
     builder.append("basedOn" + "->" + this.basedOn + "\n"); 
     builder.append("referrer" + "->" + this.referrer + "\n"); 
     builder.append("interpreter" + "->" + this.interpreter + "\n"); 
     builder.append("endpoint" + "->" + this.endpoint + "\n"); 
     builder.append("numberOfSeries" + "->" + this.numberOfSeries + "\n"); 
     builder.append("numberOfInstances" + "->" + this.numberOfInstances + "\n"); 
     builder.append("procedureReference" + "->" + this.procedureReference + "\n"); 
     builder.append("procedureCode" + "->" + this.procedureCode + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("series" + "->" + this.series + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}