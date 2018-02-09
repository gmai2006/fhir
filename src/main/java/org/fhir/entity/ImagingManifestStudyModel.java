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
* "A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection."
*/
@Entity
@Table(name="imagingmanifeststudy")
public class ImagingManifestStudyModel  {
  /**
  * Description: "Study instance UID of the SOP instances in the selection."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  @javax.persistence.Basic
  @Column(name="\"uid\"")
  private String uid;

  /**
  * Description: "Reference to the Imaging Study in FHIR form."
  */
  @javax.persistence.Basic
  @Column(name="\"imagingstudy_id\"")
  private String imagingstudy_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`imagingstudy_id`", insertable=false, updatable=false)
  private ReferenceModel imagingStudy;

  /**
  * Description: "The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> endpoint = new java.util.ArrayList<>();

  /**
  * Description: "Series identity and locating information of the DICOM SOP instances in the selection."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ImagingManifestSeriesModel> series = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
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
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public ImagingManifestStudyModel() {
  }

  public ImagingManifestStudyModel(ImagingManifestStudy o) {
    this.id = o.getId();
      this.uid = o.getUid();

      if (null != o.getImagingStudy()) {
      	this.imagingstudy_id = "imagingStudy" + this.getId();
        this.imagingStudy = new ReferenceModel(o.getImagingStudy());
        this.imagingStudy.setId(this.imagingstudy_id);
        this.imagingStudy.parent_id = this.imagingStudy.getId();
      }

      this.endpoint = Reference.toModelArray(o.getEndpoint());

      this.series = ImagingManifestSeries.toModelArray(o.getSeries());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setUid( String value) {
    this.uid = value;
  }
  public String getUid() {
    return this.uid;
  }
  public void setImagingStudy( ReferenceModel value) {
    this.imagingStudy = value;
  }
  public ReferenceModel getImagingStudy() {
    return this.imagingStudy;
  }
  public void setEndpoint( java.util.List<ReferenceModel> value) {
    this.endpoint = value;
  }
  public java.util.List<ReferenceModel> getEndpoint() {
    return this.endpoint;
  }
  public void setSeries( java.util.List<ImagingManifestSeriesModel> value) {
    this.series = value;
  }
  public java.util.List<ImagingManifestSeriesModel> getSeries() {
    return this.series;
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
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("uid" + "[" + String.valueOf(this.uid) + "]\n"); 
     builder.append("imagingStudy" + "[" + String.valueOf(this.imagingStudy) + "]\n"); 
     builder.append("endpoint" + "[" + String.valueOf(this.endpoint) + "]\n"); 
     builder.append("series" + "[" + String.valueOf(this.series) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}