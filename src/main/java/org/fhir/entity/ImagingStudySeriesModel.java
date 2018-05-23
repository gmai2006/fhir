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
@Table(name="imagingstudyseries")
public class ImagingStudySeriesModel  implements Serializable {
	private static final long serialVersionUID = 15196788316535642L;
  /**
  * Description: "Formal identifier for this series."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  @javax.persistence.Basic
  @Column(name="\"uid\"")
  private String uid;

  /**
  * Description: "The numeric identifier of this series in the study."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"number\"")
  private Float number;

  /**
  * Description: "The modality of this series sequence."
  */
  @javax.persistence.Basic
  @Column(name="\"modality_id\"")
  private String modality_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="modality_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> modality;

  /**
  * Description: "A description of the series."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Number of SOP Instances in the Study. The value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"numberOfInstances\"")
  private Float numberOfInstances;

  /**
  * Description: "Availability of series (online, offline or nearline)."
  */
  @javax.persistence.Basic
  @Column(name="\"availability\"")
  private String availability;

  /**
  * Description: "The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.type."
  */
  @javax.persistence.Basic
  @Column(name="\"endpoint_id\"")
  private String endpoint_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="endpoint_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> endpoint;

  /**
  * Description: "The anatomic structures examined. See DICOM Part 16 Annex L (http://dicom.nema.org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to SNOMED-CT mappings. The bodySite may indicate the laterality of body part imaged; if so, it shall be consistent with any content of ImagingStudy.series.laterality."
  */
  @javax.persistence.Basic
  @Column(name="\"bodysite_id\"")
  private String bodysite_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="bodysite_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> bodySite;

  /**
  * Description: "The laterality of the (possibly paired) anatomic structures examined. E.g., the left knee, both lungs, or unpaired abdomen. If present, shall be consistent with any laterality information indicated in ImagingStudy.series.bodySite."
  */
  @javax.persistence.Basic
  @Column(name="\"laterality_id\"")
  private String laterality_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="laterality_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> laterality;

  /**
  * Description: "The date and time the series was started."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"started\"")
  private String started;

  /**
  * Description: "The physician or operator (often the radiology technician)  who performed the series. The performer is recorded at the series level, since each series in a study may be performed by a different practitioner, at different times, and using different devices. A series may be performed by multiple practitioners."
  */
  @javax.persistence.Basic
  @Column(name="\"performer_id\"")
  private String performer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="performer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> performer;

  /**
  * Description: "A single SOP instance within the series, e.g. an image, or presentation state."
  */
  @javax.persistence.Basic
  @Column(name="\"instance_id\"")
  private String instance_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="instance_id", insertable=false, updatable=false)
  private java.util.List<ImagingStudyInstanceModel> instance;

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

  public ImagingStudySeriesModel() {
  }

  public ImagingStudySeriesModel(ImagingStudySeries o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.uid = o.getUid();
    this.number = o.getNumber();
    if (null != o.getModality() ) {
    	this.modality_id = "modality" + this.id;
    	this.modality = CodingHelper.toModel(o.getModality(), this.modality_id);
    }
    this.description = o.getDescription();
    this.numberOfInstances = o.getNumberOfInstances();
    this.availability = o.getAvailability();
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint_id = "endpoint" + this.id;
    	this.endpoint = ReferenceHelper.toModelFromArray(o.getEndpoint(), this.endpoint_id);
    }
    if (null != o.getBodySite() ) {
    	this.bodysite_id = "bodysite" + this.id;
    	this.bodySite = CodingHelper.toModel(o.getBodySite(), this.bodysite_id);
    }
    if (null != o.getLaterality() ) {
    	this.laterality_id = "laterality" + this.id;
    	this.laterality = CodingHelper.toModel(o.getLaterality(), this.laterality_id);
    }
    this.started = o.getStarted();
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
    	this.performer_id = "performer" + this.id;
    	this.performer = ReferenceHelper.toModelFromArray(o.getPerformer(), this.performer_id);
    }
    if (null != o.getInstance() && !o.getInstance().isEmpty()) {
    	this.instance_id = "instance" + this.id;
    	this.instance = ImagingStudyInstanceHelper.toModelFromArray(o.getInstance(), this.instance_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getUid() {
    return this.uid;
  }
  public void setUid( String value) {
    this.uid = value;
  }
  public Float getNumber() {
    return this.number;
  }
  public void setNumber( Float value) {
    this.number = value;
  }
  public java.util.List<CodingModel> getModality() {
    return this.modality;
  }
  public void setModality( java.util.List<CodingModel> value) {
    this.modality = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public Float getNumberOfInstances() {
    return this.numberOfInstances;
  }
  public void setNumberOfInstances( Float value) {
    this.numberOfInstances = value;
  }
  public String getAvailability() {
    return this.availability;
  }
  public void setAvailability( String value) {
    this.availability = value;
  }
  public java.util.List<ReferenceModel> getEndpoint() {
    return this.endpoint;
  }
  public void setEndpoint( java.util.List<ReferenceModel> value) {
    this.endpoint = value;
  }
  public java.util.List<CodingModel> getBodySite() {
    return this.bodySite;
  }
  public void setBodySite( java.util.List<CodingModel> value) {
    this.bodySite = value;
  }
  public java.util.List<CodingModel> getLaterality() {
    return this.laterality;
  }
  public void setLaterality( java.util.List<CodingModel> value) {
    this.laterality = value;
  }
  public String getStarted() {
    return this.started;
  }
  public void setStarted( String value) {
    this.started = value;
  }
  public java.util.List<ReferenceModel> getPerformer() {
    return this.performer;
  }
  public void setPerformer( java.util.List<ReferenceModel> value) {
    this.performer = value;
  }
  public java.util.List<ImagingStudyInstanceModel> getInstance() {
    return this.instance;
  }
  public void setInstance( java.util.List<ImagingStudyInstanceModel> value) {
    this.instance = value;
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
    builder.append("[ImagingStudySeriesModel]:" + "\n");
     builder.append("uid" + "->" + this.uid + "\n"); 
     builder.append("number" + "->" + this.number + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("numberOfInstances" + "->" + this.numberOfInstances + "\n"); 
     builder.append("availability" + "->" + this.availability + "\n"); 
     builder.append("started" + "->" + this.started + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImagingStudySeriesModel]:" + "\n");
     builder.append("uid" + "->" + this.uid + "\n"); 
     builder.append("number" + "->" + this.number + "\n"); 
     builder.append("modality" + "->" + this.modality + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("numberOfInstances" + "->" + this.numberOfInstances + "\n"); 
     builder.append("availability" + "->" + this.availability + "\n"); 
     builder.append("endpoint" + "->" + this.endpoint + "\n"); 
     builder.append("bodySite" + "->" + this.bodySite + "\n"); 
     builder.append("laterality" + "->" + this.laterality + "\n"); 
     builder.append("started" + "->" + this.started + "\n"); 
     builder.append("performer" + "->" + this.performer + "\n"); 
     builder.append("instance" + "->" + this.instance + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}