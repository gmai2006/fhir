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
import org.fhir.entity.ImagingManifestStudyModel;
import com.google.gson.GsonBuilder;

/**
* "A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection."
*/
public class ImagingManifestStudy  {
  /**
  * Description: "Study instance UID of the SOP instances in the selection."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  private String uid;

  /**
  * Description: "Extensions for uid"
  */
  private transient Element _uid;

  /**
  * Description: "Reference to the Imaging Study in FHIR form."
  */
  private Reference imagingStudy;

  /**
  * Description: "The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type."
  */
  private java.util.List<Reference> endpoint = new java.util.ArrayList<>();

  /**
  * Description: "Series identity and locating information of the DICOM SOP instances in the selection."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<ImagingManifestSeries> series = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public ImagingManifestStudy() {
  }

  public ImagingManifestStudy(ImagingManifestStudyModel o) {
    this.id = o.getId();
      if (null != o.getUid()) {
        this.uid = new String(o.getUid());
      }

      if (null != o.getImagingStudy()) {
        this.imagingStudy = new Reference(o.getImagingStudy());
        this.imagingStudy.setId(this.getId());
      }

      this.endpoint = Reference.fromArray(o.getEndpoint());

      this.series = ImagingManifestSeries.fromArray(o.getSeries());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
  public void setImagingStudy( Reference value) {
    this.imagingStudy = value;
  }
  public Reference getImagingStudy() {
    return this.imagingStudy;
  }
  public void setEndpoint( java.util.List<Reference> value) {
    this.endpoint = value;
  }
  public java.util.List<Reference> getEndpoint() {
    return this.endpoint;
  }
  public void setSeries( java.util.List<ImagingManifestSeries> value) {
    this.series = value;
  }
  public java.util.List<ImagingManifestSeries> getSeries() {
    return this.series;
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
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("uid" + "[" + String.valueOf(this.uid) + "]\n"); 
     builder.append("_uid" + "[" + String.valueOf(this._uid) + "]\n"); 
     builder.append("imagingStudy" + "[" + String.valueOf(this.imagingStudy) + "]\n"); 
     builder.append("endpoint" + "[" + String.valueOf(this.endpoint) + "]\n"); 
     builder.append("series" + "[" + String.valueOf(this.series) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ImagingManifestStudy> fromArray(java.util.List<ImagingManifestStudyModel> list) {
    return (java.util.List<ImagingManifestStudy>)list.stream()
      .map(model -> new ImagingManifestStudy(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ImagingManifestStudyModel> toModelArray(java.util.List<ImagingManifestStudy> list) {
    return (java.util.List<ImagingManifestStudyModel>)list.stream()
      .map(model -> new ImagingManifestStudyModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ImagingManifestStudy fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ImagingManifestStudy.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ImagingManifestStudy o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ImagingManifestStudy> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}